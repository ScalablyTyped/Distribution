package typings.rxjs.innerSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleOuterSubscriberLike[T] extends js.Object {
  /**
    * A handler for inner complete notifications from the inner subscription.
    */
  def notifyComplete(): Unit = js.native
  /**
    * A handler for inner error notifications from the inner subscription
    * @param err the error from the inner producer
    */
  def notifyError(err: js.Any): Unit = js.native
  /**
    * A handler for inner next notifications from the inner subscription
    * @param innerValue the value nexted by the inner producer
    */
  def notifyNext(innerValue: T): Unit = js.native
}

object SimpleOuterSubscriberLike {
  @scala.inline
  def apply[T](notifyComplete: () => Unit, notifyError: js.Any => Unit, notifyNext: T => Unit): SimpleOuterSubscriberLike[T] = {
    val __obj = js.Dynamic.literal(notifyComplete = js.Any.fromFunction0(notifyComplete), notifyError = js.Any.fromFunction1(notifyError), notifyNext = js.Any.fromFunction1(notifyNext))
    __obj.asInstanceOf[SimpleOuterSubscriberLike[T]]
  }
  @scala.inline
  implicit class SimpleOuterSubscriberLikeOps[Self <: SimpleOuterSubscriberLike[_], T] (val x: Self with SimpleOuterSubscriberLike[T]) extends AnyVal {
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
    def setNotifyComplete(value: () => Unit): Self = this.set("notifyComplete", js.Any.fromFunction0(value))
    @scala.inline
    def setNotifyError(value: js.Any => Unit): Self = this.set("notifyError", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyNext(value: T => Unit): Self = this.set("notifyNext", js.Any.fromFunction1(value))
  }
  
}

