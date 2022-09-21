package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sjcl", "SjclECDSASecretKey")
@js.native
open class SjclECDSASecretKey () extends SjclECCSecretKey {
  
  def sign(hash: BitArray_, paranoia: Double, fakeLegacyVersion: Boolean): BitArray_ = js.native
  def sign(hash: BitArray_, paranoia: Double, fakeLegacyVersion: Boolean, fixedKForTesting: BigNumber): BitArray_ = js.native
}
