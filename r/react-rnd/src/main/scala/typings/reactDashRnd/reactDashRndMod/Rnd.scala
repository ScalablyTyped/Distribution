package typings.reactDashRnd.reactDashRndMod

import typings.reDashResizable.reDashResizableMod.Resizable
import typings.react.NativeMouseEvent
import typings.react.reactMod.Component
import typings.reactDashRnd.$TODO
import typings.reactDashRnd.Anon_Height
import typings.reactDashRnd.Anon_HeightWidth
import typings.reactDashRnd.Anon_HeightWidthNumber
import typings.reactDashRnd.Anon_Left
import typings.reactDashRnd.Anon_X
import typings.reactDashRnd.reactDashRndNumbers.`false`
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-rnd", "Rnd")
@js.native
class Rnd protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  var draggable: $TODO = js.native
  var resizable: Resizable = js.native
  var resizing: Boolean = js.native
  var resizingPosition: Anon_X = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRnd(): Unit = js.native
  def getDraggablePosition(): Anon_X = js.native
  def getMaxSizesFromProps(): MaxSize = js.native
  def getOffsetFromParent(): Anon_Left = js.native
  def getOffsetHeight(boundary: HTMLElement): Double = js.native
  def getOffsetWidth(boundary: HTMLElement): Double = js.native
  def getParent(): js.Any = js.native
  def getParentSize(): Anon_Height = js.native
  def getSelfElement(): HTMLDivElement | Null = js.native
  def onDrag(e: RndDragEvent, data: DraggableData): Unit = js.native
  def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
  def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  def onResize(
    e: MouseEvent,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ js.Any,
    elementRef: HTMLDivElement,
    delta: Anon_HeightWidth
  ): Unit = js.native
  def onResize(
    e: TouchEvent,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ js.Any,
    elementRef: HTMLDivElement,
    delta: Anon_HeightWidth
  ): Unit = js.native
  def onResizeStart(
    e: typings.react.reactMod.MouseEvent[HTMLDivElement, NativeMouseEvent],
    dir: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ js.Any,
    elementRef: HTMLDivElement
  ): Unit = js.native
  def onResizeStart(
    e: typings.react.reactMod.TouchEvent[HTMLDivElement],
    dir: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ js.Any,
    elementRef: HTMLDivElement
  ): Unit = js.native
  def onResizeStop(
    e: MouseEvent,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ js.Any,
    elementRef: HTMLDivElement,
    delta: Anon_HeightWidth
  ): Unit = js.native
  def onResizeStop(
    e: TouchEvent,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ js.Any,
    elementRef: HTMLDivElement,
    delta: Anon_HeightWidth
  ): Unit = js.native
  def refDraggable(c: js.Any): Unit = js.native
  def refResizable(): Unit = js.native
  def refResizable(c: Resizable): Unit = js.native
  def updatePosition(position: Position): Unit = js.native
  def updateSize(size: Anon_HeightWidthNumber): Unit = js.native
}

/* static members */
@JSImport("react-rnd", "Rnd")
@js.native
object Rnd extends js.Object {
  var defaultProps: DefaultProps = js.native
}

