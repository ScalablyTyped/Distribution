package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DataConvert")
@js.native
class DataConvert () extends js.Object

@JSGlobal("SP.DataConvert")
@js.native
object DataConvert extends js.Object {
  def createLocalDateTime(milliseconds: scala.Double): stdLib.Date = js.native
  def createUnspecifiedDateTime(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double,
    milliseconds: scala.Double
  ): stdLib.Date = js.native
  def createUtcDateTime(milliseconds: scala.Double): stdLib.Date = js.native
  def fixupType(context: sharepointLib.SPNs.ClientRuntimeContext, obj: js.Any): js.Any = js.native
  def fixupTypes(context: sharepointLib.SPNs.ClientRuntimeContext, dict: js.Any): scala.Unit = js.native
  def getDateTimeKind(datetime: stdLib.Date): sharepointLib.SPNs.DateTimeKind = js.native
  def invokeGetProperty(obj: js.Any, propName: java.lang.String): js.Any = js.native
  def invokeSetProperty(obj: js.Any, propName: java.lang.String, propValue: js.Any): scala.Unit = js.native
  def populateArray(context: sharepointLib.SPNs.ClientRuntimeContext, dest: js.Any, jsonArrayFromServer: js.Any): scala.Unit = js.native
  def populateDictionaryFromObject(dict: js.Any, parentNode: js.Any): scala.Unit = js.native
  def specifyDateTimeKind(datetime: stdLib.Date, kind: sharepointLib.SPNs.DateTimeKind): scala.Unit = js.native
  def writeDictionaryToXml(
    writer: sharepointLib.SPNs.XmlWriter,
    dict: js.Any,
    topLevelElementTagName: java.lang.String,
    keys: js.Any,
    serializationContext: sharepointLib.SPNs.SerializationContext
  ): scala.Unit = js.native
  def writePropertiesToXml(
    writer: sharepointLib.SPNs.XmlWriter,
    obj: js.Any,
    propNames: js.Array[java.lang.String],
    serializationContext: sharepointLib.SPNs.SerializationContext
  ): scala.Unit = js.native
  def writeValueToXmlElement(
    writer: sharepointLib.SPNs.XmlWriter,
    objValue: js.Any,
    serializationContext: sharepointLib.SPNs.SerializationContext
  ): scala.Unit = js.native
}

