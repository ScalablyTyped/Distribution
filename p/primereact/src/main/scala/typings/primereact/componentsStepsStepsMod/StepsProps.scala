package typings.primereact.componentsStepsStepsMod

import typings.primereact.Anon_IndexItem
import typings.primereact.componentsMenuitemMenuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.Array[MenuItem]
  var onSelect: js.UndefOr[js.Function1[/* e */ Anon_IndexItem, Unit]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    model: js.Array[MenuItem],
    activeIndex: Int | Double = null,
    className: String = null,
    id: String = null,
    onSelect: /* e */ Anon_IndexItem => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
}

