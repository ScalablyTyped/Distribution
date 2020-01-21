package typings.senchaTouch.Ext.direct

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemotingMethod extends IBase {
  /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
  		* @param args Array The arguments passed to the direct call
  		* @returns Object An object with 3 properties, args, callback &amp; scope.
  		*/
  var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], _]] = js.undefined
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
  var getOrdered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of params
  		* @returns Object
  		*/
  var getParams: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of formHandler
  		* @param formHandler Object The new value.
  		*/
  var setFormHandler: js.UndefOr[js.Function1[/* formHandler */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of len
  		* @param len Object The new value.
  		*/
  var setLen: js.UndefOr[js.Function1[/* len */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name Object The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ordered
  		* @param ordered Boolean The new value.
  		*/
  var setOrdered: js.UndefOr[js.Function1[/* ordered */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of params
  		* @param params Object The new value.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IRemotingMethod {
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
    getCallData: /* args */ js.UndefOr[Array] => _ = null,
    getFormHandler: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLen: () => _ = null,
    getName: () => _ = null,
    getOrdered: () => Boolean = null,
    getParams: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setFormHandler: /* formHandler */ js.UndefOr[js.Any] => Unit = null,
    setLen: /* len */ js.UndefOr[js.Any] => Unit = null,
    setName: /* name */ js.UndefOr[js.Any] => Unit = null,
    setOrdered: /* ordered */ js.UndefOr[Boolean] => Unit = null,
    setParams: /* params */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IRemotingMethod = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getCallData != null) __obj.updateDynamic("getCallData")(js.Any.fromFunction1(getCallData))
    if (getFormHandler != null) __obj.updateDynamic("getFormHandler")(js.Any.fromFunction0(getFormHandler))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLen != null) __obj.updateDynamic("getLen")(js.Any.fromFunction0(getLen))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getOrdered != null) __obj.updateDynamic("getOrdered")(js.Any.fromFunction0(getOrdered))
    if (getParams != null) __obj.updateDynamic("getParams")(js.Any.fromFunction0(getParams))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFormHandler != null) __obj.updateDynamic("setFormHandler")(js.Any.fromFunction1(setFormHandler))
    if (setLen != null) __obj.updateDynamic("setLen")(js.Any.fromFunction1(setLen))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setOrdered != null) __obj.updateDynamic("setOrdered")(js.Any.fromFunction1(setOrdered))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1(setParams))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemotingMethod]
  }
}

