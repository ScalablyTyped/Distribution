package typings.sshpk.mod

import typings.sshpk.sshpkStrings.dsa_
import typings.sshpk.sshpkStrings.ecdsa_
import typings.sshpk.sshpkStrings.rsa_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// == algs.js == //
/* Rewritten from type alias, can be one of: 
  - typings.sshpk.sshpkStrings.dsa_
  - typings.sshpk.sshpkStrings.rsa_
  - typings.sshpk.sshpkStrings.ecdsa_
  - typings.sshpk.sshpkStrings.ed25519
*/
trait AlgorithmType extends StObject
object AlgorithmType {
  
  inline def dsa: dsa_ = "dsa".asInstanceOf[dsa_]
  
  inline def ecdsa: ecdsa_ = "ecdsa".asInstanceOf[ecdsa_]
  
  inline def ed25519: typings.sshpk.sshpkStrings.ed25519 = "ed25519".asInstanceOf[typings.sshpk.sshpkStrings.ed25519]
  
  inline def rsa: rsa_ = "rsa".asInstanceOf[rsa_]
}
