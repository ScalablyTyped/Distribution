package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BasePermissions")
@js.native
class BasePermissions () extends ClientValueObject {
  def clear(perm: PermissionKind): Unit = js.native
  def clearAll(): Unit = js.native
  def equals(perm: BasePermissions): Boolean = js.native
  def has(perm: PermissionKind): Boolean = js.native
  def hasPermissions(high: Double, low: Double): Boolean = js.native
  def set(perm: PermissionKind): Unit = js.native
}

