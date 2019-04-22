package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListCashDrawerShiftsRequest")
@js.native
class V1ListCashDrawerShiftsRequest () extends js.Object {
  /**
    * The beginning of the requested reporting period, in ISO 8601 format. Default value: The current time minus 90 days.
    */
  var begin_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The beginning of the requested reporting period, in ISO 8601 format. Default value: The current time.
    */
  var end_time: js.UndefOr[java.lang.String] = js.native
  /**
    * The order in which cash drawer shifts are listed in the response, based on their created_at field.
    * Default value: ASC See [SortOrder](#type-sortorder) for possible values.
    */
  var order: js.UndefOr[
    squareDashConnectLib.squareDashConnectMod.V1ListCashDrawerShiftsRequestNs.OrderEnum
  ] = js.native
}

