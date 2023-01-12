package typings.qrcode.mod

import typings.qrcode.anon.Quality
import typings.qrcode.qrcodeStrings.imageSlashjpeg
import typings.qrcode.qrcodeStrings.imageSlashwebp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToDataURLOptionsJpegWebp
  extends StObject
     with QRCodeRenderersOptions
     with QRCodeToDataURLOptions {
  
  var rendererOpts: js.UndefOr[Quality] = js.undefined
  
  /**
    * Data URI format.
    * @default 'image/png'
    */
  var `type`: imageSlashjpeg | imageSlashwebp
}
object QRCodeToDataURLOptionsJpegWebp {
  
  inline def apply(`type`: imageSlashjpeg | imageSlashwebp): QRCodeToDataURLOptionsJpegWebp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToDataURLOptionsJpegWebp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QRCodeToDataURLOptionsJpegWebp] (val x: Self) extends AnyVal {
    
    inline def setRendererOpts(value: Quality): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
    
    inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
    
    inline def setType(value: imageSlashjpeg | imageSlashwebp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
