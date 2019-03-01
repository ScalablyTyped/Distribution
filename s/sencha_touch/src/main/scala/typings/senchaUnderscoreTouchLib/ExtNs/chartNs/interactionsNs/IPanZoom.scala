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
    axes: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    chart: senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    gesture: java.lang.String = null,
    getAxes: js.Function0[_] = null,
    getBubbleEvents: js.Function0[_] = null,
    getChart: js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart] = null,
    getEnabled: js.Function0[scala.Boolean] = null,
    getGesture: js.Function0[java.lang.String] = null,
    getHideLabelInGesture: js.Function0[scala.Boolean] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemForEvent: js.Function1[/* e */ js.UndefOr[stdLib.Event], _] = null,
    getItemsForEvent: js.Function1[/* e */ js.UndefOr[stdLib.Event], senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getListeners: js.Function0[_] = null,
    getMaxZoom: js.Function0[_] = null,
    getMinZoom: js.Function0[_] = null,
    getModeToggleButton: js.Function0[_] = null,
    getPanGesture: js.Function0[java.lang.String] = null,
    getShowOverflowArrows: js.Function0[scala.Boolean] = null,
    getZoomOnPanGesture: js.Function0[scala.Boolean] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    initialize: js.Function0[scala.Unit] = null,
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
    onGesture: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit] = null,
    overflowArrowOptions: js.Any = null,
    platformConfig: js.Any = null,
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
    setAxes: js.Function1[/* axes */ js.UndefOr[js.Any], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setChart: js.Function1[
      /* chart */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart], 
      scala.Unit
    ] = null,
    setEnabled: js.Function1[/* enabled */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setGesture: js.Function1[/* gesture */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHideLabelInGesture: js.Function1[/* hideLabelInGesture */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxZoom: js.Function1[/* maxZoom */ js.UndefOr[js.Any], scala.Unit] = null,
    setMinZoom: js.Function1[/* minZoom */ js.UndefOr[js.Any], scala.Unit] = null,
    setModeToggleButton: js.Function1[/* modeToggleButton */ js.UndefOr[js.Any], scala.Unit] = null,
    setPanGesture: js.Function1[/* panGesture */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setShowOverflowArrows: js.Function1[/* showOverflowArrows */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setZoomOnPanGesture: js.Function1[/* zoomOnPanGesture */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    showOverflowArrows: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    throttleGap: scala.Int | scala.Double = null,
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
  ): IPanZoom = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (gesture != null) __obj.updateDynamic("gesture")(gesture)
    if (getAxes != null) __obj.updateDynamic("getAxes")(getAxes)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getChart != null) __obj.updateDynamic("getChart")(getChart)
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(getEnabled)
    if (getGesture != null) __obj.updateDynamic("getGesture")(getGesture)
    if (getHideLabelInGesture != null) __obj.updateDynamic("getHideLabelInGesture")(getHideLabelInGesture)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemForEvent != null) __obj.updateDynamic("getItemForEvent")(getItemForEvent)
    if (getItemsForEvent != null) __obj.updateDynamic("getItemsForEvent")(getItemsForEvent)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getMaxZoom != null) __obj.updateDynamic("getMaxZoom")(getMaxZoom)
    if (getMinZoom != null) __obj.updateDynamic("getMinZoom")(getMinZoom)
    if (getModeToggleButton != null) __obj.updateDynamic("getModeToggleButton")(getModeToggleButton)
    if (getPanGesture != null) __obj.updateDynamic("getPanGesture")(getPanGesture)
    if (getShowOverflowArrows != null) __obj.updateDynamic("getShowOverflowArrows")(getShowOverflowArrows)
    if (getZoomOnPanGesture != null) __obj.updateDynamic("getZoomOnPanGesture")(getZoomOnPanGesture)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (onGesture != null) __obj.updateDynamic("onGesture")(onGesture)
    if (overflowArrowOptions != null) __obj.updateDynamic("overflowArrowOptions")(overflowArrowOptions)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAxes != null) __obj.updateDynamic("setAxes")(setAxes)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setChart != null) __obj.updateDynamic("setChart")(setChart)
    if (setEnabled != null) __obj.updateDynamic("setEnabled")(setEnabled)
    if (setGesture != null) __obj.updateDynamic("setGesture")(setGesture)
    if (setHideLabelInGesture != null) __obj.updateDynamic("setHideLabelInGesture")(setHideLabelInGesture)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(setMaxZoom)
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(setMinZoom)
    if (setModeToggleButton != null) __obj.updateDynamic("setModeToggleButton")(setModeToggleButton)
    if (setPanGesture != null) __obj.updateDynamic("setPanGesture")(setPanGesture)
    if (setShowOverflowArrows != null) __obj.updateDynamic("setShowOverflowArrows")(setShowOverflowArrows)
    if (setZoomOnPanGesture != null) __obj.updateDynamic("setZoomOnPanGesture")(setZoomOnPanGesture)
    if (!js.isUndefined(showOverflowArrows)) __obj.updateDynamic("showOverflowArrows")(showOverflowArrows)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (throttleGap != null) __obj.updateDynamic("throttleGap")(throttleGap.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPanZoom]
  }
}

