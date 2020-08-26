package typings.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemInfo extends IAbstract {
  /** [Method] Returns the value of panel
    * @returns Object
    */
  var getPanel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Placeholder method
    * @param series Object
    * @param item Object
    */
  @JSName("onGesture")
  var onGesture_IItemInfo: js.UndefOr[
    js.Function2[/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Object) */
  var panel: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of panel
    * @param panel Object The new value.
    */
  var setPanel: js.UndefOr[js.Function1[/* panel */ js.UndefOr[js.Any], Unit]] = js.native
}

object IItemInfo {
  @scala.inline
  def apply(): IItemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemInfo]
  }
  @scala.inline
  implicit class IItemInfoOps[Self <: IItemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPanel(value: () => _): Self = this.set("getPanel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPanel: Self = this.set("getPanel", js.undefined)
    @scala.inline
    def setOnGesture(value: (/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any]) => Unit): Self = this.set("onGesture", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnGesture: Self = this.set("onGesture", js.undefined)
    @scala.inline
    def setPanel(value: js.Any): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    @scala.inline
    def setSetPanel(value: /* panel */ js.UndefOr[js.Any] => Unit): Self = this.set("setPanel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPanel: Self = this.set("setPanel", js.undefined)
  }
  
}

