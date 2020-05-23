package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BasePermissions")
@js.native
class BasePermissions ()
  extends typings.sharepoint.SP.BasePermissions {
  /* CompleteClass */
  override def clear(perm: typings.sharepoint.SP.PermissionKind): Unit = js.native
  /* CompleteClass */
  override def clearAll(): Unit = js.native
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  /* CompleteClass */
  override def equals(perm: typings.sharepoint.SP.BasePermissions): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def has(perm: typings.sharepoint.SP.PermissionKind): Boolean = js.native
  /* CompleteClass */
  override def hasPermissions(high: Double, low: Double): Boolean = js.native
  /* CompleteClass */
  override def set(perm: typings.sharepoint.SP.PermissionKind): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

