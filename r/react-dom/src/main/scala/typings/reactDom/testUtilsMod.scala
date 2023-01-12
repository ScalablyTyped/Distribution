package typings.reactDom

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.AbstractView
import typings.react.mod.CElement
import typings.react.mod.ClassType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.FC
import typings.react.mod.FunctionComponentElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.reactDom.anon.TypeofReactTestUtils
import typings.reactDom.anon.UNDEFINEDVOIDONLY
import typings.std.DataTransfer
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.TouchList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilsMod {
  
  @JSImport("react-dom/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Simulate {
    
    @JSImport("react-dom/test-utils", "Simulate.abort")
    @js.native
    val abort: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.animationEnd")
    @js.native
    val animationEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.animationIteration")
    @js.native
    val animationIteration: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.animationStart")
    @js.native
    val animationStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.blur")
    @js.native
    val blur: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.canPlay")
    @js.native
    val canPlay: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.canPlayThrough")
    @js.native
    val canPlayThrough: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.change")
    @js.native
    val change: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.click")
    @js.native
    val click: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.compositionEnd")
    @js.native
    val compositionEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.compositionStart")
    @js.native
    val compositionStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.compositionUpdate")
    @js.native
    val compositionUpdate: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.contextMenu")
    @js.native
    val contextMenu: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.copy")
    @js.native
    val copy: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.cut")
    @js.native
    val cut: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.doubleClick")
    @js.native
    val doubleClick: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.drag")
    @js.native
    val drag: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragEnd")
    @js.native
    val dragEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragEnter")
    @js.native
    val dragEnter: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragExit")
    @js.native
    val dragExit: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragLeave")
    @js.native
    val dragLeave: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragOver")
    @js.native
    val dragOver: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.dragStart")
    @js.native
    val dragStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.drop")
    @js.native
    val drop: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.durationChange")
    @js.native
    val durationChange: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.emptied")
    @js.native
    val emptied: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.encrypted")
    @js.native
    val encrypted: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.ended")
    @js.native
    val ended: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.error")
    @js.native
    val error: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.focus")
    @js.native
    val focus: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.input")
    @js.native
    val input: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.invalid")
    @js.native
    val invalid: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.keyDown")
    @js.native
    val keyDown: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.keyPress")
    @js.native
    val keyPress: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.keyUp")
    @js.native
    val keyUp: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.load")
    @js.native
    val load: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.loadStart")
    @js.native
    val loadStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.loadedData")
    @js.native
    val loadedData: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.loadedMetadata")
    @js.native
    val loadedMetadata: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseDown")
    @js.native
    val mouseDown: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseEnter")
    @js.native
    val mouseEnter: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseLeave")
    @js.native
    val mouseLeave: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseMove")
    @js.native
    val mouseMove: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseOut")
    @js.native
    val mouseOut: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseOver")
    @js.native
    val mouseOver: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.mouseUp")
    @js.native
    val mouseUp: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.paste")
    @js.native
    val paste: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.pause")
    @js.native
    val pause: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.play")
    @js.native
    val play: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.playing")
    @js.native
    val playing: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.progress")
    @js.native
    val progress: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.rateChange")
    @js.native
    val rateChange: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.scroll")
    @js.native
    val scroll: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.seeked")
    @js.native
    val seeked: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.seeking")
    @js.native
    val seeking: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.select")
    @js.native
    val select: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.stalled")
    @js.native
    val stalled: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.submit")
    @js.native
    val submit: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.suspend")
    @js.native
    val suspend: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.timeUpdate")
    @js.native
    val timeUpdate: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchCancel")
    @js.native
    val touchCancel: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchEnd")
    @js.native
    val touchEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchMove")
    @js.native
    val touchMove: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.touchStart")
    @js.native
    val touchStart: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.transitionEnd")
    @js.native
    val transitionEnd: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.volumeChange")
    @js.native
    val volumeChange: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.waiting")
    @js.native
    val waiting: EventSimulator = js.native
    
    @JSImport("react-dom/test-utils", "Simulate.wheel")
    @js.native
    val wheel: EventSimulator = js.native
  }
  
  inline def act(callback: js.Function0[VoidOrUndefinedOnly]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def act_T[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def createRenderer(): ShallowRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")().asInstanceOf[ShallowRenderer]
  
  inline def findAllInRenderedTree(root: Component[Any, js.Object, Any], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllInRenderedTree")(root.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactInstance]]
  
  inline def findRenderedComponentWithType[T /* <: Component[Any, js.Object, Any] */, C /* <: ComponentClass[Any, ComponentState] */](root: Component[Any, js.Object, Any], `type`: ClassType[Any, T, C]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderedComponentWithType")(root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findRenderedDOMComponentWithClass(root: Component[Any, js.Object, Any], className: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderedDOMComponentWithClass")(root.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def findRenderedDOMComponentWithTag(root: Component[Any, js.Object, Any], tagName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("findRenderedDOMComponentWithTag")(root.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompositeComponent")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.Component<any, {}, any> */ Boolean]
  
  inline def isCompositeComponentWithType[T /* <: Component[Any, js.Object, Any] */, C /* <: ComponentClass[Any, ComponentState] */](instance: ReactInstance, `type`: ClassType[Any, T, C]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompositeComponentWithType")(instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMComponent")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
  
  inline def isElement(element: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactHTMLElement<T> */ Boolean]
  inline def isElementOfType[P](element: ReactElement, `type`: FC[P]): /* is react.react.FunctionComponentElement<P> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.FunctionComponentElement<P> */ Boolean]
  inline def isElementOfType[P, T /* <: Component[P, js.Object, Any] */, C /* <: ComponentClass[P, ComponentState] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.CElement<P, T> */ Boolean]
  
  inline def isElementOfType_PT[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.DOMElement<P, T> */ Boolean]
  
  inline def mockComponent(mocked: MockedComponentClass): TypeofReactTestUtils = ^.asInstanceOf[js.Dynamic].applyDynamic("mockComponent")(mocked.asInstanceOf[js.Any]).asInstanceOf[TypeofReactTestUtils]
  inline def mockComponent(mocked: MockedComponentClass, mockTagName: String): TypeofReactTestUtils = (^.asInstanceOf[js.Dynamic].applyDynamic("mockComponent")(mocked.asInstanceOf[js.Any], mockTagName.asInstanceOf[js.Any])).asInstanceOf[TypeofReactTestUtils]
  
  inline def renderIntoDocument(element: FunctionComponentElement[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def renderIntoDocument[T /* <: Element */](element: DOMElement[Any, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def renderIntoDocument[P](element: ReactElement): (Component[P, js.Object, Any]) | Element | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[(Component[P, js.Object, Any]) | Element | Unit]
  inline def renderIntoDocument[P, T /* <: Component[P, js.Object, Any] */](element: CElement[P, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def scryRenderedComponentsWithType[T /* <: Component[Any, js.Object, Any] */, C /* <: ComponentClass[Any, ComponentState] */](root: Component[Any, js.Object, Any], `type`: ClassType[Any, T, C]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scryRenderedComponentsWithType")(root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def scryRenderedDOMComponentsWithClass(root: Component[Any, js.Object, Any], className: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("scryRenderedDOMComponentsWithClass")(root.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def scryRenderedDOMComponentsWithTag(root: Component[Any, js.Object, Any], tagName: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("scryRenderedDOMComponentsWithTag")(root.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  trait DebugPromiseLike extends StObject {
    
    // the actual then() in here is 0-ary, but that doesn't count as a PromiseLike.
    def `then`(
      onfulfilled: js.Function1[/* value */ scala.Nothing, scala.Nothing],
      onrejected: js.Function1[/* reason */ scala.Nothing, scala.Nothing]
    ): scala.Nothing
  }
  object DebugPromiseLike {
    
    inline def apply(
      `then`: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
    ): DebugPromiseLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
      __obj.asInstanceOf[DebugPromiseLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugPromiseLike] (val x: Self) extends AnyVal {
      
      inline def setThen(
        value: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
      ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
    }
  }
  
  type EventSimulator = js.Function2[
    /* element */ Element | (Component[Any, js.Object, Any]), 
    /* eventData */ js.UndefOr[SyntheticEventData], 
    Unit
  ]
  
  @js.native
  trait MockedComponentClass
    extends StObject
       with Instantiable1[/* props */ Any, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDom.reactDomStrings.Alt
    - typings.reactDom.reactDomStrings.AltGraph
    - typings.reactDom.reactDomStrings.CapsLock
    - typings.reactDom.reactDomStrings.Control
    - typings.reactDom.reactDomStrings.Fn
    - typings.reactDom.reactDomStrings.FnLock
    - typings.reactDom.reactDomStrings.Hyper
    - typings.reactDom.reactDomStrings.Meta
    - typings.reactDom.reactDomStrings.NumLock
    - typings.reactDom.reactDomStrings.ScrollLock
    - typings.reactDom.reactDomStrings.Shift
    - typings.reactDom.reactDomStrings.Super
    - typings.reactDom.reactDomStrings.Symbol
    - typings.reactDom.reactDomStrings.SymbolLock
  */
  trait ModifierKey extends StObject
  object ModifierKey {
    
    inline def Alt: typings.reactDom.reactDomStrings.Alt = "Alt".asInstanceOf[typings.reactDom.reactDomStrings.Alt]
    
    inline def AltGraph: typings.reactDom.reactDomStrings.AltGraph = "AltGraph".asInstanceOf[typings.reactDom.reactDomStrings.AltGraph]
    
    inline def CapsLock: typings.reactDom.reactDomStrings.CapsLock = "CapsLock".asInstanceOf[typings.reactDom.reactDomStrings.CapsLock]
    
    inline def Control: typings.reactDom.reactDomStrings.Control = "Control".asInstanceOf[typings.reactDom.reactDomStrings.Control]
    
    inline def Fn: typings.reactDom.reactDomStrings.Fn = "Fn".asInstanceOf[typings.reactDom.reactDomStrings.Fn]
    
    inline def FnLock: typings.reactDom.reactDomStrings.FnLock = "FnLock".asInstanceOf[typings.reactDom.reactDomStrings.FnLock]
    
    inline def Hyper: typings.reactDom.reactDomStrings.Hyper = "Hyper".asInstanceOf[typings.reactDom.reactDomStrings.Hyper]
    
    inline def Meta: typings.reactDom.reactDomStrings.Meta = "Meta".asInstanceOf[typings.reactDom.reactDomStrings.Meta]
    
    inline def NumLock: typings.reactDom.reactDomStrings.NumLock = "NumLock".asInstanceOf[typings.reactDom.reactDomStrings.NumLock]
    
    inline def ScrollLock: typings.reactDom.reactDomStrings.ScrollLock = "ScrollLock".asInstanceOf[typings.reactDom.reactDomStrings.ScrollLock]
    
    inline def Shift: typings.reactDom.reactDomStrings.Shift = "Shift".asInstanceOf[typings.reactDom.reactDomStrings.Shift]
    
    inline def Super: typings.reactDom.reactDomStrings.Super = "Super".asInstanceOf[typings.reactDom.reactDomStrings.Super]
    
    inline def Symbol: typings.reactDom.reactDomStrings.Symbol = "Symbol".asInstanceOf[typings.reactDom.reactDomStrings.Symbol]
    
    inline def SymbolLock: typings.reactDom.reactDomStrings.SymbolLock = "SymbolLock".asInstanceOf[typings.reactDom.reactDomStrings.SymbolLock]
  }
  
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
    
    var timeStamp: js.UndefOr[js.Date] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OptionalEventProperties {
    
    inline def apply(): OptionalEventProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalEventProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionalEventProperties] (val x: Self) extends AnyVal {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      inline def setNativeEvent(value: Event): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setNativeEventUndefined: Self = StObject.set(x, "nativeEvent", js.undefined)
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ShallowRenderer extends StObject {
    
    /**
      * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
      */
    def getRenderOutput[E /* <: ReactElement */](): E = js.native
    
    /**
      * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
      */
    def render(element: ReactElement): Unit = js.native
    def render(element: ReactElement, context: Any): Unit = js.native
    
    def unmount(): Unit = js.native
  }
  
  trait SyntheticEventData
    extends StObject
       with OptionalEventProperties {
    
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    var button: js.UndefOr[Double] = js.undefined
    
    var buttons: js.UndefOr[Double] = js.undefined
    
    var changedTouches: js.UndefOr[TouchList] = js.undefined
    
    var charCode: js.UndefOr[Double] = js.undefined
    
    var clientX: js.UndefOr[Double] = js.undefined
    
    var clientY: js.UndefOr[Double] = js.undefined
    
    var clipboardData: js.UndefOr[DataTransfer] = js.undefined
    
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    var deltaMode: js.UndefOr[Double] = js.undefined
    
    var deltaX: js.UndefOr[Double] = js.undefined
    
    var deltaY: js.UndefOr[Double] = js.undefined
    
    var deltaZ: js.UndefOr[Double] = js.undefined
    
    var detail: js.UndefOr[Double] = js.undefined
    
    var getModifierState: js.UndefOr[js.Function1[/* key */ ModifierKey, Boolean]] = js.undefined
    
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
    
    inline def apply(): SyntheticEventData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyntheticEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyntheticEventData] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setChangedTouches(value: TouchList): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
      
      inline def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
      
      inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      inline def setCharCodeUndefined: Self = StObject.set(x, "charCode", js.undefined)
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientXUndefined: Self = StObject.set(x, "clientX", js.undefined)
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setClientYUndefined: Self = StObject.set(x, "clientY", js.undefined)
      
      inline def setClipboardData(value: DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
      
      inline def setClipboardDataUndefined: Self = StObject.set(x, "clipboardData", js.undefined)
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setDeltaMode(value: Double): Self = StObject.set(x, "deltaMode", value.asInstanceOf[js.Any])
      
      inline def setDeltaModeUndefined: Self = StObject.set(x, "deltaMode", js.undefined)
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
      
      inline def setDeltaZ(value: Double): Self = StObject.set(x, "deltaZ", value.asInstanceOf[js.Any])
      
      inline def setDeltaZUndefined: Self = StObject.set(x, "deltaZ", js.undefined)
      
      inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setGetModifierState(value: /* key */ ModifierKey => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
      
      inline def setGetModifierStateUndefined: Self = StObject.set(x, "getModifierState", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
      
      inline def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
      
      inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
      
      inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      inline def setTargetTouches(value: TouchList): Self = StObject.set(x, "targetTouches", value.asInstanceOf[js.Any])
      
      inline def setTargetTouchesUndefined: Self = StObject.set(x, "targetTouches", js.undefined)
      
      inline def setTouches(value: TouchList): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
      
      inline def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
      
      inline def setView(value: AbstractView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
      
      inline def setWhichUndefined: Self = StObject.set(x, "which", js.undefined)
    }
  }
  
  // tslint:disable-next-line: void-return
  type VoidOrUndefinedOnly = Unit | UNDEFINEDVOIDONLY
}
