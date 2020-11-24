package typings.storybookUi.anon

import typings.storybookUi.containerMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/ui.@storybook/ui/dist/components/layout/container.BasePanelRenderProps & {  docsOnly :boolean,   isToolshown :boolean} */
@js.native
trait BasePanelRenderPropsdocsO extends js.Object {
  
  var animate: Boolean = js.native
  
  var docsOnly: Boolean = js.native
  
  var isFullscreen: js.UndefOr[Boolean] = js.native
  
  var isToolshown: Boolean = js.native
  
  var position: Bounds = js.native
  
  var viewMode: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
  ] = js.native
}
object BasePanelRenderPropsdocsO {
  
  @scala.inline
  def apply(animate: Boolean, docsOnly: Boolean, isToolshown: Boolean, position: Bounds): BasePanelRenderPropsdocsO = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], docsOnly = docsOnly.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePanelRenderPropsdocsO]
  }
  
  @scala.inline
  implicit class BasePanelRenderPropsdocsOOps[Self <: BasePanelRenderPropsdocsO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = this.set("docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsToolshown(value: Boolean): Self = this.set("isToolshown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Bounds): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFullscreen(value: Boolean): Self = this.set("isFullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFullscreen: Self = this.set("isFullscreen", js.undefined)
    
    @scala.inline
    def setViewMode(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
