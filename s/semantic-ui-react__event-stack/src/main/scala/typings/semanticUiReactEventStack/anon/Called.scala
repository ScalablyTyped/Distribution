package typings.semanticUiReactEventStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Called extends js.Object {
  var called: js.UndefOr[Boolean] = js.undefined
}

object Called {
  @scala.inline
  def apply(called: js.UndefOr[Boolean] = js.undefined): Called = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(called)) __obj.updateDynamic("called")(called.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Called]
  }
}

