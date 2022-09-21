package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.imageSlashjpeg
import typings.qrcode.qrcodeStrings.imageSlashwebp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.qrcode.mod.QRCodeToDataURLOptionsJpegWebp
  - typings.qrcode.mod.QRCodeToDataURLOptionsOther
*/
trait QRCodeToDataURLOptions extends StObject
object QRCodeToDataURLOptions {
  
  inline def QRCodeToDataURLOptionsJpegWebp(`type`: imageSlashjpeg | imageSlashwebp): typings.qrcode.mod.QRCodeToDataURLOptionsJpegWebp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeToDataURLOptionsJpegWebp]
  }
  
  inline def QRCodeToDataURLOptionsOther(): typings.qrcode.mod.QRCodeToDataURLOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeToDataURLOptionsOther]
  }
}
