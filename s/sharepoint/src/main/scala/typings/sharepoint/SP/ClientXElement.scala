package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientXElement extends StObject {
  
  def get_element(): XElement = js.native
  
  def set_element(value: XElement): Unit = js.native
}
object ClientXElement {
  
  @scala.inline
  def apply(get_element: () => XElement, set_element: XElement => Unit): ClientXElement = {
    val __obj = js.Dynamic.literal(get_element = js.Any.fromFunction0(get_element), set_element = js.Any.fromFunction1(set_element))
    __obj.asInstanceOf[ClientXElement]
  }
  
  @scala.inline
  implicit class ClientXElementMutableBuilder[Self <: ClientXElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_element(value: () => XElement): Self = StObject.set(x, "get_element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_element(value: XElement => Unit): Self = StObject.set(x, "set_element", js.Any.fromFunction1(value))
  }
}
