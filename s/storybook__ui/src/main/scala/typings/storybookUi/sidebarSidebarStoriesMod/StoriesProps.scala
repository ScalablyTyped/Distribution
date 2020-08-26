package typings.storybookUi.sidebarSidebarStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoriesProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var loading: Boolean = js.native
  var stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any = js.native
  var storyId: js.UndefOr[String] = js.native
}

object StoriesProps {
  @scala.inline
  def apply(
    loading: Boolean,
    stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
  ): StoriesProps = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesProps]
  }
  @scala.inline
  implicit class StoriesPropsOps[Self <: StoriesProps] (val x: Self) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setStories(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
    ): Self = this.set("stories", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
  }
  
}

