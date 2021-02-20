package typings.rcTable.interfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyOffsets extends StObject {
  
  var isSticky: js.UndefOr[Boolean] = js.native
  
  var left: js.Array[Double] = js.native
  
  var right: js.Array[Double] = js.native
}
object StickyOffsets {
  
  @scala.inline
  def apply(left: js.Array[Double], right: js.Array[Double]): StickyOffsets = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyOffsets]
  }
  
  @scala.inline
  implicit class StickyOffsetsMutableBuilder[Self <: StickyOffsets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
    
    @scala.inline
    def setLeft(value: js.Array[Double]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftVarargs(value: Double*): Self = StObject.set(x, "left", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: js.Array[Double]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightVarargs(value: Double*): Self = StObject.set(x, "right", js.Array(value :_*))
  }
}
