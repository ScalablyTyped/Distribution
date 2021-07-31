package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IBase because var conflicts: destroy. Inlined self, callOverridden, callParent, callSuper, getInitialConfig, initConfig
- typings.senchaTouch.Ext.mixin.IIdentifiable because var conflicts: destroy, getId. Inlined 
- typings.senchaTouch.Ext.mixin.IFilterable because var conflicts: addFilter, addFilters, currentSortFn, destroy, filter, filters, getFilterFn, getFilterRoot, getFilters, insertFilter, insertFilters, removeFilters, setFilterRoot, setFilters. Inlined filterRoot, dirtyFilterFn, filtered
- typings.senchaTouch.Ext.mixin.ISortable because var conflicts: addSorter, addSorters, destroy, findInsertionIndex, getDefaultSortDirection, getSortFn, getSortRoot, getSorters, insertSorter, insertSorters, removeSorter, removeSorters, setDefaultSortDirection, setSortRoot, setSorters, sort, sorters. Inlined defaultSortDirection, sortRoot, currentSortFn, dirtySortFn, sorted
- typings.senchaTouch.Ext.util.IObservable because var conflicts: destroy. Inlined bubbleEvents, listeners, addAfterListener, addBeforeListener, addEvents, addListener, addManagedListener, clearListeners, enableBubble, fireAction, fireEvent, getBubbleEvents, getId, getListeners, hasListener, mon, mun, on, onAfter, onBefore, relayEvents, removeAfterListener, removeBeforeListener, removeListener, removeManagedListener, resumeEvents, setBubbleEvents, setListeners, suspendEvents, un, unAfter, unBefore
- typings.senchaTouch.Ext.util.ICollection because var conflicts: clone. Inlined filters, sorters, all, indices, items, keys, length, map, add, addAll, addFilter, addFilters, addSorter, addSorters, clear, contains, containsKey, destroy, each, eachKey, filter, filterBy, findBy, findIndexBy, findInsertionIndex, first, get, getAt, getAutoFilter, getAutoSort, getByKey, getCount, getDefaultSortDirection, getFilterFn, getFilterRoot, getFilters, getKey, getRange, getSortFn, getSortRoot, getSorters, indexOf, indexOfKey, insert, insertFilter, insertFilters, insertSorter, insertSorters, last, remove, removeAll, removeAt, removeAtKey, removeFilters, removeSorter, removeSorters, replace, setAutoFilter, setAutoSort, setDefaultSortDirection, setFilterRoot, setFilters, setSortRoot, setSorters, sort */ trait IBufferedCollection
  extends StObject
     with IClass {
  
  /** [Method] Adds an item to the collection
    * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param item Object The item to add.
    * @returns Object The item added.
    */
  var add: js.UndefOr[
    js.Function2[/* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Method] Appends an after event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var addAfterListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
    */
  var addAll: js.UndefOr[js.Function1[/* addItems */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Appends a before event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var addBeforeListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
    */
  var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] This method adds a filter
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    */
  var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] This method adds all the filters in a passed array
    * @param filters Object
    * @returns Object
    */
  var addFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  var addListener: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  var addManagedListener: js.UndefOr[
    js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] This method adds a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var addSorter: js.UndefOr[
    js.Function2[/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  /** [Method] This method adds all the sorters in a passed array
    * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var addSorters: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  /** [Property] (Array) */
  var all: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var bubbleEvents: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Removes all listeners for this object  */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param item Object The Object to look for in the collection.
    * @returns Boolean true if the collection contains the Object as an item.
    */
  var contains: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean true if the collection contains the Object as a key.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.undefined
  
  /** [Method]  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var dirtySortFn: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param events String/String[] The event name to bubble, or an Array of event names.
    */
  var enableBubble: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] This method will sort a collection based on the currently configured sorters
    * @param property Object
    * @param value Object
    * @param anyMatch Object
    * @param caseSensitive Object
    * @returns Array
    */
  var filter: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[String] = js.undefined
  
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function.
    */
  var findBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index, or -1 if the item was not found.
    */
  var findIndexBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
    * @param items Array The array that you want to insert the item into.
    * @param item Mixed The item that you want to insert into the items array.
    * @returns Number The index for the given item in the given array based on the current sorters.
    */
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any], Double]
  ] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
    * @param eventName String The name of the event to fire.
    * @param args Array Arguments to pass to handers.
    * @param fn Function Action.
    * @param scope Object Scope of fn.
    * @returns Object
    */
  var fireAction: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[String], 
      /* args */ js.UndefOr[Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean Returns false if any of the handlers return false.
    */
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.undefined
  
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection.
    */
  var first: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], js.Any]] = js.undefined
  
  /** [Method] Returns the value of autoFilter
    * @returns Boolean
    */
  var getAutoFilter: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of autoSort
    * @returns Boolean
    */
  var getAutoSort: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String/String[]
    */
  var getBubbleEvents: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of defaultSortDirection
    * @returns String
    */
  var getDefaultSortDirection: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns an up to date sort function
    * @returns Function sortFn The sort function.
    */
  var getFilterFn: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of filterRoot
    * @returns String
    */
  var getFilterRoot: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of filters
    * @returns Array
    */
  var getFilters: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Retrieves the id of this component
    * @returns any id
    */
  var getId: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] MixedCollection has a generic way to fetch keys if you implement getKey
    * @param item Object The item for which to find the key.
    * @returns Object The key for the passed item.
    */
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns the value of listeners
    * @returns Object
    */
  var getListeners: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of pageSize
    * @returns Number
    */
  var getPageSize: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns a range of items in this collection
    * @param start Number The starting index.
    * @param end Number The ending index. Defaults to the last item.
    * @returns Array An array of items.
    */
  var getRange: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.undefined
  
  /** [Method] Returns an up to date sort function
    * @returns Function The sort function.
    */
  var getSortFn: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of sortRoot
    * @returns String
    */
  var getSortRoot: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of sorters
    * @returns Array
    */
  var getSorters: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of totalCount
    * @returns Number
    */
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Checks to see if this object has any listeners for a specified event
    * @param eventName String The name of the event to check for
    * @returns Boolean True if the event is being listened for, else false
    */
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Method] Returns index within the collection of the passed Object
    * @param item Object The item to find the index of.
    * @returns Number Index of the item. Returns -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Double]] = js.undefined
  
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number Index of the key.
    */
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.undefined
  
  /** [Property] (Object) */
  var indices: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  var initConfig: js.UndefOr[js.Function1[/* instanceConfig */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String The key to associate with the new item, or the item itself.
    * @param item Object If the second parameter was a key, the new item.
    * @returns Object The item inserted.
    */
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* key */ js.UndefOr[String], 
      /* item */ js.UndefOr[js.Any], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] This method adds a filter at a given index
    * @param index Number The index at which to insert the filter.
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Object
    */
  var insertFilter: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Method] This method inserts all the filters in the passed array at the given index
    * @param index Number The index at which to insert the filters.
    * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Array
    */
  var insertFilters: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array], Array]
  ] = js.undefined
  
  /** [Method] This method adds a sorter at a given index
    * @param index Number The index at which to insert the sorter.
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var insertSorter: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] This method inserts all the sorters in the passed array at the given index
    * @returns Ext.util.Collection this
    */
  var insertSorters: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Property] (Array) */
  var items: js.UndefOr[Array] = js.undefined
  
  /** [Property] (Array) */
  var keys: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection.
    */
  var last: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Property] (Number) */
  var length: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Object) */
  var map: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Alias for addManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  var mon: js.UndefOr[
    js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for removeManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  var mun: js.UndefOr[
    js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for addListener
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  var on: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for addAfterListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var onAfter: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for addBeforeListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var onBefore: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  var relayEvents: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Method] Remove an item from the collection
    * @param item Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var remove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var removeAfterListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Remove all items in the passed array from the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.undefined
  
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], js.Any]] = js.undefined
  
  /** [Method] Removed an item associated with the passed key from the collection
    * @param key String The key of the item to remove.
    * @returns Object/Boolean The item removed or false if no item was removed.
    */
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], js.Any]] = js.undefined
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var removeBeforeListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] This method removes all the filters in a passed array
    * @param filters Object
    * @returns Ext.util.Collection this
    */
  var removeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Removes an event handler
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  var removeListener: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  var removeManagedListener: js.UndefOr[
    js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] This method removes a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    */
  var removeSorter: js.UndefOr[js.Function1[/* sorter */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] This method removes all the sorters in a passed array
    * @param sorters Object
    * @returns Ext.util.Collection this
    */
  var removeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[js.Any], this.type]] = js.undefined
  
  /** [Method] Replaces an item in the collection
    * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  var replace: js.UndefOr[
    js.Function2[/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], js.Any]
  ] = js.undefined
  
  /** [Method] Resumes firing events see suspendEvents
    * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
    */
  var resumeEvents: js.UndefOr[js.Function1[/* discardQueuedEvents */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.undefined
  
  /** [Method] Sets the value of autoFilter
    * @param autoFilter Boolean The new value.
    */
  var setAutoFilter: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoSort
    * @param autoSort Boolean The new value.
    */
  var setAutoSort: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String/String[] The new value.
    */
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultSortDirection
    * @param defaultSortDirection String The new value.
    */
  var setDefaultSortDirection: js.UndefOr[js.Function1[/* defaultSortDirection */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of filterRoot
    * @param filterRoot String The new value.
    */
  var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of filters
    * @param filters Array The new value.
    */
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of listeners
    * @param listeners Object The new value.
    */
  var setListeners: js.UndefOr[js.Function1[/* listeners */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of pageSize
    * @param pageSize Number The new value.
    */
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortRoot
    * @param sortRoot String The new value.
    */
  var setSortRoot: js.UndefOr[js.Function1[/* sortRoot */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of sorters
    * @param sorters Array The new value.
    */
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of totalCount
    * @param totalCount Number The new value.
    */
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param sorters Object
    * @param defaultDirection Object
    * @returns Array The array you passed after it is sorted.
    */
  var sort: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  
  /** [Property] (Boolean) */
  var sorted: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object[]) */
  var sorters: js.UndefOr[Array] = js.undefined
  
  /** [Method] Suspends the firing of all events  */
  var suspendEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Alias for removeListener
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  var un: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for removeAfterListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var unAfter: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for removeBeforeListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var unBefore: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}
object IBufferedCollection {
  
  @scala.inline
  def apply(): IBufferedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBufferedCollection]
  }
  
  @scala.inline
  implicit class IBufferedCollectionMutableBuilder[Self <: IBufferedCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (/* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddAfterListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "addAfterListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddAfterListenerUndefined: Self = StObject.set(x, "addAfterListener", js.undefined)
    
    @scala.inline
    def setAddAll(value: /* addItems */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
    
    @scala.inline
    def setAddBeforeListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "addBeforeListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddBeforeListenerUndefined: Self = StObject.set(x, "addBeforeListener", js.undefined)
    
    @scala.inline
    def setAddEvents(value: /* eventNames */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
    
    @scala.inline
    def setAddFilter(value: /* filter */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddFilterUndefined: Self = StObject.set(x, "addFilter", js.undefined)
    
    @scala.inline
    def setAddFilters(value: /* filters */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "addFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddFiltersUndefined: Self = StObject.set(x, "addFilters", js.undefined)
    
    @scala.inline
    def setAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    @scala.inline
    def setAddManagedListener(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
    
    @scala.inline
    def setAddSorter(value: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "addSorter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddSorterUndefined: Self = StObject.set(x, "addSorter", js.undefined)
    
    @scala.inline
    def setAddSorters(value: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "addSorters", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddSortersUndefined: Self = StObject.set(x, "addSorters", js.undefined)
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAll(value: Array): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setBubbleEvents(value: js.Any): Self = StObject.set(x, "bubbleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleEventsUndefined: Self = StObject.set(x, "bubbleEvents", js.undefined)
    
    @scala.inline
    def setCallOverridden(value: /* args */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "callOverridden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallOverriddenUndefined: Self = StObject.set(x, "callOverridden", js.undefined)
    
    @scala.inline
    def setCallParent(value: /* args */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "callParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallParentUndefined: Self = StObject.set(x, "callParent", js.undefined)
    
    @scala.inline
    def setCallSuper(value: /* args */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "callSuper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallSuperUndefined: Self = StObject.set(x, "callSuper", js.undefined)
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setContains(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKeyUndefined: Self = StObject.set(x, "containsKey", js.undefined)
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setCurrentSortFn(value: js.Any): Self = StObject.set(x, "currentSortFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSortFnUndefined: Self = StObject.set(x, "currentSortFn", js.undefined)
    
    @scala.inline
    def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDirtyFilterFn(value: Boolean): Self = StObject.set(x, "dirtyFilterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyFilterFnUndefined: Self = StObject.set(x, "dirtyFilterFn", js.undefined)
    
    @scala.inline
    def setDirtySortFn(value: Boolean): Self = StObject.set(x, "dirtySortFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtySortFnUndefined: Self = StObject.set(x, "dirtySortFn", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachKey(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "eachKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachKeyUndefined: Self = StObject.set(x, "eachKey", js.undefined)
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setEnableBubble(value: /* events */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[js.Any], /* caseSensitive */ js.UndefOr[js.Any]) => Array
    ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    @scala.inline
    def setFilterRoot(value: String): Self = StObject.set(x, "filterRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRootUndefined: Self = StObject.set(x, "filterRoot", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    @scala.inline
    def setFilters(value: Array): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "findBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
    
    @scala.inline
    def setFindIndexBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findIndexBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFindIndexByUndefined: Self = StObject.set(x, "findIndexBy", js.undefined)
    
    @scala.inline
    def setFindInsertionIndex(value: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double): Self = StObject.set(x, "findInsertionIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindInsertionIndexUndefined: Self = StObject.set(x, "findInsertionIndex", js.undefined)
    
    @scala.inline
    def setFireAction(
      value: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "fireAction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFireActionUndefined: Self = StObject.set(x, "fireAction", js.undefined)
    
    @scala.inline
    def setFireEvent(value: (/* eventName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
    
    @scala.inline
    def setFirst(value: () => js.Any): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setGet(value: /* key */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    @scala.inline
    def setGetAutoFilter(value: () => Boolean): Self = StObject.set(x, "getAutoFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoFilterUndefined: Self = StObject.set(x, "getAutoFilter", js.undefined)
    
    @scala.inline
    def setGetAutoSort(value: () => Boolean): Self = StObject.set(x, "getAutoSort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoSortUndefined: Self = StObject.set(x, "getAutoSort", js.undefined)
    
    @scala.inline
    def setGetBubbleEvents(value: () => js.Any): Self = StObject.set(x, "getBubbleEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBubbleEventsUndefined: Self = StObject.set(x, "getBubbleEvents", js.undefined)
    
    @scala.inline
    def setGetByKey(value: /* key */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "getByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByKeyUndefined: Self = StObject.set(x, "getByKey", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetDefaultSortDirection(value: () => String): Self = StObject.set(x, "getDefaultSortDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultSortDirectionUndefined: Self = StObject.set(x, "getDefaultSortDirection", js.undefined)
    
    @scala.inline
    def setGetFilterFn(value: () => js.Any): Self = StObject.set(x, "getFilterFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterFnUndefined: Self = StObject.set(x, "getFilterFn", js.undefined)
    
    @scala.inline
    def setGetFilterRoot(value: () => String): Self = StObject.set(x, "getFilterRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterRootUndefined: Self = StObject.set(x, "getFilterRoot", js.undefined)
    
    @scala.inline
    def setGetFilters(value: () => Array): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFiltersUndefined: Self = StObject.set(x, "getFilters", js.undefined)
    
    @scala.inline
    def setGetId(value: () => js.Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    @scala.inline
    def setGetInitialConfig(value: /* name */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "getInitialConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInitialConfigUndefined: Self = StObject.set(x, "getInitialConfig", js.undefined)
    
    @scala.inline
    def setGetKey(value: /* item */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    @scala.inline
    def setGetListeners(value: () => js.Any): Self = StObject.set(x, "getListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListenersUndefined: Self = StObject.set(x, "getListeners", js.undefined)
    
    @scala.inline
    def setGetPageSize(value: () => Double): Self = StObject.set(x, "getPageSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageSizeUndefined: Self = StObject.set(x, "getPageSize", js.undefined)
    
    @scala.inline
    def setGetRange(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
    
    @scala.inline
    def setGetSortFn(value: () => js.Any): Self = StObject.set(x, "getSortFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortFnUndefined: Self = StObject.set(x, "getSortFn", js.undefined)
    
    @scala.inline
    def setGetSortRoot(value: () => String): Self = StObject.set(x, "getSortRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortRootUndefined: Self = StObject.set(x, "getSortRoot", js.undefined)
    
    @scala.inline
    def setGetSorters(value: () => Array): Self = StObject.set(x, "getSorters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortersUndefined: Self = StObject.set(x, "getSorters", js.undefined)
    
    @scala.inline
    def setGetTotalCount(value: () => Double): Self = StObject.set(x, "getTotalCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalCountUndefined: Self = StObject.set(x, "getTotalCount", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setHasListener(value: /* eventName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* item */ js.UndefOr[js.Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfKeyUndefined: Self = StObject.set(x, "indexOfKey", js.undefined)
    
    @scala.inline
    def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    @scala.inline
    def setIndices(value: js.Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setInitConfig(value: /* instanceConfig */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "initConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitConfigUndefined: Self = StObject.set(x, "initConfig", js.undefined)
    
    @scala.inline
    def setInsert(
      value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertFilter(value: (/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "insertFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertFilterUndefined: Self = StObject.set(x, "insertFilter", js.undefined)
    
    @scala.inline
    def setInsertFilters(value: (/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array]) => Array): Self = StObject.set(x, "insertFilters", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertFiltersUndefined: Self = StObject.set(x, "insertFilters", js.undefined)
    
    @scala.inline
    def setInsertSorter(
      value: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "insertSorter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertSorterUndefined: Self = StObject.set(x, "insertSorter", js.undefined)
    
    @scala.inline
    def setInsertSorters(value: () => IBufferedCollection): Self = StObject.set(x, "insertSorters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertSortersUndefined: Self = StObject.set(x, "insertSorters", js.undefined)
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setKeys(value: Array): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setLast(value: () => js.Any): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setListeners(value: js.Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMon(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
    
    @scala.inline
    def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
    
    @scala.inline
    def setMun(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
    
    @scala.inline
    def setOn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnAfter(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onAfter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnAfterUndefined: Self = StObject.set(x, "onAfter", js.undefined)
    
    @scala.inline
    def setOnBefore(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onBefore", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IBufferedCollection): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setRemove(value: /* item */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAfterListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeAfterListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveAfterListenerUndefined: Self = StObject.set(x, "removeAfterListener", js.undefined)
    
    @scala.inline
    def setRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    @scala.inline
    def setRemoveAt(value: /* index */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAtKey(value: /* key */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "removeAtKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAtKeyUndefined: Self = StObject.set(x, "removeAtKey", js.undefined)
    
    @scala.inline
    def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
    
    @scala.inline
    def setRemoveBeforeListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeBeforeListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveBeforeListenerUndefined: Self = StObject.set(x, "removeBeforeListener", js.undefined)
    
    @scala.inline
    def setRemoveFilters(value: /* filters */ js.UndefOr[js.Any] => IBufferedCollection): Self = StObject.set(x, "removeFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFiltersUndefined: Self = StObject.set(x, "removeFilters", js.undefined)
    
    @scala.inline
    def setRemoveListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    @scala.inline
    def setRemoveManagedListener(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
    
    @scala.inline
    def setRemoveSorter(value: /* sorter */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeSorter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSorterUndefined: Self = StObject.set(x, "removeSorter", js.undefined)
    
    @scala.inline
    def setRemoveSorters(value: /* sorters */ js.UndefOr[js.Any] => IBufferedCollection): Self = StObject.set(x, "removeSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSortersUndefined: Self = StObject.set(x, "removeSorters", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReplace(value: (/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setResumeEvents(value: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
    
    @scala.inline
    def setSelf(value: IClass): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    
    @scala.inline
    def setSetAutoFilter(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoFilterUndefined: Self = StObject.set(x, "setAutoFilter", js.undefined)
    
    @scala.inline
    def setSetAutoSort(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoSortUndefined: Self = StObject.set(x, "setAutoSort", js.undefined)
    
    @scala.inline
    def setSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBubbleEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBubbleEventsUndefined: Self = StObject.set(x, "setBubbleEvents", js.undefined)
    
    @scala.inline
    def setSetDefaultSortDirection(value: /* defaultSortDirection */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultSortDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultSortDirectionUndefined: Self = StObject.set(x, "setDefaultSortDirection", js.undefined)
    
    @scala.inline
    def setSetFilterRoot(value: /* filterRoot */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setFilterRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterRootUndefined: Self = StObject.set(x, "setFilterRoot", js.undefined)
    
    @scala.inline
    def setSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFiltersUndefined: Self = StObject.set(x, "setFilters", js.undefined)
    
    @scala.inline
    def setSetListeners(value: /* listeners */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetListenersUndefined: Self = StObject.set(x, "setListeners", js.undefined)
    
    @scala.inline
    def setSetPageSize(value: /* pageSize */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setPageSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPageSizeUndefined: Self = StObject.set(x, "setPageSize", js.undefined)
    
    @scala.inline
    def setSetSortRoot(value: /* sortRoot */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSortRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortRootUndefined: Self = StObject.set(x, "setSortRoot", js.undefined)
    
    @scala.inline
    def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setSorters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSortersUndefined: Self = StObject.set(x, "setSorters", js.undefined)
    
    @scala.inline
    def setSetTotalCount(value: /* totalCount */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTotalCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTotalCountUndefined: Self = StObject.set(x, "setTotalCount", js.undefined)
    
    @scala.inline
    def setSort(value: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortRoot(value: String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    
    @scala.inline
    def setSorters(value: Array): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    @scala.inline
    def setSuspendEvents(value: () => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
    
    @scala.inline
    def setUn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "un", js.Any.fromFunction5(value))
    
    @scala.inline
    def setUnAfter(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "unAfter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUnAfterUndefined: Self = StObject.set(x, "unAfter", js.undefined)
    
    @scala.inline
    def setUnBefore(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "unBefore", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUnBeforeUndefined: Self = StObject.set(x, "unBefore", js.undefined)
    
    @scala.inline
    def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
  }
}
