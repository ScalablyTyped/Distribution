package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociation extends IBase {
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var associatedName: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of associatedModel
  		* @returns String
  		*/
  var getAssociatedModel: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of associatedName
  		* @returns String
  		*/
  var getAssociatedName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of associationKey
  		* @returns String
  		*/
  var getAssociationKey: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns Object
  		*/
  var getName: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of ownerModel
  		* @returns Ext.data.Model/String
  		*/
  var getOwnerModel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of ownerName
  		* @returns String
  		*/
  var getOwnerName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of primaryKey
  		* @returns String
  		*/
  var getPrimaryKey: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of reader
  		* @returns Ext.data.reader.Reader
  		*/
  var getReader: js.UndefOr[js.Function0[typings.senchaTouch.Ext.data.reader.IReader]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (Ext.data.Model/String) */
  var ownerModel: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader] = js.undefined
  /** [Method] Sets the value of associatedModel
  		* @param associatedModel String The new value.
  		*/
  var setAssociatedModel: js.UndefOr[js.Function1[/* associatedModel */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of associatedName
  		* @param associatedName String The new value.
  		*/
  var setAssociatedName: js.UndefOr[js.Function1[/* associatedName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of associationKey
  		* @param associationKey String The new value.
  		*/
  var setAssociationKey: js.UndefOr[js.Function1[/* associationKey */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ownerModel
  		* @param ownerModel Ext.data.Model/String The new value.
  		*/
  var setOwnerModel: js.UndefOr[js.Function1[/* ownerModel */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ownerName
  		* @param ownerName String The new value.
  		*/
  var setOwnerName: js.UndefOr[js.Function1[/* ownerName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of primaryKey
  		* @param primaryKey String The new value.
  		*/
  var setPrimaryKey: js.UndefOr[js.Function1[/* primaryKey */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of reader
  		* @param reader Ext.data.reader.Reader The new value.
  		*/
  var setReader: js.UndefOr[
    js.Function1[/* reader */ js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader], Unit]
  ] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}

object IAssociation {
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
    getAssociatedModel: () => String = null,
    getAssociatedName: () => String = null,
    getAssociationKey: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getName: () => _ = null,
    getOwnerModel: () => _ = null,
    getOwnerName: () => String = null,
    getPrimaryKey: () => String = null,
    getReader: () => typings.senchaTouch.Ext.data.reader.IReader = null,
    getType: () => String = null,
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
    setName: /* name */ js.UndefOr[js.Any] => Unit = null,
    setOwnerModel: /* ownerModel */ js.UndefOr[js.Any] => Unit = null,
    setOwnerName: /* ownerName */ js.UndefOr[String] => Unit = null,
    setPrimaryKey: /* primaryKey */ js.UndefOr[String] => Unit = null,
    setReader: /* reader */ js.UndefOr[typings.senchaTouch.Ext.data.reader.IReader] => Unit = null,
    setType: /* type */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: String = null,
    uses: Array = null
  ): IAssociation = {
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
    if (getAssociatedModel != null) __obj.updateDynamic("getAssociatedModel")(js.Any.fromFunction0(getAssociatedModel))
    if (getAssociatedName != null) __obj.updateDynamic("getAssociatedName")(js.Any.fromFunction0(getAssociatedName))
    if (getAssociationKey != null) __obj.updateDynamic("getAssociationKey")(js.Any.fromFunction0(getAssociationKey))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getOwnerModel != null) __obj.updateDynamic("getOwnerModel")(js.Any.fromFunction0(getOwnerModel))
    if (getOwnerName != null) __obj.updateDynamic("getOwnerName")(js.Any.fromFunction0(getOwnerName))
    if (getPrimaryKey != null) __obj.updateDynamic("getPrimaryKey")(js.Any.fromFunction0(getPrimaryKey))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getType != null) __obj.updateDynamic("getType")(js.Any.fromFunction0(getType))
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
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(js.Any.fromFunction1(setOwnerModel))
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(js.Any.fromFunction1(setOwnerName))
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(js.Any.fromFunction1(setPrimaryKey))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1(setReader))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1(setType))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociation]
  }
}

