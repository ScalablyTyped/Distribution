package typings.sshpk.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "CertificateParseError")
@js.native
open class CertificateParseError protected ()
  extends StObject
     with Error {
  def this(name: String, format: String, innerErr: js.Error) = this()
  
  var certName: String = js.native
  
  var format: String = js.native
  
  var innerErr: js.Error = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
