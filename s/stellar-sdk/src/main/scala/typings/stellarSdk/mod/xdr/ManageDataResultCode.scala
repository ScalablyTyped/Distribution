package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ManageDataResultCode")
@js.native
class ManageDataResultCode ()
  extends typings.stellarBase.mod.xdr.ManageDataResultCode

/* static members */
@JSImport("stellar-sdk", "xdr.ManageDataResultCode")
@js.native
object ManageDataResultCode extends js.Object {
  def manageDataInvalidName(): typings.stellarBase.xdrMod.xdr.ManageDataResultCode = js.native
  def manageDataLowReserve(): typings.stellarBase.xdrMod.xdr.ManageDataResultCode = js.native
  def manageDataNameNotFound(): typings.stellarBase.xdrMod.xdr.ManageDataResultCode = js.native
  def manageDataNotSupportedYet(): typings.stellarBase.xdrMod.xdr.ManageDataResultCode = js.native
  def manageDataSuccess(): typings.stellarBase.xdrMod.xdr.ManageDataResultCode = js.native
}

