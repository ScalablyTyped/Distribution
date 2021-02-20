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
trait TrustLineEntry extends StObject {
  
  def accountId(): AccountId = js.native
  def accountId(value: AccountId): AccountId = js.native
  
  def asset(): Asset = js.native
  def asset(value: Asset): Asset = js.native
  
  def balance(): Int64 = js.native
  def balance(value: Int64): Int64 = js.native
  
  def ext(): TrustLineEntryExt = js.native
  def ext(value: TrustLineEntryExt): TrustLineEntryExt = js.native
  
  def flags(): Double = js.native
  def flags(value: Double): Double = js.native
  
  def limit(): Int64 = js.native
  def limit(value: Int64): Int64 = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
