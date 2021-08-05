package typings.storybookUi.anon

import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookUi.containerMod.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/ui.@storybook/ui/dist/components/layout/container.BasePanelRenderProps & {  docsOnly :boolean,   isToolshown :boolean} */
trait BasePanelRenderPropsdocsO extends StObject {
  
  var animate: Boolean
  
  var docsOnly: Boolean
  
  var isFullscreen: js.UndefOr[Boolean] = js.undefined
  
  var isToolshown: Boolean
  
  var position: Bounds
  
  var viewMode: js.UndefOr[ViewMode & js.UndefOr[String]] = js.undefined
}
object BasePanelRenderPropsdocsO {
  
  inline def apply(animate: Boolean, docsOnly: Boolean, isToolshown: Boolean, position: Bounds): BasePanelRenderPropsdocsO = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], docsOnly = docsOnly.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePanelRenderPropsdocsO]
  }
  
  extension [Self <: BasePanelRenderPropsdocsO](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
    
    inline def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    inline def setIsFullscreenUndefined: Self = StObject.set(x, "isFullscreen", js.undefined)
    
    inline def setIsToolshown(value: Boolean): Self = StObject.set(x, "isToolshown", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Bounds): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
