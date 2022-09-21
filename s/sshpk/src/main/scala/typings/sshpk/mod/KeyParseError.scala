package typings.sshpk.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "KeyParseError")
@js.native
open class KeyParseError protected ()
  extends StObject
     with Error {
  def this(name: String, format: String, innerErr: js.Error) = this()
  
  var format: String = js.native
  
  var innerErr: js.Error = js.native
  
  var keyName: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
