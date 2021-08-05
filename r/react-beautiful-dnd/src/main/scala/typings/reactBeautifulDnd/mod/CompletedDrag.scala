package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedDrag extends StObject {
  
  var afterCritical: LiftEffect
  
  var critical: Critical
  
  var impact: DragImpact
  
  var result: DropResult
}
object CompletedDrag {
  
  inline def apply(afterCritical: LiftEffect, critical: Critical, impact: DragImpact, result: DropResult): CompletedDrag = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedDrag]
  }
  
  extension [Self <: CompletedDrag](x: Self) {
    
    inline def setAfterCritical(value: LiftEffect): Self = StObject.set(x, "afterCritical", value.asInstanceOf[js.Any])
    
    inline def setCritical(value: Critical): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setImpact(value: DragImpact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setResult(value: DropResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
