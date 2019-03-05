package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantSourceOptions extends js.Object {
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object ConstantSourceOptions {
  @scala.inline
  def apply(offset: scala.Int | scala.Double = null): ConstantSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantSourceOptions]
  }
}

