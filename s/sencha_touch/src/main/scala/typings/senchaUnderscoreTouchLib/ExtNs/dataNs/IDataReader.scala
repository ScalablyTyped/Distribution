package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataReader
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of clientIdProperty
  		* @returns String
  		*/
  var getClientIdProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of idProperty
  		* @returns String
  		*/
  var getIdProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of implicitIncludes
  		* @returns Boolean
  		*/
  var getImplicitIncludes: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of messageProperty
  		* @returns String
  		*/
  var getMessageProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of model
  		* @returns Object
  		*/
  var getModel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Takes a raw response object as passed to this read and returns the useful data segment of it
  		* @param response Object The response object
  		* @returns Object The useful data from the response
  		*/
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of rootProperty
  		* @returns String
  		*/
  var getRootProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of successProperty
  		* @returns any
  		*/
  var getSuccessProperty: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of totalProperty
  		* @returns any
  		*/
  var getTotalProperty: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reads the given response object
  		* @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
  		* @returns Ext.data.ResultSet The parsed ResultSet object
  		*/
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.undefined
  /** [Method] Abstracts common functionality used by all Reader subclasses
  		* @param data Object The raw data object
  		* @returns Ext.data.ResultSet A ResultSet object
  		*/
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IDataReader: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of clientIdProperty
  		* @param clientIdProperty String The new value.
  		*/
  var setClientIdProperty: js.UndefOr[js.Function1[/* clientIdProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of idProperty
  		* @param idProperty String The new value.
  		*/
  var setIdProperty: js.UndefOr[js.Function1[/* idProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of implicitIncludes
  		* @param implicitIncludes Boolean The new value.
  		*/
  var setImplicitIncludes: js.UndefOr[js.Function1[/* implicitIncludes */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of messageProperty
  		* @param messageProperty String The new value.
  		*/
  var setMessageProperty: js.UndefOr[js.Function1[/* messageProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of model
  		* @param model Object The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of rootProperty
  		* @param rootProperty String The new value.
  		*/
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of successProperty
  		* @param successProperty String The new value.
  		*/
  var setSuccessProperty: js.UndefOr[js.Function1[/* successProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of totalProperty
  		* @param totalProperty String The new value.
  		*/
  var setTotalProperty: js.UndefOr[js.Function1[/* totalProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[java.lang.String] = js.undefined
}

object IDataReader {
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
    getResponseData: js.Function1[/* response */ js.UndefOr[js.Any], _] = null,
    getRootProperty: js.Function0[java.lang.String] = null,
    getSuccessProperty: js.Function0[_] = null,
    getTotalProperty: js.Function0[_] = null,
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
    setRootProperty: js.Function1[/* rootProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSuccessProperty: js.Function1[/* successProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setTotalProperty: js.Function1[/* totalProperty */ js.UndefOr[java.lang.String], scala.Unit] = null,
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
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IDataReader = {
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
    if (getResponseData != null) __obj.updateDynamic("getResponseData")(getResponseData)
    if (getRootProperty != null) __obj.updateDynamic("getRootProperty")(getRootProperty)
    if (getSuccessProperty != null) __obj.updateDynamic("getSuccessProperty")(getSuccessProperty)
    if (getTotalProperty != null) __obj.updateDynamic("getTotalProperty")(getTotalProperty)
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
    if (setRootProperty != null) __obj.updateDynamic("setRootProperty")(setRootProperty)
    if (setSuccessProperty != null) __obj.updateDynamic("setSuccessProperty")(setSuccessProperty)
    if (setTotalProperty != null) __obj.updateDynamic("setTotalProperty")(setTotalProperty)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (successProperty != null) __obj.updateDynamic("successProperty")(successProperty)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (totalProperty != null) __obj.updateDynamic("totalProperty")(totalProperty)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDataReader]
  }
}

