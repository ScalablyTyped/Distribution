package typings.atSimonwepSelectionDashJs.atSimonwepSelectionDashJsMod

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionOptions extends js.Object {
  var boundaries: js.UndefOr[js.Array[String]] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var disableTouch: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onMove: js.UndefOr[js.Function1[/* evt */ SelectionEvent, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* evt */ SingleSelectionEvent, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* evt */ SelectionEvent, Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* evt */ SelectionEvent, Unit]] = js.undefined
  var scrollSpeedDivider: js.UndefOr[Double] = js.undefined
  var selectables: js.UndefOr[js.Array[String]] = js.undefined
  var selectionAreaContainer: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.undefined
  var selectionFilter: js.UndefOr[js.Function1[/* evt */ SelectionFilterEvent, Boolean]] = js.undefined
  var singleClick: js.UndefOr[Boolean] = js.undefined
  var startThreshold: js.UndefOr[Double] = js.undefined
  var startareas: js.UndefOr[js.Array[String]] = js.undefined
  var validateStart: js.UndefOr[js.Function1[/* evt */ MouseEvent | TouchEvent, Boolean]] = js.undefined
}

object SelectionOptions {
  @scala.inline
  def apply(
    boundaries: js.Array[String] = null,
    `class`: String = null,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    mode: Mode = null,
    onMove: /* evt */ SelectionEvent => Unit = null,
    onSelect: /* evt */ SingleSelectionEvent => Unit = null,
    onStart: /* evt */ SelectionEvent => Unit = null,
    onStop: /* evt */ SelectionEvent => Unit = null,
    scrollSpeedDivider: Int | Double = null,
    selectables: js.Array[String] = null,
    selectionAreaContainer: String | HTMLElement | (js.Array[String | HTMLElement]) = null,
    selectionFilter: /* evt */ SelectionFilterEvent => Boolean = null,
    singleClick: js.UndefOr[Boolean] = js.undefined,
    startThreshold: Int | Double = null,
    startareas: js.Array[String] = null,
    validateStart: /* evt */ MouseEvent | TouchEvent => Boolean = null
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

