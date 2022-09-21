package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListDisputeEvidenceResponse")
@js.native
open class ListDisputeEvidenceResponse () extends StObject {
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The list of evidence previously uploaded to the specified dispute.
    */
  var evidence: js.UndefOr[js.Array[DisputeEvidence]] = js.native
}
