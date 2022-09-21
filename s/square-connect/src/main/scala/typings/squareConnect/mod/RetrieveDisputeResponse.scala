package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveDisputeResponse")
@js.native
open class RetrieveDisputeResponse () extends StObject {
  
  /**
    * Details about the requested `Dispute`.
    */
  var dispute: js.UndefOr[Dispute] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
