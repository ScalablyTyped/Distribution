package typings
package senchaUnderscoreTouchLib.ExtNs.directNs

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
  var setError: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IExceptionEvent {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    data: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getCode: js.Function0[_] = null,
    getData: js.Function0[_] = null,
    getError: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMessage: js.Function0[java.lang.String] = null,
    getName: js.Function0[java.lang.String] = null,
    getResult: js.Function0[_] = null,
    getStatus: js.Function0[scala.Boolean] = null,
    getTid: js.Function0[_] = null,
    getTransaction: js.Function0[ITransaction] = null,
    getXhr: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setCode: js.Function1[/* code */ js.UndefOr[js.Any], scala.Unit] = null,
    setData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    setError: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    setMessage: js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setResult: js.Function1[/* result */ js.UndefOr[js.Any], scala.Unit] = null,
    setStatus: js.Function1[/* status */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setTid: js.Function1[/* tid */ js.UndefOr[js.Any], scala.Unit] = null,
    setTransaction: js.Function1[/* transaction */ js.UndefOr[js.Any], scala.Unit] = null,
    setXhr: js.Function1[/* xhr */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IExceptionEvent = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCode != null) __obj.updateDynamic("getCode")(getCode)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getError != null) __obj.updateDynamic("getError")(getError)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMessage != null) __obj.updateDynamic("getMessage")(getMessage)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getResult != null) __obj.updateDynamic("getResult")(getResult)
    if (getStatus != null) __obj.updateDynamic("getStatus")(getStatus)
    if (getTid != null) __obj.updateDynamic("getTid")(getTid)
    if (getTransaction != null) __obj.updateDynamic("getTransaction")(getTransaction)
    if (getXhr != null) __obj.updateDynamic("getXhr")(getXhr)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCode != null) __obj.updateDynamic("setCode")(setCode)
    if (setData != null) __obj.updateDynamic("setData")(setData)
    if (setError != null) __obj.updateDynamic("setError")(setError)
    if (setMessage != null) __obj.updateDynamic("setMessage")(setMessage)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setResult != null) __obj.updateDynamic("setResult")(setResult)
    if (setStatus != null) __obj.updateDynamic("setStatus")(setStatus)
    if (setTid != null) __obj.updateDynamic("setTid")(setTid)
    if (setTransaction != null) __obj.updateDynamic("setTransaction")(setTransaction)
    if (setXhr != null) __obj.updateDynamic("setXhr")(setXhr)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IExceptionEvent]
  }
}

