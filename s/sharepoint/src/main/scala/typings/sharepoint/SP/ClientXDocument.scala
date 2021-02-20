package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientXDocument extends StObject {
  
  def get_root(): XElement = js.native
  
  def set_root(value: XElement): Unit = js.native
}
object ClientXDocument {
  
  @scala.inline
  def apply(get_root: () => XElement, set_root: XElement => Unit): ClientXDocument = {
    val __obj = js.Dynamic.literal(get_root = js.Any.fromFunction0(get_root), set_root = js.Any.fromFunction1(set_root))
    __obj.asInstanceOf[ClientXDocument]
  }
  
  @scala.inline
  implicit class ClientXDocumentMutableBuilder[Self <: ClientXDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_root(value: () => XElement): Self = StObject.set(x, "get_root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_root(value: XElement => Unit): Self = StObject.set(x, "set_root", js.Any.fromFunction1(value))
  }
}
