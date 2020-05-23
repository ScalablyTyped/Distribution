package typings.storybookClientApi.storyStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryOptions extends js.Object {
  var includeDocsOnly: js.UndefOr[Boolean] = js.undefined
}

object StoryOptions {
  @scala.inline
  def apply(includeDocsOnly: js.UndefOr[Boolean] = js.undefined): StoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeDocsOnly)) __obj.updateDynamic("includeDocsOnly")(includeDocsOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryOptions]
  }
}

