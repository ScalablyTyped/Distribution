package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateDisputeEvidenceFileResponse")
@js.native
class CreateDisputeEvidenceFileResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The metadata of the newly uploaded dispute evidence.
    */
  var evidence: js.UndefOr[DisputeEvidence] = js.native
}

