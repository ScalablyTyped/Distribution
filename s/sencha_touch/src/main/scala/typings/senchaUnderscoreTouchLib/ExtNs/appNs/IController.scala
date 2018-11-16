package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IController
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Config Option] (Object) */
  var before: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns the value of before
  		* @returns Object
  		*/
  var getBefore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of control
  		* @returns Object
  		*/
  var getControl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns a reference to another Controller
  		* @param controllerName String
  		* @param profile String
  		* @returns Object
  		*/
  var getController: js.UndefOr[
    js.Function2[
      /* controllerName */ js.UndefOr[java.lang.String], 
      /* profile */ js.UndefOr[java.lang.String], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns a reference to a Model
  		* @param modelName String
  		* @returns Object
  		*/
  var getModel: js.UndefOr[js.Function1[/* modelName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the value of models
  		* @returns String[]
  		*/
  var getModels: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of refs
  		* @returns Object
  		*/
  var getRefs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of routes
  		* @returns Object
  		*/
  var getRoutes: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of stores
  		* @returns String[]
  		*/
  var getStores: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of views
  		* @returns Array
  		*/
  var getViews: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Function) */
  var init: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var launch: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var models: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Convenient way to redirect to a new url
  		* @param place Object
  		* @returns Object
  		*/
  var redirectTo: js.UndefOr[js.Function1[/* place */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Object) */
  var refs: js.UndefOr[js.Any] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IController: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var routes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit]] = js.undefined
  /** [Method] Sets the value of before
  		* @param before Object The new value.
  		*/
  var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of models
  		* @param models String[] The new value.
  		*/
  var setModels: js.UndefOr[
    js.Function1[/* models */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of refs
  		* @param refs Object The new value.
  		*/
  var setRefs: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of routes
  		* @param routes Object The new value.
  		*/
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of stores
  		* @param stores String[] The new value.
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
  /** [Config Option] (String[]) */
  var stores: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Array) */
  var views: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
}

