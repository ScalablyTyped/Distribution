package typings.atSemanticDashUiDashReactEventDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Called extends js.Object {
  var called: js.UndefOr[Boolean] = js.undefined
}

object Anon_Called {
  @scala.inline
  def apply(called: js.UndefOr[Boolean] = js.undefined): Anon_Called = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(called)) __obj.updateDynamic("called")(called.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Called]
  }
}

