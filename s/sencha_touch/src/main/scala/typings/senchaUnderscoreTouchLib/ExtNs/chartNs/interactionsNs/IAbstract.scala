package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.interactionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart] = js.undefined
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var gesture: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of chart
  		* @returns Ext.chart.AbstractChart
  		*/
  var getChart: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart]] = js.undefined
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of gesture
  		* @returns String
  		*/
  var getGesture: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Find and return a single series item corresponding to the given event or null if no matching item is found
  		* @param e Event
  		* @returns Object the item object or null if none found.
  		*/
  var getItemForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], _]] = js.undefined
  /** [Method] Find and return all series items corresponding to the given event
  		* @param e Event
  		* @returns Array array of matching item objects
  		*/
  var getItemsForEvent: js.UndefOr[
    js.Function1[/* e */ js.UndefOr[stdLib.Event], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] A method to be implemented by subclasses where all event attachment should occur  */
  var initialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Placeholder method  */
  var onGesture: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Sets the value of chart
  		* @param chart Ext.chart.AbstractChart The new value.
  		*/
  var setChart: js.UndefOr[
    js.Function1[
      /* chart */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of gesture
  		* @param gesture String The new value.
  		*/
  var setGesture: js.UndefOr[js.Function1[/* gesture */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Property] (Number) */
  var throttleGap: js.UndefOr[scala.Double] = js.undefined
}

