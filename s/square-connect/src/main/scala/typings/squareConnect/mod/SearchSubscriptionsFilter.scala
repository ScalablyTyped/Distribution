package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchSubscriptionsFilter")
@js.native
class SearchSubscriptionsFilter () extends StObject {
  
  /**
    * A filter to select subscriptions based on the customer.
    */
  var customer_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A filter to select subscriptions based the location.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
}
