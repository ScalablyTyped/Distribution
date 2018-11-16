package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Returns the value of src
  		* @returns Object
  		*/
  var getSrc: js.UndefOr[js.Function0[_]] = js.undefined
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
  /** [Method] Sets the value of src
  		* @param src Object The new value.
  		*/
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

