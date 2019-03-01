package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
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
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of conditions
  		* @param conditions Object The new value.
  		*/
  var setConditions: js.UndefOr[js.Function1[/* conditions */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of controller
  		* @param controller String The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IRoute {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    conditions: js.Any = null,
    config: js.Any = null,
    controller: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getAction: js.Function0[java.lang.String] = null,
    getConditions: js.Function0[_] = null,
    getController: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getUrl: js.Function0[java.lang.String] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    paramsInMatchString: js.Any = null,
    platformConfig: js.Any = null,
    recognize: js.Function1[/* url */ js.UndefOr[java.lang.String], _] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAction: js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setConditions: js.Function1[/* conditions */ js.UndefOr[js.Any], scala.Unit] = null,
    setController: js.Function1[/* controller */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    url: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IRoute = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (config != null) __obj.updateDynamic("config")(config)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAction != null) __obj.updateDynamic("getAction")(getAction)
    if (getConditions != null) __obj.updateDynamic("getConditions")(getConditions)
    if (getController != null) __obj.updateDynamic("getController")(getController)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (paramsInMatchString != null) __obj.updateDynamic("paramsInMatchString")(paramsInMatchString)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (recognize != null) __obj.updateDynamic("recognize")(recognize)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAction != null) __obj.updateDynamic("setAction")(setAction)
    if (setConditions != null) __obj.updateDynamic("setConditions")(setConditions)
    if (setController != null) __obj.updateDynamic("setController")(setController)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRoute]
  }
}

