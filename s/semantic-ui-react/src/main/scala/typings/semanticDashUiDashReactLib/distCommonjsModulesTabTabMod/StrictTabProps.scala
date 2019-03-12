package typings
package semanticDashUiDashReactLib.distCommonjsModulesTabTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTabProps extends js.Object {
  /** Index of the currently active tab. */
  var activeIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** The initial activeIndex. */
  var defaultActiveIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Shorthand props for the Grid. */
  var grid: js.UndefOr[js.Any] = js.undefined
  /** Shorthand props for the Menu. */
  var menu: js.UndefOr[js.Any] = js.undefined
  /** Align vertical menu */
  var menuPosition: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /**
    * Called on tab change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - The proposed new Tab.Pane.
    * @param {object} data.activeIndex - The new proposed activeIndex.
    * @param {object} data.panes - Props of the new proposed active pane.
    */
  var onTabChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ TabProps, 
      scala.Unit
    ]
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
  var panes: js.UndefOr[js.Array[semanticDashUiDashReactLib.Anon_Content]] = js.undefined
  /** A Tab can render only active pane. */
  var renderActiveOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictTabProps {
  @scala.inline
  def apply(
    activeIndex: scala.Double | java.lang.String = null,
    as: js.Any = null,
    defaultActiveIndex: scala.Double | java.lang.String = null,
    grid: js.Any = null,
    menu: js.Any = null,
    menuPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    onTabChange: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], /* data */ TabProps) => scala.Unit = null,
    panes: js.Array[semanticDashUiDashReactLib.Anon_Content] = null,
    renderActiveOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictTabProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction2(onTabChange))
    if (panes != null) __obj.updateDynamic("panes")(panes)
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly)
    __obj.asInstanceOf[StrictTabProps]
  }
}

