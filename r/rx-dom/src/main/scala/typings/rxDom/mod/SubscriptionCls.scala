package typings.rxDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("rx-dom", "SubscriptionCls")
@js.native
class SubscriptionCls protected ()
  extends typings.rx.mod.SubscriptionCls {
  /**
    * Creates a new subscription object with the given virtual subscription and unsubscription time.
    *
    * @constructor
    * @param {Number} subscribe Virtual time at which the subscription occurred.
    * @param {Number} unsubscribe Virtual time at which the unsubscription occurred.
    */
  def this(subscribeAt: Double) = this()
  def this(subscribeAt: Double, unsubscribeAt: Double) = this()
}
