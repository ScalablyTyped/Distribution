package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.Alphanumeric
import typings.qrcode.qrcodeStrings.Byte
import typings.qrcode.qrcodeStrings.Kanji
import typings.qrcode.qrcodeStrings.Numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.qrcode.mod.NumericData
  - typings.qrcode.mod.AlphanumericData
  - typings.qrcode.mod.ByteData
  - typings.qrcode.mod.KanjiData
*/
trait GeneratedQRCodeSegment extends StObject
object GeneratedQRCodeSegment {
  
  inline def AlphanumericData(data: String, getBitsLength: () => Double, getLength: () => Double, mode: Mode[Alphanumeric]): typings.qrcode.mod.AlphanumericData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = js.Any.fromFunction0(getBitsLength), getLength = js.Any.fromFunction0(getLength), mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qrcode.mod.AlphanumericData]
  }
  
  inline def ByteData(
    data: js.typedarray.Uint8Array,
    getBitsLength: () => Double,
    getLength: () => Double,
    mode: Mode[Byte]
  ): typings.qrcode.mod.ByteData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = js.Any.fromFunction0(getBitsLength), getLength = js.Any.fromFunction0(getLength), mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qrcode.mod.ByteData]
  }
  
  inline def KanjiData(data: String, getBitsLength: () => Double, getLength: () => Double, mode: Mode[Kanji]): typings.qrcode.mod.KanjiData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = js.Any.fromFunction0(getBitsLength), getLength = js.Any.fromFunction0(getLength), mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qrcode.mod.KanjiData]
  }
  
  inline def NumericData(data: String, getBitsLength: () => Double, getLength: () => Double, mode: Mode[Numeric]): typings.qrcode.mod.NumericData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getBitsLength = js.Any.fromFunction0(getBitsLength), getLength = js.Any.fromFunction0(getLength), mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qrcode.mod.NumericData]
  }
}
