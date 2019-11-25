package typings.reactDashDnd

import typings.dndDashCore.libInterfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerIds extends js.Object {
  var handlerIds: js.UndefOr[js.Array[Identifier]] = js.undefined
}

object Anon_HandlerIds {
  @scala.inline
  def apply(handlerIds: js.Array[Identifier] = null): Anon_HandlerIds = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HandlerIds]
  }
}

