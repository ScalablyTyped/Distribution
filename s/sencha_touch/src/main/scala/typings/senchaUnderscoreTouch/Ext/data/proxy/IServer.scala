package typings.senchaUnderscoreTouch.Ext.data.proxy

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.data.IBatch
import typings.senchaUnderscoreTouch.Ext.data.IOperation
import typings.senchaUnderscoreTouch.Ext.data.IRequest
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServer
  extends typings.senchaUnderscoreTouch.Ext.data.proxy.IProxy {
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
  		* @param request Ext.data.Request The Request object
  		* @param success Boolean True if the request was successful
  		*/
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
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
  var create_IServer: js.UndefOr[js.Function0[Unit]] = js.undefined
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
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enablePagingParams: js.UndefOr[Boolean] = js.undefined
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
  		* @param filters Ext.util.Filter[] The array of Filter objects
  		* @returns String The encoded filters
  		*/
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], java.lang.String]] = js.undefined
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
  		* @param sorters Ext.util.Sorter[] The array of Sorter objects
  		* @returns String The encoded sorters
  		*/
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], java.lang.String]] = js.undefined
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
  var getEnablePagingParams: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getNoCache: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of pageParam
  		* @returns String
  		*/
  var getPageParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of simpleSortMode
  		* @returns Boolean
  		*/
  var getSimpleSortMode: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.undefined
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
      /* success */ js.UndefOr[Boolean], 
      /* operation */ js.UndefOr[IOperation], 
      /* request */ js.UndefOr[IRequest], 
      /* response */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServer: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of api
  		* @param api Object The new value.
  		*/
  var setApi: js.UndefOr[js.Function1[/* api */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of cacheString
  		* @param cacheString String The new value.
  		*/
  var setCacheString: js.UndefOr[js.Function1[/* cacheString */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of directionParam
  		* @param directionParam String The new value.
  		*/
  var setDirectionParam: js.UndefOr[js.Function1[/* directionParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of enablePagingParams
  		* @param enablePagingParams Boolean The new value.
  		*/
  var setEnablePagingParams: js.UndefOr[js.Function1[/* enablePagingParams */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets a value in the underlying extraParams
  		* @param name String The key for the new value
  		* @param value Object The value
  		*/
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  var setExtraParams: js.UndefOr[js.Function1[/* extraParams */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of filterParam
  		* @param filterParam String The new value.
  		*/
  var setFilterParam: js.UndefOr[js.Function1[/* filterParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of groupParam
  		* @param groupParam String The new value.
  		*/
  var setGroupParam: js.UndefOr[js.Function1[/* groupParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of limitParam
  		* @param limitParam String The new value.
  		*/
  var setLimitParam: js.UndefOr[js.Function1[/* limitParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of noCache
  		* @param noCache Boolean The new value.
  		*/
  var setNoCache: js.UndefOr[js.Function1[/* noCache */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of pageParam
  		* @param pageParam String The new value.
  		*/
  var setPageParam: js.UndefOr[js.Function1[/* pageParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of simpleSortMode
  		* @param simpleSortMode Boolean The new value.
  		*/
  var setSimpleSortMode: js.UndefOr[js.Function1[/* simpleSortMode */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of sortParam
  		* @param sortParam String The new value.
  		*/
  var setSortParam: js.UndefOr[js.Function1[/* sortParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of startParam
  		* @param startParam String The new value.
  		*/
  var setStartParam: js.UndefOr[js.Function1[/* startParam */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var startParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServer: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IServer {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    afterRequest: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    batch: /* options */ js.UndefOr[js.Any] => IBatch = null,
    batchActions: js.UndefOr[Boolean] = js.undefined,
    batchOrder: java.lang.String = null,
    bubbleEvents: js.Any = null,
    buildRequest: /* operation */ js.UndefOr[IOperation] => IRequest = null,
    buildUrl: /* request */ js.UndefOr[IRequest] => java.lang.String = null,
    cacheString: java.lang.String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    create: () => Unit = null,
    destroy: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    directionParam: java.lang.String = null,
    doRequest: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    enablePagingParams: js.UndefOr[Boolean] = js.undefined,
    encodeFilters: /* filters */ js.UndefOr[Array] => java.lang.String = null,
    encodeSorters: /* sorters */ js.UndefOr[Array] => java.lang.String = null,
    extend: java.lang.String = null,
    extraParams: js.Any = null,
    filterParam: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getApi: () => _ = null,
    getBatchActions: () => Boolean = null,
    getBatchOrder: () => java.lang.String = null,
    getBubbleEvents: () => _ = null,
    getCacheString: () => java.lang.String = null,
    getDirectionParam: () => java.lang.String = null,
    getEnablePagingParams: () => Boolean = null,
    getExtraParams: () => _ = null,
    getFilterParam: () => java.lang.String = null,
    getGroupParam: () => java.lang.String = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLimitParam: () => java.lang.String = null,
    getListeners: () => _ = null,
    getModel: () => _ = null,
    getNoCache: () => Boolean = null,
    getPageParam: () => java.lang.String = null,
    getReader: () => _ = null,
    getSimpleSortMode: () => Boolean = null,
    getSortParam: () => java.lang.String = null,
    getStartParam: () => java.lang.String = null,
    getTimeout: () => Double = null,
    getWriter: () => _ = null,
    groupParam: java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    limitParam: java.lang.String = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    noCache: js.UndefOr[Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    pageParam: java.lang.String = null,
    platformConfig: js.Any = null,
    processResponse: (/* success */ js.UndefOr[Boolean], /* operation */ js.UndefOr[IOperation], /* request */ js.UndefOr[IRequest], /* response */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    read: () => Unit = null,
    reader: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setApi: /* api */ js.UndefOr[js.Any] => Unit = null,
    setBatchActions: /* batchActions */ js.UndefOr[Boolean] => Unit = null,
    setBatchOrder: /* batchOrder */ js.UndefOr[java.lang.String] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCacheString: /* cacheString */ js.UndefOr[java.lang.String] => Unit = null,
    setDirectionParam: /* directionParam */ js.UndefOr[java.lang.String] => Unit = null,
    setEnablePagingParams: /* enablePagingParams */ js.UndefOr[Boolean] => Unit = null,
    setExtraParam: (/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any]) => Unit = null,
    setExtraParams: /* extraParams */ js.UndefOr[js.Any] => Unit = null,
    setFilterParam: /* filterParam */ js.UndefOr[java.lang.String] => Unit = null,
    setGroupParam: /* groupParam */ js.UndefOr[java.lang.String] => Unit = null,
    setLimitParam: /* limitParam */ js.UndefOr[java.lang.String] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setModel: /* model */ js.UndefOr[js.Any] => Unit = null,
    setNoCache: /* noCache */ js.UndefOr[Boolean] => Unit = null,
    setPageParam: /* pageParam */ js.UndefOr[java.lang.String] => Unit = null,
    setReader: /* reader */ js.UndefOr[js.Any] => Unit = null,
    setSimpleSortMode: /* simpleSortMode */ js.UndefOr[Boolean] => Unit = null,
    setSortParam: /* sortParam */ js.UndefOr[java.lang.String] => Unit = null,
    setStartParam: /* startParam */ js.UndefOr[java.lang.String] => Unit = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Unit = null,
    setUrl: /* url */ js.UndefOr[java.lang.String] => Unit = null,
    setWriter: /* writer */ js.UndefOr[js.Any] => Unit = null,
    simpleSortMode: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortParam: java.lang.String = null,
    startParam: java.lang.String = null,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    timeout: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    update: () => Unit = null,
    url: java.lang.String = null,
    uses: Array = null,
    writer: js.Any = null
  ): IServer = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(js.Any.fromFunction2(afterRequest))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1(batch))
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions.asInstanceOf[js.Any])
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (buildRequest != null) __obj.updateDynamic("buildRequest")(js.Any.fromFunction1(buildRequest))
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(js.Any.fromFunction1(buildUrl))
    if (cacheString != null) __obj.updateDynamic("cacheString")(cacheString.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction0(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction3(destroy))
    if (directionParam != null) __obj.updateDynamic("directionParam")(directionParam.asInstanceOf[js.Any])
    if (doRequest != null) __obj.updateDynamic("doRequest")(js.Any.fromFunction3(doRequest))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enablePagingParams)) __obj.updateDynamic("enablePagingParams")(enablePagingParams.asInstanceOf[js.Any])
    if (encodeFilters != null) __obj.updateDynamic("encodeFilters")(js.Any.fromFunction1(encodeFilters))
    if (encodeSorters != null) __obj.updateDynamic("encodeSorters")(js.Any.fromFunction1(encodeSorters))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams.asInstanceOf[js.Any])
    if (filterParam != null) __obj.updateDynamic("filterParam")(filterParam.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getApi != null) __obj.updateDynamic("getApi")(js.Any.fromFunction0(getApi))
    if (getBatchActions != null) __obj.updateDynamic("getBatchActions")(js.Any.fromFunction0(getBatchActions))
    if (getBatchOrder != null) __obj.updateDynamic("getBatchOrder")(js.Any.fromFunction0(getBatchOrder))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCacheString != null) __obj.updateDynamic("getCacheString")(js.Any.fromFunction0(getCacheString))
    if (getDirectionParam != null) __obj.updateDynamic("getDirectionParam")(js.Any.fromFunction0(getDirectionParam))
    if (getEnablePagingParams != null) __obj.updateDynamic("getEnablePagingParams")(js.Any.fromFunction0(getEnablePagingParams))
    if (getExtraParams != null) __obj.updateDynamic("getExtraParams")(js.Any.fromFunction0(getExtraParams))
    if (getFilterParam != null) __obj.updateDynamic("getFilterParam")(js.Any.fromFunction0(getFilterParam))
    if (getGroupParam != null) __obj.updateDynamic("getGroupParam")(js.Any.fromFunction0(getGroupParam))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLimitParam != null) __obj.updateDynamic("getLimitParam")(js.Any.fromFunction0(getLimitParam))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getNoCache != null) __obj.updateDynamic("getNoCache")(js.Any.fromFunction0(getNoCache))
    if (getPageParam != null) __obj.updateDynamic("getPageParam")(js.Any.fromFunction0(getPageParam))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getSimpleSortMode != null) __obj.updateDynamic("getSimpleSortMode")(js.Any.fromFunction0(getSimpleSortMode))
    if (getSortParam != null) __obj.updateDynamic("getSortParam")(js.Any.fromFunction0(getSortParam))
    if (getStartParam != null) __obj.updateDynamic("getStartParam")(js.Any.fromFunction0(getStartParam))
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(js.Any.fromFunction0(getTimeout))
    if (getWriter != null) __obj.updateDynamic("getWriter")(js.Any.fromFunction0(getWriter))
    if (groupParam != null) __obj.updateDynamic("groupParam")(groupParam.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (limitParam != null) __obj.updateDynamic("limitParam")(limitParam.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (pageParam != null) __obj.updateDynamic("pageParam")(pageParam.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (processResponse != null) __obj.updateDynamic("processResponse")(js.Any.fromFunction6(processResponse))
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction0(read))
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setApi != null) __obj.updateDynamic("setApi")(js.Any.fromFunction1(setApi))
    if (setBatchActions != null) __obj.updateDynamic("setBatchActions")(js.Any.fromFunction1(setBatchActions))
    if (setBatchOrder != null) __obj.updateDynamic("setBatchOrder")(js.Any.fromFunction1(setBatchOrder))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCacheString != null) __obj.updateDynamic("setCacheString")(js.Any.fromFunction1(setCacheString))
    if (setDirectionParam != null) __obj.updateDynamic("setDirectionParam")(js.Any.fromFunction1(setDirectionParam))
    if (setEnablePagingParams != null) __obj.updateDynamic("setEnablePagingParams")(js.Any.fromFunction1(setEnablePagingParams))
    if (setExtraParam != null) __obj.updateDynamic("setExtraParam")(js.Any.fromFunction2(setExtraParam))
    if (setExtraParams != null) __obj.updateDynamic("setExtraParams")(js.Any.fromFunction1(setExtraParams))
    if (setFilterParam != null) __obj.updateDynamic("setFilterParam")(js.Any.fromFunction1(setFilterParam))
    if (setGroupParam != null) __obj.updateDynamic("setGroupParam")(js.Any.fromFunction1(setGroupParam))
    if (setLimitParam != null) __obj.updateDynamic("setLimitParam")(js.Any.fromFunction1(setLimitParam))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1(setModel))
    if (setNoCache != null) __obj.updateDynamic("setNoCache")(js.Any.fromFunction1(setNoCache))
    if (setPageParam != null) __obj.updateDynamic("setPageParam")(js.Any.fromFunction1(setPageParam))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1(setReader))
    if (setSimpleSortMode != null) __obj.updateDynamic("setSimpleSortMode")(js.Any.fromFunction1(setSimpleSortMode))
    if (setSortParam != null) __obj.updateDynamic("setSortParam")(js.Any.fromFunction1(setSortParam))
    if (setStartParam != null) __obj.updateDynamic("setStartParam")(js.Any.fromFunction1(setStartParam))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (setWriter != null) __obj.updateDynamic("setWriter")(js.Any.fromFunction1(setWriter))
    if (!js.isUndefined(simpleSortMode)) __obj.updateDynamic("simpleSortMode")(simpleSortMode.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sortParam != null) __obj.updateDynamic("sortParam")(sortParam.asInstanceOf[js.Any])
    if (startParam != null) __obj.updateDynamic("startParam")(startParam.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServer]
  }
}

