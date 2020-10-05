package typings.rcMenu.menuMod

import typings.rcMenu.anon.ComponentClassSubPopupMen
import typings.rcMenu.interfaceMod.MenuClickEventHandler
import typings.rcMenu.interfaceMod.MenuMode
import typings.rcMenu.interfaceMod.MiniStore
import typings.rcMenu.interfaceMod.SelectInfo
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.TransitionEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu
  extends Component[MenuProps, MenuState, js.Any] {
  var inlineOpenKeys: js.Array[String] = js.native
  var innerMenu: ComponentClassSubPopupMen = js.native
  var isRootMenu: Boolean = js.native
  var onClick: MenuClickEventHandler = js.native
  var prevOpenKeys: js.Array[String] = js.native
  var store: MiniStore = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenu(prevProps: MenuProps): Unit = js.native
  def getInlineCollapsed(): Boolean = js.native
  def getRealMenuMode(): MenuMode = js.native
  def onDeselect(selectInfo: SelectInfo): Unit = js.native
  def onKeyDown(e: KeyboardEvent[HTMLElement], callback: js.Any): Unit = js.native
  def onMouseEnter(e: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
  def onOpenChange(event: js.Any): Unit = js.native
  def onSelect(selectInfo: SelectInfo): Unit = js.native
  def onTransitionEnd(e: TransitionEvent[HTMLDivElement]): Unit = js.native
  def restoreModeVerticalFromInline(): Unit = js.native
  def setInnerMenu(node: js.Any): Unit = js.native
  def updateMenuDisplay(): Unit = js.native
  def updateMiniStore(): Unit = js.native
  def updateOpentKeysWhenSwitchMode(prevProps: MenuProps): Unit = js.native
}

