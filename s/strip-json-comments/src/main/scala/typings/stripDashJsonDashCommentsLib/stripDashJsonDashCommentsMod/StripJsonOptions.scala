package typings
package stripDashJsonDashCommentsLib.stripDashJsonDashCommentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripJsonOptions extends js.Object {
  var whitespace: js.UndefOr[scala.Boolean] = js.undefined
}

object StripJsonOptions {
  @scala.inline
  def apply(whitespace: js.UndefOr[scala.Boolean] = js.undefined): StripJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace)
    __obj.asInstanceOf[StripJsonOptions]
  }
}

