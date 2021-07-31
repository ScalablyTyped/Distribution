package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragImpact extends StObject {
  
  var at: js.UndefOr[ImpactLocation] = js.undefined
  
  var displaced: DisplacementGroups
  
  var displacedBy: DisplacedBy
}
object DragImpact {
  
  @scala.inline
  def apply(displaced: DisplacementGroups, displacedBy: DisplacedBy): DragImpact = {
    val __obj = js.Dynamic.literal(displaced = displaced.asInstanceOf[js.Any], displacedBy = displacedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragImpact]
  }
  
  @scala.inline
  implicit class DragImpactMutableBuilder[Self <: DragImpact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAt(value: ImpactLocation): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    @scala.inline
    def setDisplaced(value: DisplacementGroups): Self = StObject.set(x, "displaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplacedBy(value: DisplacedBy): Self = StObject.set(x, "displacedBy", value.asInstanceOf[js.Any])
  }
}
