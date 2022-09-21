package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListDeviceCodesResponse")
@js.native
open class ListDeviceCodesResponse () extends StObject {
  
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    * This value is present only if the request succeeded and additional results are available.
    * See [Paginating results](#paginatingresults) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The queried DeviceCode.
    */
  var device_codes: js.UndefOr[js.Array[DeviceCode]] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
