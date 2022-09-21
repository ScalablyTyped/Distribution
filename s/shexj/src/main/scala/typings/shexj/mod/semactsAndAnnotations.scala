package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait semactsAndAnnotations extends StObject {
  
  // +;
  /**
    * List of {@link SemAct#predicate}/{@link SemAct#object} annotations.
    */
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * List of semantic actions to be executed when evaluating conformance.
    */
  var semActs: js.UndefOr[js.Array[SemAct]] = js.undefined
}
object semactsAndAnnotations {
  
  inline def apply(): semactsAndAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[semactsAndAnnotations]
  }
  
  extension [Self <: semactsAndAnnotations](x: Self) {
    
    inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setSemActs(value: js.Array[SemAct]): Self = StObject.set(x, "semActs", value.asInstanceOf[js.Any])
    
    inline def setSemActsUndefined: Self = StObject.set(x, "semActs", js.undefined)
    
    inline def setSemActsVarargs(value: SemAct*): Self = StObject.set(x, "semActs", js.Array(value*))
  }
}
