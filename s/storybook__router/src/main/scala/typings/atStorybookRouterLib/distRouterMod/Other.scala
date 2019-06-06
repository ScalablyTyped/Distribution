package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other extends js.Object {
  var storyId: js.UndefOr[java.lang.String] = js.undefined
  var viewMode: js.UndefOr[java.lang.String] = js.undefined
}

object Other {
  @scala.inline
  def apply(storyId: java.lang.String = null, viewMode: java.lang.String = null): Other = {
    val __obj = js.Dynamic.literal()
    if (storyId != null) __obj.updateDynamic("storyId")(storyId)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[Other]
  }
}

