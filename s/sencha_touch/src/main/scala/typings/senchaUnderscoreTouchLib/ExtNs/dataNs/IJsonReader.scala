package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonReader
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.readerNs.IReader {
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of useSimpleAccessors
  		* @returns Boolean
  		*/
  var getUseSimpleAccessors: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleAccessors
  		* @param useSimpleAccessors Boolean The new value.
  		*/
  var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[scala.Boolean] = js.undefined
}

object IJsonReader {
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
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clientIdProperty: java.lang.String = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
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
    getBubbleEvents: js.Function0[_] = null,
    getClientIdProperty: js.Function0[java.lang.String] = null,
    getId: js.Function0[_] = null,
    getIdProperty: js.Function0[java.lang.String] = null,
    getImplicitIncludes: js.Function0[scala.Boolean] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getListeners: js.Function0[_] = null,
    getMessageProperty: js.Function0[java.lang.String] = null,
    getModel: js.Function0[_] = null,
    getRecord: js.Function0[java.lang.String] = null,
    getResponseData: js.Function1[/* response */ js.UndefOr[js.Any], _] = null,
    getRootProperty: js.Function0[java.lang.String] = null,
    getSuccessProperty: js.Function0[_] = null,
    getTotalProperty: js.Function0[_] = null,
    getUseSimpleAccessors: js.Function0[scala.Boolean] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    idProperty: java.lang.String = null,
    implicitIncludes: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    listeners: js.Any = null,
    messageProperty: java.lang.String = null,
    metaData: js.Any = null,
    mixins: js.Any = null,
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
    platformConfig: js.Any = null,
    rawData: js.Any = null,
    read: js.Function1[/* response */ js.UndefOr[js.Any], IResultSet] = null,
    readRecords: js.Function1[/* data */ js.UndefOr[js.Any], IResultSet] = null,
    record: java.lang.String = null,
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
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    root: java.lang.String = null,
    rootProperty: java.lang.String = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setClientIdProperty: js.Function1[/* clientIdProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setIdProperty: js.Function1[/* idProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setImplicitIncludes: js.Function1[/* implicitIncludes */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setMessageProperty: js.Function1[/* messageProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setModel: js.Function1[/* model */ js.UndefOr[js.Any], scala.Unit] = null,
    setRecord: js.Function1[/* record */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRootProperty: js.Function1[/* rootProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSuccessProperty: js.Function1[/* successProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTotalProperty: js.Function1[/* totalProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUseSimpleAccessors: js.Function1[/* useSimpleAccessors */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    successProperty: java.lang.String = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    totalProperty: java.lang.String = null,
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
    useSimpleAccessors: js.UndefOr[scala.Boolean] = js.undefined,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IJsonReader = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clientIdProperty != null) __obj.updateDynamic("clientIdProperty")(clientIdProperty)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getClientIdProperty != null) __obj.updateDynamic("getClientIdProperty")(getClientIdProperty)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getIdProperty != null) __obj.updateDynamic("getIdProperty")(getIdProperty)
    if (getImplicitIncludes != null) __obj.updateDynamic("getImplicitIncludes")(getImplicitIncludes)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getMessageProperty != null) __obj.updateDynamic("getMessageProperty")(getMessageProperty)
    if (getModel != null) __obj.updateDynamic("getModel")(getModel)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (getResponseData != null) __obj.updateDynamic("getResponseData")(getResponseData)
    if (getRootProperty != null) __obj.updateDynamic("getRootProperty")(getRootProperty)
    if (getSuccessProperty != null) __obj.updateDynamic("getSuccessProperty")(getSuccessProperty)
    if (getTotalProperty != null) __obj.updateDynamic("getTotalProperty")(getTotalProperty)
    if (getUseSimpleAccessors != null) __obj.updateDynamic("getUseSimpleAccessors")(getUseSimpleAccessors)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (!js.isUndefined(implicitIncludes)) __obj.updateDynamic("implicitIncludes")(implicitIncludes)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (messageProperty != null) __obj.updateDynamic("messageProperty")(messageProperty)
    if (metaData != null) __obj.updateDynamic("metaData")(metaData)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (rawData != null) __obj.updateDynamic("rawData")(rawData)
    if (read != null) __obj.updateDynamic("read")(read)
    if (readRecords != null) __obj.updateDynamic("readRecords")(readRecords)
    if (record != null) __obj.updateDynamic("record")(record)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (root != null) __obj.updateDynamic("root")(root)
    if (rootProperty != null) __obj.updateDynamic("rootProperty")(rootProperty)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setClientIdProperty != null) __obj.updateDynamic("setClientIdProperty")(setClientIdProperty)
    if (setIdProperty != null) __obj.updateDynamic("setIdProperty")(setIdProperty)
    if (setImplicitIncludes != null) __obj.updateDynamic("setImplicitIncludes")(setImplicitIncludes)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setMessageProperty != null) __obj.updateDynamic("setMessageProperty")(setMessageProperty)
    if (setModel != null) __obj.updateDynamic("setModel")(setModel)
    if (setRecord != null) __obj.updateDynamic("setRecord")(setRecord)
    if (setRootProperty != null) __obj.updateDynamic("setRootProperty")(setRootProperty)
    if (setSuccessProperty != null) __obj.updateDynamic("setSuccessProperty")(setSuccessProperty)
    if (setTotalProperty != null) __obj.updateDynamic("setTotalProperty")(setTotalProperty)
    if (setUseSimpleAccessors != null) __obj.updateDynamic("setUseSimpleAccessors")(setUseSimpleAccessors)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (successProperty != null) __obj.updateDynamic("successProperty")(successProperty)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (totalProperty != null) __obj.updateDynamic("totalProperty")(totalProperty)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (!js.isUndefined(useSimpleAccessors)) __obj.updateDynamic("useSimpleAccessors")(useSimpleAccessors)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IJsonReader]
  }
}

