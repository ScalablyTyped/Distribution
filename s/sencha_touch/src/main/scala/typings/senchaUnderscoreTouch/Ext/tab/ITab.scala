package typings.senchaUnderscoreTouch.Ext.tab

import typings.senchaUnderscoreTouch.Ext.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITab extends IButton {
  /** [Config Option] (Boolean) */
  var active: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of active
  		* @returns Boolean
  		*/
  var getActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of activeCls
  		* @returns String
  		*/
  var getActiveCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of active
  		* @param active Boolean The new value.
  		*/
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of activeCls
  		* @param activeCls String The new value.
  		*/
  var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ITab {
  @scala.inline
  def apply(
    IButton: IButton = null,
    active: js.UndefOr[Boolean] = js.undefined,
    activeCls: java.lang.String = null,
    getActive: () => Boolean = null,
    getActiveCls: () => java.lang.String = null,
    getTitle: () => java.lang.String = null,
    setActive: /* active */ js.UndefOr[Boolean] => Unit = null,
    setActiveCls: /* activeCls */ js.UndefOr[java.lang.String] => Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    title: java.lang.String = null
  ): ITab = {
    val __obj = js.Dynamic.literal()
    if (IButton != null) js.Dynamic.global.Object.assign(__obj, IButton)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (activeCls != null) __obj.updateDynamic("activeCls")(activeCls.asInstanceOf[js.Any])
    if (getActive != null) __obj.updateDynamic("getActive")(js.Any.fromFunction0(getActive))
    if (getActiveCls != null) __obj.updateDynamic("getActiveCls")(js.Any.fromFunction0(getActiveCls))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (setActive != null) __obj.updateDynamic("setActive")(js.Any.fromFunction1(setActive))
    if (setActiveCls != null) __obj.updateDynamic("setActiveCls")(js.Any.fromFunction1(setActiveCls))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITab]
  }
}

