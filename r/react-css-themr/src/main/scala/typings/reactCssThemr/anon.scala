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
    
    extension [Self <: MapThemrProps[?], P](x: Self & MapThemrProps[P]) {
      
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
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: TReactCSSThemrTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
