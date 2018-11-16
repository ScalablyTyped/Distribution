package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadyStateEvent extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var `type`: RelayContainerLoadingEventType | RelayContainerErrorEventType
}

