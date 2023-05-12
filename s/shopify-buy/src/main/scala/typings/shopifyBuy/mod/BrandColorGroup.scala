package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandColorGroup extends StObject {
  
  var background: Color
  
  var foreground: Color
}
object BrandColorGroup {
  
  inline def apply(background: Color, foreground: Color): BrandColorGroup = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrandColorGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrandColorGroup] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setForeground(value: Color): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
  }
}
