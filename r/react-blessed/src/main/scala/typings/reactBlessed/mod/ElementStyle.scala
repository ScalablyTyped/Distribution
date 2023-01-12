package typings.reactBlessed.mod

import typings.reactBlessed.anon.Bg
import typings.reactBlessed.anon.Fg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementStyle
  extends StObject
     with ItemStyle {
  
  var border: js.UndefOr[BorderStyle] = js.undefined
  
  var focus: js.UndefOr[Bg] = js.undefined
  
  var hover: js.UndefOr[Bg] = js.undefined
  
  var scrollbar: js.UndefOr[Fg] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
}
object ElementStyle {
  
  inline def apply(): ElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementStyle] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: BorderStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFocus(value: Bg): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHover(value: Bg): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setScrollbar(value: Fg): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
