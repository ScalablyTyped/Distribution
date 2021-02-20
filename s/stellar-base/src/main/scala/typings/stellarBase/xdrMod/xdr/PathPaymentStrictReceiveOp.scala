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
trait PathPaymentStrictReceiveOp extends StObject {
  
  def destAmount(): Int64 = js.native
  def destAmount(value: Int64): Int64 = js.native
  
  def destAsset(): Asset = js.native
  def destAsset(value: Asset): Asset = js.native
  
  def destination(): MuxedAccount = js.native
  def destination(value: MuxedAccount): MuxedAccount = js.native
  
  def path(): js.Array[Asset] = js.native
  def path(value: js.Array[Asset]): js.Array[Asset] = js.native
  
  def sendAsset(): Asset = js.native
  def sendAsset(value: Asset): Asset = js.native
  
  def sendMax(): Int64 = js.native
  def sendMax(value: Int64): Int64 = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
