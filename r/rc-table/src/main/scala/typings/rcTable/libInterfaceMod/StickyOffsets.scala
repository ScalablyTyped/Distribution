package typings.rcTable.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StickyOffsets extends StObject {
  
  var isSticky: js.UndefOr[Boolean] = js.undefined
  
  var left: js.Array[Double]
  
  var right: js.Array[Double]
}
object StickyOffsets {
  
  inline def apply(left: js.Array[Double], right: js.Array[Double]): StickyOffsets = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyOffsets]
  }
  
  extension [Self <: StickyOffsets](x: Self) {
    
    inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    inline def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
    
    inline def setLeft(value: js.Array[Double]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftVarargs(value: Double*): Self = StObject.set(x, "left", js.Array(value*))
    
    inline def setRight(value: js.Array[Double]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightVarargs(value: Double*): Self = StObject.set(x, "right", js.Array(value*))
  }
}
