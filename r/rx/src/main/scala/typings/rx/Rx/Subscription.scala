package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * Checks whether the given subscription is equal to the current instance.
    * @param other Subscription object to check for equality.
    * @returns {Boolean} true if both objects are equal; false otherwise.
    */
  def equals(other: Subscription): Boolean
}
object Subscription {
  
  @scala.inline
  def apply(equals_ : Subscription => Boolean): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: Subscription => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
  }
}
