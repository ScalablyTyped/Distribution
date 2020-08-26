package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractMixedCollection
  extends typings.senchaTouch.Ext.mixin.IObservable {
  /** [Method] Adds an item to the collection
    * @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
    * @param obj Object The item to add.
    * @returns Object The item added.
    */
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* obj */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Adds all elements of an Array or an Object to the collection
    * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
    */
  var addAll: js.UndefOr[js.Function1[/* objs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var allowFunctions: js.UndefOr[Boolean] = js.native
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Creates a shallow copy of this collection
    * @returns Ext.util.MixedCollection
    */
  @JSName("clone")
  var clone_FIAbstractMixedCollection: js.UndefOr[js.Function0[IMixedCollection]] = js.native
  /** [Method] Collects unique values of a particular property in this MixedCollection
    * @param property String The property to collect on.
    * @param root String Optional 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the data object.
    * @param allowNull Boolean Pass true to allow null, undefined, or empty string values.
    * @returns Array The unique values.
    */
  var collect: js.UndefOr[
    js.Function3[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* allowNull */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.native
  /** [Method] Returns true if the collection contains the passed Object as an item
    * @param o Object The Object to look for in the collection.
    * @returns Boolean true if the collection contains the Object as an item.
    */
  var contains: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns true if the collection contains the passed Object as a key
    * @param key String The key to look for in the collection.
    * @returns Boolean true if the collection contains the Object as a key.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
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
  /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
    * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
    * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property.
    * @param anyMatch Boolean true to match any part of the string, not just the beginning
    * @param caseSensitive Boolean true for case sensitive comparison.
    * @returns Ext.util.MixedCollection The new filtered collection
    */
  var filter: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.native
  /** [Method] Filter by a function
    * @param fn Function The function to be called, it will receive the args o (the object), k (the key)
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @returns Ext.util.MixedCollection The new filtered collection.
    */
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    * @returns Object The first item in the collection which returned true from the selection function.
    */
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Finds the index of the first matching object in this collection by a specific property value
    * @param property String The name of a property on your objects.
    * @param value String/RegExp A string that the property values. should start with or a RegExp to test against the property.
    * @param start Number The index to start searching at.
    * @param anyMatch Boolean true to match any part of the string, not just the beginning.
    * @param caseSensitive Boolean true for case sensitive comparison.
    * @returns Number The matched index or -1.
    */
  var findIndex: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  /** [Method] Find the index of the first matching object in this collection by a function
    * @param fn Function The function to be called, it will receive the args o (the object), k (the key).
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
    * @param start Number The index to start searching at.
    * @returns Number The matched index or -1.
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
    * @returns Object the first item in the collection..
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
  /** [Method] Returns the item associated with the passed key
    * @param key String/Number The key of the item.
    * @returns Object The item associated with the passed key.
    */
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] MixedCollection has a generic way to fetch keys if you implement getKey
    * @param item Object The item for which to find the key.
    * @returns Object The key for the passed item.
    */
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns a range of items in this collection
    * @param start Number The starting index.
    * @param end Number The ending index.
    * @returns Array An array of items
    */
  var getRange: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.native
  /** [Method] Returns index within the collection of the passed Object
    * @param o Object The item to find the index of.
    * @returns Number index of the item. Returns -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Returns index within the collection of the passed key
    * @param key String The key to find the index of.
    * @returns Number The index of the key.
    */
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Double]] = js.native
  /** [Method] Inserts an item at the specified index in the collection
    * @param index Number The index to insert the item at.
    * @param key String The key to associate with the new item, or the item itself.
    * @param obj Object If the second parameter was a key, the new item.
    * @returns Object The item inserted.
    */
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* key */ js.UndefOr[String], 
      /* obj */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Returns the last item in the collection
    * @returns Object the last item in the collection..
    */
  var last: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IAbstractMixedCollection: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.native
  /** [Method] Remove an item from the collection
    * @param o Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Remove all items in the passed array from the collection
    * @param items Array An array of items to be removed.
    * @returns Ext.util.MixedCollection this object
    */
  var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.native
  /** [Method] Remove an item from a specified index in the collection
    * @param index Number The index within the collection of the item to remove.
    * @returns Object/Boolean The item removed or false if no item was removed.
    */
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  /** [Method] Removed an item associated with the passed key from the collection
    * @param key String The key of the item to remove.
    * @returns Object/Boolean The item removed or false if no item was removed.
    */
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  /** [Method] Replaces an item in the collection
    * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
    * @param o Object If the first parameter passed was a key, the item to associate with that key.
    * @returns Object The new item.
    */
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Collects all of the values of the given property and returns their sum
    * @param property String The property to sum by.
    * @param root String Optional 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the data object
    * @param start Number The record index to start at.
    * @param end Number The record index to end at.
    * @returns Number The total
    */
  var sum: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[String], 
      /* root */ js.UndefOr[String], 
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
}

object IAbstractMixedCollection {
  @scala.inline
  def apply(): IAbstractMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractMixedCollection]
  }
  @scala.inline
  implicit class IAbstractMixedCollectionOps[Self <: IAbstractMixedCollection] (val x: Self) extends AnyVal {
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
    def setAdd(value: (/* key */ js.UndefOr[String], /* obj */ js.UndefOr[js.Any]) => _): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddAll(value: /* objs */ js.UndefOr[js.Any] => Unit): Self = this.set("addAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddAll: Self = this.set("addAll", js.undefined)
    @scala.inline
    def setAllowFunctions(value: Boolean): Self = this.set("allowFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFunctions: Self = this.set("allowFunctions", js.undefined)
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setClone(value: () => IMixedCollection): Self = this.set("clone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setCollect(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* allowNull */ js.UndefOr[Boolean]) => Array
    ): Self = this.set("collect", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCollect: Self = this.set("collect", js.undefined)
    @scala.inline
    def setContains(value: /* o */ js.UndefOr[js.Any] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = this.set("containsKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContainsKey: Self = this.set("containsKey", js.undefined)
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("each", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setEachKey(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("eachKey", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEachKey: Self = this.set("eachKey", js.undefined)
    @scala.inline
    def setFilter(
      value: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => IMixedCollection
    ): Self = this.set("filter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = this.set("filterBy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    @scala.inline
    def setFindBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = this.set("findBy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFindBy: Self = this.set("findBy", js.undefined)
    @scala.inline
    def setFindIndex(
      value: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("findIndex", js.Any.fromFunction5(value))
    @scala.inline
    def deleteFindIndex: Self = this.set("findIndex", js.undefined)
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
    def setGetByKey(value: /* key */ js.UndefOr[js.Any] => _): Self = this.set("getByKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetByKey: Self = this.set("getByKey", js.undefined)
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    @scala.inline
    def setGetKey(value: /* item */ js.UndefOr[js.Any] => _): Self = this.set("getKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
    @scala.inline
    def setGetRange(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = this.set("getRange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetRange: Self = this.set("getRange", js.undefined)
    @scala.inline
    def setIndexOf(value: /* o */ js.UndefOr[js.Any] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    @scala.inline
    def setIndexOfKey(value: /* key */ js.UndefOr[String] => Double): Self = this.set("indexOfKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOfKey: Self = this.set("indexOfKey", js.undefined)
    @scala.inline
    def setInsert(
      value: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[String], /* obj */ js.UndefOr[js.Any]) => _
    ): Self = this.set("insert", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setLast(value: () => _): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setRelayEvents(
      value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setRemove(value: /* o */ js.UndefOr[js.Any] => _): Self = this.set("remove", js.Any.fromFunction1(value))
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
    def setReplace(value: (/* key */ js.UndefOr[String], /* o */ js.UndefOr[js.Any]) => _): Self = this.set("replace", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setSum(
      value: (/* property */ js.UndefOr[String], /* root */ js.UndefOr[String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Double
    ): Self = this.set("sum", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
  
}

