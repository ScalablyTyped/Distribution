package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousAndNextLocation extends StObject {
  
  var nextPath: NumberOrStringArray = js.native
  
  var nextTreeIndex: Double = js.native
  
  var prevPath: NumberOrStringArray = js.native
  
  var prevTreeIndex: Double = js.native
}
object PreviousAndNextLocation {
  
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): PreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousAndNextLocation]
  }
  
  @scala.inline
  implicit class PreviousAndNextLocationMutableBuilder[Self <: PreviousAndNextLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPath(value: NumberOrStringArray): Self = StObject.set(x, "nextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPathVarargs(value: (String | Double)*): Self = StObject.set(x, "nextPath", js.Array(value :_*))
    
    @scala.inline
    def setNextTreeIndex(value: Double): Self = StObject.set(x, "nextTreeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPath(value: NumberOrStringArray): Self = StObject.set(x, "prevPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPathVarargs(value: (String | Double)*): Self = StObject.set(x, "prevPath", js.Array(value :_*))
    
    @scala.inline
    def setPrevTreeIndex(value: Double): Self = StObject.set(x, "prevTreeIndex", value.asInstanceOf[js.Any])
  }
}
