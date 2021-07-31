package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sjcl", "SjclECDSAPublicKey")
@js.native
class SjclECDSAPublicKey () extends SjclECCPublicKey {
  
  def verify(hash: BitArray_, rs: BitArray_, fakeLegacyVersion: Boolean): Boolean = js.native
}
