package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends IBase {
  /** [Config Option] (String) */
  var action: js.UndefOr[String] = js.undefined
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Config Option] (Array) */
  var args: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Array) */
  var beforeFilters: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.app.Controller) */
  var controller: js.UndefOr[IController] = js.undefined
  /** [Method] Starts execution of this Action by calling each of the beforeFilters in turn if any are specified  before calling t  */
  var execute: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of action
    * @returns String
    */
  var getAction: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of application
    * @returns Ext.app.Application
    */
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns the value of args
    * @returns Array
    */
  var getArgs: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of beforeFilters
    * @returns Array
    */
  var getBeforeFilters: js.UndefOr[js.Function0[Array]] = js.undefined
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
  var getUrl: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Resumes the execution of this Action or starts it if it had not been started already */
  var resume: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of action
    * @param action String The new value.
    */
  var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of application
    * @param application Ext.app.Application The new value.
    */
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
  /** [Method] Sets the value of args
    * @param args Array The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of beforeFilters
    * @param beforeFilters Array The new value.
    */
  var setBeforeFilters: js.UndefOr[js.Function1[/* beforeFilters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of controller
    * @param controller Ext.app.Controller The new value.
    */
  var setController: js.UndefOr[js.Function1[/* controller */ js.UndefOr[IController], Unit]] = js.undefined
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
    * @param title Object The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of url
    * @param url String The new value.
    */
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.undefined
}

object IAction {
  @scala.inline
  def apply(
    action: String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    application: IApplication = null,
    args: Array = null,
    beforeFilters: Array = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    controller: IController = null,
    destroy: () => Unit = null,
    execute: () => Unit = null,
    extend: String = null,
    getAction: () => String = null,
    getApplication: () => IApplication = null,
    getArgs: () => Array = null,
    getBeforeFilters: () => Array = null,
    getController: () => IController = null,
    getData: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getScope: () => _ = null,
    getTitle: () => _ = null,
    getUrl: () => String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    resume: () => Unit = null,
    scope: js.Any = null,
    self: IClass = null,
    setAction: /* action */ js.UndefOr[String] => Unit = null,
    setApplication: /* application */ js.UndefOr[IApplication] => Unit = null,
    setArgs: /* args */ js.UndefOr[Array] => Unit = null,
    setBeforeFilters: /* beforeFilters */ js.UndefOr[Array] => Unit = null,
    setController: /* controller */ js.UndefOr[IController] => Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Unit = null,
    setUrl: /* url */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    url: String = null,
    uses: Array = null
  ): IAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (beforeFilters != null) __obj.updateDynamic("beforeFilters")(beforeFilters.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction0(execute))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getAction != null) __obj.updateDynamic("getAction")(js.Any.fromFunction0(getAction))
    if (getApplication != null) __obj.updateDynamic("getApplication")(js.Any.fromFunction0(getApplication))
    if (getArgs != null) __obj.updateDynamic("getArgs")(js.Any.fromFunction0(getArgs))
    if (getBeforeFilters != null) __obj.updateDynamic("getBeforeFilters")(js.Any.fromFunction0(getBeforeFilters))
    if (getController != null) __obj.updateDynamic("getController")(js.Any.fromFunction0(getController))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(js.Any.fromFunction0(resume))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAction != null) __obj.updateDynamic("setAction")(js.Any.fromFunction1(setAction))
    if (setApplication != null) __obj.updateDynamic("setApplication")(js.Any.fromFunction1(setApplication))
    if (setArgs != null) __obj.updateDynamic("setArgs")(js.Any.fromFunction1(setArgs))
    if (setBeforeFilters != null) __obj.updateDynamic("setBeforeFilters")(js.Any.fromFunction1(setBeforeFilters))
    if (setController != null) __obj.updateDynamic("setController")(js.Any.fromFunction1(setController))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
}

