package typings
package secureDashRandomDashPasswordLib.secureDashRandomDashPasswordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomPasswordOptions extends js.Object {
  var characters: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
}

object RandomPasswordOptions {
  @scala.inline
  def apply(
    characters: java.lang.String | js.Array[java.lang.String] = null,
    length: scala.Int | scala.Double = null
  ): RandomPasswordOptions = {
    val __obj = js.Dynamic.literal()
    if (characters != null) __obj.updateDynamic("characters")(characters.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomPasswordOptions]
  }
}

