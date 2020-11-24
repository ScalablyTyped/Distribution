package typings.senchaTouch.Ext.data.proxy

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.data.IOperation
import typings.senchaTouch.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServer extends IProxy {
  
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
  var create_IServer: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  var read_IServer: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  var update_IServer: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}
object IServer {
  
  @scala.inline
  def apply(): IServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServer]
  }
  
  @scala.inline
  implicit class IServerOps[Self <: IServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = this.set("afterRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterRequest: Self = this.set("afterRequest", js.undefined)
    
    @scala.inline
    def setApi(value: js.Any): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    
    @scala.inline
    def setBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = this.set("buildRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBuildRequest: Self = this.set("buildRequest", js.undefined)
    
    @scala.inline
    def setBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = this.set("buildUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBuildUrl: Self = this.set("buildUrl", js.undefined)
    
    @scala.inline
    def setCacheString(value: String): Self = this.set("cacheString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheString: Self = this.set("cacheString", js.undefined)
    
    @scala.inline
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDirectionParam(value: String): Self = this.set("directionParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionParam: Self = this.set("directionParam", js.undefined)
    
    @scala.inline
    def setDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("doRequest", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDoRequest: Self = this.set("doRequest", js.undefined)
    
    @scala.inline
    def setEnablePagingParams(value: Boolean): Self = this.set("enablePagingParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePagingParams: Self = this.set("enablePagingParams", js.undefined)
    
    @scala.inline
    def setEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = this.set("encodeFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncodeFilters: Self = this.set("encodeFilters", js.undefined)
    
    @scala.inline
    def setEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = this.set("encodeSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncodeSorters: Self = this.set("encodeSorters", js.undefined)
    
    @scala.inline
    def setExtraParams(value: js.Any): Self = this.set("extraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraParams: Self = this.set("extraParams", js.undefined)
    
    @scala.inline
    def setFilterParam(value: String): Self = this.set("filterParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterParam: Self = this.set("filterParam", js.undefined)
    
    @scala.inline
    def setGetApi(value: () => _): Self = this.set("getApi", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetApi: Self = this.set("getApi", js.undefined)
    
    @scala.inline
    def setGetCacheString(value: () => String): Self = this.set("getCacheString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCacheString: Self = this.set("getCacheString", js.undefined)
    
    @scala.inline
    def setGetDirectionParam(value: () => String): Self = this.set("getDirectionParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirectionParam: Self = this.set("getDirectionParam", js.undefined)
    
    @scala.inline
    def setGetEnablePagingParams(value: () => Boolean): Self = this.set("getEnablePagingParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnablePagingParams: Self = this.set("getEnablePagingParams", js.undefined)
    
    @scala.inline
    def setGetExtraParams(value: () => _): Self = this.set("getExtraParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetExtraParams: Self = this.set("getExtraParams", js.undefined)
    
    @scala.inline
    def setGetFilterParam(value: () => String): Self = this.set("getFilterParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFilterParam: Self = this.set("getFilterParam", js.undefined)
    
    @scala.inline
    def setGetGroupParam(value: () => String): Self = this.set("getGroupParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGroupParam: Self = this.set("getGroupParam", js.undefined)
    
    @scala.inline
    def setGetLimitParam(value: () => String): Self = this.set("getLimitParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLimitParam: Self = this.set("getLimitParam", js.undefined)
    
    @scala.inline
    def setGetNoCache(value: () => Boolean): Self = this.set("getNoCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNoCache: Self = this.set("getNoCache", js.undefined)
    
    @scala.inline
    def setGetPageParam(value: () => String): Self = this.set("getPageParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPageParam: Self = this.set("getPageParam", js.undefined)
    
    @scala.inline
    def setGetSimpleSortMode(value: () => Boolean): Self = this.set("getSimpleSortMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSimpleSortMode: Self = this.set("getSimpleSortMode", js.undefined)
    
    @scala.inline
    def setGetSortParam(value: () => String): Self = this.set("getSortParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSortParam: Self = this.set("getSortParam", js.undefined)
    
    @scala.inline
    def setGetStartParam(value: () => String): Self = this.set("getStartParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStartParam: Self = this.set("getStartParam", js.undefined)
    
    @scala.inline
    def setGetTimeout(value: () => Double): Self = this.set("getTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTimeout: Self = this.set("getTimeout", js.undefined)
    
    @scala.inline
    def setGroupParam(value: String): Self = this.set("groupParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupParam: Self = this.set("groupParam", js.undefined)
    
    @scala.inline
    def setLimitParam(value: String): Self = this.set("limitParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitParam: Self = this.set("limitParam", js.undefined)
    
    @scala.inline
    def setNoCache(value: Boolean): Self = this.set("noCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCache: Self = this.set("noCache", js.undefined)
    
    @scala.inline
    def setPageParam(value: String): Self = this.set("pageParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageParam: Self = this.set("pageParam", js.undefined)
    
    @scala.inline
    def setProcessResponse(
      value: (/* success */ js.UndefOr[Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("processResponse", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteProcessResponse: Self = this.set("processResponse", js.undefined)
    
    @scala.inline
    def setRead(value: () => Unit): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setSetApi(value: /* api */ js.UndefOr[js.Any] => Unit): Self = this.set("setApi", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetApi: Self = this.set("setApi", js.undefined)
    
    @scala.inline
    def setSetCacheString(value: /* cacheString */ js.UndefOr[String] => Unit): Self = this.set("setCacheString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCacheString: Self = this.set("setCacheString", js.undefined)
    
    @scala.inline
    def setSetDirectionParam(value: /* directionParam */ js.UndefOr[String] => Unit): Self = this.set("setDirectionParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirectionParam: Self = this.set("setDirectionParam", js.undefined)
    
    @scala.inline
    def setSetEnablePagingParams(value: /* enablePagingParams */ js.UndefOr[Boolean] => Unit): Self = this.set("setEnablePagingParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnablePagingParams: Self = this.set("setEnablePagingParams", js.undefined)
    
    @scala.inline
    def setSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = this.set("setExtraParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetExtraParam: Self = this.set("setExtraParam", js.undefined)
    
    @scala.inline
    def setSetExtraParams(value: /* extraParams */ js.UndefOr[js.Any] => Unit): Self = this.set("setExtraParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetExtraParams: Self = this.set("setExtraParams", js.undefined)
    
    @scala.inline
    def setSetFilterParam(value: /* filterParam */ js.UndefOr[String] => Unit): Self = this.set("setFilterParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFilterParam: Self = this.set("setFilterParam", js.undefined)
    
    @scala.inline
    def setSetGroupParam(value: /* groupParam */ js.UndefOr[String] => Unit): Self = this.set("setGroupParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGroupParam: Self = this.set("setGroupParam", js.undefined)
    
    @scala.inline
    def setSetLimitParam(value: /* limitParam */ js.UndefOr[String] => Unit): Self = this.set("setLimitParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLimitParam: Self = this.set("setLimitParam", js.undefined)
    
    @scala.inline
    def setSetNoCache(value: /* noCache */ js.UndefOr[Boolean] => Unit): Self = this.set("setNoCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetNoCache: Self = this.set("setNoCache", js.undefined)
    
    @scala.inline
    def setSetPageParam(value: /* pageParam */ js.UndefOr[String] => Unit): Self = this.set("setPageParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPageParam: Self = this.set("setPageParam", js.undefined)
    
    @scala.inline
    def setSetSimpleSortMode(value: /* simpleSortMode */ js.UndefOr[Boolean] => Unit): Self = this.set("setSimpleSortMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSimpleSortMode: Self = this.set("setSimpleSortMode", js.undefined)
    
    @scala.inline
    def setSetSortParam(value: /* sortParam */ js.UndefOr[String] => Unit): Self = this.set("setSortParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSortParam: Self = this.set("setSortParam", js.undefined)
    
    @scala.inline
    def setSetStartParam(value: /* startParam */ js.UndefOr[String] => Unit): Self = this.set("setStartParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStartParam: Self = this.set("setStartParam", js.undefined)
    
    @scala.inline
    def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTimeout: Self = this.set("setTimeout", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[String] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    
    @scala.inline
    def setSimpleSortMode(value: Boolean): Self = this.set("simpleSortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleSortMode: Self = this.set("simpleSortMode", js.undefined)
    
    @scala.inline
    def setSortParam(value: String): Self = this.set("sortParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortParam: Self = this.set("sortParam", js.undefined)
    
    @scala.inline
    def setStartParam(value: String): Self = this.set("startParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartParam: Self = this.set("startParam", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
