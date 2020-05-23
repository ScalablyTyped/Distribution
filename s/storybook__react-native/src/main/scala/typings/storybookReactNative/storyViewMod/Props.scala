package typings.storybookReactNative.storyViewMod

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
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(onDevice)) __obj.updateDynamic("onDevice")(onDevice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

