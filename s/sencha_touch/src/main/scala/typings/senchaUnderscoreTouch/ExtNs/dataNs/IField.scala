package typings.senchaUnderscoreTouch.ExtNs.dataNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IBase
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends IBase {
  /** [Config Option] (Boolean) */
  var allowNull: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of allowNull
  		* @returns Boolean
  		*/
  var getAllowNull: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of bubbleEvents
  		* @returns String
  		*/
  var getBubbleEvents: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of convert
  		* @returns Function
  		*/
  var getConvert: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of dateFormat
  		* @returns String
  		*/
  var getDateFormat: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of decode
  		* @returns Object
  		*/
  var getDecode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultValue
  		* @returns Object
  		*/
  var getDefaultValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of encode
  		* @returns Object
  		*/
  var getEncode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of mapping
  		* @returns String/Number
  		*/
  var getMapping: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of persist
  		* @returns Boolean
  		*/
  var getPersist: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of sortDir
  		* @returns String
  		*/
  var getSortDir: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of sortType
  		* @returns Function
  		*/
  var getSortType: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of type
  		* @returns String/Object
  		*/
  var getType: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of allowNull
  		* @param allowNull Boolean The new value.
  		*/
  var setAllowNull: js.UndefOr[js.Function1[/* allowNull */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String The new value.
  		*/
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of convert
  		* @param convert Function The new value.
  		*/
  var setConvert: js.UndefOr[js.Function1[/* convert */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of decode
  		* @param decode Object The new value.
  		*/
  var setDecode: js.UndefOr[js.Function1[/* decode */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultValue
  		* @param defaultValue Object The new value.
  		*/
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of encode
  		* @param encode Object The new value.
  		*/
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of mapping
  		* @param mapping String/Number The new value.
  		*/
  var setMapping: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of persist
  		* @param persist Boolean The new value.
  		*/
  var setPersist: js.UndefOr[js.Function1[/* persist */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of sortDir
  		* @param sortDir String The new value.
  		*/
  var setSortDir: js.UndefOr[js.Function1[/* sortDir */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of sortType
  		* @param sortType Function The new value.
  		*/
  var setSortType: js.UndefOr[js.Function1[/* sortType */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of type
  		* @param type String/Object The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Function) */
  var sortType: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    alias: Array = null,
    allowNull: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    convert: js.Any = null,
    dateFormat: java.lang.String = null,
    defaultValue: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getAllowNull: () => Boolean = null,
    getBubbleEvents: () => java.lang.String = null,
    getConvert: () => _ = null,
    getDateFormat: () => java.lang.String = null,
    getDecode: () => _ = null,
    getDefaultValue: () => _ = null,
    getEncode: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getMapping: () => _ = null,
    getName: () => java.lang.String = null,
    getPersist: () => Boolean = null,
    getSortDir: () => java.lang.String = null,
    getSortType: () => _ = null,
    getType: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mapping: js.Any = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAllowNull: /* allowNull */ js.UndefOr[Boolean] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[java.lang.String] => Unit = null,
    setConvert: /* convert */ js.UndefOr[js.Any] => Unit = null,
    setDateFormat: /* dateFormat */ js.UndefOr[java.lang.String] => Unit = null,
    setDecode: /* decode */ js.UndefOr[js.Any] => Unit = null,
    setDefaultValue: /* defaultValue */ js.UndefOr[js.Any] => Unit = null,
    setEncode: /* encode */ js.UndefOr[js.Any] => Unit = null,
    setMapping: /* mapping */ js.UndefOr[js.Any] => Unit = null,
    setName: /* name */ js.UndefOr[java.lang.String] => Unit = null,
    setPersist: /* persist */ js.UndefOr[Boolean] => Unit = null,
    setSortDir: /* sortDir */ js.UndefOr[java.lang.String] => Unit = null,
    setSortType: /* sortType */ js.UndefOr[js.Any] => Unit = null,
    setType: /* type */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortDir: java.lang.String = null,
    sortType: js.Any = null,
    statics: js.Any = null,
    `type`: js.Any = null,
    useNull: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (convert != null) __obj.updateDynamic("convert")(convert)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAllowNull != null) __obj.updateDynamic("getAllowNull")(js.Any.fromFunction0(getAllowNull))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getConvert != null) __obj.updateDynamic("getConvert")(js.Any.fromFunction0(getConvert))
    if (getDateFormat != null) __obj.updateDynamic("getDateFormat")(js.Any.fromFunction0(getDateFormat))
    if (getDecode != null) __obj.updateDynamic("getDecode")(js.Any.fromFunction0(getDecode))
    if (getDefaultValue != null) __obj.updateDynamic("getDefaultValue")(js.Any.fromFunction0(getDefaultValue))
    if (getEncode != null) __obj.updateDynamic("getEncode")(js.Any.fromFunction0(getEncode))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMapping != null) __obj.updateDynamic("getMapping")(js.Any.fromFunction0(getMapping))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getPersist != null) __obj.updateDynamic("getPersist")(js.Any.fromFunction0(getPersist))
    if (getSortDir != null) __obj.updateDynamic("getSortDir")(js.Any.fromFunction0(getSortDir))
    if (getSortType != null) __obj.updateDynamic("getSortType")(js.Any.fromFunction0(getSortType))
    if (getType != null) __obj.updateDynamic("getType")(js.Any.fromFunction0(getType))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mapping != null) __obj.updateDynamic("mapping")(mapping)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAllowNull != null) __obj.updateDynamic("setAllowNull")(js.Any.fromFunction1(setAllowNull))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setConvert != null) __obj.updateDynamic("setConvert")(js.Any.fromFunction1(setConvert))
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(js.Any.fromFunction1(setDateFormat))
    if (setDecode != null) __obj.updateDynamic("setDecode")(js.Any.fromFunction1(setDecode))
    if (setDefaultValue != null) __obj.updateDynamic("setDefaultValue")(js.Any.fromFunction1(setDefaultValue))
    if (setEncode != null) __obj.updateDynamic("setEncode")(js.Any.fromFunction1(setEncode))
    if (setMapping != null) __obj.updateDynamic("setMapping")(js.Any.fromFunction1(setMapping))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setPersist != null) __obj.updateDynamic("setPersist")(js.Any.fromFunction1(setPersist))
    if (setSortDir != null) __obj.updateDynamic("setSortDir")(js.Any.fromFunction1(setSortDir))
    if (setSortType != null) __obj.updateDynamic("setSortType")(js.Any.fromFunction1(setSortType))
    if (setType != null) __obj.updateDynamic("setType")(js.Any.fromFunction1(setType))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sortDir != null) __obj.updateDynamic("sortDir")(sortDir)
    if (sortType != null) __obj.updateDynamic("sortType")(sortType)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useNull)) __obj.updateDynamic("useNull")(useNull)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IField]
  }
}

