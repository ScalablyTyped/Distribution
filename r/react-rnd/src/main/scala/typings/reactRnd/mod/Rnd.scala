package typings.reactRnd.mod

import typings.reResizable.mod.Resizable
import typings.reResizable.mod.ResizeDirection
import typings.react.mod.Component
import typings.react.mod.NativeMouseEvent
import typings.reactRnd.anon.Current
import typings.reactRnd.anon.Height
import typings.reactRnd.anon.HeightWidth
import typings.reactRnd.anon.Left
import typings.reactRnd.anon.Top
import typings.reactRnd.anon.Width
import typings.reactRnd.anon.X
import typings.reactRnd.reactRndBooleans.`false`
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-rnd", "Rnd")
@js.native
class Rnd protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MRnd(): Unit = js.native
  
  var draggable: TODO = js.native
  
  def getDraggablePosition(): X = js.native
  
  def getMaxSizesFromProps(): MaxSize = js.native
  
  def getOffsetHeight(boundary: HTMLElement): Double = js.native
  
  def getOffsetWidth(boundary: HTMLElement): Double = js.native
  
  def getParent(): js.Any = js.native
  
  def getParentSize(): Height = js.native
  
  def getSelfElement(): HTMLElement | Null = js.native
  
  var offsetFromParent: Left = js.native
  
  def onDrag(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  
  def onDragStart(e: RndDragEvent, data: DraggableData): Unit = js.native
  
  def onDragStop(e: RndDragEvent, data: DraggableData): `false` | Unit = js.native
  
  def onResize(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
  def onResize(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
  
  def onResizeStart(
    e: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent],
    dir: ResizeDirection,
    elementRef: HTMLElement
  ): Unit = js.native
  def onResizeStart(e: typings.react.mod.TouchEvent[HTMLElement], dir: ResizeDirection, elementRef: HTMLElement): Unit = js.native
  
  def onResizeStop(e: MouseEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
  def onResizeStop(e: TouchEvent, direction: ResizeDirection, elementRef: HTMLElement, delta: Width): Unit = js.native
  
  def refDraggable(c: js.Any): Unit = js.native
  
  def refResizable(): Unit = js.native
  def refResizable(c: Resizable): Unit = js.native
  
  var resizable: Resizable = js.native
  
  var resizableElement: Current = js.native
  
  var resizing: Boolean = js.native
  
  var resizingPosition: X = js.native
  
  def updateOffsetFromParent(): js.UndefOr[Top] = js.native
  
  def updatePosition(position: Position): Unit = js.native
  
  def updateSize(size: HeightWidth): Unit = js.native
}
/* static members */
@JSImport("react-rnd", "Rnd")
@js.native
object Rnd extends js.Object {
  
  var defaultProps: DefaultProps = js.native
}
