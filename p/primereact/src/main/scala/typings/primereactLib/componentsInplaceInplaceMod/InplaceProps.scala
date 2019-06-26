package typings
package primereactLib.componentsInplaceInplaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InplaceProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onToggle: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValueBoolean, scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
}

object InplaceProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: /* event */ stdLib.Event => scala.Unit = null,
    onOpen: /* event */ stdLib.Event => scala.Unit = null,
    onToggle: /* e */ primereactLib.Anon_OriginalEventValueBoolean => scala.Unit = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null
  ): InplaceProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    __obj.asInstanceOf[InplaceProps]
  }
}

