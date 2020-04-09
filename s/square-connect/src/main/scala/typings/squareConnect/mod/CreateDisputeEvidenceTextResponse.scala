package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateDisputeEvidenceTextResponse")
@js.native
class CreateDisputeEvidenceTextResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The newly uploaded dispute evidence metadata.
    */
  var evidence: js.UndefOr[DisputeEvidence] = js.native
}

