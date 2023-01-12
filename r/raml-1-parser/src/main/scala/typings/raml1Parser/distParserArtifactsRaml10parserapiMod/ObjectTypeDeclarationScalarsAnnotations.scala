package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeDeclarationScalarsAnnotations
  extends StObject
     with TypeDeclarationScalarsAnnotations {
  
  /**
    * ObjectTypeDeclaration.additionalProperties annotations
    **/
  def additionalProperties(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.discriminator annotations
    **/
  def discriminator(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.discriminatorValue annotations
    **/
  def discriminatorValue(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.enum annotations
    **/
  def `enum`(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ObjectTypeDeclaration.maxProperties annotations
    **/
  def maxProperties(): js.Array[AnnotationRef]
  
  /**
    * ObjectTypeDeclaration.minProperties annotations
    **/
  def minProperties(): js.Array[AnnotationRef]
}
object ObjectTypeDeclarationScalarsAnnotations {
  
  inline def apply(
    additionalProperties: () => js.Array[AnnotationRef],
    allowedTargets: () => js.Array[js.Array[AnnotationRef]],
    default: () => js.Array[AnnotationRef],
    description: () => js.Array[AnnotationRef],
    discriminator: () => js.Array[AnnotationRef],
    discriminatorValue: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    `enum`: () => js.Array[js.Array[AnnotationRef]],
    isAnnotation: () => js.Array[AnnotationRef],
    location: () => js.Array[AnnotationRef],
    locationKind: () => js.Array[AnnotationRef],
    maxProperties: () => js.Array[AnnotationRef],
    minProperties: () => js.Array[AnnotationRef],
    required: () => js.Array[AnnotationRef],
    schema: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[js.Array[AnnotationRef]]
  ): ObjectTypeDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(additionalProperties = js.Any.fromFunction0(additionalProperties), allowedTargets = js.Any.fromFunction0(allowedTargets), default = js.Any.fromFunction0(default), description = js.Any.fromFunction0(description), discriminator = js.Any.fromFunction0(discriminator), discriminatorValue = js.Any.fromFunction0(discriminatorValue), displayName = js.Any.fromFunction0(displayName), isAnnotation = js.Any.fromFunction0(isAnnotation), location = js.Any.fromFunction0(location), locationKind = js.Any.fromFunction0(locationKind), maxProperties = js.Any.fromFunction0(maxProperties), minProperties = js.Any.fromFunction0(minProperties), required = js.Any.fromFunction0(required), schema = js.Any.fromFunction0(schema))
    __obj.updateDynamic("enum")(js.Any.fromFunction0(`enum`))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ObjectTypeDeclarationScalarsAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeDeclarationScalarsAnnotations] (val x: Self) extends AnyVal {
    
    inline def setAdditionalProperties(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "additionalProperties", js.Any.fromFunction0(value))
    
    inline def setDiscriminator(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "discriminator", js.Any.fromFunction0(value))
    
    inline def setDiscriminatorValue(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "discriminatorValue", js.Any.fromFunction0(value))
    
    inline def setEnum(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "enum", js.Any.fromFunction0(value))
    
    inline def setMaxProperties(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "maxProperties", js.Any.fromFunction0(value))
    
    inline def setMinProperties(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "minProperties", js.Any.fromFunction0(value))
  }
}
