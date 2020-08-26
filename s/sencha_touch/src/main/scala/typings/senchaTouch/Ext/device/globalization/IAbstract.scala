package typings.senchaTouch.Ext.device.globalization

import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IObservable {
  /** [Method] Returns the value of currencyCode
    * @returns String
    */
  var getCurrencyCode: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of dateType
    * @returns String
    */
  var getDateType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of formatLength
    * @returns String
    */
  var getFormatLength: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of items
    * @returns String
    */
  var getItems: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of numberType
    * @returns String
    */
  var getNumberType: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of selector
    * @returns String
    */
  var getSelector: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of currencyCode
    * @param currencyCode String The new value.
    */
  var setCurrencyCode: js.UndefOr[js.Function1[/* currencyCode */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of dateType
    * @param dateType String The new value.
    */
  var setDateType: js.UndefOr[js.Function1[/* dateType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of formatLength
    * @param formatLength String The new value.
    */
  var setFormatLength: js.UndefOr[js.Function1[/* formatLength */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of items
    * @param items String The new value.
    */
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of numberType
    * @param numberType String The new value.
    */
  var setNumberType: js.UndefOr[js.Function1[/* numberType */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of selector
    * @param selector String The new value.
    */
  var setSelector: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setGetCurrencyCode(value: () => String): Self = this.set("getCurrencyCode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCurrencyCode: Self = this.set("getCurrencyCode", js.undefined)
    @scala.inline
    def setGetDateType(value: () => String): Self = this.set("getDateType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDateType: Self = this.set("getDateType", js.undefined)
    @scala.inline
    def setGetFormatLength(value: () => String): Self = this.set("getFormatLength", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFormatLength: Self = this.set("getFormatLength", js.undefined)
    @scala.inline
    def setGetItems(value: () => String): Self = this.set("getItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    @scala.inline
    def setGetNumberType(value: () => String): Self = this.set("getNumberType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNumberType: Self = this.set("getNumberType", js.undefined)
    @scala.inline
    def setGetSelector(value: () => String): Self = this.set("getSelector", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSelector: Self = this.set("getSelector", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setSetCurrencyCode(value: /* currencyCode */ js.UndefOr[String] => Unit): Self = this.set("setCurrencyCode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCurrencyCode: Self = this.set("setCurrencyCode", js.undefined)
    @scala.inline
    def setSetDateType(value: /* dateType */ js.UndefOr[String] => Unit): Self = this.set("setDateType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDateType: Self = this.set("setDateType", js.undefined)
    @scala.inline
    def setSetFormatLength(value: /* formatLength */ js.UndefOr[String] => Unit): Self = this.set("setFormatLength", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFormatLength: Self = this.set("setFormatLength", js.undefined)
    @scala.inline
    def setSetItems(value: /* items */ js.UndefOr[String] => Unit): Self = this.set("setItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetItems: Self = this.set("setItems", js.undefined)
    @scala.inline
    def setSetNumberType(value: /* numberType */ js.UndefOr[String] => Unit): Self = this.set("setNumberType", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNumberType: Self = this.set("setNumberType", js.undefined)
    @scala.inline
    def setSetSelector(value: /* selector */ js.UndefOr[String] => Unit): Self = this.set("setSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSelector: Self = this.set("setSelector", js.undefined)
  }
  
}

