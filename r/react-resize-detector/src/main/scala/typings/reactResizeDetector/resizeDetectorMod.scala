package typings.reactResizeDetector

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactResizeDetector.anon.Leading
import typings.reactResizeDetector.reactResizeDetectorStrings.debounce
import typings.reactResizeDetector.reactResizeDetectorStrings.throttle
import typings.std.Element
import typings.std.HTMLElement
import typings.std.ResizeObserverCallback
import typings.std.ResizeObserverOptions
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeDetectorMod {
  
  @JSImport("react-resize-detector/build/ResizeDetector", JSImport.Default)
  @js.native
  open class default[ElementT /* <: HTMLElement */] protected () extends ResizeDetector[ElementT] {
    def this(props: ComponentsProps[ElementT]) = this()
  }
  
  trait ChildFunctionProps[ElementT /* <: HTMLElement */]
    extends StObject
       with ReactResizeDetectorDimensions {
    
    var targetRef: js.UndefOr[RefObject[ElementT]] = js.undefined
  }
  object ChildFunctionProps {
    
    inline def apply[ElementT /* <: HTMLElement */](): ChildFunctionProps[ElementT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildFunctionProps[ElementT]]
    }
    
    extension [Self <: ChildFunctionProps[?], ElementT /* <: HTMLElement */](x: Self & ChildFunctionProps[ElementT]) {
      
      inline def setTargetRef(value: RefObject[ElementT]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait ComponentsProps[ElementT /* <: HTMLElement */]
    extends StObject
       with Props {
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* props */ ChildFunctionProps[ElementT], ReactNode])] = js.undefined
    
    /**
      * Valid only for a callback-pattern.
      * Ignored for other render types.
      * Set resize-detector's node type.
      * You can pass any valid React node: string with node's name or element.
      * Can be useful when you need to handle table's or paragraph's resizes.
      * Default: "div"
      * @deprecated since version 5.0.0. It will be removed in version 7.0.0.
      * Use targetRef instead
      */
    var nodeType: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any
      ] = js.undefined
    
    /**
      * A selector of an element to observe.
      * You can use this property to attach resize-observer to any DOM element.
      * Please refer to the querySelector docs.
      * Default: undefined
      * @deprecated since version 5.0.0. It will be removed in version 7.0.0.
      * Use targetRef instead
      */
    var querySelector: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ ReactResizeDetectorDimensions, ReactNode]] = js.undefined
    
    /**
      * A DOM element to observe.
      * By default it's a parent element in relation to the ReactResizeDetector component.
      * But you can pass any DOM element to observe.
      * This property is omitted when you pass querySelector.
      * Default: undefined
      * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
      * Use targetRef instead
      */
    var targetDomEl: js.UndefOr[ElementT] = js.undefined
    
    /**
      * A React reference of the element to observe.
      * Pass a reference to the element you want to attach resize handlers to.
      * It must be an instance of React.useRef or React.createRef functions
      * Default: undefined
      */
    var targetRef: js.UndefOr[RefObject[ElementT]] = js.undefined
  }
  object ComponentsProps {
    
    inline def apply[ElementT /* <: HTMLElement */](): ComponentsProps[ElementT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentsProps[ElementT]]
    }
    
    extension [Self <: ComponentsProps[?], ElementT /* <: HTMLElement */](x: Self & ComponentsProps[ElementT]) {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* props */ ChildFunctionProps[ElementT], ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ ChildFunctionProps[ElementT] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNodeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ Any): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      inline def setQuerySelector(value: String): Self = StObject.set(x, "querySelector", value.asInstanceOf[js.Any])
      
      inline def setQuerySelectorUndefined: Self = StObject.set(x, "querySelector", js.undefined)
      
      inline def setRender(value: /* props */ ReactResizeDetectorDimensions => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTargetDomEl(value: ElementT): Self = StObject.set(x, "targetDomEl", value.asInstanceOf[js.Any])
      
      inline def setTargetDomElUndefined: Self = StObject.set(x, "targetDomEl", js.undefined)
      
      inline def setTargetRef(value: RefObject[ElementT]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait Props extends StObject {
    
    /**
      * Trigger update on height change.
      * Default: true
      */
    var handleHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Trigger onResize on width change.
      * Default: true
      */
    var handleWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * These options will be used as a second parameter of `resizeObserver.observe` method
      * @see https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserver/observe
      * Default: undefined
      */
    var observerOptions: js.UndefOr[ResizeObserverOptions] = js.undefined
    
    /**
      * Function that will be invoked with observable element's width and height.
      * Default: undefined
      */
    var onResize: js.UndefOr[
        js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    /**
      * Changes the update strategy. Possible values: "throttle" and "debounce".
      * See `lodash` docs for more information https://lodash.com/docs/
      * undefined - callback will be fired for every frame.
      * Default: undefined
      */
    var refreshMode: js.UndefOr[throttle | debounce] = js.undefined
    
    /**
      * Pass additional params to `refreshMode` according to lodash docs
      * Default: undefined
      */
    var refreshOptions: js.UndefOr[Leading] = js.undefined
    
    /**
      * Set the timeout/interval for `refreshMode` strategy
      * Default: undefined
      */
    var refreshRate: js.UndefOr[Double] = js.undefined
    
    /**
      * Do not trigger update when a component mounts.
      * Default: false
      */
    var skipOnMount: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setHandleHeight(value: Boolean): Self = StObject.set(x, "handleHeight", value.asInstanceOf[js.Any])
      
      inline def setHandleHeightUndefined: Self = StObject.set(x, "handleHeight", js.undefined)
      
      inline def setHandleWidth(value: Boolean): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      inline def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      inline def setObserverOptions(value: ResizeObserverOptions): Self = StObject.set(x, "observerOptions", value.asInstanceOf[js.Any])
      
      inline def setObserverOptionsUndefined: Self = StObject.set(x, "observerOptions", js.undefined)
      
      inline def setOnResize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setRefreshMode(value: throttle | debounce): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
      
      inline def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
      
      inline def setRefreshOptions(value: Leading): Self = StObject.set(x, "refreshOptions", value.asInstanceOf[js.Any])
      
      inline def setRefreshOptionsUndefined: Self = StObject.set(x, "refreshOptions", js.undefined)
      
      inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      inline def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
      
      inline def setSkipOnMount(value: Boolean): Self = StObject.set(x, "skipOnMount", value.asInstanceOf[js.Any])
      
      inline def setSkipOnMountUndefined: Self = StObject.set(x, "skipOnMount", js.undefined)
    }
  }
  
  trait ReactResizeDetectorDimensions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ReactResizeDetectorDimensions {
    
    inline def apply(): ReactResizeDetectorDimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactResizeDetectorDimensions]
    }
    
    extension [Self <: ReactResizeDetectorDimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ResizeDetector[ElementT /* <: HTMLElement */] extends PureComponent[ComponentsProps[ElementT], ReactResizeDetectorDimensions, Any] {
    
    def attachObserver(): Unit = js.native
    
    def cancelHandler(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MResizeDetector(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizeDetector(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizeDetector(): Unit = js.native
    
    var createResizeHandler: ResizeObserverCallback = js.native
    
    def getElement(): Element | Text | Null = js.native
    
    def getRenderType(): String = js.native
    
    var observableElement: Any = js.native
    
    var resizeHandler: Any = js.native
    
    var resizeObserver: Any = js.native
    
    var skipOnMount: js.UndefOr[Boolean] = js.native
    
    var targetRef: Any = js.native
  }
}
