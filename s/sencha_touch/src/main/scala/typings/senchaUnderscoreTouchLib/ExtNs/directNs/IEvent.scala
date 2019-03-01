package typings
package senchaUnderscoreTouchLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of code
  		* @returns Object
  		*/
  var getCode: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of result
  		* @returns Object
  		*/
  var getResult: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of status
  		* @returns Boolean
  		*/
  var getStatus: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of transaction
  		* @returns Object
  		*/
  var getTransaction: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of xhr
  		* @returns Object
  		*/
  var getXhr: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of code
  		* @param code Object The new value.
  		*/
  var setCode: js.UndefOr[js.Function1[/* code */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of result
  		* @param result Object The new value.
  		*/
  var setResult: js.UndefOr[js.Function1[/* result */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of status
  		* @param status Boolean The new value.
  		*/
  var setStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of transaction
  		* @param transaction Object The new value.
  		*/
  var setTransaction: js.UndefOr[js.Function1[/* transaction */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of xhr
  		* @param xhr Object The new value.
  		*/
  var setXhr: js.UndefOr[js.Function1[/* xhr */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IEvent {
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
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMessage: js.Function0[java.lang.String] = null,
    getName: js.Function0[java.lang.String] = null,
    getResult: js.Function0[_] = null,
    getStatus: js.Function0[scala.Boolean] = null,
    getTransaction: js.Function0[_] = null,
    getXhr: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setCode: js.Function1[/* code */ js.UndefOr[js.Any], scala.Unit] = null,
    setData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    setMessage: js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setResult: js.Function1[/* result */ js.UndefOr[js.Any], scala.Unit] = null,
    setStatus: js.Function1[/* status */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setTransaction: js.Function1[/* transaction */ js.UndefOr[js.Any], scala.Unit] = null,
    setXhr: js.Function1[/* xhr */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IEvent = {
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
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMessage != null) __obj.updateDynamic("getMessage")(getMessage)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getResult != null) __obj.updateDynamic("getResult")(getResult)
    if (getStatus != null) __obj.updateDynamic("getStatus")(getStatus)
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
    if (setMessage != null) __obj.updateDynamic("setMessage")(setMessage)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setResult != null) __obj.updateDynamic("setResult")(setResult)
    if (setStatus != null) __obj.updateDynamic("setStatus")(setStatus)
    if (setTransaction != null) __obj.updateDynamic("setTransaction")(setTransaction)
    if (setXhr != null) __obj.updateDynamic("setXhr")(setXhr)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEvent]
  }
}

