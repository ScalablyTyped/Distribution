package typings
package senchaUnderscoreTouchLib.ExtNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHidden
  extends senchaUnderscoreTouchLib.ExtNs.fieldNs.IText

object IHidden {
  @scala.inline
  def apply(
    IText: senchaUnderscoreTouchLib.ExtNs.fieldNs.IText = null,
    component: js.Any = null,
    getComponent: js.Function0[_] = null,
    getUi: js.Function0[java.lang.String] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    ui: java.lang.String = null
  ): IHidden = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IHidden]
  }
}

