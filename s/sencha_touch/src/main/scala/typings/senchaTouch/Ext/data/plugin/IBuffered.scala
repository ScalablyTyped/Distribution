package typings.senchaTouch.Ext.data.plugin

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.IEvented
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuffered extends IEvented {
  /** [Method] Returns the value of bufferedCollection
    * @returns Object
    */
  var getBufferedCollection: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of leadingBufferZone
    * @returns Number
    */
  var getLeadingBufferZone: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Determines the page from a record index
    * @param index Number The record index
    * @returns Number The page the record belongs to
    */
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Returns the value of purgePageCount
    * @returns Number
    */
  var getPurgePageCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of store
    * @returns Object
    */
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of trailingBufferZone
    * @returns Number
    */
  var getTrailingBufferZone: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of viewSize
    * @returns Number
    */
  var getViewSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.undefined
  /** [Method] Prefetches data into the store using its configured proxy
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Prefetches a page of data
    * @param page Number The page to prefetch
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the value of bufferedCollection
    * @param bufferedCollection Object The new value.
    */
  var setBufferedCollection: js.UndefOr[js.Function1[/* bufferedCollection */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of leadingBufferZone
    * @param leadingBufferZone Number The new value.
    */
  var setLeadingBufferZone: js.UndefOr[js.Function1[/* leadingBufferZone */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of purgePageCount
    * @param purgePageCount Number The new value.
    */
  var setPurgePageCount: js.UndefOr[js.Function1[/* purgePageCount */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of store
    * @param store Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of trailingBufferZone
    * @param trailingBufferZone Number The new value.
    */
  var setTrailingBufferZone: js.UndefOr[js.Function1[/* trailingBufferZone */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of viewSize
    * @param viewSize Number The new value.
    */
  var setViewSize: js.UndefOr[js.Function1[/* viewSize */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.undefined
}

object IBuffered {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    getBubbleEvents: () => _ = null,
    getBufferedCollection: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLeadingBufferZone: () => Double = null,
    getListeners: () => _ = null,
    getPageFromRecordIndex: /* index */ js.UndefOr[Double] => Double = null,
    getPurgePageCount: () => Double = null,
    getStore: () => _ = null,
    getTrailingBufferZone: () => Double = null,
    getViewSize: () => Double = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    leadingBufferZone: js.UndefOr[Double] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    prefetch: /* options */ js.UndefOr[js.Any] => Unit = null,
    prefetchPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit = null,
    purgePageCount: js.UndefOr[Double] = js.undefined,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setBufferedCollection: /* bufferedCollection */ js.UndefOr[js.Any] => Unit = null,
    setLeadingBufferZone: /* leadingBufferZone */ js.UndefOr[Double] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setPurgePageCount: /* purgePageCount */ js.UndefOr[Double] => Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => Unit = null,
    setTrailingBufferZone: /* trailingBufferZone */ js.UndefOr[Double] => Unit = null,
    setViewSize: /* viewSize */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    trailingBufferZone: js.UndefOr[Double] = js.undefined,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IBuffered = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getBufferedCollection != null) __obj.updateDynamic("getBufferedCollection")(js.Any.fromFunction0(getBufferedCollection))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLeadingBufferZone != null) __obj.updateDynamic("getLeadingBufferZone")(js.Any.fromFunction0(getLeadingBufferZone))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getPageFromRecordIndex != null) __obj.updateDynamic("getPageFromRecordIndex")(js.Any.fromFunction1(getPageFromRecordIndex))
    if (getPurgePageCount != null) __obj.updateDynamic("getPurgePageCount")(js.Any.fromFunction0(getPurgePageCount))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getTrailingBufferZone != null) __obj.updateDynamic("getTrailingBufferZone")(js.Any.fromFunction0(getTrailingBufferZone))
    if (getViewSize != null) __obj.updateDynamic("getViewSize")(js.Any.fromFunction0(getViewSize))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(leadingBufferZone)) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(js.Any.fromFunction1(prefetch))
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(js.Any.fromFunction2(prefetchPage))
    if (!js.isUndefined(purgePageCount)) __obj.updateDynamic("purgePageCount")(purgePageCount.get.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setBufferedCollection != null) __obj.updateDynamic("setBufferedCollection")(js.Any.fromFunction1(setBufferedCollection))
    if (setLeadingBufferZone != null) __obj.updateDynamic("setLeadingBufferZone")(js.Any.fromFunction1(setLeadingBufferZone))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setPurgePageCount != null) __obj.updateDynamic("setPurgePageCount")(js.Any.fromFunction1(setPurgePageCount))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setTrailingBufferZone != null) __obj.updateDynamic("setTrailingBufferZone")(js.Any.fromFunction1(setTrailingBufferZone))
    if (setViewSize != null) __obj.updateDynamic("setViewSize")(js.Any.fromFunction1(setViewSize))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (!js.isUndefined(trailingBufferZone)) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.get.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuffered]
  }
}

