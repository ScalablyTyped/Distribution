package typings.senchaTouch.Ext

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
    getLayout: () => _ = null,
    getTitle: () => ITitle = null,
    hideTitle: () => Unit = null,
    minHeight: java.lang.String = null,
    setMinHeight: /* minHeight */ js.UndefOr[java.lang.String] => Unit = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Unit = null,
    showTitle: () => Unit = null,
    title: js.Any = null,
    titleCls: js.UndefOr[Boolean] = js.undefined
  ): IToolbar = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (hideTitle != null) __obj.updateDynamic("hideTitle")(js.Any.fromFunction0(hideTitle))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (showTitle != null) __obj.updateDynamic("showTitle")(js.Any.fromFunction0(showTitle))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleCls)) __obj.updateDynamic("titleCls")(titleCls.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolbar]
  }
}

