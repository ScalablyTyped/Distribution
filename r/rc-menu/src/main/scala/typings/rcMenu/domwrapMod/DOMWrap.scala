package typings.rcMenu.domwrapMod

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMWrap
  extends Component[DOMWrapProps, DOMWrapState, js.Any] {
  
  var cancelFrameId: Double = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MDOMWrap(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDOMWrap(): Unit = js.native
  
  def getMenuItemNodes(): js.Array[HTMLElement] = js.native
  
  def getOverflowedSubMenuItem(keyPrefix: String, overflowedItems: js.Array[ReactElement]): ReactElement = js.native
  def getOverflowedSubMenuItem(keyPrefix: String, overflowedItems: js.Array[ReactElement], renderPlaceholder: Boolean): ReactElement = js.native
  
  def handleResize(): Unit = js.native
  
  var menuItemSizes: js.Array[Double] = js.native
  
  var mutationObserver: js.Any = js.native
  
  var originalTotalWidth: Double = js.native
  
  var overflowedIndicatorWidth: Double = js.native
  
  var overflowedItems: js.Array[ReactElement] = js.native
  
  def renderChildren(children: js.Array[ReactElement]): js.Array[ReactElement] = js.native
  
  var resizeObserver: js.Any = js.native
  
  def setChildrenWidthAndResize(): Unit = js.native
}
