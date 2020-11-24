package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ChangeTrustResultCode")
@js.native
class ChangeTrustResultCode ()
  extends typings.stellarBase.mod.xdr.ChangeTrustResultCode
/* static members */
@JSImport("stellar-sdk", "xdr.ChangeTrustResultCode")
@js.native
object ChangeTrustResultCode extends js.Object {
  
  def changeTrustInvalidLimit(): typings.stellarBase.xdrMod.xdr.ChangeTrustResultCode = js.native
  
  def changeTrustLowReserve(): typings.stellarBase.xdrMod.xdr.ChangeTrustResultCode = js.native
  
  def changeTrustMalformed(): typings.stellarBase.xdrMod.xdr.ChangeTrustResultCode = js.native
  
  def changeTrustNoIssuer(): typings.stellarBase.xdrMod.xdr.ChangeTrustResultCode = js.native
  
  def changeTrustSelfNotAllowed(): typings.stellarBase.xdrMod.xdr.ChangeTrustResultCode = js.native
  
  def changeTrustSuccess(): typings.stellarBase.xdrMod.xdr.ChangeTrustResultCode = js.native
}
