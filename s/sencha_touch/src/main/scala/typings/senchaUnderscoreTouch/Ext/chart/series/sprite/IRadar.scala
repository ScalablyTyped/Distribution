package typings.senchaUnderscoreTouch.Ext.chart.series.sprite

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.chart.IMarkers
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadar
  extends typings.senchaUnderscoreTouch.Ext.chart.series.sprite.IPolar {
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IRadar: js.UndefOr[js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], _]] = js.undefined
}

object IRadar {
  @scala.inline
  def apply(
    A: Int | Double = null,
    An: Array = null,
    Data: Array = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    attr: js.Any = null,
    baseRotation: Int | Double = null,
    bindMarker: (/* name */ js.UndefOr[java.lang.String], /* marker */ js.UndefOr[IMarkers]) => Unit = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centerX: Int | Double = null,
    centerY: Int | Double = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    dataMaxX: Int | Double = null,
    dataMaxY: Int | Double = null,
    dataMinX: Int | Double = null,
    dataMinY: Int | Double = null,
    dataX: js.Any = null,
    dataY: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    endAngle: Int | Double = null,
    endRho: Int | Double = null,
    extend: java.lang.String = null,
    fillOpacity: Int | Double = null,
    fillStyle: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getBBox: /* isWithoutTransform */ js.UndefOr[Boolean] => Unit = null,
    getBBoxCenter: /* isWithoutTransform */ js.UndefOr[Boolean] => Array = null,
    getBubbleEvents: () => _ = null,
    getField: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getListeners: () => _ = null,
    getParent: () => _ = null,
    globalAlpha: Int | Double = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hide: () => typings.senchaUnderscoreTouch.Ext.chart.series.sprite.IRadar = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    labelOverflowPadding: Int | Double = null,
    labels: js.Any = null,
    lineCap: java.lang.String = null,
    lineJoin: java.lang.String = null,
    lineWidth: Int | Double = null,
    listeners: js.Any = null,
    miterLimit: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    preRender: () => Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    render: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any]) => _ = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    rotationCenterX: Int | Double = null,
    rotationCenterY: Int | Double = null,
    rotationRads: Int | Double = null,
    scalingCenterX: Int | Double = null,
    scalingCenterY: Int | Double = null,
    scalingX: Int | Double = null,
    scalingY: Int | Double = null,
    self: IClass = null,
    setAttributes: (/* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => Unit = null,
    setAttributesBypassingNormalization: (/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean]) => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setField: /* field */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setParent: /* parent */ js.UndefOr[js.Any] => Unit = null,
    shadowBlur: Int | Double = null,
    shadowColor: java.lang.String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    show: () => typings.senchaUnderscoreTouch.Ext.chart.series.sprite.IRadar = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    startRho: Int | Double = null,
    statics: js.Any = null,
    strokeOpacity: Int | Double = null,
    strokeStyle: java.lang.String = null,
    suspendEvents: () => Unit = null,
    transformFillStroke: js.UndefOr[Boolean] = js.undefined,
    translationX: Int | Double = null,
    translationY: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    updatePlainBBox: /* plain */ js.UndefOr[js.Any] => Unit = null,
    updateTransformedBBox: (/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any]) => Unit = null,
    useAttributes: (/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => Unit = null,
    uses: Array = null,
    zIndex: Int | Double = null
  ): IRadar = {
    val __obj = js.Dynamic.literal()
    if (A != null) __obj.updateDynamic("A")(A.asInstanceOf[js.Any])
    if (An != null) __obj.updateDynamic("An")(An)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (attr != null) __obj.updateDynamic("attr")(attr)
    if (baseRotation != null) __obj.updateDynamic("baseRotation")(baseRotation.asInstanceOf[js.Any])
    if (bindMarker != null) __obj.updateDynamic("bindMarker")(js.Any.fromFunction2(bindMarker))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (centerX != null) __obj.updateDynamic("centerX")(centerX.asInstanceOf[js.Any])
    if (centerY != null) __obj.updateDynamic("centerY")(centerY.asInstanceOf[js.Any])
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (dataMaxX != null) __obj.updateDynamic("dataMaxX")(dataMaxX.asInstanceOf[js.Any])
    if (dataMaxY != null) __obj.updateDynamic("dataMaxY")(dataMaxY.asInstanceOf[js.Any])
    if (dataMinX != null) __obj.updateDynamic("dataMinX")(dataMinX.asInstanceOf[js.Any])
    if (dataMinY != null) __obj.updateDynamic("dataMinY")(dataMinY.asInstanceOf[js.Any])
    if (dataX != null) __obj.updateDynamic("dataX")(dataX)
    if (dataY != null) __obj.updateDynamic("dataY")(dataY)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (endRho != null) __obj.updateDynamic("endRho")(endRho.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBBox != null) __obj.updateDynamic("getBBox")(js.Any.fromFunction1(getBBox))
    if (getBBoxCenter != null) __obj.updateDynamic("getBBoxCenter")(js.Any.fromFunction1(getBBoxCenter))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getField != null) __obj.updateDynamic("getField")(js.Any.fromFunction0(getField))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (globalAlpha != null) __obj.updateDynamic("globalAlpha")(globalAlpha.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (labelOverflowPadding != null) __obj.updateDynamic("labelOverflowPadding")(labelOverflowPadding.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (miterLimit != null) __obj.updateDynamic("miterLimit")(miterLimit.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction0(preRender))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (rotationCenterX != null) __obj.updateDynamic("rotationCenterX")(rotationCenterX.asInstanceOf[js.Any])
    if (rotationCenterY != null) __obj.updateDynamic("rotationCenterY")(rotationCenterY.asInstanceOf[js.Any])
    if (rotationRads != null) __obj.updateDynamic("rotationRads")(rotationRads.asInstanceOf[js.Any])
    if (scalingCenterX != null) __obj.updateDynamic("scalingCenterX")(scalingCenterX.asInstanceOf[js.Any])
    if (scalingCenterY != null) __obj.updateDynamic("scalingCenterY")(scalingCenterY.asInstanceOf[js.Any])
    if (scalingX != null) __obj.updateDynamic("scalingX")(scalingX.asInstanceOf[js.Any])
    if (scalingY != null) __obj.updateDynamic("scalingY")(scalingY.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(js.Any.fromFunction3(setAttributes))
    if (setAttributesBypassingNormalization != null) __obj.updateDynamic("setAttributesBypassingNormalization")(js.Any.fromFunction2(setAttributesBypassingNormalization))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setField != null) __obj.updateDynamic("setField")(js.Any.fromFunction1(setField))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setParent != null) __obj.updateDynamic("setParent")(js.Any.fromFunction1(setParent))
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor)
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (startRho != null) __obj.updateDynamic("startRho")(startRho.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (!js.isUndefined(transformFillStroke)) __obj.updateDynamic("transformFillStroke")(transformFillStroke)
    if (translationX != null) __obj.updateDynamic("translationX")(translationX.asInstanceOf[js.Any])
    if (translationY != null) __obj.updateDynamic("translationY")(translationY.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (updatePlainBBox != null) __obj.updateDynamic("updatePlainBBox")(js.Any.fromFunction1(updatePlainBBox))
    if (updateTransformedBBox != null) __obj.updateDynamic("updateTransformedBBox")(js.Any.fromFunction2(updateTransformedBBox))
    if (useAttributes != null) __obj.updateDynamic("useAttributes")(js.Any.fromFunction2(useAttributes))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadar]
  }
}

