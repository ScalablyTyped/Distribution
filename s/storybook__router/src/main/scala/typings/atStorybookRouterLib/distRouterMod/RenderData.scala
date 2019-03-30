package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderData extends js.Object {
  var location: Location
  var path: java.lang.String
  var storyId: js.UndefOr[java.lang.String] = js.undefined
  var viewMode: js.UndefOr[java.lang.String] = js.undefined
  def navigate(to: java.lang.String): scala.Unit
}

object RenderData {
  @scala.inline
  def apply(
    location: Location,
    navigate: java.lang.String => scala.Unit,
    path: java.lang.String,
    storyId: java.lang.String = null,
    viewMode: java.lang.String = null
  ): RenderData = {
    val __obj = js.Dynamic.literal(location = location, navigate = js.Any.fromFunction1(navigate), path = path)
    if (storyId != null) __obj.updateDynamic("storyId")(storyId)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[RenderData]
  }
}

