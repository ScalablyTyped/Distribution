package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractMixedCollection
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Adds an item to the collection
  		* @param key String The key to associate with the item, or the new item. If a getKey implementation was specified for this MixedCollection, or if the key of the stored items is in a property called id, the MixedCollection will be able to derive the key for the new item. In this case just pass the new item in this parameter.
  		* @param obj Object The item to add.
  		* @returns Object The item added.
  		*/
  var add: js.UndefOr[
    js.Function2[/* key */ js.UndefOr[java.lang.String], /* obj */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Adds all elements of an Array or an Object to the collection
  		* @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
  		*/
  var addAll: js.UndefOr[js.Function1[/* objs */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Creates a shallow copy of this collection
  		* @returns Ext.util.MixedCollection
  		*/
  @JSName("clone")
  var clone_FIAbstractMixedCollection: js.UndefOr[js.Function0[IMixedCollection]] = js.undefined
  /** [Method] Collects unique values of a particular property in this MixedCollection
  		* @param property String The property to collect on.
  		* @param root String Optional 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the data object.
  		* @param allowNull Boolean Pass true to allow null, undefined, or empty string values.
  		* @returns Array The unique values.
  		*/
  var collect: js.UndefOr[
    js.Function3[
      /* property */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[java.lang.String], 
      /* allowNull */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as an item
  		* @param o Object The Object to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as an item.
  		*/
  var contains: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns true if the collection contains the passed Object as a key
  		* @param key String The key to look for in the collection.
  		* @returns Boolean true if the collection contains the Object as a key.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
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
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      IMixedCollection
    ]
  ] = js.undefined
  /** [Method] Filter by a function
  		* @param fn Function The function to be called, it will receive the args o (the object), k (the key)
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
  		* @returns Ext.util.MixedCollection The new filtered collection.
  		*/
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.undefined
  /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
  		* @returns Object The first item in the collection which returned true from the selection function.
  		*/
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.undefined
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
      /* property */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
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
      /* start */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Returns the first item in the collection
  		* @returns Object the first item in the collection..
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
  /** [Method] Returns the item associated with the passed key
  		* @param key String/Number The key of the item.
  		* @returns Object The item associated with the passed key.
  		*/
  var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the number of items in the collection
  		* @returns Number the number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] MixedCollection has a generic way to fetch keys if you implement getKey
  		* @param item Object The item for which to find the key.
  		* @returns Object The key for the passed item.
  		*/
  var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns a range of items in this collection
  		* @param start Number The starting index.
  		* @param end Number The ending index.
  		* @returns Array An array of items
  		*/
  var getRange: js.UndefOr[
    js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns index within the collection of the passed Object
  		* @param o Object The item to find the index of.
  		* @returns Number index of the item. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Returns index within the collection of the passed key
  		* @param key String The key to find the index of.
  		* @returns Number The index of the key.
  		*/
  var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Number The index to insert the item at.
  		* @param key String The key to associate with the new item, or the item itself.
  		* @param obj Object If the second parameter was a key, the new item.
  		* @returns Object The item inserted.
  		*/
  var insert: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* key */ js.UndefOr[java.lang.String], 
      /* obj */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the last item in the collection
  		* @returns Object the last item in the collection..
  		*/
  var last: js.UndefOr[js.Function0[_]] = js.undefined
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
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Remove an item from the collection
  		* @param o Object The item to remove.
  		* @returns Object The item removed or false if no item was removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Remove all items in the passed array from the collection
  		* @param items Array An array of items to be removed.
  		* @returns Ext.util.MixedCollection this object
  		*/
  var removeAll: js.UndefOr[
    js.Function1[/* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], IMixedCollection]
  ] = js.undefined
  /** [Method] Remove an item from a specified index in the collection
  		* @param index Number The index within the collection of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Removed an item associated with the passed key from the collection
  		* @param key String The key of the item to remove.
  		* @returns Object/Boolean The item removed or false if no item was removed.
  		*/
  var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Replaces an item in the collection
  		* @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
  		* @param o Object If the first parameter passed was a key, the item to associate with that key.
  		* @returns Object The new item.
  		*/
  var replace: js.UndefOr[
    js.Function2[/* key */ js.UndefOr[java.lang.String], /* o */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Collects all of the values of the given property and returns their sum
  		* @param property String The property to sum by.
  		* @param root String Optional 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the data object
  		* @param start Number The record index to start at.
  		* @param end Number The record index to end at.
  		* @returns Number The total
  		*/
  var sum: js.UndefOr[
    js.Function4[
      /* property */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[java.lang.String], 
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
}

object IAbstractMixedCollection {
  @scala.inline
  def apply(
    add: js.Function2[/* key */ js.UndefOr[java.lang.String], /* obj */ js.UndefOr[js.Any], _] = null,
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addAll: js.Function1[/* objs */ js.UndefOr[js.Any], scala.Unit] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    allowFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function0[scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clone: js.Function0[IMixedCollection] = null,
    collect: js.Function3[
      /* property */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[java.lang.String], 
      /* allowNull */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    config: js.Any = null,
    contains: js.Function1[/* o */ js.UndefOr[js.Any], scala.Boolean] = null,
    containsKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    destroy: js.Function0[scala.Unit] = null,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    eachKey: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    filter: js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      IMixedCollection
    ] = null,
    filterBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection] = null,
    findBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _] = null,
    findIndex: js.Function5[
      /* property */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    findIndexBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    first: js.Function0[_] = null,
    get: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getBubbleEvents: js.Function0[_] = null,
    getByKey: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getCount: js.Function0[scala.Double] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getKey: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    getListeners: js.Function0[_] = null,
    getRange: js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    indexOf: js.Function1[/* o */ js.UndefOr[js.Any], scala.Double] = null,
    indexOfKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    insert: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* key */ js.UndefOr[java.lang.String], 
      /* obj */ js.UndefOr[js.Any], 
      _
    ] = null,
    last: js.Function0[_] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    platformConfig: js.Any = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    remove: js.Function1[/* o */ js.UndefOr[js.Any], _] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeAll: js.Function1[/* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], IMixedCollection] = null,
    removeAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    removeAtKey: js.Function1[/* key */ js.UndefOr[java.lang.String], _] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    replace: js.Function2[/* key */ js.UndefOr[java.lang.String], /* o */ js.UndefOr[js.Any], _] = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    sum: js.Function4[
      /* property */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[java.lang.String], 
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAbstractMixedCollection = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addAll != null) __obj.updateDynamic("addAll")(addAll)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowFunctions)) __obj.updateDynamic("allowFunctions")(allowFunctions)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (collect != null) __obj.updateDynamic("collect")(collect)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (containsKey != null) __obj.updateDynamic("containsKey")(containsKey)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (each != null) __obj.updateDynamic("each")(each)
    if (eachKey != null) __obj.updateDynamic("eachKey")(eachKey)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findIndex != null) __obj.updateDynamic("findIndex")(findIndex)
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(findIndexBy)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (first != null) __obj.updateDynamic("first")(first)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getByKey != null) __obj.updateDynamic("getByKey")(getByKey)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(indexOfKey)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (last != null) __obj.updateDynamic("last")(last)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(removeAtKey)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstractMixedCollection]
  }
}

