package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  /**
    * Checks whether the given subscription is equal to the current instance.
    * @param other Subscription object to check for equality.
    * @returns {Boolean} true if both objects are equal; false otherwise.
    */
  def equals(other: Subscription): Boolean = js.native
}
object Subscription {
  
  @scala.inline
  def apply(equals: Subscription => Boolean): Subscription = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals))
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: Subscription => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
  }
}
