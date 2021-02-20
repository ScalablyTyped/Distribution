package typings.reactDom

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
import typings.reactDom.testUtilsMod.EventSimulator
import typings.reactDom.testUtilsMod.MockedComponentClass
import typings.reactDom.testUtilsMod.ShallowRenderer
import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofReactTestUtils extends StObject {
    
    val Simulate: TypeofSimulate = js.native
    
    def act(callback: js.Function0[js.UndefOr[Unit]]): Unit = js.native
    @JSName("act")
    def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    
    def createRenderer(): ShallowRenderer = js.native
    
    def findAllInRenderedTree(root: Component[_, js.Object, _], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
    
    def findRenderedComponentWithType[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](root: Component[_, js.Object, _], `type`: ClassType[_, T, C]): T = js.native
    
    def findRenderedDOMComponentWithClass(root: Component[_, js.Object, _], className: String): Element = js.native
    
    def findRenderedDOMComponentWithTag(root: Component[_, js.Object, _], tagName: String): Element = js.native
    
    def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = js.native
    
    def isCompositeComponentWithType[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
    
    def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = js.native
    
    def isElement(element: js.Any): Boolean = js.native
    
    def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
    def isElementOfType[P](element: ReactElement, `type`: SFC[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
    def isElementOfType[P, T /* <: Component[P, js.Object, _] */, C /* <: ComponentClass[P, ComponentState] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
    @JSName("isElementOfType")
    def isElementOfType_P_DOMAttributesObjectT_Element[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
    
    def mockComponent(mocked: MockedComponentClass): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
    def mockComponent(mocked: MockedComponentClass, mockTagName: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
    
    def renderIntoDocument(element: SFCElement[_]): Unit = js.native
    def renderIntoDocument[T /* <: Element */](element: DOMElement[_, T]): T = js.native
    def renderIntoDocument[P](element: ReactElement): (Component[P, js.Object, _]) | Element | Unit = js.native
    def renderIntoDocument[P, T /* <: Component[P, js.Object, _] */](element: CElement[P, T]): T = js.native
    
    def scryRenderedComponentsWithType[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](root: Component[_, js.Object, _], `type`: ClassType[_, T, C]): js.Array[T] = js.native
    
    def scryRenderedDOMComponentsWithClass(root: Component[_, js.Object, _], className: String): js.Array[Element] = js.native
    
    def scryRenderedDOMComponentsWithTag(root: Component[_, js.Object, _], tagName: String): js.Array[Element] = js.native
  }
  
  @js.native
  trait TypeofSimulate extends StObject {
    
    val abort: EventSimulator = js.native
    
    val animationEnd: EventSimulator = js.native
    
    val animationIteration: EventSimulator = js.native
    
    val animationStart: EventSimulator = js.native
    
    val blur: EventSimulator = js.native
    
    val canPlay: EventSimulator = js.native
    
    val canPlayThrough: EventSimulator = js.native
    
    val change: EventSimulator = js.native
    
    val click: EventSimulator = js.native
    
    val compositionEnd: EventSimulator = js.native
    
    val compositionStart: EventSimulator = js.native
    
    val compositionUpdate: EventSimulator = js.native
    
    val contextMenu: EventSimulator = js.native
    
    val copy: EventSimulator = js.native
    
    val cut: EventSimulator = js.native
    
    val doubleClick: EventSimulator = js.native
    
    val drag: EventSimulator = js.native
    
    val dragEnd: EventSimulator = js.native
    
    val dragEnter: EventSimulator = js.native
    
    val dragExit: EventSimulator = js.native
    
    val dragLeave: EventSimulator = js.native
    
    val dragOver: EventSimulator = js.native
    
    val dragStart: EventSimulator = js.native
    
    val drop: EventSimulator = js.native
    
    val durationChange: EventSimulator = js.native
    
    val emptied: EventSimulator = js.native
    
    val encrypted: EventSimulator = js.native
    
    val ended: EventSimulator = js.native
    
    val error: EventSimulator = js.native
    
    val focus: EventSimulator = js.native
    
    val input: EventSimulator = js.native
    
    val invalid: EventSimulator = js.native
    
    val keyDown: EventSimulator = js.native
    
    val keyPress: EventSimulator = js.native
    
    val keyUp: EventSimulator = js.native
    
    val load: EventSimulator = js.native
    
    val loadStart: EventSimulator = js.native
    
    val loadedData: EventSimulator = js.native
    
    val loadedMetadata: EventSimulator = js.native
    
    val mouseDown: EventSimulator = js.native
    
    val mouseEnter: EventSimulator = js.native
    
    val mouseLeave: EventSimulator = js.native
    
    val mouseMove: EventSimulator = js.native
    
    val mouseOut: EventSimulator = js.native
    
    val mouseOver: EventSimulator = js.native
    
    val mouseUp: EventSimulator = js.native
    
    val paste: EventSimulator = js.native
    
    val pause: EventSimulator = js.native
    
    val play: EventSimulator = js.native
    
    val playing: EventSimulator = js.native
    
    val progress: EventSimulator = js.native
    
    val rateChange: EventSimulator = js.native
    
    val scroll: EventSimulator = js.native
    
    val seeked: EventSimulator = js.native
    
    val seeking: EventSimulator = js.native
    
    val select: EventSimulator = js.native
    
    val stalled: EventSimulator = js.native
    
    val submit: EventSimulator = js.native
    
    val suspend: EventSimulator = js.native
    
    val timeUpdate: EventSimulator = js.native
    
    val touchCancel: EventSimulator = js.native
    
    val touchEnd: EventSimulator = js.native
    
    val touchMove: EventSimulator = js.native
    
    val touchStart: EventSimulator = js.native
    
    val transitionEnd: EventSimulator = js.native
    
    val volumeChange: EventSimulator = js.native
    
    val waiting: EventSimulator = js.native
    
    val wheel: EventSimulator = js.native
  }
  object TypeofSimulate {
    
    @scala.inline
    def apply(
      abort: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      animationEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      animationIteration: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      animationStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      blur: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      canPlay: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      canPlayThrough: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      change: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      click: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      compositionEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      compositionStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      compositionUpdate: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      contextMenu: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      copy: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      cut: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      doubleClick: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      drag: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragEnter: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragExit: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragLeave: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragOver: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      dragStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      drop: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      durationChange: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      emptied: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      encrypted: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      ended: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      error: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      focus: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      input: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      invalid: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      keyDown: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      keyPress: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      keyUp: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      load: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      loadStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      loadedData: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      loadedMetadata: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseDown: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseEnter: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseLeave: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseMove: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseOut: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseOver: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      mouseUp: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      paste: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      pause: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      play: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      playing: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      progress: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      rateChange: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      scroll: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      seeked: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      seeking: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      select: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      stalled: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      submit: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      suspend: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      timeUpdate: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchCancel: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchMove: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      touchStart: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      transitionEnd: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      volumeChange: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      waiting: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit,
      wheel: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
    ): TypeofSimulate = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[TypeofSimulate]
    }
    
    @scala.inline
    implicit class TypeofSimulateMutableBuilder[Self <: TypeofSimulate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationEnd(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationIteration(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationStart(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlay(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlayThrough(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClick(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionEnd(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionStart(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionUpdate(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextMenu(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopy(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCut(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoubleClick(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrag(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnd(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnter(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragExit(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragLeave(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragOver(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragStart(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrop(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDurationChange(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptied(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypted(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnded(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocus(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInput(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalid(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyDown(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyPress(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyUp(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoad(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadStart(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedData(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedMetadata(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseDown(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseEnter(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseLeave(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMove(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOut(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOver(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseUp(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPaste(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPause(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlay(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaying(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgress(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRateChange(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScroll(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeked(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeking(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelect(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStalled(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmit(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuspend(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeUpdate(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchCancel(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchEnd(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchMove(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchStart(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransitionEnd(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVolumeChange(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWaiting(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWheel(
        value: (/* element */ Element | (Component[js.Any, js.Object, js.Any]), /* eventData */ js.UndefOr[SyntheticEventData]) => Unit
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
}
