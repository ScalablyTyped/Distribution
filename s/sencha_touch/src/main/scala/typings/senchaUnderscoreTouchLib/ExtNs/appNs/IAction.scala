package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Config Option] (Array) */
  var args: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Array) */
  var beforeFilters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.app.Controller) */
  var controller: js.UndefOr[IController] = js.undefined
  /** [Method] Starts execution of this Action by calling each of the beforeFilters in turn if any are specified  before calling t  */
  var execute: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of action
  		* @returns String
  		*/
  var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns the value of args
  		* @returns Array
  		*/
  var getArgs: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of beforeFilters
  		* @returns Array
  		*/
  var getBeforeFilters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of controller
  		* @returns Ext.app.Controller
  		*/
  var getController: js.UndefOr[js.Function0[IController]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Resumes the execution of this Action or starts it if it had not been started already */
  var resume: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of action
  		* @param action String The new value.
  		*/
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit]] = js.undefined
  /** [Method] Sets the value of args
  		* @param args Array The new value.
  		*/
  var setArgs: js.UndefOr[
    js.Function1[/* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of beforeFilters
  		* @param beforeFilters Array The new value.
  		*/
  var setBeforeFilters: js.UndefOr[
    js.Function1[/* beforeFilters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of controller
  		* @param controller Ext.app.Controller The new value.
  		*/
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[IController], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IAction {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    application: IApplication = null,
    args: senchaUnderscoreTouchLib.ExtNs.Array = null,
    beforeFilters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    controller: IController = null,
    destroy: js.Function0[scala.Unit] = null,
    execute: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getAction: js.Function0[java.lang.String] = null,
    getApplication: js.Function0[IApplication] = null,
    getArgs: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getBeforeFilters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getController: js.Function0[IController] = null,
    getData: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getScope: js.Function0[_] = null,
    getTitle: js.Function0[_] = null,
    getUrl: js.Function0[java.lang.String] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    resume: js.Function0[scala.Unit] = null,
    scope: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAction: js.Function1[/* action */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setApplication: js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit] = null,
    setArgs: js.Function1[/* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setBeforeFilters: js.Function1[/* beforeFilters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setController: js.Function1[/* controller */ js.UndefOr[IController], scala.Unit] = null,
    setData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    setScope: js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    url: java.lang.String = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (application != null) __obj.updateDynamic("application")(application)
    if (args != null) __obj.updateDynamic("args")(args)
    if (beforeFilters != null) __obj.updateDynamic("beforeFilters")(beforeFilters)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (execute != null) __obj.updateDynamic("execute")(execute)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAction != null) __obj.updateDynamic("getAction")(getAction)
    if (getApplication != null) __obj.updateDynamic("getApplication")(getApplication)
    if (getArgs != null) __obj.updateDynamic("getArgs")(getArgs)
    if (getBeforeFilters != null) __obj.updateDynamic("getBeforeFilters")(getBeforeFilters)
    if (getController != null) __obj.updateDynamic("getController")(getController)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getScope != null) __obj.updateDynamic("getScope")(getScope)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (resume != null) __obj.updateDynamic("resume")(resume)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAction != null) __obj.updateDynamic("setAction")(setAction)
    if (setApplication != null) __obj.updateDynamic("setApplication")(setApplication)
    if (setArgs != null) __obj.updateDynamic("setArgs")(setArgs)
    if (setBeforeFilters != null) __obj.updateDynamic("setBeforeFilters")(setBeforeFilters)
    if (setController != null) __obj.updateDynamic("setController")(setController)
    if (setData != null) __obj.updateDynamic("setData")(setData)
    if (setScope != null) __obj.updateDynamic("setScope")(setScope)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAction]
  }
}

