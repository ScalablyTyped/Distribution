package typings.senchaUnderscoreTouch.Ext.data.writer

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWriter extends IBase {
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
  var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of nameProperty
  		* @param nameProperty String The new value.
  		*/
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of writeAllFields
  		* @param writeAllFields Boolean The new value.
  		*/
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object.
  		* @returns Ext.data.Request The modified request object.
  		*/
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.undefined
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.undefined
}

object IWriter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getNameProperty: () => java.lang.String = null,
    getRecordData: /* record */ js.UndefOr[js.Any] => _ = null,
    getWriteAllFields: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setNameProperty: /* nameProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setWriteAllFields: /* writeAllFields */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    write: /* request */ js.UndefOr[IRequest] => IRequest = null,
    writeAllFields: js.UndefOr[Boolean] = js.undefined
  ): IWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getNameProperty != null) __obj.updateDynamic("getNameProperty")(js.Any.fromFunction0(getNameProperty))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction1(getRecordData))
    if (getWriteAllFields != null) __obj.updateDynamic("getWriteAllFields")(js.Any.fromFunction0(getWriteAllFields))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(js.Any.fromFunction1(setNameProperty))
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(js.Any.fromFunction1(setWriteAllFields))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields)
    __obj.asInstanceOf[IWriter]
  }
}

