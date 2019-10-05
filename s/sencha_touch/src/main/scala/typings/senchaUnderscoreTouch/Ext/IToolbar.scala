package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolbar extends IContainer {
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an Ext Title component
  		* @returns Ext.Title
  		*/
  var getTitle: js.UndefOr[js.Function0[ITitle]] = js.undefined
  /** [Method] Hides the title if it exists  */
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_IToolbar: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_IToolbar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Use this to update the title configuration
  		* @param title String/Ext.Title You can either pass a String, or a config/instance of Ext.Title.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Shows the title if it exists  */
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Ext.Title) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var titleCls: js.UndefOr[Boolean] = js.undefined
}

object IToolbar {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    baseCls: java.lang.String = null,
    defaultType: java.lang.String = null,
    docked: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getDefaultType: () => java.lang.String = null,
    getDocked: () => java.lang.String = null,
    getLayout: () => _ = null,
    getTitle: () => ITitle = null,
    getUi: () => java.lang.String = null,
    hideTitle: () => Unit = null,
    layout: js.Any = null,
    minHeight: java.lang.String = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => Unit = null,
    setDocked: /* docked */ js.UndefOr[java.lang.String] => Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => Unit = null,
    setMinHeight: /* minHeight */ js.UndefOr[java.lang.String] => Unit = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    showTitle: () => Unit = null,
    title: js.Any = null,
    titleCls: js.UndefOr[Boolean] = js.undefined,
    ui: java.lang.String = null
  ): IToolbar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getDocked != null) __obj.updateDynamic("getDocked")(js.Any.fromFunction0(getDocked))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (hideTitle != null) __obj.updateDynamic("hideTitle")(js.Any.fromFunction0(hideTitle))
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setDocked != null) __obj.updateDynamic("setDocked")(js.Any.fromFunction1(setDocked))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (showTitle != null) __obj.updateDynamic("showTitle")(js.Any.fromFunction0(showTitle))
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(titleCls)) __obj.updateDynamic("titleCls")(titleCls)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IToolbar]
  }
}

