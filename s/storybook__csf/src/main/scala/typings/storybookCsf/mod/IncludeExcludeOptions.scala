package typings.storybookCsf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeExcludeOptions extends js.Object {
  var excludeStories: js.UndefOr[StoryDescriptor] = js.undefined
  var includeStories: js.UndefOr[StoryDescriptor] = js.undefined
}

object IncludeExcludeOptions {
  @scala.inline
  def apply(excludeStories: StoryDescriptor = null, includeStories: StoryDescriptor = null): IncludeExcludeOptions = {
    val __obj = js.Dynamic.literal()
    if (excludeStories != null) __obj.updateDynamic("excludeStories")(excludeStories.asInstanceOf[js.Any])
    if (includeStories != null) __obj.updateDynamic("includeStories")(includeStories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeExcludeOptions]
  }
}

