package typings
package senchaUnderscoreTouchLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransaction
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
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
  var getRetryCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Sets the value of action
  		* @param action Object The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Object The new value.
  		*/
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of callback
  		* @param callback Object The new value.
  		*/
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of form
  		* @param form Object The new value.
  		*/
  var setForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of id
  		* @param id Object The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of method
  		* @param method Object The new value.
  		*/
  var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of provider
  		* @param provider Object The new value.
  		*/
  var setProvider: js.UndefOr[js.Function1[/* provider */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of retryCount
  		* @param retryCount Number The new value.
  		*/
  var setRetryCount: js.UndefOr[js.Function1[/* retryCount */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object ITransaction {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getAction: js.Function0[_] = null,
    getArgs: js.Function0[_] = null,
    getCallback: js.Function0[_] = null,
    getData: js.Function0[_] = null,
    getForm: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getMethod: js.Function0[_] = null,
    getProvider: js.Function0[_] = null,
    getRetryCount: js.Function0[scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAction: js.Function1[/* action */ js.UndefOr[js.Any], scala.Unit] = null,
    setArgs: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit] = null,
    setCallback: js.Function1[/* callback */ js.UndefOr[js.Any], scala.Unit] = null,
    setData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    setForm: js.Function1[/* form */ js.UndefOr[js.Any], scala.Unit] = null,
    setId: js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit] = null,
    setMethod: js.Function1[/* method */ js.UndefOr[js.Any], scala.Unit] = null,
    setProvider: js.Function1[/* provider */ js.UndefOr[js.Any], scala.Unit] = null,
    setRetryCount: js.Function1[/* retryCount */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ITransaction = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAction != null) __obj.updateDynamic("getAction")(getAction)
    if (getArgs != null) __obj.updateDynamic("getArgs")(getArgs)
    if (getCallback != null) __obj.updateDynamic("getCallback")(getCallback)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getForm != null) __obj.updateDynamic("getForm")(getForm)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getMethod != null) __obj.updateDynamic("getMethod")(getMethod)
    if (getProvider != null) __obj.updateDynamic("getProvider")(getProvider)
    if (getRetryCount != null) __obj.updateDynamic("getRetryCount")(getRetryCount)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAction != null) __obj.updateDynamic("setAction")(setAction)
    if (setArgs != null) __obj.updateDynamic("setArgs")(setArgs)
    if (setCallback != null) __obj.updateDynamic("setCallback")(setCallback)
    if (setData != null) __obj.updateDynamic("setData")(setData)
    if (setForm != null) __obj.updateDynamic("setForm")(setForm)
    if (setId != null) __obj.updateDynamic("setId")(setId)
    if (setMethod != null) __obj.updateDynamic("setMethod")(setMethod)
    if (setProvider != null) __obj.updateDynamic("setProvider")(setProvider)
    if (setRetryCount != null) __obj.updateDynamic("setRetryCount")(setRetryCount)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITransaction]
  }
}

