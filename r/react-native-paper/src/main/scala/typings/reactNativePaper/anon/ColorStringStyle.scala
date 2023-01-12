package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStringStyle extends StObject {
  
  var color: String
  
  var style: js.UndefOr[MarginRight] = js.undefined
}
object ColorStringStyle {
  
  inline def apply(color: String): ColorStringStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStringStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorStringStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: MarginRight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
