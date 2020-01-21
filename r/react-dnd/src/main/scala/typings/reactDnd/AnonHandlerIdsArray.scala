package typings.reactDnd

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandlerIdsArray extends js.Object {
  var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
}

object AnonHandlerIdsArray {
  @scala.inline
  def apply(handlerIds: js.Array[Identifier] = null): AnonHandlerIdsArray = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandlerIdsArray]
  }
}

