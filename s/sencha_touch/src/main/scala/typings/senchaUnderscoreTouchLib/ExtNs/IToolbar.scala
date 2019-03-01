package typings
package senchaUnderscoreTouchLib.ExtNs

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
  var hideTitle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_IToolbar: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_IToolbar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Use this to update the title configuration
  		* @param title String/Ext.Title You can either pass a String, or a config/instance of Ext.Title.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Shows the title if it exists  */
  var showTitle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Ext.Title) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var titleCls: js.UndefOr[scala.Boolean] = js.undefined
}

object IToolbar {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    baseCls: java.lang.String = null,
    defaultType: java.lang.String = null,
    docked: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getDefaultType: js.Function0[java.lang.String] = null,
    getDocked: js.Function0[java.lang.String] = null,
    getLayout: js.Function0[_] = null,
    getTitle: js.Function0[ITitle] = null,
    getUi: js.Function0[java.lang.String] = null,
    hideTitle: js.Function0[scala.Unit] = null,
    layout: js.Any = null,
    minHeight: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDefaultType: js.Function1[/* defaultType */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDocked: js.Function1[/* docked */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLayout: js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit] = null,
    setMinHeight: js.Function1[/* minHeight */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    showTitle: js.Function0[scala.Unit] = null,
    title: js.Any = null,
    titleCls: js.UndefOr[scala.Boolean] = js.undefined,
    ui: java.lang.String = null
  ): IToolbar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getDefaultType != null) __obj.updateDynamic("getDefaultType")(getDefaultType)
    if (getDocked != null) __obj.updateDynamic("getDocked")(getDocked)
    if (getLayout != null) __obj.updateDynamic("getLayout")(getLayout)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (hideTitle != null) __obj.updateDynamic("hideTitle")(hideTitle)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(setDefaultType)
    if (setDocked != null) __obj.updateDynamic("setDocked")(setDocked)
    if (setLayout != null) __obj.updateDynamic("setLayout")(setLayout)
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(setMinHeight)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (showTitle != null) __obj.updateDynamic("showTitle")(showTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(titleCls)) __obj.updateDynamic("titleCls")(titleCls)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[IToolbar]
  }
}

