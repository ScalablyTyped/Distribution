package typings.reactNativePermissions

import typings.reactNativePermissions.contractMod.Contract
import typings.reactNativePermissions.typesMod.NotificationOption
import typings.reactNativePermissions.typesMod.NotificationsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-permissions/dist/typescript/methods.ios", JSImport.Namespace)
@js.native
object methodsIosMod extends js.Object {
  
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  
  val methods: Contract = js.native
  
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
}
