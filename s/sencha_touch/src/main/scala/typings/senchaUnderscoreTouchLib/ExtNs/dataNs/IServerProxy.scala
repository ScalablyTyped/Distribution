package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IServerProxy
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.proxyNs.IProxy {
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
  		* @param request Ext.data.Request The Request object
  		* @param success Boolean True if the request was successful
  		*/
  var afterRequest: js.UndefOr[
    js.Function2[
      /* request */ js.UndefOr[IRequest], 
      /* success */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Method] Creates and returns an Ext data Request object based on the options passed by the Store that this Proxy is attached to
  		* @param operation Ext.data.Operation The Operation object to execute
  		* @returns Ext.data.Request The request object
  		*/
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.undefined
  /** [Method] Generates a url based on a given Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns String The url
  		*/
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Ext.data.Operation The Ext.data.Operation object
  		* @param callback Function The callback function to call when the Operation has completed
  		* @param scope Object The scope in which to execute the callback
  		*/
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
  		* @param filters Ext.util.Filter[] The array of Filter objects
  		* @returns String The encoded filters
  		*/
  var encodeFilters: js.UndefOr[
    js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], java.lang.String]
  ] = js.undefined
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
  		* @param sorters Ext.util.Sorter[] The array of Sorter objects
  		* @returns String The encoded sorters
  		*/
  var encodeSorters: js.UndefOr[
    js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], java.lang.String]
  ] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of api
  		* @returns Object
  		*/
  var getApi: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of cacheString
  		* @returns String
  		*/
  var getCacheString: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of directionParam
  		* @returns String
  		*/
  var getDirectionParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of enablePagingParams
  		* @returns Boolean
  		*/
  var getEnablePagingParams: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filterParam
  		* @returns String
  		*/
  var getFilterParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of groupParam
  		* @returns String
  		*/
  var getGroupParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of limitParam
  		* @returns String
  		*/
  var getLimitParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of noCache
  		* @returns Boolean
  		*/
  var getNoCache: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of pageParam
  		* @returns String
  		*/
  var getPageParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of simpleSortMode
  		* @returns Boolean
  		*/
  var getSimpleSortMode: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of sortParam
  		* @returns String
  		*/
  var getSortParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of startParam
  		* @returns String
  		*/
  var getStartParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] This method handles the processing of the response and is usually overridden by subclasses to do additional processing
  		* @param success Boolean Whether or not this request was successful
  		* @param operation Ext.data.Operation The operation we made this request for
  		* @param request Ext.data.Request The request that was made
  		* @param response Object The response that we got
  		* @param callback Function The callback to be fired onces the response is processed
  		* @param scope Object The scope in which we call the callback
  		*/
  var processResponse: js.UndefOr[
    js.Function6[
      /* success */ js.UndefOr[scala.Boolean], 
      /* operation */ js.UndefOr[IOperation], 
      /* request */ js.UndefOr[IRequest], 
      /* response */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of api
  		* @param api Object The new value.
  		*/
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of cacheString
  		* @param cacheString String The new value.
  		*/
  var setCacheString: js.UndefOr[js.Function1[/* cacheString */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of directionParam
  		* @param directionParam String The new value.
  		*/
  var setDirectionParam: js.UndefOr[js.Function1[/* directionParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of enablePagingParams
  		* @param enablePagingParams Boolean The new value.
  		*/
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets a value in the underlying extraParams
  		* @param name String The key for the new value
  		* @param value Object The value
  		*/
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of filterParam
  		* @param filterParam String The new value.
  		*/
  var setFilterParam: js.UndefOr[js.Function1[/* filterParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of groupParam
  		* @param groupParam String The new value.
  		*/
  var setGroupParam: js.UndefOr[js.Function1[/* groupParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of limitParam
  		* @param limitParam String The new value.
  		*/
  var setLimitParam: js.UndefOr[js.Function1[/* limitParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of noCache
  		* @param noCache Boolean The new value.
  		*/
  var setNoCache: js.UndefOr[js.Function1[/* noCache */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pageParam
  		* @param pageParam String The new value.
  		*/
  var setPageParam: js.UndefOr[js.Function1[/* pageParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of simpleSortMode
  		* @param simpleSortMode Boolean The new value.
  		*/
  var setSimpleSortMode: js.UndefOr[js.Function1[/* simpleSortMode */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sortParam
  		* @param sortParam String The new value.
  		*/
  var setSortParam: js.UndefOr[js.Function1[/* sortParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of startParam
  		* @param startParam String The new value.
  		*/
  var setStartParam: js.UndefOr[js.Function1[/* startParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var startParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

