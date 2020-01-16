package typings.atStorybookAddonDashStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Renderer extends js.Object {
  var renderer: js.UndefOr[js.Any] = js.undefined
  var serializer: js.UndefOr[js.Any] = js.undefined
}

object Anon_Renderer {
  @scala.inline
  def apply(renderer: js.Any = null, serializer: js.Any = null): Anon_Renderer = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Renderer]
  }
}

