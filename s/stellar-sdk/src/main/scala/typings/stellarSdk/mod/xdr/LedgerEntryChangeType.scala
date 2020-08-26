package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.LedgerEntryChangeType")
@js.native
class LedgerEntryChangeType ()
  extends typings.stellarBase.mod.xdr.LedgerEntryChangeType

/* static members */
@JSImport("stellar-sdk", "xdr.LedgerEntryChangeType")
@js.native
object LedgerEntryChangeType extends js.Object {
  def ledgerEntryCreated(): typings.stellarBase.xdrMod.xdr.LedgerEntryChangeType = js.native
  def ledgerEntryRemoved(): typings.stellarBase.xdrMod.xdr.LedgerEntryChangeType = js.native
  def ledgerEntryState(): typings.stellarBase.xdrMod.xdr.LedgerEntryChangeType = js.native
  def ledgerEntryUpdated(): typings.stellarBase.xdrMod.xdr.LedgerEntryChangeType = js.native
}

