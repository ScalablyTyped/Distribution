package typings.rbx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlyValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: Boolean
}

object OnlyValue {
  @scala.inline
  def apply(value: Boolean, only: js.UndefOr[Boolean] = js.undefined): OnlyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyValue]
  }
}

