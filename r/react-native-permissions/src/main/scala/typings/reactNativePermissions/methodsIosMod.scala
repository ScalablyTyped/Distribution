package typings.reactNativePermissions

import typings.reactNativePermissions.contractMod.Contract
import typings.reactNativePermissions.typesMod.NotificationOption
import typings.reactNativePermissions.typesMod.NotificationsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodsIosMod {
  
  @JSImport("react-native-permissions/dist/typescript/methods.ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkNotifications(): js.Promise[NotificationsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotifications")().asInstanceOf[js.Promise[NotificationsResponse]]
  
  @JSImport("react-native-permissions/dist/typescript/methods.ios", "methods")
  @js.native
  val methods: Contract = js.native
  
  @scala.inline
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestNotifications")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NotificationsResponse]]
}
