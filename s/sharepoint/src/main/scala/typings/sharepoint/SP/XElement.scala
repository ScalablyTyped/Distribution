package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XElement extends StObject {
  
  def get_attributes(): Any
  
  def get_children(): Any
  
  def get_name(): String
  
  def set_attributes(value: Any): Unit
  
  def set_children(value: Any): Unit
  
  def set_name(value: String): Unit
}
object XElement {
  
  inline def apply(
    get_attributes: () => Any,
    get_children: () => Any,
    get_name: () => String,
    set_attributes: Any => Unit,
    set_children: Any => Unit,
    set_name: String => Unit
  ): XElement = {
    val __obj = js.Dynamic.literal(get_attributes = js.Any.fromFunction0(get_attributes), get_children = js.Any.fromFunction0(get_children), get_name = js.Any.fromFunction0(get_name), set_attributes = js.Any.fromFunction1(set_attributes), set_children = js.Any.fromFunction1(set_children), set_name = js.Any.fromFunction1(set_name))
    __obj.asInstanceOf[XElement]
  }
  
  extension [Self <: XElement](x: Self) {
    
    inline def setGet_attributes(value: () => Any): Self = StObject.set(x, "get_attributes", js.Any.fromFunction0(value))
    
    inline def setGet_children(value: () => Any): Self = StObject.set(x, "get_children", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setSet_attributes(value: Any => Unit): Self = StObject.set(x, "set_attributes", js.Any.fromFunction1(value))
    
    inline def setSet_children(value: Any => Unit): Self = StObject.set(x, "set_children", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => Unit): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
  }
}
