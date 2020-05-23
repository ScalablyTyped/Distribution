package typings.reactRouter.mod

import typings.history.mod.Action
import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptProps extends js.Object {
  var message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean])
  var when: js.UndefOr[Boolean] = js.undefined
}

object PromptProps {
  @scala.inline
  def apply(
    message: String | (js.Function2[/* location */ Location[LocationState], /* action */ Action, String | Boolean]),
    when: js.UndefOr[Boolean] = js.undefined
  ): PromptProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptProps]
  }
}

