package typings.reactDashNativeDashPermissions

import typings.reactDashNative.reactDashNativeMod.Rationale
import typings.reactDashNativeDashPermissions.libTypescriptTypesMod.NotificationOption
import typings.reactDashNativeDashPermissions.libTypescriptTypesMod.NotificationsResponse
import typings.reactDashNativeDashPermissions.libTypescriptTypesMod.Permission
import typings.reactDashNativeDashPermissions.libTypescriptTypesMod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-permissions", JSImport.Namespace)
@js.native
object reactDashNativeDashPermissionsMod extends js.Object {
  val PERMISSIONS: Anon_ANDROID = js.native
  val RESULTS: Anon_BLOCKED = js.native
  def check(permission: Permission): js.Promise[PermissionStatus] = js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  def openSettings(): js.Promise[Unit] = js.native
  def request(permission: Permission): js.Promise[PermissionStatus] = js.native
  def request(permission: Permission, rationale: Rationale): js.Promise[PermissionStatus] = js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  @js.native
  object default extends js.Object {
    var PERMISSIONS: Anon_ANDROID = js.native
    var RESULTS: Anon_BLOCKED = js.native
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

