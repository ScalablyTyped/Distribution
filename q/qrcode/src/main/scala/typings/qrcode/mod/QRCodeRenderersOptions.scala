package typings.qrcode.mod

import typings.qrcode.anon.Dark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeRenderersOptions
  extends StObject
     with QRCodeOptions {
  
  var color: js.UndefOr[Dark] = js.undefined
  
  /**
    * Define how much wide the quiet zone should be.
    * @default 4
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * Scale factor. A value of `1` means 1px per modules (black dots).
    * @default 4
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Forces a specific width for the output image.
    * If width is too small to contain the qr symbol, this option will be ignored.
    * Takes precedence over `scale`.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object QRCodeRenderersOptions {
  
  inline def apply(): QRCodeRenderersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeRenderersOptions]
  }
  
  extension [Self <: QRCodeRenderersOptions](x: Self) {
    
    inline def setColor(value: Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
