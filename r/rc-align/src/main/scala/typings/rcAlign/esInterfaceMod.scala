package typings.rcAlign

import typings.rcAlign.anon.AdjustX
import typings.rcAlign.anon.AdjustY
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  type AlignPoint = String
  
  trait AlignResult extends StObject {
    
    var offset: js.Array[Double]
    
    var overflow: AdjustY
    
    var points: js.Array[AlignPoint]
    
    var targetOffset: js.Array[Double]
  }
  object AlignResult {
    
    inline def apply(
      offset: js.Array[Double],
      overflow: AdjustY,
      points: js.Array[AlignPoint],
      targetOffset: js.Array[Double]
    ): AlignResult = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlignResult] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOverflow(value: AdjustY): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[AlignPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: AlignPoint*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTargetOffset(value: js.Array[Double]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetVarargs(value: Double*): Self = StObject.set(x, "targetOffset", js.Array(value*))
    }
  }
  
  trait AlignType extends StObject {
    
    /**
      * offset source node by offset[0] in x and offset[1] in y.
      * If offset contains percentage string value, it is relative to sourceNode region.
      */
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * If adjustX field is true, will adjust source node in x direction if source node is invisible.
      * If adjustY field is true, will adjust source node in y direction if source node is invisible.
      */
    var overflow: js.UndefOr[AdjustX] = js.undefined
    
    /**
      * move point of source node to align with point of target node.
      * Such as ['tr','cc'], align top right point of source node with center point of target node.
      * Point can be 't'(top), 'b'(bottom), 'c'(center), 'l'(left), 'r'(right) */
    var points: js.UndefOr[js.Array[AlignPoint]] = js.undefined
    
    /**
      * offset target node by offset[0] in x and offset[1] in y.
      * If targetOffset contains percentage string value, it is relative to targetNode region.
      */
    var targetOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Whether use css bottom instead of top to position
      */
    var useCssBottom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether use css right instead of left to position
      */
    var useCssRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether use css transform instead of left/top/right/bottom to position if browser supports.
      * Defaults to false.
      */
    var useCssTransform: js.UndefOr[Boolean] = js.undefined
  }
  object AlignType {
    
    inline def apply(): AlignType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlignType] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPoints(value: js.Array[AlignPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: AlignPoint*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setTargetOffset(value: js.Array[Double]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      inline def setTargetOffsetVarargs(value: Double*): Self = StObject.set(x, "targetOffset", js.Array(value*))
      
      inline def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      inline def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      inline def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      inline def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      inline def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      inline def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  trait TargetPoint extends StObject {
    
    var clientX: js.UndefOr[Double] = js.undefined
    
    var clientY: js.UndefOr[Double] = js.undefined
    
    var pageX: js.UndefOr[Double] = js.undefined
    
    var pageY: js.UndefOr[Double] = js.undefined
  }
  object TargetPoint {
    
    inline def apply(): TargetPoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetPoint] (val x: Self) extends AnyVal {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
    }
  }
  
  type TargetType = js.Function0[HTMLElement] | TargetPoint
}
