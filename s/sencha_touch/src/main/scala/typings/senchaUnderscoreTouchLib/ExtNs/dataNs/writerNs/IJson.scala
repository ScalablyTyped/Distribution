package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.writerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJson extends IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of allowSingle
  		* @returns Boolean
  		*/
  var getAllowSingle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of encode
  		* @returns Boolean
  		*/
  var getEncode: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of encodeRequest
  		* @returns Boolean
  		*/
  var getEncodeRequest: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var setAllowSingle: js.UndefOr[js.Function1[/* allowSingle */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of encode
  		* @param encode Boolean The new value.
  		*/
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of encodeRequest
  		* @param encodeRequest Boolean The new value.
  		*/
  var setEncodeRequest: js.UndefOr[js.Function1[/* encodeRequest */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of rootProperty
  		* @param rootProperty String The new value.
  		*/
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

object IJson {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    allowSingle: js.UndefOr[scala.Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    encode: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    getAllowSingle: js.Function0[scala.Boolean] = null,
    getEncode: js.Function0[scala.Boolean] = null,
    getEncodeRequest: js.Function0[scala.Boolean] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getNameProperty: js.Function0[java.lang.String] = null,
    getRecordData: js.Function1[/* record */ js.UndefOr[js.Any], _] = null,
    getRootProperty: js.Function0[java.lang.String] = null,
    getWriteAllFields: js.Function0[scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    platformConfig: js.Any = null,
    root: java.lang.String = null,
    rootProperty: java.lang.String = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAllowSingle: js.Function1[/* allowSingle */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setEncode: js.Function1[/* encode */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setEncodeRequest: js.Function1[/* encodeRequest */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setNameProperty: js.Function1[/* nameProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRootProperty: js.Function1[/* rootProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setWriteAllFields: js.Function1[/* writeAllFields */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    write: js.Function1[
      /* request */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRequest], 
      senchaUnderscoreTouchLib.ExtNs.dataNs.IRequest
    ] = null,
    writeAllFields: js.UndefOr[scala.Boolean] = js.undefined
  ): IJson = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowSingle)) __obj.updateDynamic("allowSingle")(allowSingle)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAllowSingle != null) __obj.updateDynamic("getAllowSingle")(getAllowSingle)
    if (getEncode != null) __obj.updateDynamic("getEncode")(getEncode)
    if (getEncodeRequest != null) __obj.updateDynamic("getEncodeRequest")(getEncodeRequest)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getNameProperty != null) __obj.updateDynamic("getNameProperty")(getNameProperty)
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(getRecordData)
    if (getRootProperty != null) __obj.updateDynamic("getRootProperty")(getRootProperty)
    if (getWriteAllFields != null) __obj.updateDynamic("getWriteAllFields")(getWriteAllFields)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (root != null) __obj.updateDynamic("root")(root)
    if (rootProperty != null) __obj.updateDynamic("rootProperty")(rootProperty)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAllowSingle != null) __obj.updateDynamic("setAllowSingle")(setAllowSingle)
    if (setEncode != null) __obj.updateDynamic("setEncode")(setEncode)
    if (setEncodeRequest != null) __obj.updateDynamic("setEncodeRequest")(setEncodeRequest)
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(setNameProperty)
    if (setRootProperty != null) __obj.updateDynamic("setRootProperty")(setRootProperty)
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(setWriteAllFields)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(write)
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields)
    __obj.asInstanceOf[IJson]
  }
}

