package typings.reactNativePermissions

import typings.reactNativePermissions.contractMod.Contract
import typings.reactNativePermissions.typesMod.NotificationOption
import typings.reactNativePermissions.typesMod.NotificationsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-permissions/lib/typescript/module.ios", JSImport.Namespace)
@js.native
object moduleIosMod extends js.Object {
  val module: Contract = js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
}

