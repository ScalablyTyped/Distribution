package typings.reduxSagaTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buffer[T] extends js.Object {
  
  def flush(): js.Array[T] = js.native
  
  /**
    * Returns true if there are no messages on the buffer. A channel calls this
    * method whenever a new taker is registered
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * Used to put new message in the buffer. Note the Buffer can choose to not
    * store the message (e.g. a dropping buffer can drop any new message
    * exceeding a given limit)
    */
  def put(message: T): Unit = js.native
  
  /**
    * used to retrieve any buffered message. Note the behavior of this method has
    * to be consistent with `isEmpty`
    */
  def take(): js.UndefOr[T] = js.native
}
object Buffer {
  
  @scala.inline
  def apply[T](flush: () => js.Array[T], isEmpty: () => Boolean, put: T => Unit, take: () => js.UndefOr[T]): Buffer[T] = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), isEmpty = js.Any.fromFunction0(isEmpty), put = js.Any.fromFunction1(put), take = js.Any.fromFunction0(take))
    __obj.asInstanceOf[Buffer[T]]
  }
  
  @scala.inline
  implicit class BufferOps[Self <: Buffer[_], T] (val x: Self with Buffer[T]) extends AnyVal {
    
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
    def setFlush(value: () => js.Array[T]): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPut(value: T => Unit): Self = this.set("put", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTake(value: () => js.UndefOr[T]): Self = this.set("take", js.Any.fromFunction0(value))
  }
}
