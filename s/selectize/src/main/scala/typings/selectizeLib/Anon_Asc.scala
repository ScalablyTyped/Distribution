package typings
package selectizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asc extends js.Object {
  var direction: js.UndefOr[selectizeLib.selectizeLibStrings.asc | selectizeLib.selectizeLibStrings.desc] = js.undefined
  var field: java.lang.String
}

object Anon_Asc {
  @scala.inline
  def apply(
    field: java.lang.String,
    direction: selectizeLib.selectizeLibStrings.asc | selectizeLib.selectizeLibStrings.desc = null
  ): Anon_Asc = {
    val __obj = js.Dynamic.literal(field = field)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Asc]
  }
}

