package typings.storybookUi.toolbarMod

import typings.storybookAddons.distMod.Addon
import typings.storybookApi.mod.API
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolData extends js.Object {
  
  var api: API = js.native
  
  var isShown: Boolean = js.native
  
  var story: Story | Group = js.native
  
  var tabs: js.Array[Addon] = js.native
}
object ToolData {
  
  @scala.inline
  def apply(api: API, isShown: Boolean, story: Story | Group, tabs: js.Array[Addon]): ToolData = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], isShown = isShown.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolData]
  }
  
  @scala.inline
  implicit class ToolDataOps[Self <: ToolData] (val x: Self) extends AnyVal {
    
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
    def setApi(value: API): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShown(value: Boolean): Self = this.set("isShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: Story | Group): Self = this.set("story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsVarargs(value: Addon*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[Addon]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
}
