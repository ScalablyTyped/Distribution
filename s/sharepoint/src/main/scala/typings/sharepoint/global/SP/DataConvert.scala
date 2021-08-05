package typings.sharepoint.global.SP

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.DataConvert")
@js.native
class DataConvert ()
  extends StObject
     with typings.sharepoint.SP.DataConvert
object DataConvert {
  
  @JSGlobal("SP.DataConvert")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createLocalDateTime(milliseconds: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalDateTime")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  /* static member */
  inline def createUnspecifiedDateTime(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milliseconds: Double
  ): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnspecifiedDateTime")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  /* static member */
  inline def createUtcDateTime(milliseconds: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("createUtcDateTime")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  /* static member */
  inline def fixupType(context: typings.sharepoint.SP.ClientRuntimeContext, obj: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fixupType")(context.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def fixupTypes(context: typings.sharepoint.SP.ClientRuntimeContext, dict: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixupTypes")(context.asInstanceOf[js.Any], dict.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def getDateTimeKind(datetime: Date): typings.sharepoint.SP.DateTimeKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTimeKind")(datetime.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.DateTimeKind]
  
  /* static member */
  inline def invokeGetProperty(obj: js.Any, propName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeGetProperty")(obj.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def invokeSetProperty(obj: js.Any, propName: String, propValue: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeSetProperty")(obj.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], propValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def populateArray(context: typings.sharepoint.SP.ClientRuntimeContext, dest: js.Any, jsonArrayFromServer: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("populateArray")(context.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], jsonArrayFromServer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def populateDictionaryFromObject(dict: js.Any, parentNode: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("populateDictionaryFromObject")(dict.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def specifyDateTimeKind(datetime: Date, kind: typings.sharepoint.SP.DateTimeKind): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("specifyDateTimeKind")(datetime.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def writeDictionaryToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    dict: js.Any,
    topLevelElementTagName: String,
    keys: js.Any,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDictionaryToXml")(writer.asInstanceOf[js.Any], dict.asInstanceOf[js.Any], topLevelElementTagName.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], serializationContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def writePropertiesToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    obj: js.Any,
    propNames: js.Array[String],
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePropertiesToXml")(writer.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any], serializationContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def writeValueToXmlElement(
    writer: typings.sharepoint.SP.XmlWriter,
    objValue: js.Any,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeValueToXmlElement")(writer.asInstanceOf[js.Any], objValue.asInstanceOf[js.Any], serializationContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
