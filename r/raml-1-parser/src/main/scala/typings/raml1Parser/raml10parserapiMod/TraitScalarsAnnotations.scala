package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraitScalarsAnnotations
  extends StObject
     with MethodBaseScalarsAnnotations {
  
  /**
    * Trait.usage annotations
    **/
  def usage(): js.Array[AnnotationRef]
}
object TraitScalarsAnnotations {
  
  inline def apply(
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    is: () => js.Array[js.Array[AnnotationRef]],
    protocols: () => js.Array[js.Array[AnnotationRef]],
    securedBy: () => js.Array[js.Array[AnnotationRef]],
    usage: () => js.Array[AnnotationRef]
  ): TraitScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), is = js.Any.fromFunction0(is), protocols = js.Any.fromFunction0(protocols), securedBy = js.Any.fromFunction0(securedBy), usage = js.Any.fromFunction0(usage))
    __obj.asInstanceOf[TraitScalarsAnnotations]
  }
  
  extension [Self <: TraitScalarsAnnotations](x: Self) {
    
    inline def setUsage(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "usage", js.Any.fromFunction0(value))
  }
}
