package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISegmentTree extends IBase {
  /** [Method] Returns the minimum range of data that fits the given range and step size
    * @param min Number
    * @param max Number
    * @param estStep Number
    * @returns Object The aggregation information.
    */
  var getAggregation: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* estStep */ js.UndefOr[Double], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of strategy
    * @returns String
    */
  var getStrategy: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the data of the segment tree
    * @param dataX Number
    * @param dataOpen Number
    * @param dataHigh Number
    * @param dataLow Number
    * @param dataClose Number
    */
  var setData: js.UndefOr[
    js.Function5[
      /* dataX */ js.UndefOr[Double], 
      /* dataOpen */ js.UndefOr[Double], 
      /* dataHigh */ js.UndefOr[Double], 
      /* dataLow */ js.UndefOr[Double], 
      /* dataClose */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of strategy
    * @param strategy String The new value.
    */
  var setStrategy: js.UndefOr[js.Function1[/* strategy */ js.UndefOr[String], Unit]] = js.native
}

object ISegmentTree {
  @scala.inline
  def apply(): ISegmentTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmentTree]
  }
  @scala.inline
  implicit class ISegmentTreeOps[Self <: ISegmentTree] (val x: Self) extends AnyVal {
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
    def setGetAggregation(
      value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStep */ js.UndefOr[Double]) => _
    ): Self = this.set("getAggregation", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetAggregation: Self = this.set("getAggregation", js.undefined)
    @scala.inline
    def setGetStrategy(value: () => String): Self = this.set("getStrategy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStrategy: Self = this.set("getStrategy", js.undefined)
    @scala.inline
    def setSetData(
      value: (/* dataX */ js.UndefOr[Double], /* dataOpen */ js.UndefOr[Double], /* dataHigh */ js.UndefOr[Double], /* dataLow */ js.UndefOr[Double], /* dataClose */ js.UndefOr[Double]) => Unit
    ): Self = this.set("setData", js.Any.fromFunction5(value))
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    @scala.inline
    def setSetStrategy(value: /* strategy */ js.UndefOr[String] => Unit): Self = this.set("setStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStrategy: Self = this.set("setStrategy", js.undefined)
  }
  
}

