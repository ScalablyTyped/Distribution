package typings.reactSwipeableViewsCore

import typings.react.mod.ReactNode
import typings.reactSwipeableViews.mod.SwipeableViewsProps
import typings.reactSwipeableViewsCore.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipeable-views-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIndexBounds(props: SwipeableViewsProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIndexBounds")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def computeIndex(params: ComputeIndexParams): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("computeIndex")(params.asInstanceOf[js.Any]).asInstanceOf[Index]
  
  object constant {
    
    @JSImport("react-swipeable-views-core", "constant")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-swipeable-views-core", "constant.RESISTANCE_COEF")
    @js.native
    def RESISTANCE_COEF: Double = js.native
    inline def RESISTANCE_COEF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESISTANCE_COEF")(x.asInstanceOf[js.Any])
    
    @JSImport("react-swipeable-views-core", "constant.UNCERTAINTY_THRESHOLD")
    @js.native
    def UNCERTAINTY_THRESHOLD: Double = js.native
    inline def UNCERTAINTY_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNCERTAINTY_THRESHOLD")(x.asInstanceOf[js.Any])
  }
  
  inline def getDisplaySameSlide(props: SwipeableViewsProps, nextProps: SwipeableViewsProps): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplaySameSlide")(props.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mod(n: Double, m: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait ComputeIndexParams extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var pageX: Double
    
    var resistance: js.UndefOr[Boolean] = js.undefined
    
    var startIndex: Double
    
    var startX: Double
    
    var viewLength: Double
  }
  object ComputeIndexParams {
    
    inline def apply(pageX: Double, startIndex: Double, startX: Double, viewLength: Double): ComputeIndexParams = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], viewLength = viewLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeIndexParams]
    }
    
    extension [Self <: ComputeIndexParams](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setResistance(value: Boolean): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
      
      inline def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setViewLength(value: Double): Self = StObject.set(x, "viewLength", value.asInstanceOf[js.Any])
    }
  }
}
