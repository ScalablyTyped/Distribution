package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListDisputeEvidenceResponse")
@js.native
class ListDisputeEvidenceResponse () extends js.Object {
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The list of evidence previously uploaded to the specified dispute.
    */
  var evidence: js.UndefOr[js.Array[DisputeEvidence]] = js.native
}
