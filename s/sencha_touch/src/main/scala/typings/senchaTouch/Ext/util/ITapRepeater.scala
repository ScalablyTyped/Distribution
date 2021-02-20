package typings.senchaTouch.Ext.util

import org.scalablytyped.runtime.StObject
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
  implicit class ITapRepeaterMutableBuilder[Self <: ITapRepeater] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAccelerate(value: () => Boolean): Self = StObject.set(x, "getAccelerate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAccelerateUndefined: Self = StObject.set(x, "getAccelerate", js.undefined)
    
    @scala.inline
    def setGetDelay(value: () => Double): Self = StObject.set(x, "getDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDelayUndefined: Self = StObject.set(x, "getDelay", js.undefined)
    
    @scala.inline
    def setGetEl(value: () => _): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    @scala.inline
    def setGetInterval(value: () => Double): Self = StObject.set(x, "getInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIntervalUndefined: Self = StObject.set(x, "getInterval", js.undefined)
    
    @scala.inline
    def setGetPressCls(value: () => _): Self = StObject.set(x, "getPressCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPressClsUndefined: Self = StObject.set(x, "getPressCls", js.undefined)
    
    @scala.inline
    def setGetPreventDefault(value: () => Boolean): Self = StObject.set(x, "getPreventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreventDefaultUndefined: Self = StObject.set(x, "getPreventDefault", js.undefined)
    
    @scala.inline
    def setGetStopDefault(value: () => Boolean): Self = StObject.set(x, "getStopDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStopDefaultUndefined: Self = StObject.set(x, "getStopDefault", js.undefined)
    
    @scala.inline
    def setGetTimer(value: () => Double): Self = StObject.set(x, "getTimer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimerUndefined: Self = StObject.set(x, "getTimer", js.undefined)
    
    @scala.inline
    def setRelayEvents(
      value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setSetAccelerate(value: /* accelerate */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAccelerate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAccelerateUndefined: Self = StObject.set(x, "setAccelerate", js.undefined)
    
    @scala.inline
    def setSetDelay(value: /* delay */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDelayUndefined: Self = StObject.set(x, "setDelay", js.undefined)
    
    @scala.inline
    def setSetEl(value: /* el */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetElUndefined: Self = StObject.set(x, "setEl", js.undefined)
    
    @scala.inline
    def setSetInterval(value: /* interval */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setInterval", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
    
    @scala.inline
    def setSetPressCls(value: /* pressCls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPressCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPressClsUndefined: Self = StObject.set(x, "setPressCls", js.undefined)
    
    @scala.inline
    def setSetPreventDefault(value: /* preventDefault */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPreventDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPreventDefaultUndefined: Self = StObject.set(x, "setPreventDefault", js.undefined)
    
    @scala.inline
    def setSetStopDefault(value: /* stopDefault */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStopDefault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStopDefaultUndefined: Self = StObject.set(x, "setStopDefault", js.undefined)
    
    @scala.inline
    def setSetTimer(value: /* timer */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimerUndefined: Self = StObject.set(x, "setTimer", js.undefined)
  }
}
