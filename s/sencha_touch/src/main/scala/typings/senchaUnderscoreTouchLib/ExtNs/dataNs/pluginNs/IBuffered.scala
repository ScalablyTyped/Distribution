package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuffered
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Method] Returns the value of bufferedCollection
  		* @returns Object
  		*/
  var getBufferedCollection: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of leadingBufferZone
  		* @returns Number
  		*/
  var getLeadingBufferZone: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Determines the page from a record index
  		* @param index Number The record index
  		* @returns Number The page the record belongs to
  		*/
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Returns the value of purgePageCount
  		* @returns Number
  		*/
  var getPurgePageCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of trailingBufferZone
  		* @returns Number
  		*/
  var getTrailingBufferZone: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of viewSize
  		* @returns Number
  		*/
  var getViewSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Prefetches data into the store using its configured proxy
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Prefetches a page of data
  		* @param page Number The page to prefetch
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of bufferedCollection
  		* @param bufferedCollection Object The new value.
  		*/
  var setBufferedCollection: js.UndefOr[js.Function1[/* bufferedCollection */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of leadingBufferZone
  		* @param leadingBufferZone Number The new value.
  		*/
  var setLeadingBufferZone: js.UndefOr[js.Function1[/* leadingBufferZone */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of purgePageCount
  		* @param purgePageCount Number The new value.
  		*/
  var setPurgePageCount: js.UndefOr[js.Function1[/* purgePageCount */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of trailingBufferZone
  		* @param trailingBufferZone Number The new value.
  		*/
  var setTrailingBufferZone: js.UndefOr[js.Function1[/* trailingBufferZone */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of viewSize
  		* @param viewSize Number The new value.
  		*/
  var setViewSize: js.UndefOr[js.Function1[/* viewSize */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[scala.Double] = js.undefined
}

object IBuffered {
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
    getBufferedCollection: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLeadingBufferZone: js.Function0[scala.Double] = null,
    getListeners: js.Function0[_] = null,
    getPageFromRecordIndex: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Double] = null,
    getPurgePageCount: js.Function0[scala.Double] = null,
    getStore: js.Function0[_] = null,
    getTrailingBufferZone: js.Function0[scala.Double] = null,
    getViewSize: js.Function0[scala.Double] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    leadingBufferZone: scala.Int | scala.Double = null,
    listeners: js.Any = null,
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
    prefetch: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    prefetchPage: js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    purgePageCount: scala.Int | scala.Double = null,
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
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setBufferedCollection: js.Function1[/* bufferedCollection */ js.UndefOr[js.Any], scala.Unit] = null,
    setLeadingBufferZone: js.Function1[/* leadingBufferZone */ js.UndefOr[scala.Double], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setPurgePageCount: js.Function1[/* purgePageCount */ js.UndefOr[scala.Double], scala.Unit] = null,
    setStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    setTrailingBufferZone: js.Function1[/* trailingBufferZone */ js.UndefOr[scala.Double], scala.Unit] = null,
    setViewSize: js.Function1[/* viewSize */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    trailingBufferZone: scala.Int | scala.Double = null,
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
  ): IBuffered = {
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
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getBufferedCollection != null) __obj.updateDynamic("getBufferedCollection")(getBufferedCollection)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLeadingBufferZone != null) __obj.updateDynamic("getLeadingBufferZone")(getLeadingBufferZone)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getPageFromRecordIndex != null) __obj.updateDynamic("getPageFromRecordIndex")(getPageFromRecordIndex)
    if (getPurgePageCount != null) __obj.updateDynamic("getPurgePageCount")(getPurgePageCount)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getTrailingBufferZone != null) __obj.updateDynamic("getTrailingBufferZone")(getTrailingBufferZone)
    if (getViewSize != null) __obj.updateDynamic("getViewSize")(getViewSize)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch)
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(prefetchPage)
    if (purgePageCount != null) __obj.updateDynamic("purgePageCount")(purgePageCount.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setBufferedCollection != null) __obj.updateDynamic("setBufferedCollection")(setBufferedCollection)
    if (setLeadingBufferZone != null) __obj.updateDynamic("setLeadingBufferZone")(setLeadingBufferZone)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setPurgePageCount != null) __obj.updateDynamic("setPurgePageCount")(setPurgePageCount)
    if (setStore != null) __obj.updateDynamic("setStore")(setStore)
    if (setTrailingBufferZone != null) __obj.updateDynamic("setTrailingBufferZone")(setTrailingBufferZone)
    if (setViewSize != null) __obj.updateDynamic("setViewSize")(setViewSize)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBuffered]
  }
}

