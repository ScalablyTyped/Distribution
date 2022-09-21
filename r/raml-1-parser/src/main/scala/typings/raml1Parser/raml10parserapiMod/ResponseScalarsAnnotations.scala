package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseScalarsAnnotations extends StObject {
  
  /**
    * Response.description annotations
    **/
  def description(): js.Array[AnnotationRef]
}
object ResponseScalarsAnnotations {
  
  inline def apply(description: () => js.Array[AnnotationRef]): ResponseScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = js.Any.fromFunction0(description))
    __obj.asInstanceOf[ResponseScalarsAnnotations]
  }
  
  extension [Self <: ResponseScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "description", js.Any.fromFunction0(value))
  }
}
