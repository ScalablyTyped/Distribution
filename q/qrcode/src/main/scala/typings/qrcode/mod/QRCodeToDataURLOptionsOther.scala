package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.imageSlashjpeg
import typings.qrcode.qrcodeStrings.imageSlashwebp
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToDataURLOptionsOther
  extends StObject
     with QRCodeRenderersOptions
     with QRCodeToDataURLOptions {
  
  /**
    * Data URI format.
    * @default 'image/png'
    */
  var `type`: js.UndefOr[Exclude[QRCodeDataURLType, imageSlashjpeg | imageSlashwebp]] = js.undefined
}
object QRCodeToDataURLOptionsOther {
  
  inline def apply(): QRCodeToDataURLOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToDataURLOptionsOther]
  }
  
  extension [Self <: QRCodeToDataURLOptionsOther](x: Self) {
    
    inline def setType(value: Exclude[QRCodeDataURLType, imageSlashjpeg | imageSlashwebp]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
