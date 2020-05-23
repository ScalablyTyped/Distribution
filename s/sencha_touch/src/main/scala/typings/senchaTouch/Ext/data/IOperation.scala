package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.util.IGrouper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperation extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  /** [Method] Checks whether this operation should cause writing to occur
    * @returns Boolean Whether the operation should cause a write to occur.
    */
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.undefined
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.undefined
  /** [Method] Returns the value of action
    * @returns String
    */
  var getAction: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of addRecords
    * @returns Boolean
    */
  var getAddRecords: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of batch
    * @returns Ext.data.Batch
    */
  var getBatch: js.UndefOr[js.Function0[IBatch]] = js.undefined
  /** [Method] Returns the value of callback
    * @returns Function
    */
  var getCallback: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the error string or object that was set using setException
    * @returns String/Object The error object.
    */
  var getError: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filters
    * @returns Ext.util.Filter[]
    */
  var getFilters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of grouper
    * @returns Ext.util.Grouper
    */
  var getGrouper: js.UndefOr[js.Function0[IGrouper]] = js.undefined
  /** [Method] Returns the value of limit
    * @returns Number
    */
  var getLimit: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of model
    * @returns Ext.data.Model
    */
  var getModel: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Returns the value of node
    * @returns Object
    */
  var getNode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of page
    * @returns Object
    */
  var getPage: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of params
    * @returns Object
    */
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of request
    * @returns Ext.data.Request
    */
  var getRequest: js.UndefOr[js.Function0[IRequest]] = js.undefined
  /** [Method] Returns the value of response
    * @returns Object
    */
  var getResponse: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of resultSet
    * @returns Ext.data.ResultSet
    */
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.undefined
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sorters
    * @returns Ext.util.Sorter[]
    */
  var getSorters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of start
    * @returns Number
    */
  var getStart: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of synchronous
    * @returns Boolean
    */
  var getSynchronous: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of url
    * @returns Object
    */
  var getUrl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of withCredentials
    * @returns Boolean
    */
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var group: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.util.Grouper) */
  var grouper: js.UndefOr[IGrouper] = js.undefined
  /** [Method] Returns true if this Operation encountered an exception see also getError
    * @returns Boolean true if there was an exception.
    */
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been completed
    * @returns Boolean true if the Operation is complete
    */
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started but has not yet completed
    * @returns Boolean true if the Operation is currently running
    */
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started
    * @returns Boolean true if the Operation has started
    */
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var model: js.UndefOr[IModel] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var records: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.data.Request) */
  var request: js.UndefOr[IRequest] = js.undefined
  /** [Config Option] (Object) */
  var response: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.ResultSet) */
  var resultSet: js.UndefOr[IResultSet] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of action
    * @param action String The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of addRecords
    * @param addRecords Boolean The new value.
    */
  var setAddRecords: js.UndefOr[js.Function1[/* addRecords */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of batch
    * @param batch Ext.data.Batch The new value.
    */
  var setBatch: js.UndefOr[js.Function1[/* batch */ js.UndefOr[IBatch], Unit]] = js.undefined
  /** [Method] Sets the value of callback
    * @param callback Function The new value.
    */
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Marks the Operation as having experienced an exception
    * @param error String/Object error string/object
    */
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of filters
    * @param filters Ext.util.Filter[] The new value.
    */
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of grouper
    * @param grouper Ext.util.Grouper The new value.
    */
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[IGrouper], Unit]] = js.undefined
  /** [Method] Sets the value of limit
    * @param limit Number The new value.
    */
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of model
    * @param model Ext.data.Model The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Sets the value of node
    * @param node Object The new value.
    */
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of page
    * @param page Object The new value.
    */
  var setPage: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of params
    * @param params Object The new value.
    */
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of records
    * @param records Array The new value.
    */
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of request
    * @param request Ext.data.Request The new value.
    */
  var setRequest: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], Unit]] = js.undefined
  /** [Method] Sets the value of response
    * @param response Object The new value.
    */
  var setResponse: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of resultSet
    * @param resultSet Ext.data.ResultSet The new value.
    */
  var setResultSet: js.UndefOr[js.Function1[/* resultSet */ js.UndefOr[IResultSet], Unit]] = js.undefined
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of sorters
    * @param sorters Ext.util.Sorter[] The new value.
    */
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of start
    * @param start Number The new value.
    */
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of synchronous
    * @param synchronous Boolean The new value.
    */
  var setSynchronous: js.UndefOr[js.Function1[/* synchronous */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of url
    * @param url Object The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of withCredentials
    * @param withCredentials Boolean The new value.
    */
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns true if the Operation has completed and was successful
    * @returns Boolean true if successful
    */
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object IOperation {
  @scala.inline
  def apply(
    action: String = null,
    alias: Array = null,
    allowWrite: () => Boolean = null,
    alternateClassName: js.Any = null,
    batch: IBatch = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    callback: js.Any = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    filters: Array = null,
    getAction: () => String = null,
    getAddRecords: () => Boolean = null,
    getBatch: () => IBatch = null,
    getCallback: () => _ = null,
    getError: () => _ = null,
    getFilters: () => Array = null,
    getGrouper: () => IGrouper = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLimit: () => Double = null,
    getModel: () => IModel = null,
    getNode: () => _ = null,
    getPage: () => _ = null,
    getParams: () => _ = null,
    getRequest: () => IRequest = null,
    getResponse: () => _ = null,
    getResultSet: () => IResultSet = null,
    getScope: () => _ = null,
    getSorters: () => Array = null,
    getStart: () => Double = null,
    getSynchronous: () => Boolean = null,
    getUrl: () => _ = null,
    getWithCredentials: () => Boolean = null,
    group: js.UndefOr[Boolean] = js.undefined,
    grouper: IGrouper = null,
    hasException: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isComplete: () => Boolean = null,
    isRunning: () => Boolean = null,
    isStarted: () => Boolean = null,
    limit: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    model: IModel = null,
    params: js.Any = null,
    platformConfig: js.Any = null,
    records: Array = null,
    request: IRequest = null,
    response: js.Any = null,
    resultSet: IResultSet = null,
    scope: js.Any = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[String] => Unit = null,
    setAddRecords: /* addRecords */ js.UndefOr[Boolean] => Unit = null,
    setBatch: /* batch */ js.UndefOr[IBatch] => Unit = null,
    setCallback: /* callback */ js.UndefOr[js.Any] => Unit = null,
    setCompleted: () => Unit = null,
    setException: /* error */ js.UndefOr[js.Any] => Unit = null,
    setFilters: /* filters */ js.UndefOr[Array] => Unit = null,
    setGrouper: /* grouper */ js.UndefOr[IGrouper] => Unit = null,
    setLimit: /* limit */ js.UndefOr[Double] => Unit = null,
    setModel: /* model */ js.UndefOr[IModel] => Unit = null,
    setNode: /* node */ js.UndefOr[js.Any] => Unit = null,
    setPage: /* page */ js.UndefOr[js.Any] => Unit = null,
    setParams: /* params */ js.UndefOr[js.Any] => Unit = null,
    setRecords: /* records */ js.UndefOr[Array] => Unit = null,
    setRequest: /* request */ js.UndefOr[IRequest] => Unit = null,
    setResponse: /* response */ js.UndefOr[js.Any] => Unit = null,
    setResultSet: /* resultSet */ js.UndefOr[IResultSet] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Unit = null,
    setStart: /* start */ js.UndefOr[Double] => Unit = null,
    setStarted: () => Unit = null,
    setSuccessful: () => Unit = null,
    setSynchronous: /* synchronous */ js.UndefOr[Boolean] => Unit = null,
    setUrl: /* url */ js.UndefOr[js.Any] => Unit = null,
    setWithCredentials: /* withCredentials */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    start: js.UndefOr[Double] = js.undefined,
    statics: js.Any = null,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null,
    wasSuccessful: () => Boolean = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (allowWrite != null) __obj.updateDynamic("allowWrite")(js.Any.fromFunction0(allowWrite))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (getAction != null) __obj.updateDynamic("getAction")(js.Any.fromFunction0(getAction))
    if (getAddRecords != null) __obj.updateDynamic("getAddRecords")(js.Any.fromFunction0(getAddRecords))
    if (getBatch != null) __obj.updateDynamic("getBatch")(js.Any.fromFunction0(getBatch))
    if (getCallback != null) __obj.updateDynamic("getCallback")(js.Any.fromFunction0(getCallback))
    if (getError != null) __obj.updateDynamic("getError")(js.Any.fromFunction0(getError))
    if (getFilters != null) __obj.updateDynamic("getFilters")(js.Any.fromFunction0(getFilters))
    if (getGrouper != null) __obj.updateDynamic("getGrouper")(js.Any.fromFunction0(getGrouper))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLimit != null) __obj.updateDynamic("getLimit")(js.Any.fromFunction0(getLimit))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getNode != null) __obj.updateDynamic("getNode")(js.Any.fromFunction0(getNode))
    if (getPage != null) __obj.updateDynamic("getPage")(js.Any.fromFunction0(getPage))
    if (getParams != null) __obj.updateDynamic("getParams")(js.Any.fromFunction0(getParams))
    if (getRequest != null) __obj.updateDynamic("getRequest")(js.Any.fromFunction0(getRequest))
    if (getResponse != null) __obj.updateDynamic("getResponse")(js.Any.fromFunction0(getResponse))
    if (getResultSet != null) __obj.updateDynamic("getResultSet")(js.Any.fromFunction0(getResultSet))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (getSorters != null) __obj.updateDynamic("getSorters")(js.Any.fromFunction0(getSorters))
    if (getStart != null) __obj.updateDynamic("getStart")(js.Any.fromFunction0(getStart))
    if (getSynchronous != null) __obj.updateDynamic("getSynchronous")(js.Any.fromFunction0(getSynchronous))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (getWithCredentials != null) __obj.updateDynamic("getWithCredentials")(js.Any.fromFunction0(getWithCredentials))
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.get.asInstanceOf[js.Any])
    if (grouper != null) __obj.updateDynamic("grouper")(grouper.asInstanceOf[js.Any])
    if (hasException != null) __obj.updateDynamic("hasException")(js.Any.fromFunction0(hasException))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isComplete != null) __obj.updateDynamic("isComplete")(js.Any.fromFunction0(isComplete))
    if (isRunning != null) __obj.updateDynamic("isRunning")(js.Any.fromFunction0(isRunning))
    if (isStarted != null) __obj.updateDynamic("isStarted")(js.Any.fromFunction0(isStarted))
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (resultSet != null) __obj.updateDynamic("resultSet")(resultSet.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1(setAction))
    if (setAddRecords != null) __obj.updateDynamic("setAddRecords")(js.Any.fromFunction1(setAddRecords))
    if (setBatch != null) __obj.updateDynamic("setBatch")(js.Any.fromFunction1(setBatch))
    if (setCallback != null) __obj.updateDynamic("setCallback")(js.Any.fromFunction1(setCallback))
    if (setCompleted != null) __obj.updateDynamic("setCompleted")(js.Any.fromFunction0(setCompleted))
    if (setException != null) __obj.updateDynamic("setException")(js.Any.fromFunction1(setException))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1(setFilters))
    if (setGrouper != null) __obj.updateDynamic("setGrouper")(js.Any.fromFunction1(setGrouper))
    if (setLimit != null) __obj.updateDynamic("setLimit")(js.Any.fromFunction1(setLimit))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1(setModel))
    if (setNode != null) __obj.updateDynamic("setNode")(js.Any.fromFunction1(setNode))
    if (setPage != null) __obj.updateDynamic("setPage")(js.Any.fromFunction1(setPage))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1(setParams))
    if (setRecords != null) __obj.updateDynamic("setRecords")(js.Any.fromFunction1(setRecords))
    if (setRequest != null) __obj.updateDynamic("setRequest")(js.Any.fromFunction1(setRequest))
    if (setResponse != null) __obj.updateDynamic("setResponse")(js.Any.fromFunction1(setResponse))
    if (setResultSet != null) __obj.updateDynamic("setResultSet")(js.Any.fromFunction1(setResultSet))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1(setSorters))
    if (setStart != null) __obj.updateDynamic("setStart")(js.Any.fromFunction1(setStart))
    if (setStarted != null) __obj.updateDynamic("setStarted")(js.Any.fromFunction0(setStarted))
    if (setSuccessful != null) __obj.updateDynamic("setSuccessful")(js.Any.fromFunction0(setSuccessful))
    if (setSynchronous != null) __obj.updateDynamic("setSynchronous")(js.Any.fromFunction1(setSynchronous))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (setWithCredentials != null) __obj.updateDynamic("setWithCredentials")(js.Any.fromFunction1(setWithCredentials))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.get.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (wasSuccessful != null) __obj.updateDynamic("wasSuccessful")(js.Any.fromFunction0(wasSuccessful))
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOperation]
  }
}

