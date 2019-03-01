package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultSet
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of count
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of loaded
  		* @returns Boolean
  		*/
  var getLoaded: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of records
  		* @returns Ext.data.Model[]
  		*/
  var getRecords: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of success
  		* @returns Boolean
  		*/
  var getSuccess: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of total
  		* @returns Number
  		*/
  var getTotal: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Sets the value of count
  		* @param count Number The new value.
  		*/
  var setCount: js.UndefOr[js.Function1[/* count */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loaded
  		* @param loaded Boolean The new value.
  		*/
  var setLoaded: js.UndefOr[js.Function1[/* loaded */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of records
  		* @param records Ext.data.Model[] The new value.
  		*/
  var setRecords: js.UndefOr[
    js.Function1[/* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of success
  		* @param success Boolean The new value.
  		*/
  var setSuccess: js.UndefOr[js.Function1[/* success */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of total
  		* @param total Number The new value.
  		*/
  var setTotal: js.UndefOr[js.Function1[/* total */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var total: js.UndefOr[scala.Double] = js.undefined
}

object IResultSet {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    count: scala.Int | scala.Double = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getCount: js.Function0[scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLoaded: js.Function0[scala.Boolean] = null,
    getMessage: js.Function0[java.lang.String] = null,
    getRecords: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getSuccess: js.Function0[scala.Boolean] = null,
    getTotal: js.Function0[scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    loaded: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    records: senchaUnderscoreTouchLib.ExtNs.Array = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setCount: js.Function1[/* count */ js.UndefOr[scala.Double], scala.Unit] = null,
    setLoaded: js.Function1[/* loaded */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setMessage: js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRecords: js.Function1[/* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setSuccess: js.Function1[/* success */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setTotal: js.Function1[/* total */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    total: scala.Int | scala.Double = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IResultSet = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLoaded != null) __obj.updateDynamic("getLoaded")(getLoaded)
    if (getMessage != null) __obj.updateDynamic("getMessage")(getMessage)
    if (getRecords != null) __obj.updateDynamic("getRecords")(getRecords)
    if (getSuccess != null) __obj.updateDynamic("getSuccess")(getSuccess)
    if (getTotal != null) __obj.updateDynamic("getTotal")(getTotal)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded)
    if (message != null) __obj.updateDynamic("message")(message)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (records != null) __obj.updateDynamic("records")(records)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCount != null) __obj.updateDynamic("setCount")(setCount)
    if (setLoaded != null) __obj.updateDynamic("setLoaded")(setLoaded)
    if (setMessage != null) __obj.updateDynamic("setMessage")(setMessage)
    if (setRecords != null) __obj.updateDynamic("setRecords")(setRecords)
    if (setSuccess != null) __obj.updateDynamic("setSuccess")(setSuccess)
    if (setTotal != null) __obj.updateDynamic("setTotal")(setTotal)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IResultSet]
  }
}

