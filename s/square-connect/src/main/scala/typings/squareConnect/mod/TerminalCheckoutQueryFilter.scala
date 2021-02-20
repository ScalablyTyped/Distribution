package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TerminalCheckoutQueryFilter")
@js.native
class TerminalCheckoutQueryFilter () extends StObject {
  
  /**
    * Time range for the beginning of the reporting period. Inclusive. Default: The current time minus one day.
    */
  var created_at: js.UndefOr[TimeRange] = js.native
  
  /**
    * `TerminalCheckout`s associated with a specific device.
    * If no device is specified then all `TerminalCheckout`s for the merchant will be displayed.
    */
  var device_id: js.UndefOr[String] = js.native
  
  /**
    * Filtered results with the desired status of the `TerminalCheckout` Options: PENDING, IN\\_PROGRESS, CANCELED, COMPLETED
    */
  var status: js.UndefOr[String] = js.native
}
