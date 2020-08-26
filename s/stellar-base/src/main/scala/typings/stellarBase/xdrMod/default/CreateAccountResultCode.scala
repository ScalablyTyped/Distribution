package typings.stellarBase.xdrMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "CreateAccountResultCode")
@js.native
class CreateAccountResultCode ()
  extends typings.stellarBase.xdrMod.xdr.CreateAccountResultCode

/* static members */
@JSImport("stellar-base/types/xdr", "CreateAccountResultCode")
@js.native
object CreateAccountResultCode extends js.Object {
  def createAccountAlreadyExist(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountLowReserve(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountMalformed(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountSuccess(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountUnderfunded(): typings.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
}

