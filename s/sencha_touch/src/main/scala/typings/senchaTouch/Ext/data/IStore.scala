package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IEvented
import typings.senchaTouch.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStore
  extends StObject
     with IEvented {
  
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
  var average: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.undefined
  
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
      /* value */ js.UndefOr[String], 
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
      /* fieldName */ js.UndefOr[String], 
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
      /* fieldName */ js.UndefOr[String], 
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
      /* fieldName */ js.UndefOr[String], 
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
  var first: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Gets the number of all cached records including the ones currently filtered
    * @returns Number The number of all Records in the Store's cache.
    */
  var getAllCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Get the Record at the specified index
    * @param index Number The index of the Record to find.
    * @returns Ext.data.Model/undefined The Record at the passed index. Returns undefined if not found.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], js.Any]] = js.undefined
  
  /** [Method] Returns the value of autoLoad
    * @returns Boolean/Object
    */
  var getAutoLoad: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], js.Any]] = js.undefined
  
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
  var getData: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of destroyRemovedRecords
    * @returns Boolean
    */
  var getDestroyRemovedRecords: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of fields
    * @returns Object[]/Ext.util.Collection
    */
  var getFields: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of getGroupString
    * @returns Function
    */
  var getGetGroupString: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of groupDir
    * @returns String
    */
  var getGroupDir: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of groupField
    * @returns String
    */
  var getGroupField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Function) */
  var getGroupString: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the value of grouper
    * @returns Object
    */
  var getGrouper: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns an array containing the result of applying the grouper to the records in this store
    * @param groupName String Pass in an optional groupName argument to access a specific group as defined by grouper.
    * @returns Object/Object[] The grouped data.
    */
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] Returns the value of model
    * @returns String
    */
  var getModel: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of modelDefaults
    * @returns Object
    */
  var getModelDefaults: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var getParams: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of plugins
    * @returns Object/Array
    */
  var getPlugins: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of proxy
    * @returns String/Ext.data.proxy.Proxy/Object
    */
  var getProxy: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
  var getStoreId: js.UndefOr[js.Function0[String]] = js.undefined
  
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
  var groupDir: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.undefined
  
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
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.undefined
  
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
    * @param index Number The start index at which to insert the passed Records.
    * @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the cache.
    * @returns Object
    */
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], js.Any]
  ] = js.undefined
  
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
  var last: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Loads data into the Store via the configured proxy
    * @param options Object/Function config object, passed into the Ext.data.Operation object before loading.
    * @param scope Object Scope for the function.
    * @returns Object
    */
  var load: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], js.Any]
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
  var max: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] Gets the minimum value in the store
    * @param field String The field in each record.
    * @returns Object/undefined The minimum value, if no items exist, undefined.
    */
  var min: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Config Option] (String) */
  var model: js.UndefOr[String] = js.undefined
  
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
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
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
  var setGroupDir: js.UndefOr[js.Function1[/* groupDir */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of groupField
    * @param groupField String The new value.
    */
  var setGroupField: js.UndefOr[js.Function1[/* groupField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of grouper
    * @param grouper Object The new value.
    */
  var setGrouper: js.UndefOr[js.Function1[/* grouper */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of model
    * @param model String The new value.
    */
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[String], Unit]] = js.undefined
  
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
  var setStoreId: js.UndefOr[js.Function1[/* storeId */ js.UndefOr[String], Unit]] = js.undefined
  
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
      /* defaultDirection */ js.UndefOr[String], 
      /* where */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Object[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var storeId: js.UndefOr[String] = js.undefined
  
  /** [Method] Sums the value of property for each record between start and end and returns the result
    * @param field String The field in each record.
    * @returns Number The sum.
    */
  var sum: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Double]] = js.undefined
  
  /** [Method] Synchronizes the Store with its Proxy
    * @param options Object
    * @returns Object
    */
  var sync: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var syncRemovedRecords: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var totalCount: js.UndefOr[Double] = js.undefined
}
object IStore {
  
  inline def apply(): IStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStore]
  }
  
  extension [Self <: IStore](x: Self) {
    
    inline def setAdd(value: /* model */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddData(value: /* data */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "addData", js.Any.fromFunction1(value))
    
    inline def setAddDataUndefined: Self = StObject.set(x, "addData", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setApplyData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "applyData", js.Any.fromFunction1(value))
    
    inline def setApplyDataUndefined: Self = StObject.set(x, "applyData", js.undefined)
    
    inline def setAutoLoad(value: js.Any): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setAutoSync(value: Boolean): Self = StObject.set(x, "autoSync", value.asInstanceOf[js.Any])
    
    inline def setAutoSyncUndefined: Self = StObject.set(x, "autoSync", js.undefined)
    
    inline def setAverage(value: /* field */ js.UndefOr[String] => Double): Self = StObject.set(x, "average", js.Any.fromFunction1(value))
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setBuffered(value: Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    inline def setClearFilter(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "clearFilter", js.Any.fromFunction1(value))
    
    inline def setClearFilterUndefined: Self = StObject.set(x, "clearFilter", js.undefined)
    
    inline def setClearOnPageLoad(value: Boolean): Self = StObject.set(x, "clearOnPageLoad", value.asInstanceOf[js.Any])
    
    inline def setClearOnPageLoadUndefined: Self = StObject.set(x, "clearOnPageLoad", js.undefined)
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDestroyRemovedRecords(value: Boolean): Self = StObject.set(x, "destroyRemovedRecords", value.asInstanceOf[js.Any])
    
    inline def setDestroyRemovedRecordsUndefined: Self = StObject.set(x, "destroyRemovedRecords", js.undefined)
    
    inline def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setFields(value: js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFilter(
      value: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
    
    inline def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilters(value: Array): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFind(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "find", js.Any.fromFunction6(value))
    
    inline def setFindBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findBy", js.Any.fromFunction3(value))
    
    inline def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
    
    inline def setFindExact(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findExact", js.Any.fromFunction3(value))
    
    inline def setFindExactUndefined: Self = StObject.set(x, "findExact", js.undefined)
    
    inline def setFindRecord(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel
    ): Self = StObject.set(x, "findRecord", js.Any.fromFunction6(value))
    
    inline def setFindRecordUndefined: Self = StObject.set(x, "findRecord", js.undefined)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setFirst(value: () => js.Any): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setGetAllCount(value: () => Double): Self = StObject.set(x, "getAllCount", js.Any.fromFunction0(value))
    
    inline def setGetAllCountUndefined: Self = StObject.set(x, "getAllCount", js.undefined)
    
    inline def setGetAt(value: /* index */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    inline def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    inline def setGetAutoLoad(value: () => js.Any): Self = StObject.set(x, "getAutoLoad", js.Any.fromFunction0(value))
    
    inline def setGetAutoLoadUndefined: Self = StObject.set(x, "getAutoLoad", js.undefined)
    
    inline def setGetAutoSync(value: () => Boolean): Self = StObject.set(x, "getAutoSync", js.Any.fromFunction0(value))
    
    inline def setGetAutoSyncUndefined: Self = StObject.set(x, "getAutoSync", js.undefined)
    
    inline def setGetBuffered(value: () => Boolean): Self = StObject.set(x, "getBuffered", js.Any.fromFunction0(value))
    
    inline def setGetBufferedUndefined: Self = StObject.set(x, "getBuffered", js.undefined)
    
    inline def setGetById(value: /* id */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "getById", js.Any.fromFunction1(value))
    
    inline def setGetByIdUndefined: Self = StObject.set(x, "getById", js.undefined)
    
    inline def setGetClearOnPageLoad(value: () => Boolean): Self = StObject.set(x, "getClearOnPageLoad", js.Any.fromFunction0(value))
    
    inline def setGetClearOnPageLoadUndefined: Self = StObject.set(x, "getClearOnPageLoad", js.undefined)
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setGetData(value: () => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setGetDestroyRemovedRecords(value: () => Boolean): Self = StObject.set(x, "getDestroyRemovedRecords", js.Any.fromFunction0(value))
    
    inline def setGetDestroyRemovedRecordsUndefined: Self = StObject.set(x, "getDestroyRemovedRecords", js.undefined)
    
    inline def setGetFields(value: () => js.Any): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
    
    inline def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
    
    inline def setGetGetGroupString(value: () => js.Any): Self = StObject.set(x, "getGetGroupString", js.Any.fromFunction0(value))
    
    inline def setGetGetGroupStringUndefined: Self = StObject.set(x, "getGetGroupString", js.undefined)
    
    inline def setGetGroupDir(value: () => String): Self = StObject.set(x, "getGroupDir", js.Any.fromFunction0(value))
    
    inline def setGetGroupDirUndefined: Self = StObject.set(x, "getGroupDir", js.undefined)
    
    inline def setGetGroupField(value: () => String): Self = StObject.set(x, "getGroupField", js.Any.fromFunction0(value))
    
    inline def setGetGroupFieldUndefined: Self = StObject.set(x, "getGroupField", js.undefined)
    
    inline def setGetGroupString(value: js.Any): Self = StObject.set(x, "getGroupString", value.asInstanceOf[js.Any])
    
    inline def setGetGroupStringUndefined: Self = StObject.set(x, "getGroupString", js.undefined)
    
    inline def setGetGrouper(value: () => js.Any): Self = StObject.set(x, "getGrouper", js.Any.fromFunction0(value))
    
    inline def setGetGrouperUndefined: Self = StObject.set(x, "getGrouper", js.undefined)
    
    inline def setGetGroups(value: /* groupName */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "getGroups", js.Any.fromFunction1(value))
    
    inline def setGetGroupsUndefined: Self = StObject.set(x, "getGroups", js.undefined)
    
    inline def setGetModel(value: () => String): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    inline def setGetModelDefaults(value: () => js.Any): Self = StObject.set(x, "getModelDefaults", js.Any.fromFunction0(value))
    
    inline def setGetModelDefaultsUndefined: Self = StObject.set(x, "getModelDefaults", js.undefined)
    
    inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
    
    inline def setGetNewRecords(value: () => Array): Self = StObject.set(x, "getNewRecords", js.Any.fromFunction0(value))
    
    inline def setGetNewRecordsUndefined: Self = StObject.set(x, "getNewRecords", js.undefined)
    
    inline def setGetPageSize(value: () => Double): Self = StObject.set(x, "getPageSize", js.Any.fromFunction0(value))
    
    inline def setGetPageSizeUndefined: Self = StObject.set(x, "getPageSize", js.undefined)
    
    inline def setGetParams(value: () => js.Any): Self = StObject.set(x, "getParams", js.Any.fromFunction0(value))
    
    inline def setGetParamsUndefined: Self = StObject.set(x, "getParams", js.undefined)
    
    inline def setGetPlugins(value: () => js.Any): Self = StObject.set(x, "getPlugins", js.Any.fromFunction0(value))
    
    inline def setGetPluginsUndefined: Self = StObject.set(x, "getPlugins", js.undefined)
    
    inline def setGetProxy(value: () => js.Any): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    inline def setGetRange(value: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
    
    inline def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
    
    inline def setGetRemoteFilter(value: () => Boolean): Self = StObject.set(x, "getRemoteFilter", js.Any.fromFunction0(value))
    
    inline def setGetRemoteFilterUndefined: Self = StObject.set(x, "getRemoteFilter", js.undefined)
    
    inline def setGetRemoteGroup(value: () => Boolean): Self = StObject.set(x, "getRemoteGroup", js.Any.fromFunction0(value))
    
    inline def setGetRemoteGroupUndefined: Self = StObject.set(x, "getRemoteGroup", js.undefined)
    
    inline def setGetRemoteSort(value: () => Boolean): Self = StObject.set(x, "getRemoteSort", js.Any.fromFunction0(value))
    
    inline def setGetRemoteSortUndefined: Self = StObject.set(x, "getRemoteSort", js.undefined)
    
    inline def setGetRemovedRecords(value: () => Array): Self = StObject.set(x, "getRemovedRecords", js.Any.fromFunction0(value))
    
    inline def setGetRemovedRecordsUndefined: Self = StObject.set(x, "getRemovedRecords", js.undefined)
    
    inline def setGetStoreId(value: () => String): Self = StObject.set(x, "getStoreId", js.Any.fromFunction0(value))
    
    inline def setGetStoreIdUndefined: Self = StObject.set(x, "getStoreId", js.undefined)
    
    inline def setGetSyncRemovedRecords(value: () => Boolean): Self = StObject.set(x, "getSyncRemovedRecords", js.Any.fromFunction0(value))
    
    inline def setGetSyncRemovedRecordsUndefined: Self = StObject.set(x, "getSyncRemovedRecords", js.undefined)
    
    inline def setGetTotalCount(value: () => Double): Self = StObject.set(x, "getTotalCount", js.Any.fromFunction0(value))
    
    inline def setGetTotalCountUndefined: Self = StObject.set(x, "getTotalCount", js.undefined)
    
    inline def setGetUpdatedRecords(value: () => Array): Self = StObject.set(x, "getUpdatedRecords", js.Any.fromFunction0(value))
    
    inline def setGetUpdatedRecordsUndefined: Self = StObject.set(x, "getUpdatedRecords", js.undefined)
    
    inline def setGroupDir(value: String): Self = StObject.set(x, "groupDir", value.asInstanceOf[js.Any])
    
    inline def setGroupDirUndefined: Self = StObject.set(x, "groupDir", js.undefined)
    
    inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
    
    inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
    
    inline def setGrouper(value: js.Any): Self = StObject.set(x, "grouper", value.asInstanceOf[js.Any])
    
    inline def setGrouperUndefined: Self = StObject.set(x, "grouper", js.undefined)
    
    inline def setIndexOf(value: /* record */ js.UndefOr[IModel] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfId", js.Any.fromFunction1(value))
    
    inline def setIndexOfIdUndefined: Self = StObject.set(x, "indexOfId", js.undefined)
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setInsert(value: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => js.Any): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setIsAutoLoading(value: () => Boolean): Self = StObject.set(x, "isAutoLoading", js.Any.fromFunction0(value))
    
    inline def setIsAutoLoadingUndefined: Self = StObject.set(x, "isAutoLoading", js.undefined)
    
    inline def setIsFiltered(value: () => Boolean): Self = StObject.set(x, "isFiltered", js.Any.fromFunction0(value))
    
    inline def setIsFilteredUndefined: Self = StObject.set(x, "isFiltered", js.undefined)
    
    inline def setIsGrouped(value: () => Boolean): Self = StObject.set(x, "isGrouped", js.Any.fromFunction0(value))
    
    inline def setIsGroupedUndefined: Self = StObject.set(x, "isGrouped", js.undefined)
    
    inline def setIsLoaded(value: () => Boolean): Self = StObject.set(x, "isLoaded", js.Any.fromFunction0(value))
    
    inline def setIsLoadedUndefined: Self = StObject.set(x, "isLoaded", js.undefined)
    
    inline def setIsLoading(value: () => Boolean): Self = StObject.set(x, "isLoading", js.Any.fromFunction0(value))
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setIsSorted(value: () => Boolean): Self = StObject.set(x, "isSorted", js.Any.fromFunction0(value))
    
    inline def setIsSortedUndefined: Self = StObject.set(x, "isSorted", js.undefined)
    
    inline def setLast(value: () => js.Any): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setLoad(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    
    inline def setLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction2(value))
    
    inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
    
    inline def setLoadPage(
      value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "loadPage", js.Any.fromFunction3(value))
    
    inline def setLoadPageUndefined: Self = StObject.set(x, "loadPage", js.undefined)
    
    inline def setLoadRecords(value: /* model */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "loadRecords", js.Any.fromFunction1(value))
    
    inline def setLoadRecordsUndefined: Self = StObject.set(x, "loadRecords", js.undefined)
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setMax(value: /* field */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: /* field */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setNextPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "nextPage", js.Any.fromFunction1(value))
    
    inline def setNextPageUndefined: Self = StObject.set(x, "nextPage", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPreviousPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "previousPage", js.Any.fromFunction1(value))
    
    inline def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
    
    inline def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setQueryBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
    
    inline def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
    
    inline def setRemoteFilter(value: Boolean): Self = StObject.set(x, "remoteFilter", value.asInstanceOf[js.Any])
    
    inline def setRemoteFilterUndefined: Self = StObject.set(x, "remoteFilter", js.undefined)
    
    inline def setRemoteGroup(value: Boolean): Self = StObject.set(x, "remoteGroup", value.asInstanceOf[js.Any])
    
    inline def setRemoteGroupUndefined: Self = StObject.set(x, "remoteGroup", js.undefined)
    
    inline def setRemoteSort(value: Boolean): Self = StObject.set(x, "remoteSort", value.asInstanceOf[js.Any])
    
    inline def setRemoteSortUndefined: Self = StObject.set(x, "remoteSort", js.undefined)
    
    inline def setRemove(value: /* records */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveAt(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    
    inline def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSetAutoLoad(value: /* autoLoad */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAutoLoad", js.Any.fromFunction1(value))
    
    inline def setSetAutoLoadUndefined: Self = StObject.set(x, "setAutoLoad", js.undefined)
    
    inline def setSetAutoSync(value: /* autoSync */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSync", js.Any.fromFunction1(value))
    
    inline def setSetAutoSyncUndefined: Self = StObject.set(x, "setAutoSync", js.undefined)
    
    inline def setSetBuffered(value: /* buffered */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setBuffered", js.Any.fromFunction1(value))
    
    inline def setSetBufferedUndefined: Self = StObject.set(x, "setBuffered", js.undefined)
    
    inline def setSetClearOnPageLoad(value: /* clearOnPageLoad */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setClearOnPageLoad", js.Any.fromFunction1(value))
    
    inline def setSetClearOnPageLoadUndefined: Self = StObject.set(x, "setClearOnPageLoad", js.undefined)
    
    inline def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    inline def setSetDestroyRemovedRecords(value: /* destroyRemovedRecords */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDestroyRemovedRecords", js.Any.fromFunction1(value))
    
    inline def setSetDestroyRemovedRecordsUndefined: Self = StObject.set(x, "setDestroyRemovedRecords", js.undefined)
    
    inline def setSetFields(value: /* fields */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
    
    inline def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
    
    inline def setSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction1(value))
    
    inline def setSetFiltersUndefined: Self = StObject.set(x, "setFilters", js.undefined)
    
    inline def setSetGetGroupString(value: /* getGroupString */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setGetGroupString", js.Any.fromFunction1(value))
    
    inline def setSetGetGroupStringUndefined: Self = StObject.set(x, "setGetGroupString", js.undefined)
    
    inline def setSetGroupDir(value: /* groupDir */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGroupDir", js.Any.fromFunction1(value))
    
    inline def setSetGroupDirUndefined: Self = StObject.set(x, "setGroupDir", js.undefined)
    
    inline def setSetGroupField(value: /* groupField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGroupField", js.Any.fromFunction1(value))
    
    inline def setSetGroupFieldUndefined: Self = StObject.set(x, "setGroupField", js.undefined)
    
    inline def setSetGrouper(value: /* grouper */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setGrouper", js.Any.fromFunction1(value))
    
    inline def setSetGrouperUndefined: Self = StObject.set(x, "setGrouper", js.undefined)
    
    inline def setSetModel(value: /* model */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    
    inline def setSetModelDefaults(value: /* modelDefaults */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setModelDefaults", js.Any.fromFunction1(value))
    
    inline def setSetModelDefaultsUndefined: Self = StObject.set(x, "setModelDefaults", js.undefined)
    
    inline def setSetModelUndefined: Self = StObject.set(x, "setModel", js.undefined)
    
    inline def setSetPageSize(value: /* pageSize */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setPageSize", js.Any.fromFunction1(value))
    
    inline def setSetPageSizeUndefined: Self = StObject.set(x, "setPageSize", js.undefined)
    
    inline def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setParams", js.Any.fromFunction1(value))
    
    inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    inline def setSetPlugins(value: /* plugins */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPlugins", js.Any.fromFunction1(value))
    
    inline def setSetPluginsUndefined: Self = StObject.set(x, "setPlugins", js.undefined)
    
    inline def setSetProxy(value: /* proxy */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    inline def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    inline def setSetRemoteFilter(value: /* remoteFilter */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setRemoteFilter", js.Any.fromFunction1(value))
    
    inline def setSetRemoteFilterUndefined: Self = StObject.set(x, "setRemoteFilter", js.undefined)
    
    inline def setSetRemoteGroup(value: /* remoteGroup */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setRemoteGroup", js.Any.fromFunction1(value))
    
    inline def setSetRemoteGroupUndefined: Self = StObject.set(x, "setRemoteGroup", js.undefined)
    
    inline def setSetRemoteSort(value: /* remoteSort */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setRemoteSort", js.Any.fromFunction1(value))
    
    inline def setSetRemoteSortUndefined: Self = StObject.set(x, "setRemoteSort", js.undefined)
    
    inline def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setSorters", js.Any.fromFunction1(value))
    
    inline def setSetSortersUndefined: Self = StObject.set(x, "setSorters", js.undefined)
    
    inline def setSetStoreId(value: /* storeId */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setStoreId", js.Any.fromFunction1(value))
    
    inline def setSetStoreIdUndefined: Self = StObject.set(x, "setStoreId", js.undefined)
    
    inline def setSetSyncRemovedRecords(value: /* syncRemovedRecords */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setSyncRemovedRecords", js.Any.fromFunction1(value))
    
    inline def setSetSyncRemovedRecordsUndefined: Self = StObject.set(x, "setSyncRemovedRecords", js.undefined)
    
    inline def setSetTotalCount(value: /* totalCount */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTotalCount", js.Any.fromFunction1(value))
    
    inline def setSetTotalCountUndefined: Self = StObject.set(x, "setTotalCount", js.undefined)
    
    inline def setSort(
      value: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], /* where */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "sort", js.Any.fromFunction3(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSorters(value: Array): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    inline def setSum(value: /* field */ js.UndefOr[String] => Double): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    inline def setSync(value: /* options */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    
    inline def setSyncRemovedRecords(value: Boolean): Self = StObject.set(x, "syncRemovedRecords", value.asInstanceOf[js.Any])
    
    inline def setSyncRemovedRecordsUndefined: Self = StObject.set(x, "syncRemovedRecords", js.undefined)
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
