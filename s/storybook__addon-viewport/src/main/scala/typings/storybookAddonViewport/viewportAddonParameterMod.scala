package typings.storybookAddonViewport

import typings.storybookAddonViewport.viewportMod.ViewportMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportAddonParameterMod {
  
  @js.native
  trait ViewportAddonParameter extends StObject {
    
    var defaultViewport: js.UndefOr[String] = js.native
    
    var disable: js.UndefOr[Boolean] = js.native
    
    var viewports: js.UndefOr[ViewportMap] = js.native
  }
  object ViewportAddonParameter {
    
    @scala.inline
    def apply(): ViewportAddonParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewportAddonParameter]
    }
    
    @scala.inline
    implicit class ViewportAddonParameterMutableBuilder[Self <: ViewportAddonParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultViewport(value: String): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewportUndefined: Self = StObject.set(x, "defaultViewport", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setViewports(value: ViewportMap): Self = StObject.set(x, "viewports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportsUndefined: Self = StObject.set(x, "viewports", js.undefined)
    }
  }
}
