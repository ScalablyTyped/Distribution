package typings.reactResizeDetector.mod

import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactResizeDetector.anon.Leading
import typings.reactResizeDetector.reactResizeDetectorStrings.debounce
import typings.reactResizeDetector.reactResizeDetectorStrings.throttle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactResizeDetectorProps extends Props[ReactResizeDetector] {
  
  /**
    * Trigger onResize on height change.
    * Default: false
    */
  var handleHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Trigger onResize on width change.
    * Default: false
    */
  var handleWidth: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /**
    * Function that will be invoked with width and height arguments.
    * Default: undefined
    */
  var onResize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.native
  
  /**
    * A selector of an element to observe.
    * You can use this property to attach resize-observer to any DOM element.
    * Please refer to the querySelector docs.
    * Default: undefined
    * @deprecated since version 5.0.0. It will be removed in version 6.0.0.
    * Use targetRef instead
    */
  var querySelector: js.UndefOr[String] = js.native
  
  /**
    * Possible values: "throttle" and "debounce".
    * See lodash docs for more information.
    * undefined - callback will be fired for every frame.
    * Default: undefined
    */
  var refreshMode: js.UndefOr[throttle | debounce] = js.native
  
  /**
    * Use this in conjunction with refreshMode. An object in shape of { leading: bool, trailing: bool }.
    * Please refer to lodash's docs for more info.
    * Default: undefined
    */
  var refreshOptions: js.UndefOr[Leading] = js.native
  
  /**
    * Use this in conjunction with refreshMode.
    * Important! It's a numeric prop so set it accordingly, e.g. refreshRate={500}.
    * efault: 1000.
    */
  var refreshRate: js.UndefOr[Double] = js.native
  
  var render: js.UndefOr[js.Function1[/* props */ ReactResizeDetectorDimensions, ReactNode]] = js.native
  
  /**
    * Do not trigger onResize when a component mounts.
    * Default: false
    */
  var skipOnMount: js.UndefOr[Boolean] = js.native
  
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
  var targetDomEl: js.UndefOr[HTMLElement] = js.native
  
  /**
    * A React reference of the element to observe.
    * Pass a reference to the element you want to attach resize handlers to.
    * It must be an instance of React.useRef or React.createRef functions
    * Default: undefined
    */
  var targetRef: js.UndefOr[Ref[HTMLElement]] = js.native
}
object ReactResizeDetectorProps {
  
  @scala.inline
  def apply(): ReactResizeDetectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactResizeDetectorProps]
  }
  
  @scala.inline
  implicit class ReactResizeDetectorPropsOps[Self <: ReactResizeDetectorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandleHeight(value: Boolean): Self = this.set("handleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleHeight: Self = this.set("handleHeight", js.undefined)
    
    @scala.inline
    def setHandleWidth(value: Boolean): Self = this.set("handleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleWidth: Self = this.set("handleWidth", js.undefined)
    
    @scala.inline
    def setNodeType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    
    @scala.inline
    def setOnResize(value: (/* width */ Double, /* height */ Double) => Unit): Self = this.set("onResize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setQuerySelector(value: String): Self = this.set("querySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerySelector: Self = this.set("querySelector", js.undefined)
    
    @scala.inline
    def setRefreshMode(value: throttle | debounce): Self = this.set("refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshMode: Self = this.set("refreshMode", js.undefined)
    
    @scala.inline
    def setRefreshOptions(value: Leading): Self = this.set("refreshOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshOptions: Self = this.set("refreshOptions", js.undefined)
    
    @scala.inline
    def setRefreshRate(value: Double): Self = this.set("refreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshRate: Self = this.set("refreshRate", js.undefined)
    
    @scala.inline
    def setRender(value: /* props */ ReactResizeDetectorDimensions => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSkipOnMount(value: Boolean): Self = this.set("skipOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOnMount: Self = this.set("skipOnMount", js.undefined)
    
    @scala.inline
    def setTargetDomEl(value: HTMLElement): Self = this.set("targetDomEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetDomEl: Self = this.set("targetDomEl", js.undefined)
    
    @scala.inline
    def setTargetRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("targetRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTargetRef(value: Ref[HTMLElement]): Self = this.set("targetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRef: Self = this.set("targetRef", js.undefined)
    
    @scala.inline
    def setTargetRefNull: Self = this.set("targetRef", null)
  }
}
