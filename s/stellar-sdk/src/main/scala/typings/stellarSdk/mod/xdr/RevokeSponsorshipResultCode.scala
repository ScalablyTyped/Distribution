package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.RevokeSponsorshipResultCode")
@js.native
class RevokeSponsorshipResultCode ()
  extends typings.stellarBase.mod.xdr.RevokeSponsorshipResultCode
/* static members */
@JSImport("stellar-sdk", "xdr.RevokeSponsorshipResultCode")
@js.native
object RevokeSponsorshipResultCode extends js.Object {
  
  def revokeSponsorshipDoesNotExist(): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResultCode = js.native
  
  def revokeSponsorshipLowReserve(): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResultCode = js.native
  
  def revokeSponsorshipNotSponsor(): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResultCode = js.native
  
  def revokeSponsorshipOnlyTransferable(): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResultCode = js.native
  
  def revokeSponsorshipSuccess(): typings.stellarBase.xdrMod.xdr.RevokeSponsorshipResultCode = js.native
}
