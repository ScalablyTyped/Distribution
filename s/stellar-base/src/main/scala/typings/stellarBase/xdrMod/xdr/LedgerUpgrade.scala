package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerUpgrade extends js.Object {
  
  def newBaseFee(): Double = js.native
  def newBaseFee(value: Double): Double = js.native
  
  def newBaseReserve(): Double = js.native
  def newBaseReserve(value: Double): Double = js.native
  
  def newLedgerVersion(): Double = js.native
  def newLedgerVersion(value: Double): Double = js.native
  
  def newMaxTxSetSize(): Double = js.native
  def newMaxTxSetSize(value: Double): Double = js.native
  
  def switch(): LedgerUpgradeType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): Double = js.native
}
