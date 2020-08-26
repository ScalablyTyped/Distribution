package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.IFilterable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, currentSortFn, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined filterRoot, filters, dirtyFilterFn, filtered, addFilter, addFilters, filter, getFilterFn, getFilterRoot, getFilters, insertFilter, insertFilters, removeFilters, setFilterRoot, setFilters */ @js.native
trait ICollection
  extends typings.senchaTouch.Ext.mixin.ISortable {
  /** [Method] Adds an item to the collection
    * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param item Object The item to add.
    * @returns Object The item added.
    */
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
    */
  var addAll: js.UndefOr[js.Function1[/* addItems */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method adds a filter
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    */
  var addFilter: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method adds all the filters in a passed array
    * @param filters Object
    * @returns Object
    */
  var addFilters: js.UndefOr[js.Function1[js.UndefOr[js.Any | Array], _]] = js.native
  /** [Property] (Array) */
  var all: js.UndefOr[Array] = js.native
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Creates a shallow copy of this collection
    * @returns Ext.util.MixedCollection
    */
  @JSName("clone")
  var clone_FICollection: js.UndefOr[js.Function0[IMixedCollection]] = js.native
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param item Object The Object to look for in the collection.
    * @returns Boolean true if the collection contains the Object as an item.
    */
  var contains: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean true if the collection contains the Object as a key.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.native
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
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
  ] = js.native
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object[]) */
  var filters: js.UndefOr[Array] = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function.
    */
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.native
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
  ] = js.native
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection.
    */
  var first: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns the value of autoFilter
    * @returns Boolean
    */
  var getAutoFilter: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoSort
    * @returns Boolean
    */
  var getAutoSort: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns an up to date sort function
    * @returns Function sortFn The sort function.
    */
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of filterRoot
    * @returns String
    */
  var getFilterRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of filters
    * @returns Array
    */
  var getFilters: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] MixedCollection has a generic way to fetch keys if you implement getKey
    * @param item Object The item for which to find the key.
    * @returns Object The key for the passed item.
    */
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns a range of items in this collection
    * @param start Number The starting index.
    * @param end Number The ending index. Defaults to the last item.
    * @returns Array An array of items.
    */
  var getRange: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Method] Returns index within the collection of the passed Object
    * @param item Object The item to find the index of.
    * @returns Number Index of the item. Returns -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number Index of the key.
    */
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.native
  /** [Property] (Object) */
  var indices: js.UndefOr[js.Any] = js.native
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
      _
    ]
  ] = js.native
  /** [Method] This method adds a filter at a given index
    * @param index Number The index at which to insert the filter.
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Object
    */
  var insertFilter: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[js.Any], _]] = js.native
  /** [Method] This method inserts all the filters in the passed array at the given index
    * @param index Number The index at which to insert the filters.
    * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Array
    */
  var insertFilters: js.UndefOr[js.Function2[js.UndefOr[Double], js.UndefOr[Array], Array]] = js.native
  /** [Method] This method inserts all the sorters in the passed array at the given index
    * @returns Ext.util.Collection this
    */
  @JSName("insertSorters")
  var insertSorters_ICollection: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Property] (Array) */
  var items: js.UndefOr[Array] = js.native
  /** [Property] (Array) */
  var keys: js.UndefOr[Array] = js.native
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection.
    */
  var last: js.UndefOr[js.Function0[_]] = js.native
  /** [Property] (Number) */
  var length: js.UndefOr[Double] = js.native
  /** [Property] (Object) */
  var map: js.UndefOr[js.Any] = js.native
  /** [Method] Remove an item from the collection
    * @param item Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var remove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Remove all items in the passed array from the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.native
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Removed an item associated with the passed key from the collection
    * @param key String The key of the item to remove.
    * @returns Object/Boolean The item removed or false if no item was removed.
    */
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  /** [Method] This method removes all the filters in a passed array
    * @param filters Object
    * @returns Ext.util.Collection this
    */
  var removeFilters: js.UndefOr[js.Function1[js.UndefOr[js.Any | Array], this.type | Unit]] = js.native
  /** [Method] This method removes all the sorters in a passed array
    * @param sorters Object
    * @returns Ext.util.Collection this
    */
  @JSName("removeSorters")
  var removeSorters_ICollection: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Replaces an item in the collection
    * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  var replace: js.UndefOr[js.Function2[/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of autoFilter
    * @param autoFilter Boolean The new value.
    */
  var setAutoFilter: js.UndefOr[js.Function1[/* autoFilter */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoSort
    * @param autoSort Boolean The new value.
    */
  var setAutoSort: js.UndefOr[js.Function1[/* autoSort */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of filterRoot
    * @param filterRoot String The new value.
    */
  var setFilterRoot: js.UndefOr[js.Function1[js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of filters
    * @param filters Array The new value.
    */
  var setFilters: js.UndefOr[js.Function1[js.UndefOr[Array], Unit]] = js.native
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param sorters Object
    * @param defaultDirection Object
    * @returns Array The array you passed after it is sorted.
    */
  @JSName("sort")
  var sort_ICollection: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any], Array]
  ] = js.native
}

object ICollection {
  @scala.inline
  def apply(): ICollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollection]
  }
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection] (val x: Self) extends AnyVal {
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
    def setAdd(value: (/* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddAll(value: /* addItems */ js.UndefOr[js.Any] => Unit): Self = this.set("addAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddAll: Self = this.set("addAll", js.undefined)
    @scala.inline
    def setAddFilter(value: js.UndefOr[js.Any] => Unit): Self = this.set("addFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddFilter: Self = this.set("addFilter", js.undefined)
    @scala.inline
    def setAddFilters(value: js.UndefOr[js.Any | Array] => _): Self = this.set("addFilters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddFilters: Self = this.set("addFilters", js.undefined)
    @scala.inline
    def setAll(value: Array): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClone(value: () => IMixedCollection): Self = this.set("clone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setContains(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = this.set("containsKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContainsKey: Self = this.set("containsKey", js.undefined)
    @scala.inline
    def setDirtyFilterFn(value: Boolean): Self = this.set("dirtyFilterFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirtyFilterFn: Self = this.set("dirtyFilterFn", js.undefined)
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("each", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setEachKey(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("eachKey", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEachKey: Self = this.set("eachKey", js.undefined)
    @scala.inline
    def setFilterFunction1(value: /* data */ js.UndefOr[Array] => Array): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterFunction4(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[js.Any], /* caseSensitive */ js.UndefOr[js.Any]) => Array
    ): Self = this.set("filter", js.Any.fromFunction4(value))
    @scala.inline
    def setFilter(
      value: (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
          /* property */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[js.Any], 
          /* anyMatch */ js.UndefOr[js.Any], 
          /* caseSensitive */ js.UndefOr[js.Any], 
          Array
        ])
    ): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = this.set("filterBy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    @scala.inline
    def setFilterRoot(value: String): Self = this.set("filterRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterRoot: Self = this.set("filterRoot", js.undefined)
    @scala.inline
    def setFiltered(value: Boolean): Self = this.set("filtered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    @scala.inline
    def setFilters(value: Array): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = this.set("findBy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFindBy: Self = this.set("findBy", js.undefined)
    @scala.inline
    def setFindIndexBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double
    ): Self = this.set("findIndexBy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFindIndexBy: Self = this.set("findIndexBy", js.undefined)
    @scala.inline
    def setFirst(value: () => _): Self = this.set("first", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setGet(value: /* key */ js.UndefOr[js.Any] => _): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => _): Self = this.set("getAt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAt: Self = this.set("getAt", js.undefined)
    @scala.inline
    def setGetAutoFilter(value: () => Boolean): Self = this.set("getAutoFilter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoFilter: Self = this.set("getAutoFilter", js.undefined)
    @scala.inline
    def setGetAutoSort(value: () => Boolean): Self = this.set("getAutoSort", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoSort: Self = this.set("getAutoSort", js.undefined)
    @scala.inline
    def setGetByKey(value: /* key */ js.UndefOr[js.Any] => _): Self = this.set("getByKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetByKey: Self = this.set("getByKey", js.undefined)
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    @scala.inline
    def setGetFilterFn(value: () => _): Self = this.set("getFilterFn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFilterFn: Self = this.set("getFilterFn", js.undefined)
    @scala.inline
    def setGetFilterRoot(value: () => String): Self = this.set("getFilterRoot", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFilterRoot: Self = this.set("getFilterRoot", js.undefined)
    @scala.inline
    def setGetFilters(value: () => Array): Self = this.set("getFilters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFilters: Self = this.set("getFilters", js.undefined)
    @scala.inline
    def setGetKey(value: /* item */ js.UndefOr[js.Any] => _): Self = this.set("getKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
    @scala.inline
    def setGetRange(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = this.set("getRange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetRange: Self = this.set("getRange", js.undefined)
    @scala.inline
    def setIndexOf(value: /* item */ js.UndefOr[js.Any] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    @scala.inline
    def setIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = this.set("indexOfKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOfKey: Self = this.set("indexOfKey", js.undefined)
    @scala.inline
    def setIndices(value: js.Any): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    @scala.inline
    def setInsert(
      value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _
    ): Self = this.set("insert", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setInsertFilter(value: (js.UndefOr[Double], js.UndefOr[js.Any]) => _): Self = this.set("insertFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertFilter: Self = this.set("insertFilter", js.undefined)
    @scala.inline
    def setInsertFilters(value: (js.UndefOr[Double], js.UndefOr[Array]) => Array): Self = this.set("insertFilters", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInsertFilters: Self = this.set("insertFilters", js.undefined)
    @scala.inline
    def setInsertSorters(value: () => ICollection): Self = this.set("insertSorters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInsertSorters: Self = this.set("insertSorters", js.undefined)
    @scala.inline
    def setItems(value: Array): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKeys(value: Array): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLast(value: () => _): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setRemove(value: /* item */ js.UndefOr[js.Any] => _): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = this.set("removeAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    @scala.inline
    def setRemoveAt(value: /* index */ js.UndefOr[Double] => _): Self = this.set("removeAt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAt: Self = this.set("removeAt", js.undefined)
    @scala.inline
    def setRemoveAtKey(value: /* key */ js.UndefOr[String] => _): Self = this.set("removeAtKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveAtKey: Self = this.set("removeAtKey", js.undefined)
    @scala.inline
    def setRemoveFilters(value: js.UndefOr[js.Any | Array] => ICollection | Unit): Self = this.set("removeFilters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveFilters: Self = this.set("removeFilters", js.undefined)
    @scala.inline
    def setRemoveSorters(value: /* sorters */ js.UndefOr[js.Any] => ICollection): Self = this.set("removeSorters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveSorters: Self = this.set("removeSorters", js.undefined)
    @scala.inline
    def setReplace(value: (/* oldKey */ js.UndefOr[String], /* item */ js.UndefOr[js.Any]) => _): Self = this.set("replace", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setSetAutoFilter(value: /* autoFilter */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoFilter: Self = this.set("setAutoFilter", js.undefined)
    @scala.inline
    def setSetAutoSort(value: /* autoSort */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoSort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoSort: Self = this.set("setAutoSort", js.undefined)
    @scala.inline
    def setSetFilterRoot(value: js.UndefOr[String] => Unit): Self = this.set("setFilterRoot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilterRoot: Self = this.set("setFilterRoot", js.undefined)
    @scala.inline
    def setSetFilters(value: js.UndefOr[Array] => Unit): Self = this.set("setFilters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilters: Self = this.set("setFilters", js.undefined)
    @scala.inline
    def setSort(value: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => Array): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

