package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsingOptions extends js.Object {
  var allowAtxHeaderWithoutSpace: js.UndefOr[Boolean] = js.undefined
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  var underscoresBreakWords: js.UndefOr[Boolean] = js.undefined
}

object ParsingOptions {
  @scala.inline
  def apply(
    allowAtxHeaderWithoutSpace: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underscoresBreakWords: js.UndefOr[Boolean] = js.undefined
  ): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAtxHeaderWithoutSpace)) __obj.updateDynamic("allowAtxHeaderWithoutSpace")(allowAtxHeaderWithoutSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.asInstanceOf[js.Any])
    if (!js.isUndefined(underscoresBreakWords)) __obj.updateDynamic("underscoresBreakWords")(underscoresBreakWords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingOptions]
  }
}

