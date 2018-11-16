package typings
package servicenowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlideSysAttachment")
@js.native
class GlideSysAttachment () extends js.Object {
  def copy(
    sourceTable: java.lang.String,
    sourceSysId: java.lang.String,
    destinationTable: java.lang.String,
    destinationSysId: java.lang.String
  ): scala.Unit = js.native
  def deleteAttachment(sysId: java.lang.String): scala.Unit = js.native
  def getContent(record: servicenowLib.servicenowNs.GlideRecord): js.Any = js.native
  def getContentBase64(record: servicenowLib.servicenowNs.GlideRecord): java.lang.String = js.native
  def getContentStream(sysId: java.lang.String): js.Object = js.native
  def write(
    record: servicenowLib.servicenowNs.GlideRecord,
    fileName: java.lang.String,
    contentType: java.lang.String,
    data: js.Any
  ): java.lang.String = js.native
  def writeBase64(
    record: servicenowLib.servicenowNs.GlideRecord,
    fileName: java.lang.String,
    contentType: java.lang.String,
    base64Content: java.lang.String
  ): java.lang.String = js.native
  def writeContentStream(
    record: servicenowLib.servicenowNs.GlideRecord,
    fileName: java.lang.String,
    contentType: java.lang.String,
    inputStream: js.Object
  ): java.lang.String = js.native
}

