package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "AcceptDisputeResponse")
@js.native
open class AcceptDisputeResponse () extends StObject {
  
  /**
    * Details about the accepted dispute.
    */
  var dispute: js.UndefOr[Dispute] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
