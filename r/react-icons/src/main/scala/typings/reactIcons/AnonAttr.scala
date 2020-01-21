package typings.reactIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttr extends js.Object {
  var attr: js.UndefOr[js.Object] = js.undefined
}

object AnonAttr {
  @scala.inline
  def apply(attr: js.Object = null): AnonAttr = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttr]
  }
}

