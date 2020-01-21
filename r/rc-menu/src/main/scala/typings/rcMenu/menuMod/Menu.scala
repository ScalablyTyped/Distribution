package typings.rcMenu.menuMod

import typings.rcMenu.AnonGetWrappedInstance
import typings.rcMenu.interfaceMod.MenuClickEventHandler
import typings.rcMenu.interfaceMod.MiniStore
import typings.rcMenu.interfaceMod.SelectInfo
import typings.rcMenu.subPopupMenuMod.SubPopupMenuProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends Component[MenuProps, js.Object, js.Any] {
  var innerMenu: (ComponentClass[SubPopupMenuProps, _]) with AnonGetWrappedInstance = js.native
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

