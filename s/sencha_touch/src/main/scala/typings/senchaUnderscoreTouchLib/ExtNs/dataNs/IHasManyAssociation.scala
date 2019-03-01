package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasManyAssociation
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.associationNs.IAssociation {
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

object IHasManyAssociation {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    associatedModel: java.lang.String = null,
    associatedName: java.lang.String = null,
    associationKey: java.lang.String = null,
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    filterProperty: java.lang.String = null,
    foreignKey: java.lang.String = null,
    getAssociatedModel: js.Function0[java.lang.String] = null,
    getAssociatedName: js.Function0[java.lang.String] = null,
    getAssociationKey: js.Function0[java.lang.String] = null,
    getAutoLoad: js.Function0[scala.Boolean] = null,
    getAutoSync: js.Function0[scala.Boolean] = null,
    getFilterProperty: js.Function0[java.lang.String] = null,
    getForeignKey: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getName: js.Function0[_] = null,
    getOwnerModel: js.Function0[_] = null,
    getOwnerName: js.Function0[java.lang.String] = null,
    getPrimaryKey: js.Function0[java.lang.String] = null,
    getReader: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader] = null,
    getStore: js.Function0[_] = null,
    getStoreName: js.Function0[java.lang.String] = null,
    getType: js.Function0[java.lang.String] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    ownerModel: js.Any = null,
    platformConfig: js.Any = null,
    primaryKey: java.lang.String = null,
    reader: senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAssociatedModel: js.Function1[/* associatedModel */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setAssociatedName: js.Function1[/* associatedName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setAssociationKey: js.Function1[/* associationKey */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setAutoLoad: js.Function1[/* autoLoad */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoSync: js.Function1[/* autoSync */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFilterProperty: js.Function1[/* filterProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setForeignKey: js.Function1[/* foreignKey */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit] = null,
    setOwnerModel: js.Function1[/* ownerModel */ js.UndefOr[js.Any], scala.Unit] = null,
    setOwnerName: js.Function1[/* ownerName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPrimaryKey: js.Function1[/* primaryKey */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setReader: js.Function1[
      /* reader */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader], 
      scala.Unit
    ] = null,
    setStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    setStoreName: js.Function1[/* storeName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setType: js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    store: js.Any = null,
    storeConfig: js.Any = null,
    storeName: java.lang.String = null,
    `type`: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IHasManyAssociation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel)
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName)
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filterProperty != null) __obj.updateDynamic("filterProperty")(filterProperty)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    if (getAssociatedModel != null) __obj.updateDynamic("getAssociatedModel")(getAssociatedModel)
    if (getAssociatedName != null) __obj.updateDynamic("getAssociatedName")(getAssociatedName)
    if (getAssociationKey != null) __obj.updateDynamic("getAssociationKey")(getAssociationKey)
    if (getAutoLoad != null) __obj.updateDynamic("getAutoLoad")(getAutoLoad)
    if (getAutoSync != null) __obj.updateDynamic("getAutoSync")(getAutoSync)
    if (getFilterProperty != null) __obj.updateDynamic("getFilterProperty")(getFilterProperty)
    if (getForeignKey != null) __obj.updateDynamic("getForeignKey")(getForeignKey)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getOwnerModel != null) __obj.updateDynamic("getOwnerModel")(getOwnerModel)
    if (getOwnerName != null) __obj.updateDynamic("getOwnerName")(getOwnerName)
    if (getPrimaryKey != null) __obj.updateDynamic("getPrimaryKey")(getPrimaryKey)
    if (getReader != null) __obj.updateDynamic("getReader")(getReader)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getStoreName != null) __obj.updateDynamic("getStoreName")(getStoreName)
    if (getType != null) __obj.updateDynamic("getType")(getType)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAssociatedModel != null) __obj.updateDynamic("setAssociatedModel")(setAssociatedModel)
    if (setAssociatedName != null) __obj.updateDynamic("setAssociatedName")(setAssociatedName)
    if (setAssociationKey != null) __obj.updateDynamic("setAssociationKey")(setAssociationKey)
    if (setAutoLoad != null) __obj.updateDynamic("setAutoLoad")(setAutoLoad)
    if (setAutoSync != null) __obj.updateDynamic("setAutoSync")(setAutoSync)
    if (setFilterProperty != null) __obj.updateDynamic("setFilterProperty")(setFilterProperty)
    if (setForeignKey != null) __obj.updateDynamic("setForeignKey")(setForeignKey)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(setOwnerModel)
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(setOwnerName)
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(setPrimaryKey)
    if (setReader != null) __obj.updateDynamic("setReader")(setReader)
    if (setStore != null) __obj.updateDynamic("setStore")(setStore)
    if (setStoreName != null) __obj.updateDynamic("setStoreName")(setStoreName)
    if (setType != null) __obj.updateDynamic("setType")(setType)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (store != null) __obj.updateDynamic("store")(store)
    if (storeConfig != null) __obj.updateDynamic("storeConfig")(storeConfig)
    if (storeName != null) __obj.updateDynamic("storeName")(storeName)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHasManyAssociation]
  }
}

