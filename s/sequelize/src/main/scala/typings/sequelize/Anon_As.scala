package typings.sequelize

import typings.sequelize.sequelizeMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var model: Model[_, _, _]
}

object Anon_As {
  @scala.inline
  def apply(model: Model[_, _, _], as: String = null): Anon_As = {
    val __obj = js.Dynamic.literal(model = model)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[Anon_As]
  }
}

