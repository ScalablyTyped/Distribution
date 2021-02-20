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
trait AccountEntry extends StObject {
  
  def accountId(): AccountId = js.native
  def accountId(value: AccountId): AccountId = js.native
  
  def balance(): Int64 = js.native
  def balance(value: Int64): Int64 = js.native
  
  def ext(): AccountEntryExt = js.native
  def ext(value: AccountEntryExt): AccountEntryExt = js.native
  
  def flags(): Double = js.native
  def flags(value: Double): Double = js.native
  
  def homeDomain(): String | Buffer = js.native
  def homeDomain(value: String): String | Buffer = js.native
  def homeDomain(value: Buffer): String | Buffer = js.native
  
  def inflationDest(): Null | AccountId = js.native
  def inflationDest(value: AccountId): Null | AccountId = js.native
  
  def numSubEntries(): Double = js.native
  def numSubEntries(value: Double): Double = js.native
  
  def seqNum(): SequenceNumber = js.native
  def seqNum(value: SequenceNumber): SequenceNumber = js.native
  
  def signers(): js.Array[Signer] = js.native
  def signers(value: js.Array[Signer]): js.Array[Signer] = js.native
  
  def thresholds(): Buffer = js.native
  def thresholds(value: Buffer): Buffer = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
