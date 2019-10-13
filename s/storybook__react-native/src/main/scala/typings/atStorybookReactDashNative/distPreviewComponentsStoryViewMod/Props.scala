package typings.atStorybookReactDashNative.distPreviewComponentsStoryViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var onDevice: js.UndefOr[Boolean] = js.undefined
  var stories: js.Any
  var url: String
}

object Props {
  @scala.inline
  def apply(stories: js.Any, url: String, onDevice: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal(stories = stories, url = url)
    if (!js.isUndefined(onDevice)) __obj.updateDynamic("onDevice")(onDevice)
    __obj.asInstanceOf[Props]
  }
}

