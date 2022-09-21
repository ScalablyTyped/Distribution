package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.data.IStore
import typings.senchaTouch.Ext.util.ICollection
import typings.senchaTouch.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.StoreManager")
@js.native
open class StoreManager ()
  extends StObject
     with typings.senchaTouch.Ext.StoreManager
/* static members */
object StoreManager {
  
  @JSGlobal("Ext.StoreManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds an item to the collection
    * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param item Object The item to add.
    * @returns Object The item added.
    */
  inline def add(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Any]
  inline def add(key: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def add(key: java.lang.String, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def add(key: Unit, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
    */
  inline def addAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")().asInstanceOf[Unit]
  inline def addAll(addItems: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(addItems.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method adds a filter
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    */
  inline def addFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")().asInstanceOf[Unit]
  inline def addFilter(filter: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method adds all the filters in a passed array
    * @param filters Object
    * @returns Object
    */
  inline def addFilters(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")().asInstanceOf[Any]
  inline def addFilters(filters: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method adds a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  inline def addSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")().asInstanceOf[Unit]
  inline def addSorter(sorter: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addSorter(sorter: Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSorter(sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This method adds all the sorters in a passed array
    * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  inline def addSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")().asInstanceOf[Unit]
  inline def addSorters(sorters: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addSorters(sorters: typings.senchaTouch.Ext.Array, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreManager.all")
  @js.native
  def all: typings.senchaTouch.Ext.Array = js.native
  inline def all_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[Any]
  inline def callOverridden(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Any]
  inline def callParent(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[Any]
  inline def callSuper(args: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Removes all items from the collection  */
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param item Object The Object to look for in the collection.
    * @returns Boolean true if the collection contains the Object as an item.
    */
  inline def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
  inline def contains(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean true if the collection contains the Object as a key.
    */
  inline def containsKey(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")().asInstanceOf[Boolean]
  inline def containsKey(key: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreManager.currentSortFn")
  @js.native
  def currentSortFn: Any = js.native
  inline def currentSortFn_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(x.asInstanceOf[js.Any])
  
  /** [Method]  */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreManager.dirtyFilterFn")
  @js.native
  def dirtyFilterFn: Boolean = js.native
  inline def dirtyFilterFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreManager.dirtySortFn")
  @js.native
  def dirtySortFn: Boolean = js.native
  inline def dirtySortFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(x.asInstanceOf[js.Any])
  
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  inline def each(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def each(fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  inline def eachKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")().asInstanceOf[Unit]
  inline def eachKey(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def eachKey(fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def eachKey(fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This method will sort a collection based on the currently configured sorters
    * @param property Object
    * @param value Object
    * @param anyMatch Object
    * @param caseSensitive Object
    * @returns Array
    */
  inline def filter(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any, value: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any, value: Any, anyMatch: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any, value: Any, anyMatch: Any, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any, value: Any, anyMatch: Unit, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any, value: Unit, anyMatch: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any, value: Unit, anyMatch: Any, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Any, value: Unit, anyMatch: Unit, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Unit, value: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Unit, value: Any, anyMatch: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Unit, value: Any, anyMatch: Any, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Unit, value: Any, anyMatch: Unit, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Unit, value: Unit, anyMatch: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Unit, value: Unit, anyMatch: Any, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def filter(property: Unit, value: Unit, anyMatch: Unit, caseSensitive: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  inline def filterBy(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")().asInstanceOf[IMixedCollection]
  inline def filterBy(fn: Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
  inline def filterBy(fn: Any, scope: Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
  inline def filterBy(fn: Unit, scope: Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreManager.filtered")
  @js.native
  def filtered: Boolean = js.native
  inline def filtered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filtered")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function.
    */
  inline def findBy(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")().asInstanceOf[Any]
  inline def findBy(fn: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def findBy(fn: Any, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findBy(fn: Unit, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index, or -1 if the item was not found.
    */
  inline def findIndexBy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")().asInstanceOf[Double]
  inline def findIndexBy(fn: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def findIndexBy(fn: Any, scope: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndexBy(fn: Any, scope: Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndexBy(fn: Any, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndexBy(fn: Unit, scope: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndexBy(fn: Unit, scope: Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findIndexBy(fn: Unit, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
    * @param items Array The array that you want to insert the item into.
    * @param item Mixed The item that you want to insert into the items array.
    * @returns Number The index for the given item in the given array based on the current sorters.
    */
  inline def findInsertionIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")().asInstanceOf[Double]
  inline def findInsertionIndex(items: Unit, item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findInsertionIndex(items: typings.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def findInsertionIndex(items: typings.senchaTouch.Ext.Array, item: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection.
    */
  inline def first(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[Any]
  
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  inline def get(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Any]
  inline def get(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  inline def getAt(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")().asInstanceOf[Any]
  inline def getAt(index: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")(index.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns the value of autoFilter
    * @returns Boolean
    */
  inline def getAutoFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoFilter")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of autoSort
    * @returns Boolean
    */
  inline def getAutoSort(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoSort")().asInstanceOf[Boolean]
  
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  inline def getByKey(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")().asInstanceOf[Any]
  inline def getByKey(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  inline def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
  
  /** [Method] Returns the value of defaultSortDirection
    * @returns String
    */
  inline def getDefaultSortDirection(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSortDirection")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns an up to date sort function
    * @returns Function sortFn The sort function.
    */
  inline def getFilterFn(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterFn")().asInstanceOf[Any]
  
  /** [Method] Returns the value of filterRoot
    * @returns String
    */
  inline def getFilterRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterRoot")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of filters
    * @returns Array
    */
  inline def getFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  inline def getInitialConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[Any]
  inline def getInitialConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] getKey implementation for MixedCollection
    * @param o Object
    * @returns Object The key for the passed item.
    */
  inline def getKey(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[Any]
  inline def getKey(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Returns a range of items in this collection
    * @param start Number The starting index.
    * @param end Number The ending index. Defaults to the last item.
    * @returns Array An array of items.
    */
  inline def getRange(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def getRange(start: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def getRange(start: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def getRange(start: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns an up to date sort function
    * @returns Function The sort function.
    */
  inline def getSortFn(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortFn")().asInstanceOf[Any]
  
  /** [Method] Returns the value of sortRoot
    * @returns String
    */
  inline def getSortRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortRoot")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of sorters
    * @returns Array
    */
  inline def getSorters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getSorters")().asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns index within the collection of the passed Object
    * @param item Object The item to find the index of.
    * @returns Number Index of the item. Returns -1 if not found.
    */
  inline def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
  inline def indexOf(item: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number Index of the key.
    */
  inline def indexOfKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")().asInstanceOf[Double]
  inline def indexOfKey(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreManager.indices")
  @js.native
  def indices: Any = js.native
  inline def indices_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indices")(x.asInstanceOf[js.Any])
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  inline def initConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[Any]
  inline def initConfig(instanceConfig: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String The key to associate with the new item, or the item itself.
    * @param item Object If the second parameter was a key, the new item.
    * @returns Object The item inserted.
    */
  inline def insert(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[Any]
  inline def insert(index: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def insert(index: Double, key: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def insert(index: Double, key: java.lang.String, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def insert(index: Double, key: Unit, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def insert(index: Unit, key: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def insert(index: Unit, key: java.lang.String, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def insert(index: Unit, key: Unit, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] This method adds a filter at a given index
    * @param index Number The index at which to insert the filter.
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Object
    */
  inline def insertFilter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")().asInstanceOf[Any]
  inline def insertFilter(index: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def insertFilter(index: Double, filter: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def insertFilter(index: Unit, filter: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] This method inserts all the filters in the passed array at the given index
    * @param index Number The index at which to insert the filters.
    * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Array
    */
  inline def insertFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def insertFilters(index: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def insertFilters(index: Double, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def insertFilters(index: Unit, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] This method adds a sorter at a given index
    * @param index Number The index at which to insert the sorter.
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  inline def insertSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")().asInstanceOf[Unit]
  inline def insertSorter(index: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insertSorter(index: Double, sorter: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertSorter(index: Double, sorter: Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertSorter(index: Double, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertSorter(index: Unit, sorter: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertSorter(index: Unit, sorter: Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insertSorter(index: Unit, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This method inserts all the sorters in the passed array at the given index
    * @returns Ext.util.Collection this
    */
  inline def insertSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorters")().asInstanceOf[ICollection]
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreManager.items")
  @js.native
  def items: typings.senchaTouch.Ext.Array = js.native
  inline def items_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreManager.keys")
  @js.native
  def keys: typings.senchaTouch.Ext.Array = js.native
  inline def keys_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection.
    */
  inline def last(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[Any]
  
  /** [Property] (Number) */
  @JSGlobal("Ext.StoreManager.length")
  @js.native
  def length: Double = js.native
  inline def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
  
  /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
    * @param store String/Object The id of the Store, or a Store instance, or a store configuration.
    * @returns Ext.data.Store
    */
  inline def lookup(): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")().asInstanceOf[IStore]
  inline def lookup(store: Any): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(store.asInstanceOf[js.Any]).asInstanceOf[IStore]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreManager.map")
  @js.native
  def map: Any = js.native
  inline def map_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
  
  /** [Method] Registers one or more Stores with the StoreManager
    * @param stores Ext.data.Store... Any number of Store instances.
    */
  inline def register(stores: IStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Remove an item from the collection
    * @param item Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  inline def remove(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Any]
  inline def remove(item: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Remove all items in the passed array from the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  inline def removeAll(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[IMixedCollection]
  inline def removeAll(items: typings.senchaTouch.Ext.Array): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(items.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
  
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  inline def removeAt(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")().asInstanceOf[Any]
  inline def removeAt(index: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(index.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Removed an item associated with the passed key from the collection
    * @param key String The key of the item to remove.
    * @returns Object/Boolean The item removed or false if no item was removed.
    */
  inline def removeAtKey(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")().asInstanceOf[Any]
  inline def removeAtKey(key: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] This method removes all the filters in a passed array
    * @param filters Object
    * @returns Ext.util.Collection this
    */
  inline def removeFilters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")().asInstanceOf[ICollection]
  inline def removeFilters(filters: Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
  
  /** [Method] This method removes a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    */
  inline def removeSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")().asInstanceOf[Unit]
  inline def removeSorter(sorter: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method removes all the sorters in a passed array
    * @param sorters Object
    * @returns Ext.util.Collection this
    */
  inline def removeSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")().asInstanceOf[ICollection]
  inline def removeSorters(sorters: Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
  
  /** [Method] Replaces an item in the collection
    * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  inline def replace(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[Any]
  inline def replace(oldKey: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def replace(oldKey: java.lang.String, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def replace(oldKey: Unit, item: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.StoreManager.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sets the value of autoFilter
    * @param autoFilter Boolean The new value.
    */
  inline def setAutoFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")().asInstanceOf[Unit]
  inline def setAutoFilter(autoFilter: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")(autoFilter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of autoSort
    * @param autoSort Boolean The new value.
    */
  inline def setAutoSort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")().asInstanceOf[Unit]
  inline def setAutoSort(autoSort: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")(autoSort.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultSortDirection
    * @param defaultSortDirection String The new value.
    */
  inline def setDefaultSortDirection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")().asInstanceOf[Unit]
  inline def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of filterRoot
    * @param filterRoot String The new value.
    */
  inline def setFilterRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")().asInstanceOf[Unit]
  inline def setFilterRoot(filterRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")(filterRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of filters
    * @param filters Array The new value.
    */
  inline def setFilters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")().asInstanceOf[Unit]
  inline def setFilters(filters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of sortRoot
    * @param sortRoot String The new value.
    */
  inline def setSortRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")().asInstanceOf[Unit]
  inline def setSortRoot(sortRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")(sortRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of sorters
    * @param sorters Array The new value.
    */
  inline def setSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")().asInstanceOf[Unit]
  inline def setSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param sorters Object
    * @param defaultDirection Object
    * @returns Array The array you passed after it is sorted.
    */
  inline def sort(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def sort(sorters: Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def sort(sorters: Any, defaultDirection: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def sort(sorters: Unit, defaultDirection: Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreManager.sorted")
  @js.native
  def sorted: Boolean = js.native
  inline def sorted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorted")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Unregisters one or more Stores with the StoreManager
    * @param stores String/Object... Any number of Store instances or ID-s.
    */
  inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
  inline def unregister(stores: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
