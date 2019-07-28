package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideSysAttachment")
@js.native
class GlideSysAttachment () extends js.Object {
  def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit = js.native
  def deleteAttachment(sysId: String): Unit = js.native
  def getContent(record: typings.servicenow.servicenowNs.GlideRecord): js.Any = js.native
  def getContentBase64(record: typings.servicenow.servicenowNs.GlideRecord): String = js.native
  def getContentStream(sysId: String): js.Object = js.native
  def write(
    record: typings.servicenow.servicenowNs.GlideRecord,
    fileName: String,
    contentType: String,
    data: js.Any
  ): String = js.native
  def writeBase64(
    record: typings.servicenow.servicenowNs.GlideRecord,
    fileName: String,
    contentType: String,
    base64Content: String
  ): String = js.native
  def writeContentStream(
    record: typings.servicenow.servicenowNs.GlideRecord,
    fileName: String,
    contentType: String,
    inputStream: js.Object
  ): String = js.native
}

