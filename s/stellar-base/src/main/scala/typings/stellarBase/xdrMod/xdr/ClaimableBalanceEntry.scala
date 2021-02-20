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
trait ClaimableBalanceEntry extends StObject {
  
  def amount(): Int64 = js.native
  def amount(value: Int64): Int64 = js.native
  
  def asset(): Asset = js.native
  def asset(value: Asset): Asset = js.native
  
  def balanceId(): ClaimableBalanceId = js.native
  def balanceId(value: ClaimableBalanceId): ClaimableBalanceId = js.native
  
  def claimants(): js.Array[Claimant] = js.native
  def claimants(value: js.Array[Claimant]): js.Array[Claimant] = js.native
  
  def ext(): ClaimableBalanceEntryExt = js.native
  def ext(value: ClaimableBalanceEntryExt): ClaimableBalanceEntryExt = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
