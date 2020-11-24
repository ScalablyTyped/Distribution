package typings.storybookUi.mobileMod

import typings.react.mod.ComponentType
import typings.storybookUi.anon.InitialActive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileProps extends js.Object {
  
  var Notifications: ComponentType[_] = js.native
  
  var Panel: ComponentType[_] = js.native
  
  var Preview: ComponentType[_] = js.native
  
  var Sidebar: ComponentType[_] = js.native
  
  var options: InitialActive = js.native
  
  var pages: js.Array[Page] = js.native
  
  var viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any = js.native
}
object MobileProps {
  
  @scala.inline
  def apply(
    Notifications: ComponentType[_],
    Panel: ComponentType[_],
    Preview: ComponentType[_],
    Sidebar: ComponentType[_],
    options: InitialActive,
    pages: js.Array[Page],
    viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
  ): MobileProps = {
    val __obj = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileProps]
  }
  
  @scala.inline
  implicit class MobilePropsOps[Self <: MobileProps] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: InitialActive): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: Page*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
}
