package typings
package atSemanticDashUiDashReactEventDashStackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Called extends js.Object {
  var called: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Called {
  @scala.inline
  def apply(called: js.UndefOr[scala.Boolean] = js.undefined): Anon_Called = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(called)) __obj.updateDynamic("called")(called)
    __obj.asInstanceOf[Anon_Called]
  }
}

