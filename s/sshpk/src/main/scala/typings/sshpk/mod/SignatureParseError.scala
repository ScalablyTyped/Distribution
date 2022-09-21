package typings.sshpk.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "SignatureParseError")
@js.native
open class SignatureParseError protected ()
  extends StObject
     with Error {
  def this(`type`: String, format: String, innerErr: js.Error) = this()
  
  var format: String = js.native
  
  var innerErr: js.Error = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var `type`: String = js.native
}
