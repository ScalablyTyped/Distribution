package typings.selectize

import typings.selectize.selectizeStrings.asc
import typings.selectize.selectizeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: js.UndefOr[asc | desc] = js.undefined
  var field: String
}

object AnonDirection {
  @scala.inline
  def apply(field: String, direction: asc | desc = null): AnonDirection = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

