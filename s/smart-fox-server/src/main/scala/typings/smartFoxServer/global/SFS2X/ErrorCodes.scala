package typings.smartFoxServer.global.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.ErrorCodes")
@js.native
open class ErrorCodes ()
  extends StObject
     with typings.smartFoxServer.SFS2X.ErrorCodes
/* static members */
object ErrorCodes {
  
  @JSGlobal("SFS2X.ErrorCodes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sets the text of the error message corresponding to the passed error code.
    * @param {number} code    The code of the error message to be modified.
    * @param {string} message The new error message, including the placeholders for runtime informations.
    */
  inline def setErrorMessage(code: Double, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setErrorMessage")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
