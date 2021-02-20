package typings.reactCssThemr

import typings.reactCssThemr.mod.TMapThemrProps
import typings.reactCssThemr.mod.TReactCSSThemrTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MapThemrProps[P] extends StObject {
    
    var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.native
  }
  object MapThemrProps {
    
    @scala.inline
    def apply[P](): MapThemrProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapThemrProps[P]]
    }
    
    @scala.inline
    implicit class MapThemrPropsMutableBuilder[Self <: MapThemrProps[_], P] (val x: Self with MapThemrProps[P]) extends AnyVal {
      
      @scala.inline
      def setMapThemrProps(value: (P, /* theme */ TReactCSSThemrTheme) => P with Theme): Self = StObject.set(x, "mapThemrProps", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMapThemrPropsUndefined: Self = StObject.set(x, "mapThemrProps", js.undefined)
    }
  }
  
  @js.native
  trait Theme extends StObject {
    
    var theme: TReactCSSThemrTheme = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(theme: TReactCSSThemrTheme): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: TReactCSSThemrTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
