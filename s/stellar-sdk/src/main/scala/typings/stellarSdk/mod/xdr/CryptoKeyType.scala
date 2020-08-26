package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.CryptoKeyType")
@js.native
class CryptoKeyType ()
  extends typings.stellarBase.mod.xdr.CryptoKeyType

/* static members */
@JSImport("stellar-sdk", "xdr.CryptoKeyType")
@js.native
object CryptoKeyType extends js.Object {
  def keyTypeEd25519(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypeHashX(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypeMuxedEd25519(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypePreAuthTx(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
}

