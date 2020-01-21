package typings.reactNativePermissions

import typings.reactNative.mod.Rationale
import typings.reactNativePermissions.typesMod.NotificationOption
import typings.reactNativePermissions.typesMod.NotificationsResponse
import typings.reactNativePermissions.typesMod.Permission
import typings.reactNativePermissions.typesMod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val PERMISSIONS: AnonANDROID = js.native
  val RESULTS: AnonBLOCKED = js.native
  def check(permission: Permission): js.Promise[PermissionStatus] = js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  def openSettings(): js.Promise[Unit] = js.native
  def request(permission: Permission): js.Promise[PermissionStatus] = js.native
  def request(permission: Permission, rationale: Rationale): js.Promise[PermissionStatus] = js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  @js.native
  object default extends js.Object {
    var PERMISSIONS: AnonANDROID = js.native
    var RESULTS: AnonBLOCKED = js.native
    var check: js.Function1[/* permission */ Permission, js.Promise[PermissionStatus]] = js.native
    var checkNotifications: js.Function0[js.Promise[NotificationsResponse]] = js.native
    var openSettings: js.Function0[js.Promise[Unit]] = js.native
    var request: js.Function2[
        /* permission */ Permission, 
        /* rationale */ js.UndefOr[Rationale], 
        js.Promise[PermissionStatus]
      ] = js.native
    var requestNotifications: js.Function1[/* options */ js.Array[NotificationOption], js.Promise[NotificationsResponse]] = js.native
  }
  
}

