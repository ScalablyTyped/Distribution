package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.LedgerUpgradeType")
@js.native
class LedgerUpgradeType ()
  extends typings.stellarBase.mod.xdr.LedgerUpgradeType

/* static members */
@JSImport("stellar-sdk", "xdr.LedgerUpgradeType")
@js.native
object LedgerUpgradeType extends js.Object {
  def ledgerUpgradeBaseFee(): typings.stellarBase.xdrMod.xdr.LedgerUpgradeType = js.native
  def ledgerUpgradeBaseReserve(): typings.stellarBase.xdrMod.xdr.LedgerUpgradeType = js.native
  def ledgerUpgradeMaxTxSetSize(): typings.stellarBase.xdrMod.xdr.LedgerUpgradeType = js.native
  def ledgerUpgradeVersion(): typings.stellarBase.xdrMod.xdr.LedgerUpgradeType = js.native
}

