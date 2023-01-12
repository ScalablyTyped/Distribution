package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  trait IAction
    extends StObject
       with IBase {
    
    /** [Config Option] (String) */
    var action: js.UndefOr[java.lang.String] = js.undefined
    
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
    var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
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
    var getData: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of scope
      * @returns Object
      */
    var getScope: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of title
      * @returns Object
      */
    var getTitle: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of url
      * @returns String
      */
    var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Resumes the execution of this Action or starts it if it had not been started already */
    var resume: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var scope: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets the value of action
      * @param action String The new value.
      */
    var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
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
    var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of scope
      * @param scope Object The new value.
      */
    var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of title
      * @param title Object The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of url
      * @param url String The new value.
      */
    var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  object IAction {
    
    inline def apply(): IAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAction] (val x: Self) extends AnyVal {
      
      inline def setAction(value: java.lang.String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setApplication(value: IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setArgs(value: Array): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setBeforeFilters(value: Array): Self = StObject.set(x, "beforeFilters", value.asInstanceOf[js.Any])
      
      inline def setBeforeFiltersUndefined: Self = StObject.set(x, "beforeFilters", js.undefined)
      
      inline def setController(value: IController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setGetAction(value: () => java.lang.String): Self = StObject.set(x, "getAction", js.Any.fromFunction0(value))
      
      inline def setGetActionUndefined: Self = StObject.set(x, "getAction", js.undefined)
      
      inline def setGetApplication(value: () => IApplication): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
      
      inline def setGetApplicationUndefined: Self = StObject.set(x, "getApplication", js.undefined)
      
      inline def setGetArgs(value: () => Array): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
      
      inline def setGetArgsUndefined: Self = StObject.set(x, "getArgs", js.undefined)
      
      inline def setGetBeforeFilters(value: () => Array): Self = StObject.set(x, "getBeforeFilters", js.Any.fromFunction0(value))
      
      inline def setGetBeforeFiltersUndefined: Self = StObject.set(x, "getBeforeFilters", js.undefined)
      
      inline def setGetController(value: () => IController): Self = StObject.set(x, "getController", js.Any.fromFunction0(value))
      
      inline def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      inline def setGetData(value: () => Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      inline def setGetScope(value: () => Any): Self = StObject.set(x, "getScope", js.Any.fromFunction0(value))
      
      inline def setGetScopeUndefined: Self = StObject.set(x, "getScope", js.undefined)
      
      inline def setGetTitle(value: () => Any): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      inline def setGetUrl(value: () => java.lang.String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
      
      inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSetAction(value: /* action */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setAction", js.Any.fromFunction1(value))
      
      inline def setSetActionUndefined: Self = StObject.set(x, "setAction", js.undefined)
      
      inline def setSetApplication(value: /* application */ js.UndefOr[IApplication] => Unit): Self = StObject.set(x, "setApplication", js.Any.fromFunction1(value))
      
      inline def setSetApplicationUndefined: Self = StObject.set(x, "setApplication", js.undefined)
      
      inline def setSetArgs(value: /* args */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction1(value))
      
      inline def setSetArgsUndefined: Self = StObject.set(x, "setArgs", js.undefined)
      
      inline def setSetBeforeFilters(value: /* beforeFilters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setBeforeFilters", js.Any.fromFunction1(value))
      
      inline def setSetBeforeFiltersUndefined: Self = StObject.set(x, "setBeforeFilters", js.undefined)
      
      inline def setSetController(value: /* controller */ js.UndefOr[IController] => Unit): Self = StObject.set(x, "setController", js.Any.fromFunction1(value))
      
      inline def setSetControllerUndefined: Self = StObject.set(x, "setController", js.undefined)
      
      inline def setSetData(value: /* data */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      inline def setSetScope(value: /* scope */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setScope", js.Any.fromFunction1(value))
      
      inline def setSetScopeUndefined: Self = StObject.set(x, "setScope", js.undefined)
      
      inline def setSetTitle(value: /* title */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      inline def setSetUrl(value: /* url */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
      
      inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
      
      inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait IApplication
    extends StObject
       with IController {
    
    /** [Config Option] (String) */
    var appFolder: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Array) */
    var controllers: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Ext.app.Profile) */
    var currentProfile: js.UndefOr[IProfile] = js.undefined
    
    /** [Method] Dispatches a given Ext app Action to the relevant Controller instance
      * @param action Ext.app.Action The action to dispatch.
      * @param addToHistory Boolean Sets the browser's url to the action's url.
      */
    var dispatch: js.UndefOr[
        js.Function2[/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Returns the value of appFolder
      * @returns String
      */
    var getAppFolder: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the Controller instance for the given controller name
      * @param name String The name of the Controller.
      * @param profileName String Optional profile name. If passed, this is the same as calling getController('profileName.controllerName').
      * @returns Ext.app.Controller controller instance or undefined.
      */
    @JSName("getController")
    var getController_IApplication: js.UndefOr[
        js.Function2[
          /* name */ js.UndefOr[java.lang.String], 
          /* profileName */ js.UndefOr[java.lang.String], 
          IController
        ]
      ] = js.undefined
    
    /** [Method] Returns the value of controllers
      * @returns Array
      */
    var getControllers: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of currentProfile
      * @returns Ext.app.Profile
      */
    var getCurrentProfile: js.UndefOr[js.Function0[IProfile]] = js.undefined
    
    /** [Method] Returns the value of history
      * @returns Ext.app.History
      */
    var getHistory: js.UndefOr[js.Function0[IHistory]] = js.undefined
    
    /** [Method] Returns the value of launch
      * @returns Function
      */
    var getLaunch: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of name
      * @returns String
      */
    var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of profiles
      * @returns Array
      */
    var getProfiles: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of requires
      * @returns String[]
      */
    var getRequires: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of router
      * @returns Ext.app.Router
      */
    var getRouter: js.UndefOr[js.Function0[typings.senchaTouch.Ext.app.IRouter]] = js.undefined
    
    /** [Method] Returns the value of themeVariation
      * @returns String/Function
      */
    var getThemeVariation: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of themeVariationPrefix
      * @returns String
      */
    var getThemeVariationPrefix: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of themeVariationTransitionCls
      * @returns String
      */
    var getThemeVariationTransitionCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var glossOnIcon: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Ext.app.History) */
    var history: js.UndefOr[IHistory] = js.undefined
    
    /** [Config Option] (String/Object) */
    var icon: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var isIconPrecomposed: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var phoneIcon: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var phoneStartupScreen: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Array) */
    var profiles: js.UndefOr[Array] = js.undefined
    
    /** [Method] Redirects the browser to the given url
      * @param url String/Ext.data.Model The String url to redirect to.
      */
    @JSName("redirectTo")
    var redirectTo_IApplication: js.UndefOr[js.Function1[/* url */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String[]) */
    var requires: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Ext.app.Router) */
    var router: js.UndefOr[typings.senchaTouch.Ext.app.IRouter] = js.undefined
    
    /** [Method] Sets the value of appFolder
      * @param appFolder String The new value.
      */
    var setAppFolder: js.UndefOr[js.Function1[/* appFolder */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of controllers
      * @param controllers Array The new value.
      */
    var setControllers: js.UndefOr[js.Function1[/* controllers */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of currentProfile
      * @param currentProfile Ext.app.Profile The new value.
      */
    var setCurrentProfile: js.UndefOr[js.Function1[/* currentProfile */ js.UndefOr[IProfile], Unit]] = js.undefined
    
    /** [Method] Sets the value of history
      * @param history Ext.app.History The new value.
      */
    var setHistory: js.UndefOr[js.Function1[/* history */ js.UndefOr[IHistory], Unit]] = js.undefined
    
    /** [Method] Sets the value of launch
      * @param launch Function The new value.
      */
    var setLaunch: js.UndefOr[js.Function1[/* launch */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of name
      * @param name String The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of profiles
      * @param profiles Array The new value.
      */
    var setProfiles: js.UndefOr[js.Function1[/* profiles */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of requires
      * @param requires String[] The new value.
      */
    var setRequires: js.UndefOr[js.Function1[/* requires */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of router
      * @param router Ext.app.Router The new value.
      */
    var setRouter: js.UndefOr[js.Function1[/* router */ js.UndefOr[typings.senchaTouch.Ext.app.IRouter], Unit]] = js.undefined
    
    /** [Method] Sets the value of themeVariation
      * @param themeVariation String/Function The new value.
      */
    var setThemeVariation: js.UndefOr[js.Function1[/* themeVariation */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of themeVariationPrefix
      * @param themeVariationPrefix String The new value.
      */
    var setThemeVariationPrefix: js.UndefOr[js.Function1[/* themeVariationPrefix */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of themeVariationTransitionCls
      * @param themeVariationTransitionCls String The new value.
      */
    var setThemeVariationTransitionCls: js.UndefOr[
        js.Function1[/* themeVariationTransitionCls */ js.UndefOr[java.lang.String], Unit]
      ] = js.undefined
    
    /** [Config Option] (Object) */
    var startupImage: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var statusBarStyle: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var tabletIcon: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var tabletStartupScreen: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String/Function) */
    var themeVariation: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var themeVariationPrefix: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var themeVariationTransitionCls: js.UndefOr[java.lang.String] = js.undefined
  }
  object IApplication {
    
    inline def apply(): IApplication = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IApplication] (val x: Self) extends AnyVal {
      
      inline def setAppFolder(value: java.lang.String): Self = StObject.set(x, "appFolder", value.asInstanceOf[js.Any])
      
      inline def setAppFolderUndefined: Self = StObject.set(x, "appFolder", js.undefined)
      
      inline def setControllers(value: Array): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      inline def setCurrentProfile(value: IProfile): Self = StObject.set(x, "currentProfile", value.asInstanceOf[js.Any])
      
      inline def setCurrentProfileUndefined: Self = StObject.set(x, "currentProfile", js.undefined)
      
      inline def setDispatch(value: (/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction2(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setGetAppFolder(value: () => java.lang.String): Self = StObject.set(x, "getAppFolder", js.Any.fromFunction0(value))
      
      inline def setGetAppFolderUndefined: Self = StObject.set(x, "getAppFolder", js.undefined)
      
      inline def setGetController(
        value: (/* name */ js.UndefOr[java.lang.String], /* profileName */ js.UndefOr[java.lang.String]) => IController
      ): Self = StObject.set(x, "getController", js.Any.fromFunction2(value))
      
      inline def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      inline def setGetControllers(value: () => Array): Self = StObject.set(x, "getControllers", js.Any.fromFunction0(value))
      
      inline def setGetControllersUndefined: Self = StObject.set(x, "getControllers", js.undefined)
      
      inline def setGetCurrentProfile(value: () => IProfile): Self = StObject.set(x, "getCurrentProfile", js.Any.fromFunction0(value))
      
      inline def setGetCurrentProfileUndefined: Self = StObject.set(x, "getCurrentProfile", js.undefined)
      
      inline def setGetHistory(value: () => IHistory): Self = StObject.set(x, "getHistory", js.Any.fromFunction0(value))
      
      inline def setGetHistoryUndefined: Self = StObject.set(x, "getHistory", js.undefined)
      
      inline def setGetLaunch(value: () => Any): Self = StObject.set(x, "getLaunch", js.Any.fromFunction0(value))
      
      inline def setGetLaunchUndefined: Self = StObject.set(x, "getLaunch", js.undefined)
      
      inline def setGetName(value: () => java.lang.String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetProfiles(value: () => Array): Self = StObject.set(x, "getProfiles", js.Any.fromFunction0(value))
      
      inline def setGetProfilesUndefined: Self = StObject.set(x, "getProfiles", js.undefined)
      
      inline def setGetRequires(value: () => Array): Self = StObject.set(x, "getRequires", js.Any.fromFunction0(value))
      
      inline def setGetRequiresUndefined: Self = StObject.set(x, "getRequires", js.undefined)
      
      inline def setGetRouter(value: () => typings.senchaTouch.Ext.app.IRouter): Self = StObject.set(x, "getRouter", js.Any.fromFunction0(value))
      
      inline def setGetRouterUndefined: Self = StObject.set(x, "getRouter", js.undefined)
      
      inline def setGetThemeVariation(value: () => Any): Self = StObject.set(x, "getThemeVariation", js.Any.fromFunction0(value))
      
      inline def setGetThemeVariationPrefix(value: () => java.lang.String): Self = StObject.set(x, "getThemeVariationPrefix", js.Any.fromFunction0(value))
      
      inline def setGetThemeVariationPrefixUndefined: Self = StObject.set(x, "getThemeVariationPrefix", js.undefined)
      
      inline def setGetThemeVariationTransitionCls(value: () => java.lang.String): Self = StObject.set(x, "getThemeVariationTransitionCls", js.Any.fromFunction0(value))
      
      inline def setGetThemeVariationTransitionClsUndefined: Self = StObject.set(x, "getThemeVariationTransitionCls", js.undefined)
      
      inline def setGetThemeVariationUndefined: Self = StObject.set(x, "getThemeVariation", js.undefined)
      
      inline def setGlossOnIcon(value: Boolean): Self = StObject.set(x, "glossOnIcon", value.asInstanceOf[js.Any])
      
      inline def setGlossOnIconUndefined: Self = StObject.set(x, "glossOnIcon", js.undefined)
      
      inline def setHistory(value: IHistory): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsIconPrecomposed(value: Boolean): Self = StObject.set(x, "isIconPrecomposed", value.asInstanceOf[js.Any])
      
      inline def setIsIconPrecomposedUndefined: Self = StObject.set(x, "isIconPrecomposed", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhoneIcon(value: java.lang.String): Self = StObject.set(x, "phoneIcon", value.asInstanceOf[js.Any])
      
      inline def setPhoneIconUndefined: Self = StObject.set(x, "phoneIcon", js.undefined)
      
      inline def setPhoneStartupScreen(value: java.lang.String): Self = StObject.set(x, "phoneStartupScreen", value.asInstanceOf[js.Any])
      
      inline def setPhoneStartupScreenUndefined: Self = StObject.set(x, "phoneStartupScreen", js.undefined)
      
      inline def setProfiles(value: Array): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
      
      inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
      
      inline def setRedirectTo(value: /* url */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "redirectTo", js.Any.fromFunction1(value))
      
      inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
      
      inline def setRequires(value: Array): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      inline def setRouter(value: typings.senchaTouch.Ext.app.IRouter): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
      
      inline def setSetAppFolder(value: /* appFolder */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setAppFolder", js.Any.fromFunction1(value))
      
      inline def setSetAppFolderUndefined: Self = StObject.set(x, "setAppFolder", js.undefined)
      
      inline def setSetControllers(value: /* controllers */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setControllers", js.Any.fromFunction1(value))
      
      inline def setSetControllersUndefined: Self = StObject.set(x, "setControllers", js.undefined)
      
      inline def setSetCurrentProfile(value: /* currentProfile */ js.UndefOr[IProfile] => Unit): Self = StObject.set(x, "setCurrentProfile", js.Any.fromFunction1(value))
      
      inline def setSetCurrentProfileUndefined: Self = StObject.set(x, "setCurrentProfile", js.undefined)
      
      inline def setSetHistory(value: /* history */ js.UndefOr[IHistory] => Unit): Self = StObject.set(x, "setHistory", js.Any.fromFunction1(value))
      
      inline def setSetHistoryUndefined: Self = StObject.set(x, "setHistory", js.undefined)
      
      inline def setSetLaunch(value: /* launch */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLaunch", js.Any.fromFunction1(value))
      
      inline def setSetLaunchUndefined: Self = StObject.set(x, "setLaunch", js.undefined)
      
      inline def setSetName(value: /* name */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      inline def setSetProfiles(value: /* profiles */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setProfiles", js.Any.fromFunction1(value))
      
      inline def setSetProfilesUndefined: Self = StObject.set(x, "setProfiles", js.undefined)
      
      inline def setSetRequires(value: /* requires */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setRequires", js.Any.fromFunction1(value))
      
      inline def setSetRequiresUndefined: Self = StObject.set(x, "setRequires", js.undefined)
      
      inline def setSetRouter(value: /* router */ js.UndefOr[typings.senchaTouch.Ext.app.IRouter] => Unit): Self = StObject.set(x, "setRouter", js.Any.fromFunction1(value))
      
      inline def setSetRouterUndefined: Self = StObject.set(x, "setRouter", js.undefined)
      
      inline def setSetThemeVariation(value: /* themeVariation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setThemeVariation", js.Any.fromFunction1(value))
      
      inline def setSetThemeVariationPrefix(value: /* themeVariationPrefix */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setThemeVariationPrefix", js.Any.fromFunction1(value))
      
      inline def setSetThemeVariationPrefixUndefined: Self = StObject.set(x, "setThemeVariationPrefix", js.undefined)
      
      inline def setSetThemeVariationTransitionCls(value: /* themeVariationTransitionCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setThemeVariationTransitionCls", js.Any.fromFunction1(value))
      
      inline def setSetThemeVariationTransitionClsUndefined: Self = StObject.set(x, "setThemeVariationTransitionCls", js.undefined)
      
      inline def setSetThemeVariationUndefined: Self = StObject.set(x, "setThemeVariation", js.undefined)
      
      inline def setStartupImage(value: Any): Self = StObject.set(x, "startupImage", value.asInstanceOf[js.Any])
      
      inline def setStartupImageUndefined: Self = StObject.set(x, "startupImage", js.undefined)
      
      inline def setStatusBarStyle(value: java.lang.String): Self = StObject.set(x, "statusBarStyle", value.asInstanceOf[js.Any])
      
      inline def setStatusBarStyleUndefined: Self = StObject.set(x, "statusBarStyle", js.undefined)
      
      inline def setTabletIcon(value: java.lang.String): Self = StObject.set(x, "tabletIcon", value.asInstanceOf[js.Any])
      
      inline def setTabletIconUndefined: Self = StObject.set(x, "tabletIcon", js.undefined)
      
      inline def setTabletStartupScreen(value: java.lang.String): Self = StObject.set(x, "tabletStartupScreen", value.asInstanceOf[js.Any])
      
      inline def setTabletStartupScreenUndefined: Self = StObject.set(x, "tabletStartupScreen", js.undefined)
      
      inline def setThemeVariation(value: Any): Self = StObject.set(x, "themeVariation", value.asInstanceOf[js.Any])
      
      inline def setThemeVariationPrefix(value: java.lang.String): Self = StObject.set(x, "themeVariationPrefix", value.asInstanceOf[js.Any])
      
      inline def setThemeVariationPrefixUndefined: Self = StObject.set(x, "themeVariationPrefix", js.undefined)
      
      inline def setThemeVariationTransitionCls(value: java.lang.String): Self = StObject.set(x, "themeVariationTransitionCls", value.asInstanceOf[js.Any])
      
      inline def setThemeVariationTransitionClsUndefined: Self = StObject.set(x, "themeVariationTransitionCls", js.undefined)
      
      inline def setThemeVariationUndefined: Self = StObject.set(x, "themeVariation", js.undefined)
    }
  }
  
  trait IController
    extends StObject
       with IObservable {
    
    /** [Config Option] (Ext.app.Application) */
    var application: js.UndefOr[IApplication] = js.undefined
    
    /** [Config Option] (Object) */
    var before: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var control: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of application
      * @returns Ext.app.Application
      */
    var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
    
    /** [Method] Returns the value of before
      * @returns Object
      */
    var getBefore: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of control
      * @returns Object
      */
    var getControl: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns a reference to another Controller
      * @param controllerName String
      * @param profile String
      * @returns Object
      */
    var getController: js.UndefOr[
        js.Function2[
          /* controllerName */ js.UndefOr[java.lang.String], 
          /* profile */ js.UndefOr[java.lang.String], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Returns a reference to a Model
      * @param modelName String
      * @returns Object
      */
    var getModel: js.UndefOr[js.Function1[/* modelName */ js.UndefOr[java.lang.String], Any]] = js.undefined
    
    /** [Method] Returns the value of models
      * @returns String[]
      */
    var getModels: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of refs
      * @returns Object
      */
    var getRefs: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of routes
      * @returns Object
      */
    var getRoutes: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of stores
      * @returns String[]
      */
    var getStores: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of views
      * @returns Array
      */
    var getViews: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Config Option] (Function) */
    var init: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Function) */
    var launch: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String[]) */
    var models: js.UndefOr[Array] = js.undefined
    
    /** [Method] Convenient way to redirect to a new url
      * @param place Object
      * @returns Object
      */
    var redirectTo: js.UndefOr[js.Function1[/* place */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Config Option] (Object) */
    var refs: js.UndefOr[Any] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IController: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
    
    /** [Config Option] (Object) */
    var routes: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets the value of application
      * @param application Ext.app.Application The new value.
      */
    var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
    
    /** [Method] Sets the value of before
      * @param before Object The new value.
      */
    var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of control
      * @param control Object The new value.
      */
    var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of models
      * @param models String[] The new value.
      */
    var setModels: js.UndefOr[js.Function1[/* models */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of refs
      * @param refs Object The new value.
      */
    var setRefs: js.UndefOr[js.Function1[/* refs */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of routes
      * @param routes Object The new value.
      */
    var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of stores
      * @param stores String[] The new value.
      */
    var setStores: js.UndefOr[js.Function1[/* stores */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of views
      * @param views Array The new value.
      */
    var setViews: js.UndefOr[js.Function1[/* views */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Config Option] (String[]) */
    var stores: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Array) */
    var views: js.UndefOr[Array] = js.undefined
  }
  object IController {
    
    inline def apply(): IController = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IController] (val x: Self) extends AnyVal {
      
      inline def setApplication(value: IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setBefore(value: Any): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setControl(value: Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setGetApplication(value: () => IApplication): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
      
      inline def setGetApplicationUndefined: Self = StObject.set(x, "getApplication", js.undefined)
      
      inline def setGetBefore(value: () => Any): Self = StObject.set(x, "getBefore", js.Any.fromFunction0(value))
      
      inline def setGetBeforeUndefined: Self = StObject.set(x, "getBefore", js.undefined)
      
      inline def setGetControl(value: () => Any): Self = StObject.set(x, "getControl", js.Any.fromFunction0(value))
      
      inline def setGetControlUndefined: Self = StObject.set(x, "getControl", js.undefined)
      
      inline def setGetController(
        value: (/* controllerName */ js.UndefOr[java.lang.String], /* profile */ js.UndefOr[java.lang.String]) => Any
      ): Self = StObject.set(x, "getController", js.Any.fromFunction2(value))
      
      inline def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      inline def setGetModel(value: /* modelName */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "getModel", js.Any.fromFunction1(value))
      
      inline def setGetModelUndefined: Self = StObject.set(x, "getModel", js.undefined)
      
      inline def setGetModels(value: () => Array): Self = StObject.set(x, "getModels", js.Any.fromFunction0(value))
      
      inline def setGetModelsUndefined: Self = StObject.set(x, "getModels", js.undefined)
      
      inline def setGetRefs(value: () => Any): Self = StObject.set(x, "getRefs", js.Any.fromFunction0(value))
      
      inline def setGetRefsUndefined: Self = StObject.set(x, "getRefs", js.undefined)
      
      inline def setGetRoutes(value: () => Any): Self = StObject.set(x, "getRoutes", js.Any.fromFunction0(value))
      
      inline def setGetRoutesUndefined: Self = StObject.set(x, "getRoutes", js.undefined)
      
      inline def setGetStores(value: () => Array): Self = StObject.set(x, "getStores", js.Any.fromFunction0(value))
      
      inline def setGetStoresUndefined: Self = StObject.set(x, "getStores", js.undefined)
      
      inline def setGetViews(value: () => Array): Self = StObject.set(x, "getViews", js.Any.fromFunction0(value))
      
      inline def setGetViewsUndefined: Self = StObject.set(x, "getViews", js.undefined)
      
      inline def setInit(value: Any): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setLaunch(value: Any): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
      
      inline def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
      
      inline def setModels(value: Array): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
      
      inline def setRedirectTo(value: /* place */ js.UndefOr[Any] => Any): Self = StObject.set(x, "redirectTo", js.Any.fromFunction1(value))
      
      inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
      
      inline def setRefs(value: Any): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setRoutes(value: Any): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setSetApplication(value: /* application */ js.UndefOr[IApplication] => Unit): Self = StObject.set(x, "setApplication", js.Any.fromFunction1(value))
      
      inline def setSetApplicationUndefined: Self = StObject.set(x, "setApplication", js.undefined)
      
      inline def setSetBefore(value: /* before */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBefore", js.Any.fromFunction1(value))
      
      inline def setSetBeforeUndefined: Self = StObject.set(x, "setBefore", js.undefined)
      
      inline def setSetControl(value: /* control */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setControl", js.Any.fromFunction1(value))
      
      inline def setSetControlUndefined: Self = StObject.set(x, "setControl", js.undefined)
      
      inline def setSetModels(value: /* models */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setModels", js.Any.fromFunction1(value))
      
      inline def setSetModelsUndefined: Self = StObject.set(x, "setModels", js.undefined)
      
      inline def setSetRefs(value: /* refs */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setRefs", js.Any.fromFunction1(value))
      
      inline def setSetRefsUndefined: Self = StObject.set(x, "setRefs", js.undefined)
      
      inline def setSetRoutes(value: /* routes */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setRoutes", js.Any.fromFunction1(value))
      
      inline def setSetRoutesUndefined: Self = StObject.set(x, "setRoutes", js.undefined)
      
      inline def setSetStores(value: /* stores */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setStores", js.Any.fromFunction1(value))
      
      inline def setSetStoresUndefined: Self = StObject.set(x, "setStores", js.undefined)
      
      inline def setSetViews(value: /* views */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setViews", js.Any.fromFunction1(value))
      
      inline def setSetViewsUndefined: Self = StObject.set(x, "setViews", js.undefined)
      
      inline def setStores(value: Array): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      inline def setViews(value: Array): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  trait IHistory
    extends StObject
       with IObservable {
    
    /** [Config Option] (Array) */
    var actions: js.UndefOr[Array] = js.undefined
    
    /** [Method] Adds an Action to the stack optionally updating the browser s url and firing the change event
      * @param action Ext.app.Action The Action to add to the stack.
      * @param silent Boolean Cancels the firing of the change event if true.
      */
    var add: js.UndefOr[
        js.Function2[/* action */ js.UndefOr[IAction], /* silent */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Navigate to the previous active action  */
    var back: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the value of actions
      * @returns Array
      */
    var getActions: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of token
      * @returns String
      */
    var getToken: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of updateUrl
      * @returns Boolean
      */
    var getUpdateUrl: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IHistory: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
    
    /** [Method] Sets the value of actions
      * @param actions Array The new value.
      */
    var setActions: js.UndefOr[js.Function1[/* actions */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of token
      * @param token String The new value.
      */
    var setToken: js.UndefOr[js.Function1[/* token */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of updateUrl
      * @param updateUrl Boolean The new value.
      */
    var setUpdateUrl: js.UndefOr[js.Function1[/* updateUrl */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var token: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var updateUrl: js.UndefOr[Boolean] = js.undefined
  }
  object IHistory {
    
    inline def apply(): IHistory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHistory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHistory] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Array): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setAdd(value: (/* action */ js.UndefOr[IAction], /* silent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
      
      inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
      
      inline def setGetActions(value: () => Array): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setGetActionsUndefined: Self = StObject.set(x, "getActions", js.undefined)
      
      inline def setGetToken(value: () => java.lang.String): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setGetUpdateUrl(value: () => Boolean): Self = StObject.set(x, "getUpdateUrl", js.Any.fromFunction0(value))
      
      inline def setGetUpdateUrlUndefined: Self = StObject.set(x, "getUpdateUrl", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setSetActions(value: /* actions */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setActions", js.Any.fromFunction1(value))
      
      inline def setSetActionsUndefined: Self = StObject.set(x, "setActions", js.undefined)
      
      inline def setSetToken(value: /* token */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setToken", js.Any.fromFunction1(value))
      
      inline def setSetTokenUndefined: Self = StObject.set(x, "setToken", js.undefined)
      
      inline def setSetUpdateUrl(value: /* updateUrl */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUpdateUrl", js.Any.fromFunction1(value))
      
      inline def setSetUpdateUrlUndefined: Self = StObject.set(x, "setUpdateUrl", js.undefined)
      
      inline def setToken(value: java.lang.String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUpdateUrl(value: Boolean): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
      
      inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
    }
  }
  
  trait IProfile
    extends StObject
       with IObservable {
    
    /** [Config Option] (Ext.app.Application) */
    var application: js.UndefOr[IApplication] = js.undefined
    
    /** [Config Option] (Array) */
    var controllers: js.UndefOr[Array] = js.undefined
    
    /** [Method] Returns the value of application
      * @returns Ext.app.Application
      */
    var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
    
    /** [Method] Returns the value of controllers
      * @returns Array
      */
    var getControllers: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of models
      * @returns Array
      */
    var getModels: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of name
      * @returns String
      */
    var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of namespace
      * @returns String
      */
    var getNamespace: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of stores
      * @returns Array
      */
    var getStores: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of views
      * @returns Array
      */
    var getViews: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Determines whether or not this Profile is active on the device isActive is executed on
      * @returns Boolean True if this Profile should be activated on the device it is running on, false otherwise
      */
    var isActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] The launch function is called by the Application if this Profile s isActive function returned true  */
    var launch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Array) */
    var models: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (String) */
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var namespace: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IProfile: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
    
    /** [Method] Sets the value of application
      * @param application Ext.app.Application The new value.
      */
    var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
    
    /** [Method] Sets the value of controllers
      * @param controllers Array The new value.
      */
    var setControllers: js.UndefOr[js.Function1[/* controllers */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of models
      * @param models Array The new value.
      */
    var setModels: js.UndefOr[js.Function1[/* models */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of name
      * @param name String The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of namespace
      * @param namespace String The new value.
      */
    var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of stores
      * @param stores Array The new value.
      */
    var setStores: js.UndefOr[js.Function1[/* stores */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of views
      * @param views Array The new value.
      */
    var setViews: js.UndefOr[js.Function1[/* views */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Config Option] (Array) */
    var stores: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Array) */
    var views: js.UndefOr[Array] = js.undefined
  }
  object IProfile {
    
    inline def apply(): IProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProfile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProfile] (val x: Self) extends AnyVal {
      
      inline def setApplication(value: IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      inline def setControllers(value: Array): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
      
      inline def setGetApplication(value: () => IApplication): Self = StObject.set(x, "getApplication", js.Any.fromFunction0(value))
      
      inline def setGetApplicationUndefined: Self = StObject.set(x, "getApplication", js.undefined)
      
      inline def setGetControllers(value: () => Array): Self = StObject.set(x, "getControllers", js.Any.fromFunction0(value))
      
      inline def setGetControllersUndefined: Self = StObject.set(x, "getControllers", js.undefined)
      
      inline def setGetModels(value: () => Array): Self = StObject.set(x, "getModels", js.Any.fromFunction0(value))
      
      inline def setGetModelsUndefined: Self = StObject.set(x, "getModels", js.undefined)
      
      inline def setGetName(value: () => java.lang.String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetNamespace(value: () => java.lang.String): Self = StObject.set(x, "getNamespace", js.Any.fromFunction0(value))
      
      inline def setGetNamespaceUndefined: Self = StObject.set(x, "getNamespace", js.undefined)
      
      inline def setGetStores(value: () => Array): Self = StObject.set(x, "getStores", js.Any.fromFunction0(value))
      
      inline def setGetStoresUndefined: Self = StObject.set(x, "getStores", js.undefined)
      
      inline def setGetViews(value: () => Array): Self = StObject.set(x, "getViews", js.Any.fromFunction0(value))
      
      inline def setGetViewsUndefined: Self = StObject.set(x, "getViews", js.undefined)
      
      inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setLaunch(value: () => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction0(value))
      
      inline def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
      
      inline def setModels(value: Array): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespace(value: java.lang.String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setSetApplication(value: /* application */ js.UndefOr[IApplication] => Unit): Self = StObject.set(x, "setApplication", js.Any.fromFunction1(value))
      
      inline def setSetApplicationUndefined: Self = StObject.set(x, "setApplication", js.undefined)
      
      inline def setSetControllers(value: /* controllers */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setControllers", js.Any.fromFunction1(value))
      
      inline def setSetControllersUndefined: Self = StObject.set(x, "setControllers", js.undefined)
      
      inline def setSetModels(value: /* models */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setModels", js.Any.fromFunction1(value))
      
      inline def setSetModelsUndefined: Self = StObject.set(x, "setModels", js.undefined)
      
      inline def setSetName(value: /* name */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      inline def setSetNamespace(value: /* namespace */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setNamespace", js.Any.fromFunction1(value))
      
      inline def setSetNamespaceUndefined: Self = StObject.set(x, "setNamespace", js.undefined)
      
      inline def setSetStores(value: /* stores */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setStores", js.Any.fromFunction1(value))
      
      inline def setSetStoresUndefined: Self = StObject.set(x, "setStores", js.undefined)
      
      inline def setSetViews(value: /* views */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setViews", js.Any.fromFunction1(value))
      
      inline def setSetViewsUndefined: Self = StObject.set(x, "setViews", js.undefined)
      
      inline def setStores(value: Array): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      inline def setViews(value: Array): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  trait IRoute
    extends StObject
       with IBase {
    
    /** [Config Option] (String) */
    var action: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Object) */
    var conditions: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var controller: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of action
      * @returns String
      */
    var getAction: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of conditions
      * @returns Object
      */
    var getConditions: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of controller
      * @returns String
      */
    var getController: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of url
      * @returns String
      */
    var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Property] (Object) */
    var paramsInMatchString: js.UndefOr[Any] = js.undefined
    
    /** [Method] Attempts to recognize a given url string and return controller action pair for it
      * @param url String The url to recognize.
      * @returns Object/Boolean The matched data, or false if no match.
      */
    var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Any]] = js.undefined
    
    /** [Method] Sets the value of action
      * @param action String The new value.
      */
    var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of conditions
      * @param conditions Object The new value.
      */
    var setConditions: js.UndefOr[js.Function1[/* conditions */ js.UndefOr[Any], Unit]] = js.undefined
    
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
    
    inline def apply(): IRoute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRoute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRoute] (val x: Self) extends AnyVal {
      
      inline def setAction(value: java.lang.String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setConditions(value: Any): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setController(value: java.lang.String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setGetAction(value: () => java.lang.String): Self = StObject.set(x, "getAction", js.Any.fromFunction0(value))
      
      inline def setGetActionUndefined: Self = StObject.set(x, "getAction", js.undefined)
      
      inline def setGetConditions(value: () => Any): Self = StObject.set(x, "getConditions", js.Any.fromFunction0(value))
      
      inline def setGetConditionsUndefined: Self = StObject.set(x, "getConditions", js.undefined)
      
      inline def setGetController(value: () => java.lang.String): Self = StObject.set(x, "getController", js.Any.fromFunction0(value))
      
      inline def setGetControllerUndefined: Self = StObject.set(x, "getController", js.undefined)
      
      inline def setGetUrl(value: () => java.lang.String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
      
      inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
      
      inline def setParamsInMatchString(value: Any): Self = StObject.set(x, "paramsInMatchString", value.asInstanceOf[js.Any])
      
      inline def setParamsInMatchStringUndefined: Self = StObject.set(x, "paramsInMatchString", js.undefined)
      
      inline def setRecognize(value: /* url */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "recognize", js.Any.fromFunction1(value))
      
      inline def setRecognizeUndefined: Self = StObject.set(x, "recognize", js.undefined)
      
      inline def setSetAction(value: /* action */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setAction", js.Any.fromFunction1(value))
      
      inline def setSetActionUndefined: Self = StObject.set(x, "setAction", js.undefined)
      
      inline def setSetConditions(value: /* conditions */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setConditions", js.Any.fromFunction1(value))
      
      inline def setSetConditionsUndefined: Self = StObject.set(x, "setConditions", js.undefined)
      
      inline def setSetController(value: /* controller */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setController", js.Any.fromFunction1(value))
      
      inline def setSetControllerUndefined: Self = StObject.set(x, "setController", js.undefined)
      
      inline def setSetUrl(value: /* url */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
      
      inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
      
      inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait IRouter
    extends StObject
       with IBase {
    
    /** [Method] Connects a url based route to a controller action pair plus additional params
      * @param url String The url to recognize.
      * @param params Object Additional parameters.
      */
    var connect: js.UndefOr[
        js.Function2[/* url */ js.UndefOr[java.lang.String], /* params */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Object) */
    var defaults: js.UndefOr[Any] = js.undefined
    
    /** [Method] Convenience method which just calls the supplied function with the Router instance
      * @param fn Function The fn to call
      */
    var draw: js.UndefOr[js.Function1[/* fn */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Returns the value of defaults
      * @returns Object
      */
    var getDefaults: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of routes
      * @returns Array
      */
    var getRoutes: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Recognizes a url string connected to the Router return the controller action pair plus any additional config associa
      * @param url String The url to recognize.
      * @returns Object/undefined If the url was recognized, the controller and action to call, else undefined.
      */
    var recognize: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Any]] = js.undefined
    
    /** [Config Option] (Array) */
    var routes: js.UndefOr[Array] = js.undefined
    
    /** [Method] Sets the value of defaults
      * @param defaults Object The new value.
      */
    var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of routes
      * @param routes Array The new value.
      */
    var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[Array], Unit]] = js.undefined
  }
  object IRouter {
    
    inline def apply(): typings.senchaTouch.Ext.app.IRouter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.app.IRouter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.app.IRouter] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: (/* url */ js.UndefOr[java.lang.String], /* params */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setDraw(value: /* fn */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
      
      inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
      
      inline def setGetDefaults(value: () => Any): Self = StObject.set(x, "getDefaults", js.Any.fromFunction0(value))
      
      inline def setGetDefaultsUndefined: Self = StObject.set(x, "getDefaults", js.undefined)
      
      inline def setGetRoutes(value: () => Array): Self = StObject.set(x, "getRoutes", js.Any.fromFunction0(value))
      
      inline def setGetRoutesUndefined: Self = StObject.set(x, "getRoutes", js.undefined)
      
      inline def setRecognize(value: /* url */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "recognize", js.Any.fromFunction1(value))
      
      inline def setRecognizeUndefined: Self = StObject.set(x, "recognize", js.undefined)
      
      inline def setRoutes(value: Array): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setSetDefaults(value: /* defaults */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
      
      inline def setSetDefaultsUndefined: Self = StObject.set(x, "setDefaults", js.undefined)
      
      inline def setSetRoutes(value: /* routes */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setRoutes", js.Any.fromFunction1(value))
      
      inline def setSetRoutesUndefined: Self = StObject.set(x, "setRoutes", js.undefined)
    }
  }
}
