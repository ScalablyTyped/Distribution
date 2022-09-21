package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceBaseScalarsAnnotations extends StObject {
  
  /**
    * ResourceBase.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * ResourceBase.is annotations
    **/
  def is(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ResourceBase.securedBy annotations
    **/
  def securedBy(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * ResourceBase.type annotations
    **/
  def `type`(): js.Array[AnnotationRef]
}
object ResourceBaseScalarsAnnotations {
  
  inline def apply(
    description: () => js.Array[AnnotationRef],
    is: () => js.Array[js.Array[AnnotationRef]],
    securedBy: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[AnnotationRef]
  ): ResourceBaseScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), is = js.Any.fromFunction0(is), securedBy = js.Any.fromFunction0(securedBy))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ResourceBaseScalarsAnnotations]
  }
  
  extension [Self <: ResourceBaseScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
    
    inline def setIs(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "is", js.Any.fromFunction0(value))
    
    inline def setSecuredBy(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "securedBy", js.Any.fromFunction0(value))
    
    inline def setType(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
