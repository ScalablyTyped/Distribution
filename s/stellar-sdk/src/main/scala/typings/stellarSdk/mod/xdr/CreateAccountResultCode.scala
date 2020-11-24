package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.CreateAccountResultCode")
@js.native
class CreateAccountResultCode ()
  extends typings.stellarBase.mod.xdr.CreateAccountResultCode
/* static members */
@JSImport("stellar-sdk", "xdr.CreateAccountResultCode")
@js.native
object CreateAccountResultCode extends js.Object {
  
  def createAccountAlreadyExist(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  
  def createAccountLowReserve(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  
  def createAccountMalformed(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  
  def createAccountSuccess(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  
  def createAccountUnderfunded(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
}
