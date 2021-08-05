package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiftEffect extends StObject {
  
  var displacedBy: DisplacedBy
  
  var effected: DraggableIdMap
  
  var inVirtualList: Boolean
}
object LiftEffect {
  
  inline def apply(displacedBy: DisplacedBy, effected: DraggableIdMap, inVirtualList: Boolean): LiftEffect = {
    val __obj = js.Dynamic.literal(displacedBy = displacedBy.asInstanceOf[js.Any], effected = effected.asInstanceOf[js.Any], inVirtualList = inVirtualList.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiftEffect]
  }
  
  extension [Self <: LiftEffect](x: Self) {
    
    inline def setDisplacedBy(value: DisplacedBy): Self = StObject.set(x, "displacedBy", value.asInstanceOf[js.Any])
    
    inline def setEffected(value: DraggableIdMap): Self = StObject.set(x, "effected", value.asInstanceOf[js.Any])
    
    inline def setInVirtualList(value: Boolean): Self = StObject.set(x, "inVirtualList", value.asInstanceOf[js.Any])
  }
}
