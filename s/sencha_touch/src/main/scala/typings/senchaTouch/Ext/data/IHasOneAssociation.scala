package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasOneAssociation
  extends typings.senchaTouch.Ext.data.association.IAssociation {
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of foreignKey
    * @returns String
    */
  var getForeignKey: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of getterName
    * @returns String
    */
  var getGetterName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of instanceName
    * @returns Object
    */
  var getInstanceName: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of setterName
    * @returns String
    */
  var getSetterName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of foreignKey
    * @param foreignKey String The new value.
    */
  var setForeignKey: js.UndefOr[js.Function1[/* foreignKey */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of getterName
    * @param getterName String The new value.
    */
  var setGetterName: js.UndefOr[js.Function1[/* getterName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of instanceName
    * @param instanceName Object The new value.
    */
  var setInstanceName: js.UndefOr[js.Function1[/* instanceName */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of setterName
    * @param setterName String The new value.
    */
  var setSetterName: js.UndefOr[js.Function1[/* setterName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.undefined
}

object IHasOneAssociation {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    associatedModel: String = null,
    associatedName: String = null,
    associationKey: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    foreignKey: String = null,
    getAssociatedModel: () => String = null,
    getAssociatedName: () => String = null,
    getAssociationKey: () => String = null,
    getForeignKey: () => String = null,
    getGetterName: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getInstanceName: () => _ = null,
    getName: () => _ = null,
    getOwnerModel: () => _ = null,
    getOwnerName: () => String = null,
    getPrimaryKey: () => String = null,
    getReader: () => typings.senchaTouch.Ext.data.reader.IReader = null,
    getSetterName: () => String = null,
    getType: () => String = null,
    getterName: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    ownerModel: js.Any = null,
    platformConfig: js.Any = null,
    primaryKey: String = null,
    reader: typings.senchaTouch.Ext.data.reader.IReader = null,
    self: IClass = null,
    setAssociatedModel: /* associatedModel */ js.UndefOr[String] => Unit = null,
    setAssociatedName: /* associatedName */ js.UndefOr[String] => Unit = null,
    setAssociationKey: /* associationKey */ js.UndefOr[String] => Unit = null,
    setForeignKey: /* foreignKey */ js.UndefOr[String] => Unit = null,
    setGetterName: /* getterName */ js.UndefOr[String] => Unit = null,
    setInstanceName: /* instanceName */ js.UndefOr[js.Any] => Unit = null,
    setName: /* name */ js.UndefOr[js.Any] => Unit = null,
    setOwnerModel: /* ownerModel */ js.UndefOr[js.Any] => Unit = null,
    setOwnerName: /* ownerName */ js.UndefOr[String] => Unit = null,
    setPrimaryKey: /* primaryKey */ js.UndefOr[String] => Unit = null,
    setReader: /* reader */ js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader] => Unit = null,
    setSetterName: /* setterName */ js.UndefOr[String] => Unit = null,
    setType: /* type */ js.UndefOr[String] => Unit = null,
    setterName: String = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: String = null,
    uses: Array = null
  ): IHasOneAssociation = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (associatedModel != null) __obj.updateDynamic("associatedModel")(associatedModel.asInstanceOf[js.Any])
    if (associatedName != null) __obj.updateDynamic("associatedName")(associatedName.asInstanceOf[js.Any])
    if (associationKey != null) __obj.updateDynamic("associationKey")(associationKey.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (getAssociatedModel != null) __obj.updateDynamic("getAssociatedModel")(js.Any.fromFunction0(getAssociatedModel))
    if (getAssociatedName != null) __obj.updateDynamic("getAssociatedName")(js.Any.fromFunction0(getAssociatedName))
    if (getAssociationKey != null) __obj.updateDynamic("getAssociationKey")(js.Any.fromFunction0(getAssociationKey))
    if (getForeignKey != null) __obj.updateDynamic("getForeignKey")(js.Any.fromFunction0(getForeignKey))
    if (getGetterName != null) __obj.updateDynamic("getGetterName")(js.Any.fromFunction0(getGetterName))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getInstanceName != null) __obj.updateDynamic("getInstanceName")(js.Any.fromFunction0(getInstanceName))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getOwnerModel != null) __obj.updateDynamic("getOwnerModel")(js.Any.fromFunction0(getOwnerModel))
    if (getOwnerName != null) __obj.updateDynamic("getOwnerName")(js.Any.fromFunction0(getOwnerName))
    if (getPrimaryKey != null) __obj.updateDynamic("getPrimaryKey")(js.Any.fromFunction0(getPrimaryKey))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getSetterName != null) __obj.updateDynamic("getSetterName")(js.Any.fromFunction0(getSetterName))
    if (getType != null) __obj.updateDynamic("getType")(js.Any.fromFunction0(getType))
    if (getterName != null) __obj.updateDynamic("getterName")(getterName.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (ownerModel != null) __obj.updateDynamic("ownerModel")(ownerModel.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAssociatedModel != null) __obj.updateDynamic("setAssociatedModel")(js.Any.fromFunction1(setAssociatedModel))
    if (setAssociatedName != null) __obj.updateDynamic("setAssociatedName")(js.Any.fromFunction1(setAssociatedName))
    if (setAssociationKey != null) __obj.updateDynamic("setAssociationKey")(js.Any.fromFunction1(setAssociationKey))
    if (setForeignKey != null) __obj.updateDynamic("setForeignKey")(js.Any.fromFunction1(setForeignKey))
    if (setGetterName != null) __obj.updateDynamic("setGetterName")(js.Any.fromFunction1(setGetterName))
    if (setInstanceName != null) __obj.updateDynamic("setInstanceName")(js.Any.fromFunction1(setInstanceName))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(js.Any.fromFunction1(setOwnerModel))
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(js.Any.fromFunction1(setOwnerName))
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(js.Any.fromFunction1(setPrimaryKey))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1(setReader))
    if (setSetterName != null) __obj.updateDynamic("setSetterName")(js.Any.fromFunction1(setSetterName))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1(setType))
    if (setterName != null) __obj.updateDynamic("setterName")(setterName.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHasOneAssociation]
  }
}

