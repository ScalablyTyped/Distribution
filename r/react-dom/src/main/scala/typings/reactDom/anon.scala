package typings.reactDom

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
import typings.reactDom.testUtilsMod.EventSimulator
import typings.reactDom.testUtilsMod.MockedComponentClass
import typings.reactDom.testUtilsMod.ShallowRenderer
import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.reactDom.testUtilsMod.VoidOrUndefinedOnly
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofReactTestUtils extends StObject {
    
    val Simulate: TypeofSimulate = js.native
    
    def act(callback: js.Function0[VoidOrUndefinedOnly]): js.Promise[Unit] = js.native
    @JSName("act")
    def act_T[T](callback: js.Function0[T | js.Promise[T]]): js.Promise[T] = js.native
    
    def createRenderer(): ShallowRenderer = js.native
    
    def findAllInRenderedTree(root: Component[Any, js.Object, Any], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
    
    def findRenderedComponentWithType[T /* <: Component[Any, js.Object, Any] */, C /* <: ComponentClass[Any, ComponentState] */](root: Component[Any, js.Object, Any], `type`: ClassType[Any, T, C]): T = js.native
    
    def findRenderedDOMComponentWithClass(root: Component[Any, js.Object, Any], className: String): Element = js.native
    
    def findRenderedDOMComponentWithTag(root: Component[Any, js.Object, Any], tagName: String): Element = js.native
    
    def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = js.native
    
    def isCompositeComponentWithType[T /* <: Component[Any, js.Object, Any] */, C /* <: ComponentClass[Any, ComponentState] */](instance: ReactInstance, `type`: ClassType[Any, T, C]): Boolean = js.native
    
    def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = js.native
    
    def isElement(element: Any): Boolean = js.native
    
    def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
    def isElementOfType[P](element: ReactElement, `type`: FC[P]): /* is react.react.FunctionComponentElement<P> */ Boolean = js.native
    def isElementOfType[P, T /* <: Component[P, js.Object, Any] */, C /* <: ComponentClass[P, ComponentState] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
    @JSName("isElementOfType")
    def isElementOfType_PT[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
    
    def mockComponent(mocked: MockedComponentClass): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
    def mockComponent(mocked: MockedComponentClass, mockTagName: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
    
    def renderIntoDocument(element: FunctionComponentElement[Any]): Unit = js.native
    def renderIntoDocument[T /* <: Element */](element: DOMElement[Any, T]): T = js.native
    def renderIntoDocument[P](element: ReactElement): (Component[P, js.Object, Any]) | Element | Unit = js.native
    def renderIntoDocument[P, T /* <: Component[P, js.Object, Any] */](element: CElement[P, T]): T = js.native
    
    def scryRenderedComponentsWithType[T /* <: Component[Any, js.Object, Any] */, C /* <: ComponentClass[Any, ComponentState] */](root: Component[Any, js.Object, Any], `type`: ClassType[Any, T, C]): js.Array[T] = js.native
    
    def scryRenderedDOMComponentsWithClass(root: Component[Any, js.Object, Any], className: String): js.Array[Element] = js.native
    
    def scryRenderedDOMComponentsWithTag(root: Component[Any, js.Object, Any], tagName: String): js.Array[Element] = js.native
  }
  
  trait TypeofSimulate extends StObject {
    
    val abort: EventSimulator
    
    val animationEnd: EventSimulator
    
    val animationIteration: EventSimulator
    
    val animationStart: EventSimulator
    
    val blur: EventSimulator
    
    val canPlay: EventSimulator
    
    val canPlayThrough: EventSimulator
    
    val change: EventSimulator
    
    val click: EventSimulator
    
    val compositionEnd: EventSimulator
    
    val compositionStart: EventSimulator
    
    val compositionUpdate: EventSimulator
    
    val contextMenu: EventSimulator
    
    val copy: EventSimulator
    
    val cut: EventSimulator
    
    val doubleClick: EventSimulator
    
    val drag: EventSimulator
    
    val dragEnd: EventSimulator
    
    val dragEnter: EventSimulator
    
    val dragExit: EventSimulator
    
    val dragLeave: EventSimulator
    
    val dragOver: EventSimulator
    
    val dragStart: EventSimulator
    
    val drop: EventSimulator
    
    val durationChange: EventSimulator
    
    val emptied: EventSimulator
    
    val encrypted: EventSimulator
    
    val ended: EventSimulator
    
    val error: EventSimulator
    
    val focus: EventSimulator
    
    val input: EventSimulator
    
    val invalid: EventSimulator
    
    val keyDown: EventSimulator
    
    val keyPress: EventSimulator
    
    val keyUp: EventSimulator
    
    val load: EventSimulator
    
    val loadStart: EventSimulator
    
    val loadedData: EventSimulator
    
    val loadedMetadata: EventSimulator
    
    val mouseDown: EventSimulator
    
    val mouseEnter: EventSimulator
    
    val mouseLeave: EventSimulator
    
    val mouseMove: EventSimulator
    
    val mouseOut: EventSimulator
    
    val mouseOver: EventSimulator
    
    val mouseUp: EventSimulator
    
    val paste: EventSimulator
    
    val pause: EventSimulator
    
    val play: EventSimulator
    
    val playing: EventSimulator
    
    val progress: EventSimulator
    
    val rateChange: EventSimulator
    
    val scroll: EventSimulator
    
    val seeked: EventSimulator
    
    val seeking: EventSimulator
    
    val select: EventSimulator
    
    val stalled: EventSimulator
    
    val submit: EventSimulator
    
    val suspend: EventSimulator
    
    val timeUpdate: EventSimulator
    
    val touchCancel: EventSimulator
    
    val touchEnd: EventSimulator
    
    val touchMove: EventSimulator
    
    val touchStart: EventSimulator
    
    val transitionEnd: EventSimulator
    
    val volumeChange: EventSimulator
    
    val waiting: EventSimulator
    
    val wheel: EventSimulator
  }
  object TypeofSimulate {
    
    inline def apply(
      abort: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      animationEnd: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      animationIteration: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      animationStart: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      blur: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      canPlay: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      canPlayThrough: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      change: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      click: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      compositionEnd: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      compositionStart: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      compositionUpdate: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      contextMenu: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      copy: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      cut: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      doubleClick: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      drag: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragEnd: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragEnter: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragExit: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragLeave: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragOver: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragStart: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      drop: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      durationChange: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      emptied: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      encrypted: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      ended: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      error: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      focus: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      input: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      invalid: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      keyDown: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      keyPress: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      keyUp: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      load: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      loadStart: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      loadedData: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      loadedMetadata: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseDown: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseEnter: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseLeave: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseMove: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseOut: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseOver: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseUp: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      paste: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      pause: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      play: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      playing: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      progress: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      rateChange: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      scroll: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      seeked: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      seeking: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      select: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      stalled: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      submit: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      suspend: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      timeUpdate: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchCancel: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchEnd: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchMove: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchStart: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      transitionEnd: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      volumeChange: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      waiting: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      wheel: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): TypeofSimulate = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[TypeofSimulate]
    }
    
    extension [Self <: TypeofSimulate](x: Self) {
      
      inline def setAbort(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      inline def setAnimationEnd(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      inline def setAnimationIteration(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      inline def setAnimationStart(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      inline def setBlur(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      inline def setCanPlay(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      inline def setCanPlayThrough(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      inline def setChange(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      inline def setClick(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      inline def setCompositionEnd(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      inline def setCompositionStart(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      inline def setCompositionUpdate(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      inline def setContextMenu(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      inline def setCopy(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      inline def setCut(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      inline def setDoubleClick(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      inline def setDrag(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      inline def setDragEnd(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      inline def setDragEnter(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      inline def setDragExit(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      inline def setDragLeave(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      inline def setDragOver(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      inline def setDragStart(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      inline def setDrop(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      inline def setDurationChange(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      inline def setEmptied(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      inline def setEncrypted(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      inline def setEnded(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      inline def setError(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setFocus(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      inline def setInput(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      inline def setInvalid(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      inline def setKeyDown(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      inline def setKeyPress(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      inline def setKeyUp(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      inline def setLoad(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setLoadStart(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      inline def setLoadedData(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      inline def setLoadedMetadata(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      inline def setMouseDown(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      inline def setMouseEnter(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      inline def setMouseLeave(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      inline def setMouseMove(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      inline def setMouseOut(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      inline def setMouseOver(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      inline def setMouseUp(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      inline def setPaste(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      inline def setPause(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      inline def setPlay(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      inline def setPlaying(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      inline def setProgress(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      inline def setRateChange(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      inline def setScroll(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      inline def setSeeked(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      inline def setSeeking(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      inline def setSelect(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      inline def setStalled(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      inline def setSubmit(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      inline def setSuspend(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      inline def setTimeUpdate(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      inline def setTouchCancel(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      inline def setTouchEnd(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      inline def setTouchMove(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      inline def setTouchStart(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      inline def setTransitionEnd(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      inline def setVolumeChange(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      inline def setWaiting(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      inline def setWheel(
        value: (/* element */ Element | (Component[Any, js.Object, Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait UNDEFINEDVOIDONLY extends StObject
}
