package typings.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
}

object `1` {
  @scala.inline
  def apply(logging: Boolean | js.Function = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

