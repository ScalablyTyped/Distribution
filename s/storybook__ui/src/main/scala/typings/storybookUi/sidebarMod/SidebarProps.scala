package typings.storybookUi.sidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarProps extends js.Object {
  var loading: js.UndefOr[Boolean] = js.native
  var menu: js.Array[_] = js.native
  var menuHighlighted: js.UndefOr[Boolean] = js.native
  var stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any = js.native
  var storyId: js.UndefOr[String] = js.native
}

object SidebarProps {
  @scala.inline
  def apply(
    menu: js.Array[_],
    stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
  ): SidebarProps = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
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
    def setStories(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
    ): Self = this.set("stories", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMenuHighlighted(value: Boolean): Self = this.set("menuHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuHighlighted: Self = this.set("menuHighlighted", js.undefined)
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
  }
  
}

