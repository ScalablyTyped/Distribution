package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToolbar extends IContainer {
  /** [Method] Returns the value of layout
    * @returns Object/String
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an Ext Title component
    * @returns Ext.Title
    */
  var getTitle: js.UndefOr[js.Function0[ITitle]] = js.native
  /** [Method] Hides the title if it exists  */
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_IToolbar: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of minHeight
    * @param minHeight String The new value.
    */
  @JSName("setMinHeight")
  var setMinHeight_IToolbar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Use this to update the title configuration
    * @param title String/Ext.Title You can either pass a String, or a config/instance of Ext.Title.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Shows the title if it exists  */
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Ext.Title) */
  var title: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var titleCls: js.UndefOr[Boolean] = js.native
}

object IToolbar {
  @scala.inline
  def apply(): IToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolbar]
  }
  @scala.inline
  implicit class IToolbarOps[Self <: IToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetTitle(value: () => ITitle): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    @scala.inline
    def setHideTitle(value: () => Unit): Self = this.set("hideTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHideTitle: Self = this.set("hideTitle", js.undefined)
    @scala.inline
    def setMinHeight(value: java.lang.String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setSetMinHeight(value: /* minHeight */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMinHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinHeight: Self = this.set("setMinHeight", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[js.Any] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setShowTitle(value: () => Unit): Self = this.set("showTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleCls(value: Boolean): Self = this.set("titleCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleCls: Self = this.set("titleCls", js.undefined)
  }
  
}

