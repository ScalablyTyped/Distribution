package typings.senchaUnderscoreTouch.Ext.app

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IController extends IObservable {
  /** [Config Option] (Ext.app.Application) */
  var application: js.UndefOr[IApplication] = js.undefined
  /** [Config Option] (Object) */
  var before: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of application
  		* @returns Ext.app.Application
  		*/
  var getApplication: js.UndefOr[js.Function0[IApplication]] = js.undefined
  /** [Method] Returns the value of before
  		* @returns Object
  		*/
  var getBefore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of control
  		* @returns Object
  		*/
  var getControl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns a reference to another Controller
  		* @param controllerName String
  		* @param profile String
  		* @returns Object
  		*/
  var getController: js.UndefOr[
    js.Function2[/* controllerName */ js.UndefOr[String], /* profile */ js.UndefOr[String], _]
  ] = js.undefined
  /** [Method] Returns a reference to a Model
  		* @param modelName String
  		* @returns Object
  		*/
  var getModel: js.UndefOr[js.Function1[/* modelName */ js.UndefOr[String], _]] = js.undefined
  /** [Method] Returns the value of models
  		* @returns String[]
  		*/
  var getModels: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of refs
  		* @returns Object
  		*/
  var getRefs: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of routes
  		* @returns Object
  		*/
  var getRoutes: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of stores
  		* @returns String[]
  		*/
  var getStores: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of views
  		* @returns Array
  		*/
  var getViews: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (Function) */
  var init: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var launch: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var models: js.UndefOr[Array] = js.undefined
  /** [Method] Convenient way to redirect to a new url
  		* @param place Object
  		* @returns Object
  		*/
  var redirectTo: js.UndefOr[js.Function1[/* place */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Object) */
  var refs: js.UndefOr[js.Any] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IController: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Config Option] (Object) */
  var routes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of application
  		* @param application Ext.app.Application The new value.
  		*/
  var setApplication: js.UndefOr[js.Function1[/* application */ js.UndefOr[IApplication], Unit]] = js.undefined
  /** [Method] Sets the value of before
  		* @param before Object The new value.
  		*/
  var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of models
  		* @param models String[] The new value.
  		*/
  var setModels: js.UndefOr[js.Function1[/* models */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of refs
  		* @param refs Object The new value.
  		*/
  var setRefs: js.UndefOr[js.Function1[/* refs */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of routes
  		* @param routes Object The new value.
  		*/
  var setRoutes: js.UndefOr[js.Function1[/* routes */ js.UndefOr[js.Any], Unit]] = js.undefined
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
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    application: IApplication = null,
    before: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    control: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    getApplication: () => IApplication = null,
    getBefore: () => _ = null,
    getBubbleEvents: () => _ = null,
    getControl: () => _ = null,
    getController: (/* controllerName */ js.UndefOr[String], /* profile */ js.UndefOr[String]) => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getListeners: () => _ = null,
    getModel: /* modelName */ js.UndefOr[String] => _ = null,
    getModels: () => Array = null,
    getRefs: () => _ = null,
    getRoutes: () => _ = null,
    getStores: () => Array = null,
    getViews: () => Array = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    inheritableStatics: js.Any = null,
    init: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    launch: js.Any = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    models: Array = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    redirectTo: /* place */ js.UndefOr[js.Any] => _ = null,
    refs: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    routes: js.Any = null,
    self: IClass = null,
    setApplication: /* application */ js.UndefOr[IApplication] => Unit = null,
    setBefore: /* before */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setControl: /* control */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setModels: /* models */ js.UndefOr[Array] => Unit = null,
    setRefs: /* refs */ js.UndefOr[js.Any] => Unit = null,
    setRoutes: /* routes */ js.UndefOr[js.Any] => Unit = null,
    setStores: /* stores */ js.UndefOr[Array] => Unit = null,
    setViews: /* views */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stores: Array = null,
    suspendEvents: () => Unit = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    views: Array = null
  ): IController = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getApplication != null) __obj.updateDynamic("getApplication")(js.Any.fromFunction0(getApplication))
    if (getBefore != null) __obj.updateDynamic("getBefore")(js.Any.fromFunction0(getBefore))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getControl != null) __obj.updateDynamic("getControl")(js.Any.fromFunction0(getControl))
    if (getController != null) __obj.updateDynamic("getController")(js.Any.fromFunction2(getController))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction1(getModel))
    if (getModels != null) __obj.updateDynamic("getModels")(js.Any.fromFunction0(getModels))
    if (getRefs != null) __obj.updateDynamic("getRefs")(js.Any.fromFunction0(getRefs))
    if (getRoutes != null) __obj.updateDynamic("getRoutes")(js.Any.fromFunction0(getRoutes))
    if (getStores != null) __obj.updateDynamic("getStores")(js.Any.fromFunction0(getStores))
    if (getViews != null) __obj.updateDynamic("getViews")(js.Any.fromFunction0(getViews))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (launch != null) __obj.updateDynamic("launch")(launch.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(js.Any.fromFunction1(redirectTo))
    if (refs != null) __obj.updateDynamic("refs")(refs.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setApplication != null) __obj.updateDynamic("setApplication")(js.Any.fromFunction1(setApplication))
    if (setBefore != null) __obj.updateDynamic("setBefore")(js.Any.fromFunction1(setBefore))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setControl != null) __obj.updateDynamic("setControl")(js.Any.fromFunction1(setControl))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setModels != null) __obj.updateDynamic("setModels")(js.Any.fromFunction1(setModels))
    if (setRefs != null) __obj.updateDynamic("setRefs")(js.Any.fromFunction1(setRefs))
    if (setRoutes != null) __obj.updateDynamic("setRoutes")(js.Any.fromFunction1(setRoutes))
    if (setStores != null) __obj.updateDynamic("setStores")(js.Any.fromFunction1(setStores))
    if (setViews != null) __obj.updateDynamic("setViews")(js.Any.fromFunction1(setViews))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[IController]
  }
}

