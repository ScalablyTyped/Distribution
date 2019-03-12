package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.associationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasMany extends IAssociation {
  /** [Config Option] (Boolean) */
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoSync: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var filterProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of autoLoad
  		* @returns Boolean
  		*/
  var getAutoLoad: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of autoSync
  		* @returns Boolean
  		*/
  var getAutoSync: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of filterProperty
  		* @returns String
  		*/
  var getFilterProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of foreignKey
  		* @returns String
  		*/
  var getForeignKey: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of storeName
  		* @returns String
  		*/
  var getStoreName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of autoLoad
  		* @param autoLoad Boolean The new value.
  		*/
  var setAutoLoad: js.UndefOr[js.Function1[/* autoLoad */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of autoSync
  		* @param autoSync Boolean The new value.
  		*/
  var setAutoSync: js.UndefOr[js.Function1[/* autoSync */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of filterProperty
  		* @param filterProperty String The new value.
  		*/
  var setFilterProperty: js.UndefOr[js.Function1[/* filterProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of foreignKey
  		* @param foreignKey String The new value.
  		*/
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of storeName
  		* @param storeName String The new value.
  		*/
  var setStoreName: js.UndefOr[js.Function1[/* storeName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var storeConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var storeName: js.UndefOr[java.lang.String] = js.undefined
}

object IHasMany {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    associatedModel: java.lang.String = null,
    associatedName: java.lang.String = null,
    associationKey: java.lang.String = null,
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    filterProperty: java.lang.String = null,
    foreignKey: java.lang.String = null,
    getAssociatedModel: () => java.lang.String = null,
    getAssociatedName: () => java.lang.String = null,
    getAssociationKey: () => java.lang.String = null,
    getAutoLoad: () => scala.Boolean = null,
    getAutoSync: () => scala.Boolean = null,
    getFilterProperty: () => java.lang.String = null,
    getForeignKey: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getName: () => _ = null,
    getOwnerModel: () => _ = null,
    getOwnerName: () => java.lang.String = null,
    getPrimaryKey: () => java.lang.String = null,
    getReader: () => senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader = null,
    getStore: () => _ = null,
    getStoreName: () => java.lang.String = null,
    getType: () => java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    ownerModel: js.Any = null,
    platformConfig: js.Any = null,
    primaryKey: java.lang.String = null,
    reader: senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAssociatedModel: /* associatedModel */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setAssociatedName: /* associatedName */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setAssociationKey: /* associationKey */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setAutoLoad: /* autoLoad */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setAutoSync: /* autoSync */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setFilterProperty: /* filterProperty */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setForeignKey: /* foreignKey */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setName: /* name */ js.UndefOr[js.Any] => scala.Unit = null,
    setOwnerModel: /* ownerModel */ js.UndefOr[js.Any] => scala.Unit = null,
    setOwnerName: /* ownerName */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setPrimaryKey: /* primaryKey */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setReader: /* reader */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader] => scala.Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => scala.Unit = null,
    setStoreName: /* storeName */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setType: /* type */ js.UndefOr[java.lang.String] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    store: js.Any = null,
    storeConfig: js.Any = null,
    storeName: java.lang.String = null,
    `type`: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IHasMany = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel)
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName)
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filterProperty != null) __obj.updateDynamic("filterProperty")(filterProperty)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    if (getAssociatedModel != null) __obj.updateDynamic("getAssociatedModel")(js.Any.fromFunction0(getAssociatedModel))
    if (getAssociatedName != null) __obj.updateDynamic("getAssociatedName")(js.Any.fromFunction0(getAssociatedName))
    if (getAssociationKey != null) __obj.updateDynamic("getAssociationKey")(js.Any.fromFunction0(getAssociationKey))
    if (getAutoLoad != null) __obj.updateDynamic("getAutoLoad")(js.Any.fromFunction0(getAutoLoad))
    if (getAutoSync != null) __obj.updateDynamic("getAutoSync")(js.Any.fromFunction0(getAutoSync))
    if (getFilterProperty != null) __obj.updateDynamic("getFilterProperty")(js.Any.fromFunction0(getFilterProperty))
    if (getForeignKey != null) __obj.updateDynamic("getForeignKey")(js.Any.fromFunction0(getForeignKey))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getOwnerModel != null) __obj.updateDynamic("getOwnerModel")(js.Any.fromFunction0(getOwnerModel))
    if (getOwnerName != null) __obj.updateDynamic("getOwnerName")(js.Any.fromFunction0(getOwnerName))
    if (getPrimaryKey != null) __obj.updateDynamic("getPrimaryKey")(js.Any.fromFunction0(getPrimaryKey))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getStoreName != null) __obj.updateDynamic("getStoreName")(js.Any.fromFunction0(getStoreName))
    if (getType != null) __obj.updateDynamic("getType")(js.Any.fromFunction0(getType))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAssociatedModel != null) __obj.updateDynamic("setAssociatedModel")(js.Any.fromFunction1(setAssociatedModel))
    if (setAssociatedName != null) __obj.updateDynamic("setAssociatedName")(js.Any.fromFunction1(setAssociatedName))
    if (setAssociationKey != null) __obj.updateDynamic("setAssociationKey")(js.Any.fromFunction1(setAssociationKey))
    if (setAutoLoad != null) __obj.updateDynamic("setAutoLoad")(js.Any.fromFunction1(setAutoLoad))
    if (setAutoSync != null) __obj.updateDynamic("setAutoSync")(js.Any.fromFunction1(setAutoSync))
    if (setFilterProperty != null) __obj.updateDynamic("setFilterProperty")(js.Any.fromFunction1(setFilterProperty))
    if (setForeignKey != null) __obj.updateDynamic("setForeignKey")(js.Any.fromFunction1(setForeignKey))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(js.Any.fromFunction1(setOwnerModel))
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(js.Any.fromFunction1(setOwnerName))
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(js.Any.fromFunction1(setPrimaryKey))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1(setReader))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setStoreName != null) __obj.updateDynamic("setStoreName")(js.Any.fromFunction1(setStoreName))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1(setType))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (store != null) __obj.updateDynamic("store")(store)
    if (storeConfig != null) __obj.updateDynamic("storeConfig")(storeConfig)
    if (storeName != null) __obj.updateDynamic("storeName")(storeName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHasMany]
  }
}

