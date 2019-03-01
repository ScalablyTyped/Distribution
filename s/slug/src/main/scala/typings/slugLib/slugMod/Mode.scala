package typings
package slugLib.slugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var charmap: js.UndefOr[CharMap | scala.Null] = js.undefined
  var lower: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var multicharmap: js.UndefOr[CharMap | scala.Null] = js.undefined
  var remove: js.UndefOr[stdLib.RegExp | scala.Null] = js.undefined
  var replacement: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var symbols: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object Mode {
  @scala.inline
  def apply(
    charmap: CharMap = null,
    lower: js.UndefOr[scala.Boolean] = js.undefined,
    multicharmap: CharMap = null,
    remove: stdLib.RegExp = null,
    replacement: java.lang.String = null,
    symbols: js.UndefOr[scala.Boolean] = js.undefined
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

