package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDeclarationScalarsAnnotations extends StObject {
  
  /**
    * TypeDeclaration.default annotations
    **/
  def default(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.allowedTargets annotations
    **/
  def allowedTargets(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * TypeDeclaration.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.isAnnotation annotations
    **/
  def isAnnotation(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.location annotations
    **/
  def location(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.locationKind annotations
    **/
  def locationKind(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.required annotations
    **/
  def required(): js.Array[AnnotationRef]
  
  /**
    * TypeDeclaration.schema annotations
    **/
  def schema(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * TypeDeclaration.type annotations
    **/
  def `type`(): js.Array[js.Array[AnnotationRef]]
}
object TypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: () => js.Array[js.Array[AnnotationRef]],
    default: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    isAnnotation: () => js.Array[AnnotationRef],
    location: () => js.Array[AnnotationRef],
    locationKind: () => js.Array[AnnotationRef],
    required: () => js.Array[AnnotationRef],
    schema: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[js.Array[AnnotationRef]]
  ): TypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = js.Any.fromFunction0(allowedTargets), default = js.Any.fromFunction0(default), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), isAnnotation = js.Any.fromFunction0(isAnnotation), location = js.Any.fromFunction0(location), locationKind = js.Any.fromFunction0(locationKind), required = js.Any.fromFunction0(required), schema = js.Any.fromFunction0(schema))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[TypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: TypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setAllowedTargets(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "allowedTargets", js.Any.fromFunction0(value))
    
    inline def setDefault(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "default", js.Any.fromFunction0(value))
    
    inline def setDescription(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
    
    inline def setDisplayName(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
    
    inline def setIsAnnotation(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "isAnnotation", js.Any.fromFunction0(value))
    
    inline def setLocation(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "location", js.Any.fromFunction0(value))
    
    inline def setLocationKind(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "locationKind", js.Any.fromFunction0(value))
    
    inline def setRequired(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "required", js.Any.fromFunction0(value))
    
    inline def setSchema(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "schema", js.Any.fromFunction0(value))
    
    inline def setType(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
