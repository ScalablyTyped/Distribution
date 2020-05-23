package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePermissions extends ClientValueObject {
  def clear(perm: PermissionKind): Unit
  def clearAll(): Unit
  def equals(perm: BasePermissions): Boolean
  def has(perm: PermissionKind): Boolean
  def hasPermissions(high: Double, low: Double): Boolean
  def set(perm: PermissionKind): Unit
}

object BasePermissions {
  @scala.inline
  def apply(
    clear: PermissionKind => Unit,
    clearAll: () => Unit,
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    equals: BasePermissions => Boolean,
    fromJson: js.Any => Unit,
    get_typeId: () => String,
    has: PermissionKind => Boolean,
    hasPermissions: (Double, Double) => Boolean,
    set: PermissionKind => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): BasePermissions = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), clearAll = js.Any.fromFunction0(clearAll), customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), equals = js.Any.fromFunction1(equals), fromJson = js.Any.fromFunction1(fromJson), get_typeId = js.Any.fromFunction0(get_typeId), has = js.Any.fromFunction1(has), hasPermissions = js.Any.fromFunction2(hasPermissions), set = js.Any.fromFunction1(set), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[BasePermissions]
  }
}

