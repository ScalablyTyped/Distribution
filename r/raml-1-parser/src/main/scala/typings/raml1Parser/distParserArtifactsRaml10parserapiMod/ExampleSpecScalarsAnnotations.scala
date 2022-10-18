package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleSpecScalarsAnnotations extends StObject {
  
  /**
    * ExampleSpec.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * ExampleSpec.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * ExampleSpec.strict annotations
    **/
  def strict(): js.Array[AnnotationRef]
}
object ExampleSpecScalarsAnnotations {
  
  inline def apply(
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    strict: () => js.Array[AnnotationRef]
  ): ExampleSpecScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), strict = js.Any.fromFunction0(strict))
    __obj.asInstanceOf[ExampleSpecScalarsAnnotations]
  }
  
  extension [Self <: ExampleSpecScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
    
    inline def setDisplayName(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
    
    inline def setStrict(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "strict", js.Any.fromFunction0(value))
  }
}
