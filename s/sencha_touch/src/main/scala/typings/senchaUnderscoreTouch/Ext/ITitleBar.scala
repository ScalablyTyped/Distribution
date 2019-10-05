package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITitleBar extends IContainer {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_ITitleBar: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of maxButtonWidth
  		* @returns String
  		*/
  var getMaxButtonWidth: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of titleAlign
  		* @returns String
  		*/
  var getTitleAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var maxButtonWidth: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_ITitleBar: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_ITitleBar: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of maxButtonWidth
  		* @param maxButtonWidth String The new value.
  		*/
  var setMaxButtonWidth: js.UndefOr[js.Function1[/* maxButtonWidth */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_ITitleBar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of titleAlign
  		* @param titleAlign String The new value.
  		*/
  var setTitleAlign: js.UndefOr[js.Function1[/* titleAlign */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.undefined
}

object ITitleBar {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    baseCls: java.lang.String = null,
    cls: js.Any = null,
    defaultType: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getCls: () => java.lang.String = null,
    getDefaultType: () => java.lang.String = null,
    getItems: () => _ = null,
    getMaxButtonWidth: () => java.lang.String = null,
    getTitle: () => java.lang.String = null,
    getTitleAlign: () => java.lang.String = null,
    getUi: () => java.lang.String = null,
    initialize: () => Unit = null,
    items: js.Any = null,
    maxButtonWidth: java.lang.String = null,
    minHeight: java.lang.String = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setCls: /* cls */ js.UndefOr[java.lang.String] => Unit = null,
    setDefaultType: /* defaultType */ js.UndefOr[java.lang.String] => Unit = null,
    setItems: /* items */ js.UndefOr[js.Any] => Unit = null,
    setMaxButtonWidth: /* maxButtonWidth */ js.UndefOr[java.lang.String] => Unit = null,
    setMinHeight: /* minHeight */ js.UndefOr[java.lang.String] => Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    setTitleAlign: /* titleAlign */ js.UndefOr[java.lang.String] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    title: java.lang.String = null,
    titleAlign: java.lang.String = null,
    ui: java.lang.String = null
  ): ITitleBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(js.Any.fromFunction0(getDefaultType))
    if (getItems != null) __obj.updateDynamic("getItems")(js.Any.fromFunction0(getItems))
    if (getMaxButtonWidth != null) __obj.updateDynamic("getMaxButtonWidth")(js.Any.fromFunction0(getMaxButtonWidth))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getTitleAlign != null) __obj.updateDynamic("getTitleAlign")(js.Any.fromFunction0(getTitleAlign))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (items != null) __obj.updateDynamic("items")(items)
    if (maxButtonWidth != null) __obj.updateDynamic("maxButtonWidth")(maxButtonWidth)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1(setDefaultType))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1(setItems))
    if (setMaxButtonWidth != null) __obj.updateDynamic("setMaxButtonWidth")(js.Any.fromFunction1(setMaxButtonWidth))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setTitleAlign != null) __obj.updateDynamic("setTitleAlign")(js.Any.fromFunction1(setTitleAlign))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ITitleBar]
  }
}

