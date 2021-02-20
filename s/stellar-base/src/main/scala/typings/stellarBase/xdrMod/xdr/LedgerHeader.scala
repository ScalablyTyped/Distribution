package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerHeader extends StObject {
  
  def baseFee(): Double = js.native
  def baseFee(value: Double): Double = js.native
  
  def baseReserve(): Double = js.native
  def baseReserve(value: Double): Double = js.native
  
  def bucketListHash(): Buffer = js.native
  def bucketListHash(value: Buffer): Buffer = js.native
  
  def ext(): LedgerHeaderExt = js.native
  def ext(value: LedgerHeaderExt): LedgerHeaderExt = js.native
  
  def feePool(): Int64 = js.native
  def feePool(value: Int64): Int64 = js.native
  
  def idPool(): Uint64 = js.native
  def idPool(value: Uint64): Uint64 = js.native
  
  def inflationSeq(): Double = js.native
  def inflationSeq(value: Double): Double = js.native
  
  def ledgerSeq(): Double = js.native
  def ledgerSeq(value: Double): Double = js.native
  
  def ledgerVersion(): Double = js.native
  def ledgerVersion(value: Double): Double = js.native
  
  def maxTxSetSize(): Double = js.native
  def maxTxSetSize(value: Double): Double = js.native
  
  def previousLedgerHash(): Buffer = js.native
  def previousLedgerHash(value: Buffer): Buffer = js.native
  
  def scpValue(): StellarValue = js.native
  def scpValue(value: StellarValue): StellarValue = js.native
  
  def skipList(): js.Array[Buffer] = js.native
  def skipList(value: js.Array[Buffer]): js.Array[Buffer] = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def totalCoins(): Int64 = js.native
  def totalCoins(value: Int64): Int64 = js.native
  
  def txSetResultHash(): Buffer = js.native
  def txSetResultHash(value: Buffer): Buffer = js.native
}
