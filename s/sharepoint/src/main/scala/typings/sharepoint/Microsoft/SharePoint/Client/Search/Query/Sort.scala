package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort
  extends StObject
     with ClientValueObject {
  
  def get_direction(): SortDirection
  
  def get_property(): String
  
  def set_direction(value: SortDirection): Unit
  
  def set_property(value: String): Unit
}
object Sort {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_direction: () => SortDirection,
    get_property: () => String,
    get_typeId: () => String,
    set_direction: SortDirection => Unit,
    set_property: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): Sort = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_direction = js.Any.fromFunction0(get_direction), get_property = js.Any.fromFunction0(get_property), get_typeId = js.Any.fromFunction0(get_typeId), set_direction = js.Any.fromFunction1(set_direction), set_property = js.Any.fromFunction1(set_property), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[Sort]
  }
  
  extension [Self <: Sort](x: Self) {
    
    inline def setGet_direction(value: () => SortDirection): Self = StObject.set(x, "get_direction", js.Any.fromFunction0(value))
    
    inline def setGet_property(value: () => String): Self = StObject.set(x, "get_property", js.Any.fromFunction0(value))
    
    inline def setSet_direction(value: SortDirection => Unit): Self = StObject.set(x, "set_direction", js.Any.fromFunction1(value))
    
    inline def setSet_property(value: String => Unit): Self = StObject.set(x, "set_property", js.Any.fromFunction1(value))
  }
}
