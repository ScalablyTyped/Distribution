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
trait FeeBumpTransaction extends StObject {
  
  def ext(): FeeBumpTransactionExt = js.native
  def ext(value: FeeBumpTransactionExt): FeeBumpTransactionExt = js.native
  
  def fee(): Int64 = js.native
  def fee(value: Int64): Int64 = js.native
  
  def feeSource(): MuxedAccount = js.native
  def feeSource(value: MuxedAccount): MuxedAccount = js.native
  
  def innerTx(): FeeBumpTransactionInnerTx = js.native
  def innerTx(value: FeeBumpTransactionInnerTx): FeeBumpTransactionInnerTx = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
