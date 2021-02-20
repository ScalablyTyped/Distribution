package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerProxy
  extends typings.senchaTouch.Ext.data.proxy.IProxy {
  
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
    * @param request Ext.data.Request The Request object
    * @param success Boolean True if the request was successful
    */
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  
  /** [Method] Creates and returns an Ext data Request object based on the options passed by the Store that this Proxy is attached to
    * @param operation Ext.data.Operation The Operation object to execute
    * @returns Ext.data.Request The request object
    */
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.native
  
  /** [Method] Generates a url based on a given Ext data Request object
    * @param request Ext.data.Request The request object
    * @returns String The url
    */
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[String] = js.native
  
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[String] = js.native
  
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
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[Boolean] = js.native
  
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
    * @param filters Ext.util.Filter[] The array of Filter objects
    * @returns String The encoded filters
    */
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.native
  
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
    * @param sorters Ext.util.Sorter[] The array of Sorter objects
    * @returns String The encoded sorters
    */
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.native
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of api
    * @returns Object
    */
  var getApi: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of cacheString
    * @returns String
    */
  var getCacheString: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of directionParam
    * @returns String
    */
  var getDirectionParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of enablePagingParams
    * @returns Boolean
    */
  var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of extraParams
    * @returns Object
    */
  var getExtraParams: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of filterParam
    * @returns String
    */
  var getFilterParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of groupParam
    * @returns String
    */
  var getGroupParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of limitParam
    * @returns String
    */
  var getLimitParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of noCache
    * @returns Boolean
    */
  var getNoCache: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of pageParam
    * @returns String
    */
  var getPageParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of simpleSortMode
    * @returns Boolean
    */
  var getSimpleSortMode: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of sortParam
    * @returns String
    */
  var getSortParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of startParam
    * @returns String
    */
  var getStartParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[String] = js.native
  
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
      /* success */ js.UndefOr[Boolean], 
      /* operation */ js.UndefOr[IOperation], 
      /* request */ js.UndefOr[IRequest], 
      /* response */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the value of api
    * @param api Object The new value.
    */
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of cacheString
    * @param cacheString String The new value.
    */
  var setCacheString: js.UndefOr[js.Function1[/* cacheString */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of directionParam
    * @param directionParam String The new value.
    */
  var setDirectionParam: js.UndefOr[js.Function1[/* directionParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of enablePagingParams
    * @param enablePagingParams Boolean The new value.
    */
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets a value in the underlying extraParams
    * @param name String The key for the new value
    * @param value Object The value
    */
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Sets the value of extraParams
    * @param extraParams Object The new value.
    */
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of filterParam
    * @param filterParam String The new value.
    */
  var setFilterParam: js.UndefOr[js.Function1[/* filterParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of groupParam
    * @param groupParam String The new value.
    */
  var setGroupParam: js.UndefOr[js.Function1[/* groupParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of limitParam
    * @param limitParam String The new value.
    */
  var setLimitParam: js.UndefOr[js.Function1[/* limitParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of noCache
    * @param noCache Boolean The new value.
    */
  var setNoCache: js.UndefOr[js.Function1[/* noCache */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of pageParam
    * @param pageParam String The new value.
    */
  var setPageParam: js.UndefOr[js.Function1[/* pageParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of simpleSortMode
    * @param simpleSortMode Boolean The new value.
    */
  var setSimpleSortMode: js.UndefOr[js.Function1[/* simpleSortMode */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of sortParam
    * @param sortParam String The new value.
    */
  var setSortParam: js.UndefOr[js.Function1[/* sortParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of startParam
    * @param startParam String The new value.
    */
  var setStartParam: js.UndefOr[js.Function1[/* startParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var startParam: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}
object IServerProxy {
  
  @scala.inline
  def apply(): IServerProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerProxy]
  }
  
  @scala.inline
  implicit class IServerProxyMutableBuilder[Self <: IServerProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "afterRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRequestUndefined: Self = StObject.set(x, "afterRequest", js.undefined)
    
    @scala.inline
    def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    @scala.inline
    def setBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = StObject.set(x, "buildRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildRequestUndefined: Self = StObject.set(x, "buildRequest", js.undefined)
    
    @scala.inline
    def setBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    @scala.inline
    def setCacheString(value: String): Self = StObject.set(x, "cacheString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStringUndefined: Self = StObject.set(x, "cacheString", js.undefined)
    
    @scala.inline
    def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDirectionParam(value: String): Self = StObject.set(x, "directionParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionParamUndefined: Self = StObject.set(x, "directionParam", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    @scala.inline
    def setEnablePagingParams(value: Boolean): Self = StObject.set(x, "enablePagingParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePagingParamsUndefined: Self = StObject.set(x, "enablePagingParams", js.undefined)
    
    @scala.inline
    def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeFiltersUndefined: Self = StObject.set(x, "encodeFilters", js.undefined)
    
    @scala.inline
    def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeSortersUndefined: Self = StObject.set(x, "encodeSorters", js.undefined)
    
    @scala.inline
    def setExtraParams(value: js.Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    @scala.inline
    def setFilterParam(value: String): Self = StObject.set(x, "filterParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterParamUndefined: Self = StObject.set(x, "filterParam", js.undefined)
    
    @scala.inline
    def setGetApi(value: () => _): Self = StObject.set(x, "getApi", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetApiUndefined: Self = StObject.set(x, "getApi", js.undefined)
    
    @scala.inline
    def setGetCacheString(value: () => String): Self = StObject.set(x, "getCacheString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCacheStringUndefined: Self = StObject.set(x, "getCacheString", js.undefined)
    
    @scala.inline
    def setGetDirectionParam(value: () => String): Self = StObject.set(x, "getDirectionParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirectionParamUndefined: Self = StObject.set(x, "getDirectionParam", js.undefined)
    
    @scala.inline
    def setGetEnablePagingParams(value: () => Boolean): Self = StObject.set(x, "getEnablePagingParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnablePagingParamsUndefined: Self = StObject.set(x, "getEnablePagingParams", js.undefined)
    
    @scala.inline
    def setGetExtraParams(value: () => _): Self = StObject.set(x, "getExtraParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtraParamsUndefined: Self = StObject.set(x, "getExtraParams", js.undefined)
    
    @scala.inline
    def setGetFilterParam(value: () => String): Self = StObject.set(x, "getFilterParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterParamUndefined: Self = StObject.set(x, "getFilterParam", js.undefined)
    
    @scala.inline
    def setGetGroupParam(value: () => String): Self = StObject.set(x, "getGroupParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupParamUndefined: Self = StObject.set(x, "getGroupParam", js.undefined)
    
    @scala.inline
    def setGetLimitParam(value: () => String): Self = StObject.set(x, "getLimitParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLimitParamUndefined: Self = StObject.set(x, "getLimitParam", js.undefined)
    
    @scala.inline
    def setGetNoCache(value: () => Boolean): Self = StObject.set(x, "getNoCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNoCacheUndefined: Self = StObject.set(x, "getNoCache", js.undefined)
    
    @scala.inline
    def setGetPageParam(value: () => String): Self = StObject.set(x, "getPageParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageParamUndefined: Self = StObject.set(x, "getPageParam", js.undefined)
    
    @scala.inline
    def setGetSimpleSortMode(value: () => Boolean): Self = StObject.set(x, "getSimpleSortMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSimpleSortModeUndefined: Self = StObject.set(x, "getSimpleSortMode", js.undefined)
    
    @scala.inline
    def setGetSortParam(value: () => String): Self = StObject.set(x, "getSortParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortParamUndefined: Self = StObject.set(x, "getSortParam", js.undefined)
    
    @scala.inline
    def setGetStartParam(value: () => String): Self = StObject.set(x, "getStartParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartParamUndefined: Self = StObject.set(x, "getStartParam", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    @scala.inline
    def setGroupParam(value: String): Self = StObject.set(x, "groupParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupParamUndefined: Self = StObject.set(x, "groupParam", js.undefined)
    
    @scala.inline
    def setLimitParam(value: String): Self = StObject.set(x, "limitParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitParamUndefined: Self = StObject.set(x, "limitParam", js.undefined)
    
    @scala.inline
    def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
    
    @scala.inline
    def setPageParam(value: String): Self = StObject.set(x, "pageParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageParamUndefined: Self = StObject.set(x, "pageParam", js.undefined)
    
    @scala.inline
    def setProcessResponse(
      value: (/* success */ js.UndefOr[Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "processResponse", js.Any.fromFunction6(value))
    
    @scala.inline
    def setProcessResponseUndefined: Self = StObject.set(x, "processResponse", js.undefined)
    
    @scala.inline
    def setRead(value: () => Unit): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setSetApi(value: /* api */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setApi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetApiUndefined: Self = StObject.set(x, "setApi", js.undefined)
    
    @scala.inline
    def setSetCacheString(value: /* cacheString */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCacheString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCacheStringUndefined: Self = StObject.set(x, "setCacheString", js.undefined)
    
    @scala.inline
    def setSetDirectionParam(value: /* directionParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirectionParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirectionParamUndefined: Self = StObject.set(x, "setDirectionParam", js.undefined)
    
    @scala.inline
    def setSetEnablePagingParams(value: /* enablePagingParams */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnablePagingParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnablePagingParamsUndefined: Self = StObject.set(x, "setEnablePagingParams", js.undefined)
    
    @scala.inline
    def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "setExtraParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetExtraParamUndefined: Self = StObject.set(x, "setExtraParam", js.undefined)
    
    @scala.inline
    def setSetExtraParams(value: /* extraParams */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setExtraParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExtraParamsUndefined: Self = StObject.set(x, "setExtraParams", js.undefined)
    
    @scala.inline
    def setSetFilterParam(value: /* filterParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFilterParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterParamUndefined: Self = StObject.set(x, "setFilterParam", js.undefined)
    
    @scala.inline
    def setSetGroupParam(value: /* groupParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGroupParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGroupParamUndefined: Self = StObject.set(x, "setGroupParam", js.undefined)
    
    @scala.inline
    def setSetLimitParam(value: /* limitParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLimitParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLimitParamUndefined: Self = StObject.set(x, "setLimitParam", js.undefined)
    
    @scala.inline
    def setSetNoCache(value: /* noCache */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setNoCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNoCacheUndefined: Self = StObject.set(x, "setNoCache", js.undefined)
    
    @scala.inline
    def setSetPageParam(value: /* pageParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPageParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPageParamUndefined: Self = StObject.set(x, "setPageParam", js.undefined)
    
    @scala.inline
    def setSetSimpleSortMode(value: /* simpleSortMode */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSimpleSortMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSimpleSortModeUndefined: Self = StObject.set(x, "setSimpleSortMode", js.undefined)
    
    @scala.inline
    def setSetSortParam(value: /* sortParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSortParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortParamUndefined: Self = StObject.set(x, "setSortParam", js.undefined)
    
    @scala.inline
    def setSetStartParam(value: /* startParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setStartParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStartParamUndefined: Self = StObject.set(x, "setStartParam", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    @scala.inline
    def setSimpleSortMode(value: Boolean): Self = StObject.set(x, "simpleSortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleSortModeUndefined: Self = StObject.set(x, "simpleSortMode", js.undefined)
    
    @scala.inline
    def setSortParam(value: String): Self = StObject.set(x, "sortParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortParamUndefined: Self = StObject.set(x, "sortParam", js.undefined)
    
    @scala.inline
    def setStartParam(value: String): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartParamUndefined: Self = StObject.set(x, "startParam", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
