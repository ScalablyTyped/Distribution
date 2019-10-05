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
    baseCls: java.lang.String = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    enter: java.lang.String = null,
    exit: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getCentered: () => Boolean = null,
    getEnter: () => java.lang.String = null,
    getExit: () => java.lang.String = null,
    getModal: () => Boolean = null,
    getStretchX: () => Boolean = null,
    getStretchY: () => Boolean = null,
    hideAnimation: js.Any = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setCentered: /* centered */ js.UndefOr[Boolean] => Unit = null,
    setEnter: /* enter */ js.UndefOr[java.lang.String] => Unit = null,
    setExit: /* exit */ js.UndefOr[java.lang.String] => Unit = null,
    setHideAnimation: /* hideAnimation */ js.UndefOr[js.Any] => Unit = null,
    setModal: /* modal */ js.UndefOr[Boolean] => Unit = null,
    setShowAnimation: /* showAnimation */ js.UndefOr[js.Any] => Unit = null,
    setStretchX: /* stretchX */ js.UndefOr[Boolean] => Unit = null,
    setStretchY: /* stretchY */ js.UndefOr[Boolean] => Unit = null,
    showAnimation: js.Any = null,
    stretchX: js.UndefOr[Boolean] = js.undefined,
    stretchY: js.UndefOr[Boolean] = js.undefined
  ): ISheet = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getCentered != null) __obj.updateDynamic("getCentered")(js.Any.fromFunction0(getCentered))
    if (getEnter != null) __obj.updateDynamic("getEnter")(js.Any.fromFunction0(getEnter))
    if (getExit != null) __obj.updateDynamic("getExit")(js.Any.fromFunction0(getExit))
    if (getModal != null) __obj.updateDynamic("getModal")(js.Any.fromFunction0(getModal))
    if (getStretchX != null) __obj.updateDynamic("getStretchX")(js.Any.fromFunction0(getStretchX))
    if (getStretchY != null) __obj.updateDynamic("getStretchY")(js.Any.fromFunction0(getStretchY))
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setCentered != null) __obj.updateDynamic("setCentered")(js.Any.fromFunction1(setCentered))
    if (setEnter != null) __obj.updateDynamic("setEnter")(js.Any.fromFunction1(setEnter))
    if (setExit != null) __obj.updateDynamic("setExit")(js.Any.fromFunction1(setExit))
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(js.Any.fromFunction1(setHideAnimation))
    if (setModal != null) __obj.updateDynamic("setModal")(js.Any.fromFunction1(setModal))
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(js.Any.fromFunction1(setShowAnimation))
    if (setStretchX != null) __obj.updateDynamic("setStretchX")(js.Any.fromFunction1(setStretchX))
    if (setStretchY != null) __obj.updateDynamic("setStretchY")(js.Any.fromFunction1(setStretchY))
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (!js.isUndefined(stretchX)) __obj.updateDynamic("stretchX")(stretchX)
    if (!js.isUndefined(stretchY)) __obj.updateDynamic("stretchY")(stretchY)
    __obj.asInstanceOf[ISheet]
  }
}

