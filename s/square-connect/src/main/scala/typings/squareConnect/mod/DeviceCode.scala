package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "DeviceCode")
@js.native
class DeviceCode () extends StObject {
  
  /**
    * The unique code that can be used to login.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * When this DeviceCode was created. Timestamp in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The unique id of the device that used this code. Populated when the device is paired up.
    */
  var device_id: js.UndefOr[String] = js.native
  
  /**
    * The unique id for this device code.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The location assigned to this code.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * An optional user-defined name for the device code.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * When this DeviceCode will expire and no longer login. Timestamp in RFC 3339 format.
    */
  var pair_by: js.UndefOr[String] = js.native
  
  /**
    * When this DeviceCode was paired. Timestamp in RFC 3339 format.
    */
  var paired_at: js.UndefOr[String] = js.native
  
  /**
    * The targeting product type of the device code. See [ProductType](#type-producttype) for possible values.
    */
  var product_type: String = js.native
  
  /**
    * The pairing status of the device code. See [DeviceCodeStatus](#type-devicecodestatus) for possible values.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * When this DeviceCode's status was last changed. Timestamp in RFC 3339 format.
    */
  var status_changed_at: js.UndefOr[String] = js.native
}
