package typings.reactDnd.monitorsMod

import typings.dndCore.interfacesMod.Unsubscribe
import typings.reactDnd.anon.HandlerIdsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitorEventEmitter extends js.Object {
  def subscribeToStateChange(fn: js.Function0[Unit]): Unsubscribe = js.native
  def subscribeToStateChange(fn: js.Function0[Unit], options: HandlerIdsArray): Unsubscribe = js.native
}

