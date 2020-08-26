package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.util.IGrouper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOperation extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.native
  /** [Method] Checks whether this operation should cause writing to occur
    * @returns Boolean Whether the operation should cause a write to occur.
    */
  var allowWrite: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Ext.data.Batch) */
  var batch: js.UndefOr[IBatch] = js.native
  /** [Config Option] (Function) */
  var callback: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.util.Filter[]) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of action
    * @returns String
    */
  var getAction: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of addRecords
    * @returns Boolean
    */
  var getAddRecords: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of batch
    * @returns Ext.data.Batch
    */
  var getBatch: js.UndefOr[js.Function0[IBatch]] = js.native
  /** [Method] Returns the value of callback
    * @returns Function
    */
  var getCallback: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the error string or object that was set using setException
    * @returns String/Object The error object.
    */
  var getError: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of filters
    * @returns Ext.util.Filter[]
    */
  var getFilters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of grouper
    * @returns Ext.util.Grouper
    */
  var getGrouper: js.UndefOr[js.Function0[IGrouper]] = js.native
  /** [Method] Returns the value of limit
    * @returns Number
    */
  var getLimit: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of model
    * @returns Ext.data.Model
    */
  var getModel: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Returns the value of node
    * @returns Object
    */
  var getNode: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of page
    * @returns Object
    */
  var getPage: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of params
    * @returns Object
    */
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of request
    * @returns Ext.data.Request
    */
  var getRequest: js.UndefOr[js.Function0[IRequest]] = js.native
  /** [Method] Returns the value of response
    * @returns Object
    */
  var getResponse: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of resultSet
    * @returns Ext.data.ResultSet
    */
  var getResultSet: js.UndefOr[js.Function0[IResultSet]] = js.native
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sorters
    * @returns Ext.util.Sorter[]
    */
  var getSorters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of start
    * @returns Number
    */
  var getStart: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of synchronous
    * @returns Boolean
    */
  var getSynchronous: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of url
    * @returns Object
    */
  var getUrl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of withCredentials
    * @returns Boolean
    */
  var getWithCredentials: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var group: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.util.Grouper) */
  var grouper: js.UndefOr[IGrouper] = js.native
  /** [Method] Returns true if this Operation encountered an exception see also getError
    * @returns Boolean true if there was an exception.
    */
  var hasException: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been completed
    * @returns Boolean true if the Operation is complete
    */
  var isComplete: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started but has not yet completed
    * @returns Boolean true if the Operation is currently running
    */
  var isRunning: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if the Operation has been started
    * @returns Boolean true if the Operation has started
    */
  var isStarted: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.data.Model) */
  var model: js.UndefOr[IModel] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Array) */
  var records: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.data.Request) */
  var request: js.UndefOr[IRequest] = js.native
  /** [Config Option] (Object) */
  var response: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.data.ResultSet) */
  var resultSet: js.UndefOr[IResultSet] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of action
    * @param action String The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of addRecords
    * @param addRecords Boolean The new value.
    */
  var setAddRecords: js.UndefOr[js.Function1[/* addRecords */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of batch
    * @param batch Ext.data.Batch The new value.
    */
  var setBatch: js.UndefOr[js.Function1[/* batch */ js.UndefOr[IBatch], Unit]] = js.native
  /** [Method] Sets the value of callback
    * @param callback Function The new value.
    */
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Marks the Operation as completed  */
  var setCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as having experienced an exception
    * @param error String/Object error string/object
    */
  var setException: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of filters
    * @param filters Ext.util.Filter[] The new value.
    */
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of grouper
    * @param grouper Ext.util.Grouper The new value.
    */
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[IGrouper], Unit]] = js.native
  /** [Method] Sets the value of limit
    * @param limit Number The new value.
    */
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of model
    * @param model Ext.data.Model The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[IModel], Unit]] = js.native
  /** [Method] Sets the value of node
    * @param node Object The new value.
    */
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of page
    * @param page Object The new value.
    */
  var setPage: js.UndefOr[js.Function1[/* page */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of params
    * @param params Object The new value.
    */
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of records
    * @param records Array The new value.
    */
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of request
    * @param request Ext.data.Request The new value.
    */
  var setRequest: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], Unit]] = js.native
  /** [Method] Sets the value of response
    * @param response Object The new value.
    */
  var setResponse: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of resultSet
    * @param resultSet Ext.data.ResultSet The new value.
    */
  var setResultSet: js.UndefOr[js.Function1[/* resultSet */ js.UndefOr[IResultSet], Unit]] = js.native
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of sorters
    * @param sorters Ext.util.Sorter[] The new value.
    */
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of start
    * @param start Number The new value.
    */
  var setStart: js.UndefOr[js.Function1[/* start */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Marks the Operation as started  */
  var setStarted: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the Operation as successful  */
  var setSuccessful: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of synchronous
    * @param synchronous Boolean The new value.
    */
  var setSynchronous: js.UndefOr[js.Function1[/* synchronous */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of url
    * @param url Object The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of withCredentials
    * @param withCredentials Boolean The new value.
    */
  var setWithCredentials: js.UndefOr[js.Function1[/* withCredentials */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Ext.util.Sorter[]) */
  var sorters: js.UndefOr[Array] = js.native
  /** [Config Option] (Number) */
  var start: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var synchronous: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the Operation has completed and was successful
    * @returns Boolean true if successful
    */
  var wasSuccessful: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object IOperation {
  @scala.inline
  def apply(): IOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOperation]
  }
  @scala.inline
  implicit class IOperationOps[Self <: IOperation] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAllowWrite(value: () => Boolean): Self = this.set("allowWrite", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAllowWrite: Self = this.set("allowWrite", js.undefined)
    @scala.inline
    def setBatch(value: IBatch): Self = this.set("batch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    @scala.inline
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setFilters(value: Array): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGetAction(value: () => String): Self = this.set("getAction", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAction: Self = this.set("getAction", js.undefined)
    @scala.inline
    def setGetAddRecords(value: () => Boolean): Self = this.set("getAddRecords", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAddRecords: Self = this.set("getAddRecords", js.undefined)
    @scala.inline
    def setGetBatch(value: () => IBatch): Self = this.set("getBatch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBatch: Self = this.set("getBatch", js.undefined)
    @scala.inline
    def setGetCallback(value: () => _): Self = this.set("getCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCallback: Self = this.set("getCallback", js.undefined)
    @scala.inline
    def setGetError(value: () => _): Self = this.set("getError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetError: Self = this.set("getError", js.undefined)
    @scala.inline
    def setGetFilters(value: () => Array): Self = this.set("getFilters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFilters: Self = this.set("getFilters", js.undefined)
    @scala.inline
    def setGetGrouper(value: () => IGrouper): Self = this.set("getGrouper", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGrouper: Self = this.set("getGrouper", js.undefined)
    @scala.inline
    def setGetLimit(value: () => Double): Self = this.set("getLimit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLimit: Self = this.set("getLimit", js.undefined)
    @scala.inline
    def setGetModel(value: () => IModel): Self = this.set("getModel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetModel: Self = this.set("getModel", js.undefined)
    @scala.inline
    def setGetNode(value: () => _): Self = this.set("getNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNode: Self = this.set("getNode", js.undefined)
    @scala.inline
    def setGetPage(value: () => _): Self = this.set("getPage", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPage: Self = this.set("getPage", js.undefined)
    @scala.inline
    def setGetParams(value: () => _): Self = this.set("getParams", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetParams: Self = this.set("getParams", js.undefined)
    @scala.inline
    def setGetRequest(value: () => IRequest): Self = this.set("getRequest", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRequest: Self = this.set("getRequest", js.undefined)
    @scala.inline
    def setGetResponse(value: () => _): Self = this.set("getResponse", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetResponse: Self = this.set("getResponse", js.undefined)
    @scala.inline
    def setGetResultSet(value: () => IResultSet): Self = this.set("getResultSet", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetResultSet: Self = this.set("getResultSet", js.undefined)
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    @scala.inline
    def setGetSorters(value: () => Array): Self = this.set("getSorters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSorters: Self = this.set("getSorters", js.undefined)
    @scala.inline
    def setGetStart(value: () => Double): Self = this.set("getStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStart: Self = this.set("getStart", js.undefined)
    @scala.inline
    def setGetSynchronous(value: () => Boolean): Self = this.set("getSynchronous", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSynchronous: Self = this.set("getSynchronous", js.undefined)
    @scala.inline
    def setGetUrl(value: () => _): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUrl: Self = this.set("getUrl", js.undefined)
    @scala.inline
    def setGetWithCredentials(value: () => Boolean): Self = this.set("getWithCredentials", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWithCredentials: Self = this.set("getWithCredentials", js.undefined)
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGrouper(value: IGrouper): Self = this.set("grouper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouper: Self = this.set("grouper", js.undefined)
    @scala.inline
    def setHasException(value: () => Boolean): Self = this.set("hasException", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasException: Self = this.set("hasException", js.undefined)
    @scala.inline
    def setIsComplete(value: () => Boolean): Self = this.set("isComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsComplete: Self = this.set("isComplete", js.undefined)
    @scala.inline
    def setIsRunning(value: () => Boolean): Self = this.set("isRunning", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsRunning: Self = this.set("isRunning", js.undefined)
    @scala.inline
    def setIsStarted(value: () => Boolean): Self = this.set("isStarted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsStarted: Self = this.set("isStarted", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRecords(value: Array): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
    @scala.inline
    def setRequest(value: IRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResultSet(value: IResultSet): Self = this.set("resultSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultSet: Self = this.set("resultSet", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSetAction(value: /* action */ js.UndefOr[String] => Unit): Self = this.set("setAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAction: Self = this.set("setAction", js.undefined)
    @scala.inline
    def setSetAddRecords(value: /* addRecords */ js.UndefOr[Boolean] => Unit): Self = this.set("setAddRecords", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAddRecords: Self = this.set("setAddRecords", js.undefined)
    @scala.inline
    def setSetBatch(value: /* batch */ js.UndefOr[IBatch] => Unit): Self = this.set("setBatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBatch: Self = this.set("setBatch", js.undefined)
    @scala.inline
    def setSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = this.set("setCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCallback: Self = this.set("setCallback", js.undefined)
    @scala.inline
    def setSetCompleted(value: () => Unit): Self = this.set("setCompleted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetCompleted: Self = this.set("setCompleted", js.undefined)
    @scala.inline
    def setSetException(value: /* error */ js.UndefOr[js.Any] => Unit): Self = this.set("setException", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetException: Self = this.set("setException", js.undefined)
    @scala.inline
    def setSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = this.set("setFilters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilters: Self = this.set("setFilters", js.undefined)
    @scala.inline
    def setSetGrouper(value: /* grouper */ js.UndefOr[IGrouper] => Unit): Self = this.set("setGrouper", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGrouper: Self = this.set("setGrouper", js.undefined)
    @scala.inline
    def setSetLimit(value: /* limit */ js.UndefOr[Double] => Unit): Self = this.set("setLimit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLimit: Self = this.set("setLimit", js.undefined)
    @scala.inline
    def setSetModel(value: /* model */ js.UndefOr[IModel] => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetModel: Self = this.set("setModel", js.undefined)
    @scala.inline
    def setSetNode(value: /* node */ js.UndefOr[js.Any] => Unit): Self = this.set("setNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNode: Self = this.set("setNode", js.undefined)
    @scala.inline
    def setSetPage(value: /* page */ js.UndefOr[js.Any] => Unit): Self = this.set("setPage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPage: Self = this.set("setPage", js.undefined)
    @scala.inline
    def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("setParams", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetParams: Self = this.set("setParams", js.undefined)
    @scala.inline
    def setSetRecords(value: /* records */ js.UndefOr[Array] => Unit): Self = this.set("setRecords", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRecords: Self = this.set("setRecords", js.undefined)
    @scala.inline
    def setSetRequest(value: /* request */ js.UndefOr[IRequest] => Unit): Self = this.set("setRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRequest: Self = this.set("setRequest", js.undefined)
    @scala.inline
    def setSetResponse(value: /* response */ js.UndefOr[js.Any] => Unit): Self = this.set("setResponse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetResponse: Self = this.set("setResponse", js.undefined)
    @scala.inline
    def setSetResultSet(value: /* resultSet */ js.UndefOr[IResultSet] => Unit): Self = this.set("setResultSet", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetResultSet: Self = this.set("setResultSet", js.undefined)
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
    @scala.inline
    def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = this.set("setSorters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSorters: Self = this.set("setSorters", js.undefined)
    @scala.inline
    def setSetStart(value: /* start */ js.UndefOr[Double] => Unit): Self = this.set("setStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStart: Self = this.set("setStart", js.undefined)
    @scala.inline
    def setSetStarted(value: () => Unit): Self = this.set("setStarted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetStarted: Self = this.set("setStarted", js.undefined)
    @scala.inline
    def setSetSuccessful(value: () => Unit): Self = this.set("setSuccessful", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetSuccessful: Self = this.set("setSuccessful", js.undefined)
    @scala.inline
    def setSetSynchronous(value: /* synchronous */ js.UndefOr[Boolean] => Unit): Self = this.set("setSynchronous", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSynchronous: Self = this.set("setSynchronous", js.undefined)
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    @scala.inline
    def setSetWithCredentials(value: /* withCredentials */ js.UndefOr[Boolean] => Unit): Self = this.set("setWithCredentials", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWithCredentials: Self = this.set("setWithCredentials", js.undefined)
    @scala.inline
    def setSorters(value: Array): Self = this.set("sorters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorters: Self = this.set("sorters", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
    @scala.inline
    def setWasSuccessful(value: () => Boolean): Self = this.set("wasSuccessful", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWasSuccessful: Self = this.set("wasSuccessful", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

