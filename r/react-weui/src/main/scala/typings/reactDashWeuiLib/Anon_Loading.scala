package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loading extends js.Object {
  var loading: scala.Boolean
  var showDot: scala.Boolean
  var showLine: scala.Boolean
}

object Anon_Loading {
  @scala.inline
  def apply(loading: scala.Boolean, showDot: scala.Boolean, showLine: scala.Boolean): Anon_Loading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("showDot")(showDot)
    __obj.updateDynamic("showLine")(showLine)
    __obj.asInstanceOf[Anon_Loading]
  }
}

