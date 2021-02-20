package typings.reactSwipeableViewsCore

import typings.react.mod.ReactNode
import typings.reactSwipeableViews.mod.SwipeableViewsProps
import typings.reactSwipeableViewsCore.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipeable-views-core", "checkIndexBounds")
  @js.native
  def checkIndexBounds(props: SwipeableViewsProps): Unit = js.native
  
  @JSImport("react-swipeable-views-core", "computeIndex")
  @js.native
  def computeIndex(params: ComputeIndexParams): Index = js.native
  
  object constant {
    
    @JSImport("react-swipeable-views-core", "constant")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-swipeable-views-core", "constant.RESISTANCE_COEF")
    @js.native
    def RESISTANCE_COEF: Double = js.native
    @scala.inline
    def RESISTANCE_COEF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESISTANCE_COEF")(x.asInstanceOf[js.Any])
    
    @JSImport("react-swipeable-views-core", "constant.UNCERTAINTY_THRESHOLD")
    @js.native
    def UNCERTAINTY_THRESHOLD: Double = js.native
    @scala.inline
    def UNCERTAINTY_THRESHOLD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNCERTAINTY_THRESHOLD")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-swipeable-views-core", "getDisplaySameSlide")
  @js.native
  def getDisplaySameSlide(props: SwipeableViewsProps, nextProps: SwipeableViewsProps): Boolean = js.native
  
  @JSImport("react-swipeable-views-core", "mod")
  @js.native
  def mod(n: Double, m: Double): Double = js.native
  
  @js.native
  trait ComputeIndexParams extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var pageX: Double = js.native
    
    var resistance: js.UndefOr[Boolean] = js.native
    
    var startIndex: Double = js.native
    
    var startX: Double = js.native
    
    var viewLength: Double = js.native
  }
  object ComputeIndexParams {
    
    @scala.inline
    def apply(pageX: Double, startIndex: Double, startX: Double, viewLength: Double): ComputeIndexParams = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], viewLength = viewLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeIndexParams]
    }
    
    @scala.inline
    implicit class ComputeIndexParamsMutableBuilder[Self <: ComputeIndexParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResistance(value: Boolean): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewLength(value: Double): Self = StObject.set(x, "viewLength", value.asInstanceOf[js.Any])
    }
  }
}
