package typings
package senchaUnderscoreTouchLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends IController {
  /** [Config Option] (String) */
  var appFolder: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Array) */
  var controllers: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.app.Profile) */
  var currentProfile: js.UndefOr[IProfile] = js.undefined
  /** [Method] Dispatches a given Ext app Action to the relevant Controller instance
  		* @param action Ext.app.Action The action to dispatch.
  		* @param addToHistory Boolean Sets the browser's url to the action's url.
  		*/
  var dispatch: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[IAction], 
      /* addToHistory */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
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
  var getControllers: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
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
  var getProfiles: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of requires
  		* @returns String[]
  		*/
  var getRequires: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of router
  		* @returns Ext.app.Router
  		*/
  var getRouter: js.UndefOr[js.Function0[IRouter]] = js.undefined
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
  var glossOnIcon: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.app.History) */
  var history: js.UndefOr[IHistory] = js.undefined
  /** [Config Option] (String/Object) */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var isIconPrecomposed: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var phoneIcon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var phoneStartupScreen: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Array) */
  var profiles: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Redirects the browser to the given url
  		* @param url String/Ext.data.Model The String url to redirect to.
  		*/
  @JSName("redirectTo")
  var redirectTo_IApplication: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.app.Router) */
  var router: js.UndefOr[IRouter] = js.undefined
  /** [Method] Sets the value of appFolder
  		* @param appFolder String The new value.
  		*/
  var setAppFolder: js.UndefOr[js.Function1[/* appFolder */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of controllers
  		* @param controllers Array The new value.
  		*/
  var setControllers: js.UndefOr[
    js.Function1[/* controllers */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of currentProfile
  		* @param currentProfile Ext.app.Profile The new value.
  		*/
  var setCurrentProfile: js.UndefOr[js.Function1[/* currentProfile */ js.UndefOr[IProfile], scala.Unit]] = js.undefined
  /** [Method] Sets the value of history
  		* @param history Ext.app.History The new value.
  		*/
  var setHistory: js.UndefOr[js.Function1[/* history */ js.UndefOr[IHistory], scala.Unit]] = js.undefined
  /** [Method] Sets the value of launch
  		* @param launch Function The new value.
  		*/
  var setLaunch: js.UndefOr[js.Function1[/* launch */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of profiles
  		* @param profiles Array The new value.
  		*/
  var setProfiles: js.UndefOr[
    js.Function1[/* profiles */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of requires
  		* @param requires String[] The new value.
  		*/
  var setRequires: js.UndefOr[
    js.Function1[/* requires */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of router
  		* @param router Ext.app.Router The new value.
  		*/
  var setRouter: js.UndefOr[js.Function1[/* router */ js.UndefOr[IRouter], scala.Unit]] = js.undefined
  /** [Method] Sets the value of themeVariation
  		* @param themeVariation String/Function The new value.
  		*/
  var setThemeVariation: js.UndefOr[js.Function1[/* themeVariation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of themeVariationPrefix
  		* @param themeVariationPrefix String The new value.
  		*/
  var setThemeVariationPrefix: js.UndefOr[
    js.Function1[/* themeVariationPrefix */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of themeVariationTransitionCls
  		* @param themeVariationTransitionCls String The new value.
  		*/
  var setThemeVariationTransitionCls: js.UndefOr[
    js.Function1[/* themeVariationTransitionCls */ js.UndefOr[java.lang.String], scala.Unit]
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
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    appFolder: java.lang.String = null,
    application: IApplication = null,
    before: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    control: js.Any = null,
    controllers: senchaUnderscoreTouchLib.ExtNs.Array = null,
    currentProfile: IProfile = null,
    destroy: js.Function0[scala.Unit] = null,
    dispatch: js.Function2[
      /* action */ js.UndefOr[IAction], 
      /* addToHistory */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    getAppFolder: js.Function0[java.lang.String] = null,
    getApplication: js.Function0[IApplication] = null,
    getBefore: js.Function0[_] = null,
    getBubbleEvents: js.Function0[_] = null,
    getControl: js.Function0[_] = null,
    getController: js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* profileName */ js.UndefOr[java.lang.String], 
      IController
    ] = null,
    getControllers: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getCurrentProfile: js.Function0[IProfile] = null,
    getHistory: js.Function0[IHistory] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLaunch: js.Function0[_] = null,
    getListeners: js.Function0[_] = null,
    getModel: js.Function1[/* modelName */ js.UndefOr[java.lang.String], _] = null,
    getModels: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getName: js.Function0[java.lang.String] = null,
    getProfiles: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getRefs: js.Function0[_] = null,
    getRequires: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getRouter: js.Function0[IRouter] = null,
    getRoutes: js.Function0[_] = null,
    getStores: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getThemeVariation: js.Function0[_] = null,
    getThemeVariationPrefix: js.Function0[java.lang.String] = null,
    getThemeVariationTransitionCls: js.Function0[java.lang.String] = null,
    getViews: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    glossOnIcon: js.UndefOr[scala.Boolean] = js.undefined,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    history: IHistory = null,
    icon: js.Any = null,
    inheritableStatics: js.Any = null,
    init: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    isIconPrecomposed: js.UndefOr[scala.Boolean] = js.undefined,
    launch: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    models: senchaUnderscoreTouchLib.ExtNs.Array = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    name: java.lang.String = null,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    phoneIcon: java.lang.String = null,
    phoneStartupScreen: java.lang.String = null,
    platformConfig: js.Any = null,
    profiles: senchaUnderscoreTouchLib.ExtNs.Array = null,
    redirectTo: js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit] = null,
    refs: js.Any = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: senchaUnderscoreTouchLib.ExtNs.Array = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    router: IRouter = null,
    routes: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAppFolder: js.Function1[/* appFolder */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setApplication: js.Function1[/* application */ js.UndefOr[IApplication], scala.Unit] = null,
    setBefore: js.Function1[/* before */ js.UndefOr[js.Any], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setControl: js.Function1[/* control */ js.UndefOr[js.Any], scala.Unit] = null,
    setControllers: js.Function1[/* controllers */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setCurrentProfile: js.Function1[/* currentProfile */ js.UndefOr[IProfile], scala.Unit] = null,
    setHistory: js.Function1[/* history */ js.UndefOr[IHistory], scala.Unit] = null,
    setLaunch: js.Function1[/* launch */ js.UndefOr[js.Any], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setModels: js.Function1[/* models */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setProfiles: js.Function1[/* profiles */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setRefs: js.Function1[/* refs */ js.UndefOr[js.Any], scala.Unit] = null,
    setRequires: js.Function1[/* requires */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setRouter: js.Function1[/* router */ js.UndefOr[IRouter], scala.Unit] = null,
    setRoutes: js.Function1[/* routes */ js.UndefOr[js.Any], scala.Unit] = null,
    setStores: js.Function1[/* stores */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setThemeVariation: js.Function1[/* themeVariation */ js.UndefOr[js.Any], scala.Unit] = null,
    setThemeVariationPrefix: js.Function1[/* themeVariationPrefix */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setThemeVariationTransitionCls: js.Function1[/* themeVariationTransitionCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setViews: js.Function1[/* views */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    startupImage: js.Any = null,
    statics: js.Any = null,
    statusBarStyle: java.lang.String = null,
    stores: senchaUnderscoreTouchLib.ExtNs.Array = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    tabletIcon: java.lang.String = null,
    tabletStartupScreen: java.lang.String = null,
    themeVariation: js.Any = null,
    themeVariationPrefix: java.lang.String = null,
    themeVariationTransitionCls: java.lang.String = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    views: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IApplication = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (appFolder != null) __obj.updateDynamic("appFolder")(appFolder)
    if (application != null) __obj.updateDynamic("application")(application)
    if (before != null) __obj.updateDynamic("before")(before)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (control != null) __obj.updateDynamic("control")(control)
    if (controllers != null) __obj.updateDynamic("controllers")(controllers)
    if (currentProfile != null) __obj.updateDynamic("currentProfile")(currentProfile)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (dispatch != null) __obj.updateDynamic("dispatch")(dispatch)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getAppFolder != null) __obj.updateDynamic("getAppFolder")(getAppFolder)
    if (getApplication != null) __obj.updateDynamic("getApplication")(getApplication)
    if (getBefore != null) __obj.updateDynamic("getBefore")(getBefore)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getControl != null) __obj.updateDynamic("getControl")(getControl)
    if (getController != null) __obj.updateDynamic("getController")(getController)
    if (getControllers != null) __obj.updateDynamic("getControllers")(getControllers)
    if (getCurrentProfile != null) __obj.updateDynamic("getCurrentProfile")(getCurrentProfile)
    if (getHistory != null) __obj.updateDynamic("getHistory")(getHistory)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLaunch != null) __obj.updateDynamic("getLaunch")(getLaunch)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getModel != null) __obj.updateDynamic("getModel")(getModel)
    if (getModels != null) __obj.updateDynamic("getModels")(getModels)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getProfiles != null) __obj.updateDynamic("getProfiles")(getProfiles)
    if (getRefs != null) __obj.updateDynamic("getRefs")(getRefs)
    if (getRequires != null) __obj.updateDynamic("getRequires")(getRequires)
    if (getRouter != null) __obj.updateDynamic("getRouter")(getRouter)
    if (getRoutes != null) __obj.updateDynamic("getRoutes")(getRoutes)
    if (getStores != null) __obj.updateDynamic("getStores")(getStores)
    if (getThemeVariation != null) __obj.updateDynamic("getThemeVariation")(getThemeVariation)
    if (getThemeVariationPrefix != null) __obj.updateDynamic("getThemeVariationPrefix")(getThemeVariationPrefix)
    if (getThemeVariationTransitionCls != null) __obj.updateDynamic("getThemeVariationTransitionCls")(getThemeVariationTransitionCls)
    if (getViews != null) __obj.updateDynamic("getViews")(getViews)
    if (!js.isUndefined(glossOnIcon)) __obj.updateDynamic("glossOnIcon")(glossOnIcon)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (history != null) __obj.updateDynamic("history")(history)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(init)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isIconPrecomposed)) __obj.updateDynamic("isIconPrecomposed")(isIconPrecomposed)
    if (launch != null) __obj.updateDynamic("launch")(launch)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (models != null) __obj.updateDynamic("models")(models)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (name != null) __obj.updateDynamic("name")(name)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (phoneIcon != null) __obj.updateDynamic("phoneIcon")(phoneIcon)
    if (phoneStartupScreen != null) __obj.updateDynamic("phoneStartupScreen")(phoneStartupScreen)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (profiles != null) __obj.updateDynamic("profiles")(profiles)
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo)
    if (refs != null) __obj.updateDynamic("refs")(refs)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (router != null) __obj.updateDynamic("router")(router)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAppFolder != null) __obj.updateDynamic("setAppFolder")(setAppFolder)
    if (setApplication != null) __obj.updateDynamic("setApplication")(setApplication)
    if (setBefore != null) __obj.updateDynamic("setBefore")(setBefore)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setControl != null) __obj.updateDynamic("setControl")(setControl)
    if (setControllers != null) __obj.updateDynamic("setControllers")(setControllers)
    if (setCurrentProfile != null) __obj.updateDynamic("setCurrentProfile")(setCurrentProfile)
    if (setHistory != null) __obj.updateDynamic("setHistory")(setHistory)
    if (setLaunch != null) __obj.updateDynamic("setLaunch")(setLaunch)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setModels != null) __obj.updateDynamic("setModels")(setModels)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setProfiles != null) __obj.updateDynamic("setProfiles")(setProfiles)
    if (setRefs != null) __obj.updateDynamic("setRefs")(setRefs)
    if (setRequires != null) __obj.updateDynamic("setRequires")(setRequires)
    if (setRouter != null) __obj.updateDynamic("setRouter")(setRouter)
    if (setRoutes != null) __obj.updateDynamic("setRoutes")(setRoutes)
    if (setStores != null) __obj.updateDynamic("setStores")(setStores)
    if (setThemeVariation != null) __obj.updateDynamic("setThemeVariation")(setThemeVariation)
    if (setThemeVariationPrefix != null) __obj.updateDynamic("setThemeVariationPrefix")(setThemeVariationPrefix)
    if (setThemeVariationTransitionCls != null) __obj.updateDynamic("setThemeVariationTransitionCls")(setThemeVariationTransitionCls)
    if (setViews != null) __obj.updateDynamic("setViews")(setViews)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startupImage != null) __obj.updateDynamic("startupImage")(startupImage)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (statusBarStyle != null) __obj.updateDynamic("statusBarStyle")(statusBarStyle)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (tabletIcon != null) __obj.updateDynamic("tabletIcon")(tabletIcon)
    if (tabletStartupScreen != null) __obj.updateDynamic("tabletStartupScreen")(tabletStartupScreen)
    if (themeVariation != null) __obj.updateDynamic("themeVariation")(themeVariation)
    if (themeVariationPrefix != null) __obj.updateDynamic("themeVariationPrefix")(themeVariationPrefix)
    if (themeVariationTransitionCls != null) __obj.updateDynamic("themeVariationTransitionCls")(themeVariationTransitionCls)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[IApplication]
  }
}

