package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyStateEvent extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var `type`: RelayContainerLoadingEventType | RelayContainerErrorEventType
}

object ReadyStateEvent {
  @scala.inline
  def apply(`type`: RelayContainerLoadingEventType | RelayContainerErrorEventType, error: stdLib.Error = null): ReadyStateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ReadyStateEvent]
  }
}

