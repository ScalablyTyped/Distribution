package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearch extends IText

object ISearch {
  @scala.inline
  def apply(
    IText: IText = null,
    component: js.Any = null,
    getComponent: () => _ = null,
    getUi: () => java.lang.String = null,
    setComponent: /* component */ js.UndefOr[js.Any] => scala.Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => scala.Unit = null,
    ui: java.lang.String = null
  ): ISearch = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ISearch]
  }
}

