package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * NumberTypeDeclaration.enum annotations
    **/
  def `enum`(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * NumberTypeDeclaration.format annotations
    **/
  def format(): js.Array[AnnotationRef]
  
  /**
    * NumberTypeDeclaration.maximum annotations
    **/
  def maximum(): js.Array[AnnotationRef]
  
  /**
    * NumberTypeDeclaration.minimum annotations
    **/
  def minimum(): js.Array[AnnotationRef]
  
  /**
    * NumberTypeDeclaration.multipleOf annotations
    **/
  def multipleOf(): js.Array[AnnotationRef]
}
object NumberTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: () => js.Array[js.Array[AnnotationRef]],
    default: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    `enum`: () => js.Array[js.Array[AnnotationRef]],
    format: () => js.Array[AnnotationRef],
    isAnnotation: () => js.Array[AnnotationRef],
    location: () => js.Array[AnnotationRef],
    locationKind: () => js.Array[AnnotationRef],
    maximum: () => js.Array[AnnotationRef],
    minimum: () => js.Array[AnnotationRef],
    multipleOf: () => js.Array[AnnotationRef],
    required: () => js.Array[AnnotationRef],
    schema: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[js.Array[AnnotationRef]]
  ): NumberTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = js.Any.fromFunction0(allowedTargets), default = js.Any.fromFunction0(default), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), format = js.Any.fromFunction0(format), isAnnotation = js.Any.fromFunction0(isAnnotation), location = js.Any.fromFunction0(location), locationKind = js.Any.fromFunction0(locationKind), maximum = js.Any.fromFunction0(maximum), minimum = js.Any.fromFunction0(minimum), multipleOf = js.Any.fromFunction0(multipleOf), required = js.Any.fromFunction0(required), schema = js.Any.fromFunction0(schema))
    __obj.updateDynamic("enum")(js.Any.fromFunction0(`enum`))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[NumberTypeDeclarationScalarsAnnotations]
  }
  
  extension [Self <: NumberTypeDeclarationScalarsAnnotations](x: Self) {
    
    inline def setEnum(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "enum", js.Any.fromFunction0(value))
    
    inline def setFormat(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
    
    inline def setMaximum(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "maximum", js.Any.fromFunction0(value))
    
    inline def setMinimum(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "minimum", js.Any.fromFunction0(value))
    
    inline def setMultipleOf(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "multipleOf", js.Any.fromFunction0(value))
  }
}
