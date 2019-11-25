package typings.randomstring.Randomstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var capitalization: js.UndefOr[String] = js.undefined
  var charset: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    capitalization: String = null,
    charset: String = null,
    length: Int | Double = null,
    readable: js.UndefOr[Boolean] = js.undefined
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (capitalization != null) __obj.updateDynamic("capitalization")(capitalization.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}

