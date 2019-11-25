package typings.semanticDashUiDashReact.distCommonjsModulesTabTabMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.Anon_MenuItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTabProps extends js.Object {
  /** Index of the currently active tab. */
  var activeIndex: js.UndefOr[Double | String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** The initial activeIndex. */
  var defaultActiveIndex: js.UndefOr[Double | String] = js.undefined
  /** Shorthand props for the Grid. */
  var grid: js.UndefOr[js.Any] = js.undefined
  /** Shorthand props for the Menu. */
  var menu: js.UndefOr[js.Any] = js.undefined
  /** Align vertical menu */
  var menuPosition: js.UndefOr[left | right] = js.undefined
  /**
    * Called on tab change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - The proposed new Tab.Pane.
    * @param {object} data.activeIndex - The new proposed activeIndex.
    * @param {object} data.panes - Props of the new proposed active pane.
    */
  var onTabChange: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ TabProps, Unit]
  ] = js.undefined
  /**
    * Array of objects describing each Menu.Item and Tab.Pane:
    * {
    *   menuItem: 'Home',
    *   render: () => <Tab.Pane>Welcome!</Tab.Pane>,
    * }
    * or
    * {
    *   menuItem: 'Home',
    *   pane: 'Welcome',
    * }
    */
  var panes: js.UndefOr[js.Array[Anon_MenuItem]] = js.undefined
  /** A Tab can render only active pane. */
  var renderActiveOnly: js.UndefOr[Boolean] = js.undefined
}

object StrictTabProps {
  @scala.inline
  def apply(
    activeIndex: Double | String = null,
    as: js.Any = null,
    defaultActiveIndex: Double | String = null,
    grid: js.Any = null,
    menu: js.Any = null,
    menuPosition: left | right = null,
    onTabChange: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ TabProps) => Unit = null,
    panes: js.Array[Anon_MenuItem] = null,
    renderActiveOnly: js.UndefOr[Boolean] = js.undefined
  ): StrictTabProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction2(onTabChange))
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTabProps]
  }
}

