package typings.reResizable.mod

import typings.reResizable.anon.As
import typings.reResizable.anon.Height
import typings.reResizable.anon.HeightWidth
import typings.reResizable.anon.MaxHeight
import typings.reResizable.anon.NewHeight
import typings.reResizable.anon.Width
import typings.reResizable.mod.global.Window
import typings.reResizable.reResizableStrings.column
import typings.reResizable.reResizableStrings.height
import typings.reResizable.reResizableStrings.row
import typings.reResizable.reResizableStrings.width
import typings.reResizable.resizerMod.Direction
import typings.react.mod.Component
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("re-resizable", "Resizable")
@js.native
class Resizable protected ()
  extends Component[ResizableProps, State, js.Any] {
  def this(props: ResizableProps) = this()
  
  def appendBase(): HTMLDivElement | Null = js.native
  
  def bindEvents(): Unit = js.native
  
  def calculateNewMaxFromBoundary(): MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: js.UndefOr[scala.Nothing], maxHeight: Double): MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double): MaxHeight = js.native
  def calculateNewMaxFromBoundary(maxWidth: Double, maxHeight: Double): MaxHeight = js.native
  
  def calculateNewSizeFromAspectRatio(newWidth: Double, newHeight: Double, max: HeightWidth, min: HeightWidth): NewHeight = js.native
  
  def calculateNewSizeFromDirection(clientX: Double, clientY: Double): NewHeight = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MResizable(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MResizable(): Unit = js.native
  
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_height(newSize: String, kind: height): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_height(newSize: Double, kind: height): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_width(newSize: String, kind: width): Double | String = js.native
  @JSName("createSizeForCssProperty")
  def createSizeForCssProperty_width(newSize: Double, kind: width): Double | String = js.native
  
  var flexDir: js.UndefOr[row | column] = js.native
  
  def getParentSize(): Width = js.native
  
  def onMouseMove(event: MouseEvent): Unit = js.native
  def onMouseMove(event: TouchEvent): Unit = js.native
  
  def onMouseUp(event: MouseEvent): Unit = js.native
  def onMouseUp(event: TouchEvent): Unit = js.native
  
  def onResizeStart(event: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent], direction: Direction): Unit = js.native
  def onResizeStart(event: typings.react.mod.TouchEvent[HTMLElement], direction: Direction): Unit = js.native
  
  var parentLeft: Double = js.native
  
  def parentNode: HTMLElement | Null = js.native
  
  var parentTop: Double = js.native
  
  def propsSize: Size = js.native
  
  var ratio: Double = js.native
  
  def ref(): Unit = js.native
  def ref(c: HTMLElement): Unit = js.native
  
  def removeBase(base: HTMLElement): Unit = js.native
  
  def renderResizer(): Element | Null = js.native
  
  var resizable: HTMLElement | Null = js.native
  
  var resizableLeft: Double = js.native
  
  var resizableTop: Double = js.native
  
  def setBoundingClientRect(): Unit = js.native
  
  def size: NumberSize = js.native
  
  def sizeStyle: Height = js.native
  
  var targetLeft: Double = js.native
  
  var targetTop: Double = js.native
  
  def unbindEvents(): Unit = js.native
  
  def updateSize(size: Size): Unit = js.native
  
  def window: Window | Null = js.native
}
/* static members */
@JSImport("re-resizable", "Resizable")
@js.native
object Resizable extends js.Object {
  
  var defaultProps: As = js.native
}
