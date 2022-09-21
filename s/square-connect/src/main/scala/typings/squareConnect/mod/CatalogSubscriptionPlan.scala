package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogSubscriptionPlan")
@js.native
open class CatalogSubscriptionPlan () extends StObject {
  
  /**
    * The name of the plan.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of SubscriptionPhase containing the `SubscriptionPhase` for this plan.
    */
  var phases: js.UndefOr[js.Array[SubscriptionPhase]] = js.native
}
