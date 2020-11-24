package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SubmitEvidenceResponse")
@js.native
class SubmitEvidenceResponse () extends js.Object {
  
  /**
    * The `Dispute` for which evidence was submitted.
    */
  var dispute: js.UndefOr[Dispute] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
