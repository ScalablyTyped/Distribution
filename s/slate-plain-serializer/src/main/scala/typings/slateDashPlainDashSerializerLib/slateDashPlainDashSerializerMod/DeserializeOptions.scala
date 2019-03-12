package typings
package slateDashPlainDashSerializerLib.slateDashPlainDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  var defaultBlock: js.UndefOr[slateLib.slateMod.BlockProperties] = js.undefined
  var defaultMarks: js.UndefOr[
    js.Array[slateLib.slateMod.MarkProperties] | stdLib.Set[slateLib.slateMod.MarkProperties]
  ] = js.undefined
  var toJson: js.UndefOr[scala.Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(
    defaultBlock: slateLib.slateMod.BlockProperties = null,
    defaultMarks: js.Array[slateLib.slateMod.MarkProperties] | stdLib.Set[slateLib.slateMod.MarkProperties] = null,
    toJson: js.UndefOr[scala.Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultBlock != null) __obj.updateDynamic("defaultBlock")(defaultBlock)
    if (defaultMarks != null) __obj.updateDynamic("defaultMarks")(defaultMarks.asInstanceOf[js.Any])
    if (!js.isUndefined(toJson)) __obj.updateDynamic("toJson")(toJson)
    __obj.asInstanceOf[DeserializeOptions]
  }
}

