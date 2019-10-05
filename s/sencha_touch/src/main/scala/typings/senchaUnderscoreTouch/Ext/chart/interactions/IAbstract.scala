package typings.senchaUnderscoreTouch.Ext.chart.interactions

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.chart.IAbstractChart
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IObservable {
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[IAbstractChart] = js.undefined
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var gesture: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of chart
  		* @returns Ext.chart.AbstractChart
  		*/
  var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.undefined
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of gesture
  		* @returns String
  		*/
  var getGesture: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Find and return a single series item corresponding to the given event or null if no matching item is found
  		* @param e Event
  		* @returns Object the item object or null if none found.
  		*/
  var getItemForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], _]] = js.undefined
  /** [Method] Find and return all series items corresponding to the given event
  		* @param e Event
  		* @returns Array array of matching item objects
  		*/
  var getItemsForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Array]] = js.undefined
  /** [Method] A method to be implemented by subclasses where all event attachment should occur  */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Placeholder method  */
  var onGesture: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAbstract: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Method] Sets the value of chart
  		* @param chart Ext.chart.AbstractChart The new value.
  		*/
  var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.undefined
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of gesture
  		* @param gesture String The new value.
  		*/
  var setGesture: js.UndefOr[js.Function1[/* gesture */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Property] (Number) */
  var throttleGap: js.UndefOr[Double] = js.undefined
}

object IAbstract {
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
    chart: IAbstractChart = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    gesture: java.lang.String = null,
    getBubbleEvents: () => _ = null,
    getChart: () => IAbstractChart = null,
    getEnabled: () => Boolean = null,
    getGesture: () => java.lang.String = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemForEvent: /* e */ js.UndefOr[Event] => _ = null,
    getItemsForEvent: /* e */ js.UndefOr[Event] => Array = null,
    getListeners: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    initialize: () => Unit = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onGesture: () => Unit = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setChart: /* chart */ js.UndefOr[IAbstractChart] => Unit = null,
    setEnabled: /* enabled */ js.UndefOr[Boolean] => Unit = null,
    setGesture: /* gesture */ js.UndefOr[java.lang.String] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    throttleGap: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IAbstract = {
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
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (gesture != null) __obj.updateDynamic("gesture")(gesture)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getChart != null) __obj.updateDynamic("getChart")(js.Any.fromFunction0(getChart))
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(js.Any.fromFunction0(getEnabled))
    if (getGesture != null) __obj.updateDynamic("getGesture")(js.Any.fromFunction0(getGesture))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemForEvent != null) __obj.updateDynamic("getItemForEvent")(js.Any.fromFunction1(getItemForEvent))
    if (getItemsForEvent != null) __obj.updateDynamic("getItemsForEvent")(js.Any.fromFunction1(getItemsForEvent))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (onGesture != null) __obj.updateDynamic("onGesture")(js.Any.fromFunction0(onGesture))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1(setChart))
    if (setEnabled != null) __obj.updateDynamic("setEnabled")(js.Any.fromFunction1(setEnabled))
    if (setGesture != null) __obj.updateDynamic("setGesture")(js.Any.fromFunction1(setGesture))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (throttleGap != null) __obj.updateDynamic("throttleGap")(throttleGap.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstract]
  }
}

