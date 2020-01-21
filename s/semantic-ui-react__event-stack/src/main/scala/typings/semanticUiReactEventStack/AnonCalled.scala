package typings.semanticUiReactEventStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalled extends js.Object {
  var called: js.UndefOr[Boolean] = js.undefined
}

object AnonCalled {
  @scala.inline
  def apply(called: js.UndefOr[Boolean] = js.undefined): AnonCalled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(called)) __obj.updateDynamic("called")(called.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalled]
  }
}

