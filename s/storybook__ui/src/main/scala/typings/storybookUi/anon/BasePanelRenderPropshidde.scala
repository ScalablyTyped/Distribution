package typings.storybookUi.anon

import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookUi.containerMod.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/ui.@storybook/ui/dist/components/layout/container.BasePanelRenderProps & {  hidden :boolean} */
trait BasePanelRenderPropshidde extends StObject {
  
  var animate: Boolean
  
  var hidden: Boolean
  
  var isFullscreen: js.UndefOr[Boolean] = js.undefined
  
  var position: Bounds
  
  var viewMode: js.UndefOr[ViewMode & js.UndefOr[String]] = js.undefined
}
object BasePanelRenderPropshidde {
  
  @scala.inline
  def apply(animate: Boolean, hidden: Boolean, position: Bounds): BasePanelRenderPropshidde = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePanelRenderPropshidde]
  }
  
  @scala.inline
  implicit class BasePanelRenderPropshiddeMutableBuilder[Self <: BasePanelRenderPropshidde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFullscreenUndefined: Self = StObject.set(x, "isFullscreen", js.undefined)
    
    @scala.inline
    def setPosition(value: Bounds): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
