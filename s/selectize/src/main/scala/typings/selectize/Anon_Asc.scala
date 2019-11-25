package typings.selectize

import typings.selectize.selectizeStrings.asc
import typings.selectize.selectizeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asc extends js.Object {
  var direction: js.UndefOr[asc | desc] = js.undefined
  var field: String
}

object Anon_Asc {
  @scala.inline
  def apply(field: String, direction: asc | desc = null): Anon_Asc = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asc]
  }
}

