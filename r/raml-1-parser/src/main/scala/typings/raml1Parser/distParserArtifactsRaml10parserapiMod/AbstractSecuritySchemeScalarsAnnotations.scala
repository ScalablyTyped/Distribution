package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractSecuritySchemeScalarsAnnotations extends StObject {
  
  /**
    * AbstractSecurityScheme.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * AbstractSecurityScheme.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * AbstractSecurityScheme.type annotations
    **/
  def `type`(): js.Array[AnnotationRef]
}
object AbstractSecuritySchemeScalarsAnnotations {
  
  inline def apply(
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    `type`: () => js.Array[AnnotationRef]
  ): AbstractSecuritySchemeScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[AbstractSecuritySchemeScalarsAnnotations]
  }
  
  extension [Self <: AbstractSecuritySchemeScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
    
    inline def setDisplayName(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
    
    inline def setType(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
