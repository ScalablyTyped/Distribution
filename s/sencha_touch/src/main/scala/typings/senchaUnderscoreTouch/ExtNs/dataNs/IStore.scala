package typings.senchaUnderscoreTouch.ExtNs.dataNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.IEvented
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import typings.senchaUnderscoreTouch.ExtNs.utilNs.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStore extends IEvented {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Uses the configured reader to convert the data into records and adds it to the Store
  		* @param data Object[] Array of data to load
  		*/
  var addData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] We are using applyData so that we can return nothing and prevent the this data property to be overridden
  		* @param data Array/Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.undefined
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record you want to get the average for.
  		* @returns Number The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.undefined
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean true to clear silently without firing the refresh event.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var destroyRemovedRecords: js.UndefOr[Boolean] = js.undefined
  /** [Method] Calls the specified function for each of the Records in the cache
  		* @param fn Function The function to call. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Record in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object[]/Ext.util.Collection) */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string.
  		* @param value String value to filter by (only if using a property string as the first argument).
  		* @param anyMatch Boolean true to allow any match, false to anchor regex beginning with ^.
  		* @param caseSensitive Boolean true to make the filtering regex case sensitive.
  		*/
  var filter: js.UndefOr[
    js.Function4[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Filter by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Number The matched index or -1
  		*/
  var find: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.undefined
  /** [Method] Find the index of the first matching Record in this Store by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value Object The value to match the field against.
  		* @param startIndex Number The index to start searching at.
  		* @returns Number The matched index or -1.
  		*/
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  /** [Method] Finds the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at.
  		* @param anyMatch Boolean true to match any part of the string, not just the beginning.
  		* @param caseSensitive Boolean true for case sensitive comparison.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex).
  		* @returns Ext.data.Model The matched record or null.
  		*/
  var findRecord: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IModel
    ]
  ] = js.undefined
  /** [Method] Convenience function for getting the first model instance in the store
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined.
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the number of all cached records including the ones currently filtered
  		* @returns Number The number of all Records in the Store's cache.
  		*/
  var getAllCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model/undefined The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the value of autoLoad
  		* @returns Boolean/Object
  		*/
  var getAutoLoad: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of autoSync
  		* @returns Boolean
  		*/
  var getAutoSync: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of buffered
  		* @returns Boolean
  		*/
  var getBuffered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Get the Record with the specified id
  		* @param id String The id of the Record to find.
  		* @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the value of clearOnPageLoad
  		* @returns Boolean
  		*/
  var getClearOnPageLoad: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Gets the number of cached records
  		* @returns Number The number of Records in the Store's cache.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object[]/Ext.data.Model[]
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of destroyRemovedRecords
  		* @returns Boolean
  		*/
  var getDestroyRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Object[]/Ext.util.Collection
  		*/
  var getFields: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of getGroupString
  		* @returns Function
  		*/
  var getGetGroupString: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of groupDir
  		* @returns String
  		*/
  var getGroupDir: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of groupField
  		* @returns String
  		*/
  var getGroupField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Function) */
  var getGroupString: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of grouper
  		* @returns Object
  		*/
  var getGrouper: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an array containing the result of applying the grouper to the records in this store
  		* @param groupName String Pass in an optional groupName argument to access a specific group as defined by grouper.
  		* @returns Object/Object[] The grouped data.
  		*/
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the value of model
  		* @returns String
  		*/
  var getModel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of modelDefaults
  		* @returns Object
  		*/
  var getModelDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns all Model instances that are either currently a phantom e g
  		* @returns Ext.data.Model[] The Model instances.
  		*/
  var getNewRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of pageSize
  		* @returns Number
  		*/
  var getPageSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  var getPlugins: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of proxy
  		* @returns String/Ext.data.proxy.Proxy/Object
  		*/
  var getProxy: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns a range of Records between specified indices
  		* @param startIndex Number The starting index.
  		* @param endIndex Number The ending index (defaults to the last Record in the Store).
  		* @returns Ext.data.Model[] An array of Records.
  		*/
  var getRange: js.UndefOr[
    js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
  ] = js.undefined
  /** [Method] Returns the value of remoteFilter
  		* @returns Boolean
  		*/
  var getRemoteFilter: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of remoteGroup
  		* @returns Boolean
  		*/
  var getRemoteGroup: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of remoteSort
  		* @returns Boolean
  		*/
  var getRemoteSort: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
  		* @returns Ext.data.Model[] The removed Model instances.
  		*/
  var getRemovedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of storeId
  		* @returns String
  		*/
  var getStoreId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of syncRemovedRecords
  		* @returns Boolean
  		*/
  var getSyncRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
  		* @returns Ext.data.Model[] The updated Model instances.
  		*/
  var getUpdatedRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var grouper: js.UndefOr[js.Any] = js.undefined
  /** [Method] Get the index within the cache of the passed Record
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.undefined
  /** [Method] Get the index within the cache of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], Double]] = js.undefined
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the cache.
  		* @returns Object
  		*/
  var insert: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], _]] = js.undefined
  /** [Method] Returns true if the Store is set to autoLoad or is a type which loads upon instantiation
  		* @returns Boolean
  		*/
  var isAutoLoading: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] This method tells you if this store has a grouper defined on it
  		* @returns Boolean true if this store has a grouper defined.
  		*/
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Store has been loaded
  		* @returns Boolean true if the Store has been loaded.
  		*/
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Store is currently performing a load operation
  		* @returns Boolean true if the Store is currently loading.
  		*/
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this store is currently sorted
  		* @returns Boolean
  		*/
  var isSorted: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience function for getting the last model instance in the store
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined.
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Loads data into the Store via the configured proxy
  		* @param options Object/Function config object, passed into the Ext.data.Operation object before loading.
  		* @param scope Object Scope for the function.
  		* @returns Object
  		*/
  var load: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Loads an array of data straight into the Store
  		* @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
  		* @param page Number The number of the page to load.
  		* @param options Object See options for load.
  		* @param scope Object
  		*/
  var loadPage: js.UndefOr[
    js.Function3[
      /* page */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added.
  		*/
  var loadRecords: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record.
  		* @returns Object/undefined The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Config Option] (String) */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load.
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load.
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Method] Query the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records.
  		*/
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes the given record from the Store firing the removerecords event passing all the instances that are removed
  		* @param records Ext.data.Model/Ext.data.Model[] Model instance or array of instances to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Remove all items from the store
  		* @param silent Boolean Prevent the clear event from being fired.
  		*/
  var removeAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Removes the model instance at the given index
  		* @param index Number The record index.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of autoLoad
  		* @param autoLoad Boolean/Object The new value.
  		*/
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of autoSync
  		* @param autoSync Boolean The new value.
  		*/
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of buffered
  		* @param buffered Boolean The new value.
  		*/
  var setBuffered: js.UndefOr[js.Function1[/* buffered */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of clearOnPageLoad
  		* @param clearOnPageLoad Boolean The new value.
  		*/
  var setClearOnPageLoad: js.UndefOr[js.Function1[/* clearOnPageLoad */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object[]/Ext.data.Model[] The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of destroyRemovedRecords
  		* @param destroyRemovedRecords Boolean The new value.
  		*/
  var setDestroyRemovedRecords: js.UndefOr[js.Function1[/* destroyRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Object[]/Ext.util.Collection The new value.
  		* @returns Object Ext.util.Collection
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Object[] The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of getGroupString
  		* @param getGroupString Function The new value.
  		*/
  var setGetGroupString: js.UndefOr[js.Function1[/* getGroupString */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of groupDir
  		* @param groupDir String The new value.
  		*/
  var setGroupDir: js.UndefOr[js.Function1[/* groupDir */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of groupField
  		* @param groupField String The new value.
  		*/
  var setGroupField: js.UndefOr[js.Function1[/* groupField */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of grouper
  		* @param grouper Object The new value.
  		*/
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model String The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of modelDefaults
  		* @param modelDefaults Object The new value.
  		*/
  var setModelDefaults: js.UndefOr[js.Function1[/* modelDefaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of proxy
  		* @param proxy String/Ext.data.proxy.Proxy/Object The new value.
  		*/
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of remoteFilter
  		* @param remoteFilter Boolean The new value.
  		*/
  var setRemoteFilter: js.UndefOr[js.Function1[/* remoteFilter */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of remoteGroup
  		* @param remoteGroup Boolean The new value.
  		*/
  var setRemoteGroup: js.UndefOr[js.Function1[/* remoteGroup */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of remoteSort
  		* @param remoteSort Boolean The new value.
  		*/
  var setRemoteSort: js.UndefOr[js.Function1[/* remoteSort */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of sorters
  		* @param sorters Object[] The new value.
  		*/
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of storeId
  		* @param storeId String The new value.
  		*/
  var setStoreId: js.UndefOr[js.Function1[/* storeId */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of syncRemovedRecords
  		* @param syncRemovedRecords Boolean The new value.
  		*/
  var setSyncRemovedRecords: js.UndefOr[js.Function1[/* syncRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param defaultDirection String The default overall direction to sort the data by.
  		* @param where String This can be either 'prepend' or 'append'. If you leave this undefined it will clear the current sorters.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      /* where */ js.UndefOr[java.lang.String], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sums the value of property for each record between start and end and returns the result
  		* @param field String The field in each record.
  		* @returns Number The sum.
  		*/
  var sum: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], Double]] = js.undefined
  /** [Method] Synchronizes the Store with its Proxy
  		* @param options Object
  		* @returns Object
  		*/
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var syncRemovedRecords: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var totalCount: js.UndefOr[Double] = js.undefined
}

object IStore {
  @scala.inline
  def apply(
    add: /* model */ js.UndefOr[js.Any] => Array = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addData: /* data */ js.UndefOr[Array] => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    applyData: /* data */ js.UndefOr[js.Any] => Unit = null,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    average: /* field */ js.UndefOr[java.lang.String] => Double = null,
    bubbleEvents: js.Any = null,
    buffered: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearFilter: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    clearListeners: () => Unit = null,
    clearOnPageLoad: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    currentPage: Int | Double = null,
    data: js.Any = null,
    destroy: () => Unit = null,
    destroyRemovedRecords: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fields: js.Any = null,
    filter: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Unit = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    filters: Array = null,
    find: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double = null,
    findExact: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double = null,
    findRecord: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    first: () => _ = null,
    getAllCount: () => Double = null,
    getAt: /* index */ js.UndefOr[Double] => _ = null,
    getAutoLoad: () => _ = null,
    getAutoSync: () => Boolean = null,
    getBubbleEvents: () => _ = null,
    getBuffered: () => Boolean = null,
    getById: /* id */ js.UndefOr[java.lang.String] => _ = null,
    getClearOnPageLoad: () => Boolean = null,
    getCount: () => Double = null,
    getData: () => _ = null,
    getDestroyRemovedRecords: () => Boolean = null,
    getFields: () => _ = null,
    getGetGroupString: () => _ = null,
    getGroupDir: () => java.lang.String = null,
    getGroupField: () => java.lang.String = null,
    getGroupString: js.Any = null,
    getGrouper: () => _ = null,
    getGroups: /* groupName */ js.UndefOr[java.lang.String] => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getListeners: () => _ = null,
    getModel: () => java.lang.String = null,
    getModelDefaults: () => _ = null,
    getNewRecords: () => Array = null,
    getPageSize: () => Double = null,
    getParams: () => _ = null,
    getPlugins: () => _ = null,
    getProxy: () => _ = null,
    getRange: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array = null,
    getRemoteFilter: () => Boolean = null,
    getRemoteGroup: () => Boolean = null,
    getRemoteSort: () => Boolean = null,
    getRemovedRecords: () => Array = null,
    getStoreId: () => java.lang.String = null,
    getSyncRemovedRecords: () => Boolean = null,
    getTotalCount: () => Double = null,
    getUpdatedRecords: () => Array = null,
    groupDir: java.lang.String = null,
    groupField: java.lang.String = null,
    grouper: js.Any = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    indexOf: /* record */ js.UndefOr[IModel] => Double = null,
    indexOfId: /* id */ js.UndefOr[java.lang.String] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insert: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => _ = null,
    isAutoLoading: () => Boolean = null,
    isFiltered: () => Boolean = null,
    isGrouped: () => Boolean = null,
    isLoaded: () => Boolean = null,
    isLoading: () => Boolean = null,
    isSorted: () => Boolean = null,
    last: () => _ = null,
    listeners: js.Any = null,
    load: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    loadData: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit = null,
    loadPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    loadRecords: /* model */ js.UndefOr[js.Any] => Array = null,
    max: /* field */ js.UndefOr[java.lang.String] => _ = null,
    min: /* field */ js.UndefOr[java.lang.String] => _ = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    nextPage: /* options */ js.UndefOr[js.Any] => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    pageSize: Int | Double = null,
    params: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    previousPage: /* options */ js.UndefOr[js.Any] => Unit = null,
    proxy: js.Any = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    remoteFilter: js.UndefOr[Boolean] = js.undefined,
    remoteGroup: js.UndefOr[Boolean] = js.undefined,
    remoteSort: js.UndefOr[Boolean] = js.undefined,
    remove: /* records */ js.UndefOr[js.Any] => Unit = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeAll: /* silent */ js.UndefOr[Boolean] => Unit = null,
    removeAt: /* index */ js.UndefOr[Double] => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setAutoLoad: /* autoLoad */ js.UndefOr[js.Any] => Unit = null,
    setAutoSync: /* autoSync */ js.UndefOr[Boolean] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setBuffered: /* buffered */ js.UndefOr[Boolean] => Unit = null,
    setClearOnPageLoad: /* clearOnPageLoad */ js.UndefOr[Boolean] => Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => Unit = null,
    setDestroyRemovedRecords: /* destroyRemovedRecords */ js.UndefOr[Boolean] => Unit = null,
    setFields: /* fields */ js.UndefOr[js.Any] => _ = null,
    setFilters: /* filters */ js.UndefOr[Array] => Unit = null,
    setGetGroupString: /* getGroupString */ js.UndefOr[js.Any] => Unit = null,
    setGroupDir: /* groupDir */ js.UndefOr[java.lang.String] => Unit = null,
    setGroupField: /* groupField */ js.UndefOr[java.lang.String] => Unit = null,
    setGrouper: /* grouper */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setModel: /* model */ js.UndefOr[java.lang.String] => Unit = null,
    setModelDefaults: /* modelDefaults */ js.UndefOr[js.Any] => Unit = null,
    setPageSize: /* pageSize */ js.UndefOr[Double] => Unit = null,
    setParams: /* params */ js.UndefOr[js.Any] => Unit = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => Unit = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => Unit = null,
    setRemoteFilter: /* remoteFilter */ js.UndefOr[Boolean] => Unit = null,
    setRemoteGroup: /* remoteGroup */ js.UndefOr[Boolean] => Unit = null,
    setRemoteSort: /* remoteSort */ js.UndefOr[Boolean] => Unit = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Unit = null,
    setStoreId: /* storeId */ js.UndefOr[java.lang.String] => Unit = null,
    setSyncRemovedRecords: /* syncRemovedRecords */ js.UndefOr[Boolean] => Unit = null,
    setTotalCount: /* totalCount */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String], /* where */ js.UndefOr[java.lang.String]) => Unit = null,
    sorters: Array = null,
    statics: js.Any = null,
    storeId: java.lang.String = null,
    sum: /* field */ js.UndefOr[java.lang.String] => Double = null,
    suspendEvents: () => Unit = null,
    sync: /* options */ js.UndefOr[js.Any] => _ = null,
    syncRemovedRecords: js.UndefOr[Boolean] = js.undefined,
    totalCount: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addData != null) __obj.updateDynamic("addData")(js.Any.fromFunction1(addData))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (applyData != null) __obj.updateDynamic("applyData")(js.Any.fromFunction1(applyData))
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (average != null) __obj.updateDynamic("average")(js.Any.fromFunction1(average))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(js.Any.fromFunction1(clearFilter))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad)
    if (config != null) __obj.updateDynamic("config")(config)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(destroyRemovedRecords)) __obj.updateDynamic("destroyRemovedRecords")(destroyRemovedRecords)
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4(filter))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction6(find))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction3(findBy))
    if (findExact != null) __obj.updateDynamic("findExact")(js.Any.fromFunction3(findExact))
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction6(findRecord))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction0(first))
    if (getAllCount != null) __obj.updateDynamic("getAllCount")(js.Any.fromFunction0(getAllCount))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getAutoLoad != null) __obj.updateDynamic("getAutoLoad")(js.Any.fromFunction0(getAutoLoad))
    if (getAutoSync != null) __obj.updateDynamic("getAutoSync")(js.Any.fromFunction0(getAutoSync))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getBuffered != null) __obj.updateDynamic("getBuffered")(js.Any.fromFunction0(getBuffered))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction1(getById))
    if (getClearOnPageLoad != null) __obj.updateDynamic("getClearOnPageLoad")(js.Any.fromFunction0(getClearOnPageLoad))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDestroyRemovedRecords != null) __obj.updateDynamic("getDestroyRemovedRecords")(js.Any.fromFunction0(getDestroyRemovedRecords))
    if (getFields != null) __obj.updateDynamic("getFields")(js.Any.fromFunction0(getFields))
    if (getGetGroupString != null) __obj.updateDynamic("getGetGroupString")(js.Any.fromFunction0(getGetGroupString))
    if (getGroupDir != null) __obj.updateDynamic("getGroupDir")(js.Any.fromFunction0(getGroupDir))
    if (getGroupField != null) __obj.updateDynamic("getGroupField")(js.Any.fromFunction0(getGroupField))
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(getGroupString)
    if (getGrouper != null) __obj.updateDynamic("getGrouper")(js.Any.fromFunction0(getGrouper))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction1(getGroups))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getModelDefaults != null) __obj.updateDynamic("getModelDefaults")(js.Any.fromFunction0(getModelDefaults))
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(js.Any.fromFunction0(getNewRecords))
    if (getPageSize != null) __obj.updateDynamic("getPageSize")(js.Any.fromFunction0(getPageSize))
    if (getParams != null) __obj.updateDynamic("getParams")(js.Any.fromFunction0(getParams))
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(js.Any.fromFunction0(getPlugins))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2(getRange))
    if (getRemoteFilter != null) __obj.updateDynamic("getRemoteFilter")(js.Any.fromFunction0(getRemoteFilter))
    if (getRemoteGroup != null) __obj.updateDynamic("getRemoteGroup")(js.Any.fromFunction0(getRemoteGroup))
    if (getRemoteSort != null) __obj.updateDynamic("getRemoteSort")(js.Any.fromFunction0(getRemoteSort))
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(js.Any.fromFunction0(getRemovedRecords))
    if (getStoreId != null) __obj.updateDynamic("getStoreId")(js.Any.fromFunction0(getStoreId))
    if (getSyncRemovedRecords != null) __obj.updateDynamic("getSyncRemovedRecords")(js.Any.fromFunction0(getSyncRemovedRecords))
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(js.Any.fromFunction0(getTotalCount))
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(js.Any.fromFunction0(getUpdatedRecords))
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir)
    if (groupField != null) __obj.updateDynamic("groupField")(groupField)
    if (grouper != null) __obj.updateDynamic("grouper")(grouper)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1(indexOfId))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (isAutoLoading != null) __obj.updateDynamic("isAutoLoading")(js.Any.fromFunction0(isAutoLoading))
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(js.Any.fromFunction0(isFiltered))
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(js.Any.fromFunction0(isGrouped))
    if (isLoaded != null) __obj.updateDynamic("isLoaded")(js.Any.fromFunction0(isLoaded))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction0(isLoading))
    if (isSorted != null) __obj.updateDynamic("isSorted")(js.Any.fromFunction0(isSorted))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction0(last))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2(load))
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction2(loadData))
    if (loadPage != null) __obj.updateDynamic("loadPage")(js.Any.fromFunction3(loadPage))
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(js.Any.fromFunction1(loadRecords))
    if (max != null) __obj.updateDynamic("max")(js.Any.fromFunction1(max))
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction1(min))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (nextPage != null) __obj.updateDynamic("nextPage")(js.Any.fromFunction1(nextPage))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (previousPage != null) __obj.updateDynamic("previousPage")(js.Any.fromFunction1(previousPage))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1(removeAt))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAutoLoad != null) __obj.updateDynamic("setAutoLoad")(js.Any.fromFunction1(setAutoLoad))
    if (setAutoSync != null) __obj.updateDynamic("setAutoSync")(js.Any.fromFunction1(setAutoSync))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setBuffered != null) __obj.updateDynamic("setBuffered")(js.Any.fromFunction1(setBuffered))
    if (setClearOnPageLoad != null) __obj.updateDynamic("setClearOnPageLoad")(js.Any.fromFunction1(setClearOnPageLoad))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDestroyRemovedRecords != null) __obj.updateDynamic("setDestroyRemovedRecords")(js.Any.fromFunction1(setDestroyRemovedRecords))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1(setFields))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1(setFilters))
    if (setGetGroupString != null) __obj.updateDynamic("setGetGroupString")(js.Any.fromFunction1(setGetGroupString))
    if (setGroupDir != null) __obj.updateDynamic("setGroupDir")(js.Any.fromFunction1(setGroupDir))
    if (setGroupField != null) __obj.updateDynamic("setGroupField")(js.Any.fromFunction1(setGroupField))
    if (setGrouper != null) __obj.updateDynamic("setGrouper")(js.Any.fromFunction1(setGrouper))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1(setModel))
    if (setModelDefaults != null) __obj.updateDynamic("setModelDefaults")(js.Any.fromFunction1(setModelDefaults))
    if (setPageSize != null) __obj.updateDynamic("setPageSize")(js.Any.fromFunction1(setPageSize))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1(setParams))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1(setPlugins))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (setRemoteFilter != null) __obj.updateDynamic("setRemoteFilter")(js.Any.fromFunction1(setRemoteFilter))
    if (setRemoteGroup != null) __obj.updateDynamic("setRemoteGroup")(js.Any.fromFunction1(setRemoteGroup))
    if (setRemoteSort != null) __obj.updateDynamic("setRemoteSort")(js.Any.fromFunction1(setRemoteSort))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1(setSorters))
    if (setStoreId != null) __obj.updateDynamic("setStoreId")(js.Any.fromFunction1(setStoreId))
    if (setSyncRemovedRecords != null) __obj.updateDynamic("setSyncRemovedRecords")(js.Any.fromFunction1(setSyncRemovedRecords))
    if (setTotalCount != null) __obj.updateDynamic("setTotalCount")(js.Any.fromFunction1(setTotalCount))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction3(sort))
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction1(sum))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (!js.isUndefined(syncRemovedRecords)) __obj.updateDynamic("syncRemovedRecords")(syncRemovedRecords)
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IStore]
  }
}

