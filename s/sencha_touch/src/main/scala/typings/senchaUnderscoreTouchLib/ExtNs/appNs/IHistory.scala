package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHistory
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Array) */
  var actions: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Adds an Action to the stack optionally updating the browser s url and firing the change event
  		* @param action Ext.app.Action The Action to add to the stack.
  		* @param silent Boolean Cancels the firing of the change event if true.
  		*/
  var add: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[IAction], /* silent */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Navigate to the previous active action  */
  var back: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of actions
  		* @returns Array
  		*/
  var getActions: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of token
  		* @returns String
  		*/
  var getToken: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of updateUrl
  		* @returns Boolean
  		*/
  var getUpdateUrl: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IHistory: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Sets the value of actions
  		* @param actions Array The new value.
  		*/
  var setActions: js.UndefOr[
    js.Function1[/* actions */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of token
  		* @param token String The new value.
  		*/
  var setToken: js.UndefOr[js.Function1[/* token */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of updateUrl
  		* @param updateUrl Boolean The new value.
  		*/
  var setUpdateUrl: js.UndefOr[js.Function1[/* updateUrl */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var updateUrl: js.UndefOr[scala.Boolean] = js.undefined
}

