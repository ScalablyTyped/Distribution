package typings.storybookUi.anon

import typings.storybookUi.containerMod.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/ui.@storybook/ui/dist/components/layout/container.BasePanelRenderProps & {  hidden :boolean} */
@js.native
trait BasePanelRenderPropshidde extends StObject {
  
  var animate: Boolean = js.native
  
  var hidden: Boolean = js.native
  
  var isFullscreen: js.UndefOr[Boolean] = js.native
  
  var position: Bounds = js.native
  
  var viewMode: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
  ] = js.native
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
    def setViewMode(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
