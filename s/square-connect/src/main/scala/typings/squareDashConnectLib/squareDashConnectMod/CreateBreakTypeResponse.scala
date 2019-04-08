package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateBreakTypeResponse")
@js.native
class CreateBreakTypeResponse () extends js.Object {
  /**
    * The `BreakType` that was created by the request.
    */
  var break_type: js.UndefOr[BreakType] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
}

