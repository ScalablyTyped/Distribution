package typings.slateDashPlainDashSerializer.slateDashPlainDashSerializerMod

import typings.slate.slateMod.BlockProperties
import typings.slate.slateMod.MarkProperties
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  var defaultBlock: js.UndefOr[BlockProperties] = js.undefined
  var defaultMarks: js.UndefOr[js.Array[MarkProperties] | Set[MarkProperties]] = js.undefined
  var toJson: js.UndefOr[Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(
    defaultBlock: BlockProperties = null,
    defaultMarks: js.Array[MarkProperties] | Set[MarkProperties] = null,
    toJson: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultBlock != null) __obj.updateDynamic("defaultBlock")(defaultBlock.asInstanceOf[js.Any])
    if (defaultMarks != null) __obj.updateDynamic("defaultMarks")(defaultMarks.asInstanceOf[js.Any])
    if (!js.isUndefined(toJson)) __obj.updateDynamic("toJson")(toJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

