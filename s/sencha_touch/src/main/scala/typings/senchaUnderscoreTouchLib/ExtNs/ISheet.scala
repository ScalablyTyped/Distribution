package typings
package senchaUnderscoreTouchLib.ExtNs

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
  var getStretchX: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of stretchY
  		* @returns Boolean
  		*/
  var getStretchY: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Sets the value of enter
  		* @param enter String The new value.
  		*/
  var setEnter: js.UndefOr[js.Function1[/* enter */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of exit
  		* @param exit String The new value.
  		*/
  var setExit: js.UndefOr[js.Function1[/* exit */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stretchX
  		* @param stretchX Boolean The new value.
  		*/
  var setStretchX: js.UndefOr[js.Function1[/* stretchX */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stretchY
  		* @param stretchY Boolean The new value.
  		*/
  var setStretchY: js.UndefOr[js.Function1[/* stretchY */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var stretchX: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var stretchY: js.UndefOr[scala.Boolean] = js.undefined
}

object ISheet {
  @scala.inline
  def apply(
    IPanel: IPanel = null,
    baseCls: java.lang.String = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    enter: java.lang.String = null,
    exit: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getCentered: js.Function0[scala.Boolean] = null,
    getEnter: js.Function0[java.lang.String] = null,
    getExit: js.Function0[java.lang.String] = null,
    getModal: js.Function0[scala.Boolean] = null,
    getStretchX: js.Function0[scala.Boolean] = null,
    getStretchY: js.Function0[scala.Boolean] = null,
    hideAnimation: js.Any = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setCentered: js.Function1[/* centered */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setEnter: js.Function1[/* enter */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setExit: js.Function1[/* exit */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHideAnimation: js.Function1[/* hideAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setModal: js.Function1[/* modal */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setShowAnimation: js.Function1[/* showAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setStretchX: js.Function1[/* stretchX */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setStretchY: js.Function1[/* stretchY */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    showAnimation: js.Any = null,
    stretchX: js.UndefOr[scala.Boolean] = js.undefined,
    stretchY: js.UndefOr[scala.Boolean] = js.undefined
  ): ISheet = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getCentered != null) __obj.updateDynamic("getCentered")(getCentered)
    if (getEnter != null) __obj.updateDynamic("getEnter")(getEnter)
    if (getExit != null) __obj.updateDynamic("getExit")(getExit)
    if (getModal != null) __obj.updateDynamic("getModal")(getModal)
    if (getStretchX != null) __obj.updateDynamic("getStretchX")(getStretchX)
    if (getStretchY != null) __obj.updateDynamic("getStretchY")(getStretchY)
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setCentered != null) __obj.updateDynamic("setCentered")(setCentered)
    if (setEnter != null) __obj.updateDynamic("setEnter")(setEnter)
    if (setExit != null) __obj.updateDynamic("setExit")(setExit)
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(setHideAnimation)
    if (setModal != null) __obj.updateDynamic("setModal")(setModal)
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(setShowAnimation)
    if (setStretchX != null) __obj.updateDynamic("setStretchX")(setStretchX)
    if (setStretchY != null) __obj.updateDynamic("setStretchY")(setStretchY)
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (!js.isUndefined(stretchX)) __obj.updateDynamic("stretchX")(stretchX)
    if (!js.isUndefined(stretchY)) __obj.updateDynamic("stretchY")(stretchY)
    __obj.asInstanceOf[ISheet]
  }
}

