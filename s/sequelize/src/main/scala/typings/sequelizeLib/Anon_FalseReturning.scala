package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseReturning extends js.Object {
  var returning: js.UndefOr[sequelizeLib.sequelizeLibNumbers.`false`]
}

object Anon_FalseReturning {
  @scala.inline
  def apply(returning: sequelizeLib.sequelizeLibNumbers.`false` = null): Anon_FalseReturning = {
    val __obj = js.Dynamic.literal()
    if (returning != null) __obj.updateDynamic("returning")(returning)
    __obj.asInstanceOf[Anon_FalseReturning]
  }
}

