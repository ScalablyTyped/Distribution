package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListDeviceCodesRequest")
@js.native
class ListDeviceCodesRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for your original query.
    * See [Paginating results](#paginatingresults) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * If specified, only returns DeviceCodes of the specified location. Returns DeviceCodes of all locations if empty.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * If specified, only returns DeviceCodes targeting the specified product type.
    * Returns DeviceCodes of all product types if empty. See [ProductType](#type-producttype) for possible values.
    */
  var product_type: js.UndefOr[String] = js.native
  
  /**
    * If specified, returns DeviceCodes with the specified statuses. Returns DeviceCodes of status `PAIRED` and `UNPAIRED` if empty.
    * See [DeviceCodeStatus](#type-devicecodestatus) for possible values
    */
  var status: js.UndefOr[js.Array[String]] = js.native
}
