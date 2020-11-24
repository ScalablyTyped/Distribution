package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogSubscriptionPlan")
@js.native
class CatalogSubscriptionPlan () extends js.Object {
  
  /**
    * The name of the plan.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of SubscriptionPhase containing the `SubscriptionPhase` for this plan.
    */
  var phases: js.UndefOr[js.Array[SubscriptionPhase]] = js.native
}
