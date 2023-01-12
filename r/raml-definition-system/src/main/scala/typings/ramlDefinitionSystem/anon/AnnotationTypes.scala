package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationTypes extends StObject {
  
  var annotationTypes: NameString
  
  var annotations: NameString
  
  var name: NameString
  
  var resourceTypes: NameString
  
  var schemas: NameString
  
  var securitySchemes: NameString
  
  var traits: NameString
  
  var types: NameString
  
  var usage: NameString
  
  var uses: NameString
}
object AnnotationTypes {
  
  inline def apply(
    annotationTypes: NameString,
    annotations: NameString,
    name: NameString,
    resourceTypes: NameString,
    schemas: NameString,
    securitySchemes: NameString,
    traits: NameString,
    types: NameString,
    usage: NameString,
    uses: NameString
  ): AnnotationTypes = {
    val __obj = js.Dynamic.literal(annotationTypes = annotationTypes.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceTypes = resourceTypes.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], securitySchemes = securitySchemes.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationTypes] (val x: Self) extends AnyVal {
    
    inline def setAnnotationTypes(value: NameString): Self = StObject.set(x, "annotationTypes", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResourceTypes(value: NameString): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSchemas(value: NameString): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemes(value: NameString): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    inline def setTraits(value: NameString): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: NameString): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: NameString): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUses(value: NameString): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
