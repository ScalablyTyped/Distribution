package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatch
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Adds a new operation to this batch
  		* @param operation Object The Operation object.
  		*/
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Number) */
  var current: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of autoStart
  		* @returns Boolean
  		*/
  var getAutoStart: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of pauseOnException
  		* @returns Boolean
  		*/
  var getPauseOnException: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns Ext.data.Proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[IProxy]] = js.undefined
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Pauses execution of the batch but does not cancel the current operation  */
  var pause: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Proxy) */
  var proxy: js.UndefOr[IProxy] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IBatch: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Executes a operation by its numeric index
  		* @param index Number The operation index to run.
  		*/
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoStart
  		* @param autoStart Boolean The new value.
  		*/
  var setAutoStart: js.UndefOr[js.Function1[/* autoStart */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pauseOnException
  		* @param pauseOnException Boolean The new value.
  		*/
  var setPauseOnException: js.UndefOr[js.Function1[/* pauseOnException */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of proxy
  		* @param proxy Ext.data.Proxy The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[IProxy], scala.Unit]] = js.undefined
  /** [Method] Kicks off the execution of the batch continuing from the next operation if the previous operation encountered an exc  */
  var start: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Number) */
  var total: js.UndefOr[scala.Double] = js.undefined
}

