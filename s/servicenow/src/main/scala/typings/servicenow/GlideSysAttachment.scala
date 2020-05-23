package typings.servicenow

import typings.servicenow.servicenow.GlideRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideSysAttachment extends js.Object {
  def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit
  def deleteAttachment(sysId: String): Unit
  def getContent(record: GlideRecord): js.Any
  def getContentBase64(record: GlideRecord): String
  def getContentStream(sysId: String): js.Object
  def write(record: GlideRecord, fileName: String, contentType: String, data: js.Any): String
  def writeBase64(record: GlideRecord, fileName: String, contentType: String, base64Content: String): String
  def writeContentStream(record: GlideRecord, fileName: String, contentType: String, inputStream: js.Object): String
}

object GlideSysAttachment {
  @scala.inline
  def apply(
    copy: (String, String, String, String) => Unit,
    deleteAttachment: String => Unit,
    getContent: GlideRecord => js.Any,
    getContentBase64: GlideRecord => String,
    getContentStream: String => js.Object,
    write: (GlideRecord, String, String, js.Any) => String,
    writeBase64: (GlideRecord, String, String, String) => String,
    writeContentStream: (GlideRecord, String, String, js.Object) => String
  ): GlideSysAttachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction4(copy), deleteAttachment = js.Any.fromFunction1(deleteAttachment), getContent = js.Any.fromFunction1(getContent), getContentBase64 = js.Any.fromFunction1(getContentBase64), getContentStream = js.Any.fromFunction1(getContentStream), write = js.Any.fromFunction4(write), writeBase64 = js.Any.fromFunction4(writeBase64), writeContentStream = js.Any.fromFunction4(writeContentStream))
    __obj.asInstanceOf[GlideSysAttachment]
  }
}

