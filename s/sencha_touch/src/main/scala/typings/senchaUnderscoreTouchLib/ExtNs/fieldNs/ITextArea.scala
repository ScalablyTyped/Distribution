package typings
package senchaUnderscoreTouchLib.ExtNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea extends IText {
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: IText = null,
    autoCapitalize: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.Any = null,
    getAutoCapitalize: js.Function0[scala.Boolean] = null,
    getComponent: js.Function0[_] = null,
    getMaxRows: js.Function0[scala.Double] = null,
    getUi: js.Function0[java.lang.String] = null,
    maxRows: scala.Int | scala.Double = null,
    setAutoCapitalize: js.Function1[/* autoCapitalize */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setComponent: js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxRows: js.Function1[/* maxRows */ js.UndefOr[scala.Double], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    ui: java.lang.String = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(getAutoCapitalize)
    if (getComponent != null) __obj.updateDynamic("getComponent")(getComponent)
    if (getMaxRows != null) __obj.updateDynamic("getMaxRows")(getMaxRows)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(setAutoCapitalize)
    if (setComponent != null) __obj.updateDynamic("setComponent")(setComponent)
    if (setMaxRows != null) __obj.updateDynamic("setMaxRows")(setMaxRows)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ITextArea]
  }
}

