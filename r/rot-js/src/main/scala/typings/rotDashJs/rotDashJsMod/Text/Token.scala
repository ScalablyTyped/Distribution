package typings.rotDashJs.rotDashJsMod.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Added to support `tokenize`
trait Token extends js.Object {
  var `type`: Double
  var value: js.UndefOr[String] = js.undefined
}

object Token {
  @scala.inline
  def apply(`type`: Double, value: String = null): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Token]
  }
}

