package typings.smartFoxServer.global.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.ErrorCodes")
@js.native
class ErrorCodes ()
  extends typings.smartFoxServer.SFS2X.ErrorCodes
/* static members */
object ErrorCodes {
  
  /**
    * Sets the text of the error message corresponding to the passed error code.
    * @param {number} code    The code of the error message to be modified.
    * @param {string} message The new error message, including the placeholders for runtime informations.
    */
  @JSGlobal("SFS2X.ErrorCodes.setErrorMessage")
  @js.native
  def setErrorMessage(code: Double, message: String): Unit = js.native
}
