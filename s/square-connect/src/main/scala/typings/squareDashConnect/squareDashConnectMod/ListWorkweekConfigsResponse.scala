package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListWorkweekConfigsResponse")
@js.native
class ListWorkweekConfigsResponse () extends js.Object {
  /**
    * Value supplied in the subsequent request to fetch the next page of Employee Wage results.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * A page of Employee Wage results.
    */
  var workweek_configs: js.UndefOr[js.Array[WorkweekConfig]] = js.native
}

