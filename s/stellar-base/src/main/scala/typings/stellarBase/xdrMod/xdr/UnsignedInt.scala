package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseNumbers._4294967295
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsignedInt extends StObject {
  
  val MAX_VALUE: _4294967295 = js.native
  
  val MIN_VALUE: `0` = js.native
  
  def fromXDR(input: Buffer): Double = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): Double = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): Double = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): Double = js.native
  
  def isValid(value: Double): Boolean = js.native
  
  def read(io: Buffer): Double = js.native
  
  def toXDR(value: Double): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: Double, io: Buffer): Unit = js.native
}
