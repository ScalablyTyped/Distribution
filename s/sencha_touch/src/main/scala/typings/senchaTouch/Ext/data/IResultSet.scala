package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultSet extends IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of count
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of loaded
    * @returns Boolean
    */
  var getLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of records
    * @returns Ext.data.Model[]
    */
  var getRecords: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of success
    * @returns Boolean
    */
  var getSuccess: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of total
    * @returns Number
    */
  var getTotal: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var message: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.undefined
  /** [Method] Sets the value of count
    * @param count Number The new value.
    */
  var setCount: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of loaded
    * @param loaded Boolean The new value.
    */
  var setLoaded: js.UndefOr[js.Function1[/* loaded */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of records
    * @param records Ext.data.Model[] The new value.
    */
  var setRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of success
    * @param success Boolean The new value.
    */
  var setSuccess: js.UndefOr[js.Function1[/* success */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of total
    * @param total Number The new value.
    */
  var setTotal: js.UndefOr[js.Function1[/* total */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.undefined
}

object IResultSet {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    count: js.UndefOr[Double] = js.undefined,
    destroy: () => Unit = null,
    extend: String = null,
    getCount: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLoaded: () => Boolean = null,
    getMessage: () => String = null,
    getRecords: () => Array = null,
    getSuccess: () => Boolean = null,
    getTotal: () => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    loaded: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    records: Array = null,
    self: IClass = null,
    setCount: /* count */ js.UndefOr[Double] => Unit = null,
    setLoaded: /* loaded */ js.UndefOr[Boolean] => Unit = null,
    setMessage: /* message */ js.UndefOr[String] => Unit = null,
    setRecords: /* records */ js.UndefOr[Array] => Unit = null,
    setSuccess: /* success */ js.UndefOr[Boolean] => Unit = null,
    setTotal: /* total */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined,
    total: js.UndefOr[Double] = js.undefined,
    uses: Array = null
  ): IResultSet = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLoaded != null) __obj.updateDynamic("getLoaded")(js.Any.fromFunction0(getLoaded))
    if (getMessage != null) __obj.updateDynamic("getMessage")(js.Any.fromFunction0(getMessage))
    if (getRecords != null) __obj.updateDynamic("getRecords")(js.Any.fromFunction0(getRecords))
    if (getSuccess != null) __obj.updateDynamic("getSuccess")(js.Any.fromFunction0(getSuccess))
    if (getTotal != null) __obj.updateDynamic("getTotal")(js.Any.fromFunction0(getTotal))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCount != null) __obj.updateDynamic("setCount")(js.Any.fromFunction1(setCount))
    if (setLoaded != null) __obj.updateDynamic("setLoaded")(js.Any.fromFunction1(setLoaded))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1(setMessage))
    if (setRecords != null) __obj.updateDynamic("setRecords")(js.Any.fromFunction1(setRecords))
    if (setSuccess != null) __obj.updateDynamic("setSuccess")(js.Any.fromFunction1(setSuccess))
    if (setTotal != null) __obj.updateDynamic("setTotal")(js.Any.fromFunction1(setTotal))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResultSet]
  }
}

