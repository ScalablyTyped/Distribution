package typings.senchaUnderscoreTouch.ExtNs.chartNs.seriesNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadar extends IPolar {
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Object
  		* @param y Object
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  @JSName("getItemForPoint")
  var getItemForPoint_IRadar: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.undefined
}

object IRadar {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    center: Array = null,
    clearListeners: () => Unit = null,
    colors: Array = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getAnimate: () => _ = null,
    getBackground: () => _ = null,
    getBubbleEvents: () => _ = null,
    getCenter: () => Array = null,
    getColors: () => Array = null,
    getHidden: () => _ = null,
    getHighlightCfg: () => _ = null,
    getHighlightItem: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemForPoint: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => _ = null,
    getItemInstancing: () => _ = null,
    getLabel: () => _ = null,
    getLabelField: () => _ = null,
    getLabelOverflowPadding: () => Double = null,
    getListeners: () => _ = null,
    getMarker: () => _ = null,
    getMarkerSubStyle: () => _ = null,
    getOffsetX: () => Double = null,
    getOffsetY: () => Double = null,
    getOverlaySurface: () => _ = null,
    getRadius: () => Double = null,
    getRenderer: () => _ = null,
    getRotation: () => Double = null,
    getShowInLegend: () => Boolean = null,
    getSprites: () => Unit = null,
    getStyle: () => _ = null,
    getSubStyle: () => _ = null,
    getSurface: () => _ = null,
    getTitle: () => java.lang.String = null,
    getXAxis: () => _ = null,
    getXField: () => java.lang.String = null,
    getYAxis: () => _ = null,
    getYField: () => java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hidden: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    itemInstancing: js.Any = null,
    label: js.Any = null,
    labelField: js.Any = null,
    labelOverflowPadding: Int | Double = null,
    listeners: js.Any = null,
    marker: js.Any = null,
    markerSubStyle: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    overlaySurface: js.Any = null,
    platformConfig: js.Any = null,
    provideLegendInfo: /* target */ js.UndefOr[Array] => Unit = null,
    radius: Int | Double = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    rotation: Int | Double = null,
    self: IClass = null,
    seriesType: java.lang.String = null,
    setAnimate: /* animate */ js.UndefOr[js.Any] => Unit = null,
    setBackground: /* background */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCenter: /* center */ js.UndefOr[Array] => Unit = null,
    setColors: /* colors */ js.UndefOr[Array] => Unit = null,
    setHidden: /* hidden */ js.UndefOr[js.Any] => Unit = null,
    setHiddenByIndex: (/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean]) => Unit = null,
    setHighlightCfg: /* highlightCfg */ js.UndefOr[js.Any] => Unit = null,
    setHighlightItem: /* highlightItem */ js.UndefOr[js.Any] => Unit = null,
    setItemInstancing: /* itemInstancing */ js.UndefOr[js.Any] => Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => _ = null,
    setLabelField: /* labelField */ js.UndefOr[js.Any] => Unit = null,
    setLabelOverflowPadding: /* labelOverflowPadding */ js.UndefOr[Double] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMarker: /* marker */ js.UndefOr[js.Any] => Unit = null,
    setMarkerSubStyle: /* markerSubStyle */ js.UndefOr[js.Any] => Unit = null,
    setOffsetX: /* offsetX */ js.UndefOr[Double] => Unit = null,
    setOffsetY: /* offsetY */ js.UndefOr[Double] => Unit = null,
    setOverlaySurface: /* overlaySurface */ js.UndefOr[js.Any] => Unit = null,
    setRadius: /* radius */ js.UndefOr[Double] => Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => _ = null,
    setRotation: /* rotation */ js.UndefOr[Double] => Unit = null,
    setShowInLegend: /* showInLegend */ js.UndefOr[Boolean] => Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Unit = null,
    setSubStyle: /* subStyle */ js.UndefOr[js.Any] => Unit = null,
    setSurface: /* surface */ js.UndefOr[js.Any] => Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    setXAxis: /* xAxis */ js.UndefOr[js.Any] => Unit = null,
    setXField: /* xField */ js.UndefOr[java.lang.String] => Unit = null,
    setYAxis: /* yAxis */ js.UndefOr[js.Any] => Unit = null,
    setYField: /* yField */ js.UndefOr[java.lang.String] => Unit = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    store: js.Any = null,
    style: js.Any = null,
    subStyle: js.Any = null,
    surface: js.Any = null,
    suspendEvents: () => Unit = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    xField: java.lang.String = null,
    yField: java.lang.String = null
  ): IRadar = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (center != null) __obj.updateDynamic("center")(center)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAnimate != null) __obj.updateDynamic("getAnimate")(js.Any.fromFunction0(getAnimate))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCenter != null) __obj.updateDynamic("getCenter")(js.Any.fromFunction0(getCenter))
    if (getColors != null) __obj.updateDynamic("getColors")(js.Any.fromFunction0(getColors))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getHighlightCfg != null) __obj.updateDynamic("getHighlightCfg")(js.Any.fromFunction0(getHighlightCfg))
    if (getHighlightItem != null) __obj.updateDynamic("getHighlightItem")(js.Any.fromFunction0(getHighlightItem))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction2(getItemForPoint))
    if (getItemInstancing != null) __obj.updateDynamic("getItemInstancing")(js.Any.fromFunction0(getItemInstancing))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLabelField != null) __obj.updateDynamic("getLabelField")(js.Any.fromFunction0(getLabelField))
    if (getLabelOverflowPadding != null) __obj.updateDynamic("getLabelOverflowPadding")(js.Any.fromFunction0(getLabelOverflowPadding))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMarker != null) __obj.updateDynamic("getMarker")(js.Any.fromFunction0(getMarker))
    if (getMarkerSubStyle != null) __obj.updateDynamic("getMarkerSubStyle")(js.Any.fromFunction0(getMarkerSubStyle))
    if (getOffsetX != null) __obj.updateDynamic("getOffsetX")(js.Any.fromFunction0(getOffsetX))
    if (getOffsetY != null) __obj.updateDynamic("getOffsetY")(js.Any.fromFunction0(getOffsetY))
    if (getOverlaySurface != null) __obj.updateDynamic("getOverlaySurface")(js.Any.fromFunction0(getOverlaySurface))
    if (getRadius != null) __obj.updateDynamic("getRadius")(js.Any.fromFunction0(getRadius))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getRotation != null) __obj.updateDynamic("getRotation")(js.Any.fromFunction0(getRotation))
    if (getShowInLegend != null) __obj.updateDynamic("getShowInLegend")(js.Any.fromFunction0(getShowInLegend))
    if (getSprites != null) __obj.updateDynamic("getSprites")(js.Any.fromFunction0(getSprites))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getSubStyle != null) __obj.updateDynamic("getSubStyle")(js.Any.fromFunction0(getSubStyle))
    if (getSurface != null) __obj.updateDynamic("getSurface")(js.Any.fromFunction0(getSurface))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getXAxis != null) __obj.updateDynamic("getXAxis")(js.Any.fromFunction0(getXAxis))
    if (getXField != null) __obj.updateDynamic("getXField")(js.Any.fromFunction0(getXField))
    if (getYAxis != null) __obj.updateDynamic("getYAxis")(js.Any.fromFunction0(getYAxis))
    if (getYField != null) __obj.updateDynamic("getYField")(js.Any.fromFunction0(getYField))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg)
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (itemInstancing != null) __obj.updateDynamic("itemInstancing")(itemInstancing)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelField != null) __obj.updateDynamic("labelField")(labelField)
    if (labelOverflowPadding != null) __obj.updateDynamic("labelOverflowPadding")(labelOverflowPadding.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (markerSubStyle != null) __obj.updateDynamic("markerSubStyle")(markerSubStyle)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (overlaySurface != null) __obj.updateDynamic("overlaySurface")(overlaySurface)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (provideLegendInfo != null) __obj.updateDynamic("provideLegendInfo")(js.Any.fromFunction1(provideLegendInfo))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (setAnimate != null) __obj.updateDynamic("setAnimate")(js.Any.fromFunction1(setAnimate))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCenter != null) __obj.updateDynamic("setCenter")(js.Any.fromFunction1(setCenter))
    if (setColors != null) __obj.updateDynamic("setColors")(js.Any.fromFunction1(setColors))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setHiddenByIndex != null) __obj.updateDynamic("setHiddenByIndex")(js.Any.fromFunction2(setHiddenByIndex))
    if (setHighlightCfg != null) __obj.updateDynamic("setHighlightCfg")(js.Any.fromFunction1(setHighlightCfg))
    if (setHighlightItem != null) __obj.updateDynamic("setHighlightItem")(js.Any.fromFunction1(setHighlightItem))
    if (setItemInstancing != null) __obj.updateDynamic("setItemInstancing")(js.Any.fromFunction1(setItemInstancing))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLabelField != null) __obj.updateDynamic("setLabelField")(js.Any.fromFunction1(setLabelField))
    if (setLabelOverflowPadding != null) __obj.updateDynamic("setLabelOverflowPadding")(js.Any.fromFunction1(setLabelOverflowPadding))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMarker != null) __obj.updateDynamic("setMarker")(js.Any.fromFunction1(setMarker))
    if (setMarkerSubStyle != null) __obj.updateDynamic("setMarkerSubStyle")(js.Any.fromFunction1(setMarkerSubStyle))
    if (setOffsetX != null) __obj.updateDynamic("setOffsetX")(js.Any.fromFunction1(setOffsetX))
    if (setOffsetY != null) __obj.updateDynamic("setOffsetY")(js.Any.fromFunction1(setOffsetY))
    if (setOverlaySurface != null) __obj.updateDynamic("setOverlaySurface")(js.Any.fromFunction1(setOverlaySurface))
    if (setRadius != null) __obj.updateDynamic("setRadius")(js.Any.fromFunction1(setRadius))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setRotation != null) __obj.updateDynamic("setRotation")(js.Any.fromFunction1(setRotation))
    if (setShowInLegend != null) __obj.updateDynamic("setShowInLegend")(js.Any.fromFunction1(setShowInLegend))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setSubStyle != null) __obj.updateDynamic("setSubStyle")(js.Any.fromFunction1(setSubStyle))
    if (setSurface != null) __obj.updateDynamic("setSurface")(js.Any.fromFunction1(setSurface))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setXAxis != null) __obj.updateDynamic("setXAxis")(js.Any.fromFunction1(setXAxis))
    if (setXField != null) __obj.updateDynamic("setXField")(js.Any.fromFunction1(setXField))
    if (setYAxis != null) __obj.updateDynamic("setYAxis")(js.Any.fromFunction1(setYAxis))
    if (setYField != null) __obj.updateDynamic("setYField")(js.Any.fromFunction1(setYField))
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (store != null) __obj.updateDynamic("store")(store)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subStyle != null) __obj.updateDynamic("subStyle")(subStyle)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (xField != null) __obj.updateDynamic("xField")(xField)
    if (yField != null) __obj.updateDynamic("yField")(yField)
    __obj.asInstanceOf[IRadar]
  }
}

