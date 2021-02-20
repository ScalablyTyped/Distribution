package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "DeviceCheckoutOptions")
@js.native
class DeviceCheckoutOptions () extends StObject {
  
  /**
    * The unique ID of the device intended for this `TerminalCheckout`.
    * A list of `DeviceCode` objects can be retrieved from the /v2/devices/codes endpoint.
    * Match a `DeviceCode.device_id` value with `device_id` to get the associated device code.
    */
  var device_id: String = js.native
  
  /**
    * Instruct the device to skip the receipt screen. Defaults to false.
    */
  var skip_receipt_screen: js.UndefOr[Boolean] = js.native
  
  /**
    * Tip specific settings
    */
  var tip_settings: js.UndefOr[TipSettings] = js.native
}
