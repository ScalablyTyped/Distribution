package typings.sjcl.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclArrayBufferCodec
  extends StObject
     with SjclCodec[ArrayBuffer] {
  
  def fromBits(bits: BitArray_, padding: Boolean): ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Boolean, padding_count: Double): ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Unit, padding_count: Double): ArrayBuffer = js.native
  
  def hexDumpBuffer(buffer: ArrayBuffer): Unit = js.native
}
