package typings.atStorybookRouter.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other extends js.Object {
  var storyId: js.UndefOr[String] = js.undefined
  var viewMode: js.UndefOr[String] = js.undefined
}

object Other {
  @scala.inline
  def apply(storyId: String = null, viewMode: String = null): Other = {
    val __obj = js.Dynamic.literal()
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
}

