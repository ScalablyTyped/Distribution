package typings.senchaUnderscoreTouch.Ext.data

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonReader
  extends typings.senchaUnderscoreTouch.Ext.data.reader.IReader {
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useSimpleAccessors
  		* @returns Boolean
  		*/
  var getUseSimpleAccessors: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleAccessors
  		* @param useSimpleAccessors Boolean The new value.
  		*/
  var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.undefined
}

object IJsonReader {
  @scala.inline
  def apply(
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
    clientIdProperty: java.lang.String = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getBubbleEvents: () => _ = null,
    getClientIdProperty: () => java.lang.String = null,
    getId: () => _ = null,
    getIdProperty: () => java.lang.String = null,
    getImplicitIncludes: () => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getListeners: () => _ = null,
    getMessageProperty: () => java.lang.String = null,
    getModel: () => _ = null,
    getRecord: () => java.lang.String = null,
    getResponseData: /* response */ js.UndefOr[js.Any] => _ = null,
    getRootProperty: () => java.lang.String = null,
    getSuccessProperty: () => _ = null,
    getTotalProperty: () => _ = null,
    getUseSimpleAccessors: () => Boolean = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    idProperty: java.lang.String = null,
    implicitIncludes: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    listeners: js.Any = null,
    messageProperty: java.lang.String = null,
    metaData: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    rawData: js.Any = null,
    read: /* response */ js.UndefOr[js.Any] => IResultSet = null,
    readRecords: /* data */ js.UndefOr[js.Any] => IResultSet = null,
    record: java.lang.String = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    root: java.lang.String = null,
    rootProperty: java.lang.String = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setClientIdProperty: /* clientIdProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setIdProperty: /* idProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setImplicitIncludes: /* implicitIncludes */ js.UndefOr[Boolean] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMessageProperty: /* messageProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setModel: /* model */ js.UndefOr[js.Any] => Unit = null,
    setRecord: /* record */ js.UndefOr[java.lang.String] => Unit = null,
    setRootProperty: /* rootProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setSuccessProperty: /* successProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setTotalProperty: /* totalProperty */ js.UndefOr[java.lang.String] => Unit = null,
    setUseSimpleAccessors: /* useSimpleAccessors */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    successProperty: java.lang.String = null,
    suspendEvents: () => Unit = null,
    totalProperty: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    useSimpleAccessors: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IJsonReader = {
    val __obj = js.Dynamic.literal()
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
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getClientIdProperty != null) __obj.updateDynamic("getClientIdProperty")(js.Any.fromFunction0(getClientIdProperty))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getIdProperty != null) __obj.updateDynamic("getIdProperty")(js.Any.fromFunction0(getIdProperty))
    if (getImplicitIncludes != null) __obj.updateDynamic("getImplicitIncludes")(js.Any.fromFunction0(getImplicitIncludes))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMessageProperty != null) __obj.updateDynamic("getMessageProperty")(js.Any.fromFunction0(getMessageProperty))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getResponseData != null) __obj.updateDynamic("getResponseData")(js.Any.fromFunction1(getResponseData))
    if (getRootProperty != null) __obj.updateDynamic("getRootProperty")(js.Any.fromFunction0(getRootProperty))
    if (getSuccessProperty != null) __obj.updateDynamic("getSuccessProperty")(js.Any.fromFunction0(getSuccessProperty))
    if (getTotalProperty != null) __obj.updateDynamic("getTotalProperty")(js.Any.fromFunction0(getTotalProperty))
    if (getUseSimpleAccessors != null) __obj.updateDynamic("getUseSimpleAccessors")(js.Any.fromFunction0(getUseSimpleAccessors))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (!js.isUndefined(implicitIncludes)) __obj.updateDynamic("implicitIncludes")(implicitIncludes)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (messageProperty != null) __obj.updateDynamic("messageProperty")(messageProperty)
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (rawData != null) __obj.updateDynamic("rawData")(rawData)
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1(read))
    if (readRecords != null) __obj.updateDynamic("readRecords")(js.Any.fromFunction1(readRecords))
    if (record != null) __obj.updateDynamic("record")(record)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (root != null) __obj.updateDynamic("root")(root)
    if (rootProperty != null) __obj.updateDynamic("rootProperty")(rootProperty)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setClientIdProperty != null) __obj.updateDynamic("setClientIdProperty")(js.Any.fromFunction1(setClientIdProperty))
    if (setIdProperty != null) __obj.updateDynamic("setIdProperty")(js.Any.fromFunction1(setIdProperty))
    if (setImplicitIncludes != null) __obj.updateDynamic("setImplicitIncludes")(js.Any.fromFunction1(setImplicitIncludes))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMessageProperty != null) __obj.updateDynamic("setMessageProperty")(js.Any.fromFunction1(setMessageProperty))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1(setModel))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setRootProperty != null) __obj.updateDynamic("setRootProperty")(js.Any.fromFunction1(setRootProperty))
    if (setSuccessProperty != null) __obj.updateDynamic("setSuccessProperty")(js.Any.fromFunction1(setSuccessProperty))
    if (setTotalProperty != null) __obj.updateDynamic("setTotalProperty")(js.Any.fromFunction1(setTotalProperty))
    if (setUseSimpleAccessors != null) __obj.updateDynamic("setUseSimpleAccessors")(js.Any.fromFunction1(setUseSimpleAccessors))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (successProperty != null) __obj.updateDynamic("successProperty")(successProperty)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (totalProperty != null) __obj.updateDynamic("totalProperty")(totalProperty)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (!js.isUndefined(useSimpleAccessors)) __obj.updateDynamic("useSimpleAccessors")(useSimpleAccessors)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IJsonReader]
  }
}

