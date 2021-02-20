package typings.rmcTooltip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AdjustX extends StObject {
    
    var adjustX: Double = js.native
    
    var adjustY: Double = js.native
  }
  object AdjustX {
    
    @scala.inline
    def apply(adjustX: Double, adjustY: Double): AdjustX = {
      val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustX]
    }
    
    @scala.inline
    implicit class AdjustXMutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustX(value: Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustY(value: Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var offset: js.Array[Double] = js.native
    
    var overflow: AdjustX = js.native
    
    var points: js.Array[String] = js.native
    
    var targetOffset: js.Array[Double] = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(
      offset: js.Array[Double],
      overflow: AdjustX,
      points: js.Array[String],
      targetOffset: js.Array[Double]
    ): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
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
      
      @scala.inline
      def setTargetOffset(value: js.Array[Double]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetVarargs(value: Double*): Self = StObject.set(x, "targetOffset", js.Array(value :_*))
    }
  }
}
