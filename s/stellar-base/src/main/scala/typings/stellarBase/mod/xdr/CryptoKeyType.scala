package typings.stellarBase.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.CryptoKeyType")
@js.native
class CryptoKeyType ()
  extends typings.stellarBase.xdrMod.default.CryptoKeyType

/* static members */
@JSImport("stellar-base", "xdr.CryptoKeyType")
@js.native
object CryptoKeyType extends js.Object {
  def keyTypeEd25519(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypeHashX(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypeMuxedEd25519(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
  def keyTypePreAuthTx(): typings.stellarBase.xdrMod.xdr.CryptoKeyType = js.native
}

