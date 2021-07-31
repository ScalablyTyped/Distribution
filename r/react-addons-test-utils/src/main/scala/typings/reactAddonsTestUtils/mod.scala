package typings.reactAddonsTestUtils

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.AbstractView
import typings.react.mod.CElement
import typings.react.mod.ClassType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.SFC
import typings.react.mod.SFCElement
import typings.std.DataTransfer
import typings.std.Date
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.TouchList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-addons-test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Simulate {
    
    @JSImport("react-addons-test-utils", "Simulate")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-addons-test-utils", "Simulate.blur")
    @js.native
    def blur: EventSimulator = js.native
    @scala.inline
    def blur_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.change")
    @js.native
    def change: EventSimulator = js.native
    @scala.inline
    def change_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("change")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.click")
    @js.native
    def click: EventSimulator = js.native
    @scala.inline
    def click_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("click")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.contextMenu")
    @js.native
    def contextMenu: EventSimulator = js.native
    @scala.inline
    def contextMenu_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.copy")
    @js.native
    def copy: EventSimulator = js.native
    @scala.inline
    def copy_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copy")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.cut")
    @js.native
    def cut: EventSimulator = js.native
    @scala.inline
    def cut_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cut")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.doubleClick")
    @js.native
    def doubleClick: EventSimulator = js.native
    @scala.inline
    def doubleClick_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.drag")
    @js.native
    def drag: EventSimulator = js.native
    
    @JSImport("react-addons-test-utils", "Simulate.dragEnd")
    @js.native
    def dragEnd: EventSimulator = js.native
    @scala.inline
    def dragEnd_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.dragEnter")
    @js.native
    def dragEnter: EventSimulator = js.native
    @scala.inline
    def dragEnter_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.dragExit")
    @js.native
    def dragExit: EventSimulator = js.native
    @scala.inline
    def dragExit_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragExit")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.dragLeave")
    @js.native
    def dragLeave: EventSimulator = js.native
    @scala.inline
    def dragLeave_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.dragOver")
    @js.native
    def dragOver: EventSimulator = js.native
    @scala.inline
    def dragOver_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.dragStart")
    @js.native
    def dragStart: EventSimulator = js.native
    @scala.inline
    def dragStart_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def drag_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drag")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.drop")
    @js.native
    def drop: EventSimulator = js.native
    @scala.inline
    def drop_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.error")
    @js.native
    def error: EventSimulator = js.native
    @scala.inline
    def error_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.focus")
    @js.native
    def focus: EventSimulator = js.native
    @scala.inline
    def focus_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focus")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.input")
    @js.native
    def input: EventSimulator = js.native
    @scala.inline
    def input_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.keyDown")
    @js.native
    def keyDown: EventSimulator = js.native
    @scala.inline
    def keyDown_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.keyPress")
    @js.native
    def keyPress: EventSimulator = js.native
    @scala.inline
    def keyPress_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.keyUp")
    @js.native
    def keyUp: EventSimulator = js.native
    @scala.inline
    def keyUp_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyUp")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.load")
    @js.native
    def load: EventSimulator = js.native
    @scala.inline
    def load_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("load")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.mouseDown")
    @js.native
    def mouseDown: EventSimulator = js.native
    @scala.inline
    def mouseDown_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.mouseEnter")
    @js.native
    def mouseEnter: EventSimulator = js.native
    @scala.inline
    def mouseEnter_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseEnter")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.mouseLeave")
    @js.native
    def mouseLeave: EventSimulator = js.native
    @scala.inline
    def mouseLeave_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseLeave")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.mouseMove")
    @js.native
    def mouseMove: EventSimulator = js.native
    @scala.inline
    def mouseMove_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseMove")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.mouseOut")
    @js.native
    def mouseOut: EventSimulator = js.native
    @scala.inline
    def mouseOut_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseOut")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.mouseOver")
    @js.native
    def mouseOver: EventSimulator = js.native
    @scala.inline
    def mouseOver_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.mouseUp")
    @js.native
    def mouseUp: EventSimulator = js.native
    @scala.inline
    def mouseUp_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.paste")
    @js.native
    def paste: EventSimulator = js.native
    @scala.inline
    def paste_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paste")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.scroll")
    @js.native
    def scroll: EventSimulator = js.native
    @scala.inline
    def scroll_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scroll")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.submit")
    @js.native
    def submit: EventSimulator = js.native
    @scala.inline
    def submit_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("submit")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.touchCancel")
    @js.native
    def touchCancel: EventSimulator = js.native
    @scala.inline
    def touchCancel_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchCancel")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.touchEnd")
    @js.native
    def touchEnd: EventSimulator = js.native
    @scala.inline
    def touchEnd_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.touchMove")
    @js.native
    def touchMove: EventSimulator = js.native
    @scala.inline
    def touchMove_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchMove")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.touchStart")
    @js.native
    def touchStart: EventSimulator = js.native
    @scala.inline
    def touchStart_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchStart")(x.asInstanceOf[js.Any])
    
    @JSImport("react-addons-test-utils", "Simulate.wheel")
    @js.native
    def wheel: EventSimulator = js.native
    @scala.inline
    def wheel_=(x: EventSimulator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wheel")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def createRenderer(): ShallowRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")().asInstanceOf[ShallowRenderer]
  
  @scala.inline
  def findAllInRenderedTree(root: Component[js.Any, js.Object, js.Any], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllInRenderedTree")(root.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactInstance]]
  
  @scala.inline
  def findRenderedComponentWithType[T /* <: Component[js.Any, js.Object, js.Any] */, C /* <: ComponentClass[js.Any, ComponentState] */](root: Component[js.Any, js.Object, js.Any], `type`: ClassType[js.Any, T, C]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderedComponentWithType")(root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def findRenderedDOMComponentWithClass(root: Component[js.Any, js.Object, js.Any], className: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderedDOMComponentWithClass")(root.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @scala.inline
  def findRenderedDOMComponentWithTag(root: Component[js.Any, js.Object, js.Any], tagName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderedDOMComponentWithTag")(root.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @scala.inline
  def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompositeComponent")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.Component<any, {}, any> */ Boolean]
  
  @scala.inline
  def isCompositeComponentWithType[T /* <: Component[js.Any, js.Object, js.Any] */, C /* <: ComponentClass[js.Any, ComponentState] */](instance: ReactInstance, `type`: ClassType[js.Any, T, C]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompositeComponentWithType")(instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMComponent")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
  
  @scala.inline
  def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactHTMLElement<T> */ Boolean]
  @scala.inline
  def isElementOfType[P](element: ReactElement, `type`: SFC[P]): /* is react.react.SFCElement<P> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.SFCElement<P> */ Boolean]
  @scala.inline
  def isElementOfType[P, T /* <: Component[P, js.Object, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.CElement<P, T> */ Boolean]
  
  @scala.inline
  def isElementOfType_P_DOMAttributesObjectT_Element[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.DOMElement<P, T> */ Boolean]
  
  @scala.inline
  def mockComponent(mocked: MockedComponentClass): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mockComponent")(mocked.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def mockComponent(mocked: MockedComponentClass, mockTagName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mockComponent")(mocked.asInstanceOf[js.Any], mockTagName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def renderIntoDocument(element: SFCElement[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def renderIntoDocument[T /* <: Component[js.Any, js.Object, js.Any] */](element: CElement[js.Any, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def renderIntoDocument[T /* <: Element */](element: DOMElement[js.Any, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def renderIntoDocument[P](element: ReactElement): (Component[P, js.Object, js.Any]) | Element | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[(Component[P, js.Object, js.Any]) | Element | Unit]
  
  @scala.inline
  def scryRenderedComponentsWithType[T /* <: Component[js.Any, js.Object, js.Any] */, C /* <: ComponentClass[js.Any, ComponentState] */](root: Component[js.Any, js.Object, js.Any], `type`: ClassType[js.Any, T, C]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scryRenderedComponentsWithType")(root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def scryRenderedDOMComponentsWithClass(root: Component[js.Any, js.Object, js.Any], className: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("scryRenderedDOMComponentsWithClass")(root.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  @scala.inline
  def scryRenderedDOMComponentsWithTag(root: Component[js.Any, js.Object, js.Any], tagName: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("scryRenderedDOMComponentsWithTag")(root.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  type EventSimulator = js.Function2[
    /* element */ Element | (Component[js.Any, js.Object, js.Any]), 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    Unit
  ]
  
  @js.native
  trait MockedComponentClass
    extends StObject
       with Instantiable0[js.Any]
  
  trait OptionalEventProperties extends StObject {
    
    var bubbles: js.UndefOr[Boolean] = js.undefined
    
    var cancelable: js.UndefOr[Boolean] = js.undefined
    
    var currentTarget: js.UndefOr[EventTarget] = js.undefined
    
    var defaultPrevented: js.UndefOr[Boolean] = js.undefined
    
    var eventPhase: js.UndefOr[Double] = js.undefined
    
    var isTrusted: js.UndefOr[Boolean] = js.undefined
    
    var nativeEvent: js.UndefOr[Event] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var target: js.UndefOr[EventTarget] = js.undefined
    
    var timeStamp: js.UndefOr[Date] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OptionalEventProperties {
    
    @scala.inline
    def apply(): OptionalEventProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalEventProperties]
    }
    
    @scala.inline
    implicit class OptionalEventPropertiesMutableBuilder[Self <: OptionalEventProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      @scala.inline
      def setNativeEvent(value: Event): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeEventUndefined: Self = StObject.set(x, "nativeEvent", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ShallowRenderer extends StObject {
    
    def getRenderOutput[E /* <: ReactElement */](): E = js.native
    
    def render(element: ReactElement): Unit = js.native
    def render(element: ReactElement, context: js.Any): Unit = js.native
    
    def unmount(): Unit = js.native
  }
  
  trait SyntheticEventData
    extends StObject
       with OptionalEventProperties {
    
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    var button: js.UndefOr[Double] = js.undefined
    
    var buttons: js.UndefOr[Double] = js.undefined
    
    var changedTouches: js.UndefOr[TouchList] = js.undefined
    
    var charCode: js.UndefOr[Boolean] = js.undefined
    
    var clientX: js.UndefOr[Double] = js.undefined
    
    var clientY: js.UndefOr[Double] = js.undefined
    
    var clipboardData: js.UndefOr[DataTransfer] = js.undefined
    
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    var deltaMode: js.UndefOr[Double] = js.undefined
    
    var deltaX: js.UndefOr[Double] = js.undefined
    
    var deltaY: js.UndefOr[Double] = js.undefined
    
    var deltaZ: js.UndefOr[Double] = js.undefined
    
    var detail: js.UndefOr[Double] = js.undefined
    
    var getModifierState: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var keyCode: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[Double] = js.undefined
    
    var metaKey: js.UndefOr[Boolean] = js.undefined
    
    var pageX: js.UndefOr[Double] = js.undefined
    
    var pageY: js.UndefOr[Double] = js.undefined
    
    var relatedTarget: js.UndefOr[EventTarget] = js.undefined
    
    var repeat: js.UndefOr[Boolean] = js.undefined
    
    var screenX: js.UndefOr[Double] = js.undefined
    
    var screenY: js.UndefOr[Double] = js.undefined
    
    var shiftKey: js.UndefOr[Boolean] = js.undefined
    
    var targetTouches: js.UndefOr[TouchList] = js.undefined
    
    var touches: js.UndefOr[TouchList] = js.undefined
    
    var view: js.UndefOr[AbstractView] = js.undefined
    
    var which: js.UndefOr[Double] = js.undefined
  }
  object SyntheticEventData {
    
    @scala.inline
    def apply(): SyntheticEventData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyntheticEventData]
    }
    
    @scala.inline
    implicit class SyntheticEventDataMutableBuilder[Self <: SyntheticEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      @scala.inline
      def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setChangedTouches(value: TouchList): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
      
      @scala.inline
      def setCharCode(value: Boolean): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      @scala.inline
      def setClipboardData(value: DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardDataUndefined: Self = StObject.set(x, "clipboardData", js.undefined)
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      @scala.inline
      def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaModeUndefined: Self = StObject.set(x, "deltaMode", js.undefined)
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
      
      @scala.inline
      def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaZUndefined: Self = StObject.set(x, "deltaZ", js.undefined)
      
      @scala.inline
      def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setGetModifierState(value: /* key */ String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetModifierStateUndefined: Self = StObject.set(x, "getModifierState", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      @scala.inline
      def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
      
      @scala.inline
      def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      @scala.inline
      def setTargetTouches(value: TouchList): Self = StObject.set(x, "targetTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTouchesUndefined: Self = StObject.set(x, "targetTouches", js.undefined)
      
      @scala.inline
      def setTouches(value: TouchList): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
      
      @scala.inline
      def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      @scala.inline
      def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
    }
  }
}
