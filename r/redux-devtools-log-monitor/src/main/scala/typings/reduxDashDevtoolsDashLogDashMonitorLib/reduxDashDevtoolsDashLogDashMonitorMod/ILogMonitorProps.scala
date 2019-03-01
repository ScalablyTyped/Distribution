package typings
package reduxDashDevtoolsDashLogDashMonitorLib.reduxDashDevtoolsDashLogDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogMonitorProps extends js.Object {
  /**
    * When true, displays the action object expanded rather than collapsed.
    *
    * @default true
    */
  var expandActionRoot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, displays the state object expanded rather than collapsed.
    *
    * @default true
    */
  var expandStateRoot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, records the current scroll top every second so it
    * can be restored on refresh. This only has effect when used together
    * with persistState() enhancer from Redux DevTools.
    *
    * @default true
    */
  var preserveScrollTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that selects the slice of the state for DevTools to show.
    *
    * @example state => state.thePart.iCare.about.
    * @default state => state.
    */
  var select: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  /**
    * Either a string referring to one of the themes provided by
    * redux-devtools-themes or a custom object of the same format.
    *
    * @see https://github.com/gaearon/redux-devtools-themes
    */
  var theme: js.UndefOr[java.lang.String | base16Lib.base16Mod.ColorScheme] = js.undefined
}

object ILogMonitorProps {
  @scala.inline
  def apply(
    expandActionRoot: js.UndefOr[scala.Boolean] = js.undefined,
    expandStateRoot: js.UndefOr[scala.Boolean] = js.undefined,
    preserveScrollTop: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.Function1[/* state */ js.Any, _] = null,
    theme: java.lang.String | base16Lib.base16Mod.ColorScheme = null
  ): ILogMonitorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandActionRoot)) __obj.updateDynamic("expandActionRoot")(expandActionRoot)
    if (!js.isUndefined(expandStateRoot)) __obj.updateDynamic("expandStateRoot")(expandStateRoot)
    if (!js.isUndefined(preserveScrollTop)) __obj.updateDynamic("preserveScrollTop")(preserveScrollTop)
    if (select != null) __obj.updateDynamic("select")(select)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogMonitorProps]
  }
}

