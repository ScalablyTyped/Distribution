package typings.slug.slugMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var charmap: js.UndefOr[CharMap | Null] = js.undefined
  var lower: js.UndefOr[Boolean | Null] = js.undefined
  var multicharmap: js.UndefOr[CharMap | Null] = js.undefined
  var remove: js.UndefOr[RegExp | Null] = js.undefined
  var replacement: js.UndefOr[String | Null] = js.undefined
  var symbols: js.UndefOr[Boolean | Null] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    charmap: CharMap = null,
    lower: js.UndefOr[Boolean] = js.undefined,
    multicharmap: CharMap = null,
    remove: RegExp = null,
    replacement: String = null,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): Mode = {
    val __obj = js.Dynamic.literal()
    if (charmap != null) __obj.updateDynamic("charmap")(charmap)
    if (!js.isUndefined(lower)) __obj.updateDynamic("lower")(lower)
    if (multicharmap != null) __obj.updateDynamic("multicharmap")(multicharmap)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (replacement != null) __obj.updateDynamic("replacement")(replacement)
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols)
    __obj.asInstanceOf[Mode]
  }
}

