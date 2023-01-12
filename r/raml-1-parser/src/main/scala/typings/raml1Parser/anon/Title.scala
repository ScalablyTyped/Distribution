package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var annotations: NameString
  
  var content: NameString
  
  var title: NameString
}
object Title {
  
  inline def apply(annotations: NameString, content: NameString, title: NameString): Title = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setContent(value: NameString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: NameString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
