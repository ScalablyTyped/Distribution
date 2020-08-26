package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICartesianChart extends IAbstractChart {
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of flipXY
    * @returns Boolean
    */
  var getFlipXY: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of innerRegion
    * @returns Array
    */
  var getInnerRegion: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of flipXY
    * @param flipXY Boolean The new value.
    */
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of innerRegion
    * @param innerRegion Array The new value.
    */
  var setInnerRegion: js.UndefOr[js.Function1[/* innerRegion */ js.UndefOr[Array], Unit]] = js.native
}

object ICartesianChart {
  @scala.inline
  def apply(): ICartesianChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesianChart]
  }
  @scala.inline
  implicit class ICartesianChartOps[Self <: ICartesianChart] (val x: Self) extends AnyVal {
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
    def setFlipXY(value: Boolean): Self = this.set("flipXY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipXY: Self = this.set("flipXY", js.undefined)
    @scala.inline
    def setGetFlipXY(value: () => Boolean): Self = this.set("getFlipXY", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFlipXY: Self = this.set("getFlipXY", js.undefined)
    @scala.inline
    def setGetInnerRegion(value: () => Array): Self = this.set("getInnerRegion", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInnerRegion: Self = this.set("getInnerRegion", js.undefined)
    @scala.inline
    def setPerformLayout(value: () => Unit): Self = this.set("performLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deletePerformLayout: Self = this.set("performLayout", js.undefined)
    @scala.inline
    def setSetFlipXY(value: /* flipXY */ js.UndefOr[Boolean] => Unit): Self = this.set("setFlipXY", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFlipXY: Self = this.set("setFlipXY", js.undefined)
    @scala.inline
    def setSetInnerRegion(value: /* innerRegion */ js.UndefOr[Array] => Unit): Self = this.set("setInnerRegion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInnerRegion: Self = this.set("setInnerRegion", js.undefined)
  }
  
}

