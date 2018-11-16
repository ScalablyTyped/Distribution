package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BasePermissions")
@js.native
class BasePermissions () extends ClientValueObject {
  def clear(perm: PermissionKind): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def equals(perm: BasePermissions): scala.Boolean = js.native
  def has(perm: PermissionKind): scala.Boolean = js.native
  def hasPermissions(high: scala.Double, low: scala.Double): scala.Boolean = js.native
  def set(perm: PermissionKind): scala.Unit = js.native
}

