package typings.storybookUi.desktopMod

import typings.react.mod.ComponentType
import typings.storybookUi.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesktopProps extends js.Object {
  
  var Notifications: ComponentType[_] = js.native
  
  var Panel: ComponentType[_] = js.native
  
  var Preview: ComponentType[_] = js.native
  
  var Sidebar: ComponentType[_] = js.native
  
  var docsOnly: Boolean = js.native
  
  var height: Double = js.native
  
  var options: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any = js.native
  
  var pages: js.Array[Key] = js.native
  
  var panelCount: Double = js.native
  
  var viewMode: String = js.native
  
  var width: Double = js.native
}
object DesktopProps {
  
  @scala.inline
  def apply(
    Notifications: ComponentType[_],
    Panel: ComponentType[_],
    Preview: ComponentType[_],
    Sidebar: ComponentType[_],
    docsOnly: Boolean,
    height: Double,
    options: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any,
    pages: js.Array[Key],
    panelCount: Double,
    viewMode: String,
    width: Double
  ): DesktopProps = {
    val __obj = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], docsOnly = docsOnly.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesktopProps]
  }
  
  @scala.inline
  implicit class DesktopPropsOps[Self <: DesktopProps] (val x: Self) extends AnyVal {
    
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
    def setNotifications(value: ComponentType[_]): Self = this.set("Notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: ComponentType[_]): Self = this.set("Panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: ComponentType[_]): Self = this.set("Preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar(value: ComponentType[_]): Self = this.set("Sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = this.set("docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: Key*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Key]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelCount(value: Double): Self = this.set("panelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
