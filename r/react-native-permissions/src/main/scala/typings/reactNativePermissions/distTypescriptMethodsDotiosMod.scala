package typings.reactNativePermissions

import typings.reactNativePermissions.distTypescriptContractMod.Contract
import typings.reactNativePermissions.distTypescriptTypesMod.NotificationOption
import typings.reactNativePermissions.distTypescriptTypesMod.NotificationsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypescriptMethodsDotiosMod {
  
  @JSImport("react-native-permissions/dist/typescript/methods.ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkNotifications(): js.Promise[NotificationsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotifications")().asInstanceOf[js.Promise[NotificationsResponse]]
  
  @JSImport("react-native-permissions/dist/typescript/methods.ios", "methods")
  @js.native
  val methods: Contract = js.native
  
  inline def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestNotifications")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NotificationsResponse]]
}
