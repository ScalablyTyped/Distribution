package typings.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICrossZoom extends IAbstract {
  /** [Config Option] (Object/Array) */
  var axes: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of axes
    * @returns Object/Array
    */
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of undoButton
    * @returns Object
    */
  var getUndoButton: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Placeholder method
    * @param e Object
    */
  @JSName("onGesture")
  var onGesture_ICrossZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of axes
    * @param axes Object/Array The new value.
    */
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of undoButton
    * @param undoButton Object The new value.
    */
  var setUndoButton: js.UndefOr[js.Function1[/* undoButton */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICrossZoom {
  @scala.inline
  def apply(): ICrossZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICrossZoom]
  }
  @scala.inline
  implicit class ICrossZoomOps[Self <: ICrossZoom] (val x: Self) extends AnyVal {
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
    def setAxes(value: js.Any): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setGetAxes(value: () => _): Self = this.set("getAxes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAxes: Self = this.set("getAxes", js.undefined)
    @scala.inline
    def setGetUndoButton(value: () => _): Self = this.set("getUndoButton", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUndoButton: Self = this.set("getUndoButton", js.undefined)
    @scala.inline
    def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onGesture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGesture: Self = this.set("onGesture", js.undefined)
    @scala.inline
    def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = this.set("setAxes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAxes: Self = this.set("setAxes", js.undefined)
    @scala.inline
    def setSetUndoButton(value: /* undoButton */ js.UndefOr[js.Any] => Unit): Self = this.set("setUndoButton", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUndoButton: Self = this.set("setUndoButton", js.undefined)
  }
  
}

