package typings.senchaTouch.Ext.direct

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExceptionEvent extends IRemotingEvent {
  /** [Method] Returns the value of error
    * @returns Object
    */
  var getError: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of error
    * @param error Object The new value.
    */
  var setError: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IExceptionEvent {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    data: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    getCode: () => _ = null,
    getData: () => _ = null,
    getError: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getMessage: () => String = null,
    getName: () => String = null,
    getResult: () => _ = null,
    getStatus: () => Boolean = null,
    getTid: () => _ = null,
    getTransaction: () => ITransaction = null,
    getXhr: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    name: String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCode: /* code */ js.UndefOr[js.Any] => Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => Unit = null,
    setError: /* error */ js.UndefOr[js.Any] => Unit = null,
    setMessage: /* message */ js.UndefOr[String] => Unit = null,
    setName: /* name */ js.UndefOr[String] => Unit = null,
    setResult: /* result */ js.UndefOr[js.Any] => Unit = null,
    setStatus: /* status */ js.UndefOr[Boolean] => Unit = null,
    setTid: /* tid */ js.UndefOr[js.Any] => Unit = null,
    setTransaction: /* transaction */ js.UndefOr[js.Any] => Unit = null,
    setXhr: /* xhr */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IExceptionEvent = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getCode != null) __obj.updateDynamic("getCode")(js.Any.fromFunction0(getCode))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getError != null) __obj.updateDynamic("getError")(js.Any.fromFunction0(getError))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMessage != null) __obj.updateDynamic("getMessage")(js.Any.fromFunction0(getMessage))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getResult != null) __obj.updateDynamic("getResult")(js.Any.fromFunction0(getResult))
    if (getStatus != null) __obj.updateDynamic("getStatus")(js.Any.fromFunction0(getStatus))
    if (getTid != null) __obj.updateDynamic("getTid")(js.Any.fromFunction0(getTid))
    if (getTransaction != null) __obj.updateDynamic("getTransaction")(js.Any.fromFunction0(getTransaction))
    if (getXhr != null) __obj.updateDynamic("getXhr")(js.Any.fromFunction0(getXhr))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCode != null) __obj.updateDynamic("setCode")(js.Any.fromFunction1(setCode))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setError != null) __obj.updateDynamic("setError")(js.Any.fromFunction1(setError))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1(setMessage))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setResult != null) __obj.updateDynamic("setResult")(js.Any.fromFunction1(setResult))
    if (setStatus != null) __obj.updateDynamic("setStatus")(js.Any.fromFunction1(setStatus))
    if (setTid != null) __obj.updateDynamic("setTid")(js.Any.fromFunction1(setTid))
    if (setTransaction != null) __obj.updateDynamic("setTransaction")(js.Any.fromFunction1(setTransaction))
    if (setXhr != null) __obj.updateDynamic("setXhr")(js.Any.fromFunction1(setXhr))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExceptionEvent]
  }
}

