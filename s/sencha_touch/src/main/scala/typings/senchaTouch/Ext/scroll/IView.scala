package typings.senchaTouch.Ext.scroll

import typings.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends IEvented {
  /** [Method] Returns the value of cls
    * @returns String
    */
  var getCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of indicators
    * @returns Object
    */
  var getIndicators: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of indicatorsHidingDelay
    * @returns Number
    */
  var getIndicatorsHidingDelay: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of indicatorsUi
    * @returns String
    */
  var getIndicatorsUi: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the scroller instance in this view
    * @returns Ext.scroll.View The scroller
    */
  var getScroller: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  var indicatorsUi: js.UndefOr[String] = js.native
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of indicators
    * @param indicators Object The new value.
    */
  var setIndicators: js.UndefOr[js.Function1[/* indicators */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of indicatorsHidingDelay
    * @param indicatorsHidingDelay Number The new value.
    */
  var setIndicatorsHidingDelay: js.UndefOr[js.Function1[/* indicatorsHidingDelay */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of indicatorsUi
    * @param indicatorsUi String The new value.
    */
  var setIndicatorsUi: js.UndefOr[js.Function1[/* indicatorsUi */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of scroller
    * @param scroller Object The new value.
    */
  var setScroller: js.UndefOr[js.Function1[/* scroller */ js.UndefOr[js.Any], Unit]] = js.native
}

object IView {
  @scala.inline
  def apply(): IView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
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
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    @scala.inline
    def setGetElement(value: () => _): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetElement: Self = this.set("getElement", js.undefined)
    @scala.inline
    def setGetIndicators(value: () => _): Self = this.set("getIndicators", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIndicators: Self = this.set("getIndicators", js.undefined)
    @scala.inline
    def setGetIndicatorsHidingDelay(value: () => Double): Self = this.set("getIndicatorsHidingDelay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIndicatorsHidingDelay: Self = this.set("getIndicatorsHidingDelay", js.undefined)
    @scala.inline
    def setGetIndicatorsUi(value: () => String): Self = this.set("getIndicatorsUi", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIndicatorsUi: Self = this.set("getIndicatorsUi", js.undefined)
    @scala.inline
    def setGetScroller(value: () => IView): Self = this.set("getScroller", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScroller: Self = this.set("getScroller", js.undefined)
    @scala.inline
    def setIndicatorsUi(value: String): Self = this.set("indicatorsUi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorsUi: Self = this.set("indicatorsUi", js.undefined)
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    @scala.inline
    def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = this.set("setElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetElement: Self = this.set("setElement", js.undefined)
    @scala.inline
    def setSetIndicators(value: /* indicators */ js.UndefOr[js.Any] => Unit): Self = this.set("setIndicators", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIndicators: Self = this.set("setIndicators", js.undefined)
    @scala.inline
    def setSetIndicatorsHidingDelay(value: /* indicatorsHidingDelay */ js.UndefOr[Double] => Unit): Self = this.set("setIndicatorsHidingDelay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIndicatorsHidingDelay: Self = this.set("setIndicatorsHidingDelay", js.undefined)
    @scala.inline
    def setSetIndicatorsUi(value: /* indicatorsUi */ js.UndefOr[String] => Unit): Self = this.set("setIndicatorsUi", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIndicatorsUi: Self = this.set("setIndicatorsUi", js.undefined)
    @scala.inline
    def setSetScroller(value: /* scroller */ js.UndefOr[js.Any] => Unit): Self = this.set("setScroller", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScroller: Self = this.set("setScroller", js.undefined)
  }
  
}

