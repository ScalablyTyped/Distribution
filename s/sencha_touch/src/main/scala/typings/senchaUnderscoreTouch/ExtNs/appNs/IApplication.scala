package typings.senchaUnderscoreTouch.ExtNs.appNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends IController {
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
  var getLaunch: js.UndefOr[js.Function0[_]] = js.undefined
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
  var getRouter: js.UndefOr[js.Function0[typings.senchaUnderscoreTouch.ExtNs.appNs.IRouter]] = js.undefined
  /** [Method] Returns the value of themeVariation
  		* @returns String/Function
  		*/
  var getThemeVariation: js.UndefOr[js.Function0[_]] = js.undefined
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
  var icon: js.UndefOr[js.Any] = js.undefined
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
  var redirectTo_IApplication: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Ext.app.Router) */
  var router: js.UndefOr[typings.senchaUnderscoreTouch.ExtNs.appNs.IRouter] = js.undefined
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
  var setLaunch: js.UndefOr[js.Function1[/* launch */ js.UndefOr[js.Any], Unit]] = js.undefined
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
  var setRouter: js.UndefOr[
    js.Function1[/* router */ js.UndefOr[typings.senchaUnderscoreTouch.ExtNs.appNs.IRouter], Unit]
  ] = js.undefined
  /** [Method] Sets the value of themeVariation
  		* @param themeVariation String/Function The new value.
  		*/
  var setThemeVariation: js.UndefOr[js.Function1[/* themeVariation */ js.UndefOr[js.Any], Unit]] = js.undefined
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
  var startupImage: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var statusBarStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var tabletIcon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var tabletStartupScreen: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Function) */
  var themeVariation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var themeVariationPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var themeVariationTransitionCls: js.UndefOr[java.lang.String] = js.undefined
}

