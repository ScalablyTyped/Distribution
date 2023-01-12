package typings.reactSketchapp.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeConstraints extends StObject {
  
  var bottom: js.UndefOr[Boolean] = js.undefined
  
  var fixedHeight: js.UndefOr[Boolean] = js.undefined
  
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  
  var left: js.UndefOr[Boolean] = js.undefined
  
  var right: js.UndefOr[Boolean] = js.undefined
  
  var top: js.UndefOr[Boolean] = js.undefined
}
object ResizeConstraints {
  
  inline def apply(): ResizeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeConstraints] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
    
    inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
    
    inline def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
    
    inline def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
