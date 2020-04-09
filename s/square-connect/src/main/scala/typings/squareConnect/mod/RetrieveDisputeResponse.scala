package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveDisputeResponse")
@js.native
class RetrieveDisputeResponse () extends js.Object {
  /**
    * Details about the requested `Dispute`.
    */
  var dispute: js.UndefOr[Dispute] = js.native
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

