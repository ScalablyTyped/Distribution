package typings.senchaTouch.Ext.chart.axis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INumeric extends IAxis {
  /** [Method] Returns the value of aggregator
    * @returns String
    */
  var getAggregator: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of layout
    * @returns String
    */
  @JSName("getLayout")
  var getLayout_INumeric: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of segmenter
    * @returns String
    */
  @JSName("getSegmenter")
  var getSegmenter_INumeric: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of aggregator
    * @param aggregator String The new value.
    */
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of layout
    * @param layout String The new value.
    */
  @JSName("setLayout")
  var setLayout_INumeric: js.UndefOr[js.Function1[/* layout */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of segmenter
    * @param segmenter String The new value.
    */
  @JSName("setSegmenter")
  var setSegmenter_INumeric: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[String], Unit]] = js.native
}

object INumeric {
  @scala.inline
  def apply(): INumeric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumeric]
  }
  @scala.inline
  implicit class INumericOps[Self <: INumeric] (val x: Self) extends AnyVal {
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
    def setGetAggregator(value: () => String): Self = this.set("getAggregator", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAggregator: Self = this.set("getAggregator", js.undefined)
    @scala.inline
    def setGetLayout(value: () => String): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetSegmenter(value: () => String): Self = this.set("getSegmenter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSegmenter: Self = this.set("getSegmenter", js.undefined)
    @scala.inline
    def setSetAggregator(value: /* aggregator */ js.UndefOr[String] => Unit): Self = this.set("setAggregator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAggregator: Self = this.set("setAggregator", js.undefined)
    @scala.inline
    def setSetLayout(value: /* layout */ js.UndefOr[String] => Unit): Self = this.set("setLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLayout: Self = this.set("setLayout", js.undefined)
    @scala.inline
    def setSetSegmenter(value: /* segmenter */ js.UndefOr[String] => Unit): Self = this.set("setSegmenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSegmenter: Self = this.set("setSegmenter", js.undefined)
  }
  
}

