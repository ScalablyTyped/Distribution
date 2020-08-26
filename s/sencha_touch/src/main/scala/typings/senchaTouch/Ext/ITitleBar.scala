package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITitleBar extends IContainer {
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ITitleBar: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of maxButtonWidth
    * @returns String
    */
  var getMaxButtonWidth: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of titleAlign
    * @returns String
    */
  var getTitleAlign: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (String) */
  var maxButtonWidth: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_ITitleBar: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ITitleBar: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of maxButtonWidth
    * @param maxButtonWidth String The new value.
    */
  var setMaxButtonWidth: js.UndefOr[js.Function1[/* maxButtonWidth */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of minHeight
    * @param minHeight String The new value.
    */
  @JSName("setMinHeight")
  var setMinHeight_ITitleBar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of titleAlign
    * @param titleAlign String The new value.
    */
  var setTitleAlign: js.UndefOr[js.Function1[/* titleAlign */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[java.lang.String] = js.native
}

object ITitleBar {
  @scala.inline
  def apply(): ITitleBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITitleBar]
  }
  @scala.inline
  implicit class ITitleBarOps[Self <: ITitleBar] (val x: Self) extends AnyVal {
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
    def setGetCls(value: () => java.lang.String): Self = this.set("getCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    @scala.inline
    def setGetMaxButtonWidth(value: () => java.lang.String): Self = this.set("getMaxButtonWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxButtonWidth: Self = this.set("getMaxButtonWidth", js.undefined)
    @scala.inline
    def setGetTitle(value: () => java.lang.String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    @scala.inline
    def setGetTitleAlign(value: () => java.lang.String): Self = this.set("getTitleAlign", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitleAlign: Self = this.set("getTitleAlign", js.undefined)
    @scala.inline
    def setMaxButtonWidth(value: java.lang.String): Self = this.set("maxButtonWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxButtonWidth: Self = this.set("maxButtonWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: java.lang.String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    @scala.inline
    def setSetMaxButtonWidth(value: /* maxButtonWidth */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMaxButtonWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxButtonWidth: Self = this.set("setMaxButtonWidth", js.undefined)
    @scala.inline
    def setSetMinHeight(value: /* minHeight */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setMinHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinHeight: Self = this.set("setMinHeight", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setSetTitleAlign(value: /* titleAlign */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setTitleAlign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitleAlign: Self = this.set("setTitleAlign", js.undefined)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleAlign(value: java.lang.String): Self = this.set("titleAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAlign: Self = this.set("titleAlign", js.undefined)
  }
  
}

