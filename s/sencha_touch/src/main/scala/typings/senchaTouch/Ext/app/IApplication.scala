package typings.senchaTouch.Ext.app

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[String] = js.native
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.app.Profile) */
  var currentProfile: js.UndefOr[IProfile] = js.native
  /** [Method] Dispatches a given Ext app Action to the relevant Controller instance
    * @param action Ext.app.Action The action to dispatch.
    * @param addToHistory Boolean Sets the browser's url to the action's url.
    */
  var dispatch: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Returns the value of appFolder
    * @returns String
    */
  var getAppFolder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the Controller instance for the given controller name
    * @param name String The name of the Controller.
    * @param profileName String Optional profile name. If passed, this is the same as calling getController('profileName.controllerName').
    * @returns Ext.app.Controller controller instance or undefined.
    */
  @JSName("getController")
  var getController_IApplication: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* profileName */ js.UndefOr[String], IController]
  ] = js.native
  /** [Method] Returns the value of controllers
    * @returns Array
    */
  var getControllers: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of currentProfile
    * @returns Ext.app.Profile
    */
  var getCurrentProfile: js.UndefOr[js.Function0[IProfile]] = js.native
  /** [Method] Returns the value of history
    * @returns Ext.app.History
    */
  var getHistory: js.UndefOr[js.Function0[IHistory]] = js.native
  /** [Method] Returns the value of launch
    * @returns Function
    */
  var getLaunch: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of profiles
    * @returns Array
    */
  var getProfiles: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of requires
    * @returns String[]
    */
  var getRequires: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of router
    * @returns Ext.app.Router
    */
  var getRouter: js.UndefOr[js.Function0[IRouter]] = js.native
  /** [Method] Returns the value of themeVariation
    * @returns String/Function
    */
  var getThemeVariation: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of themeVariationPrefix
    * @returns String
    */
  var getThemeVariationPrefix: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of themeVariationTransitionCls
    * @returns String
    */
  var getThemeVariationTransitionCls: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Boolean) */
  var glossOnIcon: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.app.History) */
  var history: js.UndefOr[IHistory] = js.native
  /** [Config Option] (String/Object) */
  var icon: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var isIconPrecomposed: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var phoneIcon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var phoneStartupScreen: js.UndefOr[String] = js.native
  /** [Config Option] (Array) */
  var profiles: js.UndefOr[Array] = js.native
  /** [Method] Redirects the browser to the given url
    * @param url String/Ext.data.Model The String url to redirect to.
    */
  @JSName("redirectTo")
  var redirectTo_IApplication: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.app.Router) */
  var router: js.UndefOr[IRouter] = js.native
  /** [Method] Sets the value of appFolder
    * @param appFolder String The new value.
    */
  var setAppFolder: js.UndefOr[js.Function1[/* appFolder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of controllers
    * @param controllers Array The new value.
    */
  var setControllers: js.UndefOr[js.Function1[/* controllers */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of currentProfile
    * @param currentProfile Ext.app.Profile The new value.
    */
  var setCurrentProfile: js.UndefOr[js.Function1[/* currentProfile */ js.UndefOr[IProfile], Unit]] = js.native
  /** [Method] Sets the value of history
    * @param history Ext.app.History The new value.
    */
  var setHistory: js.UndefOr[js.Function1[/* history */ js.UndefOr[IHistory], Unit]] = js.native
  /** [Method] Sets the value of launch
    * @param launch Function The new value.
    */
  var setLaunch: js.UndefOr[js.Function1[/* launch */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of profiles
    * @param profiles Array The new value.
    */
  var setProfiles: js.UndefOr[js.Function1[/* profiles */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of requires
    * @param requires String[] The new value.
    */
  var setRequires: js.UndefOr[js.Function1[/* requires */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of router
    * @param router Ext.app.Router The new value.
    */
  var setRouter: js.UndefOr[js.Function1[/* router */ js.UndefOr[IRouter], Unit]] = js.native
  /** [Method] Sets the value of themeVariation
    * @param themeVariation String/Function The new value.
    */
  var setThemeVariation: js.UndefOr[js.Function1[/* themeVariation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of themeVariationPrefix
    * @param themeVariationPrefix String The new value.
    */
  var setThemeVariationPrefix: js.UndefOr[js.Function1[/* themeVariationPrefix */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of themeVariationTransitionCls
    * @param themeVariationTransitionCls String The new value.
    */
  var setThemeVariationTransitionCls: js.UndefOr[js.Function1[/* themeVariationTransitionCls */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Object) */
  var startupImage: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var statusBarStyle: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var tabletIcon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var tabletStartupScreen: js.UndefOr[String] = js.native
  /** [Config Option] (String/Function) */
  var themeVariation: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var themeVariationPrefix: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var themeVariationTransitionCls: js.UndefOr[String] = js.native
}

object IApplication {
  @scala.inline
  def apply(): IApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IApplication]
  }
  @scala.inline
  implicit class IApplicationOps[Self <: IApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppFolder(value: String): Self = this.set("appFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppFolder: Self = this.set("appFolder", js.undefined)
    @scala.inline
    def setControllers(value: Array): Self = this.set("controllers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControllers: Self = this.set("controllers", js.undefined)
    @scala.inline
    def setCurrentProfile(value: IProfile): Self = this.set("currentProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentProfile: Self = this.set("currentProfile", js.undefined)
    @scala.inline
    def setDispatch(value: (/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean]) => Unit): Self = this.set("dispatch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    @scala.inline
    def setGetAppFolder(value: () => String): Self = this.set("getAppFolder", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAppFolder: Self = this.set("getAppFolder", js.undefined)
    @scala.inline
    def setGetController(value: (/* name */ js.UndefOr[String], /* profileName */ js.UndefOr[String]) => IController): Self = this.set("getController", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetController: Self = this.set("getController", js.undefined)
    @scala.inline
    def setGetControllers(value: () => Array): Self = this.set("getControllers", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetControllers: Self = this.set("getControllers", js.undefined)
    @scala.inline
    def setGetCurrentProfile(value: () => IProfile): Self = this.set("getCurrentProfile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCurrentProfile: Self = this.set("getCurrentProfile", js.undefined)
    @scala.inline
    def setGetHistory(value: () => IHistory): Self = this.set("getHistory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHistory: Self = this.set("getHistory", js.undefined)
    @scala.inline
    def setGetLaunch(value: () => _): Self = this.set("getLaunch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLaunch: Self = this.set("getLaunch", js.undefined)
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetProfiles(value: () => Array): Self = this.set("getProfiles", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetProfiles: Self = this.set("getProfiles", js.undefined)
    @scala.inline
    def setGetRequires(value: () => Array): Self = this.set("getRequires", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRequires: Self = this.set("getRequires", js.undefined)
    @scala.inline
    def setGetRouter(value: () => IRouter): Self = this.set("getRouter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRouter: Self = this.set("getRouter", js.undefined)
    @scala.inline
    def setGetThemeVariation(value: () => _): Self = this.set("getThemeVariation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetThemeVariation: Self = this.set("getThemeVariation", js.undefined)
    @scala.inline
    def setGetThemeVariationPrefix(value: () => String): Self = this.set("getThemeVariationPrefix", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetThemeVariationPrefix: Self = this.set("getThemeVariationPrefix", js.undefined)
    @scala.inline
    def setGetThemeVariationTransitionCls(value: () => String): Self = this.set("getThemeVariationTransitionCls", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetThemeVariationTransitionCls: Self = this.set("getThemeVariationTransitionCls", js.undefined)
    @scala.inline
    def setGlossOnIcon(value: Boolean): Self = this.set("glossOnIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlossOnIcon: Self = this.set("glossOnIcon", js.undefined)
    @scala.inline
    def setHistory(value: IHistory): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIsIconPrecomposed(value: Boolean): Self = this.set("isIconPrecomposed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIconPrecomposed: Self = this.set("isIconPrecomposed", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhoneIcon(value: String): Self = this.set("phoneIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneIcon: Self = this.set("phoneIcon", js.undefined)
    @scala.inline
    def setPhoneStartupScreen(value: String): Self = this.set("phoneStartupScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneStartupScreen: Self = this.set("phoneStartupScreen", js.undefined)
    @scala.inline
    def setProfiles(value: Array): Self = this.set("profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
    @scala.inline
    def setRedirectTo(value: /* url */ js.UndefOr[js.Any] => Unit): Self = this.set("redirectTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    @scala.inline
    def setRequires(value: Array): Self = this.set("requires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequires: Self = this.set("requires", js.undefined)
    @scala.inline
    def setRouter(value: IRouter): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    @scala.inline
    def setSetAppFolder(value: /* appFolder */ js.UndefOr[String] => Unit): Self = this.set("setAppFolder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAppFolder: Self = this.set("setAppFolder", js.undefined)
    @scala.inline
    def setSetControllers(value: /* controllers */ js.UndefOr[Array] => Unit): Self = this.set("setControllers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetControllers: Self = this.set("setControllers", js.undefined)
    @scala.inline
    def setSetCurrentProfile(value: /* currentProfile */ js.UndefOr[IProfile] => Unit): Self = this.set("setCurrentProfile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCurrentProfile: Self = this.set("setCurrentProfile", js.undefined)
    @scala.inline
    def setSetHistory(value: /* history */ js.UndefOr[IHistory] => Unit): Self = this.set("setHistory", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHistory: Self = this.set("setHistory", js.undefined)
    @scala.inline
    def setSetLaunch(value: /* launch */ js.UndefOr[js.Any] => Unit): Self = this.set("setLaunch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLaunch: Self = this.set("setLaunch", js.undefined)
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[String] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    @scala.inline
    def setSetProfiles(value: /* profiles */ js.UndefOr[Array] => Unit): Self = this.set("setProfiles", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetProfiles: Self = this.set("setProfiles", js.undefined)
    @scala.inline
    def setSetRequires(value: /* requires */ js.UndefOr[Array] => Unit): Self = this.set("setRequires", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRequires: Self = this.set("setRequires", js.undefined)
    @scala.inline
    def setSetRouter(value: /* router */ js.UndefOr[IRouter] => Unit): Self = this.set("setRouter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRouter: Self = this.set("setRouter", js.undefined)
    @scala.inline
    def setSetThemeVariation(value: /* themeVariation */ js.UndefOr[js.Any] => Unit): Self = this.set("setThemeVariation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetThemeVariation: Self = this.set("setThemeVariation", js.undefined)
    @scala.inline
    def setSetThemeVariationPrefix(value: /* themeVariationPrefix */ js.UndefOr[String] => Unit): Self = this.set("setThemeVariationPrefix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetThemeVariationPrefix: Self = this.set("setThemeVariationPrefix", js.undefined)
    @scala.inline
    def setSetThemeVariationTransitionCls(value: /* themeVariationTransitionCls */ js.UndefOr[String] => Unit): Self = this.set("setThemeVariationTransitionCls", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetThemeVariationTransitionCls: Self = this.set("setThemeVariationTransitionCls", js.undefined)
    @scala.inline
    def setStartupImage(value: js.Any): Self = this.set("startupImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartupImage: Self = this.set("startupImage", js.undefined)
    @scala.inline
    def setStatusBarStyle(value: String): Self = this.set("statusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarStyle: Self = this.set("statusBarStyle", js.undefined)
    @scala.inline
    def setTabletIcon(value: String): Self = this.set("tabletIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabletIcon: Self = this.set("tabletIcon", js.undefined)
    @scala.inline
    def setTabletStartupScreen(value: String): Self = this.set("tabletStartupScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabletStartupScreen: Self = this.set("tabletStartupScreen", js.undefined)
    @scala.inline
    def setThemeVariation(value: js.Any): Self = this.set("themeVariation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeVariation: Self = this.set("themeVariation", js.undefined)
    @scala.inline
    def setThemeVariationPrefix(value: String): Self = this.set("themeVariationPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeVariationPrefix: Self = this.set("themeVariationPrefix", js.undefined)
    @scala.inline
    def setThemeVariationTransitionCls(value: String): Self = this.set("themeVariationTransitionCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeVariationTransitionCls: Self = this.set("themeVariationTransitionCls", js.undefined)
  }
  
}

