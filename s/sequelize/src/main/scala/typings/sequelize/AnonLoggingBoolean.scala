package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoggingBoolean extends js.Object {
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
}

object AnonLoggingBoolean {
  @scala.inline
  def apply(logging: Boolean | js.Function = null): AnonLoggingBoolean = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoggingBoolean]
  }
}

