package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclArrayBufferCodec
  extends StObject
     with SjclCodec[js.typedarray.ArrayBuffer] {
  
  def fromBits(bits: BitArray_, padding: Boolean): js.typedarray.ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Boolean, padding_count: Double): js.typedarray.ArrayBuffer = js.native
  def fromBits(bits: BitArray_, padding: Unit, padding_count: Double): js.typedarray.ArrayBuffer = js.native
  
  def hexDumpBuffer(buffer: js.typedarray.ArrayBuffer): Unit = js.native
}
