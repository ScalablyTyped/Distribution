package typings.reactDashRange

import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.RefObject
import typings.reactDashRange.libRangeMod.Range
import typings.reactDashRange.libTypesMod.IProps
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range/lib/Range", JSImport.Namespace)
@js.native
object libRangeMod extends js.Object {
  @js.native
  trait Range
    extends Component[IProps, js.Object, js.Any] {
    @JSName("state")
    var state_Range: Anon_DraggedThumbIndex = js.native
    var trackRef: RefObject[HTMLElement] = js.native
    def addMouseEvents(e: MouseEvent): Unit = js.native
    def addTouchEvents(e: TouchEvent): Unit = js.native
    @JSName("componentDidMount")
    def componentDidMount_MRange(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRange(prevProps: IProps): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRange(): Unit = js.native
    def fireOnFinalChange(): Unit = js.native
    def getOffsets(): js.Array[Anon_X] = js.native
    def getTargetIndex(e: Event): Double = js.native
    def getThumbs(): js.Array[Element] = js.native
    def normalizeValue(value: Double, index: Double): Double = js.native
    def onEnd(e: Event): Unit = js.native
    def onKeyDown(e: KeyboardEvent[Element]): Unit = js.native
    def onKeyUp(e: KeyboardEvent[Element]): Unit = js.native
    def onMouseDownTrack(e: typings.react.reactMod.MouseEvent[Element, MouseEvent]): Unit = js.native
    def onMouseMove(e: MouseEvent): Unit = js.native
    def onMouseOrTouchStart(e: MouseEvent with TouchEvent): Unit = js.native
    def onMove(clientX: Double, clientY: Double): js.UndefOr[Null] = js.native
    def onTouchMove(e: TouchEvent): Unit = js.native
    def onTouchStartTrack(e: typings.react.reactMod.TouchEvent[Element]): Unit = js.native
    def onWindowResize(): Unit = js.native
    def schdOnEnd(e: Event): Unit = js.native
    def schdOnMouseMove(e: MouseEvent): Unit = js.native
    def schdOnTouchMove(e: TouchEvent): Unit = js.native
    def schdOnWindowResize(): Unit = js.native
  }
  
  @js.native
  class default protected () extends Range {
    def this(props: IProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_AllowOverlap = js.native
  }
  
}

