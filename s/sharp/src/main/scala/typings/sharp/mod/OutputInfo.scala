package typings.sharp.mod

import typings.sharp.sharpInts.`1`
import typings.sharp.sharpInts.`2`
import typings.sharp.sharpInts.`3`
import typings.sharp.sharpInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputInfo extends StObject {
  
  var channels: `1` | `2` | `3` | `4`
  
  /** Only defined when using a crop strategy */
  var cropOffsetLeft: js.UndefOr[Double] = js.undefined
  
  /** Only defined when using a crop strategy */
  var cropOffsetTop: js.UndefOr[Double] = js.undefined
  
  var format: String
  
  var height: Double
  
  /** indicating if premultiplication was used */
  var premultiplied: Boolean
  
  var size: Double
  
  /** DPI the font was rendered at, only defined when using `text` input */
  var textAutofitDpi: js.UndefOr[Double] = js.undefined
  
  /** Only defined when using a trim method */
  var trimOffsetLeft: js.UndefOr[Double] = js.undefined
  
  /** Only defined when using a trim method */
  var trimOffsetTop: js.UndefOr[Double] = js.undefined
  
  var width: Double
}
object OutputInfo {
  
  inline def apply(
    channels: `1` | `2` | `3` | `4`,
    format: String,
    height: Double,
    premultiplied: Boolean,
    size: Double,
    width: Double
  ): OutputInfo = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], premultiplied = premultiplied.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputInfo] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setCropOffsetLeft(value: Double): Self = StObject.set(x, "cropOffsetLeft", value.asInstanceOf[js.Any])
    
    inline def setCropOffsetLeftUndefined: Self = StObject.set(x, "cropOffsetLeft", js.undefined)
    
    inline def setCropOffsetTop(value: Double): Self = StObject.set(x, "cropOffsetTop", value.asInstanceOf[js.Any])
    
    inline def setCropOffsetTopUndefined: Self = StObject.set(x, "cropOffsetTop", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPremultiplied(value: Boolean): Self = StObject.set(x, "premultiplied", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTextAutofitDpi(value: Double): Self = StObject.set(x, "textAutofitDpi", value.asInstanceOf[js.Any])
    
    inline def setTextAutofitDpiUndefined: Self = StObject.set(x, "textAutofitDpi", js.undefined)
    
    inline def setTrimOffsetLeft(value: Double): Self = StObject.set(x, "trimOffsetLeft", value.asInstanceOf[js.Any])
    
    inline def setTrimOffsetLeftUndefined: Self = StObject.set(x, "trimOffsetLeft", js.undefined)
    
    inline def setTrimOffsetTop(value: Double): Self = StObject.set(x, "trimOffsetTop", value.asInstanceOf[js.Any])
    
    inline def setTrimOffsetTopUndefined: Self = StObject.set(x, "trimOffsetTop", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
