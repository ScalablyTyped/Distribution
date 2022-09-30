package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousAndNextLocation extends StObject {
  
  var nextPath: NumberOrStringArray
  
  var nextTreeIndex: Double
  
  var prevPath: NumberOrStringArray
  
  var prevTreeIndex: Double
}
object PreviousAndNextLocation {
  
  inline def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): PreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousAndNextLocation]
  }
  
  extension [Self <: PreviousAndNextLocation](x: Self) {
    
    inline def setNextPath(value: NumberOrStringArray): Self = StObject.set(x, "nextPath", value.asInstanceOf[js.Any])
    
    inline def setNextPathVarargs(value: (String | Double)*): Self = StObject.set(x, "nextPath", js.Array(value*))
    
    inline def setNextTreeIndex(value: Double): Self = StObject.set(x, "nextTreeIndex", value.asInstanceOf[js.Any])
    
    inline def setPrevPath(value: NumberOrStringArray): Self = StObject.set(x, "prevPath", value.asInstanceOf[js.Any])
    
    inline def setPrevPathVarargs(value: (String | Double)*): Self = StObject.set(x, "prevPath", js.Array(value*))
    
    inline def setPrevTreeIndex(value: Double): Self = StObject.set(x, "prevTreeIndex", value.asInstanceOf[js.Any])
  }
}
