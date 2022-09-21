package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * ArrayTypeDeclaration.items annotations
    **/
  def items(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ArrayTypeDeclaration.maxItems annotations
    **/
  def maxItems(): js.Array[AnnotationRef]
  
  /**
    * ArrayTypeDeclaration.minItems annotations
    **/
  def minItems(): js.Array[AnnotationRef]
  
  /**
    * ArrayTypeDeclaration.uniqueItems annotations
    **/
  def uniqueItems(): js.Array[AnnotationRef]
}
object ArrayTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: () => js.Array[js.Array[AnnotationRef]],
    default: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    isAnnotation: () => js.Array[AnnotationRef],
    items: () => js.Array[js.Array[AnnotationRef]],
    location: () => js.Array[AnnotationRef],
    locationKind: () => js.Array[AnnotationRef],
    maxItems: () => js.Array[AnnotationRef],
    minItems: () => js.Array[AnnotationRef],
    required: () => js.Array[AnnotationRef],
    schema: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[js.Array[AnnotationRef]],
    uniqueItems: () => js.Array[AnnotationRef]
  ): ArrayTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = js.Any.fromFunction0(allowedTargets), default = js.Any.fromFunction0(default), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), isAnnotation = js.Any.fromFunction0(isAnnotation), items = js.Any.fromFunction0(items), location = js.Any.fromFunction0(location), locationKind = js.Any.fromFunction0(locationKind), maxItems = js.Any.fromFunction0(maxItems), minItems = js.Any.fromFunction0(minItems), required = js.Any.fromFunction0(required), schema = js.Any.fromFunction0(schema), uniqueItems = js.Any.fromFunction0(uniqueItems))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ArrayTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: ArrayTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setItems(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
    
    inline def setMaxItems(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "maxItems", js.Any.fromFunction0(value))
    
    inline def setMinItems(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "minItems", js.Any.fromFunction0(value))
    
    inline def setUniqueItems(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "uniqueItems", js.Any.fromFunction0(value))
  }
}
