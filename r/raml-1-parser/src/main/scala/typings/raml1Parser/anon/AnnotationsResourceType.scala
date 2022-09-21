package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsResourceType extends StObject {
  
  var annotations: NameString
  
  var resourceType: Domain
}
object AnnotationsResourceType {
  
  inline def apply(annotations: NameString, resourceType: Domain): AnnotationsResourceType = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsResourceType]
  }
  
  extension [Self <: AnnotationsResourceType](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: Domain): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
