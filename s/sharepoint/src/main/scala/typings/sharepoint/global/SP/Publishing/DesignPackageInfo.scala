package typings.sharepoint.global.SP.Publishing

import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.DesignPackageInfo")
@js.native
class DesignPackageInfo ()
  extends typings.sharepoint.SP.Publishing.DesignPackageInfo {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_majorVersion(): Double = js.native
  /* CompleteClass */
  override def get_minorVersion(): Double = js.native
  /* CompleteClass */
  override def get_packageGuid(): Guid = js.native
  /* CompleteClass */
  override def get_packageName(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_majorVersion(value: Double): Double = js.native
  /* CompleteClass */
  override def set_minorVersion(value: Double): Double = js.native
  /* CompleteClass */
  override def set_packageGuid(value: Guid): Guid = js.native
  /* CompleteClass */
  override def set_packageName(value: String): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

