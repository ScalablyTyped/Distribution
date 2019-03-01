package typings
package prettyLib.prettyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrettyOptions extends js.Object {
  var ocd: scala.Boolean
}

object PrettyOptions {
  @scala.inline
  def apply(ocd: scala.Boolean): PrettyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ocd")(ocd)
    __obj.asInstanceOf[PrettyOptions]
  }
}

