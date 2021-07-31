package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.data.IStore
import typings.senchaTouch.Ext.util.ICollection
import typings.senchaTouch.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.StoreMgr")
@js.native
class StoreMgr ()
  extends StObject
     with typings.senchaTouch.Ext.StoreMgr
/* static members */
object StoreMgr {
  
  @JSGlobal("Ext.StoreMgr")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Adds an item to the collection
    * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param item Object The item to add.
    * @returns Object The item added.
    */
  @scala.inline
  def add(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[js.Any]
  @scala.inline
  def add(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def add(key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def add(key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param addItems Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if {@link} Ext.util.MixedCollection.allowFunctions allowFunctions} has been set to true.
    */
  @scala.inline
  def addAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")().asInstanceOf[Unit]
  @scala.inline
  def addAll(addItems: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(addItems.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method adds a filter
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    */
  @scala.inline
  def addFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")().asInstanceOf[Unit]
  @scala.inline
  def addFilter(filter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method adds all the filters in a passed array
    * @param filters Object
    * @returns Object
    */
  @scala.inline
  def addFilters(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")().asInstanceOf[js.Any]
  @scala.inline
  def addFilters(filters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method adds a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  @scala.inline
  def addSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")().asInstanceOf[Unit]
  @scala.inline
  def addSorter(sorter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addSorter(sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addSorter(sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorter")(sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This method adds all the sorters in a passed array
    * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  @scala.inline
  def addSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")().asInstanceOf[Unit]
  @scala.inline
  def addSorters(sorters: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addSorters(sorters: typings.senchaTouch.Ext.Array, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSorters")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreMgr.all")
  @js.native
  def all: typings.senchaTouch.Ext.Array = js.native
  @scala.inline
  def all_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  @scala.inline
  def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  @scala.inline
  def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  @scala.inline
  def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  @scala.inline
  def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  @scala.inline
  def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  @scala.inline
  def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Removes all items from the collection  */
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param item Object The Object to look for in the collection.
    * @returns Boolean true if the collection contains the Object as an item.
    */
  @scala.inline
  def contains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")().asInstanceOf[Boolean]
  @scala.inline
  def contains(item: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean true if the collection contains the Object as a key.
    */
  @scala.inline
  def containsKey(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")().asInstanceOf[Boolean]
  @scala.inline
  def containsKey(key: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreMgr.currentSortFn")
  @js.native
  def currentSortFn: js.Any = js.native
  @scala.inline
  def currentSortFn_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentSortFn")(x.asInstanceOf[js.Any])
  
  /** [Method]  */
  @scala.inline
  def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.dirtyFilterFn")
  @js.native
  def dirtyFilterFn: Boolean = js.native
  @scala.inline
  def dirtyFilterFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtyFilterFn")(x.asInstanceOf[js.Any])
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.dirtySortFn")
  @js.native
  def dirtySortFn: Boolean = js.native
  @scala.inline
  def dirtySortFn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirtySortFn")(x.asInstanceOf[js.Any])
  
  /** [Method] Executes the specified function once for every item in the collection
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
    */
  @scala.inline
  def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  @scala.inline
  def each(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def each(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def each(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
    * @param fn Function The function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  @scala.inline
  def eachKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")().asInstanceOf[Unit]
  @scala.inline
  def eachKey(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def eachKey(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def eachKey(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachKey")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This method will sort a collection based on the currently configured sorters
    * @param property Object
    * @param value Object
    * @param anyMatch Object
    * @param caseSensitive Object
    * @returns Array
    */
  @scala.inline
  def filter(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any, value: js.Any, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any, value: Unit, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any, value: Unit, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: js.Any, value: Unit, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: Unit, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: Unit, value: js.Any, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: Unit, value: js.Any, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: Unit, value: js.Any, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: Unit, value: Unit, anyMatch: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: Unit, value: Unit, anyMatch: js.Any, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def filter(property: Unit, value: Unit, anyMatch: Unit, caseSensitive: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any], anyMatch.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Filter by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  @scala.inline
  def filterBy(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")().asInstanceOf[IMixedCollection]
  @scala.inline
  def filterBy(fn: js.Any): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
  @scala.inline
  def filterBy(fn: js.Any, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
  @scala.inline
  def filterBy(fn: Unit, scope: js.Any): IMixedCollection = (^.asInstanceOf[js.Dynamic].applyDynamic("filterBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IMixedCollection]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.filtered")
  @js.native
  def filtered: Boolean = js.native
  @scala.inline
  def filtered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filtered")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function.
    */
  @scala.inline
  def findBy(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")().asInstanceOf[js.Any]
  @scala.inline
  def findBy(fn: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def findBy(fn: js.Any, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def findBy(fn: Unit, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index, or -1 if the item was not found.
    */
  @scala.inline
  def findIndexBy(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")().asInstanceOf[Double]
  @scala.inline
  def findIndexBy(fn: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def findIndexBy(fn: js.Any, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def findIndexBy(fn: js.Any, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def findIndexBy(fn: js.Any, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def findIndexBy(fn: Unit, scope: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def findIndexBy(fn: Unit, scope: js.Any, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def findIndexBy(fn: Unit, scope: Unit, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexBy")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
    * @param items Array The array that you want to insert the item into.
    * @param item Mixed The item that you want to insert into the items array.
    * @returns Number The index for the given item in the given array based on the current sorters.
    */
  @scala.inline
  def findInsertionIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")().asInstanceOf[Double]
  @scala.inline
  def findInsertionIndex(items: Unit, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def findInsertionIndex(items: typings.senchaTouch.Ext.Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def findInsertionIndex(items: typings.senchaTouch.Ext.Array, item: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findInsertionIndex")(items.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Returns the first item in the collection
    * @returns Object the first item in the collection.
    */
  @scala.inline
  def first(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[js.Any]
  
  /** [Method] Returns the item associated with the passed key OR index
    * @param key String/Number The key or index of the item.
    * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
    */
  @scala.inline
  def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
  @scala.inline
  def get(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns the item at the specified index
    * @param index Number The index of the item.
    * @returns Object The item at the specified index.
    */
  @scala.inline
  def getAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")().asInstanceOf[js.Any]
  @scala.inline
  def getAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns the value of autoFilter
    * @returns Boolean
    */
  @scala.inline
  def getAutoFilter(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoFilter")().asInstanceOf[Boolean]
  
  /** [Method] Returns the value of autoSort
    * @returns Boolean
    */
  @scala.inline
  def getAutoSort(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoSort")().asInstanceOf[Boolean]
  
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  @scala.inline
  def getByKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")().asInstanceOf[js.Any]
  @scala.inline
  def getByKey(key: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getByKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  @scala.inline
  def getCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")().asInstanceOf[Double]
  
  /** [Method] Returns the value of defaultSortDirection
    * @returns String
    */
  @scala.inline
  def getDefaultSortDirection(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultSortDirection")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns an up to date sort function
    * @returns Function sortFn The sort function.
    */
  @scala.inline
  def getFilterFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterFn")().asInstanceOf[js.Any]
  
  /** [Method] Returns the value of filterRoot
    * @returns String
    */
  @scala.inline
  def getFilterRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterRoot")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of filters
    * @returns Array
    */
  @scala.inline
  def getFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  @scala.inline
  def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] getKey implementation for MixedCollection
    * @param o Object
    * @returns Object The key for the passed item.
    */
  @scala.inline
  def getKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[js.Any]
  @scala.inline
  def getKey(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns a range of items in this collection
    * @param start Number The starting index.
    * @param end Number The ending index. Defaults to the last item.
    * @returns Array An array of items.
    */
  @scala.inline
  def getRange(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def getRange(start: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def getRange(start: Double, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def getRange(start: Unit, end: Double): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns an up to date sort function
    * @returns Function The sort function.
    */
  @scala.inline
  def getSortFn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortFn")().asInstanceOf[js.Any]
  
  /** [Method] Returns the value of sortRoot
    * @returns String
    */
  @scala.inline
  def getSortRoot(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSortRoot")().asInstanceOf[java.lang.String]
  
  /** [Method] Returns the value of sorters
    * @returns Array
    */
  @scala.inline
  def getSorters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getSorters")().asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Returns index within the collection of the passed Object
    * @param item Object The item to find the index of.
    * @returns Number Index of the item. Returns -1 if not found.
    */
  @scala.inline
  def indexOf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")().asInstanceOf[Double]
  @scala.inline
  def indexOf(item: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(item.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number Index of the key.
    */
  @scala.inline
  def indexOfKey(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")().asInstanceOf[Double]
  @scala.inline
  def indexOfKey(key: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("indexOfKey")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreMgr.indices")
  @js.native
  def indices: js.Any = js.native
  @scala.inline
  def indices_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indices")(x.asInstanceOf[js.Any])
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  @scala.inline
  def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
  @scala.inline
  def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String The key to associate with the new item, or the item itself.
    * @param item Object If the second parameter was a key, the new item.
    * @returns Object The item inserted.
    */
  @scala.inline
  def insert(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")().asInstanceOf[js.Any]
  @scala.inline
  def insert(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def insert(index: Double, key: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def insert(index: Double, key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def insert(index: Double, key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def insert(index: Unit, key: java.lang.String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def insert(index: Unit, key: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def insert(index: Unit, key: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(index.asInstanceOf[js.Any], key.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] This method adds a filter at a given index
    * @param index Number The index at which to insert the filter.
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Object
    */
  @scala.inline
  def insertFilter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")().asInstanceOf[js.Any]
  @scala.inline
  def insertFilter(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def insertFilter(index: Double, filter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def insertFilter(index: Unit, filter: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilter")(index.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] This method inserts all the filters in the passed array at the given index
    * @param index Number The index at which to insert the filters.
    * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Array
    */
  @scala.inline
  def insertFilters(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insertFilters(index: Double): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insertFilters(index: Double, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def insertFilters(index: Unit, filters: typings.senchaTouch.Ext.Array): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("insertFilters")(index.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] This method adds a sorter at a given index
    * @param index Number The index at which to insert the sorter.
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  @scala.inline
  def insertSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")().asInstanceOf[Unit]
  @scala.inline
  def insertSorter(index: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def insertSorter(index: Double, sorter: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def insertSorter(index: Double, sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def insertSorter(index: Double, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def insertSorter(index: Unit, sorter: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def insertSorter(index: Unit, sorter: js.Any, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def insertSorter(index: Unit, sorter: Unit, defaultDirection: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSorter")(index.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] This method inserts all the sorters in the passed array at the given index
    * @returns Ext.util.Collection this
    */
  @scala.inline
  def insertSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("insertSorters")().asInstanceOf[ICollection]
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreMgr.items")
  @js.native
  def items: typings.senchaTouch.Ext.Array = js.native
  @scala.inline
  def items_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
  
  /** [Property] (Array) */
  @JSGlobal("Ext.StoreMgr.keys")
  @js.native
  def keys: typings.senchaTouch.Ext.Array = js.native
  @scala.inline
  def keys_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection.
    */
  @scala.inline
  def last(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("last")().asInstanceOf[js.Any]
  
  /** [Property] (Number) */
  @JSGlobal("Ext.StoreMgr.length")
  @js.native
  def length: Double = js.native
  @scala.inline
  def length_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("length")(x.asInstanceOf[js.Any])
  
  /** [Method] Gets a registered Store by its id returns a passed store instance or returns a new instance of a store created with
    * @param store String/Object The id of the Store, or a Store instance, or a store configuration.
    * @returns Ext.data.Store
    */
  @scala.inline
  def lookup(): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")().asInstanceOf[IStore]
  @scala.inline
  def lookup(store: js.Any): IStore = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(store.asInstanceOf[js.Any]).asInstanceOf[IStore]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.StoreMgr.map")
  @js.native
  def map: js.Any = js.native
  @scala.inline
  def map_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
  
  /** [Method] Registers one or more Stores with the StoreManager
    * @param stores Ext.data.Store... Any number of Store instances.
    */
  @scala.inline
  def register(stores: IStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Remove an item from the collection
    * @param item Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  @scala.inline
  def remove(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[js.Any]
  @scala.inline
  def remove(item: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Remove all items in the passed array from the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  @scala.inline
  def removeAll(): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[IMixedCollection]
  @scala.inline
  def removeAll(items: typings.senchaTouch.Ext.Array): IMixedCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(items.asInstanceOf[js.Any]).asInstanceOf[IMixedCollection]
  
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  @scala.inline
  def removeAt(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")().asInstanceOf[js.Any]
  @scala.inline
  def removeAt(index: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(index.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Removed an item associated with the passed key from the collection
    * @param key String The key of the item to remove.
    * @returns Object/Boolean The item removed or false if no item was removed.
    */
  @scala.inline
  def removeAtKey(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")().asInstanceOf[js.Any]
  @scala.inline
  def removeAtKey(key: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAtKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method removes all the filters in a passed array
    * @param filters Object
    * @returns Ext.util.Collection this
    */
  @scala.inline
  def removeFilters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")().asInstanceOf[ICollection]
  @scala.inline
  def removeFilters(filters: js.Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
  
  /** [Method] This method removes a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    */
  @scala.inline
  def removeSorter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")().asInstanceOf[Unit]
  @scala.inline
  def removeSorter(sorter: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorter")(sorter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method removes all the sorters in a passed array
    * @param sorters Object
    * @returns Ext.util.Collection this
    */
  @scala.inline
  def removeSorters(): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")().asInstanceOf[ICollection]
  @scala.inline
  def removeSorters(sorters: js.Any): ICollection = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[ICollection]
  
  /** [Method] Replaces an item in the collection
    * @param oldKey String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param item Object {Object} item (optional) If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  @scala.inline
  def replace(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[js.Any]
  @scala.inline
  def replace(oldKey: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def replace(oldKey: java.lang.String, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def replace(oldKey: Unit, item: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(oldKey.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.StoreMgr.self")
  @js.native
  def self: IClass = js.native
  @scala.inline
  def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Sets the value of autoFilter
    * @param autoFilter Boolean The new value.
    */
  @scala.inline
  def setAutoFilter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")().asInstanceOf[Unit]
  @scala.inline
  def setAutoFilter(autoFilter: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFilter")(autoFilter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of autoSort
    * @param autoSort Boolean The new value.
    */
  @scala.inline
  def setAutoSort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")().asInstanceOf[Unit]
  @scala.inline
  def setAutoSort(autoSort: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoSort")(autoSort.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of defaultSortDirection
    * @param defaultSortDirection String The new value.
    */
  @scala.inline
  def setDefaultSortDirection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")().asInstanceOf[Unit]
  @scala.inline
  def setDefaultSortDirection(defaultSortDirection: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of filterRoot
    * @param filterRoot String The new value.
    */
  @scala.inline
  def setFilterRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")().asInstanceOf[Unit]
  @scala.inline
  def setFilterRoot(filterRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilterRoot")(filterRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of filters
    * @param filters Array The new value.
    */
  @scala.inline
  def setFilters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")().asInstanceOf[Unit]
  @scala.inline
  def setFilters(filters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of sortRoot
    * @param sortRoot String The new value.
    */
  @scala.inline
  def setSortRoot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")().asInstanceOf[Unit]
  @scala.inline
  def setSortRoot(sortRoot: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSortRoot")(sortRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Sets the value of sorters
    * @param sorters Array The new value.
    */
  @scala.inline
  def setSorters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")().asInstanceOf[Unit]
  @scala.inline
  def setSorters(sorters: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSorters")(sorters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param sorters Object
    * @param defaultDirection Object
    * @returns Array The array you passed after it is sorted.
    */
  @scala.inline
  def sort(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")().asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def sort(sorters: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def sort(sorters: js.Any, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  @scala.inline
  def sort(sorters: Unit, defaultDirection: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(sorters.asInstanceOf[js.Any], defaultDirection.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.StoreMgr.sorted")
  @js.native
  def sorted: Boolean = js.native
  @scala.inline
  def sorted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sorted")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  @scala.inline
  def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
  
  /** [Method] Unregisters one or more Stores with the StoreManager
    * @param stores String/Object... Any number of Store instances or ID-s.
    */
  @scala.inline
  def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
  @scala.inline
  def unregister(stores: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(stores.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
