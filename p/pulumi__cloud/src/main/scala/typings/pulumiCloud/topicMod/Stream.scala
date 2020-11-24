package typings.pulumiCloud.topicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream[T] extends js.Object {
  
  /**
    * Subscribe to items published to this stream.
    *
    * Each subscription receives all items published to the stream. If a
    * subscription handler returns a failed promise, the subscription handler
    * may be retried some number of times.  If no retry is successful, the item
    * will be sent to the global error handler.  Note that as a result,
    * subscription handlers must ensure they can safely be retried.
    *
    * @param name The name of the subscription.
    * @param handler A callback to handle each item published to the stream.
    */
  def subscribe(name: String, handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit = js.native
}
object Stream {
  
  @scala.inline
  def apply[T](subscribe: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Unit): Stream[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe))
    __obj.asInstanceOf[Stream[T]]
  }
  
  @scala.inline
  implicit class StreamOps[Self <: Stream[_], T] (val x: Self with Stream[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscribe(value: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Unit): Self = this.set("subscribe", js.Any.fromFunction2(value))
  }
}
