package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListEmployeeRolesRequest")
@js.native
class V1ListEmployeeRolesRequest () extends js.Object {
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    */
  var batch_token: js.UndefOr[String] = js.native
  /**
    * The maximum integer number of employee entities to return in a single response. Default 100, maximum 200.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The order in which employees are listed in the response, based on their created_at field.
    * Default value: ASC See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[String] = js.native
}

