package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.senchaUnderscoreTouch.Ext.IClass because Already inherited
- typings.senchaUnderscoreTouch.Ext.IBase because Already inherited
- typings.senchaUnderscoreTouch.Ext.mixin.IFilterable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, currentSortFn, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined filterRoot, filters, dirtyFilterFn, filtered, addFilter, addFilters, filter, getFilterFn, getFilterRoot, getFilters, insertFilter, insertFilters, removeFilters, setFilterRoot, setFilters */ trait ICollection
  extends typings.senchaUnderscoreTouch.Ext.mixin.ISortable {
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
  var addAll: js.UndefOr[js.Function1[/* addItems */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  var addFilter: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Object
  		* @returns Object
  		*/
  var addFilters: js.UndefOr[js.Function1[js.UndefOr[js.Any | Array], _]] = js.undefined
  /** [Property] (Array) */
  var all: js.UndefOr[Array] = js.undefined
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Creates a shallow copy of this collection
  		* @returns Ext.util.MixedCollection
  		*/
  @JSName("clone")
  var clone_FICollection: js.UndefOr[js.Function0[IMixedCollection]] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param item Object The Object to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as an item.
  		*/
  var contains: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as a key.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.undefined
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
  /** [Method] This method will sort a collection based on the currently configured sorters
  		* @param property Object
  		* @param value Object
  		* @param anyMatch Object
  		* @param caseSensitive Object
  		* @returns Array
  		*/
  var filter: js.UndefOr[
    (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      Array
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
  var filtered: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.undefined
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
      /* start */ js.UndefOr[Double], 
      Double
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
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the value of autoFilter
  		* @returns Boolean
  		*/
  var getAutoFilter: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of autoSort
  		* @returns Boolean
  		*/
  var getAutoSort: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
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
  var getFilters: js.UndefOr[js.Function0[Array]] = js.undefined
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
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.undefined
  /** [Method] Returns index within the collection of the passed Object
  		* @param item Object The item to find the index of.
  		* @returns Number Index of the item. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number Index of the key.
  		*/
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], Double]] = js.undefined
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
      /* index */ js.UndefOr[Double], 
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
  var insertFilter: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  var insertFilters: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[Array], Array]] = js.undefined
  /** [Method] This method inserts all the sorters in the passed array at the given index
  		* @returns Ext.util.Collection this
  		*/
  @JSName("insertSorters")
  var insertSorters_ICollection: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Property] (Array) */
  var items: js.UndefOr[Array] = js.undefined
  /** [Property] (Array) */
  var keys: js.UndefOr[Array] = js.undefined
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection.
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Property] (Number) */
  var length: js.UndefOr[Double] = js.undefined
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
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.undefined
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Removed an item associated with the passed key from the collection
  		* @param key String The key of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Object
  		* @returns Ext.util.Collection this
  		*/
  var removeFilters: js.UndefOr[js.Function1[js.UndefOr[js.Any | Array], this.type | Unit]] = js.undefined
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
  var setAutoFilter: js.UndefOr[js.Function1[/* autoFilter */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of autoSort
  		* @param autoSort Boolean The new value.
  		*/
  var setAutoSort: js.UndefOr[js.Function1[/* autoSort */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  var setFilterRoot: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param sorters Object
  		* @param defaultDirection Object
  		* @returns Array The array you passed after it is sorted.
  		*/
  @JSName("sort")
  var sort_ICollection: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any], Array]
  ] = js.undefined
}

