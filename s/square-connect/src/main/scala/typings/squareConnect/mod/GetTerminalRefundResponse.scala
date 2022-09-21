package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "GetTerminalRefundResponse")
@js.native
open class GetTerminalRefundResponse () extends StObject {
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The requested `Refund`
    */
  var refund: js.UndefOr[TerminalRefund] = js.native
}
