package typings.reactDashRouter.reactDashRouterMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptProps extends js.Object {
  var message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean])
  var when: js.UndefOr[Boolean] = js.undefined
}

object PromptProps {
  @scala.inline
  def apply(
    message: String | (js.Function1[/* location */ Location[LocationState], String | Boolean]),
    when: js.UndefOr[Boolean] = js.undefined
  ): PromptProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptProps]
  }
}

