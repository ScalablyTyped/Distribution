package typings
package selectablesLib.selectablesMod.SelectablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var elements: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var moreUsing: js.UndefOr[java.lang.String] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* el */ stdLib.Element, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* el */ stdLib.Element, scala.Unit]] = js.undefined
  var selectedClass: js.UndefOr[java.lang.String] = js.undefined
  var start: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    elements: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | scala.Boolean = null,
    moreUsing: java.lang.String = null,
    onDeselect: /* el */ stdLib.Element => scala.Unit = null,
    onSelect: /* el */ stdLib.Element => scala.Unit = null,
    selectedClass: java.lang.String = null,
    start: /* e */ stdLib.Event => scala.Unit = null,
    stop: /* e */ stdLib.Event => scala.Unit = null,
    zone: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (moreUsing != null) __obj.updateDynamic("moreUsing")(moreUsing)
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (selectedClass != null) __obj.updateDynamic("selectedClass")(selectedClass)
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Options]
  }
}

