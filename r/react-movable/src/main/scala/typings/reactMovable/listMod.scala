package typings.reactMovable

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.RefObject
import typings.react.mod.WheelEvent
import typings.reactMovable.anon.Canceled
import typings.reactMovable.anon.InitialX
import typings.reactMovable.anon.ScrollingSpeed
import typings.reactMovable.typesMod.IProps
import typings.reactMovable.typesMod.TEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("react-movable/lib/List", JSImport.Default)
  @js.native
  class default[Value] protected () extends List[Value] {
    def this(props: IProps[Value]) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-movable/lib/List", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-movable/lib/List", "default.defaultProps.lockVertically")
      @js.native
      def lockVertically: Boolean = js.native
      @scala.inline
      def lockVertically_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lockVertically")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable/lib/List", "default.defaultProps.removableByMove")
      @js.native
      def removableByMove: Boolean = js.native
      @scala.inline
      def removableByMove_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable/lib/List", "default.defaultProps.transitionDuration")
      @js.native
      def transitionDuration: Double = js.native
      @scala.inline
      def transitionDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(x.asInstanceOf[js.Any])
      
      @JSImport("react-movable/lib/List", "default.defaultProps.voiceover")
      @js.native
      def voiceover: Canceled = js.native
      @scala.inline
      def voiceover_=(x: Canceled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("voiceover")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait List[Value]
    extends Component[IProps[Value], js.Object, js.Any] {
    
    var afterIndex: Double = js.native
    
    def animateItems(needle: Double, movedItem: Double, offset: Double): Unit = js.native
    def animateItems(needle: Double, movedItem: Double, offset: Double, animateMovedItem: Boolean): Unit = js.native
    
    def autoScrolling(clientY: Double): Unit = js.native
    
    def calculateOffsets(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MList(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MList(_prevProps: js.Any, prevState: ScrollingSpeed): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MList(): Unit = js.native
    
    def doScrolling(): Unit = js.native
    
    var dropTimeout: js.UndefOr[Double] = js.native
    
    def finishDrop(): Unit = js.native
    
    def getChildren(): js.Array[Element] = js.native
    
    def getTargetIndex(e: TEvent): Double = js.native
    
    def getYOffset(): Double = js.native
    
    var ghostRef: RefObject[HTMLElement] = js.native
    
    var initialYOffset: Double = js.native
    
    def isDraggedItemOutOfBounds(): Boolean = js.native
    
    var itemTranslateOffsets: js.Array[Double] = js.native
    
    var lastListYOffset: Double = js.native
    
    var lastScroll: Double = js.native
    
    var lastYOffset: Double = js.native
    
    var listRef: RefObject[HTMLElement] = js.native
    
    def moveOtherItems(): Unit = js.native
    
    var needle: Double = js.native
    
    def onEnd(e: TouchEvent & MouseEvent): Unit = js.native
    
    def onKeyDown(e: KeyboardEvent[Element]): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    
    def onMouseOrTouchStart(e: MouseEvent & TouchEvent): Unit = js.native
    
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    
    def onStart(target: HTMLElement, clientX: Double, clientY: Double, index: Double): Unit = js.native
    
    def onTouchMove(e: TouchEvent): Unit = js.native
    
    def onWheel(e: WheelEvent[Element]): Unit = js.native
    
    def schdOnEnd(e: Event): Unit = js.native
    
    def schdOnMouseMove(e: MouseEvent): Unit = js.native
    
    def schdOnTouchMove(e: TouchEvent): Unit = js.native
    
    @JSName("state")
    var state_List: InitialX = js.native
    
    var topOffsets: js.Array[Double] = js.native
  }
}
