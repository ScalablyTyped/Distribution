package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XElement extends StObject {
  
  def get_attributes(): js.Any
  
  def get_children(): js.Any
  
  def get_name(): String
  
  def set_attributes(value: js.Any): Unit
  
  def set_children(value: js.Any): Unit
  
  def set_name(value: String): Unit
}
object XElement {
  
  @scala.inline
  def apply(
    get_attributes: () => js.Any,
    get_children: () => js.Any,
    get_name: () => String,
    set_attributes: js.Any => Unit,
    set_children: js.Any => Unit,
    set_name: String => Unit
  ): XElement = {
    val __obj = js.Dynamic.literal(get_attributes = js.Any.fromFunction0(get_attributes), get_children = js.Any.fromFunction0(get_children), get_name = js.Any.fromFunction0(get_name), set_attributes = js.Any.fromFunction1(set_attributes), set_children = js.Any.fromFunction1(set_children), set_name = js.Any.fromFunction1(set_name))
    __obj.asInstanceOf[XElement]
  }
  
  @scala.inline
  implicit class XElementMutableBuilder[Self <: XElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_attributes(value: () => js.Any): Self = StObject.set(x, "get_attributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_children(value: () => js.Any): Self = StObject.set(x, "get_children", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_attributes(value: js.Any => Unit): Self = StObject.set(x, "set_attributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_children(value: js.Any => Unit): Self = StObject.set(x, "set_children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_name(value: String => Unit): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
  }
}
