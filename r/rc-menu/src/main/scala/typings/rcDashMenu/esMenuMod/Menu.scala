package typings.rcDashMenu.esMenuMod

import typings.rcDashMenu.Anon_GetWrappedInstance
import typings.rcDashMenu.esInterfaceMod.MenuClickEventHandler
import typings.rcDashMenu.esInterfaceMod.MiniStore
import typings.rcDashMenu.esInterfaceMod.SelectInfo
import typings.rcDashMenu.esSubPopupMenuMod.SubPopupMenuProps
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
  var innerMenu: (ComponentClass[SubPopupMenuProps, _]) with Anon_GetWrappedInstance = js.native
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

