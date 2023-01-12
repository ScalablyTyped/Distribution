package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsName extends StObject {
  
  var annotations: NameString
  
  var name: Domain
  
  var structuredValue: Domain
}
object AnnotationsName {
  
  inline def apply(annotations: NameString, name: Domain, structuredValue: Domain): AnnotationsName = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structuredValue = structuredValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationsName] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStructuredValue(value: Domain): Self = StObject.set(x, "structuredValue", value.asInstanceOf[js.Any])
  }
}
