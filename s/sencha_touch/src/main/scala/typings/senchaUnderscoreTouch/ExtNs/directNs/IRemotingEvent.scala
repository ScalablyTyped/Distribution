package typings.senchaUnderscoreTouch.ExtNs.directNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemotingEvent extends IEvent {
  /** [Method] Returns the value of tid
  		* @returns Object
  		*/
  var getTid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Get the transaction associated with this event
  		* @returns Ext.direct.Transaction The transaction
  		*/
  @JSName("getTransaction")
  var getTransaction_IRemotingEvent: js.UndefOr[js.Function0[ITransaction]] = js.undefined
  /** [Method] Sets the value of tid
  		* @param tid Object The new value.
  		*/
  var setTid: js.UndefOr[js.Function1[/* tid */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IRemotingEvent {
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
    extend: java.lang.String = null,
    getCode: () => _ = null,
    getData: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getMessage: () => java.lang.String = null,
    getName: () => java.lang.String = null,
    getResult: () => _ = null,
    getStatus: () => Boolean = null,
    getTid: () => _ = null,
    getTransaction: () => ITransaction = null,
    getXhr: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setCode: /* code */ js.UndefOr[js.Any] => Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => Unit = null,
    setMessage: /* message */ js.UndefOr[java.lang.String] => Unit = null,
    setName: /* name */ js.UndefOr[java.lang.String] => Unit = null,
    setResult: /* result */ js.UndefOr[js.Any] => Unit = null,
    setStatus: /* status */ js.UndefOr[Boolean] => Unit = null,
    setTid: /* tid */ js.UndefOr[js.Any] => Unit = null,
    setTransaction: /* transaction */ js.UndefOr[js.Any] => Unit = null,
    setXhr: /* xhr */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IRemotingEvent = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCode != null) __obj.updateDynamic("getCode")(js.Any.fromFunction0(getCode))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getMessage != null) __obj.updateDynamic("getMessage")(js.Any.fromFunction0(getMessage))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getResult != null) __obj.updateDynamic("getResult")(js.Any.fromFunction0(getResult))
    if (getStatus != null) __obj.updateDynamic("getStatus")(js.Any.fromFunction0(getStatus))
    if (getTid != null) __obj.updateDynamic("getTid")(js.Any.fromFunction0(getTid))
    if (getTransaction != null) __obj.updateDynamic("getTransaction")(js.Any.fromFunction0(getTransaction))
    if (getXhr != null) __obj.updateDynamic("getXhr")(js.Any.fromFunction0(getXhr))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCode != null) __obj.updateDynamic("setCode")(js.Any.fromFunction1(setCode))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1(setMessage))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setResult != null) __obj.updateDynamic("setResult")(js.Any.fromFunction1(setResult))
    if (setStatus != null) __obj.updateDynamic("setStatus")(js.Any.fromFunction1(setStatus))
    if (setTid != null) __obj.updateDynamic("setTid")(js.Any.fromFunction1(setTid))
    if (setTransaction != null) __obj.updateDynamic("setTransaction")(js.Any.fromFunction1(setTransaction))
    if (setXhr != null) __obj.updateDynamic("setXhr")(js.Any.fromFunction1(setXhr))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRemotingEvent]
  }
}

