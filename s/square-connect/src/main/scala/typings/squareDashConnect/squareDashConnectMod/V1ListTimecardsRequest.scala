package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListTimecardsRequest")
@js.native
class V1ListTimecardsRequest () extends js.Object {
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    */
  var batch_token: js.UndefOr[String] = js.native
  /**
    * If filtering results by their clockin_time field, the beginning of the requested reporting period, in ISO 8601 format.
    */
  var begin_clockin_time: js.UndefOr[String] = js.native
  /**
    * If filtering results by their clockout_time field, the beginning of the requested reporting period, in ISO 8601 format.
    */
  var begin_clockout_time: js.UndefOr[String] = js.native
  /**
    * If filtering results by their updated_at field, the beginning of the requested reporting period, in ISO 8601 format.
    */
  var begin_updated_at: js.UndefOr[String] = js.native
  /**
    * If true, only deleted timecards are returned. If false, only valid timecards are returned.
    * If you don't provide this parameter, both valid and deleted timecards are returned.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * If provided, the endpoint returns only timecards for the employee with the specified ID.
    */
  var employee_id: js.UndefOr[String] = js.native
  /**
    * If filtering results by their clockin_time field, the end of the requested reporting period, in ISO 8601 format.
    */
  var end_clockin_time: js.UndefOr[String] = js.native
  /**
    * If filtering results by their clockout_time field, the end of the requested reporting period, in ISO 8601 format.
    */
  var end_clockout_time: js.UndefOr[String] = js.native
  /**
    * If filtering results by their updated_at field, the end of the requested reporting period, in ISO 8601 format.
    */
  var end_updated_at: js.UndefOr[String] = js.native
  /**
    * The maximum integer number of employee entities to return in a single response. Default 100, maximum 200.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The order in which timecards are listed in the response, based on their created_at field. See
    * [SortOrder](#type-sortorder) for possible values
    */
  var order: js.UndefOr[String] = js.native
}

