package typings.storybookUi.sidebarMod

import typings.std.Error
import typings.storybookApi.storiesMod.StoriesHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarProps extends js.Object {
  
  var enableShortcuts: js.UndefOr[Boolean] = js.native
  
  var menu: js.Array[_] = js.native
  
  var menuHighlighted: js.UndefOr[Boolean] = js.native
  
  var refId: js.UndefOr[String] = js.native
  
  var refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any = js.native
  
  var stories: StoriesHash = js.native
  
  var storiesConfigured: Boolean = js.native
  
  var storiesFailed: js.UndefOr[Error] = js.native
  
  var storyId: js.UndefOr[String] = js.native
}
object SidebarProps {
  
  @scala.inline
  def apply(
    menu: js.Array[_],
    refs: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any,
    stories: StoriesHash,
    storiesConfigured: Boolean
  ): SidebarProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], storiesConfigured = storiesConfigured.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
  
  @scala.inline
  implicit class SidebarPropsOps[Self <: SidebarProps] (val x: Self) extends AnyVal {
    
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
    def setMenuVarargs(value: js.Any*): Self = this.set("menu", js.Array(value :_*))
    
    @scala.inline
    def setMenu(value: js.Array[_]): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any
    ): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories(value: StoriesHash): Self = this.set("stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesConfigured(value: Boolean): Self = this.set("storiesConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableShortcuts(value: Boolean): Self = this.set("enableShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableShortcuts: Self = this.set("enableShortcuts", js.undefined)
    
    @scala.inline
    def setMenuHighlighted(value: Boolean): Self = this.set("menuHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuHighlighted: Self = this.set("menuHighlighted", js.undefined)
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefId: Self = this.set("refId", js.undefined)
    
    @scala.inline
    def setStoriesFailed(value: Error): Self = this.set("storiesFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoriesFailed: Self = this.set("storiesFailed", js.undefined)
    
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
  }
}
