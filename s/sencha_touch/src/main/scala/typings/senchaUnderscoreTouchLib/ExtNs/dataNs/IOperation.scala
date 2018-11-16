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

