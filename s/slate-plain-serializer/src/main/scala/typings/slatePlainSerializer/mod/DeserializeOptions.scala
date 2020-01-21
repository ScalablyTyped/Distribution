package typings.slatePlainSerializer.mod

import typings.slate.mod.BlockProperties
import typings.slate.mod.MarkProperties
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  var defaultBlock: js.UndefOr[BlockProperties] = js.undefined
  var defaultMarks: js.UndefOr[js.Array[MarkProperties] | Set[MarkProperties]] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var toJson: js.UndefOr[Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(
    defaultBlock: BlockProperties = null,
    defaultMarks: js.Array[MarkProperties] | Set[MarkProperties] = null,
    delimiter: String = null,
    toJson: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultBlock != null) __obj.updateDynamic("defaultBlock")(defaultBlock.asInstanceOf[js.Any])
    if (defaultMarks != null) __obj.updateDynamic("defaultMarks")(defaultMarks.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(toJson)) __obj.updateDynamic("toJson")(toJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

