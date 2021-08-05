package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputInfo extends StObject {
  
  var channels: Double
  
  /** Only defined when using a crop strategy */
  var cropOffsetLeft: js.UndefOr[Double] = js.undefined
  
  /** Only defined when using a crop strategy */
  var cropOffsetTop: js.UndefOr[Double] = js.undefined
  
  var format: String
  
  var height: Double
  
  /** indicating if premultiplication was used */
  var premultiplied: Boolean
  
  var size: Double
  
  var width: Double
}
object OutputInfo {
  
  inline def apply(
    channels: Double,
    format: String,
    height: Double,
    premultiplied: Boolean,
    size: Double,
    width: Double
  ): OutputInfo = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], premultiplied = premultiplied.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputInfo]
  }
  
  extension [Self <: OutputInfo](x: Self) {
    
    inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setCropOffsetLeft(value: Double): Self = StObject.set(x, "cropOffsetLeft", value.asInstanceOf[js.Any])
    
    inline def setCropOffsetLeftUndefined: Self = StObject.set(x, "cropOffsetLeft", js.undefined)
    
    inline def setCropOffsetTop(value: Double): Self = StObject.set(x, "cropOffsetTop", value.asInstanceOf[js.Any])
    
    inline def setCropOffsetTopUndefined: Self = StObject.set(x, "cropOffsetTop", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPremultiplied(value: Boolean): Self = StObject.set(x, "premultiplied", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
