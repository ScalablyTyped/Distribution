package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITapRepeater
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Returns the value of accelerate
  		* @returns Boolean
  		*/
  var getAccelerate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of delay
  		* @returns Number
  		*/
  var getDelay: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of el
  		* @returns Object
  		*/
  var getEl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of interval
  		* @returns Number
  		*/
  var getInterval: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of pressCls
  		* @returns Object
  		*/
  var getPressCls: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of preventDefault
  		* @returns Boolean
  		*/
  var getPreventDefault: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of stopDefault
  		* @returns Boolean
  		*/
  var getStopDefault: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of timer
  		* @returns Number
  		*/
  var getTimer: js.UndefOr[js.Function0[scala.Double]] = js.undefined
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
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Sets the value of accelerate
  		* @param accelerate Boolean The new value.
  		*/
  var setAccelerate: js.UndefOr[js.Function1[/* accelerate */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of delay
  		* @param delay Number The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of el
  		* @param el Object The new value.
  		*/
  var setEl: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of interval
  		* @param interval Number The new value.
  		*/
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pressCls
  		* @param pressCls Object The new value.
  		*/
  var setPressCls: js.UndefOr[js.Function1[/* pressCls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of preventDefault
  		* @param preventDefault Boolean The new value.
  		*/
  var setPreventDefault: js.UndefOr[js.Function1[/* preventDefault */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stopDefault
  		* @param stopDefault Boolean The new value.
  		*/
  var setStopDefault: js.UndefOr[js.Function1[/* stopDefault */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of timer
  		* @param timer Number The new value.
  		*/
  var setTimer: js.UndefOr[js.Function1[/* timer */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

