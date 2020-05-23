package typings.senchaTouch.Ext.direct

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransaction extends IBase {
  /** [Method] Returns the value of action
    * @returns Object
    */
  var getAction: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of args
    * @returns Object
    */
  var getArgs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of callback
    * @returns Object
    */
  var getCallback: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of form
    * @returns Object
    */
  var getForm: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of id
    * @returns Object
    */
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of method
    * @returns Object
    */
  var getMethod: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of provider
    * @returns Object
    */
  var getProvider: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of retryCount
    * @returns Number
    */
  var getRetryCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Sets the value of action
    * @param action Object The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of args
    * @param args Object The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of callback
    * @param callback Object The new value.
    */
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of form
    * @param form Object The new value.
    */
  var setForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of id
    * @param id Object The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of method
    * @param method Object The new value.
    */
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of provider
    * @param provider Object The new value.
    */
  var setProvider: js.UndefOr[js.Function1[/* provider */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of retryCount
    * @param retryCount Number The new value.
    */
  var setRetryCount: js.UndefOr[js.Function1[/* retryCount */ js.UndefOr[Double], Unit]] = js.undefined
}

object ITransaction {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    getAction: () => _ = null,
    getArgs: () => _ = null,
    getCallback: () => _ = null,
    getData: () => _ = null,
    getForm: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getMethod: () => _ = null,
    getProvider: () => _ = null,
    getRetryCount: () => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[js.Any] => Unit = null,
    setArgs: /* args */ js.UndefOr[js.Any] => Unit = null,
    setCallback: /* callback */ js.UndefOr[js.Any] => Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => Unit = null,
    setForm: /* form */ js.UndefOr[js.Any] => Unit = null,
    setId: /* id */ js.UndefOr[js.Any] => Unit = null,
    setMethod: /* method */ js.UndefOr[js.Any] => Unit = null,
    setProvider: /* provider */ js.UndefOr[js.Any] => Unit = null,
    setRetryCount: /* retryCount */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITransaction = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getAction != null) __obj.updateDynamic("getAction")(js.Any.fromFunction0(getAction))
    if (getArgs != null) __obj.updateDynamic("getArgs")(js.Any.fromFunction0(getArgs))
    if (getCallback != null) __obj.updateDynamic("getCallback")(js.Any.fromFunction0(getCallback))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getForm != null) __obj.updateDynamic("getForm")(js.Any.fromFunction0(getForm))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMethod != null) __obj.updateDynamic("getMethod")(js.Any.fromFunction0(getMethod))
    if (getProvider != null) __obj.updateDynamic("getProvider")(js.Any.fromFunction0(getProvider))
    if (getRetryCount != null) __obj.updateDynamic("getRetryCount")(js.Any.fromFunction0(getRetryCount))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1(setAction))
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1(setArgs))
    if (setCallback != null) __obj.updateDynamic("setCallback")(js.Any.fromFunction1(setCallback))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setForm != null) __obj.updateDynamic("setForm")(js.Any.fromFunction1(setForm))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1(setId))
    if (setMethod != null) __obj.updateDynamic("setMethod")(js.Any.fromFunction1(setMethod))
    if (setProvider != null) __obj.updateDynamic("setProvider")(js.Any.fromFunction1(setProvider))
    if (setRetryCount != null) __obj.updateDynamic("setRetryCount")(js.Any.fromFunction1(setRetryCount))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransaction]
  }
}

