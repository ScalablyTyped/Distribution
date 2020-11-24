package typings.storybookUi.containerMod

import typings.react.mod.ReactNode
import typings.storybookTheming.typesMod.Theme
import typings.storybookUi.anon.IsToolshown
import typings.storybookUi.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutProps extends js.Object {
  
  var bounds: Left = js.native
  
  def children(data: LayoutRenderProps): ReactNode = js.native
  
  var docsOnly: Boolean = js.native
  
  var options: IsToolshown = js.native
  
  var panelCount: Double = js.native
  
  var theme: Theme = js.native
  
  var viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any = js.native
}
object LayoutProps {
  
  @scala.inline
  def apply(
    bounds: Left,
    children: LayoutRenderProps => ReactNode,
    docsOnly: Boolean,
    options: IsToolshown,
    panelCount: Double,
    theme: Theme,
    viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
  ): LayoutProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), docsOnly = docsOnly.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutProps]
  }
  
  @scala.inline
  implicit class LayoutPropsOps[Self <: LayoutProps] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Left): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: LayoutRenderProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = this.set("docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IsToolshown): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelCount(value: Double): Self = this.set("panelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
}
