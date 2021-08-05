package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeLogItemQuery
  extends StObject
     with ClientValueObject {
  
  def get_changeToken(): String
  
  def get_contains(): String
  
  def get_query(): String
  
  def get_queryOptions(): String
  
  def get_rowLimit(): String
  
  def get_viewFields(): String
  
  def get_viewName(): String
  
  def set_changeToken(value: String): Unit
  
  def set_contains(value: String): Unit
  
  def set_query(value: String): Unit
  
  def set_queryOptions(value: String): Unit
  
  def set_rowLimit(value: String): Unit
  
  def set_viewFields(value: String): Unit
  
  def set_viewName(value: String): Unit
}
object ChangeLogItemQuery {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_changeToken: () => String,
    get_contains: () => String,
    get_query: () => String,
    get_queryOptions: () => String,
    get_rowLimit: () => String,
    get_typeId: () => String,
    get_viewFields: () => String,
    get_viewName: () => String,
    set_changeToken: String => Unit,
    set_contains: String => Unit,
    set_query: String => Unit,
    set_queryOptions: String => Unit,
    set_rowLimit: String => Unit,
    set_viewFields: String => Unit,
    set_viewName: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ChangeLogItemQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_changeToken = js.Any.fromFunction0(get_changeToken), get_contains = js.Any.fromFunction0(get_contains), get_query = js.Any.fromFunction0(get_query), get_queryOptions = js.Any.fromFunction0(get_queryOptions), get_rowLimit = js.Any.fromFunction0(get_rowLimit), get_typeId = js.Any.fromFunction0(get_typeId), get_viewFields = js.Any.fromFunction0(get_viewFields), get_viewName = js.Any.fromFunction0(get_viewName), set_changeToken = js.Any.fromFunction1(set_changeToken), set_contains = js.Any.fromFunction1(set_contains), set_query = js.Any.fromFunction1(set_query), set_queryOptions = js.Any.fromFunction1(set_queryOptions), set_rowLimit = js.Any.fromFunction1(set_rowLimit), set_viewFields = js.Any.fromFunction1(set_viewFields), set_viewName = js.Any.fromFunction1(set_viewName), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ChangeLogItemQuery]
  }
  
  extension [Self <: ChangeLogItemQuery](x: Self) {
    
    inline def setGet_changeToken(value: () => String): Self = StObject.set(x, "get_changeToken", js.Any.fromFunction0(value))
    
    inline def setGet_contains(value: () => String): Self = StObject.set(x, "get_contains", js.Any.fromFunction0(value))
    
    inline def setGet_query(value: () => String): Self = StObject.set(x, "get_query", js.Any.fromFunction0(value))
    
    inline def setGet_queryOptions(value: () => String): Self = StObject.set(x, "get_queryOptions", js.Any.fromFunction0(value))
    
    inline def setGet_rowLimit(value: () => String): Self = StObject.set(x, "get_rowLimit", js.Any.fromFunction0(value))
    
    inline def setGet_viewFields(value: () => String): Self = StObject.set(x, "get_viewFields", js.Any.fromFunction0(value))
    
    inline def setGet_viewName(value: () => String): Self = StObject.set(x, "get_viewName", js.Any.fromFunction0(value))
    
    inline def setSet_changeToken(value: String => Unit): Self = StObject.set(x, "set_changeToken", js.Any.fromFunction1(value))
    
    inline def setSet_contains(value: String => Unit): Self = StObject.set(x, "set_contains", js.Any.fromFunction1(value))
    
    inline def setSet_query(value: String => Unit): Self = StObject.set(x, "set_query", js.Any.fromFunction1(value))
    
    inline def setSet_queryOptions(value: String => Unit): Self = StObject.set(x, "set_queryOptions", js.Any.fromFunction1(value))
    
    inline def setSet_rowLimit(value: String => Unit): Self = StObject.set(x, "set_rowLimit", js.Any.fromFunction1(value))
    
    inline def setSet_viewFields(value: String => Unit): Self = StObject.set(x, "set_viewFields", js.Any.fromFunction1(value))
    
    inline def setSet_viewName(value: String => Unit): Self = StObject.set(x, "set_viewName", js.Any.fromFunction1(value))
  }
}
