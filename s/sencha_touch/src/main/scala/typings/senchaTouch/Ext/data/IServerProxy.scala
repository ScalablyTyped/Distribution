package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerProxy
  extends StObject
     with typings.senchaTouch.Ext.data.proxy.IProxy {
  
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
    * @param request Ext.data.Request The Request object
    * @param success Boolean True if the request was successful
    */
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Config Option] (Object) */
  var api: js.UndefOr[Any] = js.undefined
  
  /** [Method] Creates and returns an Ext data Request object based on the options passed by the Store that this Proxy is attached to
    * @param operation Ext.data.Operation The Operation object to execute
    * @returns Ext.data.Request The request object
    */
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.undefined
  
  /** [Method] Generates a url based on a given Ext data Request object
    * @param request Ext.data.Request The request object
    * @returns String The url
    */
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.undefined
  
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[String] = js.undefined
  
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[String] = js.undefined
  
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
    * @param operation Ext.data.Operation The Ext.data.Operation object
    * @param callback Function The callback function to call when the Operation has completed
    * @param scope Object The scope in which to execute the callback
    */
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
    * @param filters Ext.util.Filter[] The array of Filter objects
    * @returns String The encoded filters
    */
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.undefined
  
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
    * @param sorters Ext.util.Sorter[] The array of Sorter objects
    * @returns String The encoded sorters
    */
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.undefined
  
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of api
    * @returns Object
    */
  var getApi: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of cacheString
    * @returns String
    */
  var getCacheString: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of directionParam
    * @returns String
    */
  var getDirectionParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of enablePagingParams
    * @returns Boolean
    */
  var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of extraParams
    * @returns Object
    */
  var getExtraParams: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of filterParam
    * @returns String
    */
  var getFilterParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of groupParam
    * @returns String
    */
  var getGroupParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of limitParam
    * @returns String
    */
  var getLimitParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of noCache
    * @returns Boolean
    */
  var getNoCache: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of pageParam
    * @returns String
    */
  var getPageParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of simpleSortMode
    * @returns Boolean
    */
  var getSimpleSortMode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of sortParam
    * @returns String
    */
  var getSortParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of startParam
    * @returns String
    */
  var getStartParam: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of timeout
    * @returns Number
    */
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[String] = js.undefined
  
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
      /* response */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value of api
    * @param api Object The new value.
    */
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of cacheString
    * @param cacheString String The new value.
    */
  var setCacheString: js.UndefOr[js.Function1[/* cacheString */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of directionParam
    * @param directionParam String The new value.
    */
  var setDirectionParam: js.UndefOr[js.Function1[/* directionParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of enablePagingParams
    * @param enablePagingParams Boolean The new value.
    */
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets a value in the underlying extraParams
    * @param name String The key for the new value
    * @param value Object The value
    */
  var setExtraParam: js.UndefOr[js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of extraParams
    * @param extraParams Object The new value.
    */
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of filterParam
    * @param filterParam String The new value.
    */
  var setFilterParam: js.UndefOr[js.Function1[/* filterParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of groupParam
    * @param groupParam String The new value.
    */
  var setGroupParam: js.UndefOr[js.Function1[/* groupParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of limitParam
    * @param limitParam String The new value.
    */
  var setLimitParam: js.UndefOr[js.Function1[/* limitParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of noCache
    * @param noCache Boolean The new value.
    */
  var setNoCache: js.UndefOr[js.Function1[/* noCache */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of pageParam
    * @param pageParam String The new value.
    */
  var setPageParam: js.UndefOr[js.Function1[/* pageParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of simpleSortMode
    * @param simpleSortMode Boolean The new value.
    */
  var setSimpleSortMode: js.UndefOr[js.Function1[/* simpleSortMode */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortParam
    * @param sortParam String The new value.
    */
  var setSortParam: js.UndefOr[js.Function1[/* sortParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of startParam
    * @param startParam String The new value.
    */
  var setStartParam: js.UndefOr[js.Function1[/* startParam */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of timeout
    * @param timeout Number The new value.
    */
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var startParam: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
}
object IServerProxy {
  
  inline def apply(): IServerProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerProxy]
  }
  
  extension [Self <: IServerProxy](x: Self) {
    
    inline def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "afterRequest", js.Any.fromFunction2(value))
    
    inline def setAfterRequestUndefined: Self = StObject.set(x, "afterRequest", js.undefined)
    
    inline def setApi(value: Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = StObject.set(x, "buildRequest", js.Any.fromFunction1(value))
    
    inline def setBuildRequestUndefined: Self = StObject.set(x, "buildRequest", js.undefined)
    
    inline def setBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = StObject.set(x, "buildUrl", js.Any.fromFunction1(value))
    
    inline def setBuildUrlUndefined: Self = StObject.set(x, "buildUrl", js.undefined)
    
    inline def setCacheString(value: String): Self = StObject.set(x, "cacheString", value.asInstanceOf[js.Any])
    
    inline def setCacheStringUndefined: Self = StObject.set(x, "cacheString", js.undefined)
    
    inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDirectionParam(value: String): Self = StObject.set(x, "directionParam", value.asInstanceOf[js.Any])
    
    inline def setDirectionParamUndefined: Self = StObject.set(x, "directionParam", js.undefined)
    
    inline def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "doRequest", js.Any.fromFunction3(value))
    
    inline def setDoRequestUndefined: Self = StObject.set(x, "doRequest", js.undefined)
    
    inline def setEnablePagingParams(value: Boolean): Self = StObject.set(x, "enablePagingParams", value.asInstanceOf[js.Any])
    
    inline def setEnablePagingParamsUndefined: Self = StObject.set(x, "enablePagingParams", js.undefined)
    
    inline def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeFilters", js.Any.fromFunction1(value))
    
    inline def setEncodeFiltersUndefined: Self = StObject.set(x, "encodeFilters", js.undefined)
    
    inline def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = StObject.set(x, "encodeSorters", js.Any.fromFunction1(value))
    
    inline def setEncodeSortersUndefined: Self = StObject.set(x, "encodeSorters", js.undefined)
    
    inline def setExtraParams(value: Any): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    inline def setFilterParam(value: String): Self = StObject.set(x, "filterParam", value.asInstanceOf[js.Any])
    
    inline def setFilterParamUndefined: Self = StObject.set(x, "filterParam", js.undefined)
    
    inline def setGetApi(value: () => Any): Self = StObject.set(x, "getApi", js.Any.fromFunction0(value))
    
    inline def setGetApiUndefined: Self = StObject.set(x, "getApi", js.undefined)
    
    inline def setGetCacheString(value: () => String): Self = StObject.set(x, "getCacheString", js.Any.fromFunction0(value))
    
    inline def setGetCacheStringUndefined: Self = StObject.set(x, "getCacheString", js.undefined)
    
    inline def setGetDirectionParam(value: () => String): Self = StObject.set(x, "getDirectionParam", js.Any.fromFunction0(value))
    
    inline def setGetDirectionParamUndefined: Self = StObject.set(x, "getDirectionParam", js.undefined)
    
    inline def setGetEnablePagingParams(value: () => Boolean): Self = StObject.set(x, "getEnablePagingParams", js.Any.fromFunction0(value))
    
    inline def setGetEnablePagingParamsUndefined: Self = StObject.set(x, "getEnablePagingParams", js.undefined)
    
    inline def setGetExtraParams(value: () => Any): Self = StObject.set(x, "getExtraParams", js.Any.fromFunction0(value))
    
    inline def setGetExtraParamsUndefined: Self = StObject.set(x, "getExtraParams", js.undefined)
    
    inline def setGetFilterParam(value: () => String): Self = StObject.set(x, "getFilterParam", js.Any.fromFunction0(value))
    
    inline def setGetFilterParamUndefined: Self = StObject.set(x, "getFilterParam", js.undefined)
    
    inline def setGetGroupParam(value: () => String): Self = StObject.set(x, "getGroupParam", js.Any.fromFunction0(value))
    
    inline def setGetGroupParamUndefined: Self = StObject.set(x, "getGroupParam", js.undefined)
    
    inline def setGetLimitParam(value: () => String): Self = StObject.set(x, "getLimitParam", js.Any.fromFunction0(value))
    
    inline def setGetLimitParamUndefined: Self = StObject.set(x, "getLimitParam", js.undefined)
    
    inline def setGetNoCache(value: () => Boolean): Self = StObject.set(x, "getNoCache", js.Any.fromFunction0(value))
    
    inline def setGetNoCacheUndefined: Self = StObject.set(x, "getNoCache", js.undefined)
    
    inline def setGetPageParam(value: () => String): Self = StObject.set(x, "getPageParam", js.Any.fromFunction0(value))
    
    inline def setGetPageParamUndefined: Self = StObject.set(x, "getPageParam", js.undefined)
    
    inline def setGetSimpleSortMode(value: () => Boolean): Self = StObject.set(x, "getSimpleSortMode", js.Any.fromFunction0(value))
    
    inline def setGetSimpleSortModeUndefined: Self = StObject.set(x, "getSimpleSortMode", js.undefined)
    
    inline def setGetSortParam(value: () => String): Self = StObject.set(x, "getSortParam", js.Any.fromFunction0(value))
    
    inline def setGetSortParamUndefined: Self = StObject.set(x, "getSortParam", js.undefined)
    
    inline def setGetStartParam(value: () => String): Self = StObject.set(x, "getStartParam", js.Any.fromFunction0(value))
    
    inline def setGetStartParamUndefined: Self = StObject.set(x, "getStartParam", js.undefined)
    
    inline def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
    
    inline def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
    
    inline def setGroupParam(value: String): Self = StObject.set(x, "groupParam", value.asInstanceOf[js.Any])
    
    inline def setGroupParamUndefined: Self = StObject.set(x, "groupParam", js.undefined)
    
    inline def setLimitParam(value: String): Self = StObject.set(x, "limitParam", value.asInstanceOf[js.Any])
    
    inline def setLimitParamUndefined: Self = StObject.set(x, "limitParam", js.undefined)
    
    inline def setNoCache(value: Boolean): Self = StObject.set(x, "noCache", value.asInstanceOf[js.Any])
    
    inline def setNoCacheUndefined: Self = StObject.set(x, "noCache", js.undefined)
    
    inline def setPageParam(value: String): Self = StObject.set(x, "pageParam", value.asInstanceOf[js.Any])
    
    inline def setPageParamUndefined: Self = StObject.set(x, "pageParam", js.undefined)
    
    inline def setProcessResponse(
      value: (/* success */ js.UndefOr[Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "processResponse", js.Any.fromFunction6(value))
    
    inline def setProcessResponseUndefined: Self = StObject.set(x, "processResponse", js.undefined)
    
    inline def setRead(value: () => Unit): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setSetApi(value: /* api */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setApi", js.Any.fromFunction1(value))
    
    inline def setSetApiUndefined: Self = StObject.set(x, "setApi", js.undefined)
    
    inline def setSetCacheString(value: /* cacheString */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCacheString", js.Any.fromFunction1(value))
    
    inline def setSetCacheStringUndefined: Self = StObject.set(x, "setCacheString", js.undefined)
    
    inline def setSetDirectionParam(value: /* directionParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirectionParam", js.Any.fromFunction1(value))
    
    inline def setSetDirectionParamUndefined: Self = StObject.set(x, "setDirectionParam", js.undefined)
    
    inline def setSetEnablePagingParams(value: /* enablePagingParams */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnablePagingParams", js.Any.fromFunction1(value))
    
    inline def setSetEnablePagingParamsUndefined: Self = StObject.set(x, "setEnablePagingParams", js.undefined)
    
    inline def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setExtraParam", js.Any.fromFunction2(value))
    
    inline def setSetExtraParamUndefined: Self = StObject.set(x, "setExtraParam", js.undefined)
    
    inline def setSetExtraParams(value: /* extraParams */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setExtraParams", js.Any.fromFunction1(value))
    
    inline def setSetExtraParamsUndefined: Self = StObject.set(x, "setExtraParams", js.undefined)
    
    inline def setSetFilterParam(value: /* filterParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFilterParam", js.Any.fromFunction1(value))
    
    inline def setSetFilterParamUndefined: Self = StObject.set(x, "setFilterParam", js.undefined)
    
    inline def setSetGroupParam(value: /* groupParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGroupParam", js.Any.fromFunction1(value))
    
    inline def setSetGroupParamUndefined: Self = StObject.set(x, "setGroupParam", js.undefined)
    
    inline def setSetLimitParam(value: /* limitParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLimitParam", js.Any.fromFunction1(value))
    
    inline def setSetLimitParamUndefined: Self = StObject.set(x, "setLimitParam", js.undefined)
    
    inline def setSetNoCache(value: /* noCache */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setNoCache", js.Any.fromFunction1(value))
    
    inline def setSetNoCacheUndefined: Self = StObject.set(x, "setNoCache", js.undefined)
    
    inline def setSetPageParam(value: /* pageParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPageParam", js.Any.fromFunction1(value))
    
    inline def setSetPageParamUndefined: Self = StObject.set(x, "setPageParam", js.undefined)
    
    inline def setSetSimpleSortMode(value: /* simpleSortMode */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSimpleSortMode", js.Any.fromFunction1(value))
    
    inline def setSetSimpleSortModeUndefined: Self = StObject.set(x, "setSimpleSortMode", js.undefined)
    
    inline def setSetSortParam(value: /* sortParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSortParam", js.Any.fromFunction1(value))
    
    inline def setSetSortParamUndefined: Self = StObject.set(x, "setSortParam", js.undefined)
    
    inline def setSetStartParam(value: /* startParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setStartParam", js.Any.fromFunction1(value))
    
    inline def setSetStartParamUndefined: Self = StObject.set(x, "setStartParam", js.undefined)
    
    inline def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    
    inline def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    inline def setSimpleSortMode(value: Boolean): Self = StObject.set(x, "simpleSortMode", value.asInstanceOf[js.Any])
    
    inline def setSimpleSortModeUndefined: Self = StObject.set(x, "simpleSortMode", js.undefined)
    
    inline def setSortParam(value: String): Self = StObject.set(x, "sortParam", value.asInstanceOf[js.Any])
    
    inline def setSortParamUndefined: Self = StObject.set(x, "sortParam", js.undefined)
    
    inline def setStartParam(value: String): Self = StObject.set(x, "startParam", value.asInstanceOf[js.Any])
    
    inline def setStartParamUndefined: Self = StObject.set(x, "startParam", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
