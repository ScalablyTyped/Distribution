package typings.reactDnd.anon

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerIdsArray extends js.Object {
  var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
}

object HandlerIdsArray {
  @scala.inline
  def apply(handlerIds: js.Array[Identifier] = null): HandlerIdsArray = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerIdsArray]
  }
}

