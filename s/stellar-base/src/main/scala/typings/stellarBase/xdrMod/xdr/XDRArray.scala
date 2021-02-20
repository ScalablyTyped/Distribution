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
trait XDRArray[T] extends StObject {
  
  def fromXDR(input: Buffer): js.Array[T] = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): js.Array[T] = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): js.Array[T] = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): js.Array[T] = js.native
  
  def isValid(value: js.Array[T]): Boolean = js.native
  
  def read(io: Buffer): Buffer = js.native
  
  def toXDR(value: js.Array[T]): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: js.Array[T], io: Buffer): Unit = js.native
}
