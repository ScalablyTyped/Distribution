package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.contactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstract
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Returns an Array of contact objects
  		* @param config Object
  		* @returns Object[] An array of contact objects.
  		*/
  var getContacts: js.UndefOr[
    js.Function1[/* config */ js.UndefOr[js.Any], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Returns the value of includeImages
  		* @returns Boolean
  		*/
  var getIncludeImages: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns localized user readable label for a contact field i e
  		* @param config Object
  		* @returns String user readable string
  		*/
  var getLocalizedLabel: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Returns base64 encoded image thumbnail for a contact specified in config id This method is for Sencha Native Packager
  		* @param config Object
  		* @returns String base64 string
  		*/
  var getThumbnail: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Config Option] (Boolean) */
  var includeImages: js.UndefOr[scala.Boolean] = js.undefined
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
  /** [Method] Sets the value of includeImages
  		* @param includeImages Boolean The new value.
  		*/
  var setIncludeImages: js.UndefOr[js.Function1[/* includeImages */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

