package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPolarChart extends IAbstractChart {
  /** [Config Option] (Array) */
  var center: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of center
    * @returns Array
    */
  var getCenter: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of radius
    * @returns Number
    */
  var getRadius: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of center
    * @param center Array The new value.
    */
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of radius
    * @param radius Number The new value.
    */
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.native
}

object IPolarChart {
  @scala.inline
  def apply(): IPolarChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolarChart]
  }
  @scala.inline
  implicit class IPolarChartOps[Self <: IPolarChart] (val x: Self) extends AnyVal {
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
    def setCenter(value: Array): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setGetCenter(value: () => Array): Self = this.set("getCenter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCenter: Self = this.set("getCenter", js.undefined)
    @scala.inline
    def setGetRadius(value: () => Double): Self = this.set("getRadius", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRadius: Self = this.set("getRadius", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSetCenter(value: /* center */ js.UndefOr[Array] => Unit): Self = this.set("setCenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCenter: Self = this.set("setCenter", js.undefined)
    @scala.inline
    def setSetRadius(value: /* radius */ js.UndefOr[Double] => Unit): Self = this.set("setRadius", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRadius: Self = this.set("setRadius", js.undefined)
  }
  
}

