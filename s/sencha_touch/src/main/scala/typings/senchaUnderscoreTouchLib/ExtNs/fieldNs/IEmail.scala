package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmail extends IText

object IEmail {
  @scala.inline
  def apply(
    IText: IText = null,
    autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.Any = null,
    getAutoCapitalize: js.Function0[scala.Boolean] = null,
    getComponent: js.Function0[_] = null,
    setAutoCapitalize: js.Function1[/* autoCapitalize */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null
  ): IEmail = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(getAutoCapitalize)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(setAutoCapitalize)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    __obj.asInstanceOf[IEmail]
  }
}

