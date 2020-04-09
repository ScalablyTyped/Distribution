package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "DisputeEvidence")
@js.native
class DisputeEvidence () extends js.Object {
  /**
    * The ID of the dispute the evidence is associated with.
    */
  var dispute_id: js.UndefOr[String] = js.native
  /**
    * The Square-generated ID of the evidence.
    */
  var evidence_id: js.UndefOr[String] = js.native
  /**
    * The type of the evidence. See [DisputeEvidenceType](#type-disputeevidencetype) for possible values
    */
  var evidence_type: js.UndefOr[String] = js.native
  /**
    * The time when the next action is due, in RFC 3339 format.
    */
  var uploaded_at: js.UndefOr[String] = js.native
}

