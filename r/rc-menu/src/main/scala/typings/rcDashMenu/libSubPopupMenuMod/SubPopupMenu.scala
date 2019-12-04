package typings.rcDashMenu.libSubPopupMenuMod

import typings.rcDashMenu.Anon_ClassNameFocusable
import typings.rcDashMenu.libInterfaceMod.DestroyEventHandler
import typings.rcDashMenu.libInterfaceMod.HoverEventHandler
import typings.rcDashMenu.libInterfaceMod.MenuClickEventHandler
import typings.rcDashMenu.libInterfaceMod.OpenEventHandler
import typings.rcDashMenu.libInterfaceMod.SelectEventHandler
import typings.rcDashMenu.libMenuItemMod.MenuItem
import typings.rcDashMenu.libMenuItemMod.MenuItemProps
import typings.react.reactMod.Component
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/SubPopupMenu", "SubPopupMenu")
@js.native
class SubPopupMenu protected ()
  extends Component[SubPopupMenuProps, js.Object, js.Any] {
  def this(props: SubPopupMenuProps) = this()
  var instanceArray: js.Array[MenuItem] = js.native
  var onClick: MenuClickEventHandler = js.native
  var onDeselect: SelectEventHandler = js.native
  var onDestroy: DestroyEventHandler = js.native
  var onItemHover: HoverEventHandler = js.native
  var onOpenChange: OpenEventHandler = js.native
  var onSelect: SelectEventHandler = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSubPopupMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSubPopupMenu(prevProps: SubPopupMenuProps): Unit = js.native
  def getFlatInstanceArray(): js.Array[MenuItem] = js.native
  /**
    * all keyboard events callbacks run from here at first
    *
    * note:
    *  This legacy code that `onKeyDown` is called by parent instead of dom self.
    *  which need return code to check if this event is handled
    */
  def onKeyDown(e: KeyboardEvent[HTMLElement], callback: js.Function1[/* item */ MenuItem, Unit]): Double = js.native
  def renderCommonMenuItem(child: ReactElement, i: Double, extraProps: MenuItemProps): ReactElement = js.native
  def renderMenuItem(c: ReactElement, i: Double, subMenuKey: String): ReactElement = js.native
  def renderMenuItem(c: ReactElement, i: Double, subMenuKey: Double): ReactElement = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MSubPopupMenu(nextProps: SubPopupMenuProps): Boolean = js.native
  def step(direction: Double): MenuItem = js.native
}

/* static members */
@JSImport("rc-menu/lib/SubPopupMenu", "SubPopupMenu")
@js.native
object SubPopupMenu extends js.Object {
  var defaultProps: Anon_ClassNameFocusable = js.native
}

