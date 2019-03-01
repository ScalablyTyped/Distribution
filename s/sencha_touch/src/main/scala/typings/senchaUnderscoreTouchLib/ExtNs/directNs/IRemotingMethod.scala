package typings
package senchaUnderscoreTouchLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemotingMethod
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
  		* @param args Array The arguments passed to the direct call
  		* @returns Object An object with 3 properties, args, callback &amp; scope.
  		*/
  var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], _]] = js.undefined
  /** [Method] Returns the value of formHandler
  		* @returns Object
  		*/
  var getFormHandler: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of len
  		* @returns Object
  		*/
  var getLen: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns Object
  		*/
  var getName: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of ordered
  		* @returns Boolean
  		*/
  var getOrdered: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of formHandler
  		* @param formHandler Object The new value.
  		*/
  var setFormHandler: js.UndefOr[js.Function1[/* formHandler */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of len
  		* @param len Object The new value.
  		*/
  var setLen: js.UndefOr[js.Function1[/* len */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of ordered
  		* @param ordered Boolean The new value.
  		*/
  var setOrdered: js.UndefOr[js.Function1[/* ordered */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IRemotingMethod {
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
    getCallData: js.Function1[/* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], _] = null,
    getFormHandler: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLen: js.Function0[_] = null,
    getName: js.Function0[_] = null,
    getOrdered: js.Function0[scala.Boolean] = null,
    getParams: js.Function0[_] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setFormHandler: js.Function1[/* formHandler */ js.UndefOr[js.Any], scala.Unit] = null,
    setLen: js.Function1[/* len */ js.UndefOr[js.Any], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[js.Any], scala.Unit] = null,
    setOrdered: js.Function1[/* ordered */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setParams: js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IRemotingMethod = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCallData != null) __obj.updateDynamic("getCallData")(getCallData)
    if (getFormHandler != null) __obj.updateDynamic("getFormHandler")(getFormHandler)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLen != null) __obj.updateDynamic("getLen")(getLen)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getOrdered != null) __obj.updateDynamic("getOrdered")(getOrdered)
    if (getParams != null) __obj.updateDynamic("getParams")(getParams)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFormHandler != null) __obj.updateDynamic("setFormHandler")(setFormHandler)
    if (setLen != null) __obj.updateDynamic("setLen")(setLen)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setOrdered != null) __obj.updateDynamic("setOrdered")(setOrdered)
    if (setParams != null) __obj.updateDynamic("setParams")(setParams)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRemotingMethod]
  }
}

