package typings
package reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativePermissions extends js.Object {
  def canOpenSettings(): js.Promise[scala.Boolean] = js.native
  def check(permission: java.lang.String): js.Promise[Status] = js.native
  def check(permission: java.lang.String, options: CheckOptions): js.Promise[Status] = js.native
  def checkMultiple(permissions: js.Array[java.lang.String]): js.Promise[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def getTypes(): js.Array[java.lang.String] = js.native
  def openSettings(): js.Promise[_] = js.native
  def request(permission: java.lang.String): js.Promise[Status] = js.native
  def request(permission: java.lang.String, options: RequestOptions): js.Promise[Status] = js.native
}

