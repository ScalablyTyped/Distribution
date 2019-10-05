package typings.senchaUnderscoreTouch.Ext.direct

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemotingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var actions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/Boolean) */
  var enableBuffer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var enableUrlEncode: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of actions
  		* @returns Object
  		*/
  var getActions: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of enableBuffer
  		* @returns Number/Boolean
  		*/
  var getEnableBuffer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of enableUrlEncode
  		* @returns String
  		*/
  var getEnableUrlEncode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of maxRetries
  		* @returns Number
  		*/
  var getMaxRetries: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of namespace
  		* @returns String/Object
  		*/
  var getNamespace: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Number) */
  var maxRetries: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String/Object) */
  var namespace: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of actions
  		* @param actions Object The new value.
  		*/
  var setActions: js.UndefOr[js.Function1[/* actions */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of enableBuffer
  		* @param enableBuffer Number/Boolean The new value.
  		*/
  var setEnableBuffer: js.UndefOr[js.Function1[/* enableBuffer */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of enableUrlEncode
  		* @param enableUrlEncode String The new value.
  		*/
  var setEnableUrlEncode: js.UndefOr[js.Function1[/* enableUrlEncode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of maxRetries
  		* @param maxRetries Number The new value.
  		*/
  var setMaxRetries: js.UndefOr[js.Function1[/* maxRetries */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of namespace
  		* @param namespace String/Object The new value.
  		*/
  var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IRemotingProvider {
  @scala.inline
  def apply(
    actions: js.Any = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    connect: () => Unit = null,
    createEvent: /* response */ js.UndefOr[js.Any] => IEvent = null,
    destroy: () => Unit = null,
    disconnect: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    enableBuffer: js.Any = null,
    enableUrlEncode: java.lang.String = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getActions: () => _ = null,
    getBubbleEvents: () => _ = null,
    getEnableBuffer: () => _ = null,
    getEnableUrlEncode: () => java.lang.String = null,
    getId: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getListeners: () => _ = null,
    getMaxRetries: () => Double = null,
    getNamespace: () => _ = null,
    getTimeout: () => Double = null,
    getUrl: () => java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isConnected: () => Boolean = null,
    isProvider: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    maxRetries: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    namespace: js.Any = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setActions: /* actions */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setEnableBuffer: /* enableBuffer */ js.UndefOr[js.Any] => Unit = null,
    setEnableUrlEncode: /* enableUrlEncode */ js.UndefOr[java.lang.String] => Unit = null,
    setId: /* id */ js.UndefOr[java.lang.String] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMaxRetries: /* maxRetries */ js.UndefOr[Double] => Unit = null,
    setNamespace: /* namespace */ js.UndefOr[js.Any] => Unit = null,
    setTimeout: /* timeout */ js.UndefOr[Double] => Unit = null,
    setUrl: /* url */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    timeout: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    url: java.lang.String = null,
    uses: Array = null
  ): IRemotingProvider = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction0(connect))
    if (createEvent != null) __obj.updateDynamic("createEvent")(js.Any.fromFunction1(createEvent))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disconnect != null) __obj.updateDynamic("disconnect")(js.Any.fromFunction0(disconnect))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (enableBuffer != null) __obj.updateDynamic("enableBuffer")(enableBuffer)
    if (enableUrlEncode != null) __obj.updateDynamic("enableUrlEncode")(enableUrlEncode)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getActions != null) __obj.updateDynamic("getActions")(js.Any.fromFunction0(getActions))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getEnableBuffer != null) __obj.updateDynamic("getEnableBuffer")(js.Any.fromFunction0(getEnableBuffer))
    if (getEnableUrlEncode != null) __obj.updateDynamic("getEnableUrlEncode")(js.Any.fromFunction0(getEnableUrlEncode))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMaxRetries != null) __obj.updateDynamic("getMaxRetries")(js.Any.fromFunction0(getMaxRetries))
    if (getNamespace != null) __obj.updateDynamic("getNamespace")(js.Any.fromFunction0(getNamespace))
    if (getTimeout != null) __obj.updateDynamic("getTimeout")(js.Any.fromFunction0(getTimeout))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isConnected != null) __obj.updateDynamic("isConnected")(js.Any.fromFunction0(isConnected))
    if (!js.isUndefined(isProvider)) __obj.updateDynamic("isProvider")(isProvider)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setActions != null) __obj.updateDynamic("setActions")(js.Any.fromFunction1(setActions))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setEnableBuffer != null) __obj.updateDynamic("setEnableBuffer")(js.Any.fromFunction1(setEnableBuffer))
    if (setEnableUrlEncode != null) __obj.updateDynamic("setEnableUrlEncode")(js.Any.fromFunction1(setEnableUrlEncode))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1(setId))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMaxRetries != null) __obj.updateDynamic("setMaxRetries")(js.Any.fromFunction1(setMaxRetries))
    if (setNamespace != null) __obj.updateDynamic("setNamespace")(js.Any.fromFunction1(setNamespace))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction1(setTimeout))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRemotingProvider]
  }
}

