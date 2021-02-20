package typings.reactLazyload

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lazyload", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[LazyLoadProps, js.Object, js.Any] {
    def this(props: LazyLoad_) = this()
  }
  
  @JSImport("react-lazyload", "forceCheck")
  @js.native
  def forceCheck(): Unit = js.native
  
  @JSImport("react-lazyload", "forceVisible")
  @js.native
  def forceVisible(): Unit = js.native
  
  @JSImport("react-lazyload", "lazyload")
  @js.native
  def lazyload(option: js.Object): LazyLoad_ = js.native
  
  @js.native
  trait LazyLoadProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var classNamePrefix: js.UndefOr[String] = js.native
    
    var debounce: js.UndefOr[Double | Boolean] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var offset: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var once: js.UndefOr[Boolean] = js.native
    
    var overflow: js.UndefOr[Boolean] = js.native
    
    var placeholder: js.UndefOr[ReactNode] = js.native
    
    var preventLoading: js.UndefOr[Boolean] = js.native
    
    var resize: js.UndefOr[Boolean] = js.native
    
    var scroll: js.UndefOr[Boolean] = js.native
    
    var scrollContainer: js.UndefOr[String | Element] = js.native
    
    var throttle: js.UndefOr[Double | Boolean] = js.native
    
    var unmountIfInvisible: js.UndefOr[Boolean] = js.native
  }
  object LazyLoadProps {
    
    @scala.inline
    def apply(): LazyLoadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LazyLoadProps]
    }
    
    @scala.inline
    implicit class LazyLoadPropsMutableBuilder[Self <: LazyLoadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      @scala.inline
      def setDebounce(value: Double | Boolean): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPreventLoading(value: Boolean): Self = StObject.set(x, "preventLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventLoadingUndefined: Self = StObject.set(x, "preventLoading", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollContainer(value: String | Element): Self = StObject.set(x, "scrollContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollContainerUndefined: Self = StObject.set(x, "scrollContainer", js.undefined)
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double | Boolean): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setUnmountIfInvisible(value: Boolean): Self = StObject.set(x, "unmountIfInvisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountIfInvisibleUndefined: Self = StObject.set(x, "unmountIfInvisible", js.undefined)
    }
  }
  
  type LazyLoad_ = Component[LazyLoadProps, js.Object, js.Any]
}
