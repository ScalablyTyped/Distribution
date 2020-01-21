package typings.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: String
  var brandTitle: js.UndefOr[String] = js.undefined
}

object AnonBase {
  @scala.inline
  def apply(base: String, brandTitle: String = null): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    if (brandTitle != null) __obj.updateDynamic("brandTitle")(brandTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase]
  }
}

