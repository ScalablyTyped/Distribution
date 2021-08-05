package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationNodeCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_asLastNode(): Boolean
  
  def get_isExternal(): Boolean
  
  def get_previousNode(): NavigationNode
  
  def get_title(): String
  
  def get_url(): String
  
  def set_asLastNode(value: Boolean): Unit
  
  def set_isExternal(value: Boolean): Unit
  
  def set_previousNode(value: NavigationNode): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
}
object NavigationNodeCreationInformation {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_asLastNode: () => Boolean,
    get_isExternal: () => Boolean,
    get_previousNode: () => NavigationNode,
    get_title: () => String,
    get_typeId: () => String,
    get_url: () => String,
    set_asLastNode: Boolean => Unit,
    set_isExternal: Boolean => Unit,
    set_previousNode: NavigationNode => Unit,
    set_title: String => Unit,
    set_url: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): NavigationNodeCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_asLastNode = js.Any.fromFunction0(get_asLastNode), get_isExternal = js.Any.fromFunction0(get_isExternal), get_previousNode = js.Any.fromFunction0(get_previousNode), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), set_asLastNode = js.Any.fromFunction1(set_asLastNode), set_isExternal = js.Any.fromFunction1(set_isExternal), set_previousNode = js.Any.fromFunction1(set_previousNode), set_title = js.Any.fromFunction1(set_title), set_url = js.Any.fromFunction1(set_url), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[NavigationNodeCreationInformation]
  }
  
  extension [Self <: NavigationNodeCreationInformation](x: Self) {
    
    inline def setGet_asLastNode(value: () => Boolean): Self = StObject.set(x, "get_asLastNode", js.Any.fromFunction0(value))
    
    inline def setGet_isExternal(value: () => Boolean): Self = StObject.set(x, "get_isExternal", js.Any.fromFunction0(value))
    
    inline def setGet_previousNode(value: () => NavigationNode): Self = StObject.set(x, "get_previousNode", js.Any.fromFunction0(value))
    
    inline def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
    
    inline def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    inline def setSet_asLastNode(value: Boolean => Unit): Self = StObject.set(x, "set_asLastNode", js.Any.fromFunction1(value))
    
    inline def setSet_isExternal(value: Boolean => Unit): Self = StObject.set(x, "set_isExternal", js.Any.fromFunction1(value))
    
    inline def setSet_previousNode(value: NavigationNode => Unit): Self = StObject.set(x, "set_previousNode", js.Any.fromFunction1(value))
    
    inline def setSet_title(value: String => Unit): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    
    inline def setSet_url(value: String => Unit): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
  }
}
