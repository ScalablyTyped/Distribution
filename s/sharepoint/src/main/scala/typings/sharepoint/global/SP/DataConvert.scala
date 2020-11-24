package typings.sharepoint.global.SP

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.DataConvert")
@js.native
class DataConvert ()
  extends typings.sharepoint.SP.DataConvert
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
  
  def fixupType(context: typings.sharepoint.SP.ClientRuntimeContext, obj: js.Any): js.Any = js.native
  
  def fixupTypes(context: typings.sharepoint.SP.ClientRuntimeContext, dict: js.Any): Unit = js.native
  
  def getDateTimeKind(datetime: Date): typings.sharepoint.SP.DateTimeKind = js.native
  
  def invokeGetProperty(obj: js.Any, propName: String): js.Any = js.native
  
  def invokeSetProperty(obj: js.Any, propName: String, propValue: js.Any): Unit = js.native
  
  def populateArray(context: typings.sharepoint.SP.ClientRuntimeContext, dest: js.Any, jsonArrayFromServer: js.Any): Unit = js.native
  
  def populateDictionaryFromObject(dict: js.Any, parentNode: js.Any): Unit = js.native
  
  def specifyDateTimeKind(datetime: Date, kind: typings.sharepoint.SP.DateTimeKind): Unit = js.native
  
  def writeDictionaryToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    dict: js.Any,
    topLevelElementTagName: String,
    keys: js.Any,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
  
  def writePropertiesToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    obj: js.Any,
    propNames: js.Array[String],
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
  
  def writeValueToXmlElement(
    writer: typings.sharepoint.SP.XmlWriter,
    objValue: js.Any,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
