package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashMap
  extends typings.senchaUnderscoreTouch.Ext.mixin.IObservable {
  /** [Method] Add a new item to the hash
  		* @param key String The key of the new item.
  		* @param value Object The value of the new item.
  		* @returns Object The value of the new item added.
  		*/
  var add: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Removes all items from the hash
  		* @param initial Object
  		* @returns Ext.util.HashMap this
  		*/
  var clear: js.UndefOr[js.Function1[/* initial */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Performs a shallow copy on this hash
  		* @returns Ext.util.HashMap The new hash object.
  		*/
  @JSName("clone")
  var clone_FIHashMap: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Checks whether a value exists in the hash
  		* @param value Object The value to check for.
  		* @returns Boolean true if the value exists in the dictionary.
  		*/
  var contains: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Checks whether a key exists in the hash
  		* @param key String The key to check for.
  		* @returns Boolean true if they key exists in the hash.
  		*/
  var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Executes the specified function once for each item in the hash
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in.
  		* @returns Ext.util.HashMap this
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Retrieves an item with a particular key
  		* @param key String The key to lookup.
  		* @returns Object The value at that key. If it doesn't exist, undefined is returned.
  		*/
  var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Gets the number of items in the hash
  		* @returns Number The number of items in the hash.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Return all of the keys in the hash
  		* @returns Array An array of keys.
  		*/
  var getKeys: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Return all of the values in the hash
  		* @returns Array An array of values.
  		*/
  var getValues: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (Function) */
  var keyFn: js.UndefOr[js.Any] = js.undefined
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
      typings.senchaUnderscoreTouch.Ext.mixin.IObservable
    ]
  ] = js.undefined
  /** [Method] Remove an item from the hash
  		* @param o Object The value of the item to remove.
  		* @returns Boolean true if the item was successfully removed.
  		*/
  var remove: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Remove an item from the hash
  		* @param key String The key to remove.
  		* @returns Boolean true if the item was successfully removed.
  		*/
  var removeByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Method] Replaces an item in the hash
  		* @param key String The key of the item.
  		* @param value Object The new value for the item.
  		* @returns Object The new value of the item.
  		*/
  var replace: js.UndefOr[js.Function2[/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], _]] = js.undefined
}

object IHashMap {
  @scala.inline
  def apply(
    add: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => _ = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: /* initial */ js.UndefOr[js.Any] => IHashMap = null,
    clearListeners: () => Unit = null,
    clone: () => IHashMap = null,
    config: js.Any = null,
    contains: /* value */ js.UndefOr[js.Any] => Boolean = null,
    containsKey: /* key */ js.UndefOr[String] => Boolean = null,
    destroy: () => Unit = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IHashMap = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    get: /* key */ js.UndefOr[String] => _ = null,
    getBubbleEvents: () => _ = null,
    getCount: () => Double = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getKeys: () => Array = null,
    getListeners: () => _ = null,
    getValues: () => Array = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    keyFn: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typings.senchaUnderscoreTouch.Ext.mixin.IObservable = null,
    remove: /* o */ js.UndefOr[js.Any] => Boolean = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeByKey: /* key */ js.UndefOr[String] => Boolean = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    replace: (/* key */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => _ = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IHashMap = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1(clear))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1(containsKey))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getKeys != null) __obj.updateDynamic("getKeys")(js.Any.fromFunction0(getKeys))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction0(getValues))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (keyFn != null) __obj.updateDynamic("keyFn")(keyFn.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeByKey != null) __obj.updateDynamic("removeByKey")(js.Any.fromFunction1(removeByKey))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2(replace))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHashMap]
  }
}

