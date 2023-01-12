package typings.reactCssThemr

import typings.reactCssThemr.mod.TMapThemrProps
import typings.reactCssThemr.mod.TReactCSSThemrTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MapThemrProps[P] extends StObject {
    
    var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.undefined
  }
  object MapThemrProps {
    
    inline def apply[P](): MapThemrProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapThemrProps[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapThemrProps[?], P] (val x: Self & MapThemrProps[P]) extends AnyVal {
      
      inline def setMapThemrProps(value: (P, /* theme */ TReactCSSThemrTheme) => P & Theme): Self = StObject.set(x, "mapThemrProps", js.Any.fromFunction2(value))
      
      inline def setMapThemrPropsUndefined: Self = StObject.set(x, "mapThemrProps", js.undefined)
    }
  }
  
  trait Theme extends StObject {
    
    var theme: TReactCSSThemrTheme
  }
  object Theme {
    
    inline def apply(theme: TReactCSSThemrTheme): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: TReactCSSThemrTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
