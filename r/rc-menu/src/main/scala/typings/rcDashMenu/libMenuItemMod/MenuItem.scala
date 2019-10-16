package typings.rcDashMenu.libMenuItemMod

import typings.rcDashMenu.Anon_ManualRef
import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/MenuItem", "MenuItem")
@js.native
class MenuItem ()
  extends Component[MenuItemProps, js.Object, js.Any] {
  var node: HTMLLIElement = js.native
  var onClick: MouseEventHandler[HTMLElement] = js.native
  var onMouseEnter: MouseEventHandler[HTMLElement] = js.native
  var onMouseLeave: MouseEventHandler[HTMLElement] = js.native
  def callRef(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenuItem(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenuItem(prevProps: MenuItemProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMenuItem(): Unit = js.native
  def getActiveClassName(): String = js.native
  def getDisabledClassName(): String = js.native
  def getPrefixCls(): String = js.native
  def getSelectedClassName(): String = js.native
  def onKeyDown(e: KeyboardEvent[HTMLElement]): Boolean = js.native
  def saveNode(node: HTMLLIElement): Unit = js.native
}

/* static members */
@JSImport("rc-menu/lib/MenuItem", "MenuItem")
@js.native
object MenuItem extends js.Object {
  var defaultProps: Anon_ManualRef = js.native
  var isMenuItem: Boolean = js.native
}

