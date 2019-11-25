package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISheet extends IPanel {
  /** [Config Option] (String) */
  var enter: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var exit: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of enter
  		* @returns String
  		*/
  var getEnter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of exit
  		* @returns String
  		*/
  var getExit: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of stretchX
  		* @returns Boolean
  		*/
  var getStretchX: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of stretchY
  		* @returns Boolean
  		*/
  var getStretchY: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Sets the value of enter
  		* @param enter String The new value.
  		*/
  var setEnter: js.UndefOr[js.Function1[/* enter */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of exit
  		* @param exit String The new value.
  		*/
  var setExit: js.UndefOr[js.Function1[/* exit */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of stretchX
  		* @param stretchX Boolean The new value.
  		*/
  var setStretchX: js.UndefOr[js.Function1[/* stretchX */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of stretchY
  		* @param stretchY Boolean The new value.
  		*/
  var setStretchY: js.UndefOr[js.Function1[/* stretchY */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var stretchX: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var stretchY: js.UndefOr[Boolean] = js.undefined
}

object ISheet {
  @scala.inline
  def apply(
    IPanel: IPanel = null,
    enter: java.lang.String = null,
    exit: java.lang.String = null,
    getEnter: () => java.lang.String = null,
    getExit: () => java.lang.String = null,
    getStretchX: () => Boolean = null,
    getStretchY: () => Boolean = null,
    setEnter: /* enter */ js.UndefOr[java.lang.String] => Unit = null,
    setExit: /* exit */ js.UndefOr[java.lang.String] => Unit = null,
    setStretchX: /* stretchX */ js.UndefOr[Boolean] => Unit = null,
    setStretchY: /* stretchY */ js.UndefOr[Boolean] => Unit = null,
    stretchX: js.UndefOr[Boolean] = js.undefined,
    stretchY: js.UndefOr[Boolean] = js.undefined
  ): ISheet = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (getEnter != null) __obj.updateDynamic("getEnter")(js.Any.fromFunction0(getEnter))
    if (getExit != null) __obj.updateDynamic("getExit")(js.Any.fromFunction0(getExit))
    if (getStretchX != null) __obj.updateDynamic("getStretchX")(js.Any.fromFunction0(getStretchX))
    if (getStretchY != null) __obj.updateDynamic("getStretchY")(js.Any.fromFunction0(getStretchY))
    if (setEnter != null) __obj.updateDynamic("setEnter")(js.Any.fromFunction1(setEnter))
    if (setExit != null) __obj.updateDynamic("setExit")(js.Any.fromFunction1(setExit))
    if (setStretchX != null) __obj.updateDynamic("setStretchX")(js.Any.fromFunction1(setStretchX))
    if (setStretchY != null) __obj.updateDynamic("setStretchY")(js.Any.fromFunction1(setStretchY))
    if (!js.isUndefined(stretchX)) __obj.updateDynamic("stretchX")(stretchX.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchY)) __obj.updateDynamic("stretchY")(stretchY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISheet]
  }
}

