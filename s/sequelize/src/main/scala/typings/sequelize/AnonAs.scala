package typings.sequelize

import typings.sequelize.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var model: Model[_, _, _]
}

object AnonAs {
  @scala.inline
  def apply(model: Model[_, _, _], as: String = null): AnonAs = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAs]
  }
}