object ICollection {
  @scala.inline
  def apply(
    add: (/* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    addAll: /* addItems */ js.UndefOr[js.Any] => Unit = null,
    addFilter: js.UndefOr[js.Any] => Unit = null,
    addFilters: js.UndefOr[js.Any | Array] => _ = null,
    addSorter: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    addSorters: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    alias: Array = null,
    all: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: () => Unit = null,
    clone: () => IMixedCollection = null,
    config: js.Any = null,
    contains: /* item */ js.UndefOr[js.Any] => Boolean = null,
    containsKey: /* key */ js.UndefOr[java.lang.String] => Boolean = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    destroy: () => Unit = null,
    dirtyFilterFn: js.UndefOr[Boolean] = js.undefined,
    dirtySortFn: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    eachKey: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    extend: java.lang.String = null,
    filter: (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      Array
    ]) = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection = null,
    filterRoot: java.lang.String = null,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filters: Array = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    findIndexBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double = null,
    findInsertionIndex: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double = null,
    first: () => _ = null,
    get: /* key */ js.UndefOr[js.Any] => _ = null,
    getAt: /* index */ js.UndefOr[Double] => _ = null,
    getAutoFilter: () => Boolean = null,
    getAutoSort: () => Boolean = null,
    getByKey: /* key */ js.UndefOr[js.Any] => _ = null,
    getCount: () => Double = null,
    getDefaultSortDirection: () => java.lang.String = null,
    getFilterFn: () => _ = null,
    getFilterRoot: () => java.lang.String = null,
    getFilters: () => Array = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getKey: /* item */ js.UndefOr[js.Any] => _ = null,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array = null,
    getSortFn: () => _ = null,
    getSortRoot: () => java.lang.String = null,
    getSorters: () => Array = null,
    indexOf: /* item */ js.UndefOr[js.Any] => Double = null,
    indexOfKey: /* key */ js.UndefOr[java.lang.String] => Double = null,
    indices: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insert: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    insertFilter: (js.UndefOr[Double], js.UndefOr[js.Any]) => _ = null,
    insertFilters: (js.UndefOr[Double], js.UndefOr[Array]) => Array = null,
    insertSorter: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    insertSorters: () => ICollection = null,
    items: Array = null,
    keys: Array = null,
    last: () => _ = null,
    length: Int | Double = null,
    map: js.Any = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    remove: /* item */ js.UndefOr[js.Any] => _ = null,
    removeAll: /* items */ js.UndefOr[Array] => IMixedCollection = null,
    removeAt: /* index */ js.UndefOr[Double] => _ = null,
    removeAtKey: /* key */ js.UndefOr[java.lang.String] => _ = null,
    removeFilters: js.UndefOr[js.Any | Array] => ICollection | Unit = null,
    removeSorter: /* sorter */ js.UndefOr[js.Any] => Unit = null,
    removeSorters: /* sorters */ js.UndefOr[js.Any] => ICollection = null,
    replace: (/* oldKey */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    self: IClass = null,
    setAutoFilter: /* autoFilter */ js.UndefOr[Boolean] => Unit = null,
    setAutoSort: /* autoSort */ js.UndefOr[Boolean] => Unit = null,
    setDefaultSortDirection: /* defaultSortDirection */ js.UndefOr[java.lang.String] => Unit = null,
    setFilterRoot: js.UndefOr[java.lang.String] => Unit = null,
    setFilters: js.UndefOr[Array] => Unit = null,
    setSortRoot: /* sortRoot */ js.UndefOr[java.lang.String] => Unit = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => Array = null,
    sortRoot: java.lang.String = null,
    sorted: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    statics: js.Any = null,
    uses: Array = null
  ): ICollection = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1(addAll))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction1(addFilter))
    if (addFilters != null) __obj.updateDynamic("addFilters")(js.Any.fromFunction1(addFilters))
    if (addSorter != null) __obj.updateDynamic("addSorter")(js.Any.fromFunction2(addSorter))
    if (addSorters != null) __obj.updateDynamic("addSorters")(js.Any.fromFunction2(addSorters))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1(containsKey))
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn.asInstanceOf[js.Any])
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (eachKey != null) __obj.updateDynamic("eachKey")(js.Any.fromFunction2(eachKey))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction2(findBy))
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(js.Any.fromFunction3(findIndexBy))
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(js.Any.fromFunction2(findInsertionIndex))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction0(first))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getAutoFilter != null) __obj.updateDynamic("getAutoFilter")(js.Any.fromFunction0(getAutoFilter))
    if (getAutoSort != null) __obj.updateDynamic("getAutoSort")(js.Any.fromFunction0(getAutoSort))
    if (getByKey != null) __obj.updateDynamic("getByKey")(js.Any.fromFunction1(getByKey))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(js.Any.fromFunction0(getDefaultSortDirection))
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(js.Any.fromFunction0(getFilterFn))
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(js.Any.fromFunction0(getFilterRoot))
    if (getFilters != null) __obj.updateDynamic("getFilters")(js.Any.fromFunction0(getFilters))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1(getKey))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2(getRange))
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(js.Any.fromFunction0(getSortFn))
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(js.Any.fromFunction0(getSortRoot))
    if (getSorters != null) __obj.updateDynamic("getSorters")(js.Any.fromFunction0(getSorters))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(js.Any.fromFunction1(indexOfKey))
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction3(insert))
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(js.Any.fromFunction2(insertFilter))
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(js.Any.fromFunction2(insertFilters))
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(js.Any.fromFunction3(insertSorter))
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(js.Any.fromFunction0(insertSorters))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction0(last))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1(removeAt))
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(js.Any.fromFunction1(removeAtKey))
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(js.Any.fromFunction1(removeFilters))
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(js.Any.fromFunction1(removeSorter))
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(js.Any.fromFunction1(removeSorters))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2(replace))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAutoFilter != null) __obj.updateDynamic("setAutoFilter")(js.Any.fromFunction1(setAutoFilter))
    if (setAutoSort != null) __obj.updateDynamic("setAutoSort")(js.Any.fromFunction1(setAutoSort))
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(js.Any.fromFunction1(setDefaultSortDirection))
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(js.Any.fromFunction1(setFilterRoot))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1(setFilters))
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(js.Any.fromFunction1(setSortRoot))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1(setSorters))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollection]
  }
}

