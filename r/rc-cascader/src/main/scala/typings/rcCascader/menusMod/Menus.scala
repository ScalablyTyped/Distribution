package typings.rcCascader.menusMod

import typings.rcCascader.cascaderMod.CascaderOption
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menus
  extends Component[MenusProps, js.Object, js.Any] {
  var delayTimer: Double = js.native
  var menuItems: MenuItems = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenus(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenus(prevProps: MenusProps): Unit = js.native
  def delayOnSelect(onSelect: js.Any, args: js.Any*): Unit = js.native
  def getActiveOptions(): js.Array[CascaderOption] = js.native
  def getActiveOptions(values: js.Array[CascaderOption]): js.Array[CascaderOption] = js.native
  def getFieldName(name: js.Any): js.Any = js.native
  def getOption(option: CascaderOption, menuIndex: Double): Element = js.native
  def getShowOptions(): js.Array[js.Array[CascaderOption]] = js.native
  def isActiveOption(option: js.Any, menuIndex: js.Any): Boolean = js.native
  def saveMenuItem(index: js.Any): js.Function1[/* node */ js.Any, Unit] = js.native
  def scrollActiveItemToView(): Unit = js.native
}

