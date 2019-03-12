package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.interactionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanZoom extends IAbstract {
  /** [Config Option] (Object/Array) */
  var axes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of axes
  		* @returns Object/Array
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hideLabelInGesture
  		* @returns Boolean
  		*/
  var getHideLabelInGesture: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of maxZoom
  		* @returns Object
  		*/
  var getMaxZoom: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of minZoom
  		* @returns Object
  		*/
  var getMinZoom: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of modeToggleButton
  		* @returns Object
  		*/
  var getModeToggleButton: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of panGesture
  		* @returns String
  		*/
  var getPanGesture: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of showOverflowArrows
  		* @returns Boolean
  		*/
  var getShowOverflowArrows: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of zoomOnPanGesture
  		* @returns Boolean
  		*/
  var getZoomOnPanGesture: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Placeholder method
  		* @param e Object
  		*/
  @JSName("onGesture")
  var onGesture_IPanZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var overflowArrowOptions: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of axes
  		* @param axes Object/Array The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hideLabelInGesture
  		* @param hideLabelInGesture Boolean The new value.
  		*/
  var setHideLabelInGesture: js.UndefOr[js.Function1[/* hideLabelInGesture */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxZoom
  		* @param maxZoom Object The new value.
  		*/
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minZoom
  		* @param minZoom Object The new value.
  		*/
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of modeToggleButton
  		* @param modeToggleButton Object The new value.
  		*/
  var setModeToggleButton: js.UndefOr[js.Function1[/* modeToggleButton */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of panGesture
  		* @param panGesture String The new value.
  		*/
  var setPanGesture: js.UndefOr[js.Function1[/* panGesture */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of showOverflowArrows
  		* @param showOverflowArrows Boolean The new value.
  		*/
  var setShowOverflowArrows: js.UndefOr[js.Function1[/* showOverflowArrows */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of zoomOnPanGesture
  		* @param zoomOnPanGesture Boolean The new value.
  		*/
  var setZoomOnPanGesture: js.UndefOr[js.Function1[/* zoomOnPanGesture */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showOverflowArrows: js.UndefOr[scala.Boolean] = js.undefined
}

object IPanZoom {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    axes: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    chart: senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart = null,
    clearListeners: () => scala.Unit = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    gesture: java.lang.String = null,
    getAxes: () => _ = null,
    getBubbleEvents: () => _ = null,
    getChart: () => senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart = null,
    getEnabled: () => scala.Boolean = null,
    getGesture: () => java.lang.String = null,
    getHideLabelInGesture: () => scala.Boolean = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemForEvent: /* e */ js.UndefOr[stdLib.Event] => _ = null,
    getItemsForEvent: /* e */ js.UndefOr[stdLib.Event] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getListeners: () => _ = null,
    getMaxZoom: () => _ = null,
    getMinZoom: () => _ = null,
    getModeToggleButton: () => _ = null,
    getPanGesture: () => java.lang.String = null,
    getShowOverflowArrows: () => scala.Boolean = null,
    getZoomOnPanGesture: () => scala.Boolean = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    initialize: () => scala.Unit = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onGesture: /* e */ js.UndefOr[js.Any] => scala.Unit = null,
    overflowArrowOptions: js.Any = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAxes: /* axes */ js.UndefOr[js.Any] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setChart: /* chart */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart] => scala.Unit = null,
    setEnabled: /* enabled */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setGesture: /* gesture */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHideLabelInGesture: /* hideLabelInGesture */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxZoom: /* maxZoom */ js.UndefOr[js.Any] => scala.Unit = null,
    setMinZoom: /* minZoom */ js.UndefOr[js.Any] => scala.Unit = null,
    setModeToggleButton: /* modeToggleButton */ js.UndefOr[js.Any] => scala.Unit = null,
    setPanGesture: /* panGesture */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setShowOverflowArrows: /* showOverflowArrows */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setZoomOnPanGesture: /* zoomOnPanGesture */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    showOverflowArrows: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => scala.Unit = null,
    throttleGap: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IPanZoom = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (axes != null) __obj.updateDynamic("axes")(axes)
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
    if (getAxes != null) __obj.updateDynamic("getAxes")(js.Any.fromFunction0(getAxes))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getChart != null) __obj.updateDynamic("getChart")(js.Any.fromFunction0(getChart))
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(js.Any.fromFunction0(getEnabled))
    if (getGesture != null) __obj.updateDynamic("getGesture")(js.Any.fromFunction0(getGesture))
    if (getHideLabelInGesture != null) __obj.updateDynamic("getHideLabelInGesture")(js.Any.fromFunction0(getHideLabelInGesture))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemForEvent != null) __obj.updateDynamic("getItemForEvent")(js.Any.fromFunction1(getItemForEvent))
    if (getItemsForEvent != null) __obj.updateDynamic("getItemsForEvent")(js.Any.fromFunction1(getItemsForEvent))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMaxZoom != null) __obj.updateDynamic("getMaxZoom")(js.Any.fromFunction0(getMaxZoom))
    if (getMinZoom != null) __obj.updateDynamic("getMinZoom")(js.Any.fromFunction0(getMinZoom))
    if (getModeToggleButton != null) __obj.updateDynamic("getModeToggleButton")(js.Any.fromFunction0(getModeToggleButton))
    if (getPanGesture != null) __obj.updateDynamic("getPanGesture")(js.Any.fromFunction0(getPanGesture))
    if (getShowOverflowArrows != null) __obj.updateDynamic("getShowOverflowArrows")(js.Any.fromFunction0(getShowOverflowArrows))
    if (getZoomOnPanGesture != null) __obj.updateDynamic("getZoomOnPanGesture")(js.Any.fromFunction0(getZoomOnPanGesture))
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
    if (onGesture != null) __obj.updateDynamic("onGesture")(js.Any.fromFunction1(onGesture))
    if (overflowArrowOptions != null) __obj.updateDynamic("overflowArrowOptions")(overflowArrowOptions)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAxes != null) __obj.updateDynamic("setAxes")(js.Any.fromFunction1(setAxes))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1(setChart))
    if (setEnabled != null) __obj.updateDynamic("setEnabled")(js.Any.fromFunction1(setEnabled))
    if (setGesture != null) __obj.updateDynamic("setGesture")(js.Any.fromFunction1(setGesture))
    if (setHideLabelInGesture != null) __obj.updateDynamic("setHideLabelInGesture")(js.Any.fromFunction1(setHideLabelInGesture))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(js.Any.fromFunction1(setMaxZoom))
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(js.Any.fromFunction1(setMinZoom))
    if (setModeToggleButton != null) __obj.updateDynamic("setModeToggleButton")(js.Any.fromFunction1(setModeToggleButton))
    if (setPanGesture != null) __obj.updateDynamic("setPanGesture")(js.Any.fromFunction1(setPanGesture))
    if (setShowOverflowArrows != null) __obj.updateDynamic("setShowOverflowArrows")(js.Any.fromFunction1(setShowOverflowArrows))
    if (setZoomOnPanGesture != null) __obj.updateDynamic("setZoomOnPanGesture")(js.Any.fromFunction1(setZoomOnPanGesture))
    if (!js.isUndefined(showOverflowArrows)) __obj.updateDynamic("showOverflowArrows")(showOverflowArrows)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (throttleGap != null) __obj.updateDynamic("throttleGap")(throttleGap.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPanZoom]
  }
}

