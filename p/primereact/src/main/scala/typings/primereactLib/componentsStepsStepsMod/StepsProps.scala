package typings
package primereactLib.componentsStepsStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends js.Object {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var model: js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem]
  var onSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_IndexItem, scala.Unit]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    model: js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem],
    activeIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    onSelect: /* e */ primereactLib.Anon_IndexItem => scala.Unit = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal(model = model)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[StepsProps]
  }
}

