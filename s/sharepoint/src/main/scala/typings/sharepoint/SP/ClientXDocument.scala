package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientXDocument extends StObject {
  
  def get_root(): XElement
  
  def set_root(value: XElement): Unit
}
object ClientXDocument {
  
  inline def apply(get_root: () => XElement, set_root: XElement => Unit): ClientXDocument = {
    val __obj = js.Dynamic.literal(get_root = js.Any.fromFunction0(get_root), set_root = js.Any.fromFunction1(set_root))
    __obj.asInstanceOf[ClientXDocument]
  }
  
  extension [Self <: ClientXDocument](x: Self) {
    
    inline def setGet_root(value: () => XElement): Self = StObject.set(x, "get_root", js.Any.fromFunction0(value))
    
    inline def setSet_root(value: XElement => Unit): Self = StObject.set(x, "set_root", js.Any.fromFunction1(value))
  }
}
