package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppLicenseCollection")
@js.native
class AppLicenseCollection ()
  extends typings.sharepoint.SP.AppLicenseCollection {
  /* CompleteClass */
  override def add(item: typings.sharepoint.SP.AppLicense): Unit = js.native
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[typings.sharepoint.SP.AppLicense] = js.native
  /* CompleteClass */
  override def get_count(): Double = js.native
  /* CompleteClass */
  override def get_item(index: Double): typings.sharepoint.SP.AppLicense = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

