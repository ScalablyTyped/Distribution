package typings.senchaUnderscoreTouch.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmail
  extends typings.senchaUnderscoreTouch.ExtNs.fieldNs.IText

object IEmail {
  @scala.inline
  def apply(
    IText: typings.senchaUnderscoreTouch.ExtNs.fieldNs.IText = null,
    autoCapitalize: js.UndefOr[Boolean] = js.undefined,
    component: js.Any = null,
    getAutoCapitalize: () => Boolean = null,
    getComponent: () => _ = null,
    setAutoCapitalize: /* autoCapitalize */ js.UndefOr[Boolean] => Unit = null,
    setComponent: /* component */ js.UndefOr[js.Any] => Unit = null
  ): IEmail = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(js.Any.fromFunction0(getAutoCapitalize))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(js.Any.fromFunction1(setAutoCapitalize))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    __obj.asInstanceOf[IEmail]
  }
}

