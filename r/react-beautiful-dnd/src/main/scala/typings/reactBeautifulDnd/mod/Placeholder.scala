package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder extends StObject {
  
  var client: BoxModel
  
  var display: String
  
  var tagName: String
}
object Placeholder {
  
  inline def apply(client: BoxModel, display: String, tagName: String): Placeholder = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
    
    inline def setClient(value: BoxModel): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
