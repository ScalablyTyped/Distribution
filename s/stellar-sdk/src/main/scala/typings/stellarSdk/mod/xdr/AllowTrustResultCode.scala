package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.AllowTrustResultCode")
@js.native
class AllowTrustResultCode ()
  extends typings.stellarBase.mod.xdr.AllowTrustResultCode

/* static members */
@JSImport("stellar-sdk", "xdr.AllowTrustResultCode")
@js.native
object AllowTrustResultCode extends js.Object {
  def allowTrustCantRevoke(): typings.stellarBase.xdrMod.xdr.AllowTrustResultCode = js.native
  def allowTrustMalformed(): typings.stellarBase.xdrMod.xdr.AllowTrustResultCode = js.native
  def allowTrustNoTrustLine(): typings.stellarBase.xdrMod.xdr.AllowTrustResultCode = js.native
  def allowTrustSelfNotAllowed(): typings.stellarBase.xdrMod.xdr.AllowTrustResultCode = js.native
  def allowTrustSuccess(): typings.stellarBase.xdrMod.xdr.AllowTrustResultCode = js.native
  def allowTrustTrustNotRequired(): typings.stellarBase.xdrMod.xdr.AllowTrustResultCode = js.native
}

