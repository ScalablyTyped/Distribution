package typings.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var renderer: js.UndefOr[js.Any] = js.undefined
  var serializer: js.UndefOr[js.Any] = js.undefined
}

object Renderer {
  @scala.inline
  def apply(renderer: js.Any = null, serializer: js.Any = null): Renderer = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
}

