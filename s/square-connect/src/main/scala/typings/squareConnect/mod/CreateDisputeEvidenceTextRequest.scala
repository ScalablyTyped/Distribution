package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateDisputeEvidenceTextRequest")
@js.native
class CreateDisputeEvidenceTextRequest () extends js.Object {
  
  /**
    * The evidence string.
    */
  var evidence_text: String = js.native
  
  /**
    * The type of evidence you are uploading. See [DisputeEvidenceType](#type-disputeevidencetype) for possible values.
    */
  var evidence_type: js.UndefOr[String] = js.native
  
  /**
    * Unique ID. For more information, see [Idempotency](https://developer.squareup.com/docs/docs/working-with-apis/idempotency).
    */
  var idempotency_key: String = js.native
}
