package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListWorkweekConfigsRequest")
@js.native
class ListWorkweekConfigsRequest () extends js.Object {
  /**
    * Pointer to the next page of Workweek Config results to fetch.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * Maximum number of Workweek Configs to return per page.
    */
  var limit: js.UndefOr[scala.Double] = js.native
}

