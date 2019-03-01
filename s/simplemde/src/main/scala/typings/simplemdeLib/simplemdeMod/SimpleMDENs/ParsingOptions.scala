package typings
package simplemdeLib.simplemdeMod.SimpleMDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsingOptions extends js.Object {
  var allowAtxHeaderWithoutSpace: js.UndefOr[scala.Boolean] = js.undefined
  var strikethrough: js.UndefOr[scala.Boolean] = js.undefined
  var underscoresBreakWords: js.UndefOr[scala.Boolean] = js.undefined
}

object ParsingOptions {
  @scala.inline
  def apply(
    allowAtxHeaderWithoutSpace: js.UndefOr[scala.Boolean] = js.undefined,
    strikethrough: js.UndefOr[scala.Boolean] = js.undefined,
    underscoresBreakWords: js.UndefOr[scala.Boolean] = js.undefined
  ): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAtxHeaderWithoutSpace)) __obj.updateDynamic("allowAtxHeaderWithoutSpace")(allowAtxHeaderWithoutSpace)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(underscoresBreakWords)) __obj.updateDynamic("underscoresBreakWords")(underscoresBreakWords)
    __obj.asInstanceOf[ParsingOptions]
  }
}

