package typings.stellarSdk.mod.xdr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.SignerKeyType")
@js.native
class SignerKeyType ()
  extends typings.stellarBase.mod.xdr.SignerKeyType
object SignerKeyType {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignerKeyType.signerKeyTypeEd25519")
  @js.native
  def signerKeyTypeEd25519(): typings.stellarBase.xdrMod.xdr.SignerKeyType = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignerKeyType.signerKeyTypeHashX")
  @js.native
  def signerKeyTypeHashX(): typings.stellarBase.xdrMod.xdr.SignerKeyType = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignerKeyType.signerKeyTypePreAuthTx")
  @js.native
  def signerKeyTypePreAuthTx(): typings.stellarBase.xdrMod.xdr.SignerKeyType = js.native
}
