package typings
package simplecrawlerLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var ctrl: js.UndefOr[scala.Boolean] = js.undefined
  var meta: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var sequence: js.UndefOr[java.lang.String] = js.undefined
  var shift: js.UndefOr[scala.Boolean] = js.undefined
}

object Key {
  @scala.inline
  def apply(
    ctrl: js.UndefOr[scala.Boolean] = js.undefined,
    meta: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    sequence: java.lang.String = null,
    shift: js.UndefOr[scala.Boolean] = js.undefined
  ): Key = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ctrl)) __obj.updateDynamic("ctrl")(ctrl)
    if (!js.isUndefined(meta)) __obj.updateDynamic("meta")(meta)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence)
    if (!js.isUndefined(shift)) __obj.updateDynamic("shift")(shift)
    __obj.asInstanceOf[Key]
  }
}

