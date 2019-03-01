package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.associationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBelongsTo extends IAssociation {
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of foreignKey
  		* @returns String
  		*/
  var getForeignKey: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of getterName
  		* @returns String
  		*/
  var getGetterName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of instanceName
  		* @returns Object
  		*/
  var getInstanceName: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of setterName
  		* @returns String
  		*/
  var getSetterName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var getterName: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of foreignKey
  		* @param foreignKey String The new value.
  		*/
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of getterName
  		* @param getterName String The new value.
  		*/
  var setGetterName: js.UndefOr[js.Function1[/* getterName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of instanceName
  		* @param instanceName Object The new value.
  		*/
  var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of setterName
  		* @param setterName String The new value.
  		*/
  var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var setterName: js.UndefOr[java.lang.String] = js.undefined
}

object IBelongsTo {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    associatedModel: java.lang.String = null,
    associatedName: java.lang.String = null,
    associationKey: java.lang.String = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    foreignKey: java.lang.String = null,
    getAssociatedModel: js.Function0[java.lang.String] = null,
    getAssociatedName: js.Function0[java.lang.String] = null,
    getAssociationKey: js.Function0[java.lang.String] = null,
    getForeignKey: js.Function0[java.lang.String] = null,
    getGetterName: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getInstanceName: js.Function0[_] = null,
    getName: js.Function0[_] = null,
    getOwnerModel: js.Function0[_] = null,
    getOwnerName: js.Function0[java.lang.String] = null,
    getPrimaryKey: js.Function0[java.lang.String] = null,
    getReader: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader] = null,
    getSetterName: js.Function0[java.lang.String] = null,
    getType: js.Function0[java.lang.String] = null,
    getterName: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    ownerModel: js.Any = null,
    platformConfig: js.Any = null,
    primaryKey: java.lang.String = null,
    reader: senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAssociatedModel: js.Function1[/* associatedModel */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setAssociatedName: js.Function1[/* associatedName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setAssociationKey: js.Function1[/* associationKey */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setForeignKey: js.Function1[/* foreignKey */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setGetterName: js.Function1[/* getterName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setInstanceName: js.Function1[/* instanceName */ js.UndefOr[js.Any], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit] = null,
    setOwnerModel: js.Function1[/* ownerModel */ js.UndefOr[js.Any], scala.Unit] = null,
    setOwnerName: js.Function1[/* ownerName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPrimaryKey: js.Function1[/* primaryKey */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setReader: js.Function1[
      /* reader */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader], 
      scala.Unit
    ] = null,
    setSetterName: js.Function1[/* setterName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setType: js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setterName: java.lang.String = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IBelongsTo = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel)
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName)
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey)
    if (getAssociatedModel != null) __obj.updateDynamic("getAssociatedModel")(getAssociatedModel)
    if (getAssociatedName != null) __obj.updateDynamic("getAssociatedName")(getAssociatedName)
    if (getAssociationKey != null) __obj.updateDynamic("getAssociationKey")(getAssociationKey)
    if (getForeignKey != null) __obj.updateDynamic("getForeignKey")(getForeignKey)
    if (getGetterName != null) __obj.updateDynamic("getGetterName")(getGetterName)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getInstanceName != null) __obj.updateDynamic("getInstanceName")(getInstanceName)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getOwnerModel != null) __obj.updateDynamic("getOwnerModel")(getOwnerModel)
    if (getOwnerName != null) __obj.updateDynamic("getOwnerName")(getOwnerName)
    if (getPrimaryKey != null) __obj.updateDynamic("getPrimaryKey")(getPrimaryKey)
    if (getReader != null) __obj.updateDynamic("getReader")(getReader)
    if (getSetterName != null) __obj.updateDynamic("getSetterName")(getSetterName)
    if (getType != null) __obj.updateDynamic("getType")(getType)
    if (getterName != null) __obj.updateDynamic("getterName")(getterName)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAssociatedModel != null) __obj.updateDynamic("setAssociatedModel")(setAssociatedModel)
    if (setAssociatedName != null) __obj.updateDynamic("setAssociatedName")(setAssociatedName)
    if (setAssociationKey != null) __obj.updateDynamic("setAssociationKey")(setAssociationKey)
    if (setForeignKey != null) __obj.updateDynamic("setForeignKey")(setForeignKey)
    if (setGetterName != null) __obj.updateDynamic("setGetterName")(setGetterName)
    if (setInstanceName != null) __obj.updateDynamic("setInstanceName")(setInstanceName)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(setOwnerModel)
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(setOwnerName)
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(setPrimaryKey)
    if (setReader != null) __obj.updateDynamic("setReader")(setReader)
    if (setSetterName != null) __obj.updateDynamic("setSetterName")(setSetterName)
    if (setType != null) __obj.updateDynamic("setType")(setType)
    if (setterName != null) __obj.updateDynamic("setterName")(setterName)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBelongsTo]
  }
}

