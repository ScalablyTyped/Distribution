package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var offset: js.Array[Double]
  
  var overflow: AdjustX
  
  var points: js.Array[String]
}
object Offset {
  
  @scala.inline
  def apply(offset: js.Array[Double], overflow: AdjustX, points: js.Array[String]): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    @scala.inline
    def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: String*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
