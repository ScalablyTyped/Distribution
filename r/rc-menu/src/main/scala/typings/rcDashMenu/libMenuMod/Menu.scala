package typings.rcDashMenu.libMenuMod

import typings.rcDashMenu.Anon_GetWrappedInstanceSubPopupMenu
import typings.rcDashMenu.libInterfaceMod.MenuClickEventHandler
import typings.rcDashMenu.libInterfaceMod.MiniStore
import typings.rcDashMenu.libInterfaceMod.SelectInfo
import typings.rcDashMenu.libSubPopupMenuMod.SubPopupMenuProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends Component[MenuProps, js.Object, js.Any] {
  var innerMenu: (ComponentClass[SubPopupMenuProps, _]) with Anon_GetWrappedInstanceSubPopupMenu = js.native
  var isRootMenu: Boolean = js.native
  var onClick: MenuClickEventHandler = js.native
  var store: MiniStore = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenu(): Unit = js.native
  def getOpenTransitionName(): String = js.native
  def onDeselect(selectInfo: SelectInfo): Unit = js.native
  def onKeyDown(e: KeyboardEvent[HTMLElement], callback: js.Any): Unit = js.native
  def onOpenChange(event: js.Any): Unit = js.native
  def onSelect(selectInfo: SelectInfo): Unit = js.native
  def setInnerMenu(node: js.Any): Unit = js.native
  def updateMiniStore(): Unit = js.native
}

