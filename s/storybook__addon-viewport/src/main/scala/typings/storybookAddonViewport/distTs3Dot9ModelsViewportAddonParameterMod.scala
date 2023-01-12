package typings.storybookAddonViewport

import typings.storybookAddonViewport.distTs3Dot9ModelsViewportMod.ViewportMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModelsViewportAddonParameterMod {
  
  trait ViewportAddonParameter extends StObject {
    
    var defaultViewport: js.UndefOr[String] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var viewports: js.UndefOr[ViewportMap] = js.undefined
  }
  object ViewportAddonParameter {
    
    inline def apply(): ViewportAddonParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewportAddonParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewportAddonParameter] (val x: Self) extends AnyVal {
      
      inline def setDefaultViewport(value: String): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setViewports(value: ViewportMap): Self = StObject.set(x, "viewports", value.asInstanceOf[js.Any])
      
      inline def setViewportsUndefined: Self = StObject.set(x, "viewports", js.undefined)
    }
  }
}
