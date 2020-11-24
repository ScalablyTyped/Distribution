package typings.rxjs.groupByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefCountSubscription extends js.Object {
  
  var attemptedToUnsubscribe: Boolean = js.native
  
  var closed: Boolean = js.native
  
  var count: Double = js.native
  
  def unsubscribe(): Unit = js.native
}
object RefCountSubscription {
  
  @scala.inline
  def apply(attemptedToUnsubscribe: Boolean, closed: Boolean, count: Double, unsubscribe: () => Unit): RefCountSubscription = {
    val __obj = js.Dynamic.literal(attemptedToUnsubscribe = attemptedToUnsubscribe.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[RefCountSubscription]
  }
  
  @scala.inline
  implicit class RefCountSubscriptionOps[Self <: RefCountSubscription] (val x: Self) extends AnyVal {
    
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
    def setAttemptedToUnsubscribe(value: Boolean): Self = this.set("attemptedToUnsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
}
