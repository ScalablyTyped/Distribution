package typings.reactInfinite

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[InfiniteProps, js.Object, js.Any]
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def containerHeightScaleFactor(n: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("containerHeightScaleFactor")(n.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @js.native
  trait Infinite
    extends Component[InfiniteProps, js.Object, js.Any]
  
  trait InfiniteProps
    extends StObject
       with Props[Infinite] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerHeight: js.UndefOr[Double] = js.undefined
    
    var displayBottomUpwards: js.UndefOr[Boolean] = js.undefined
    
    var elementHeight: Double | js.Array[Double]
    
    var handleScroll: js.UndefOr[js.Function1[/* node */ ReactElement, Unit]] = js.undefined
    
    var infiniteLoadBeginBottomOffset: js.UndefOr[Double] = js.undefined
    
    var infiniteLoadBeginEdgeOffset: js.UndefOr[Double] = js.undefined
    
    var isInfiniteLoading: js.UndefOr[Boolean] = js.undefined
    
    var loadingSpinnerDelegate: js.UndefOr[ReactElement] = js.undefined
    
    var onInfiniteLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preloadAdditionalHeight: js.UndefOr[Double | js.Object] = js.undefined
    
    var preloadBatchSize: js.UndefOr[Double | js.Object] = js.undefined
    
    var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[Double] = js.undefined
    
    var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.undefined
  }
  object InfiniteProps {
    
    inline def apply(elementHeight: Double | js.Array[Double]): InfiniteProps = {
      val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfiniteProps]
    }
    
    extension [Self <: InfiniteProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setContainerHeightUndefined: Self = StObject.set(x, "containerHeight", js.undefined)
      
      inline def setDisplayBottomUpwards(value: Boolean): Self = StObject.set(x, "displayBottomUpwards", value.asInstanceOf[js.Any])
      
      inline def setDisplayBottomUpwardsUndefined: Self = StObject.set(x, "displayBottomUpwards", js.undefined)
      
      inline def setElementHeight(value: Double | js.Array[Double]): Self = StObject.set(x, "elementHeight", value.asInstanceOf[js.Any])
      
      inline def setElementHeightVarargs(value: Double*): Self = StObject.set(x, "elementHeight", js.Array(value :_*))
      
      inline def setHandleScroll(value: /* node */ ReactElement => Unit): Self = StObject.set(x, "handleScroll", js.Any.fromFunction1(value))
      
      inline def setHandleScrollUndefined: Self = StObject.set(x, "handleScroll", js.undefined)
      
      inline def setInfiniteLoadBeginBottomOffset(value: Double): Self = StObject.set(x, "infiniteLoadBeginBottomOffset", value.asInstanceOf[js.Any])
      
      inline def setInfiniteLoadBeginBottomOffsetUndefined: Self = StObject.set(x, "infiniteLoadBeginBottomOffset", js.undefined)
      
      inline def setInfiniteLoadBeginEdgeOffset(value: Double): Self = StObject.set(x, "infiniteLoadBeginEdgeOffset", value.asInstanceOf[js.Any])
      
      inline def setInfiniteLoadBeginEdgeOffsetUndefined: Self = StObject.set(x, "infiniteLoadBeginEdgeOffset", js.undefined)
      
      inline def setIsInfiniteLoading(value: Boolean): Self = StObject.set(x, "isInfiniteLoading", value.asInstanceOf[js.Any])
      
      inline def setIsInfiniteLoadingUndefined: Self = StObject.set(x, "isInfiniteLoading", js.undefined)
      
      inline def setLoadingSpinnerDelegate(value: ReactElement): Self = StObject.set(x, "loadingSpinnerDelegate", value.asInstanceOf[js.Any])
      
      inline def setLoadingSpinnerDelegateUndefined: Self = StObject.set(x, "loadingSpinnerDelegate", js.undefined)
      
      inline def setOnInfiniteLoad(value: () => Unit): Self = StObject.set(x, "onInfiniteLoad", js.Any.fromFunction0(value))
      
      inline def setOnInfiniteLoadUndefined: Self = StObject.set(x, "onInfiniteLoad", js.undefined)
      
      inline def setPreloadAdditionalHeight(value: Double | js.Object): Self = StObject.set(x, "preloadAdditionalHeight", value.asInstanceOf[js.Any])
      
      inline def setPreloadAdditionalHeightUndefined: Self = StObject.set(x, "preloadAdditionalHeight", js.undefined)
      
      inline def setPreloadBatchSize(value: Double | js.Object): Self = StObject.set(x, "preloadBatchSize", value.asInstanceOf[js.Any])
      
      inline def setPreloadBatchSizeUndefined: Self = StObject.set(x, "preloadBatchSize", js.undefined)
      
      inline def setTimeScrollStateLastsForAfterUserScrolls(value: Double): Self = StObject.set(x, "timeScrollStateLastsForAfterUserScrolls", value.asInstanceOf[js.Any])
      
      inline def setTimeScrollStateLastsForAfterUserScrollsUndefined: Self = StObject.set(x, "timeScrollStateLastsForAfterUserScrolls", js.undefined)
      
      inline def setUseWindowAsScrollContainer(value: Boolean): Self = StObject.set(x, "useWindowAsScrollContainer", value.asInstanceOf[js.Any])
      
      inline def setUseWindowAsScrollContainerUndefined: Self = StObject.set(x, "useWindowAsScrollContainer", js.undefined)
    }
  }
}
