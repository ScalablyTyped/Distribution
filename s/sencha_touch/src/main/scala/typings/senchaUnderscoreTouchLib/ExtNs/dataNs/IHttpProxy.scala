package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpProxy
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.proxyNs.IServer {
  /** [Property] (Object) */
  var actionMethods: js.UndefOr[js.Any] = js.undefined
  /** [Method] Performs Ajax request
  		* @param operation Ext.data.Operation
  		* @param callback Function
  		* @param scope Object
  		* @returns Object
  		*/
  @JSName("doRequest")
  var doRequest_IHttpProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of headers
  		* @returns Object
  		*/
  var getHeaders: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the HTTP method name for a given request
  		* @param request Ext.data.Request The request object.
  		* @returns String The HTTP method to use (should be one of 'GET', 'POST', 'PUT' or 'DELETE').
  		*/
  var getMethod: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], java.lang.String]] = js.undefined
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  var getPassword: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  var getUseDefaultXhrHeader: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  var getUsername: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Object) */
  var headers: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of headers
  		* @param headers Object The new value.
  		*/
  var setHeaders: js.UndefOr[js.Function1[/* headers */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  var setPassword: js.UndefOr[js.Function1[/* password */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  var setUseDefaultXhrHeader: js.UndefOr[js.Function1[/* useDefaultXhrHeader */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  var setUsername: js.UndefOr[js.Function1[/* username */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useDefaultXhrHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object IHttpProxy {
  @scala.inline
  def apply(
    actionMethods: js.Any = null,
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    afterRequest: js.Function2[
      /* request */ js.UndefOr[IRequest], 
      /* success */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    batch: js.Function1[/* options */ js.UndefOr[js.Any], IBatch] = null,
    batchActions: js.UndefOr[scala.Boolean] = js.undefined,
    batchOrder: java.lang.String = null,
    bubbleEvents: js.Any = null,
    buildRequest: js.Function1[/* operation */ js.UndefOr[IOperation], IRequest] = null,
    buildUrl: js.Function1[/* request */ js.UndefOr[IRequest], java.lang.String] = null,
    cacheString: java.lang.String = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    create: js.Function0[scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    directionParam: java.lang.String = null,
    doRequest: js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    enablePagingParams: js.UndefOr[scala.Boolean] = js.undefined,
    encodeFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], java.lang.String] = null,
    encodeSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], java.lang.String] = null,
    extend: java.lang.String = null,
    extraParams: js.Any = null,
    filterParam: java.lang.String = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    getApi: js.Function0[_] = null,
    getBatchActions: js.Function0[scala.Boolean] = null,
    getBatchOrder: js.Function0[java.lang.String] = null,
    getBubbleEvents: js.Function0[_] = null,
    getCacheString: js.Function0[java.lang.String] = null,
    getDirectionParam: js.Function0[java.lang.String] = null,
    getEnablePagingParams: js.Function0[scala.Boolean] = null,
    getExtraParams: js.Function0[_] = null,
    getFilterParam: js.Function0[java.lang.String] = null,
    getGroupParam: js.Function0[java.lang.String] = null,
    getHeaders: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLimitParam: js.Function0[java.lang.String] = null,
    getListeners: js.Function0[_] = null,
    getMethod: js.Function1[/* request */ js.UndefOr[IRequest], java.lang.String] = null,
    getModel: js.Function0[_] = null,
    getNoCache: js.Function0[scala.Boolean] = null,
    getPageParam: js.Function0[java.lang.String] = null,
    getPassword: js.Function0[java.lang.String] = null,
    getReader: js.Function0[_] = null,
    getSimpleSortMode: js.Function0[scala.Boolean] = null,
    getSortParam: js.Function0[java.lang.String] = null,
    getStartParam: js.Function0[java.lang.String] = null,
    getTimeout: js.Function0[scala.Double] = null,
    getUseDefaultXhrHeader: js.Function0[scala.Boolean] = null,
    getUsername: js.Function0[java.lang.String] = null,
    getWithCredentials: js.Function0[scala.Boolean] = null,
    getWriter: js.Function0[_] = null,
    groupParam: java.lang.String = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    headers: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    limitParam: java.lang.String = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    pageParam: java.lang.String = null,
    password: java.lang.String = null,
    platformConfig: js.Any = null,
    processResponse: js.Function6[
      /* success */ js.UndefOr[scala.Boolean], 
      /* operation */ js.UndefOr[IOperation], 
      /* request */ js.UndefOr[IRequest], 
      /* response */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    read: js.Function0[scala.Unit] = null,
    reader: js.Any = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setApi: js.Function1[/* api */ js.UndefOr[js.Any], scala.Unit] = null,
    setBatchActions: js.Function1[/* batchActions */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBatchOrder: js.Function1[/* batchOrder */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setCacheString: js.Function1[/* cacheString */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDirectionParam: js.Function1[/* directionParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setEnablePagingParams: js.Function1[/* enablePagingParams */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setExtraParam: js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit] = null,
    setExtraParams: js.Function1[/* extraParams */ js.UndefOr[js.Any], scala.Unit] = null,
    setFilterParam: js.Function1[/* filterParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setGroupParam: js.Function1[/* groupParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHeaders: js.Function1[/* headers */ js.UndefOr[js.Any], scala.Unit] = null,
    setLimitParam: js.Function1[/* limitParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setModel: js.Function1[/* model */ js.UndefOr[js.Any], scala.Unit] = null,
    setNoCache: js.Function1[/* noCache */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setPageParam: js.Function1[/* pageParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPassword: js.Function1[/* password */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setReader: js.Function1[/* reader */ js.UndefOr[js.Any], scala.Unit] = null,
    setSimpleSortMode: js.Function1[/* simpleSortMode */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSortParam: js.Function1[/* sortParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setStartParam: js.Function1[/* startParam */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTimeout: js.Function1[/* timeout */ js.UndefOr[scala.Double], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUseDefaultXhrHeader: js.Function1[/* useDefaultXhrHeader */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUsername: js.Function1[/* username */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setWithCredentials: js.Function1[/* withCredentials */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setWriter: js.Function1[/* writer */ js.UndefOr[js.Any], scala.Unit] = null,
    simpleSortMode: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sortParam: java.lang.String = null,
    startParam: java.lang.String = null,
    statics: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    timeout: scala.Int | scala.Double = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    update: js.Function0[scala.Unit] = null,
    url: java.lang.String = null,
    useDefaultXhrHeader: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    writer: js.Any = null
  ): IHttpProxy = {
    val __obj = js.Dynamic.literal()
    if (actionMethods != null) __obj.updateDynamic("actionMethods")(actionMethods)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(afterRequest)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (api != null) __obj.updateDynamic("api")(api)
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions)
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (buildRequest != null) __obj.updateDynamic("buildRequest")(buildRequest)
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(buildUrl)
    if (cacheString != null) __obj.updateDynamic("cacheString")(cacheString)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (directionParam != null) __obj.updateDynamic("directionParam")(directionParam)
    if (doRequest != null) __obj.updateDynamic("doRequest")(doRequest)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (!js.isUndefined(enablePagingParams)) __obj.updateDynamic("enablePagingParams")(enablePagingParams)
    if (encodeFilters != null) __obj.updateDynamic("encodeFilters")(encodeFilters)
    if (encodeSorters != null) __obj.updateDynamic("encodeSorters")(encodeSorters)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams)
    if (filterParam != null) __obj.updateDynamic("filterParam")(filterParam)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getApi != null) __obj.updateDynamic("getApi")(getApi)
    if (getBatchActions != null) __obj.updateDynamic("getBatchActions")(getBatchActions)
    if (getBatchOrder != null) __obj.updateDynamic("getBatchOrder")(getBatchOrder)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getCacheString != null) __obj.updateDynamic("getCacheString")(getCacheString)
    if (getDirectionParam != null) __obj.updateDynamic("getDirectionParam")(getDirectionParam)
    if (getEnablePagingParams != null) __obj.updateDynamic("getEnablePagingParams")(getEnablePagingParams)
    if (getExtraParams != null) __obj.updateDynamic("getExtraParams")(getExtraParams)
    if (getFilterParam != null) __obj.updateDynamic("getFilterParam")(getFilterParam)
    if (getGroupParam != null) __obj.updateDynamic("getGroupParam")(getGroupParam)
    if (getHeaders != null) __obj.updateDynamic("getHeaders")(getHeaders)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLimitParam != null) __obj.updateDynamic("getLimitParam")(getLimitParam)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod)
    if (getModel != null) __obj.updateDynamic("getModel")(getModel)
    if (getNoCache != null) __obj.updateDynamic("getNoCache")(getNoCache)
    if (getPageParam != null) __obj.updateDynamic("getPageParam")(getPageParam)
    if (getPassword != null) __obj.updateDynamic("getPassword")(getPassword)
    if (getReader != null) __obj.updateDynamic("getReader")(getReader)
    if (getSimpleSortMode != null) __obj.updateDynamic("getSimpleSortMode")(getSimpleSortMode)
    if (getSortParam != null) __obj.updateDynamic("getSortParam")(getSortParam)
    if (getStartParam != null) __obj.updateDynamic("getStartParam")(getStartParam)
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(getTimeout)
    if (getUseDefaultXhrHeader != null) __obj.updateDynamic("getUseDefaultXhrHeader")(getUseDefaultXhrHeader)
    if (getUsername != null) __obj.updateDynamic("getUsername")(getUsername)
    if (getWithCredentials != null) __obj.updateDynamic("getWithCredentials")(getWithCredentials)
    if (getWriter != null) __obj.updateDynamic("getWriter")(getWriter)
    if (groupParam != null) __obj.updateDynamic("groupParam")(groupParam)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (limitParam != null) __obj.updateDynamic("limitParam")(limitParam)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (pageParam != null) __obj.updateDynamic("pageParam")(pageParam)
    if (password != null) __obj.updateDynamic("password")(password)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (processResponse != null) __obj.updateDynamic("processResponse")(processResponse)
    if (read != null) __obj.updateDynamic("read")(read)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setApi != null) __obj.updateDynamic("setApi")(setApi)
    if (setBatchActions != null) __obj.updateDynamic("setBatchActions")(setBatchActions)
    if (setBatchOrder != null) __obj.updateDynamic("setBatchOrder")(setBatchOrder)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setCacheString != null) __obj.updateDynamic("setCacheString")(setCacheString)
    if (setDirectionParam != null) __obj.updateDynamic("setDirectionParam")(setDirectionParam)
    if (setEnablePagingParams != null) __obj.updateDynamic("setEnablePagingParams")(setEnablePagingParams)
    if (setExtraParam != null) __obj.updateDynamic("setExtraParam")(setExtraParam)
    if (setExtraParams != null) __obj.updateDynamic("setExtraParams")(setExtraParams)
    if (setFilterParam != null) __obj.updateDynamic("setFilterParam")(setFilterParam)
    if (setGroupParam != null) __obj.updateDynamic("setGroupParam")(setGroupParam)
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(setHeaders)
    if (setLimitParam != null) __obj.updateDynamic("setLimitParam")(setLimitParam)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setModel != null) __obj.updateDynamic("setModel")(setModel)
    if (setNoCache != null) __obj.updateDynamic("setNoCache")(setNoCache)
    if (setPageParam != null) __obj.updateDynamic("setPageParam")(setPageParam)
    if (setPassword != null) __obj.updateDynamic("setPassword")(setPassword)
    if (setReader != null) __obj.updateDynamic("setReader")(setReader)
    if (setSimpleSortMode != null) __obj.updateDynamic("setSimpleSortMode")(setSimpleSortMode)
    if (setSortParam != null) __obj.updateDynamic("setSortParam")(setSortParam)
    if (setStartParam != null) __obj.updateDynamic("setStartParam")(setStartParam)
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(setTimeout)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (setUseDefaultXhrHeader != null) __obj.updateDynamic("setUseDefaultXhrHeader")(setUseDefaultXhrHeader)
    if (setUsername != null) __obj.updateDynamic("setUsername")(setUsername)
    if (setWithCredentials != null) __obj.updateDynamic("setWithCredentials")(setWithCredentials)
    if (setWriter != null) __obj.updateDynamic("setWriter")(setWriter)
    if (!js.isUndefined(simpleSortMode)) __obj.updateDynamic("simpleSortMode")(simpleSortMode)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sortParam != null) __obj.updateDynamic("sortParam")(sortParam)
    if (startParam != null) __obj.updateDynamic("startParam")(startParam)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (update != null) __obj.updateDynamic("update")(update)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useDefaultXhrHeader)) __obj.updateDynamic("useDefaultXhrHeader")(useDefaultXhrHeader)
    if (username != null) __obj.updateDynamic("username")(username)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[IHttpProxy]
  }
}

