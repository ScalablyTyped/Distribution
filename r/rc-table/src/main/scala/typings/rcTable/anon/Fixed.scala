package typings.rcTable.anon

import typings.rcTable.interfaceMod.FixedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fixed extends js.Object {
  var fixed: js.UndefOr[FixedType] = js.undefined
}

object Fixed {
  @scala.inline
  def apply(fixed: FixedType = null): Fixed = {
    val __obj = js.Dynamic.literal()
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fixed]
  }
}

