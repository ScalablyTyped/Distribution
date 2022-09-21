package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateDisputeEvidenceFileRequest")
@js.native
open class CreateDisputeEvidenceFileRequest () extends StObject {
  
  /**
    * The MIME type of the uploaded file. One of image/heic, image/heif, image/jpeg, application/pdf,  image/png, image/tiff.
    */
  var content_type: js.UndefOr[String] = js.native
  
  /**
    * The type of evidence you are uploading. See [DisputeEvidenceType](#type-disputeevidencetype) for possible values
    */
  var evidence_type: js.UndefOr[String] = js.native
  
  /**
    * Unique ID. For more information, see [Idempotency](https://developer.squareup.com/docs/docs/working-with-apis/idempotency).
    */
  var idempotency_key: String = js.native
}
