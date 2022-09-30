package typings.reactSortableTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LowerSiblingsCounts extends StObject {
  
  var lowerSiblingsCounts: js.Array[Double]
}
object LowerSiblingsCounts {
  
  inline def apply(lowerSiblingsCounts: js.Array[Double]): LowerSiblingsCounts = {
    val __obj = js.Dynamic.literal(lowerSiblingsCounts = lowerSiblingsCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowerSiblingsCounts]
  }
  
  extension [Self <: LowerSiblingsCounts](x: Self) {
    
    inline def setLowerSiblingsCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingsCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingsCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingsCounts", js.Array(value*))
  }
}
