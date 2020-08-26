package typings.senchaTouch.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICandleStick extends ICartesian {
  /** [Config Option] (String) */
  var closeField: js.UndefOr[String] = js.native
  /** [Method] Returns the value of closeField
    * @returns String
    */
  var getCloseField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of highField
    * @returns String
    */
  var getHighField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of lowField
    * @returns String
    */
  var getLowField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of openField
    * @returns String
    */
  var getOpenField: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var highField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var lowField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var openField: js.UndefOr[String] = js.native
  /** [Method] Sets the value of closeField
    * @param closeField String The new value.
    */
  var setCloseField: js.UndefOr[js.Function1[/* closeField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of highField
    * @param highField String The new value.
    */
  var setHighField: js.UndefOr[js.Function1[/* highField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of lowField
    * @param lowField String The new value.
    */
  var setLowField: js.UndefOr[js.Function1[/* lowField */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of openField
    * @param openField String The new value.
    */
  var setOpenField: js.UndefOr[js.Function1[/* openField */ js.UndefOr[String], Unit]] = js.native
}

object ICandleStick {
  @scala.inline
  def apply(): ICandleStick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleStick]
  }
  @scala.inline
  implicit class ICandleStickOps[Self <: ICandleStick] (val x: Self) extends AnyVal {
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
    def setCloseField(value: String): Self = this.set("closeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseField: Self = this.set("closeField", js.undefined)
    @scala.inline
    def setGetCloseField(value: () => String): Self = this.set("getCloseField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCloseField: Self = this.set("getCloseField", js.undefined)
    @scala.inline
    def setGetHighField(value: () => String): Self = this.set("getHighField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHighField: Self = this.set("getHighField", js.undefined)
    @scala.inline
    def setGetLowField(value: () => String): Self = this.set("getLowField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLowField: Self = this.set("getLowField", js.undefined)
    @scala.inline
    def setGetOpenField(value: () => String): Self = this.set("getOpenField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOpenField: Self = this.set("getOpenField", js.undefined)
    @scala.inline
    def setHighField(value: String): Self = this.set("highField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighField: Self = this.set("highField", js.undefined)
    @scala.inline
    def setLowField(value: String): Self = this.set("lowField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowField: Self = this.set("lowField", js.undefined)
    @scala.inline
    def setOpenField(value: String): Self = this.set("openField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenField: Self = this.set("openField", js.undefined)
    @scala.inline
    def setSetCloseField(value: /* closeField */ js.UndefOr[String] => Unit): Self = this.set("setCloseField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCloseField: Self = this.set("setCloseField", js.undefined)
    @scala.inline
    def setSetHighField(value: /* highField */ js.UndefOr[String] => Unit): Self = this.set("setHighField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHighField: Self = this.set("setHighField", js.undefined)
    @scala.inline
    def setSetLowField(value: /* lowField */ js.UndefOr[String] => Unit): Self = this.set("setLowField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLowField: Self = this.set("setLowField", js.undefined)
    @scala.inline
    def setSetOpenField(value: /* openField */ js.UndefOr[String] => Unit): Self = this.set("setOpenField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOpenField: Self = this.set("setOpenField", js.undefined)
  }
  
}

