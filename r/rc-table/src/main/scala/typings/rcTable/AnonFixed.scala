package typings.rcTable

import typings.rcTable.interfaceMod.FixedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFixed extends js.Object {
  var fixed: js.UndefOr[FixedType] = js.undefined
}

object AnonFixed {
  @scala.inline
  def apply(fixed: FixedType = null): AnonFixed = {
    val __obj = js.Dynamic.literal()
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFixed]
  }
}