object IApplication {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    appFolder: java.lang.String = null,
    application: IApplication = null,
    before: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    control: js.Any = null,
    controllers: Array = null,
    currentProfile: IProfile = null,
    destroy: () => Unit = null,
    dispatch: (/* action */ js.UndefOr[IAction], /* addToHistory */ js.UndefOr[Boolean]) => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getAppFolder: () => java.lang.String = null,
    getApplication: () => IApplication = null,
    getBefore: () => _ = null,
    getBubbleEvents: () => _ = null,
    getControl: () => _ = null,
    getController: (/* name */ js.UndefOr[java.lang.String], /* profileName */ js.UndefOr[java.lang.String]) => IController = null,
    getControllers: () => Array = null,
    getCurrentProfile: () => IProfile = null,
    getHistory: () => IHistory = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLaunch: () => _ = null,
    getListeners: () => _ = null,
    getModel: /* modelName */ js.UndefOr[java.lang.String] => _ = null,
    getModels: () => Array = null,
    getName: () => java.lang.String = null,
    getProfiles: () => Array = null,
    getRefs: () => _ = null,
    getRequires: () => Array = null,
    getRouter: () => typings.senchaUnderscoreTouch.ExtNs.appNs.IRouter = null,
    getRoutes: () => _ = null,
    getStores: () => Array = null,
    getThemeVariation: () => _ = null,
    getThemeVariationPrefix: () => java.lang.String = null,
    getThemeVariationTransitionCls: () => java.lang.String = null,
    getViews: () => Array = null,
    glossOnIcon: js.UndefOr[Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    history: IHistory = null,
    icon: js.Any = null,
    inheritableStatics: js.Any = null,
    init: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isIconPrecomposed: js.UndefOr[Boolean] = js.undefined,
    launch: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    models: Array = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    name: java.lang.String = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    phoneIcon: java.lang.String = null,
    phoneStartupScreen: java.lang.String = null,
    platformConfig: js.Any = null,
    profiles: Array = null,
    redirectTo: /* url */ js.UndefOr[js.Any] => Unit = null,
    refs: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    router: typings.senchaUnderscoreTouch.ExtNs.appNs.IRouter = null,
    routes: js.Any = null,
    self: IClass = null,
    setAppFolder: /* appFolder */ js.UndefOr[java.lang.String] => Unit = null,
    setApplication: /* application */ js.UndefOr[IApplication] => Unit = null,
    setBefore: /* before */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setControl: /* control */ js.UndefOr[js.Any] => Unit = null,
    setControllers: /* controllers */ js.UndefOr[Array] => Unit = null,
    setCurrentProfile: /* currentProfile */ js.UndefOr[IProfile] => Unit = null,
    setHistory: /* history */ js.UndefOr[IHistory] => Unit = null,
    setLaunch: /* launch */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setModels: /* models */ js.UndefOr[Array] => Unit = null,
    setName: /* name */ js.UndefOr[java.lang.String] => Unit = null,
    setProfiles: /* profiles */ js.UndefOr[Array] => Unit = null,
    setRefs: /* refs */ js.UndefOr[js.Any] => Unit = null,
    setRequires: /* requires */ js.UndefOr[Array] => Unit = null,
    setRouter: /* router */ js.UndefOr[typings.senchaUnderscoreTouch.ExtNs.appNs.IRouter] => Unit = null,
    setRoutes: /* routes */ js.UndefOr[js.Any] => Unit = null,
    setStores: /* stores */ js.UndefOr[Array] => Unit = null,
    setThemeVariation: /* themeVariation */ js.UndefOr[js.Any] => Unit = null,
    setThemeVariationPrefix: /* themeVariationPrefix */ js.UndefOr[java.lang.String] => Unit = null,
    setThemeVariationTransitionCls: /* themeVariationTransitionCls */ js.UndefOr[java.lang.String] => Unit = null,
    setViews: /* views */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startupImage: js.Any = null,
    statics: js.Any = null,
    statusBarStyle: java.lang.String = null,
    stores: Array = null,
    suspendEvents: () => Unit = null,
    tabletIcon: java.lang.String = null,
    tabletStartupScreen: java.lang.String = null,
    themeVariation: js.Any = null,
    themeVariationPrefix: java.lang.String = null,
    themeVariationTransitionCls: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    views: Array = null
  ): IApplication = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (appFolder != null) __obj.updateDynamic("appFolder")(appFolder)
    if (application != null) __obj.updateDynamic("application")(application)
    if (before != null) __obj.updateDynamic("before")(before)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (control != null) __obj.updateDynamic("control")(control)
    if (controllers != null) __obj.updateDynamic("controllers")(controllers)
    if (currentProfile != null) __obj.updateDynamic("currentProfile")(currentProfile)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction2(dispatch))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAppFolder != null) __obj.updateDynamic("getAppFolder")(js.Any.fromFunction0(getAppFolder))
    if (getApplication != null) __obj.updateDynamic("getApplication")(js.Any.fromFunction0(getApplication))
    if (getBefore != null) __obj.updateDynamic("getBefore")(js.Any.fromFunction0(getBefore))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getControl != null) __obj.updateDynamic("getControl")(js.Any.fromFunction0(getControl))
    if (getController != null) __obj.updateDynamic("getController")(js.Any.fromFunction2(getController))
    if (getControllers != null) __obj.updateDynamic("getControllers")(js.Any.fromFunction0(getControllers))
    if (getCurrentProfile != null) __obj.updateDynamic("getCurrentProfile")(js.Any.fromFunction0(getCurrentProfile))
    if (getHistory != null) __obj.updateDynamic("getHistory")(js.Any.fromFunction0(getHistory))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLaunch != null) __obj.updateDynamic("getLaunch")(js.Any.fromFunction0(getLaunch))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction1(getModel))
    if (getModels != null) __obj.updateDynamic("getModels")(js.Any.fromFunction0(getModels))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getProfiles != null) __obj.updateDynamic("getProfiles")(js.Any.fromFunction0(getProfiles))
    if (getRefs != null) __obj.updateDynamic("getRefs")(js.Any.fromFunction0(getRefs))
    if (getRequires != null) __obj.updateDynamic("getRequires")(js.Any.fromFunction0(getRequires))
    if (getRouter != null) __obj.updateDynamic("getRouter")(js.Any.fromFunction0(getRouter))
    if (getRoutes != null) __obj.updateDynamic("getRoutes")(js.Any.fromFunction0(getRoutes))
    if (getStores != null) __obj.updateDynamic("getStores")(js.Any.fromFunction0(getStores))
    if (getThemeVariation != null) __obj.updateDynamic("getThemeVariation")(js.Any.fromFunction0(getThemeVariation))
    if (getThemeVariationPrefix != null) __obj.updateDynamic("getThemeVariationPrefix")(js.Any.fromFunction0(getThemeVariationPrefix))
    if (getThemeVariationTransitionCls != null) __obj.updateDynamic("getThemeVariationTransitionCls")(js.Any.fromFunction0(getThemeVariationTransitionCls))
    if (getViews != null) __obj.updateDynamic("getViews")(js.Any.fromFunction0(getViews))
    if (!js.isUndefined(glossOnIcon)) __obj.updateDynamic("glossOnIcon")(glossOnIcon)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (history != null) __obj.updateDynamic("history")(history)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(init)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isIconPrecomposed)) __obj.updateDynamic("isIconPrecomposed")(isIconPrecomposed)
    if (launch != null) __obj.updateDynamic("launch")(launch)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (models != null) __obj.updateDynamic("models")(models)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (name != null) __obj.updateDynamic("name")(name)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (phoneIcon != null) __obj.updateDynamic("phoneIcon")(phoneIcon)
    if (phoneStartupScreen != null) __obj.updateDynamic("phoneStartupScreen")(phoneStartupScreen)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (profiles != null) __obj.updateDynamic("profiles")(profiles)
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(js.Any.fromFunction1(redirectTo))
    if (refs != null) __obj.updateDynamic("refs")(refs)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (router != null) __obj.updateDynamic("router")(router)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAppFolder != null) __obj.updateDynamic("setAppFolder")(js.Any.fromFunction1(setAppFolder))
    if (setApplication != null) __obj.updateDynamic("setApplication")(js.Any.fromFunction1(setApplication))
    if (setBefore != null) __obj.updateDynamic("setBefore")(js.Any.fromFunction1(setBefore))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setControl != null) __obj.updateDynamic("setControl")(js.Any.fromFunction1(setControl))
    if (setControllers != null) __obj.updateDynamic("setControllers")(js.Any.fromFunction1(setControllers))
    if (setCurrentProfile != null) __obj.updateDynamic("setCurrentProfile")(js.Any.fromFunction1(setCurrentProfile))
    if (setHistory != null) __obj.updateDynamic("setHistory")(js.Any.fromFunction1(setHistory))
    if (setLaunch != null) __obj.updateDynamic("setLaunch")(js.Any.fromFunction1(setLaunch))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setModels != null) __obj.updateDynamic("setModels")(js.Any.fromFunction1(setModels))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setProfiles != null) __obj.updateDynamic("setProfiles")(js.Any.fromFunction1(setProfiles))
    if (setRefs != null) __obj.updateDynamic("setRefs")(js.Any.fromFunction1(setRefs))
    if (setRequires != null) __obj.updateDynamic("setRequires")(js.Any.fromFunction1(setRequires))
    if (setRouter != null) __obj.updateDynamic("setRouter")(js.Any.fromFunction1(setRouter))
    if (setRoutes != null) __obj.updateDynamic("setRoutes")(js.Any.fromFunction1(setRoutes))
    if (setStores != null) __obj.updateDynamic("setStores")(js.Any.fromFunction1(setStores))
    if (setThemeVariation != null) __obj.updateDynamic("setThemeVariation")(js.Any.fromFunction1(setThemeVariation))
    if (setThemeVariationPrefix != null) __obj.updateDynamic("setThemeVariationPrefix")(js.Any.fromFunction1(setThemeVariationPrefix))
    if (setThemeVariationTransitionCls != null) __obj.updateDynamic("setThemeVariationTransitionCls")(js.Any.fromFunction1(setThemeVariationTransitionCls))
    if (setViews != null) __obj.updateDynamic("setViews")(js.Any.fromFunction1(setViews))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startupImage != null) __obj.updateDynamic("startupImage")(startupImage)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (statusBarStyle != null) __obj.updateDynamic("statusBarStyle")(statusBarStyle)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (tabletIcon != null) __obj.updateDynamic("tabletIcon")(tabletIcon)
    if (tabletStartupScreen != null) __obj.updateDynamic("tabletStartupScreen")(tabletStartupScreen)
    if (themeVariation != null) __obj.updateDynamic("themeVariation")(themeVariation)
    if (themeVariationPrefix != null) __obj.updateDynamic("themeVariationPrefix")(themeVariationPrefix)
    if (themeVariationTransitionCls != null) __obj.updateDynamic("themeVariationTransitionCls")(themeVariationTransitionCls)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[IApplication]
  }
}

