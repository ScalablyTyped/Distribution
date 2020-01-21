package typings.reactRte.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderConfig extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object RenderConfig {
  @scala.inline
  def apply(attributes: js.Any = null, element: String = null, style: js.Any = null): RenderConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderConfig]
  }
}

