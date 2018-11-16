package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProfile
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns the value of controllers
  		* @returns Array
  		*/
  var getControllers: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of models
  		* @returns Array
  		*/
  var getModels: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of namespace
  		* @returns String
  		*/
  var getNamespace: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of stores
  		* @returns Array
  		*/
  var getStores: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of views
  		* @returns Array
  		*/
  var getViews: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Determines whether or not this Profile is active on the device isActive is executed on
  		* @returns Boolean True if this Profile should be activated on the device it is running on, false otherwise
  		*/
  var isActive: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] The launch function is called by the Application if this Profile s isActive function returned true  */
  var launch: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Array) */
  var models: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IProfile: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit]] = js.undefined
  /** [Method] Sets the value of controllers
  		* @param controllers Array The new value.
  		*/
  var setControllers: js.UndefOr[
    js.Function1[/* controllers */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of models
  		* @param models Array The new value.
  		*/
  var setModels: js.UndefOr[
    js.Function1[/* models */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of namespace
  		* @param namespace String The new value.
  		*/
  var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stores
  		* @param stores Array The new value.
  		*/
  var setStores: js.UndefOr[
    js.Function1[/* stores */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of views
  		* @param views Array The new value.
  		*/
  var setViews: js.UndefOr[
    js.Function1[/* views */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Array) */
  var stores: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Array) */
  var views: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
}

