package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveDisputeEvidenceResponse")
@js.native
open class RetrieveDisputeEvidenceResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * Metadata about the dispute evidence file.
    */
  var evidence: js.UndefOr[DisputeEvidence] = js.native
}
