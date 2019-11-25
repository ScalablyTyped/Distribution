package typings.senchaUnderscoreTouch.Ext.data.writer

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJson
  extends typings.senchaUnderscoreTouch.Ext.data.writer.IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of allowSingle
  		* @returns Boolean
  		*/
  var getAllowSingle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of encode
  		* @returns Boolean
  		*/
  var getEncode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of encodeRequest
  		* @returns Boolean
  		*/
  var getEncodeRequest: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of rootProperty
  		* @returns String
  		*/
  var getRootProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of allowSingle
  		* @param allowSingle Boolean The new value.
  		*/
  var setAllowSingle: js.UndefOr[js.Function1[/* allowSingle */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of encode
  		* @param encode Boolean The new value.
  		*/
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of encodeRequest
  		* @param encodeRequest Boolean The new value.
  		*/
  var setEncodeRequest: js.UndefOr[js.Function1[/* encodeRequest */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of rootProperty
  		* @param rootProperty String The new value.
  		*/
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}

object IJson {
  @scala.inline
  def apply(
    alias: Array = null,
    allowSingle: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    encode: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    getAllowSingle: () => Boolean = null,
    getEncode: () => Boolean = null,
    getEncodeRequest: () => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getNameProperty: () => java.lang.String = null,
    getRecordData: /* record */ js.UndefOr[js.Any] => _ = null,
    getRootProperty: () => java.lang.String = null,
    getWriteAllFields: () => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    platformConfig: js.Any = null,
    root: java.lang.String = null,
    rootProperty: java.lang.String = null,
    self: IClass = null,
    setAllowSingle: /* allowSingle */ js.UndefOr[Boolean] => Unit = null,
    setEncode: /* encode */ js.UndefOr[Boolean] => Unit = null,
    setEncodeRequest: /* encodeRequest */ js.UndefOr[Boolean] => Unit = null,
    setNameProperty: /* nameProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setRootProperty: /* rootProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setWriteAllFields: /* writeAllFields */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    write: /* request */ js.UndefOr[IRequest] => IRequest = null,
    writeAllFields: js.UndefOr[Boolean] = js.undefined
  ): IJson = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSingle)) __obj.updateDynamic("allowSingle")(allowSingle.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getAllowSingle != null) __obj.updateDynamic("getAllowSingle")(js.Any.fromFunction0(getAllowSingle))
    if (getEncode != null) __obj.updateDynamic("getEncode")(js.Any.fromFunction0(getEncode))
    if (getEncodeRequest != null) __obj.updateDynamic("getEncodeRequest")(js.Any.fromFunction0(getEncodeRequest))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getNameProperty != null) __obj.updateDynamic("getNameProperty")(js.Any.fromFunction0(getNameProperty))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction1(getRecordData))
    if (getRootProperty != null) __obj.updateDynamic("getRootProperty")(js.Any.fromFunction0(getRootProperty))
    if (getWriteAllFields != null) __obj.updateDynamic("getWriteAllFields")(js.Any.fromFunction0(getWriteAllFields))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootProperty != null) __obj.updateDynamic("rootProperty")(rootProperty.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAllowSingle != null) __obj.updateDynamic("setAllowSingle")(js.Any.fromFunction1(setAllowSingle))
    if (setEncode != null) __obj.updateDynamic("setEncode")(js.Any.fromFunction1(setEncode))
    if (setEncodeRequest != null) __obj.updateDynamic("setEncodeRequest")(js.Any.fromFunction1(setEncodeRequest))
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(js.Any.fromFunction1(setNameProperty))
    if (setRootProperty != null) __obj.updateDynamic("setRootProperty")(js.Any.fromFunction1(setRootProperty))
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(js.Any.fromFunction1(setWriteAllFields))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJson]
  }
}

