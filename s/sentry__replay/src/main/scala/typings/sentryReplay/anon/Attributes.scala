package typings.sentryReplay.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: Record[String, Any]
  
  var id: Double
  
  var tagName: String
  
  var textContent: String
}
object Attributes {
  
  inline def apply(attributes: Record[String, Any], id: Double, tagName: String, textContent: String): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
  }
}
