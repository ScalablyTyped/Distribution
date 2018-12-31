package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataReader
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of clientIdProperty
  		* @returns String
  		*/
  var getClientIdProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of idProperty
  		* @returns String
  		*/
  var getIdProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of implicitIncludes
  		* @returns Boolean
  		*/
  var getImplicitIncludes: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of messageProperty
  		* @returns String
  		*/
  var getMessageProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of model
  		* @returns Object
  		*/
  var getModel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Takes a raw response object as passed to this read and returns the useful data segment of it
  		* @param response Object The response object
  		* @returns Object The useful data from the response
  		*/
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of rootProperty
  		* @returns String
  		*/
  var getRootProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of successProperty
  		* @returns any
  		*/
  var getSuccessProperty: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of totalProperty
  		* @returns any
  		*/
  var getTotalProperty: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reads the given response object
  		* @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
  		* @returns Ext.data.ResultSet The parsed ResultSet object
  		*/
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.undefined
  /** [Method] Abstracts common functionality used by all Reader subclasses
  		* @param data Object The raw data object
  		* @returns Ext.data.ResultSet A ResultSet object
  		*/
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IDataReader: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of clientIdProperty
  		* @param clientIdProperty String The new value.
  		*/
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of idProperty
  		* @param idProperty String The new value.
  		*/
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of implicitIncludes
  		* @param implicitIncludes Boolean The new value.
  		*/
  var setImplicitIncludes: js.UndefOr[js.Function1[/* implicitIncludes */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of messageProperty
  		* @param messageProperty String The new value.
  		*/
  var setMessageProperty: js.UndefOr[js.Function1[/* messageProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model Object The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of rootProperty
  		* @param rootProperty String The new value.
  		*/
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of successProperty
  		* @param successProperty String The new value.
  		*/
  var setSuccessProperty: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of totalProperty
  		* @param totalProperty String The new value.
  		*/
  var setTotalProperty: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[java.lang.String] = js.undefined
}

