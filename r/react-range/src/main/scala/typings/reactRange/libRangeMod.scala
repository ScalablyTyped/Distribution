package typings.reactRange

import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.reactRange.anon.DraggedThumbIndex
import typings.reactRange.anon.X
import typings.reactRange.libTypesMod.Direction
import typings.reactRange.libTypesMod.IProps
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRangeMod {
  
  @JSImport("react-range/lib/Range", JSImport.Default)
  @js.native
  open class default protected () extends Range {
    def this(props: IProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-range/lib/Range", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-range/lib/Range", "default.defaultProps.allowOverlap")
      @js.native
      def allowOverlap: Boolean = js.native
      inline def allowOverlap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowOverlap")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.direction")
      @js.native
      def direction: Direction = js.native
      inline def direction_=(x: Direction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.draggableTrack")
      @js.native
      def draggableTrack: Boolean = js.native
      inline def draggableTrack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggableTrack")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.max")
      @js.native
      def max: Double = js.native
      inline def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.min")
      @js.native
      def min: Double = js.native
      inline def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.rtl")
      @js.native
      def rtl: Boolean = js.native
      inline def rtl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtl")(x.asInstanceOf[js.Any])
      
      @JSImport("react-range/lib/Range", "default.defaultProps.step")
      @js.native
      def step: Double = js.native
      inline def step_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Range
    extends Component[IProps, js.Object, Any] {
    
    def addMouseEvents(e: MouseEvent): Unit = js.native
    
    def addTouchEvents(e: TouchEvent): Unit = js.native
    
    def calculateMarkOffsets(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MRange(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRange(prevProps: IProps, prevState: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRange(): Unit = js.native
    
    def fireOnFinalChange(): Unit = js.native
    
    def getOffsets(): js.Array[X] = js.native
    
    def getTargetIndex(e: Event): Double = js.native
    
    def getThumbs(): js.Array[Element] = js.native
    
    var markRefs: js.UndefOr[js.Array[RefObject[HTMLElement]]] = js.native
    
    def normalizeValue(value: Double, index: Double): Double = js.native
    
    var numOfMarks: js.UndefOr[Double] = js.native
    
    def onEnd(e: Event): js.UndefOr[Null] = js.native
    
    def onKeyDown(e: KeyboardEvent[Element]): Unit = js.native
    
    def onKeyUp(e: KeyboardEvent[Element]): Unit = js.native
    
    def onMouseDownTrack(e: typings.react.mod.MouseEvent[Element, NativeMouseEvent]): Unit = js.native
    
    def onMouseMove(e: MouseEvent): Unit = js.native
    
    def onMouseOrTouchStart(e: MouseEvent & TouchEvent): Unit = js.native
    
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    
    def onResize(): Unit = js.native
    
    def onTouchMove(e: TouchEvent): Unit = js.native
    
    def onTouchStartTrack(e: typings.react.mod.TouchEvent[Element]): Unit = js.native
    
    var resizeObserver: Any = js.native
    
    def schdOnEnd(e: Event): Unit = js.native
    
    def schdOnMouseMove(e: MouseEvent): Unit = js.native
    
    def schdOnTouchMove(e: TouchEvent): Unit = js.native
    
    @JSName("state")
    var state_Range: DraggedThumbIndex = js.native
    
    var thumbRefs: js.Array[RefObject[HTMLElement]] = js.native
    
    var trackRef: RefObject[HTMLElement] = js.native
    
    def updateMarkRefs(props: IProps): Unit = js.native
  }
}
