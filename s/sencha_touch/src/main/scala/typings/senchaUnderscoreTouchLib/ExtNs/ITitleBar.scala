package typings
package senchaUnderscoreTouchLib.ExtNs

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
  var setCls_ITitleBar: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxButtonWidth
  		* @param maxButtonWidth String The new value.
  		*/
  var setMaxButtonWidth: js.UndefOr[js.Function1[/* maxButtonWidth */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_ITitleBar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of titleAlign
  		* @param titleAlign String The new value.
  		*/
  var setTitleAlign: js.UndefOr[js.Function1[/* titleAlign */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
    getBaseCls: js.Function0[java.lang.String] = null,
    getCls: js.Function0[java.lang.String] = null,
    getDefaultType: js.Function0[java.lang.String] = null,
    getItems: js.Function0[_] = null,
    getMaxButtonWidth: js.Function0[java.lang.String] = null,
    getTitle: js.Function0[java.lang.String] = null,
    getTitleAlign: js.Function0[java.lang.String] = null,
    getUi: js.Function0[java.lang.String] = null,
    initialize: js.Function0[scala.Unit] = null,
    items: js.Any = null,
    maxButtonWidth: java.lang.String = null,
    minHeight: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDefaultType: js.Function1[/* defaultType */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setItems: js.Function1[/* items */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxButtonWidth: js.Function1[/* maxButtonWidth */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setMinHeight: js.Function1[/* minHeight */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTitleAlign: js.Function1[/* titleAlign */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    title: java.lang.String = null,
    titleAlign: java.lang.String = null,
    ui: java.lang.String = null
  ): ITitleBar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(getDefaultType)
    if (getItems != null) __obj.updateDynamic("getItems")(getItems)
    if (getMaxButtonWidth != null) __obj.updateDynamic("getMaxButtonWidth")(getMaxButtonWidth)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getTitleAlign != null) __obj.updateDynamic("getTitleAlign")(getTitleAlign)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (items != null) __obj.updateDynamic("items")(items)
    if (maxButtonWidth != null) __obj.updateDynamic("maxButtonWidth")(maxButtonWidth)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(setDefaultType)
    if (setItems != null) __obj.updateDynamic("setItems")(setItems)
    if (setMaxButtonWidth != null) __obj.updateDynamic("setMaxButtonWidth")(setMaxButtonWidth)
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(setMinHeight)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setTitleAlign != null) __obj.updateDynamic("setTitleAlign")(setTitleAlign)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[ITitleBar]
  }
}

