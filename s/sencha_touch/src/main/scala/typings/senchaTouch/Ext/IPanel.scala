package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel extends IContainer {
  /** [Config Option] (Number/Boolean/String) */
  var bodyBorder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Boolean/String) */
  var bodyMargin: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/Boolean/String) */
  var bodyPadding: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of bodyBorder
    * @returns Number/Boolean/String
    */
  var getBodyBorder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of bodyMargin
    * @returns Number/Boolean/String
    */
  var getBodyMargin: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of bodyPadding
    * @returns Number/Boolean/String
    */
  var getBodyPadding: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of bodyBorder
    * @param bodyBorder Number/Boolean/String The new value.
    */
  var setBodyBorder: js.UndefOr[js.Function1[/* bodyBorder */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of bodyMargin
    * @param bodyMargin Number/Boolean/String The new value.
    */
  var setBodyMargin: js.UndefOr[js.Function1[/* bodyMargin */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of bodyPadding
    * @param bodyPadding Number/Boolean/String The new value.
    */
  var setBodyPadding: js.UndefOr[js.Function1[/* bodyPadding */ js.UndefOr[js.Any], Unit]] = js.native
}

object IPanel {
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
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
    def setBodyBorder(value: js.Any): Self = this.set("bodyBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyBorder: Self = this.set("bodyBorder", js.undefined)
    @scala.inline
    def setBodyMargin(value: js.Any): Self = this.set("bodyMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyMargin: Self = this.set("bodyMargin", js.undefined)
    @scala.inline
    def setBodyPadding(value: js.Any): Self = this.set("bodyPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyPadding: Self = this.set("bodyPadding", js.undefined)
    @scala.inline
    def setGetBodyBorder(value: () => _): Self = this.set("getBodyBorder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBodyBorder: Self = this.set("getBodyBorder", js.undefined)
    @scala.inline
    def setGetBodyMargin(value: () => _): Self = this.set("getBodyMargin", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBodyMargin: Self = this.set("getBodyMargin", js.undefined)
    @scala.inline
    def setGetBodyPadding(value: () => _): Self = this.set("getBodyPadding", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBodyPadding: Self = this.set("getBodyPadding", js.undefined)
    @scala.inline
    def setSetBodyBorder(value: /* bodyBorder */ js.UndefOr[js.Any] => Unit): Self = this.set("setBodyBorder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBodyBorder: Self = this.set("setBodyBorder", js.undefined)
    @scala.inline
    def setSetBodyMargin(value: /* bodyMargin */ js.UndefOr[js.Any] => Unit): Self = this.set("setBodyMargin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBodyMargin: Self = this.set("setBodyMargin", js.undefined)
    @scala.inline
    def setSetBodyPadding(value: /* bodyPadding */ js.UndefOr[js.Any] => Unit): Self = this.set("setBodyPadding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBodyPadding: Self = this.set("setBodyPadding", js.undefined)
  }
  
}

