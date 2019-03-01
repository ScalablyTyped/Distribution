package typings
package randomstringLib.RandomstringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var capitalization: js.UndefOr[java.lang.String] = js.undefined
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var readable: js.UndefOr[scala.Boolean] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    capitalization: java.lang.String = null,
    charset: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (capitalization != null) __obj.updateDynamic("capitalization")(capitalization)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    __obj.asInstanceOf[GenerateOptions]
  }
}

