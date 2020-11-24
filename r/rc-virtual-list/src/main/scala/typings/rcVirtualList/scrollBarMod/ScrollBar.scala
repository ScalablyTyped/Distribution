package typings.rcVirtualList.scrollBarMod

import typings.node.NodeJS.Timeout
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBar
  extends Component[ScrollBarProps, ScrollBarState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MScrollBar(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollBar(prevProps: ScrollBarProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScrollBar(): Unit = js.native
  
  def delayHidden(): Unit = js.native
  
  def getEnableHeightRange(): Double = js.native
  
  def getEnableScrollRange(): Double = js.native
  
  def getSpinHeight(): Double = js.native
  
  def getTop(): Double = js.native
  
  def getVisible(): Boolean = js.native
  
  var moveRaf: Double = js.native
  
  var onContainerMouseDown: MouseEventHandler[Element] = js.native
  
  def onMouseDown(e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
  def onMouseDown(e: TouchEvent): Unit = js.native
  
  def onMouseMove(e: typings.std.MouseEvent): Unit = js.native
  def onMouseMove(e: TouchEvent): Unit = js.native
  
  def onMouseUp(): Unit = js.native
  
  def onScrollbarTouchStart(e: TouchEvent): Unit = js.native
  
  def patchEvents(): Unit = js.native
  
  def removeEvents(): Unit = js.native
  
  var scrollbarRef: RefObject[HTMLDivElement] = js.native
  
  var thumbRef: RefObject[HTMLDivElement] = js.native
  
  var visibleTimeout: Timeout = js.native
}
