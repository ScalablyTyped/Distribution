package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SubscriptionPhase")
@js.native
open class SubscriptionPhase () extends StObject {
  
  /**
    * The billing cadence of the phase. For example, weekly or monthly.
    * This field cannot be changed after a `SubscriptionPhase` is created.
    * See [SubscriptionCadence](#type-subscriptioncadence) for possible values.
    */
  var cadence: String = js.native
  
  /**
    * The position this phase appears in the sequence of phases defined for the plan, indexed from 0.
    * This field cannot be changed after a `SubscriptionPhase` is created.
    */
  var ordinal: js.UndefOr[Double] = js.native
  
  /**
    * The number of `cadence`s the phase lasts. If not set, the phase never ends. Only the last phase can be indefinite.
    * This field cannot be changed after a `SubscriptionPhase` is created.
    */
  var periods: js.UndefOr[Double] = js.native
  
  /**
    * The amount to bill for each `cadence`.
    */
  var recurring_price_money: Money = js.native
  
  /**
    * The Square-assigned ID of the subscription phase. This field cannot be changed after a `SubscriptionPhase` is created.
    */
  var uid: js.UndefOr[String] = js.native
}
