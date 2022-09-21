package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateDeviceCodeResponse")
@js.native
open class CreateDeviceCodeResponse () extends StObject {
  
  /**
    * The created DeviceCode object containing the device code string.
    */
  var device_code: js.UndefOr[DeviceCode] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
