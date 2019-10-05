package typings.sharepoint.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DataConvert")
@js.native
class DataConvert () extends js.Object

/* static members */
@JSGlobal("SP.DataConvert")
@js.native
object DataConvert extends js.Object {
  def createLocalDateTime(milliseconds: Double): Date = js.native
  def createUnspecifiedDateTime(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milliseconds: Double
  ): Date = js.native
  def createUtcDateTime(milliseconds: Double): Date = js.native
  def fixupType(context: ClientRuntimeContext, obj: js.Any): js.Any = js.native
  def fixupTypes(context: ClientRuntimeContext, dict: js.Any): Unit = js.native
  def getDateTimeKind(datetime: Date): DateTimeKind = js.native
  def invokeGetProperty(obj: js.Any, propName: String): js.Any = js.native
  def invokeSetProperty(obj: js.Any, propName: String, propValue: js.Any): Unit = js.native
  def populateArray(context: ClientRuntimeContext, dest: js.Any, jsonArrayFromServer: js.Any): Unit = js.native
  def populateDictionaryFromObject(dict: js.Any, parentNode: js.Any): Unit = js.native
  def specifyDateTimeKind(datetime: Date, kind: DateTimeKind): Unit = js.native
  def writeDictionaryToXml(
    writer: XmlWriter,
    dict: js.Any,
    topLevelElementTagName: String,
    keys: js.Any,
    serializationContext: SerializationContext
  ): Unit = js.native
  def writePropertiesToXml(
    writer: XmlWriter,
    obj: js.Any,
    propNames: js.Array[String],
    serializationContext: SerializationContext
  ): Unit = js.native
  def writeValueToXmlElement(writer: XmlWriter, objValue: js.Any, serializationContext: SerializationContext): Unit = js.native
}

