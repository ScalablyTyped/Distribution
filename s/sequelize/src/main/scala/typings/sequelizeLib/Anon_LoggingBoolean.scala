package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoggingBoolean extends js.Object {
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
}

object Anon_LoggingBoolean {
  @scala.inline
  def apply(logging: scala.Boolean | js.Function = null): Anon_LoggingBoolean = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LoggingBoolean]
  }
}

