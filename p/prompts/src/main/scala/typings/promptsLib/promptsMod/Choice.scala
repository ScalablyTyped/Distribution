package typings
package promptsLib.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var title: java.lang.String
  var value: java.lang.String
}

object Choice {
  @scala.inline
  def apply(
    title: java.lang.String,
    value: java.lang.String,
    disable: js.UndefOr[scala.Boolean] = js.undefined
  ): Choice = {
    val __obj = js.Dynamic.literal(title = title, value = value)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    __obj.asInstanceOf[Choice]
  }
}

