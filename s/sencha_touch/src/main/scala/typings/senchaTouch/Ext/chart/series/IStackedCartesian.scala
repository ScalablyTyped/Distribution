package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackedCartesian extends ICartesian {
  /** [Method] Returns the value of stacked
    * @returns Boolean
    */
  var getStacked: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IStackedCartesian: js.UndefOr[Array] = js.native
  /** [Method] Sets the value of hidden
    * @param hidden Array The new value.
    */
  @JSName("setHidden")
  var setHidden_IStackedCartesian: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of stacked
    * @param stacked Boolean The new value.
    */
  var setStacked: js.UndefOr[js.Function1[/* stacked */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var stacked: js.UndefOr[Boolean] = js.native
}

object IStackedCartesian {
  @scala.inline
  def apply(): IStackedCartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackedCartesian]
  }
  @scala.inline
  implicit class IStackedCartesianOps[Self <: IStackedCartesian] (val x: Self) extends AnyVal {
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
    def setGetStacked(value: () => Boolean): Self = this.set("getStacked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStacked: Self = this.set("getStacked", js.undefined)
    @scala.inline
    def setHidden(value: Array): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setSetHidden(value: /* hidden */ js.UndefOr[Array] => Unit): Self = this.set("setHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHidden: Self = this.set("setHidden", js.undefined)
    @scala.inline
    def setSetStacked(value: /* stacked */ js.UndefOr[Boolean] => Unit): Self = this.set("setStacked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStacked: Self = this.set("setStacked", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
  }
  
}

