package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.IEnumerator
import typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
import typings.sharepoint.SP.ClientValueObjectCollection
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultTableCollection
  extends StObject
     with ClientValueObjectCollection[ResultTable] {
  
  def get_elapsedTime(): Double
  
  def get_item(index: Double): ResultTable
  
  def get_properties(): StringDictionary[Any]
  
  def get_queryErrors(): StringDictionary[ControlMessage]
  
  def get_queryId(): String
  
  def get_spellingSuggestion(): String
  
  def get_triggeredRules(): js.Array[Guid]
  
  def initPropertiesFromJson(parentNode: Any): Unit
  
  def set_elapsedTime(value: Double): Unit
}
object ResultTableCollection {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    getEnumerator: () => IEnumerator[ResultTable],
    get_count: () => Double,
    get_elapsedTime: () => Double,
    get_item: Double => ResultTable,
    get_properties: () => StringDictionary[Any],
    get_queryErrors: () => StringDictionary[ControlMessage],
    get_queryId: () => String,
    get_spellingSuggestion: () => String,
    get_triggeredRules: () => js.Array[Guid],
    get_typeId: () => String,
    initPropertiesFromJson: Any => Unit,
    set_elapsedTime: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ResultTableCollection = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), get_elapsedTime = js.Any.fromFunction0(get_elapsedTime), get_item = js.Any.fromFunction1(get_item), get_properties = js.Any.fromFunction0(get_properties), get_queryErrors = js.Any.fromFunction0(get_queryErrors), get_queryId = js.Any.fromFunction0(get_queryId), get_spellingSuggestion = js.Any.fromFunction0(get_spellingSuggestion), get_triggeredRules = js.Any.fromFunction0(get_triggeredRules), get_typeId = js.Any.fromFunction0(get_typeId), initPropertiesFromJson = js.Any.fromFunction1(initPropertiesFromJson), set_elapsedTime = js.Any.fromFunction1(set_elapsedTime), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ResultTableCollection]
  }
  
  extension [Self <: ResultTableCollection](x: Self) {
    
    inline def setGet_elapsedTime(value: () => Double): Self = StObject.set(x, "get_elapsedTime", js.Any.fromFunction0(value))
    
    inline def setGet_item(value: Double => ResultTable): Self = StObject.set(x, "get_item", js.Any.fromFunction1(value))
    
    inline def setGet_properties(value: () => StringDictionary[Any]): Self = StObject.set(x, "get_properties", js.Any.fromFunction0(value))
    
    inline def setGet_queryErrors(value: () => StringDictionary[ControlMessage]): Self = StObject.set(x, "get_queryErrors", js.Any.fromFunction0(value))
    
    inline def setGet_queryId(value: () => String): Self = StObject.set(x, "get_queryId", js.Any.fromFunction0(value))
    
    inline def setGet_spellingSuggestion(value: () => String): Self = StObject.set(x, "get_spellingSuggestion", js.Any.fromFunction0(value))
    
    inline def setGet_triggeredRules(value: () => js.Array[Guid]): Self = StObject.set(x, "get_triggeredRules", js.Any.fromFunction0(value))
    
    inline def setInitPropertiesFromJson(value: Any => Unit): Self = StObject.set(x, "initPropertiesFromJson", js.Any.fromFunction1(value))
    
    inline def setSet_elapsedTime(value: Double => Unit): Self = StObject.set(x, "set_elapsedTime", js.Any.fromFunction1(value))
  }
}
