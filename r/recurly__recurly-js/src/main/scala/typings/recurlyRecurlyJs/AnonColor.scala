package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[AnonCvv] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(color: String = null, content: AnonCvv = null, fontWeight: String = null): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

