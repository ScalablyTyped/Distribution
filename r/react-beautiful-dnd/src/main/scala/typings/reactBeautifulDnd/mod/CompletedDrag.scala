package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedDrag extends StObject {
  
  var afterCritical: LiftEffect = js.native
  
  var critical: Critical = js.native
  
  var impact: DragImpact = js.native
  
  var result: DropResult = js.native
}
object CompletedDrag {
  
  @scala.inline
  def apply(afterCritical: LiftEffect, critical: Critical, impact: DragImpact, result: DropResult): CompletedDrag = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedDrag]
  }
  
  @scala.inline
  implicit class CompletedDragMutableBuilder[Self <: CompletedDrag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCritical(value: LiftEffect): Self = StObject.set(x, "afterCritical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: Critical): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpact(value: DragImpact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: DropResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
