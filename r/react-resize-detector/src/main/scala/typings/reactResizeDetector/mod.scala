package typings.reactResizeDetector

import typings.react.mod.ComponentType
import typings.react.mod.Props
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactResizeDetector.anon.Leading
import typings.reactResizeDetector.anon.PartialReactResizeDetecto
import typings.reactResizeDetector.reactResizeDetectorStrings.debounce
import typings.reactResizeDetector.reactResizeDetectorStrings.height
import typings.reactResizeDetector.reactResizeDetectorStrings.throttle
import typings.reactResizeDetector.reactResizeDetectorStrings.width
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-resize-detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-resize-detector", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ReactResizeDetectorProps, js.Object, js.Any]
  
  @scala.inline
  def withResizeDetector[T /* <: PartialReactResizeDetecto */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, height | width]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withResizeDetector")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[T, height | width]]]
  @scala.inline
  def withResizeDetector[T /* <: PartialReactResizeDetecto */](WrappedComponent: ComponentType[T], props: ReactResizeDetectorProps): ComponentType[Omit[T, height | width]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withResizeDetector")(WrappedComponent.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ComponentType[Omit[T, height | width]]]
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait ReactResizeDetector
    extends PureComponent[ReactResizeDetectorProps, js.Object, js.Any]
  
  trait ReactResizeDetectorDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object ReactResizeDetectorDimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): ReactResizeDetectorDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactResizeDetectorDimensions]
    }
    
    @scala.inline
    implicit class ReactResizeDetectorDimensionsMutableBuilder[Self <: ReactResizeDetectorDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReactResizeDetectorProps
    extends StObject
       with Props[ReactResizeDetector] {
    
    /**
      * Trigger onResize on height change.
      * Default: false
      */
    var handleHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Trigger onResize on width change.
      * Default: false
      */
    var handleWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Valid only for a callback-pattern.
      * Ignored for other render types.
      * Set resize-detector's node type.
      * You can pass any valid React node: string with node's name or element.
      * Can be useful when you need to handle table's or paragraph's resizes.
      * Default: "div"
      * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
      * Use targetRef instead
      */
    var nodeType: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
      ] = js.undefined
    
    /**
      * Function that will be invoked with width and height arguments.
      * Default: undefined
      */
    var onResize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.undefined
    
    /**
      * A selector of an element to observe.
      * You can use this property to attach resize-observer to any DOM element.
      * Please refer to the querySelector docs.
      * Default: undefined
      * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
      * Use targetRef instead
      */
    var querySelector: js.UndefOr[String] = js.undefined
    
    /**
      * Possible values: "throttle" and "debounce".
      * See lodash docs for more information.
      * undefined - callback will be fired for every frame.
      * Default: undefined
      */
    var refreshMode: js.UndefOr[throttle | debounce] = js.undefined
    
    /**
      * Use this in conjunction with refreshMode. An object in shape of { leading: bool, trailing: bool }.
      * Please refer to lodash's docs for more info.
      * Default: undefined
      */
    var refreshOptions: js.UndefOr[Leading] = js.undefined
    
    /**
      * Use this in conjunction with refreshMode.
      * Important! It's a numeric prop so set it accordingly, e.g. refreshRate={500}.
      * efault: 1000.
      */
    var refreshRate: js.UndefOr[Double] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ ReactResizeDetectorDimensions, ReactNode]] = js.undefined
    
    /**
      * Do not trigger onResize when a component mounts.
      * Default: false
      */
    var skipOnMount: js.UndefOr[Boolean] = js.undefined
    
    // will be passed to React.createElement()
    /**
      * A DOM element to observe.
      * By default it's a parent element in relation to the ReactResizeDetector component.
      * But you can pass any DOM element to observe.
      * This property is omitted when you pass querySelector.
      * Default: undefined
      * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
      * Use targetRef instead
      */
    var targetDomEl: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * A React reference of the element to observe.
      * Pass a reference to the element you want to attach resize handlers to.
      * It must be an instance of React.useRef or React.createRef functions
      * Default: undefined
      */
    var targetRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
  }
  object ReactResizeDetectorProps {
    
    @scala.inline
    def apply(): ReactResizeDetectorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactResizeDetectorProps]
    }
    
    @scala.inline
    implicit class ReactResizeDetectorPropsMutableBuilder[Self <: ReactResizeDetectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleHeight(value: Boolean): Self = StObject.set(x, "handleHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleHeightUndefined: Self = StObject.set(x, "handleHeight", js.undefined)
      
      @scala.inline
      def setHandleWidth(value: Boolean): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      @scala.inline
      def setNodeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setOnResize(value: (/* width */ Double, /* height */ Double) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setQuerySelector(value: String): Self = StObject.set(x, "querySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerySelectorUndefined: Self = StObject.set(x, "querySelector", js.undefined)
      
      @scala.inline
      def setRefreshMode(value: throttle | debounce): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
      
      @scala.inline
      def setRefreshOptions(value: Leading): Self = StObject.set(x, "refreshOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshOptionsUndefined: Self = StObject.set(x, "refreshOptions", js.undefined)
      
      @scala.inline
      def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
      
      @scala.inline
      def setRender(value: /* props */ ReactResizeDetectorDimensions => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSkipOnMount(value: Boolean): Self = StObject.set(x, "skipOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOnMountUndefined: Self = StObject.set(x, "skipOnMount", js.undefined)
      
      @scala.inline
      def setTargetDomEl(value: HTMLElement): Self = StObject.set(x, "targetDomEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDomElUndefined: Self = StObject.set(x, "targetDomEl", js.undefined)
      
      @scala.inline
      def setTargetRef(value: Ref[HTMLElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "targetRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetRefNull: Self = StObject.set(x, "targetRef", null)
      
      @scala.inline
      def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
}
