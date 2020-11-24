package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IEvented
import typings.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStore extends IEvented {
  
  /** [Method] Adds Model instance to the Store
    * @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
    * @returns Ext.data.Model[] The model instances that were added.
    */
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.native
  
  /** [Method] Uses the configured reader to convert the data into records and adds it to the Store
    * @param data Object[] Array of data to load
    */
  var addData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] We are using applyData so that we can return nothing and prevent the this data property to be overridden
    * @param data Array/Object
    */
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var autoLoad: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[Boolean] = js.native
  
  /** [Method] Gets the average value in the store
    * @param field String The field in each record you want to get the average for.
    * @returns Number The average value, if no items exist, 0.
    */
  var average: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.native
  
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.native
  
  /** [Method] Reverts to a view of the Record cache with no filtering applied
    * @param suppressEvent Boolean true to clear silently without firing the refresh event.
    */
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var destroyRemovedRecords: js.UndefOr[Boolean] = js.native
  
  /** [Method] Calls the specified function for each of the Records in the cache
    * @param fn Function The function to call. Returning false aborts and exits the iteration.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Record in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object[]/Ext.util.Collection) */
  var fields: js.UndefOr[js.Any] = js.native
  
  /** [Method] Filters the loaded set of records by a given set of filters
    * @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string.
    * @param value String value to filter by (only if using a property string as the first argument).
    * @param anyMatch Boolean true to allow any match, false to anchor regex beginning with ^.
    * @param caseSensitive Boolean true to make the filtering regex case sensitive.
    */
  var filter: js.UndefOr[
    js.Function4[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[String], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called. It will be passed the following parameters:
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
    */
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.native
  
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
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  
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
  ] = js.native
  
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
    * @param fieldName String The name of the Record field to test.
    * @param value Object The value to match the field against.
    * @param startIndex Number The index to start searching at.
    * @returns Number The matched index or -1.
    */
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  
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
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IModel
    ]
  ] = js.native
  
  /** [Method] Convenience function for getting the first model instance in the store
    * @returns Ext.data.Model/undefined The first model instance in the store, or undefined.
    */
  var first: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Gets the number of all cached records including the ones currently filtered
    * @returns Number The number of all Records in the Store's cache.
    */
  var getAllCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Get the Record at the specified index
    * @param index Number The index of the Record to find.
    * @returns Ext.data.Model/undefined The Record at the passed index. Returns undefined if not found.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Returns the value of autoLoad
    * @returns Boolean/Object
    */
  var getAutoLoad: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of autoSync
    * @returns Boolean
    */
  var getAutoSync: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of buffered
    * @returns Boolean
    */
  var getBuffered: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Get the Record with the specified id
    * @param id String The id of the Record to find.
    * @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
    */
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Returns the value of clearOnPageLoad
    * @returns Boolean
    */
  var getClearOnPageLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Gets the number of cached records
    * @returns Number The number of Records in the Store's cache.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of data
    * @returns Object[]/Ext.data.Model[]
    */
  var getData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of destroyRemovedRecords
    * @returns Boolean
    */
  var getDestroyRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of fields
    * @returns Object[]/Ext.util.Collection
    */
  var getFields: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of getGroupString
    * @returns Function
    */
  var getGetGroupString: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of groupDir
    * @returns String
    */
  var getGroupDir: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of groupField
    * @returns String
    */
  var getGroupField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Function) */
  var getGroupString: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the value of grouper
    * @returns Object
    */
  var getGrouper: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns an array containing the result of applying the grouper to the records in this store
    * @param groupName String Pass in an optional groupName argument to access a specific group as defined by grouper.
    * @returns Object/Object[] The grouped data.
    */
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Returns the value of model
    * @returns String
    */
  var getModel: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of modelDefaults
    * @returns Object
    */
  var getModelDefaults: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns all Model instances that are either currently a phantom e g
    * @returns Ext.data.Model[] The Model instances.
    */
  var getNewRecords: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of pageSize
    * @returns Number
    */
  var getPageSize: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of params
    * @returns Object
    */
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of plugins
    * @returns Object/Array
    */
  var getPlugins: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of proxy
    * @returns String/Ext.data.proxy.Proxy/Object
    */
  var getProxy: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns a range of Records between specified indices
    * @param startIndex Number The starting index.
    * @param endIndex Number The ending index (defaults to the last Record in the Store).
    * @returns Ext.data.Model[] An array of Records.
    */
  var getRange: js.UndefOr[
    js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
  ] = js.native
  
  /** [Method] Returns the value of remoteFilter
    * @returns Boolean
    */
  var getRemoteFilter: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of remoteGroup
    * @returns Boolean
    */
  var getRemoteGroup: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of remoteSort
    * @returns Boolean
    */
  var getRemoteSort: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns any records that have been removed from the store but not yet destroyed on the proxy
    * @returns Ext.data.Model[] The removed Model instances.
    */
  var getRemovedRecords: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of storeId
    * @returns String
    */
  var getStoreId: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of syncRemovedRecords
    * @returns Boolean
    */
  var getSyncRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of totalCount
    * @returns Number
    */
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns all Model instances that have been updated in the Store but not yet synchronized with the Proxy
    * @returns Ext.data.Model[] The updated Model instances.
    */
  var getUpdatedRecords: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.native
  
  /** [Config Option] (Object) */
  var grouper: js.UndefOr[js.Any] = js.native
  
  /** [Method] Get the index within the cache of the passed Record
    * @param record Ext.data.Model The Ext.data.Model object to find.
    * @returns Number The index of the passed Record. Returns -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
  
  /** [Method] Get the index within the cache of the Record with the passed id
    * @param id String The id of the Record to find.
    * @returns Number The index of the Record. Returns -1 if not found.
    */
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.native
  
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
    * @param index Number The start index at which to insert the passed Records.
    * @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the cache.
    * @returns Object
    */
  var insert: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], _]] = js.native
  
  /** [Method] Returns true if the Store is set to autoLoad or is a type which loads upon instantiation
    * @returns Boolean
    */
  var isAutoLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this store is currently filtered
    * @returns Boolean
    */
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] This method tells you if this store has a grouper defined on it
    * @returns Boolean true if this store has a grouper defined.
    */
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if the Store has been loaded
    * @returns Boolean true if the Store has been loaded.
    */
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if the Store is currently performing a load operation
    * @returns Boolean true if the Store is currently loading.
    */
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this store is currently sorted
    * @returns Boolean
    */
  var isSorted: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Convenience function for getting the last model instance in the store
    * @returns Ext.data.Model/undefined The last model instance in the store, or undefined.
    */
  var last: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Loads data into the Store via the configured proxy
    * @param options Object/Function config object, passed into the Ext.data.Operation object before loading.
    * @param scope Object Scope for the function.
    * @returns Object
    */
  var load: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.native
  
  /** [Method] Loads an array of data straight into the Store
    * @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
    * @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
    */
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
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
  ] = js.native
  
  /** [Method] Adds Model instance to the Store
    * @param model Ext.data.Model[]/Ext.data.Model... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
    * @returns Ext.data.Model[] The model instances that were added.
    */
  var loadRecords: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.native
  
  /** [Method] Gets the maximum value in the store
    * @param field String The field in each record.
    * @returns Object/undefined The maximum value, if no items exist, undefined.
    */
  var max: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Gets the minimum value in the store
    * @param field String The field in each record.
    * @returns Object/undefined The minimum value, if no items exist, undefined.
    */
  var min: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], _]] = js.native
  
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.native
  
  /** [Method] Loads the next page in the current data set
    * @param options Object See options for load.
    */
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.native
  
  /** [Method] Loads the previous page in the current data set
    * @param options Object See options for load.
    */
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String/Ext.data.proxy.Proxy/Object) */
  var proxy: js.UndefOr[js.Any] = js.native
  
  /** [Method] Query the cached records in this Store using a filtering function
    * @param fn Function The function to be called. It will be passed the following parameters:
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
    * @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records.
    */
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var remoteFilter: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var remoteSort: js.UndefOr[Boolean] = js.native
  
  /** [Method] Removes the given record from the Store firing the removerecords event passing all the instances that are removed
    * @param records Ext.data.Model/Ext.data.Model[] Model instance or array of instances to remove.
    */
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Remove all items from the store
    * @param silent Boolean Prevent the clear event from being fired.
    */
  var removeAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Removes the model instance at the given index
    * @param index Number The record index.
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of autoLoad
    * @param autoLoad Boolean/Object The new value.
    */
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of autoSync
    * @param autoSync Boolean The new value.
    */
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of buffered
    * @param buffered Boolean The new value.
    */
  var setBuffered: js.UndefOr[js.Function1[/* buffered */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of clearOnPageLoad
    * @param clearOnPageLoad Boolean The new value.
    */
  var setClearOnPageLoad: js.UndefOr[js.Function1[/* clearOnPageLoad */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of data
    * @param data Object[]/Ext.data.Model[] The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of destroyRemovedRecords
    * @param destroyRemovedRecords Boolean The new value.
    */
  var setDestroyRemovedRecords: js.UndefOr[js.Function1[/* destroyRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of fields
    * @param fields Object[]/Ext.util.Collection The new value.
    * @returns Object Ext.util.Collection
    */
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Sets the value of filters
    * @param filters Object[] The new value.
    */
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of getGroupString
    * @param getGroupString Function The new value.
    */
  var setGetGroupString: js.UndefOr[js.Function1[/* getGroupString */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of groupDir
    * @param groupDir String The new value.
    */
  var setGroupDir: js.UndefOr[js.Function1[/* groupDir */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of groupField
    * @param groupField String The new value.
    */
  var setGroupField: js.UndefOr[js.Function1[/* groupField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of grouper
    * @param grouper Object The new value.
    */
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of model
    * @param model String The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of modelDefaults
    * @param modelDefaults Object The new value.
    */
  var setModelDefaults: js.UndefOr[js.Function1[/* modelDefaults */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of pageSize
    * @param pageSize Number The new value.
    */
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of params
    * @param params Object The new value.
    */
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of plugins
    * @param plugins Object/Array The new value.
    */
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of proxy
    * @param proxy String/Ext.data.proxy.Proxy/Object The new value.
    */
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of remoteFilter
    * @param remoteFilter Boolean The new value.
    */
  var setRemoteFilter: js.UndefOr[js.Function1[/* remoteFilter */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of remoteGroup
    * @param remoteGroup Boolean The new value.
    */
  var setRemoteGroup: js.UndefOr[js.Function1[/* remoteGroup */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of remoteSort
    * @param remoteSort Boolean The new value.
    */
  var setRemoteSort: js.UndefOr[js.Function1[/* remoteSort */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of sorters
    * @param sorters Object[] The new value.
    */
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of storeId
    * @param storeId String The new value.
    */
  var setStoreId: js.UndefOr[js.Function1[/* storeId */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of syncRemovedRecords
    * @param syncRemovedRecords Boolean The new value.
    */
  var setSyncRemovedRecords: js.UndefOr[js.Function1[/* syncRemovedRecords */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of totalCount
    * @param totalCount Number The new value.
    */
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param defaultDirection String The default overall direction to sort the data by.
    * @param where String This can be either 'prepend' or 'append'. If you leave this undefined it will clear the current sorters.
    */
  var sort: js.UndefOr[
    js.Function3[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[String], 
      /* where */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Object[]) */
  var sorters: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String) */
  var storeId: js.UndefOr[String] = js.native
  
  /** [Method] Sums the value of property for each record between start and end and returns the result
    * @param field String The field in each record.
    * @returns Number The sum.
    */
  var sum: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.native
  
  /** [Method] Synchronizes the Store with its Proxy
    * @param options Object
    * @returns Object
    */
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (Boolean) */
  var syncRemovedRecords: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var totalCount: js.UndefOr[Double] = js.native
}
object IStore {
  
  @scala.inline
  def apply(): IStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStore]
  }
  
  @scala.inline
  implicit class IStoreOps[Self <: IStore] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: /* model */ js.UndefOr[js.Any] => Array): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAddData(value: /* data */ js.UndefOr[Array] => Unit): Self = this.set("addData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddData: Self = this.set("addData", js.undefined)
    
    @scala.inline
    def setApplyData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("applyData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteApplyData: Self = this.set("applyData", js.undefined)
    
    @scala.inline
    def setAutoLoad(value: js.Any): Self = this.set("autoLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLoad: Self = this.set("autoLoad", js.undefined)
    
    @scala.inline
    def setAutoSync(value: Boolean): Self = this.set("autoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSync: Self = this.set("autoSync", js.undefined)
    
    @scala.inline
    def setAverage(value: /* field */ js.UndefOr[String] => Double): Self = this.set("average", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    
    @scala.inline
    def setBuffered(value: Boolean): Self = this.set("buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffered: Self = this.set("buffered", js.undefined)
    
    @scala.inline
    def setClearFilter(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = this.set("clearFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearFilter: Self = this.set("clearFilter", js.undefined)
    
    @scala.inline
    def setClearOnPageLoad(value: Boolean): Self = this.set("clearOnPageLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnPageLoad: Self = this.set("clearOnPageLoad", js.undefined)
    
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDestroyRemovedRecords(value: Boolean): Self = this.set("destroyRemovedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyRemovedRecords: Self = this.set("destroyRemovedRecords", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("each", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    
    @scala.inline
    def setFields(value: js.Any): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    
    @scala.inline
    def setFilters(value: Array): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setFind(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("find", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    
    @scala.inline
    def setFindBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = this.set("findBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFindBy: Self = this.set("findBy", js.undefined)
    
    @scala.inline
    def setFindExact(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = this.set("findExact", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFindExact: Self = this.set("findExact", js.undefined)
    
    @scala.inline
    def setFindRecord(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel
    ): Self = this.set("findRecord", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteFindRecord: Self = this.set("findRecord", js.undefined)
    
    @scala.inline
    def setFirst(value: () => _): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setGetAllCount(value: () => Double): Self = this.set("getAllCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAllCount: Self = this.set("getAllCount", js.undefined)
    
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => _): Self = this.set("getAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAt: Self = this.set("getAt", js.undefined)
    
    @scala.inline
    def setGetAutoLoad(value: () => _): Self = this.set("getAutoLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoLoad: Self = this.set("getAutoLoad", js.undefined)
    
    @scala.inline
    def setGetAutoSync(value: () => Boolean): Self = this.set("getAutoSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoSync: Self = this.set("getAutoSync", js.undefined)
    
    @scala.inline
    def setGetBuffered(value: () => Boolean): Self = this.set("getBuffered", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBuffered: Self = this.set("getBuffered", js.undefined)
    
    @scala.inline
    def setGetById(value: /* id */ js.UndefOr[String] => _): Self = this.set("getById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetById: Self = this.set("getById", js.undefined)
    
    @scala.inline
    def setGetClearOnPageLoad(value: () => Boolean): Self = this.set("getClearOnPageLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetClearOnPageLoad: Self = this.set("getClearOnPageLoad", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    
    @scala.inline
    def setGetData(value: () => _): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetDestroyRemovedRecords(value: () => Boolean): Self = this.set("getDestroyRemovedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDestroyRemovedRecords: Self = this.set("getDestroyRemovedRecords", js.undefined)
    
    @scala.inline
    def setGetFields(value: () => _): Self = this.set("getFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFields: Self = this.set("getFields", js.undefined)
    
    @scala.inline
    def setGetGetGroupString(value: () => _): Self = this.set("getGetGroupString", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGetGroupString: Self = this.set("getGetGroupString", js.undefined)
    
    @scala.inline
    def setGetGroupDir(value: () => String): Self = this.set("getGroupDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGroupDir: Self = this.set("getGroupDir", js.undefined)
    
    @scala.inline
    def setGetGroupField(value: () => String): Self = this.set("getGroupField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGroupField: Self = this.set("getGroupField", js.undefined)
    
    @scala.inline
    def setGetGroupString(value: js.Any): Self = this.set("getGroupString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetGroupString: Self = this.set("getGroupString", js.undefined)
    
    @scala.inline
    def setGetGrouper(value: () => _): Self = this.set("getGrouper", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGrouper: Self = this.set("getGrouper", js.undefined)
    
    @scala.inline
    def setGetGroups(value: /* groupName */ js.UndefOr[String] => _): Self = this.set("getGroups", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetGroups: Self = this.set("getGroups", js.undefined)
    
    @scala.inline
    def setGetModel(value: () => String): Self = this.set("getModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetModel: Self = this.set("getModel", js.undefined)
    
    @scala.inline
    def setGetModelDefaults(value: () => _): Self = this.set("getModelDefaults", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetModelDefaults: Self = this.set("getModelDefaults", js.undefined)
    
    @scala.inline
    def setGetNewRecords(value: () => Array): Self = this.set("getNewRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNewRecords: Self = this.set("getNewRecords", js.undefined)
    
    @scala.inline
    def setGetPageSize(value: () => Double): Self = this.set("getPageSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPageSize: Self = this.set("getPageSize", js.undefined)
    
    @scala.inline
    def setGetParams(value: () => _): Self = this.set("getParams", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParams: Self = this.set("getParams", js.undefined)
    
    @scala.inline
    def setGetPlugins(value: () => _): Self = this.set("getPlugins", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPlugins: Self = this.set("getPlugins", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => _): Self = this.set("getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    
    @scala.inline
    def setGetRange(value: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array): Self = this.set("getRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetRange: Self = this.set("getRange", js.undefined)
    
    @scala.inline
    def setGetRemoteFilter(value: () => Boolean): Self = this.set("getRemoteFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRemoteFilter: Self = this.set("getRemoteFilter", js.undefined)
    
    @scala.inline
    def setGetRemoteGroup(value: () => Boolean): Self = this.set("getRemoteGroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRemoteGroup: Self = this.set("getRemoteGroup", js.undefined)
    
    @scala.inline
    def setGetRemoteSort(value: () => Boolean): Self = this.set("getRemoteSort", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRemoteSort: Self = this.set("getRemoteSort", js.undefined)
    
    @scala.inline
    def setGetRemovedRecords(value: () => Array): Self = this.set("getRemovedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRemovedRecords: Self = this.set("getRemovedRecords", js.undefined)
    
    @scala.inline
    def setGetStoreId(value: () => String): Self = this.set("getStoreId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStoreId: Self = this.set("getStoreId", js.undefined)
    
    @scala.inline
    def setGetSyncRemovedRecords(value: () => Boolean): Self = this.set("getSyncRemovedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSyncRemovedRecords: Self = this.set("getSyncRemovedRecords", js.undefined)
    
    @scala.inline
    def setGetTotalCount(value: () => Double): Self = this.set("getTotalCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTotalCount: Self = this.set("getTotalCount", js.undefined)
    
    @scala.inline
    def setGetUpdatedRecords(value: () => Array): Self = this.set("getUpdatedRecords", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUpdatedRecords: Self = this.set("getUpdatedRecords", js.undefined)
    
    @scala.inline
    def setGroupDir(value: String): Self = this.set("groupDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupDir: Self = this.set("groupDir", js.undefined)
    
    @scala.inline
    def setGroupField(value: String): Self = this.set("groupField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupField: Self = this.set("groupField", js.undefined)
    
    @scala.inline
    def setGrouper(value: js.Any): Self = this.set("grouper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouper: Self = this.set("grouper", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* record */ js.UndefOr[IModel] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    
    @scala.inline
    def setIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = this.set("indexOfId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOfId: Self = this.set("indexOfId", js.undefined)
    
    @scala.inline
    def setInsert(value: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => _): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setIsAutoLoading(value: () => Boolean): Self = this.set("isAutoLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsAutoLoading: Self = this.set("isAutoLoading", js.undefined)
    
    @scala.inline
    def setIsFiltered(value: () => Boolean): Self = this.set("isFiltered", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsFiltered: Self = this.set("isFiltered", js.undefined)
    
    @scala.inline
    def setIsGrouped(value: () => Boolean): Self = this.set("isGrouped", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsGrouped: Self = this.set("isGrouped", js.undefined)
    
    @scala.inline
    def setIsLoaded(value: () => Boolean): Self = this.set("isLoaded", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsLoaded: Self = this.set("isLoaded", js.undefined)
    
    @scala.inline
    def setIsLoading(value: () => Boolean): Self = this.set("isLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setIsSorted(value: () => Boolean): Self = this.set("isSorted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsSorted: Self = this.set("isSorted", js.undefined)
    
    @scala.inline
    def setLast(value: () => _): Self = this.set("last", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setLoad(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = this.set("load", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit): Self = this.set("loadData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
    
    @scala.inline
    def setLoadPage(
      value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("loadPage", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLoadPage: Self = this.set("loadPage", js.undefined)
    
    @scala.inline
    def setLoadRecords(value: /* model */ js.UndefOr[js.Any] => Array): Self = this.set("loadRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadRecords: Self = this.set("loadRecords", js.undefined)
    
    @scala.inline
    def setMax(value: /* field */ js.UndefOr[String] => _): Self = this.set("max", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: /* field */ js.UndefOr[String] => _): Self = this.set("min", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNextPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("nextPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPreviousPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("previousPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreviousPage: Self = this.set("previousPage", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setQueryBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = this.set("queryBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteQueryBy: Self = this.set("queryBy", js.undefined)
    
    @scala.inline
    def setRemoteFilter(value: Boolean): Self = this.set("remoteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteFilter: Self = this.set("remoteFilter", js.undefined)
    
    @scala.inline
    def setRemoteGroup(value: Boolean): Self = this.set("remoteGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteGroup: Self = this.set("remoteGroup", js.undefined)
    
    @scala.inline
    def setRemoteSort(value: Boolean): Self = this.set("remoteSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteSort: Self = this.set("remoteSort", js.undefined)
    
    @scala.inline
    def setRemove(value: /* records */ js.UndefOr[js.Any] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemoveAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("removeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    
    @scala.inline
    def setRemoveAt(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("removeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveAt: Self = this.set("removeAt", js.undefined)
    
    @scala.inline
    def setSetAutoLoad(value: /* autoLoad */ js.UndefOr[js.Any] => Unit): Self = this.set("setAutoLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoLoad: Self = this.set("setAutoLoad", js.undefined)
    
    @scala.inline
    def setSetAutoSync(value: /* autoSync */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoSync: Self = this.set("setAutoSync", js.undefined)
    
    @scala.inline
    def setSetBuffered(value: /* buffered */ js.UndefOr[Boolean] => Unit): Self = this.set("setBuffered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBuffered: Self = this.set("setBuffered", js.undefined)
    
    @scala.inline
    def setSetClearOnPageLoad(value: /* clearOnPageLoad */ js.UndefOr[Boolean] => Unit): Self = this.set("setClearOnPageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetClearOnPageLoad: Self = this.set("setClearOnPageLoad", js.undefined)
    
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setSetDestroyRemovedRecords(value: /* destroyRemovedRecords */ js.UndefOr[Boolean] => Unit): Self = this.set("setDestroyRemovedRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDestroyRemovedRecords: Self = this.set("setDestroyRemovedRecords", js.undefined)
    
    @scala.inline
    def setSetFields(value: /* fields */ js.UndefOr[js.Any] => _): Self = this.set("setFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFields: Self = this.set("setFields", js.undefined)
    
    @scala.inline
    def setSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = this.set("setFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFilters: Self = this.set("setFilters", js.undefined)
    
    @scala.inline
    def setSetGetGroupString(value: /* getGroupString */ js.UndefOr[js.Any] => Unit): Self = this.set("setGetGroupString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGetGroupString: Self = this.set("setGetGroupString", js.undefined)
    
    @scala.inline
    def setSetGroupDir(value: /* groupDir */ js.UndefOr[String] => Unit): Self = this.set("setGroupDir", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGroupDir: Self = this.set("setGroupDir", js.undefined)
    
    @scala.inline
    def setSetGroupField(value: /* groupField */ js.UndefOr[String] => Unit): Self = this.set("setGroupField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGroupField: Self = this.set("setGroupField", js.undefined)
    
    @scala.inline
    def setSetGrouper(value: /* grouper */ js.UndefOr[js.Any] => Unit): Self = this.set("setGrouper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGrouper: Self = this.set("setGrouper", js.undefined)
    
    @scala.inline
    def setSetModel(value: /* model */ js.UndefOr[String] => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetModel: Self = this.set("setModel", js.undefined)
    
    @scala.inline
    def setSetModelDefaults(value: /* modelDefaults */ js.UndefOr[js.Any] => Unit): Self = this.set("setModelDefaults", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetModelDefaults: Self = this.set("setModelDefaults", js.undefined)
    
    @scala.inline
    def setSetPageSize(value: /* pageSize */ js.UndefOr[Double] => Unit): Self = this.set("setPageSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPageSize: Self = this.set("setPageSize", js.undefined)
    
    @scala.inline
    def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("setParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetParams: Self = this.set("setParams", js.undefined)
    
    @scala.inline
    def setSetPlugins(value: /* plugins */ js.UndefOr[js.Any] => Unit): Self = this.set("setPlugins", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPlugins: Self = this.set("setPlugins", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => Unit): Self = this.set("setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetProxy: Self = this.set("setProxy", js.undefined)
    
    @scala.inline
    def setSetRemoteFilter(value: /* remoteFilter */ js.UndefOr[Boolean] => Unit): Self = this.set("setRemoteFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRemoteFilter: Self = this.set("setRemoteFilter", js.undefined)
    
    @scala.inline
    def setSetRemoteGroup(value: /* remoteGroup */ js.UndefOr[Boolean] => Unit): Self = this.set("setRemoteGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRemoteGroup: Self = this.set("setRemoteGroup", js.undefined)
    
    @scala.inline
    def setSetRemoteSort(value: /* remoteSort */ js.UndefOr[Boolean] => Unit): Self = this.set("setRemoteSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRemoteSort: Self = this.set("setRemoteSort", js.undefined)
    
    @scala.inline
    def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = this.set("setSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSorters: Self = this.set("setSorters", js.undefined)
    
    @scala.inline
    def setSetStoreId(value: /* storeId */ js.UndefOr[String] => Unit): Self = this.set("setStoreId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStoreId: Self = this.set("setStoreId", js.undefined)
    
    @scala.inline
    def setSetSyncRemovedRecords(value: /* syncRemovedRecords */ js.UndefOr[Boolean] => Unit): Self = this.set("setSyncRemovedRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSyncRemovedRecords: Self = this.set("setSyncRemovedRecords", js.undefined)
    
    @scala.inline
    def setSetTotalCount(value: /* totalCount */ js.UndefOr[Double] => Unit): Self = this.set("setTotalCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTotalCount: Self = this.set("setTotalCount", js.undefined)
    
    @scala.inline
    def setSort(
      value: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], /* where */ js.UndefOr[String]) => Unit
    ): Self = this.set("sort", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSorters(value: Array): Self = this.set("sorters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorters: Self = this.set("sorters", js.undefined)
    
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
    
    @scala.inline
    def setSum(value: /* field */ js.UndefOr[String] => Double): Self = this.set("sum", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    
    @scala.inline
    def setSync(value: /* options */ js.UndefOr[js.Any] => _): Self = this.set("sync", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    
    @scala.inline
    def setSyncRemovedRecords(value: Boolean): Self = this.set("syncRemovedRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncRemovedRecords: Self = this.set("syncRemovedRecords", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
