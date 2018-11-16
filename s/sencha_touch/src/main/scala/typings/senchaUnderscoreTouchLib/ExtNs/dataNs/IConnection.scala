package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IConnection
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Aborts any outstanding request
  		* @param request Object Defaults to the last request.
  		*/
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Aborts all outstanding requests  */
  var abortAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultXhrHeader: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of async
  		* @returns Boolean
  		*/
  var getAsync: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoAbort
  		* @returns Boolean
  		*/
  var getAutoAbort: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of defaultHeaders
  		* @returns Object
  		*/
  var getDefaultHeaders: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultPostHeader
  		* @returns String
  		*/
  var getDefaultPostHeader: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of defaultXhrHeader
  		* @returns String
  		*/
  var getDefaultXhrHeader: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  var getDisableCaching: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disableCachingParam
  		* @returns String
  		*/
  var getDisableCachingParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  var getMethod: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useDefaultHeader
  		* @returns Boolean
  		*/
  var getUseDefaultHeader: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object The request to check.
  		* @returns Boolean True if there is an outstanding request.
  		*/
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code.
  		* @param xhr XMLHttpRequest
  		* @returns Object An object containing success/status state.
  		*/
  var parseStatus: js.UndefOr[
    js.Function2[
      /* status */ js.UndefOr[scala.Double], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      _
    ]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IConnection: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
  		* @returns Object/null The request object. This may be used to cancel the request.
  		*/
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of async
  		* @param async Boolean The new value.
  		*/
  var setAsync: js.UndefOr[js.Function1[/* async */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoAbort
  		* @param autoAbort Boolean The new value.
  		*/
  var setAutoAbort: js.UndefOr[js.Function1[/* autoAbort */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultHeaders
  		* @param defaultHeaders Object The new value.
  		*/
  var setDefaultHeaders: js.UndefOr[js.Function1[/* defaultHeaders */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultPostHeader
  		* @param defaultPostHeader String The new value.
  		*/
  var setDefaultPostHeader: js.UndefOr[js.Function1[/* defaultPostHeader */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultXhrHeader
  		* @param defaultXhrHeader String The new value.
  		*/
  var setDefaultXhrHeader: js.UndefOr[js.Function1[/* defaultXhrHeader */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  var setDisableCaching: js.UndefOr[js.Function1[/* disableCaching */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disableCachingParam
  		* @param disableCachingParam String The new value.
  		*/
  var setDisableCachingParam: js.UndefOr[js.Function1[/* disableCachingParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets various options such as the url params for the request
  		* @param options Object The initial options.
  		* @param scope Object The scope to execute in.
  		* @returns Object The params for the request.
  		*/
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultHeader
  		* @param useDefaultHeader Boolean The new value.
  		*/
  var setUseDefaultHeader: js.UndefOr[js.Function1[/* useDefaultHeader */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Uploads a form using a hidden iframe
  		* @param form String/HTMLElement/Ext.Element The form to upload.
  		* @param url String The url to post to.
  		* @param params String Any extra parameters to pass.
  		* @param options Object The initial options.
  		*/
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[java.lang.String], 
      /* params */ js.UndefOr[java.lang.String], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[scala.Boolean] = js.undefined
}

