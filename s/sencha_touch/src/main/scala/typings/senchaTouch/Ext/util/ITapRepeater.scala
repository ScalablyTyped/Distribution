package typings.senchaTouch.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITapRepeater
  extends typings.senchaTouch.Ext.mixin.IObservable {
  
  /** [Method] Returns the value of accelerate
    * @returns Boolean
    */
  var getAccelerate: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of delay
    * @returns Number
    */
  var getDelay: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of el
    * @returns Object
    */
  var getEl: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of interval
    * @returns Number
    */
  var getInterval: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of pressCls
    * @returns Object
    */
  var getPressCls: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of preventDefault
    * @returns Boolean
    */
  var getPreventDefault: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of stopDefault
    * @returns Boolean
    */
  var getStopDefault: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of timer
    * @returns Number
    */
  var getTimer: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_ITapRepeater: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.native
  
  /** [Method] Sets the value of accelerate
    * @param accelerate Boolean The new value.
    */
  var setAccelerate: js.UndefOr[js.Function1[/* accelerate */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of delay
    * @param delay Number The new value.
    */
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of el
    * @param el Object The new value.
    */
  var setEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of interval
    * @param interval Number The new value.
    */
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of pressCls
    * @param pressCls Object The new value.
    */
  var setPressCls: js.UndefOr[js.Function1[/* pressCls */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of preventDefault
    * @param preventDefault Boolean The new value.
    */
  var setPreventDefault: js.UndefOr[js.Function1[/* preventDefault */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of stopDefault
    * @param stopDefault Boolean The new value.
    */
  var setStopDefault: js.UndefOr[js.Function1[/* stopDefault */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of timer
    * @param timer Number The new value.
    */
  var setTimer: js.UndefOr[js.Function1[/* timer */ js.UndefOr[Double], Unit]] = js.native
}
object ITapRepeater {
  
  @scala.inline
  def apply(): ITapRepeater = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITapRepeater]
  }
  
  @scala.inline
  implicit class ITapRepeaterOps[Self <: ITapRepeater] (val x: Self) extends AnyVal {
    
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
    def setGetAccelerate(value: () => Boolean): Self = this.set("getAccelerate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAccelerate: Self = this.set("getAccelerate", js.undefined)
    
    @scala.inline
    def setGetDelay(value: () => Double): Self = this.set("getDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDelay: Self = this.set("getDelay", js.undefined)
    
    @scala.inline
    def setGetEl(value: () => _): Self = this.set("getEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    
    @scala.inline
    def setGetInterval(value: () => Double): Self = this.set("getInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInterval: Self = this.set("getInterval", js.undefined)
    
    @scala.inline
    def setGetPressCls(value: () => _): Self = this.set("getPressCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPressCls: Self = this.set("getPressCls", js.undefined)
    
    @scala.inline
    def setGetPreventDefault(value: () => Boolean): Self = this.set("getPreventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPreventDefault: Self = this.set("getPreventDefault", js.undefined)
    
    @scala.inline
    def setGetStopDefault(value: () => Boolean): Self = this.set("getStopDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStopDefault: Self = this.set("getStopDefault", js.undefined)
    
    @scala.inline
    def setGetTimer(value: () => Double): Self = this.set("getTimer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTimer: Self = this.set("getTimer", js.undefined)
    
    @scala.inline
    def setRelayEvents(
      value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setSetAccelerate(value: /* accelerate */ js.UndefOr[Boolean] => Unit): Self = this.set("setAccelerate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAccelerate: Self = this.set("setAccelerate", js.undefined)
    
    @scala.inline
    def setSetDelay(value: /* delay */ js.UndefOr[Double] => Unit): Self = this.set("setDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDelay: Self = this.set("setDelay", js.undefined)
    
    @scala.inline
    def setSetEl(value: /* el */ js.UndefOr[js.Any] => Unit): Self = this.set("setEl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEl: Self = this.set("setEl", js.undefined)
    
    @scala.inline
    def setSetInterval(value: /* interval */ js.UndefOr[Double] => Unit): Self = this.set("setInterval", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInterval: Self = this.set("setInterval", js.undefined)
    
    @scala.inline
    def setSetPressCls(value: /* pressCls */ js.UndefOr[js.Any] => Unit): Self = this.set("setPressCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPressCls: Self = this.set("setPressCls", js.undefined)
    
    @scala.inline
    def setSetPreventDefault(value: /* preventDefault */ js.UndefOr[Boolean] => Unit): Self = this.set("setPreventDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPreventDefault: Self = this.set("setPreventDefault", js.undefined)
    
    @scala.inline
    def setSetStopDefault(value: /* stopDefault */ js.UndefOr[Boolean] => Unit): Self = this.set("setStopDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStopDefault: Self = this.set("setStopDefault", js.undefined)
    
    @scala.inline
    def setSetTimer(value: /* timer */ js.UndefOr[Double] => Unit): Self = this.set("setTimer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTimer: Self = this.set("setTimer", js.undefined)
  }
}
