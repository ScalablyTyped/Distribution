package typings.senchaTouch.Ext.chart.series.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAggregative extends ICartesian {
  /** [Config Option] (Object) */
  var dataClose: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataHigh: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataLow: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataOpen: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of aggregator
    * @returns Object
    */
  var getAggregator: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Render the given visible clip range
    * @param surface Object
    * @param ctx Object
    * @param clip Object
    * @param region Object
    */
  @JSName("renderClipped")
  var renderClipped_IAggregative: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of aggregator
    * @param aggregator Object The new value.
    */
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAggregative {
  @scala.inline
  def apply(): IAggregative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAggregative]
  }
  @scala.inline
  implicit class IAggregativeOps[Self <: IAggregative] (val x: Self) extends AnyVal {
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
    def setDataClose(value: js.Any): Self = this.set("dataClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataClose: Self = this.set("dataClose", js.undefined)
    @scala.inline
    def setDataHigh(value: js.Any): Self = this.set("dataHigh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataHigh: Self = this.set("dataHigh", js.undefined)
    @scala.inline
    def setDataLow(value: js.Any): Self = this.set("dataLow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLow: Self = this.set("dataLow", js.undefined)
    @scala.inline
    def setDataOpen(value: js.Any): Self = this.set("dataOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataOpen: Self = this.set("dataOpen", js.undefined)
    @scala.inline
    def setGetAggregator(value: () => _): Self = this.set("getAggregator", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAggregator: Self = this.set("getAggregator", js.undefined)
    @scala.inline
    def setRenderClipped(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("renderClipped", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderClipped: Self = this.set("renderClipped", js.undefined)
    @scala.inline
    def setSetAggregator(value: /* aggregator */ js.UndefOr[js.Any] => Unit): Self = this.set("setAggregator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAggregator: Self = this.set("setAggregator", js.undefined)
  }
  
}

