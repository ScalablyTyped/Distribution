package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHashMap
  extends typings.senchaTouch.Ext.mixin.IObservable {
  
  /** [Method] Add a new item to the hash
    * @param key String The key of the new item.
    * @param value Object The value of the new item.
    * @returns Object The value of the new item added.
    */
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Removes all items from the hash
    * @param initial Object
    * @returns Ext.util.HashMap this
    */
  var clear: js.UndefOr[js.Function1[/* initial */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Method] Performs a shallow copy on this hash
    * @returns Ext.util.HashMap The new hash object.
    */
  @JSName("clone")
  var clone_FIHashMap: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Checks whether a value exists in the hash
    * @param value Object The value to check for.
    * @returns Boolean true if the value exists in the dictionary.
    */
  var contains: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Checks whether a key exists in the hash
    * @param key String The key to check for.
    * @returns Boolean true if they key exists in the hash.
    */
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Method] Executes the specified function once for each item in the hash
    * @param fn Function The function to execute.
    * @param scope Object The scope to execute in.
    * @returns Ext.util.HashMap this
    */
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  
  /** [Method] Retrieves an item with a particular key
    * @param key String The key to lookup.
    * @returns Object The value at that key. If it doesn't exist, undefined is returned.
    */
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Gets the number of items in the hash
    * @returns Number The number of items in the hash.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Return all of the keys in the hash
    * @returns Array An array of keys.
    */
  var getKeys: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Return all of the values in the hash
    * @returns Array An array of values.
    */
  var getValues: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Config Option] (Function) */
  var keyFn: js.UndefOr[js.Any] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IHashMap: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.native
  
  /** [Method] Remove an item from the hash
    * @param o Object The value of the item to remove.
    * @returns Boolean true if the item was successfully removed.
    */
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Remove an item from the hash
    * @param key String The key to remove.
    * @returns Boolean true if the item was successfully removed.
    */
  var removeByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.native
  
  /** [Method] Replaces an item in the hash
    * @param key String The key of the item.
    * @param value Object The new value for the item.
    * @returns Object The new value of the item.
    */
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], _]] = js.native
}
object IHashMap {
  
  @scala.inline
  def apply(): IHashMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashMap]
  }
  
  @scala.inline
  implicit class IHashMapMutableBuilder[Self <: IHashMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setClear(value: /* initial */ js.UndefOr[js.Any] => IHashMap): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setClone_(value: () => IHashMap): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setContains(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsKeyUndefined: Self = StObject.set(x, "containsKey", js.undefined)
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IHashMap): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setGet(value: /* key */ js.UndefOr[String] => _): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    @scala.inline
    def setGetKeys(value: () => Array): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeysUndefined: Self = StObject.set(x, "getKeys", js.undefined)
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setGetValues(value: () => Array): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
    
    @scala.inline
    def setKeyFn(value: js.Any): Self = StObject.set(x, "keyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFnUndefined: Self = StObject.set(x, "keyFn", js.undefined)
    
    @scala.inline
    def setRelayEvents(
      value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setRemove(value: /* o */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByKey(value: /* key */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "removeByKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByKeyUndefined: Self = StObject.set(x, "removeByKey", js.undefined)
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReplace(value: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
