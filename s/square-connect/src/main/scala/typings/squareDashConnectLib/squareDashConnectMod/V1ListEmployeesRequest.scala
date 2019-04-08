package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListEmployeesRequest")
@js.native
class V1ListEmployeesRequest () extends js.Object {
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    */
  var batch_token: js.UndefOr[java.lang.String] = js.native
  /**
    * If filtering results by their created_at field, the beginning of the requested reporting period, in ISO 8601
    * format.
    */
  var begin_created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * If filtering results by their updated_at field, the beginning of the requested reporting period, in ISO 8601
    * format
    */
  var begin_updated_at: js.UndefOr[java.lang.String] = js.native
  /**
    * If filtering results by their created_at field, the end of the requested reporting period, in ISO 8601 format.
    */
  var end_created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * If filtering results by there updated_at field, the end of the requested reporting period, in ISO 8601 format.
    */
  var end_updated_at: js.UndefOr[java.lang.String] = js.native
  /**
    * If provided, the endpoint returns only employee entities with the specified external_id.
    */
  var external_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The maximum integer number of employee entities to return in a single response. Default 100, maximum 200.
    */
  var limit: js.UndefOr[scala.Double] = js.native
  /**
    * The order in which employees are listed in the response, based on their created_at field.      Default value: ASC
    * See [SortOrder](#type-sortorder) for possible values
    */
  var order: js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.OrderEnum] = js.native
  /**
    * If provided, the endpoint returns only employee entities with the specified status (ACTIVE or INACTIVE). See
    * [V1ListEmployeesRequestStatus](#type-v1listemployeesrequeststatus) for possible values
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1ListEmployeesRequestNs.StatusEnum] = js.native
}

