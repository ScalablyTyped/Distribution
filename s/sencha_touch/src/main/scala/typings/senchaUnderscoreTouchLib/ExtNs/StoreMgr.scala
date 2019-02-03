package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.StoreMgr")
@js.native
class StoreMgr () extends js.Object

/* static members */
@JSGlobal("Ext.StoreMgr")
@js.native
object StoreMgr extends js.Object {
  /** [Property] (Array) */
  var all: senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Property] (Object) */
  var currentSortFn: js.Any = js.native
  /** [Property] (Boolean) */
  var dirtyFilterFn: scala.Boolean = js.native
  /** [Property] (Boolean) */
  var dirtySortFn: scala.Boolean = js.native
  /** [Property] (Boolean) */
  var filtered: scala.Boolean = js.native
  /** [Property] (Object) */
  var indices: js.Any = js.native
  /** [Property] (Array) */
  var items: senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Property] (Array) */
  var keys: senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Property] (Number) */
  var length: scala.Double = js.native
  /** [Property] (Object) */
  var map: js.Any = js.native
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Property] (Boolean) */
  var sorted: scala.Boolean = js.native
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
  def addAll(): scala.Unit = js.native
  def addAll(addItems: js.Any): scala.Unit = js.native
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  def addFilter(): scala.Unit = js.native
  def addFilter(filter: js.Any): scala.Unit = js.native
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
  def addSorter(): scala.Unit = js.native
  def addSorter(sorter: js.Any): scala.Unit = js.native
  def addSorter(sorter: js.Any, defaultDirection: java.lang.String): scala.Unit = js.native
  /** [Method] This method adds all the sorters in a passed array
  		* @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  def addSorters(): scala.Unit = js.native
  def addSorters(sorters: senchaUnderscoreTouchLib.ExtNs.Array): scala.Unit = js.native
  def addSorters(sorters: senchaUnderscoreTouchLib.ExtNs.Array, defaultDirection: java.lang.String): scala.Unit = js.native
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
  def clear(): scala.Unit = js.native
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param item Object The Object to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as an item.
  		*/
  def contains(): scala.Boolean = js.native
  def contains(item: js.Any): scala.Boolean = js.native
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as a key.
  		*/
  def containsKey(): scala.Boolean = js.native
  def containsKey(key: java.lang.String): scala.Boolean = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Executes the specified function once for every item in the collection
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
  		*/
  def each(): scala.Unit = js.native
  def each(fn: js.Any): scala.Unit = js.native
  def each(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
  		* @param fn Function The function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		*/
  def eachKey(): scala.Unit = js.native
  def eachKey(fn: js.Any): scala.Unit = js.native
  def eachKey(fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] This method will sort a collection based on the currently configured sorters
  		* @param property Object
  		* @param value Object
  		* @param anyMatch Object
  		* @param caseSensitive Object
  		* @returns Array
  		*/
  def filter(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def filter(property: js.Any): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def filter(property: js.Any, value: js.Any): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Filter by a function
  		* @param fn Function The function to be called.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @returns Ext.util.MixedCollection The new filtered collection
  		*/
  def filterBy(): senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection = js.native
  def filterBy(fn: js.Any): senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection = js.native
  def filterBy(fn: js.Any, scope: js.Any): senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection = js.native
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
  def findIndexBy(): scala.Double = js.native
  def findIndexBy(fn: js.Any): scala.Double = js.native
  def findIndexBy(fn: js.Any, scope: js.Any): scala.Double = js.native
  def findIndexBy(fn: js.Any, scope: js.Any, start: scala.Double): scala.Double = js.native
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
  		* @param items Array The array that you want to insert the item into.
  		* @param item Mixed The item that you want to insert into the items array.
  		* @returns Number The index for the given item in the given array based on the current sorters.
  		*/
  def findInsertionIndex(): scala.Double = js.native
  def findInsertionIndex(items: senchaUnderscoreTouchLib.ExtNs.Array): scala.Double = js.native
  def findInsertionIndex(items: senchaUnderscoreTouchLib.ExtNs.Array, item: js.Any): scala.Double = js.native
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
  def getAt(index: scala.Double): js.Any = js.native
  /** [Method] Returns the value of autoFilter
  		* @returns Boolean
  		*/
  def getAutoFilter(): scala.Boolean = js.native
  /** [Method] Returns the value of autoSort
  		* @returns Boolean
  		*/
  def getAutoSort(): scala.Boolean = js.native
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  def getByKey(): js.Any = js.native
  def getByKey(key: js.Any): js.Any = js.native
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  def getCount(): scala.Double = js.native
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
  def getFilters(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
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
  def getRange(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def getRange(start: scala.Double): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def getRange(start: scala.Double, end: scala.Double): senchaUnderscoreTouchLib.ExtNs.Array = js.native
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
  def getSorters(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Returns index within the collection of the passed Object
  		* @param item Object The item to find the index of.
  		* @returns Number Index of the item. Returns -1 if not found.
  		*/
  def indexOf(): scala.Double = js.native
  def indexOf(item: js.Any): scala.Double = js.native
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number Index of the key.
  		*/
  def indexOfKey(): scala.Double = js.native
  def indexOfKey(key: java.lang.String): scala.Double = js.native
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
  def insert(index: scala.Double): js.Any = js.native
  def insert(index: scala.Double, key: java.lang.String): js.Any = js.native
  def insert(index: scala.Double, key: java.lang.String, item: js.Any): js.Any = js.native
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  def insertFilter(): js.Any = js.native
  def insertFilter(index: scala.Double): js.Any = js.native
  def insertFilter(index: scala.Double, filter: js.Any): js.Any = js.native
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  def insertFilters(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def insertFilters(index: scala.Double): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def insertFilters(index: scala.Double, filters: senchaUnderscoreTouchLib.ExtNs.Array): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] This method adds a sorter at a given index
  		* @param index Number The index at which to insert the sorter.
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  def insertSorter(): scala.Unit = js.native
  def insertSorter(index: scala.Double): scala.Unit = js.native
  def insertSorter(index: scala.Double, sorter: js.Any): scala.Unit = js.native
  def insertSorter(index: scala.Double, sorter: js.Any, defaultDirection: java.lang.String): scala.Unit = js.native
  /** [Method] This method inserts all the sorters in the passed array at the given index
  		* @returns Ext.util.Collection this
  		*/
  def insertSorters(): senchaUnderscoreTouchLib.ExtNs.utilNs.ICollection = js.native
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection.
  		*/
  def last(): js.Any = js.native
  /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
  		* @param store String/Object The id of the Store, or a Store instance, or a store configuration.
  		* @returns Ext.data.Store
  		*/
  def lookup(): senchaUnderscoreTouchLib.ExtNs.dataNs.IStore = js.native
  def lookup(store: js.Any): senchaUnderscoreTouchLib.ExtNs.dataNs.IStore = js.native
  /** [Method] Registers one or more Stores with the StoreManager
  		* @param stores Ext.data.Store... Any number of Store instances.
  		*/
  def register(stores: senchaUnderscoreTouchLib.ExtNs.dataNs.IStore): scala.Unit = js.native
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
  def removeAll(): senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection = js.native
  def removeAll(items: senchaUnderscoreTouchLib.ExtNs.Array): senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection = js.native
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  def removeAt(): js.Any = js.native
  def removeAt(index: scala.Double): js.Any = js.native
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
  def removeFilters(): senchaUnderscoreTouchLib.ExtNs.utilNs.ICollection = js.native
  def removeFilters(filters: js.Any): senchaUnderscoreTouchLib.ExtNs.utilNs.ICollection = js.native
  /** [Method] This method removes a sorter
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		*/
  def removeSorter(): scala.Unit = js.native
  def removeSorter(sorter: js.Any): scala.Unit = js.native
  /** [Method] This method removes all the sorters in a passed array
  		* @param sorters Object
  		* @returns Ext.util.Collection this
  		*/
  def removeSorters(): senchaUnderscoreTouchLib.ExtNs.utilNs.ICollection = js.native
  def removeSorters(sorters: js.Any): senchaUnderscoreTouchLib.ExtNs.utilNs.ICollection = js.native
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
  def setAutoFilter(): scala.Unit = js.native
  def setAutoFilter(autoFilter: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of autoSort
  		* @param autoSort Boolean The new value.
  		*/
  def setAutoSort(): scala.Unit = js.native
  def setAutoSort(autoSort: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of defaultSortDirection
  		* @param defaultSortDirection String The new value.
  		*/
  def setDefaultSortDirection(): scala.Unit = js.native
  def setDefaultSortDirection(defaultSortDirection: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  def setFilterRoot(): scala.Unit = js.native
  def setFilterRoot(filterRoot: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  def setFilters(): scala.Unit = js.native
  def setFilters(filters: senchaUnderscoreTouchLib.ExtNs.Array): scala.Unit = js.native
  /** [Method] Sets the value of sortRoot
  		* @param sortRoot String The new value.
  		*/
  def setSortRoot(): scala.Unit = js.native
  def setSortRoot(sortRoot: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of sorters
  		* @param sorters Array The new value.
  		*/
  def setSorters(): scala.Unit = js.native
  def setSorters(sorters: senchaUnderscoreTouchLib.ExtNs.Array): scala.Unit = js.native
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param sorters Object
  		* @param defaultDirection Object
  		* @returns Array The array you passed after it is sorted.
  		*/
  def sort(): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def sort(sorters: js.Any): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  def sort(sorters: js.Any, defaultDirection: js.Any): senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Unregisters one or more Stores with the StoreManager
  		* @param stores String/Object... Any number of Store instances or ID-s.
  		*/
  def unregister(): scala.Unit = js.native
  def unregister(stores: js.Any): scala.Unit = js.native
}

