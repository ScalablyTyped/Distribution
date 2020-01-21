package typings.slateHtmlSerializer

import typings.slateHtmlSerializer.slateHtmlSerializerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRender extends js.Object {
  var render: js.UndefOr[`true`] = js.undefined
}

object AnonRender {
  @scala.inline
  def apply(render: `true` = null): AnonRender = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRender]
  }
}

