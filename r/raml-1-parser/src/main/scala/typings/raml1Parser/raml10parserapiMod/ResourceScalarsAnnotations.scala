package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceScalarsAnnotations
  extends StObject
     with ResourceBaseScalarsAnnotations {
  
  /**
    * Resource.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
}
object ResourceScalarsAnnotations {
  
  inline def apply(
    description: () => js.Array[AnnotationRef],
    displayName: () => js.Array[AnnotationRef],
    is: () => js.Array[js.Array[AnnotationRef]],
    securedBy: () => js.Array[js.Array[AnnotationRef]],
    `type`: () => js.Array[AnnotationRef]
  ): ResourceScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description), displayName = js.Any.fromFunction0(displayName), is = js.Any.fromFunction0(is), securedBy = js.Any.fromFunction0(securedBy))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ResourceScalarsAnnotations]
  }
  
  extension [Self <: ResourceScalarsAnnotations](x: Self) {
    
    inline def setDisplayName(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "displayName", js.Any.fromFunction0(value))
  }
}
