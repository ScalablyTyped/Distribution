package typings.slug.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var charmap: js.UndefOr[CharMap_ | Null] = js.undefined
  var lower: js.UndefOr[Boolean | Null] = js.undefined
  var multicharmap: js.UndefOr[CharMap_ | Null] = js.undefined
  var remove: js.UndefOr[RegExp | Null] = js.undefined
  var replacement: js.UndefOr[String | Null] = js.undefined
  var symbols: js.UndefOr[Boolean | Null] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    charmap: js.UndefOr[Null | CharMap_] = js.undefined,
    lower: js.UndefOr[Null | Boolean] = js.undefined,
    multicharmap: js.UndefOr[Null | CharMap_] = js.undefined,
    remove: js.UndefOr[Null | RegExp] = js.undefined,
    replacement: js.UndefOr[Null | String] = js.undefined,
    symbols: js.UndefOr[Null | Boolean] = js.undefined
  ): Mode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(charmap)) __obj.updateDynamic("charmap")(charmap.asInstanceOf[js.Any])
    if (!js.isUndefined(lower)) __obj.updateDynamic("lower")(lower.asInstanceOf[js.Any])
    if (!js.isUndefined(multicharmap)) __obj.updateDynamic("multicharmap")(multicharmap.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (!js.isUndefined(replacement)) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

