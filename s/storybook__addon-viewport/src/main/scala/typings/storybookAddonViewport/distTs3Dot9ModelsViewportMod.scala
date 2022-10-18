package typings.storybookAddonViewport

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonViewport.storybookAddonViewportStrings.desktop
import typings.storybookAddonViewport.storybookAddonViewportStrings.mobile
import typings.storybookAddonViewport.storybookAddonViewportStrings.other
import typings.storybookAddonViewport.storybookAddonViewportStrings.tablet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModelsViewportMod {
  
  type Styles = ViewportStyles | (js.Function1[/* s */ ViewportStyles, ViewportStyles]) | Null
  
  trait Viewport extends StObject {
    
    var name: String
    
    var styles: Styles
    
    var `type`: desktop | mobile | tablet | other
  }
  object Viewport {
    
    inline def apply(name: String, `type`: desktop | mobile | tablet | other): Viewport = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viewport]
    }
    
    extension [Self <: Viewport](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: /* s */ ViewportStyles => ViewportStyles): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesNull: Self = StObject.set(x, "styles", null)
      
      inline def setType(value: desktop | mobile | tablet | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewportMap = StringDictionary[Viewport]
  
  trait ViewportStyles extends StObject {
    
    var height: String
    
    var width: String
  }
  object ViewportStyles {
    
    inline def apply(height: String, width: String): ViewportStyles = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportStyles]
    }
    
    extension [Self <: ViewportStyles](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
