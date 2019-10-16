package typings.rcDashMenu.esSubMenuMod

import typings.rcDashMenu.Anon_DomEventItem
import typings.rcDashMenu.Anon_ManualRefMode
import typings.rcDashMenu.esInterfaceMod.MenuInfo
import typings.rcDashMenu.esInterfaceMod.OpenEventHandler
import typings.rcDashMenu.esInterfaceMod.SelectEventHandler
import typings.rcDashMenu.esMenuItemMod.MenuItem
import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/es/SubMenu", "SubMenu")
@js.native
class SubMenu protected ()
  extends Component[SubMenuProps, js.Object, js.Any] {
  def this(props: SubMenuProps) = this()
  var haveOpened: Boolean = js.native
  var haveRendered: Boolean = js.native
  var internalMenuId: String = js.native
  var isRootMenu: Boolean = js.native
  var menuInstance: MenuItem = js.native
  /**
    * Follow timeout should be `number`.
    * Current is only convert code into TS,
    * we not use `window.setTimeout` instead of `setTimeout`.
    */
  var minWidthTimeout: js.Any = js.native
  var mouseenterTimeout: js.Any = js.native
  var onDeselect: SelectEventHandler = js.native
  /**
    * note:
    *  This legacy code that `onKeyDown` is called by parent instead of dom self.
    *  which need return code to check if this event is handled
    */
  var onKeyDown: KeyboardEventHandler[HTMLElement] = js.native
  var onMouseEnter: MouseEventHandler[HTMLElement] = js.native
  var onMouseLeave: MouseEventHandler[HTMLElement] = js.native
  var onOpenChange: OpenEventHandler = js.native
  var onSelect: SelectEventHandler = js.native
  var onTitleMouseEnter: MouseEventHandler[HTMLElement] = js.native
  var onTitleMouseLeave: MouseEventHandler[HTMLElement] = js.native
  var subMenuTitle: HTMLElement = js.native
  def addKeyPath(info: MenuInfo): Anon_DomEventItem = js.native
  def adjustWidth(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSubMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSubMenu(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSubMenu(): Unit = js.native
  def getActiveClassName(): String = js.native
  def getDisabledClassName(): String = js.native
  def getOpenClassName(): String = js.native
  def getPrefixCls(): String = js.native
  def getSelectedClassName(): String = js.native
  def isChildrenSelected(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def onDestroy(key: String): Unit = js.native
  def onPopupVisibleChange(visible: Boolean): Unit = js.native
  def onSubMenuClick(info: MenuInfo): Unit = js.native
  def onTitleClick(e: KeyboardEvent[HTMLElement]): Unit = js.native
  def onTitleClick(e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderChildren(children: ReactNode): Element = js.native
  def saveMenuInstance(c: MenuItem): Unit = js.native
  def saveSubMenuTitle(subMenuTitle: HTMLElement): Unit = js.native
  def triggerOpenChange(open: Boolean): Unit = js.native
  def triggerOpenChange(open: Boolean, `type`: String): Unit = js.native
}

/* static members */
@JSImport("rc-menu/es/SubMenu", "SubMenu")
@js.native
object SubMenu extends js.Object {
  var defaultProps: Anon_ManualRefMode = js.native
}

