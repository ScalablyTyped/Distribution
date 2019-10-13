package typings.atStorybookUi.distComponentsSidebarSidebarStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var loading: Boolean
  var stories: /* import warning: ImportType.apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
  var storyId: js.UndefOr[String] = js.undefined
}

object StoriesProps {
  @scala.inline
  def apply(
    loading: Boolean,
    stories: /* import warning: ImportType.apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any,
    className: String = null,
    storyId: String = null
  ): StoriesProps = {
    val __obj = js.Dynamic.literal(loading = loading, stories = stories)
    if (className != null) __obj.updateDynamic("className")(className)
    if (storyId != null) __obj.updateDynamic("storyId")(storyId)
    __obj.asInstanceOf[StoriesProps]
  }
}

