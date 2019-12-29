package typings.reactDashToastDashNotifications.reactDashToastDashNotificationsMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastProps extends js.Object {
  var appearance: AppearanceTypes = js.native
  var autoDismiss: Boolean | Double = js.native
   // inherited from ToastProvider
  var autoDismissTimeout: Double = js.native
   // inherited from ToastProvider
  var children: ReactNode = js.native
  var isRunning: Boolean = js.native
  var placement: Placement = js.native
  var transitionDuration: Double = js.native
   // inherited from ToastProvider
  var transitionState: TransitionState = js.native
  def onDismiss(): Unit = js.native
  def onDismiss(id: String): Unit = js.native
  def onMouseEnter(): Unit = js.native
  def onMouseLeave(): Unit = js.native
}

