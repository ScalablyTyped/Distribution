package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var returning: js.UndefOr[sequelizeLib.sequelizeLibNumbers.`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(returning: sequelizeLib.sequelizeLibNumbers.`false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (returning != null) __obj.updateDynamic("returning")(returning)
    __obj.asInstanceOf[Anon_False]
  }
}

