package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "UpdateWorkweekConfigResponse")
@js.native
class UpdateWorkweekConfigResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * The response object.
    */
  var workweek_config: js.UndefOr[WorkweekConfig] = js.native
}

