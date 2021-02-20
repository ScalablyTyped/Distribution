package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerUpgrade")
@js.native
class LedgerUpgrade ()
  extends typings.stellarBase.xdrMod.default.LedgerUpgrade
object LedgerUpgrade {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerUpgrade): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeBaseFee")
  @js.native
  def ledgerUpgradeBaseFee(value: Double): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeBaseReserve")
  @js.native
  def ledgerUpgradeBaseReserve(value: Double): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeMaxTxSetSize")
  @js.native
  def ledgerUpgradeMaxTxSetSize(value: Double): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeVersion")
  @js.native
  def ledgerUpgradeVersion(value: Double): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerUpgrade): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerUpgrade, io: Buffer): Unit = js.native
}
