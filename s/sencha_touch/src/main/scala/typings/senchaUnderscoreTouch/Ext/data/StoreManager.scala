package typings.senchaUnderscoreTouch.Ext.data

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.util.ICollection
import typings.senchaUnderscoreTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.StoreManager")
@js.native
class StoreManager () extends js.Object

/* static members */
@JSGlobal("Ext.data.StoreManager")
@js.native
object StoreManager extends js.Object {
  /** [Property] (Array) */
  var all: Array = js.native
  /** [Property] (Object) */
  var currentSortFn: js.Any = js.native
  /** [Property] (Boolean) */
  var dirtyFilterFn: Boolean = js.native
  /** [Property] (Boolean) */
  var dirtySortFn: Boolean = js.native
  /** [Property] (Boolean) */
  var filtered: Boolean = js.native
  /** [Property] (Object) */
  var indices: js.Any = js.native
  /** [Property] (Array) */
  var items: Array = js.native
  /** [Property] (Array) */
  var keys: Array = js.native
  /** [Property] (Number) */
  var length: Double = js.native
  /** [Property] (Object) */
  var map: js.Any = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Property] (Boolean) */
  var sorted: Boolean = js.native
  /** [Method] Adds an item to the collection
  		* @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param item Object The item to add.
  		* @returns Object The item added.
  		*/
  def add(): js.Any = js.native
  def add(key: java.lang.String): js.Any = js.native
  def add(key: java.lang.String, item: js.Any): js.Any = js.native
  /** [Method] Adds all elements of an Array or an Object to the collection
  		* @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
  		*/
  def addAll(): Unit = js.native
  def addAll(addItems: js.Any): Unit = js.native
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  def addFilter(): Unit = js.native
  def addFilter(filter: js.Any): Unit = js.native
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Object
  		* @returns Object
  		*/
  def addFilters(): js.Any = js.native
  def addFilters(filters: js.Any): js.Any = js.native
  /** [Method] This method adds a sorter
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  def addSorter(): Unit = js.native
  def addSorter(sorter: js.Any): Unit = js.native
  def addSorter(sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
  /** [Method] This method adds all the sorters in a passed array
  		* @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  def addSorters(): Unit = js.native
  def addSorters(sorters: Array): Unit = js.native
  def addSorters(sorters: Array, defaultDirection: java.lang.String): Unit = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Removes all items from the collection  */
  def clear(): Unit = js.native
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param item Object The Object to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as an item.
  		*/
  def contains(): Boolean = js.native
  def contains(item: js.Any): Boolean = js.native
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as a key.
  		*/
  def containsKey(): Boolean = js.native
  def containsKey(key: java.lang.String): Boolean = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Executes the specified function once for every item in the collection
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
  		*/
  def each(): Unit = js.native
  def each(fn: js.Any): Unit = js.native
  def each(fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  def eachKey(): Unit = js.native
  def eachKey(fn: js.Any): Unit = js.native
  def eachKey(fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] This method will sort a collection based on the currently configured sorters
  		* @param property Object
  		* @param value Object
  		* @param anyMatch Object
  		* @param caseSensitive Object
  		* @returns Array
  		*/
  def filter(): Array = js.native
  def filter(property: js.Any): Array = js.native
  def filter(property: js.Any, value: js.Any): Array = js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any): Array = js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): Array = js.native
  /** [Method] Filter by a function
  		* @param fn Function The function to be called.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @returns Ext.util.MixedCollection The new filtered collection
  		*/
  def filterBy(): IMixedCollection = js.native
  def filterBy(fn: js.Any): IMixedCollection = js.native
  def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		* @returns Object The first item in the collection which returned true from the selection function.
  		*/
  def findBy(): js.Any = js.native
  def findBy(fn: js.Any): js.Any = js.native
  def findBy(fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Find the index of the first matching object in this collection by a function
  		* @param fn Function The function to be called.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @param start Number The index to start searching at.
  		* @returns Number The matched index, or -1 if the item was not found.
  		*/
  def findIndexBy(): Double = js.native
  def findIndexBy(fn: js.Any): Double = js.native
  def findIndexBy(fn: js.Any, scope: js.Any): Double = js.native
  def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = js.native
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
  		* @param items Array The array that you want to insert the item into.
  		* @param item Mixed The item that you want to insert into the items array.
  		* @returns Number The index for the given item in the given array based on the current sorters.
  		*/
  def findInsertionIndex(): Double = js.native
  def findInsertionIndex(items: Array): Double = js.native
  def findInsertionIndex(items: Array, item: js.Any): Double = js.native
  /** [Method] Returns the first item in the collection
  		* @returns Object the first item in the collection.
  		*/
  def first(): js.Any = js.native
  /** [Method] Returns the item associated with the passed key OR index
  		* @param key String/Number The key or index of the item.
  		* @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
  		*/
  def get(): js.Any = js.native
  def get(key: js.Any): js.Any = js.native
  /** [Method] Returns the item at the specified index
  		* @param index Number The index of the item.
  		* @returns Object The item at the specified index.
  		*/
  def getAt(): js.Any = js.native
  def getAt(index: Double): js.Any = js.native
  /** [Method] Returns the value of autoFilter
  		* @returns Boolean
  		*/
  def getAutoFilter(): Boolean = js.native
  /** [Method] Returns the value of autoSort
  		* @returns Boolean
  		*/
  def getAutoSort(): Boolean = js.native
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  def getByKey(): js.Any = js.native
  def getByKey(key: js.Any): js.Any = js.native
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  def getCount(): Double = js.native
  /** [Method] Returns the value of defaultSortDirection
  		* @returns String
  		*/
  def getDefaultSortDirection(): java.lang.String = js.native
  /** [Method] Returns an up to date sort function
  		* @returns Function sortFn The sort function.
  		*/
  def getFilterFn(): js.Any = js.native
  /** [Method] Returns the value of filterRoot
  		* @returns String
  		*/
  def getFilterRoot(): java.lang.String = js.native
  /** [Method] Returns the value of filters
  		* @returns Array
  		*/
  def getFilters(): Array = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] getKey implementation for MixedCollection
  		* @param o Object
  		* @returns Object The key for the passed item.
  		*/
  def getKey(): js.Any = js.native
  def getKey(o: js.Any): js.Any = js.native
  /** [Method] Returns a range of items in this collection
  		* @param start Number The starting index.
  		* @param end Number The ending index. Defaults to the last item.
  		* @returns Array An array of items.
  		*/
  def getRange(): Array = js.native
  def getRange(start: Double): Array = js.native
  def getRange(start: Double, end: Double): Array = js.native
  /** [Method] Returns an up to date sort function
  		* @returns Function The sort function.
  		*/
  def getSortFn(): js.Any = js.native
  /** [Method] Returns the value of sortRoot
  		* @returns String
  		*/
  def getSortRoot(): java.lang.String = js.native
  /** [Method] Returns the value of sorters
  		* @returns Array
  		*/
  def getSorters(): Array = js.native
  /** [Method] Returns index within the collection of the passed Object
  		* @param item Object The item to find the index of.
  		* @returns Number Index of the item. Returns -1 if not found.
  		*/
  def indexOf(): Double = js.native
  def indexOf(item: js.Any): Double = js.native
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number Index of the key.
  		*/
  def indexOfKey(): Double = js.native
  def indexOfKey(key: java.lang.String): Double = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Number The index to insert the item at.
  		* @param key String The key to associate with the new item, or the item itself.
  		* @param item Object If the second parameter was a key, the new item.
  		* @returns Object The item inserted.
  		*/
  def insert(): js.Any = js.native
  def insert(index: Double): js.Any = js.native
  def insert(index: Double, key: java.lang.String): js.Any = js.native
  def insert(index: Double, key: java.lang.String, item: js.Any): js.Any = js.native
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  def insertFilter(): js.Any = js.native
  def insertFilter(index: Double): js.Any = js.native
  def insertFilter(index: Double, filter: js.Any): js.Any = js.native
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  def insertFilters(): Array = js.native
  def insertFilters(index: Double): Array = js.native
  def insertFilters(index: Double, filters: Array): Array = js.native
  /** [Method] This method adds a sorter at a given index
  		* @param index Number The index at which to insert the sorter.
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  def insertSorter(): Unit = js.native
  def insertSorter(index: Double): Unit = js.native
  def insertSorter(index: Double, sorter: js.Any): Unit = js.native
  def insertSorter(index: Double, sorter: js.Any, defaultDirection: java.lang.String): Unit = js.native
  /** [Method] This method inserts all the sorters in the passed array at the given index
  		* @returns Ext.util.Collection this
  		*/
  def insertSorters(): ICollection = js.native
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection.
  		*/
  def last(): js.Any = js.native
  /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
  		* @param store String/Object The id of the Store, or a Store instance, or a store configuration.
  		* @returns Ext.data.Store
  		*/
  def lookup(): IStore = js.native
  def lookup(store: js.Any): IStore = js.native
  /** [Method] Registers one or more Stores with the StoreManager
  		* @param stores Ext.data.Store... Any number of Store instances.
  		*/
  def register(stores: IStore): Unit = js.native
  /** [Method] Remove an item from the collection
  		* @param item Object The item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  def remove(): js.Any = js.native
  def remove(item: js.Any): js.Any = js.native
  /** [Method] Remove all items in the passed array from the collection
  		* @param items Array An array of items to be removed.
  		* @returns Ext.util.MixedCollection this object
  		*/
  def removeAll(): IMixedCollection = js.native
  def removeAll(items: Array): IMixedCollection = js.native
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  def removeAt(): js.Any = js.native
  def removeAt(index: Double): js.Any = js.native
  /** [Method] Removed an item associated with the passed key from the collection
  		* @param key String The key of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  def removeAtKey(): js.Any = js.native
  def removeAtKey(key: java.lang.String): js.Any = js.native
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Object
  		* @returns Ext.util.Collection this
  		*/
  def removeFilters(): ICollection = js.native
  def removeFilters(filters: js.Any): ICollection = js.native
  /** [Method] This method removes a sorter
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		*/
  def removeSorter(): Unit = js.native
  def removeSorter(sorter: js.Any): Unit = js.native
  /** [Method] This method removes all the sorters in a passed array
  		* @param sorters Object
  		* @returns Ext.util.Collection this
  		*/
  def removeSorters(): ICollection = js.native
  def removeSorters(sorters: js.Any): ICollection = js.native
  /** [Method] Replaces an item in the collection
  		* @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
  		* @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
  		* @returns Object The new item.
  		*/
  def replace(): js.Any = js.native
  def replace(oldKey: java.lang.String): js.Any = js.native
  def replace(oldKey: java.lang.String, item: js.Any): js.Any = js.native
  /** [Method] Sets the value of autoFilter
  		* @param autoFilter Boolean The new value.
  		*/
  def setAutoFilter(): Unit = js.native
  def setAutoFilter(autoFilter: Boolean): Unit = js.native
  /** [Method] Sets the value of autoSort
  		* @param autoSort Boolean The new value.
  		*/
  def setAutoSort(): Unit = js.native
  def setAutoSort(autoSort: Boolean): Unit = js.native
  /** [Method] Sets the value of defaultSortDirection
  		* @param defaultSortDirection String The new value.
  		*/
  def setDefaultSortDirection(): Unit = js.native
  def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = js.native
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  def setFilterRoot(): Unit = js.native
  def setFilterRoot(filterRoot: java.lang.String): Unit = js.native
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  def setFilters(): Unit = js.native
  def setFilters(filters: Array): Unit = js.native
  /** [Method] Sets the value of sortRoot
  		* @param sortRoot String The new value.
  		*/
  def setSortRoot(): Unit = js.native
  def setSortRoot(sortRoot: java.lang.String): Unit = js.native
  /** [Method] Sets the value of sorters
  		* @param sorters Array The new value.
  		*/
  def setSorters(): Unit = js.native
  def setSorters(sorters: Array): Unit = js.native
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param sorters Object
  		* @param defaultDirection Object
  		* @returns Array The array you passed after it is sorted.
  		*/
  def sort(): Array = js.native
  def sort(sorters: js.Any): Array = js.native
  def sort(sorters: js.Any, defaultDirection: js.Any): Array = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Unregisters one or more Stores with the StoreManager
  		* @param stores String/Object... Any number of Store instances or ID-s.
  		*/
  def unregister(): Unit = js.native
  def unregister(stores: js.Any): Unit = js.native
}

