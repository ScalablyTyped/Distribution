package typings.snakecaseKeys.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
}

object Options {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined, exclude: js.Array[String | RegExp] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

