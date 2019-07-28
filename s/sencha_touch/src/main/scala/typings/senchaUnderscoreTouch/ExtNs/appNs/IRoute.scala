package typings.senchaUnderscoreTouch.ExtNs.appNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IBase
import typings.senchaUnderscoreTouch.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var conditions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var controller: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of conditions
  		* @returns Object
  		*/
  var getConditions: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of controller
  		* @returns String
  		*/
  var getController: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Property] (Object) */
  var paramsInMatchString: js.UndefOr[js.Any] = js.undefined
  /** [Method] Attempts to recognize a given url string and return controller action pair for it
  		* @param url String The url to recognize.
  		* @returns Object/Boolean The matched data, or false if no match.
  		*/
  var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of conditions
  		* @param conditions Object The new value.
  		*/
  var setConditions: js.UndefOr[js.Function1[/* conditions */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of controller
  		* @param controller String The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IRoute {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    conditions: js.Any = null,
    config: js.Any = null,
    controller: java.lang.String = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getAction: () => java.lang.String = null,
    getConditions: () => _ = null,
    getController: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getUrl: () => java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    paramsInMatchString: js.Any = null,
    platformConfig: js.Any = null,
    recognize: /* url */ js.UndefOr[java.lang.String] => _ = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[java.lang.String] => Unit = null,
    setConditions: /* conditions */ js.UndefOr[js.Any] => Unit = null,
    setController: /* controller */ js.UndefOr[java.lang.String] => Unit = null,
    setUrl: /* url */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    url: java.lang.String = null,
    uses: Array = null
  ): IRoute = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (config != null) __obj.updateDynamic("config")(config)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAction != null) __obj.updateDynamic("getAction")(js.Any.fromFunction0(getAction))
    if (getConditions != null) __obj.updateDynamic("getConditions")(js.Any.fromFunction0(getConditions))
    if (getController != null) __obj.updateDynamic("getController")(js.Any.fromFunction0(getController))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (paramsInMatchString != null) __obj.updateDynamic("paramsInMatchString")(paramsInMatchString)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (recognize != null) __obj.updateDynamic("recognize")(js.Any.fromFunction1(recognize))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1(setAction))
    if (setConditions != null) __obj.updateDynamic("setConditions")(js.Any.fromFunction1(setConditions))
    if (setController != null) __obj.updateDynamic("setController")(js.Any.fromFunction1(setController))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRoute]
  }
}

