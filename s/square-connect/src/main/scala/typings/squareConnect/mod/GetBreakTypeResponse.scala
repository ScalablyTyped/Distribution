package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "GetBreakTypeResponse")
@js.native
class GetBreakTypeResponse () extends js.Object {
  /**
    * The response object.
    */
  var break_type: js.UndefOr[BreakType] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

