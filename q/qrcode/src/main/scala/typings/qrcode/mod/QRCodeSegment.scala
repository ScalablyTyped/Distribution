package typings.qrcode.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.qrcode.mod.QRCodeNumericSegment
  - typings.qrcode.mod.QRCodeAlphanumericSegment
  - typings.qrcode.mod.QRCodeByteSegment
  - typings.qrcode.mod.QRCodeKanjiSegment
  - typings.qrcode.anon.Data
*/
trait QRCodeSegment extends StObject
object QRCodeSegment {
  
  inline def Data(data: String | Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): typings.qrcode.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qrcode.anon.Data]
  }
  
  inline def QRCodeAlphanumericSegment(data: String): typings.qrcode.mod.QRCodeAlphanumericSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "alphanumeric")
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeAlphanumericSegment]
  }
  
  inline def QRCodeByteSegment(data: Buffer | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array): typings.qrcode.mod.QRCodeByteSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "byte")
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeByteSegment]
  }
  
  inline def QRCodeKanjiSegment(data: String): typings.qrcode.mod.QRCodeKanjiSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "kanji")
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeKanjiSegment]
  }
  
  inline def QRCodeNumericSegment(data: String | Double): typings.qrcode.mod.QRCodeNumericSegment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = "numeric")
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeNumericSegment]
  }
}
