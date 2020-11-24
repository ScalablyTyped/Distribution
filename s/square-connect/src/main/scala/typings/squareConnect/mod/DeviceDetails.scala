package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "DeviceDetails")
@js.native
class DeviceDetails () extends js.Object {
  
  /**
    * Square-issued ID of the device.
    */
  var device_id: js.UndefOr[String] = js.native
  
  /**
    * Square-issued installation ID for the device.
    */
  var device_installation_id: js.UndefOr[String] = js.native
  
  /**
    * The name of the device set by the merchant.
    */
  var device_name: js.UndefOr[String] = js.native
}
