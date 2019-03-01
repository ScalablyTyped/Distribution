package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOperation
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Checks whether this operation should cause writing to occur
  		* @returns Boolean Whether the operation should cause a write to occur.
  		*/
  var allowWrite: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.undefined
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of addRecords
  		* @returns Boolean
  		*/
  var getAddRecords: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var getFilters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of grouper
  		* @returns Ext.util.Grouper
  		*/
  var getGrouper: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.utilNs.IGrouper]] = js.undefined
  /** [Method] Returns the value of limit
  		* @returns Number
  		*/
  var getLimit: js.UndefOr[js.Function0[scala.Double]] = js.undefined
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
  var getSorters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of start
  		* @returns Number
  		*/
  var getStart: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of synchronous
  		* @returns Boolean
  		*/
  var getSynchronous: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns Object
  		*/
  var getUrl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of withCredentials
  		* @returns Boolean
  		*/
  var getWithCredentials: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var group: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.util.Grouper) */
  var grouper: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IGrouper] = js.undefined
  /** [Method] Returns true if this Operation encountered an exception see also getError
  		* @returns Boolean true if there was an exception.
  		*/
  var hasException: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been completed
  		* @returns Boolean true if the Operation is complete
  		*/
  var isComplete: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started but has not yet completed
  		* @returns Boolean true if the Operation is currently running
  		*/
  var isRunning: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if the Operation has been started
  		* @returns Boolean true if the Operation has started
  		*/
  var isStarted: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var model: js.UndefOr[IModel] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var records: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
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
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of addRecords
  		* @param addRecords Boolean The new value.
  		*/
  var setAddRecords: js.UndefOr[js.Function1[/* addRecords */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of batch
  		* @param batch Ext.data.Batch The new value.
  		*/
  var setBatch: js.UndefOr[js.Function1[/* batch */ js.UndefOr[IBatch], scala.Unit]] = js.undefined
  /** [Method] Sets the value of callback
  		* @param callback Function The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Marks the Operation as having experienced an exception
  		* @param error String/Object error string/object
  		*/
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Ext.util.Filter[] The new value.
  		*/
  var setFilters: js.UndefOr[
    js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of grouper
  		* @param grouper Ext.util.Grouper The new value.
  		*/
  var setGrouper: js.UndefOr[
    js.Function1[
      /* grouper */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IGrouper], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of limit
  		* @param limit Number The new value.
  		*/
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model Ext.data.Model The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[IModel], scala.Unit]] = js.undefined
  /** [Method] Sets the value of node
  		* @param node Object The new value.
  		*/
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of page
  		* @param page Object The new value.
  		*/
  var setPage: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of records
  		* @param records Array The new value.
  		*/
  var setRecords: js.UndefOr[
    js.Function1[/* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of request
  		* @param request Ext.data.Request The new value.
  		*/
  var setRequest: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], scala.Unit]] = js.undefined
  /** [Method] Sets the value of response
  		* @param response Object The new value.
  		*/
  var setResponse: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of resultSet
  		* @param resultSet Ext.data.ResultSet The new value.
  		*/
  var setResultSet: js.UndefOr[js.Function1[/* resultSet */ js.UndefOr[IResultSet], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sorters
  		* @param sorters Ext.util.Sorter[] The new value.
  		*/
  var setSorters: js.UndefOr[
    js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of start
  		* @param start Number The new value.
  		*/
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of synchronous
  		* @param synchronous Boolean The new value.
  		*/
  var setSynchronous: js.UndefOr[js.Function1[/* synchronous */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url Object The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of withCredentials
  		* @param withCredentials Boolean The new value.
  		*/
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Number) */
  var start: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the Operation has completed and was successful
  		* @returns Boolean true if successful
  		*/
  var wasSuccessful: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object IOperation {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    allowWrite: js.Function0[scala.Boolean] = null,
    alternateClassName: js.Any = null,
    batch: IBatch = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callback: js.Any = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    getAction: js.Function0[java.lang.String] = null,
    getAddRecords: js.Function0[scala.Boolean] = null,
    getBatch: js.Function0[IBatch] = null,
    getCallback: js.Function0[_] = null,
    getError: js.Function0[_] = null,
    getFilters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getGrouper: js.Function0[senchaUnderscoreTouchLib.ExtNs.utilNs.IGrouper] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLimit: js.Function0[scala.Double] = null,
    getModel: js.Function0[IModel] = null,
    getNode: js.Function0[_] = null,
    getPage: js.Function0[_] = null,
    getParams: js.Function0[_] = null,
    getRequest: js.Function0[IRequest] = null,
    getResponse: js.Function0[_] = null,
    getResultSet: js.Function0[IResultSet] = null,
    getScope: js.Function0[_] = null,
    getSorters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getStart: js.Function0[scala.Double] = null,
    getSynchronous: js.Function0[scala.Boolean] = null,
    getUrl: js.Function0[_] = null,
    getWithCredentials: js.Function0[scala.Boolean] = null,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    grouper: senchaUnderscoreTouchLib.ExtNs.utilNs.IGrouper = null,
    hasException: js.Function0[scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isComplete: js.Function0[scala.Boolean] = null,
    isRunning: js.Function0[scala.Boolean] = null,
    isStarted: js.Function0[scala.Boolean] = null,
    limit: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    model: IModel = null,
    params: js.Any = null,
    platformConfig: js.Any = null,
    records: senchaUnderscoreTouchLib.ExtNs.Array = null,
    request: IRequest = null,
    response: js.Any = null,
    resultSet: IResultSet = null,
    scope: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAction: js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setAddRecords: js.Function1[/* addRecords */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBatch: js.Function1[/* batch */ js.UndefOr[IBatch], scala.Unit] = null,
    setCallback: js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit] = null,
    setCompleted: js.Function0[scala.Unit] = null,
    setException: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    setFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setGrouper: js.Function1[
      /* grouper */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IGrouper], 
      scala.Unit
    ] = null,
    setLimit: js.Function1[/* limit */ js.UndefOr[scala.Double], scala.Unit] = null,
    setModel: js.Function1[/* model */ js.UndefOr[IModel], scala.Unit] = null,
    setNode: js.Function1[/* node */ js.UndefOr[js.Any], scala.Unit] = null,
    setPage: js.Function1[/* page */ js.UndefOr[js.Any], scala.Unit] = null,
    setParams: js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit] = null,
    setRecords: js.Function1[/* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setRequest: js.Function1[/* request */ js.UndefOr[IRequest], scala.Unit] = null,
    setResponse: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit] = null,
    setResultSet: js.Function1[/* resultSet */ js.UndefOr[IResultSet], scala.Unit] = null,
    setScope: js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    setSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setStart: js.Function1[/* start */ js.UndefOr[scala.Double], scala.Unit] = null,
    setStarted: js.Function0[scala.Unit] = null,
    setSuccessful: js.Function0[scala.Unit] = null,
    setSynchronous: js.Function1[/* synchronous */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit] = null,
    setWithCredentials: js.Function1[/* withCredentials */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    start: scala.Int | scala.Double = null,
    statics: js.Any = null,
    synchronous: js.UndefOr[scala.Boolean] = js.undefined,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    wasSuccessful: js.Function0[scala.Boolean] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): IOperation = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (allowWrite != null) __obj.updateDynamic("allowWrite")(allowWrite)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (getAction != null) __obj.updateDynamic("getAction")(getAction)
    if (getAddRecords != null) __obj.updateDynamic("getAddRecords")(getAddRecords)
    if (getBatch != null) __obj.updateDynamic("getBatch")(getBatch)
    if (getCallback != null) __obj.updateDynamic("getCallback")(getCallback)
    if (getError != null) __obj.updateDynamic("getError")(getError)
    if (getFilters != null) __obj.updateDynamic("getFilters")(getFilters)
    if (getGrouper != null) __obj.updateDynamic("getGrouper")(getGrouper)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLimit != null) __obj.updateDynamic("getLimit")(getLimit)
    if (getModel != null) __obj.updateDynamic("getModel")(getModel)
    if (getNode != null) __obj.updateDynamic("getNode")(getNode)
    if (getPage != null) __obj.updateDynamic("getPage")(getPage)
    if (getParams != null) __obj.updateDynamic("getParams")(getParams)
    if (getRequest != null) __obj.updateDynamic("getRequest")(getRequest)
    if (getResponse != null) __obj.updateDynamic("getResponse")(getResponse)
    if (getResultSet != null) __obj.updateDynamic("getResultSet")(getResultSet)
    if (getScope != null) __obj.updateDynamic("getScope")(getScope)
    if (getSorters != null) __obj.updateDynamic("getSorters")(getSorters)
    if (getStart != null) __obj.updateDynamic("getStart")(getStart)
    if (getSynchronous != null) __obj.updateDynamic("getSynchronous")(getSynchronous)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (getWithCredentials != null) __obj.updateDynamic("getWithCredentials")(getWithCredentials)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (grouper != null) __obj.updateDynamic("grouper")(grouper)
    if (hasException != null) __obj.updateDynamic("hasException")(hasException)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isComplete != null) __obj.updateDynamic("isComplete")(isComplete)
    if (isRunning != null) __obj.updateDynamic("isRunning")(isRunning)
    if (isStarted != null) __obj.updateDynamic("isStarted")(isStarted)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (params != null) __obj.updateDynamic("params")(params)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (records != null) __obj.updateDynamic("records")(records)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (resultSet != null) __obj.updateDynamic("resultSet")(resultSet)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAction != null) __obj.updateDynamic("setAction")(setAction)
    if (setAddRecords != null) __obj.updateDynamic("setAddRecords")(setAddRecords)
    if (setBatch != null) __obj.updateDynamic("setBatch")(setBatch)
    if (setCallback != null) __obj.updateDynamic("setCallback")(setCallback)
    if (setCompleted != null) __obj.updateDynamic("setCompleted")(setCompleted)
    if (setException != null) __obj.updateDynamic("setException")(setException)
    if (setFilters != null) __obj.updateDynamic("setFilters")(setFilters)
    if (setGrouper != null) __obj.updateDynamic("setGrouper")(setGrouper)
    if (setLimit != null) __obj.updateDynamic("setLimit")(setLimit)
    if (setModel != null) __obj.updateDynamic("setModel")(setModel)
    if (setNode != null) __obj.updateDynamic("setNode")(setNode)
    if (setPage != null) __obj.updateDynamic("setPage")(setPage)
    if (setParams != null) __obj.updateDynamic("setParams")(setParams)
    if (setRecords != null) __obj.updateDynamic("setRecords")(setRecords)
    if (setRequest != null) __obj.updateDynamic("setRequest")(setRequest)
    if (setResponse != null) __obj.updateDynamic("setResponse")(setResponse)
    if (setResultSet != null) __obj.updateDynamic("setResultSet")(setResultSet)
    if (setScope != null) __obj.updateDynamic("setScope")(setScope)
    if (setSorters != null) __obj.updateDynamic("setSorters")(setSorters)
    if (setStart != null) __obj.updateDynamic("setStart")(setStart)
    if (setStarted != null) __obj.updateDynamic("setStarted")(setStarted)
    if (setSuccessful != null) __obj.updateDynamic("setSuccessful")(setSuccessful)
    if (setSynchronous != null) __obj.updateDynamic("setSynchronous")(setSynchronous)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (setWithCredentials != null) __obj.updateDynamic("setWithCredentials")(setWithCredentials)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (wasSuccessful != null) __obj.updateDynamic("wasSuccessful")(wasSuccessful)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[IOperation]
  }
}

