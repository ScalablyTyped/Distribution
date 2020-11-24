package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StellarValue extends js.Object {
  
  def closeTime(): TimePoint = js.native
  def closeTime(value: TimePoint): TimePoint = js.native
  
  def ext(): StellarValueExt = js.native
  def ext(value: StellarValueExt): StellarValueExt = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def txSetHash(): Buffer = js.native
  def txSetHash(value: Buffer): Buffer = js.native
  
  def upgrades(): js.Array[Buffer] = js.native
  def upgrades(value: js.Array[Buffer]): js.Array[Buffer] = js.native
}
