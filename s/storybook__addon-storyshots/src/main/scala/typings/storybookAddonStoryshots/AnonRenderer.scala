package typings.storybookAddonStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderer extends js.Object {
  var renderer: js.UndefOr[js.Any] = js.undefined
  var serializer: js.UndefOr[js.Any] = js.undefined
}

object AnonRenderer {
  @scala.inline
  def apply(renderer: js.Any = null, serializer: js.Any = null): AnonRenderer = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRenderer]
  }
}

