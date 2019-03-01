package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.associationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociation
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var associatedName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of associatedModel
  		* @returns String
  		*/
  var getAssociatedModel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of associatedName
  		* @returns String
  		*/
  var getAssociatedName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of associationKey
  		* @returns String
  		*/
  var getAssociationKey: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
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
  var getOwnerName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of primaryKey
  		* @returns String
  		*/
  var getPrimaryKey: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of reader
  		* @returns Ext.data.reader.Reader
  		*/
  var getReader: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String
  		*/
  var getType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Ext.data.Model/String) */
  var ownerModel: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader] = js.undefined
  /** [Method] Sets the value of associatedModel
  		* @param associatedModel String The new value.
  		*/
  var setAssociatedModel: js.UndefOr[js.Function1[/* associatedModel */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of associatedName
  		* @param associatedName String The new value.
  		*/
  var setAssociatedName: js.UndefOr[js.Function1[/* associatedName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of associationKey
  		* @param associationKey String The new value.
  		*/
  var setAssociationKey: js.UndefOr[js.Function1[/* associationKey */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of ownerModel
  		* @param ownerModel Ext.data.Model/String The new value.
  		*/
  var setOwnerModel: js.UndefOr[js.Function1[/* ownerModel */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of ownerName
  		* @param ownerName String The new value.
  		*/
  var setOwnerName: js.UndefOr[js.Function1[/* ownerName */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of primaryKey
  		* @param primaryKey String The new value.
  		*/
  var setPrimaryKey: js.UndefOr[js.Function1[/* primaryKey */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of reader
  		* @param reader Ext.data.reader.Reader The new value.
  		*/
  var setReader: js.UndefOr[
    js.Function1[
      /* reader */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IAssociation {
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
    getAssociatedModel: js.Function0[java.lang.String] = null,
    getAssociatedName: js.Function0[java.lang.String] = null,
    getAssociationKey: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getName: js.Function0[_] = null,
    getOwnerModel: js.Function0[_] = null,
    getOwnerName: js.Function0[java.lang.String] = null,
    getPrimaryKey: js.Function0[java.lang.String] = null,
    getReader: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader] = null,
    getType: js.Function0[java.lang.String] = null,
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
    setName: js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit] = null,
    setOwnerModel: js.Function1[/* ownerModel */ js.UndefOr[js.Any], scala.Unit] = null,
    setOwnerName: js.Function1[/* ownerName */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPrimaryKey: js.Function1[/* primaryKey */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setReader: js.Function1[
      /* reader */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader], 
      scala.Unit
    ] = null,
    setType: js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    `type`: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAssociation = {
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
    if (getAssociatedModel != null) __obj.updateDynamic("getAssociatedModel")(getAssociatedModel)
    if (getAssociatedName != null) __obj.updateDynamic("getAssociatedName")(getAssociatedName)
    if (getAssociationKey != null) __obj.updateDynamic("getAssociationKey")(getAssociationKey)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getOwnerModel != null) __obj.updateDynamic("getOwnerModel")(getOwnerModel)
    if (getOwnerName != null) __obj.updateDynamic("getOwnerName")(getOwnerName)
    if (getPrimaryKey != null) __obj.updateDynamic("getPrimaryKey")(getPrimaryKey)
    if (getReader != null) __obj.updateDynamic("getReader")(getReader)
    if (getType != null) __obj.updateDynamic("getType")(getType)
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
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setOwnerModel != null) __obj.updateDynamic("setOwnerModel")(setOwnerModel)
    if (setOwnerName != null) __obj.updateDynamic("setOwnerName")(setOwnerName)
    if (setPrimaryKey != null) __obj.updateDynamic("setPrimaryKey")(setPrimaryKey)
    if (setReader != null) __obj.updateDynamic("setReader")(setReader)
    if (setType != null) __obj.updateDynamic("setType")(setType)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAssociation]
  }
}

