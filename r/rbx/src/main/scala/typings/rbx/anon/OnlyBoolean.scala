package typings.rbx.anon

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlyBoolean extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: centered | justified | left | right
}

object OnlyBoolean {
  @scala.inline
  def apply(value: centered | justified | left | right, only: js.UndefOr[Boolean] = js.undefined): OnlyBoolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyBoolean]
  }
}

