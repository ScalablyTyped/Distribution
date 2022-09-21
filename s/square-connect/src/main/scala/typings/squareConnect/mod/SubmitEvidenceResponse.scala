package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SubmitEvidenceResponse")
@js.native
open class SubmitEvidenceResponse () extends StObject {
  
  /**
    * The `Dispute` for which evidence was submitted.
    */
  var dispute: js.UndefOr[Dispute] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
