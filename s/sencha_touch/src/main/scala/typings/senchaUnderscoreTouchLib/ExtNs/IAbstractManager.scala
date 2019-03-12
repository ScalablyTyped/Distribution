package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractManager extends IBase {
  /** [Property] (Ext.util.HashMap) */
  var all: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IHashMap] = js.undefined
  /** [Method] Creates and returns an instance of whatever this manager manages based on the supplied type and config object
  		* @param config Object The config object.
  		* @param defaultType String If no type is discovered in the config object, we fall back to this type.
  		* @returns Object The instance of whatever this manager is managing.
  		*/
  var create: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String], _]
  ] = js.undefined
  /** [Method] Executes the specified function once for each item in the collection
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in.
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns an item by id
  		* @param id String The id of the item.
  		* @returns Object The item, undefined if not found.
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets the number of items in the collection
  		* @returns Number The number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Checks if an item type is registered
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @returns Boolean Whether the type is registered.
  		*/
  var isRegistered: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
  		* @param id String The item id.
  		* @param fn Function The callback function. Called with a single parameter, the item.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
  		*/
  var onAvailable: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Registers an item to be managed
  		* @param item Object The item to register.
  		*/
  var register: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Registers a new item constructor keyed by a type key
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @param cls Function The new instance class.
  		*/
  var registerType: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Unregisters an item by removing it from this manager
  		* @param item Object The item to unregister.
  		*/
  var unregister: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IAbstractManager {
  @scala.inline
  def apply(
    alias: Array = null,
    all: senchaUnderscoreTouchLib.ExtNs.utilNs.IHashMap = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    create: (/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String]) => _ = null,
    destroy: () => scala.Unit = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    extend: java.lang.String = null,
    get: /* id */ js.UndefOr[java.lang.String] => _ = null,
    getCount: () => scala.Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isRegistered: /* type */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    mixins: js.Any = null,
    onAvailable: (/* id */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    platformConfig: js.Any = null,
    register: /* item */ js.UndefOr[js.Any] => scala.Unit = null,
    registerType: (/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any]) => scala.Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    unregister: /* item */ js.UndefOr[js.Any] => scala.Unit = null,
    uses: Array = null
  ): IAbstractManager = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (all != null) __obj.updateDynamic("all")(all)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isRegistered != null) __obj.updateDynamic("isRegistered")(js.Any.fromFunction1(isRegistered))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (onAvailable != null) __obj.updateDynamic("onAvailable")(js.Any.fromFunction3(onAvailable))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction1(register))
    if (registerType != null) __obj.updateDynamic("registerType")(js.Any.fromFunction2(registerType))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1(unregister))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstractManager]
  }
}

