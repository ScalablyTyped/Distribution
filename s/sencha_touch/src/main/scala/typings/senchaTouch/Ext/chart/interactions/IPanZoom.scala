package typings.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanZoom extends IAbstract {
  /** [Config Option] (Object/Array) */
  var axes: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of axes
    * @returns Object/Array
    */
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hideLabelInGesture
    * @returns Boolean
    */
  var getHideLabelInGesture: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of maxZoom
    * @returns Object
    */
  var getMaxZoom: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of minZoom
    * @returns Object
    */
  var getMinZoom: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of modeToggleButton
    * @returns Object
    */
  var getModeToggleButton: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of panGesture
    * @returns String
    */
  var getPanGesture: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of showOverflowArrows
    * @returns Boolean
    */
  var getShowOverflowArrows: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of zoomOnPanGesture
    * @returns Boolean
    */
  var getZoomOnPanGesture: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Placeholder method
    * @param e Object
    */
  @JSName("onGesture")
  var onGesture_IPanZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var overflowArrowOptions: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of axes
    * @param axes Object/Array The new value.
    */
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hideLabelInGesture
    * @param hideLabelInGesture Boolean The new value.
    */
  var setHideLabelInGesture: js.UndefOr[js.Function1[/* hideLabelInGesture */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of maxZoom
    * @param maxZoom Object The new value.
    */
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of minZoom
    * @param minZoom Object The new value.
    */
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of modeToggleButton
    * @param modeToggleButton Object The new value.
    */
  var setModeToggleButton: js.UndefOr[js.Function1[/* modeToggleButton */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of panGesture
    * @param panGesture String The new value.
    */
  var setPanGesture: js.UndefOr[js.Function1[/* panGesture */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of showOverflowArrows
    * @param showOverflowArrows Boolean The new value.
    */
  var setShowOverflowArrows: js.UndefOr[js.Function1[/* showOverflowArrows */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of zoomOnPanGesture
    * @param zoomOnPanGesture Boolean The new value.
    */
  var setZoomOnPanGesture: js.UndefOr[js.Function1[/* zoomOnPanGesture */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showOverflowArrows: js.UndefOr[Boolean] = js.native
}

object IPanZoom {
  @scala.inline
  def apply(): IPanZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanZoom]
  }
  @scala.inline
  implicit class IPanZoomOps[Self <: IPanZoom] (val x: Self) extends AnyVal {
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
    def setGetHideLabelInGesture(value: () => Boolean): Self = this.set("getHideLabelInGesture", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHideLabelInGesture: Self = this.set("getHideLabelInGesture", js.undefined)
    @scala.inline
    def setGetMaxZoom(value: () => _): Self = this.set("getMaxZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxZoom: Self = this.set("getMaxZoom", js.undefined)
    @scala.inline
    def setGetMinZoom(value: () => _): Self = this.set("getMinZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinZoom: Self = this.set("getMinZoom", js.undefined)
    @scala.inline
    def setGetModeToggleButton(value: () => _): Self = this.set("getModeToggleButton", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModeToggleButton: Self = this.set("getModeToggleButton", js.undefined)
    @scala.inline
    def setGetPanGesture(value: () => String): Self = this.set("getPanGesture", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPanGesture: Self = this.set("getPanGesture", js.undefined)
    @scala.inline
    def setGetShowOverflowArrows(value: () => Boolean): Self = this.set("getShowOverflowArrows", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetShowOverflowArrows: Self = this.set("getShowOverflowArrows", js.undefined)
    @scala.inline
    def setGetZoomOnPanGesture(value: () => Boolean): Self = this.set("getZoomOnPanGesture", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetZoomOnPanGesture: Self = this.set("getZoomOnPanGesture", js.undefined)
    @scala.inline
    def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onGesture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGesture: Self = this.set("onGesture", js.undefined)
    @scala.inline
    def setOverflowArrowOptions(value: js.Any): Self = this.set("overflowArrowOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowArrowOptions: Self = this.set("overflowArrowOptions", js.undefined)
    @scala.inline
    def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = this.set("setAxes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAxes: Self = this.set("setAxes", js.undefined)
    @scala.inline
    def setSetHideLabelInGesture(value: /* hideLabelInGesture */ js.UndefOr[Boolean] => Unit): Self = this.set("setHideLabelInGesture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHideLabelInGesture: Self = this.set("setHideLabelInGesture", js.undefined)
    @scala.inline
    def setSetMaxZoom(value: /* maxZoom */ js.UndefOr[js.Any] => Unit): Self = this.set("setMaxZoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxZoom: Self = this.set("setMaxZoom", js.undefined)
    @scala.inline
    def setSetMinZoom(value: /* minZoom */ js.UndefOr[js.Any] => Unit): Self = this.set("setMinZoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinZoom: Self = this.set("setMinZoom", js.undefined)
    @scala.inline
    def setSetModeToggleButton(value: /* modeToggleButton */ js.UndefOr[js.Any] => Unit): Self = this.set("setModeToggleButton", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetModeToggleButton: Self = this.set("setModeToggleButton", js.undefined)
    @scala.inline
    def setSetPanGesture(value: /* panGesture */ js.UndefOr[String] => Unit): Self = this.set("setPanGesture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPanGesture: Self = this.set("setPanGesture", js.undefined)
    @scala.inline
    def setSetShowOverflowArrows(value: /* showOverflowArrows */ js.UndefOr[Boolean] => Unit): Self = this.set("setShowOverflowArrows", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetShowOverflowArrows: Self = this.set("setShowOverflowArrows", js.undefined)
    @scala.inline
    def setSetZoomOnPanGesture(value: /* zoomOnPanGesture */ js.UndefOr[Boolean] => Unit): Self = this.set("setZoomOnPanGesture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetZoomOnPanGesture: Self = this.set("setZoomOnPanGesture", js.undefined)
    @scala.inline
    def setShowOverflowArrows(value: Boolean): Self = this.set("showOverflowArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOverflowArrows: Self = this.set("showOverflowArrows", js.undefined)
  }
  
}

