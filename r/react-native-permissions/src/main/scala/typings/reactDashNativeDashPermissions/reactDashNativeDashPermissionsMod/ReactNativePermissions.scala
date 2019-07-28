package typings.reactDashNativeDashPermissions.reactDashNativeDashPermissionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactNativePermissions extends js.Object {
  def canOpenSettings(): js.Promise[Boolean] = js.native
  def check(permission: String): js.Promise[Status] = js.native
  def check(permission: String, options: CheckOptions): js.Promise[Status] = js.native
  def checkMultiple(permissions: js.Array[String]): js.Promise[StringDictionary[String]] = js.native
  def getTypes(): js.Array[String] = js.native
  def openSettings(): js.Promise[_] = js.native
  def request(permission: String): js.Promise[Status] = js.native
  def request(permission: String, options: RequestOptions): js.Promise[Status] = js.native
}

