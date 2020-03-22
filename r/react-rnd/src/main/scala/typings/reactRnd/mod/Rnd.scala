package typings.reactRnd.mod

import typings.reResizable.mod.Resizable
import typings.reResizable.mod.ResizeDirection
import typings.react.mod.Component
import typings.react.mod.NativeMouseEvent
import typings.reactRnd.AnonHeight
import typings.reactRnd.AnonHeightWidth
import typings.reactRnd.AnonLeft
import typings.reactRnd.AnonTop
import typings.reactRnd.AnonWidth
import typings.reactRnd.AnonX
import typings.reactRnd.reactRndBooleans.`false`
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
  var draggable: TODO = js.native
  var offsetFromParent: AnonLeft = js.native
  var resizable: Resizable = js.native
  var resizing: Boolean = js.native
  var resizingPosition: AnonX = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRnd(): Unit = js.native
  def getDraggablePosition(): AnonX = js.native
  def getMaxSizesFromProps(): MaxSize = js.native
  def getOffsetHeight(boundary: HTMLElement): Double = js.native
  def getOffsetWidth(boundary: HTMLElement): Double = js.native
  def getParent(): js.Any = js.native
  def getParentSize(): AnonHeight = js.native
  def getSelfElement(): HTMLDivElement | Null = js.native
  def onDrag(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
  def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  def onResize(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def onResize(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def onResizeStart(
    e: typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent],
    dir: ResizeDirection,
    elementRef: HTMLDivElement
  ): Unit = js.native
  def onResizeStart(e: typings.react.mod.TouchEvent[HTMLDivElement], dir: ResizeDirection, elementRef: HTMLDivElement): Unit = js.native
  def onResizeStop(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def onResizeStop(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLDivElement, delta: AnonWidth): Unit = js.native
  def refDraggable(c: js.Any): Unit = js.native
  def refResizable(): Unit = js.native
  def refResizable(c: Resizable): Unit = js.native
  def updateOffsetFromParent(): js.UndefOr[AnonTop] = js.native
  def updatePosition(position: Position): Unit = js.native
  def updateSize(size: AnonHeightWidth): Unit = js.native
}

/* static members */
@JSImport("react-rnd", "Rnd")
@js.native
object Rnd extends js.Object {
  var defaultProps: DefaultProps = js.native
}

