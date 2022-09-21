package typings.sshpk.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// == errors.js == //
@JSImport("sshpk", "FingerprintFormatError")
@js.native
open class FingerprintFormatError ()
  extends StObject
     with Error {
  def this(fp: Fingerprint) = this()
  def this(fp: Unit, format: String) = this()
  def this(fp: Fingerprint, format: String) = this()
  
  var fingerprint: js.UndefOr[Fingerprint] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
