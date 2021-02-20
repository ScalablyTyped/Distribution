package typings.reactInfinite

import typings.react.mod.Component
import typings.react.mod.Props
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[InfiniteProps, js.Object, js.Any]
  
  /* static member */
  @JSImport("react-infinite", "containerHeightScaleFactor")
  @js.native
  def containerHeightScaleFactor(n: Double): js.Any = js.native
  
  @js.native
  trait Infinite
    extends Component[InfiniteProps, js.Object, js.Any]
  
  @js.native
  trait InfiniteProps extends Props[Infinite] {
    
    var className: js.UndefOr[String] = js.native
    
    var containerHeight: js.UndefOr[Double] = js.native
    
    var displayBottomUpwards: js.UndefOr[Boolean] = js.native
    
    var elementHeight: Double | js.Array[Double] = js.native
    
    var handleScroll: js.UndefOr[js.Function1[/* node */ ReactElement, Unit]] = js.native
    
    var infiniteLoadBeginBottomOffset: js.UndefOr[Double] = js.native
    
    var infiniteLoadBeginEdgeOffset: js.UndefOr[Double] = js.native
    
    var isInfiniteLoading: js.UndefOr[Boolean] = js.native
    
    var loadingSpinnerDelegate: js.UndefOr[ReactElement] = js.native
    
    var onInfiniteLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    var preloadAdditionalHeight: js.UndefOr[Double | js.Object] = js.native
    
    var preloadBatchSize: js.UndefOr[Double | js.Object] = js.native
    
    var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[Double] = js.native
    
    var useWindowAsScrollContainer: js.UndefOr[Boolean] = js.native
  }
  object InfiniteProps {
    
    @scala.inline
    def apply(elementHeight: Double | js.Array[Double]): InfiniteProps = {
      val __obj = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfiniteProps]
    }
    
    @scala.inline
    implicit class InfinitePropsMutableBuilder[Self <: InfiniteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerHeightUndefined: Self = StObject.set(x, "containerHeight", js.undefined)
      
      @scala.inline
      def setDisplayBottomUpwards(value: Boolean): Self = StObject.set(x, "displayBottomUpwards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayBottomUpwardsUndefined: Self = StObject.set(x, "displayBottomUpwards", js.undefined)
      
      @scala.inline
      def setElementHeight(value: Double | js.Array[Double]): Self = StObject.set(x, "elementHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementHeightVarargs(value: Double*): Self = StObject.set(x, "elementHeight", js.Array(value :_*))
      
      @scala.inline
      def setHandleScroll(value: /* node */ ReactElement => Unit): Self = StObject.set(x, "handleScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleScrollUndefined: Self = StObject.set(x, "handleScroll", js.undefined)
      
      @scala.inline
      def setInfiniteLoadBeginBottomOffset(value: Double): Self = StObject.set(x, "infiniteLoadBeginBottomOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteLoadBeginBottomOffsetUndefined: Self = StObject.set(x, "infiniteLoadBeginBottomOffset", js.undefined)
      
      @scala.inline
      def setInfiniteLoadBeginEdgeOffset(value: Double): Self = StObject.set(x, "infiniteLoadBeginEdgeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteLoadBeginEdgeOffsetUndefined: Self = StObject.set(x, "infiniteLoadBeginEdgeOffset", js.undefined)
      
      @scala.inline
      def setIsInfiniteLoading(value: Boolean): Self = StObject.set(x, "isInfiniteLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInfiniteLoadingUndefined: Self = StObject.set(x, "isInfiniteLoading", js.undefined)
      
      @scala.inline
      def setLoadingSpinnerDelegate(value: ReactElement): Self = StObject.set(x, "loadingSpinnerDelegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingSpinnerDelegateUndefined: Self = StObject.set(x, "loadingSpinnerDelegate", js.undefined)
      
      @scala.inline
      def setOnInfiniteLoad(value: () => Unit): Self = StObject.set(x, "onInfiniteLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInfiniteLoadUndefined: Self = StObject.set(x, "onInfiniteLoad", js.undefined)
      
      @scala.inline
      def setPreloadAdditionalHeight(value: Double | js.Object): Self = StObject.set(x, "preloadAdditionalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadAdditionalHeightUndefined: Self = StObject.set(x, "preloadAdditionalHeight", js.undefined)
      
      @scala.inline
      def setPreloadBatchSize(value: Double | js.Object): Self = StObject.set(x, "preloadBatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadBatchSizeUndefined: Self = StObject.set(x, "preloadBatchSize", js.undefined)
      
      @scala.inline
      def setTimeScrollStateLastsForAfterUserScrolls(value: Double): Self = StObject.set(x, "timeScrollStateLastsForAfterUserScrolls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeScrollStateLastsForAfterUserScrollsUndefined: Self = StObject.set(x, "timeScrollStateLastsForAfterUserScrolls", js.undefined)
      
      @scala.inline
      def setUseWindowAsScrollContainer(value: Boolean): Self = StObject.set(x, "useWindowAsScrollContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWindowAsScrollContainerUndefined: Self = StObject.set(x, "useWindowAsScrollContainer", js.undefined)
    }
  }
}
