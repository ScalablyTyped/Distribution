package typings.rcResizeObserver

import typings.rcResizeObserver.anon.Height
import typings.rcResizeObserver.anon.OffsetHeight
import typings.react.mod.Component
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.resizeObserverPolyfill.mod.ResizeObserver
import typings.resizeObserverPolyfill.mod.global.ResizeObserverCallback
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-resize-observer", JSImport.Default)
  @js.native
  class default () extends ReactResizeObserver
  object default {
    
    @JSImport("rc-resize-observer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-resize-observer", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ReactResizeObserver
    extends Component[ResizeObserverProps, ResizeObserverState, js.Any] {
    
    var childNode: RefNode = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MReactResizeObserver(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MReactResizeObserver(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MReactResizeObserver(): Unit = js.native
    
    var currentElement: Element | Null = js.native
    
    def destroyObserver(): Unit = js.native
    
    def onComponentUpdated(): Unit = js.native
    
    var onResize: ResizeObserverCallback = js.native
    
    var resizeObserver: ResizeObserver | Null = js.native
    
    def setChildNode(node: RefNode): Unit = js.native
    
    @JSName("state")
    var state_ReactResizeObserver: OffsetHeight = js.native
  }
  
  type RefNode = ReactInstance | HTMLElement | Null
  
  @js.native
  trait ResizeObserverProps extends StObject {
    
    var children: ReactNode = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Trigger if element resized. Will always trigger when first time render. */
    var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.native
  }
  object ResizeObserverProps {
    
    @scala.inline
    def apply(): ResizeObserverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeObserverProps]
    }
    
    @scala.inline
    implicit class ResizeObserverPropsMutableBuilder[Self <: ResizeObserverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* size */ Height => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    }
  }
  
  @js.native
  trait ResizeObserverState extends StObject {
    
    var height: Double = js.native
    
    var offsetHeight: Double = js.native
    
    var offsetWidth: Double = js.native
    
    var width: Double = js.native
  }
  object ResizeObserverState {
    
    @scala.inline
    def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): ResizeObserverState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeObserverState]
    }
    
    @scala.inline
    implicit class ResizeObserverStateMutableBuilder[Self <: ResizeObserverState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
