package typings.stellarBase.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.CreateAccountResultCode")
@js.native
class CreateAccountResultCode ()
  extends typings.stellarBase.xdrMod.default.CreateAccountResultCode

/* static members */
@JSImport("stellar-base", "xdr.CreateAccountResultCode")
@js.native
object CreateAccountResultCode extends js.Object {
  def createAccountAlreadyExist(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountLowReserve(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountMalformed(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountSuccess(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountUnderfunded(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
}

