package typings
package atSimonwepSelectionDashJsLib.atSimonwepSelectionDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionOptions extends js.Object {
  var boundaries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var disableTouch: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onMove: js.UndefOr[js.Function1[/* evt */ SelectionEvent, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* evt */ SingleSelectionEvent, scala.Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* evt */ SelectionEvent, scala.Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* evt */ SelectionEvent, scala.Unit]] = js.undefined
  var scrollSpeedDivider: js.UndefOr[scala.Double] = js.undefined
  var selectables: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var selectionAreaContainer: js.UndefOr[
    java.lang.String | stdLib.HTMLElement | (js.Array[java.lang.String | stdLib.HTMLElement])
  ] = js.undefined
  var selectionFilter: js.UndefOr[js.Function1[/* evt */ SelectionFilterEvent, scala.Boolean]] = js.undefined
  var singleClick: js.UndefOr[scala.Boolean] = js.undefined
  var startThreshold: js.UndefOr[scala.Double] = js.undefined
  var startareas: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var validateStart: js.UndefOr[js.Function1[/* evt */ stdLib.MouseEvent | stdLib.TouchEvent, scala.Boolean]] = js.undefined
}

object SelectionOptions {
  @scala.inline
  def apply(
    boundaries: js.Array[java.lang.String] = null,
    `class`: java.lang.String = null,
    disableTouch: js.UndefOr[scala.Boolean] = js.undefined,
    mode: Mode = null,
    onMove: /* evt */ SelectionEvent => scala.Unit = null,
    onSelect: /* evt */ SingleSelectionEvent => scala.Unit = null,
    onStart: /* evt */ SelectionEvent => scala.Unit = null,
    onStop: /* evt */ SelectionEvent => scala.Unit = null,
    scrollSpeedDivider: scala.Int | scala.Double = null,
    selectables: js.Array[java.lang.String] = null,
    selectionAreaContainer: java.lang.String | stdLib.HTMLElement | (js.Array[java.lang.String | stdLib.HTMLElement]) = null,
    selectionFilter: /* evt */ SelectionFilterEvent => scala.Boolean = null,
    singleClick: js.UndefOr[scala.Boolean] = js.undefined,
    startThreshold: scala.Int | scala.Double = null,
    startareas: js.Array[java.lang.String] = null,
    validateStart: /* evt */ stdLib.MouseEvent | stdLib.TouchEvent => scala.Boolean = null
  ): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction1(onMove))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (scrollSpeedDivider != null) __obj.updateDynamic("scrollSpeedDivider")(scrollSpeedDivider.asInstanceOf[js.Any])
    if (selectables != null) __obj.updateDynamic("selectables")(selectables)
    if (selectionAreaContainer != null) __obj.updateDynamic("selectionAreaContainer")(selectionAreaContainer.asInstanceOf[js.Any])
    if (selectionFilter != null) __obj.updateDynamic("selectionFilter")(js.Any.fromFunction1(selectionFilter))
    if (!js.isUndefined(singleClick)) __obj.updateDynamic("singleClick")(singleClick)
    if (startThreshold != null) __obj.updateDynamic("startThreshold")(startThreshold.asInstanceOf[js.Any])
    if (startareas != null) __obj.updateDynamic("startareas")(startareas)
    if (validateStart != null) __obj.updateDynamic("validateStart")(js.Any.fromFunction1(validateStart))
    __obj.asInstanceOf[SelectionOptions]
  }
}

