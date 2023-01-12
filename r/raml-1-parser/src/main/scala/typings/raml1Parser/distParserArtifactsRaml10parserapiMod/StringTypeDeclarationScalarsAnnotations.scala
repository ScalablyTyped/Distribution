package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * StringTypeDeclaration.enum annotations
    **/
  def `enum`(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * StringTypeDeclaration.maxLength annotations
    **/
  def maxLength(): js.Array[AnnotationRef]
  
  /**
    * StringTypeDeclaration.minLength annotations
    **/
  def minLength(): js.Array[AnnotationRef]
  
  /**
    * StringTypeDeclaration.pattern annotations
    **/
  def pattern(): js.Array[AnnotationRef]
}
object StringTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    allowedTargets: () => js.Array[js.Array[AnnotationRef]],
    default: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    `enum`: () => js.Array[js.Array[AnnotationRef]],
    isAnnotation: () => js.Array[AnnotationRef],
    location: () => js.Array[AnnotationRef],
    locationKind: () => js.Array[AnnotationRef],
    maxLength: () => js.Array[AnnotationRef],
    minLength: () => js.Array[AnnotationRef],
    pattern: () => js.Array[AnnotationRef],
    required: () => js.Array[AnnotationRef],
    schema: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[js.Array[AnnotationRef]]
  ): StringTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(allowedTargets = js.Any.fromFunction0(allowedTargets), default = js.Any.fromFunction0(default), description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), isAnnotation = js.Any.fromFunction0(isAnnotation), location = js.Any.fromFunction0(location), locationKind = js.Any.fromFunction0(locationKind), maxLength = js.Any.fromFunction0(maxLength), minLength = js.Any.fromFunction0(minLength), pattern = js.Any.fromFunction0(pattern), required = js.Any.fromFunction0(required), schema = js.Any.fromFunction0(schema))
    __obj.updateDynamic("enum")(js.Any.fromFunction0(`enum`))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[StringTypeDeclarationScalarsAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringTypeDeclarationScalarsAnnotations] (val x: Self) extends AnyVal {
    
    inline def setEnum(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "enum", js.Any.fromFunction0(value))
    
    inline def setMaxLength(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "maxLength", js.Any.fromFunction0(value))
    
    inline def setMinLength(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "minLength", js.Any.fromFunction0(value))
    
    inline def setPattern(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "pattern", js.Any.fromFunction0(value))
  }
}
