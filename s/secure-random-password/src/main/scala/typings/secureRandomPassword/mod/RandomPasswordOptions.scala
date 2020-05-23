package typings.secureRandomPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomPasswordOptions extends js.Object {
  var characters: js.UndefOr[String | js.Array[String]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
}

object RandomPasswordOptions {
  @scala.inline
  def apply(characters: String | js.Array[String] = null, length: js.UndefOr[Double] = js.undefined): RandomPasswordOptions = {
    val __obj = js.Dynamic.literal()
    if (characters != null) __obj.updateDynamic("characters")(characters.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomPasswordOptions]
  }
}

