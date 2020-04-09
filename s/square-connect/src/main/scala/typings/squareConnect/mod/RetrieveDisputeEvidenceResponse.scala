package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveDisputeEvidenceResponse")
@js.native
class RetrieveDisputeEvidenceResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * Metadata about the dispute evidence file.
    */
  var evidence: js.UndefOr[DisputeEvidence] = js.native
}

