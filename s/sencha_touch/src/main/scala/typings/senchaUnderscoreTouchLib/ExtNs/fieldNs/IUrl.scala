package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUrl extends IText

object IUrl {
  @scala.inline
  def apply(
    IText: IText = null,
    autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.Any = null,
    getAutoCapitalize: () => scala.Boolean = null,
    getComponent: () => _ = null,
    setAutoCapitalize: /* autoCapitalize */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setComponent: /* component */ js.UndefOr[js.Any] => scala.Unit = null
  ): IUrl = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(js.Any.fromFunction0(getAutoCapitalize))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(js.Any.fromFunction1(setAutoCapitalize))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    __obj.asInstanceOf[IUrl]
  }
}

