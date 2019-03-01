package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWriter
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the value of nameProperty
  		* @returns String
  		*/
  var getNameProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Object The record that we are writing to the server.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of writeAllFields
  		* @returns Boolean
  		*/
  var getWriteAllFields: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of nameProperty
  		* @param nameProperty String The new value.
  		*/
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of writeAllFields
  		* @param writeAllFields Boolean The new value.
  		*/
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object.
  		* @returns Ext.data.Request The modified request object.
  		*/
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.undefined
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[scala.Boolean] = js.undefined
}

object IWriter {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getNameProperty: js.Function0[java.lang.String] = null,
    getRecordData: js.Function1[/* record */ js.UndefOr[js.Any], _] = null,
    getWriteAllFields: js.Function0[scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setNameProperty: js.Function1[/* nameProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setWriteAllFields: js.Function1[/* writeAllFields */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    write: js.Function1[/* request */ js.UndefOr[IRequest], IRequest] = null,
    writeAllFields: js.UndefOr[scala.Boolean] = js.undefined
  ): IWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getNameProperty != null) __obj.updateDynamic("getNameProperty")(getNameProperty)
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(getRecordData)
    if (getWriteAllFields != null) __obj.updateDynamic("getWriteAllFields")(getWriteAllFields)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(setNameProperty)
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(setWriteAllFields)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(write)
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields)
    __obj.asInstanceOf[IWriter]
  }
}

