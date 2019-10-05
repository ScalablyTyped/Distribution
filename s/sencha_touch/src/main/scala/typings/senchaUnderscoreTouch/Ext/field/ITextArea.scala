package typings.senchaUnderscoreTouch.Ext.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextArea extends IText {
  /** [Method] Returns the value of maxRows
  		* @returns Number
  		*/
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of maxRows
  		* @param maxRows Number The new value.
  		*/
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.undefined
}

object ITextArea {
  @scala.inline
  def apply(
    IText: IText = null,
    autoCapitalize: js.UndefOr[Boolean] = js.undefined,
    component: js.Any = null,
    getAutoCapitalize: () => Boolean = null,
    getComponent: () => _ = null,
    getMaxRows: () => Double = null,
    getUi: () => java.lang.String = null,
    maxRows: Int | Double = null,
    setAutoCapitalize: /* autoCapitalize */ js.UndefOr[Boolean] => Unit = null,
    setComponent: /* component */ js.UndefOr[js.Any] => Unit = null,
    setMaxRows: /* maxRows */ js.UndefOr[Double] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    ui: java.lang.String = null
  ): ITextArea = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IText)
    if (!js.isUndefined(autoCapitalize)) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (component != null) __obj.updateDynamic("component")(component)
    if (getAutoCapitalize != null) __obj.updateDynamic("getAutoCapitalize")(js.Any.fromFunction0(getAutoCapitalize))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction0(getComponent))
    if (getMaxRows != null) __obj.updateDynamic("getMaxRows")(js.Any.fromFunction0(getMaxRows))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (setAutoCapitalize != null) __obj.updateDynamic("setAutoCapitalize")(js.Any.fromFunction1(setAutoCapitalize))
    if (setComponent != null) __obj.updateDynamic("setComponent")(js.Any.fromFunction1(setComponent))
    if (setMaxRows != null) __obj.updateDynamic("setMaxRows")(js.Any.fromFunction1(setMaxRows))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ITextArea]
  }
}

