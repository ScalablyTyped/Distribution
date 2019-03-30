package typings
package atStorybookRouterLib.distUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryData extends js.Object {
  var storyId: js.UndefOr[java.lang.String] = js.undefined
  var viewMode: js.UndefOr[java.lang.String] = js.undefined
}

object StoryData {
  @scala.inline
  def apply(storyId: java.lang.String = null, viewMode: java.lang.String = null): StoryData = {
    val __obj = js.Dynamic.literal()
    if (storyId != null) __obj.updateDynamic("storyId")(storyId)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[StoryData]
  }
}

