package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.util.IGrouper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOperation
  extends StObject
     with IBase {
  
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
  var getCallback: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the error string or object that was set using setException
    * @returns String/Object The error object.
    */
  var getError: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var getNode: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of page
    * @returns Object
    */
  var getPage: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of params
    * @returns Object
    */
  var getParams: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of request
    * @returns Ext.data.Request
    */
  var getRequest: js.UndefOr[js.Function0[IRequest]] = js.undefined
  
  /** [Method] Returns the value of response
    * @returns Object
    */
  var getResponse: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of resultSet
    * @returns Ext.data.ResultSet
    */
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.undefined
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var getUrl: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  
  @scala.inline
  implicit class IOperationMutableBuilder[Self <: IOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAllowWrite(value: () => Boolean): Self = StObject.set(x, "allowWrite", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllowWriteUndefined: Self = StObject.set(x, "allowWrite", js.undefined)
    
    @scala.inline
    def setBatch(value: IBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setFilters(value: Array): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setGetAction(value: () => String): Self = StObject.set(x, "getAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActionUndefined: Self = StObject.set(x, "getAction", js.undefined)
    
    @scala.inline
    def setGetAddRecords(value: () => Boolean): Self = StObject.set(x, "getAddRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAddRecordsUndefined: Self = StObject.set(x, "getAddRecords", js.undefined)
    
    @scala.inline
    def setGetBatch(value: () => IBatch): Self = StObject.set(x, "getBatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBatchUndefined: Self = StObject.set(x, "getBatch", js.undefined)
    
    @scala.inline
    def setGetCallback(value: () => js.Any): Self = StObject.set(x, "getCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCallbackUndefined: Self = StObject.set(x, "getCallback", js.undefined)
    
    @scala.inline
    def setGetError(value: () => js.Any): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorUndefined: Self = StObject.set(x, "getError", js.undefined)
    
    @scala.inline
    def setGetFilters(value: () => Array): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFiltersUndefined: Self = StObject.set(x, "getFilters", js.undefined)
    
    @scala.inline
    def setGetGrouper(value: () => IGrouper): Self = StObject.set(x, "getGrouper", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGrouperUndefined: Self = StObject.set(x, "getGrouper", js.undefined)
    
    @scala.inline
    def setGetLimit(value: () => Double): Self = StObject.set(x, "getLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLimitUndefined: Self = StObject.set(x, "getLimit", js.undefined)
    
    @scala.inline
    def setGetModel(value: () => IModel): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
    
    @scala.inline
    def setGetNode(value: () => js.Any): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeUndefined: Self = StObject.set(x, "getNode", js.undefined)
    
    @scala.inline
    def setGetPage(value: () => js.Any): Self = StObject.set(x, "getPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageUndefined: Self = StObject.set(x, "getPage", js.undefined)
    
    @scala.inline
    def setGetParams(value: () => js.Any): Self = StObject.set(x, "getParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParamsUndefined: Self = StObject.set(x, "getParams", js.undefined)
    
    @scala.inline
    def setGetRequest(value: () => IRequest): Self = StObject.set(x, "getRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRequestUndefined: Self = StObject.set(x, "getRequest", js.undefined)
    
    @scala.inline
    def setGetResponse(value: () => js.Any): Self = StObject.set(x, "getResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponseUndefined: Self = StObject.set(x, "getResponse", js.undefined)
    
    @scala.inline
    def setGetResultSet(value: () => IResultSet): Self = StObject.set(x, "getResultSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResultSetUndefined: Self = StObject.set(x, "getResultSet", js.undefined)
    
    @scala.inline
    def setGetScope(value: () => js.Any): Self = StObject.set(x, "getScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
    
    @scala.inline
    def setGetSorters(value: () => Array): Self = StObject.set(x, "getSorters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortersUndefined: Self = StObject.set(x, "getSorters", js.undefined)
    
    @scala.inline
    def setGetStart(value: () => Double): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartUndefined: Self = StObject.set(x, "getStart", js.undefined)
    
    @scala.inline
    def setGetSynchronous(value: () => Boolean): Self = StObject.set(x, "getSynchronous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSynchronousUndefined: Self = StObject.set(x, "getSynchronous", js.undefined)
    
    @scala.inline
    def setGetUrl(value: () => js.Any): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    @scala.inline
    def setGetWithCredentials(value: () => Boolean): Self = StObject.set(x, "getWithCredentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWithCredentialsUndefined: Self = StObject.set(x, "getWithCredentials", js.undefined)
    
    @scala.inline
    def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGrouper(value: IGrouper): Self = StObject.set(x, "grouper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrouperUndefined: Self = StObject.set(x, "grouper", js.undefined)
    
    @scala.inline
    def setHasException(value: () => Boolean): Self = StObject.set(x, "hasException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasExceptionUndefined: Self = StObject.set(x, "hasException", js.undefined)
    
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = StObject.set(x, "isComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    @scala.inline
    def setIsRunning(value: () => Boolean): Self = StObject.set(x, "isRunning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    
    @scala.inline
    def setIsStarted(value: () => Boolean): Self = StObject.set(x, "isStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStartedUndefined: Self = StObject.set(x, "isStarted", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRecords(value: Array): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    @scala.inline
    def setRequest(value: IRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setResultSet(value: IResultSet): Self = StObject.set(x, "resultSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetUndefined: Self = StObject.set(x, "resultSet", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActionUndefined: Self = StObject.set(x, "setAction", js.undefined)
    
    @scala.inline
    def setSetAddRecords(value: /* addRecords */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAddRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAddRecordsUndefined: Self = StObject.set(x, "setAddRecords", js.undefined)
    
    @scala.inline
    def setSetBatch(value: /* batch */ js.UndefOr[IBatch] => Unit): Self = StObject.set(x, "setBatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBatchUndefined: Self = StObject.set(x, "setBatch", js.undefined)
    
    @scala.inline
    def setSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCallbackUndefined: Self = StObject.set(x, "setCallback", js.undefined)
    
    @scala.inline
    def setSetCompleted(value: () => Unit): Self = StObject.set(x, "setCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCompletedUndefined: Self = StObject.set(x, "setCompleted", js.undefined)
    
    @scala.inline
    def setSetException(value: /* error */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExceptionUndefined: Self = StObject.set(x, "setException", js.undefined)
    
    @scala.inline
    def setSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFiltersUndefined: Self = StObject.set(x, "setFilters", js.undefined)
    
    @scala.inline
    def setSetGrouper(value: /* grouper */ js.UndefOr[IGrouper] => Unit): Self = StObject.set(x, "setGrouper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGrouperUndefined: Self = StObject.set(x, "setGrouper", js.undefined)
    
    @scala.inline
    def setSetLimit(value: /* limit */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setLimit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLimitUndefined: Self = StObject.set(x, "setLimit", js.undefined)
    
    @scala.inline
    def setSetModel(value: /* model */ js.UndefOr[IModel] => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
    
    @scala.inline
    def setSetNode(value: /* node */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNodeUndefined: Self = StObject.set(x, "setNode", js.undefined)
    
    @scala.inline
    def setSetPage(value: /* page */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPageUndefined: Self = StObject.set(x, "setPage", js.undefined)
    
    @scala.inline
    def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    @scala.inline
    def setSetRecords(value: /* records */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecordsUndefined: Self = StObject.set(x, "setRecords", js.undefined)
    
    @scala.inline
    def setSetRequest(value: /* request */ js.UndefOr[IRequest] => Unit): Self = StObject.set(x, "setRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequestUndefined: Self = StObject.set(x, "setRequest", js.undefined)
    
    @scala.inline
    def setSetResponse(value: /* response */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetResponseUndefined: Self = StObject.set(x, "setResponse", js.undefined)
    
    @scala.inline
    def setSetResultSet(value: /* resultSet */ js.UndefOr[IResultSet] => Unit): Self = StObject.set(x, "setResultSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetResultSetUndefined: Self = StObject.set(x, "setResultSet", js.undefined)
    
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
    
    @scala.inline
    def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortersUndefined: Self = StObject.set(x, "setSorters", js.undefined)
    
    @scala.inline
    def setSetStart(value: /* start */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStartUndefined: Self = StObject.set(x, "setStart", js.undefined)
    
    @scala.inline
    def setSetStarted(value: () => Unit): Self = StObject.set(x, "setStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetStartedUndefined: Self = StObject.set(x, "setStarted", js.undefined)
    
    @scala.inline
    def setSetSuccessful(value: () => Unit): Self = StObject.set(x, "setSuccessful", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSuccessfulUndefined: Self = StObject.set(x, "setSuccessful", js.undefined)
    
    @scala.inline
    def setSetSynchronous(value: /* synchronous */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSynchronous", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSynchronousUndefined: Self = StObject.set(x, "setSynchronous", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    @scala.inline
    def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setWithCredentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWithCredentialsUndefined: Self = StObject.set(x, "setWithCredentials", js.undefined)
    
    @scala.inline
    def setSorters(value: Array): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
    
    @scala.inline
    def setWasSuccessful(value: () => Boolean): Self = StObject.set(x, "wasSuccessful", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWasSuccessfulUndefined: Self = StObject.set(x, "wasSuccessful", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
