package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Property] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Opens a specified URL
  		* @param url String The URL to open
  		*/
  var openURL: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Property] (String) */
  var platform: js.UndefOr[java.lang.String] = js.undefined
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
  /** [Property] (Object/Boolean) */
  var scheme: js.UndefOr[js.Any] = js.undefined
  /** [Property] (String) */
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

