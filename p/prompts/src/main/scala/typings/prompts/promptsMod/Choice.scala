package typings.prompts.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  var disable: js.UndefOr[Boolean] = js.undefined
  var title: String
  var value: String
}

object Choice {
  @scala.inline
  def apply(title: String, value: String, disable: js.UndefOr[Boolean] = js.undefined): Choice = {
    val __obj = js.Dynamic.literal(title = title, value = value)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    __obj.asInstanceOf[Choice]
  }
}

