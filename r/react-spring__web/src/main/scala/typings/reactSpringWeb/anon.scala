package typings.reactSpringWeb

import typings.reactSpringWeb.mod.StyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ScrollLeft extends StObject {
    
    var scrollLeft: js.UndefOr[Double] = js.undefined
    
    var scrollTop: js.UndefOr[Double] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object ScrollLeft {
    
    inline def apply(): ScrollLeft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollLeft]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollLeft] (val x: Self) extends AnyVal {
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[StyleProps] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: StyleProps): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
