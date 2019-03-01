package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.mixinNs.IFilterable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, currentSortFn, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined filterRoot, filters, dirtyFilterFn, filtered, addFilter, addFilters, filter, getFilterFn, getFilterRoot, getFilters, insertFilter, insertFilters, removeFilters, setFilterRoot, setFilters */ trait ICollection
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.ISortable {
  /** [Method] Adds an item to the collection
  		* @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param item Object The item to add.
  		* @returns Object The item added.
  		*/
  var add: js.UndefOr[
    js.Function2[/* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Adds all elements of an Array or an Object to the collection
  		* @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
  		*/
  var addAll: js.UndefOr[js.Function1[/* addItems */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Object
  		* @returns Object
  		*/
  var addFilters: js.UndefOr[
    js.Function1[/* filters */ js.UndefOr[js.Any | senchaUnderscoreTouchLib.ExtNs.Array], _]
  ] = js.undefined
  /** [Property] (Array) */
  var all: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Creates a shallow copy of this collection
  		* @returns Ext.util.MixedCollection
  		*/
  @JSName("clone")
  var clone_FICollection: js.UndefOr[js.Function0[IMixedCollection]] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param item Object The Object to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as an item.
  		*/
  var contains: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as a key.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Executes the specified function once for every item in the collection
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  var eachKey: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] This method will sort a collection based on the currently configured sorters
  		* @param property Object
  		* @param value Object
  		* @param anyMatch Object
  		* @param caseSensitive Object
  		* @returns Array
  		*/
  var filter: js.UndefOr[
    (js.Function1[
      /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]) | (js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ])
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
  var filterRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		* @returns Object The first item in the collection which returned true from the selection function.
  		*/
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.undefined
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
      /* start */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Returns the first item in the collection
  		* @returns Object the first item in the collection.
  		*/
  var first: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the item associated with the passed key OR index
  		* @param key String/Number The key or index of the item.
  		* @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
  		*/
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the item at the specified index
  		* @param index Number The index of the item.
  		* @returns Object The item at the specified index.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns the value of autoFilter
  		* @returns Boolean
  		*/
  var getAutoFilter: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoSort
  		* @returns Boolean
  		*/
  var getAutoSort: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns an up to date sort function
  		* @returns Function sortFn The sort function.
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filterRoot
  		* @returns String
  		*/
  var getFilterRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of filters
  		* @returns Array
  		*/
  var getFilters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] MixedCollection has a generic way to fetch keys if you implement getKey
  		* @param item Object The item for which to find the key.
  		* @returns Object The key for the passed item.
  		*/
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns a range of items in this collection
  		* @param start Number The starting index.
  		* @param end Number The ending index. Defaults to the last item.
  		* @returns Array An array of items.
  		*/
  var getRange: js.UndefOr[
    js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns index within the collection of the passed Object
  		* @param item Object The item to find the index of.
  		* @returns Number Index of the item. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number Index of the key.
  		*/
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Property] (Object) */
  var indices: js.UndefOr[js.Any] = js.undefined
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Number The index to insert the item at.
  		* @param key String The key to associate with the new item, or the item itself.
  		* @param item Object If the second parameter was a key, the new item.
  		* @returns Object The item inserted.
  		*/
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* key */ js.UndefOr[java.lang.String], 
      /* item */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var insertFilter: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[scala.Double], /* filter */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  var insertFilters: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] This method inserts all the sorters in the passed array at the given index
  		* @returns Ext.util.Collection this
  		*/
  @JSName("insertSorters")
  var insertSorters_ICollection: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Property] (Array) */
  var items: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Property] (Array) */
  var keys: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection.
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Number) */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Object) */
  var map: js.UndefOr[js.Any] = js.undefined
  /** [Method] Remove an item from the collection
  		* @param item Object The item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Remove all items in the passed array from the collection
  		* @param items Array An array of items to be removed.
  		* @returns Ext.util.MixedCollection this object
  		*/
  var removeAll: js.UndefOr[
    js.Function1[/* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], IMixedCollection]
  ] = js.undefined
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Removed an item associated with the passed key from the collection
  		* @param key String The key of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Object
  		* @returns Ext.util.Collection this
  		*/
  var removeFilters: js.UndefOr[
    js.Function1[
      /* filters */ js.UndefOr[js.Any | senchaUnderscoreTouchLib.ExtNs.Array], 
      this.type | scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method removes all the sorters in a passed array
  		* @param sorters Object
  		* @returns Ext.util.Collection this
  		*/
  @JSName("removeSorters")
  var removeSorters_ICollection: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Replaces an item in the collection
  		* @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
  		* @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
  		* @returns Object The new item.
  		*/
  var replace: js.UndefOr[
    js.Function2[/* oldKey */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Sets the value of autoFilter
  		* @param autoFilter Boolean The new value.
  		*/
  var setAutoFilter: js.UndefOr[js.Function1[/* autoFilter */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoSort
  		* @param autoSort Boolean The new value.
  		*/
  var setAutoSort: js.UndefOr[js.Function1[/* autoSort */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  var setFilters: js.UndefOr[
    js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param sorters Object
  		* @param defaultDirection Object
  		* @returns Array The array you passed after it is sorted.
  		*/
  @JSName("sort")
  var sort_ICollection: js.UndefOr[
    js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
}

object ICollection {
  @scala.inline
  def apply(
    add: js.Function2[/* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any], _] = null,
    addAll: js.Function1[/* addItems */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilter: js.Function1[/* filter */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilters: js.Function1[/* filters */ js.UndefOr[js.Any], _] = null,
    addSorter: js.Function2[
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addSorters: js.Function2[
      /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    all: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function0[scala.Unit] = null,
    clone: js.Function0[IMixedCollection] = null,
    config: js.Any = null,
    contains: js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean] = null,
    containsKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    dirtyFilterFn: js.UndefOr[scala.Boolean] = js.undefined,
    dirtySortFn: js.UndefOr[scala.Boolean] = js.undefined,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    eachKey: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    filter: js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    filterBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection] = null,
    filterRoot: java.lang.String = null,
    filtered: js.UndefOr[scala.Boolean] = js.undefined,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    findBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _] = null,
    findIndexBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findInsertionIndex: js.Function2[
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* item */ js.UndefOr[js.Any], 
      scala.Double
    ] = null,
    first: js.Function0[_] = null,
    get: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getAutoFilter: js.Function0[scala.Boolean] = null,
    getAutoSort: js.Function0[scala.Boolean] = null,
    getByKey: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getCount: js.Function0[scala.Double] = null,
    getDefaultSortDirection: js.Function0[java.lang.String] = null,
    getFilterFn: js.Function0[_] = null,
    getFilterRoot: js.Function0[java.lang.String] = null,
    getFilters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getKey: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    getRange: js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    getSortFn: js.Function0[_] = null,
    getSortRoot: js.Function0[java.lang.String] = null,
    getSorters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    indexOf: js.Function1[/* item */ js.UndefOr[js.Any], scala.Double] = null,
    indexOfKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Double] = null,
    indices: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    insert: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* key */ js.UndefOr[java.lang.String], 
      /* item */ js.UndefOr[js.Any], 
      _
    ] = null,
    insertFilter: js.Function2[/* index */ js.UndefOr[scala.Double], /* filter */ js.UndefOr[js.Any], _] = null,
    insertFilters: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    insertSorter: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    insertSorters: js.Function0[ICollection] = null,
    items: senchaUnderscoreTouchLib.ExtNs.Array = null,
    keys: senchaUnderscoreTouchLib.ExtNs.Array = null,
    last: js.Function0[_] = null,
    length: scala.Int | scala.Double = null,
    map: js.Any = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    remove: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    removeAll: js.Function1[/* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], IMixedCollection] = null,
    removeAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    removeAtKey: js.Function1[/* key */ js.UndefOr[java.lang.String], _] = null,
    removeFilters: js.Function1[/* filters */ js.UndefOr[js.Any], ICollection] = null,
    removeSorter: js.Function1[/* sorter */ js.UndefOr[js.Any], scala.Unit] = null,
    removeSorters: js.Function1[/* sorters */ js.UndefOr[js.Any], ICollection] = null,
    replace: js.Function2[/* oldKey */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any], _] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAutoFilter: js.Function1[/* autoFilter */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoSort: js.Function1[/* autoSort */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDefaultSortDirection: js.Function1[/* defaultSortDirection */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFilterRoot: js.Function1[/* filterRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setSortRoot: js.Function1[/* sortRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    sortRoot: java.lang.String = null,
    sorted: js.UndefOr[scala.Boolean] = js.undefined,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ICollection = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addAll != null) __obj.updateDynamic("addAll")(addAll)
    if (addFilter != null) __obj.updateDynamic("addFilter")(addFilter)
    if (addFilters != null) __obj.updateDynamic("addFilters")(addFilters)
    if (addSorter != null) __obj.updateDynamic("addSorter")(addSorter)
    if (addSorters != null) __obj.updateDynamic("addSorters")(addSorters)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (all != null) __obj.updateDynamic("all")(all)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (containsKey != null) __obj.updateDynamic("containsKey")(containsKey)
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn)
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn)
    if (each != null) __obj.updateDynamic("each")(each)
    if (eachKey != null) __obj.updateDynamic("eachKey")(eachKey)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot)
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(findIndexBy)
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(findInsertionIndex)
    if (first != null) __obj.updateDynamic("first")(first)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getAutoFilter != null) __obj.updateDynamic("getAutoFilter")(getAutoFilter)
    if (getAutoSort != null) __obj.updateDynamic("getAutoSort")(getAutoSort)
    if (getByKey != null) __obj.updateDynamic("getByKey")(getByKey)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(getDefaultSortDirection)
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(getFilterFn)
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(getFilterRoot)
    if (getFilters != null) __obj.updateDynamic("getFilters")(getFilters)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(getSortFn)
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(getSortRoot)
    if (getSorters != null) __obj.updateDynamic("getSorters")(getSorters)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(indexOfKey)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(insertFilter)
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(insertFilters)
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(insertSorter)
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(insertSorters)
    if (items != null) __obj.updateDynamic("items")(items)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (last != null) __obj.updateDynamic("last")(last)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(removeAtKey)
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(removeFilters)
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(removeSorter)
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(removeSorters)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAutoFilter != null) __obj.updateDynamic("setAutoFilter")(setAutoFilter)
    if (setAutoSort != null) __obj.updateDynamic("setAutoSort")(setAutoSort)
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(setDefaultSortDirection)
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(setFilterRoot)
    if (setFilters != null) __obj.updateDynamic("setFilters")(setFilters)
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(setSortRoot)
    if (setSorters != null) __obj.updateDynamic("setSorters")(setSorters)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ICollection]
  }
}

