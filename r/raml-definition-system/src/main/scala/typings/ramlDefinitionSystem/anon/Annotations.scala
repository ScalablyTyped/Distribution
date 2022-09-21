package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations extends StObject {
  
  var annotationTypes: NameString
  
  var annotations: NameString
  
  var resourceTypes: NameString
  
  var schemas: NameString
  
  var securitySchemes: NameString
  
  var traits: NameString
  
  var types: NameString
  
  var uses: NameString
}
object Annotations {
  
  inline def apply(
    annotationTypes: NameString,
    annotations: NameString,
    resourceTypes: NameString,
    schemas: NameString,
    securitySchemes: NameString,
    traits: NameString,
    types: NameString,
    uses: NameString
  ): Annotations = {
    val __obj = js.Dynamic.literal(annotationTypes = annotationTypes.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], resourceTypes = resourceTypes.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], securitySchemes = securitySchemes.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotations]
  }
  
  extension [Self <: Annotations](x: Self) {
    
    inline def setAnnotationTypes(value: NameString): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: NameString): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: NameString): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemes(value: NameString): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    inline def setTraits(value: NameString): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: NameString): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setUses(value: NameString): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
