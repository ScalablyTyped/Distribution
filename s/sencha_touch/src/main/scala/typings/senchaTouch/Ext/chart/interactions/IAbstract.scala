package typings.senchaTouch.Ext.chart.interactions

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.chart.IAbstractChart
import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstract extends IObservable {
  
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[IAbstractChart] = js.native
  
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var gesture: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of chart
    * @returns Ext.chart.AbstractChart
    */
  var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.native
  
  /** [Method] Returns the value of enabled
    * @returns Boolean
    */
  var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of gesture
    * @returns String
    */
  var getGesture: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Find and return a single series item corresponding to the given event or null if no matching item is found
    * @param e Event
    * @returns Object the item object or null if none found.
    */
  var getItemForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], _]] = js.native
  
  /** [Method] Find and return all series items corresponding to the given event
    * @param e Event
    * @returns Array array of matching item objects
    */
  var getItemsForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Array]] = js.native
  
  /** [Method] A method to be implemented by subclasses where all event attachment should occur  */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Placeholder method  */
  var onGesture: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  
  /** [Method] Sets the value of chart
    * @param chart Ext.chart.AbstractChart The new value.
    */
  var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.native
  
  /** [Method] Sets the value of enabled
    * @param enabled Boolean The new value.
    */
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of gesture
    * @param gesture String The new value.
    */
  var setGesture: js.UndefOr[js.Function1[/* gesture */ js.UndefOr[String], Unit]] = js.native
  
  /** [Property] (Number) */
  var throttleGap: js.UndefOr[Double] = js.native
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
    def setChart(value: IAbstractChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setGesture(value: String): Self = this.set("gesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGesture: Self = this.set("gesture", js.undefined)
    
    @scala.inline
    def setGetChart(value: () => IAbstractChart): Self = this.set("getChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetChart: Self = this.set("getChart", js.undefined)
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("getEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnabled: Self = this.set("getEnabled", js.undefined)
    
    @scala.inline
    def setGetGesture(value: () => String): Self = this.set("getGesture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGesture: Self = this.set("getGesture", js.undefined)
    
    @scala.inline
    def setGetItemForEvent(value: /* e */ js.UndefOr[Event] => _): Self = this.set("getItemForEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemForEvent: Self = this.set("getItemForEvent", js.undefined)
    
    @scala.inline
    def setGetItemsForEvent(value: /* e */ js.UndefOr[Event] => Array): Self = this.set("getItemsForEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemsForEvent: Self = this.set("getItemsForEvent", js.undefined)
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    
    @scala.inline
    def setOnGesture(value: () => Unit): Self = this.set("onGesture", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnGesture: Self = this.set("onGesture", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setSetChart(value: /* chart */ js.UndefOr[IAbstractChart] => Unit): Self = this.set("setChart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetChart: Self = this.set("setChart", js.undefined)
    
    @scala.inline
    def setSetEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnabled: Self = this.set("setEnabled", js.undefined)
    
    @scala.inline
    def setSetGesture(value: /* gesture */ js.UndefOr[String] => Unit): Self = this.set("setGesture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGesture: Self = this.set("setGesture", js.undefined)
    
    @scala.inline
    def setThrottleGap(value: Double): Self = this.set("throttleGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleGap: Self = this.set("throttleGap", js.undefined)
  }
}
