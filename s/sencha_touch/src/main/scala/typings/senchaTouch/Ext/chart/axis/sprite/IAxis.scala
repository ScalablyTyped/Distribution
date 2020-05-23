package typings.senchaTouch.Ext.chart.axis.sprite

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.chart.IMarkers
import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IAxis extends ISprite {
  /** [Config Option] (Number) */
  var The: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[typings.senchaTouch.Ext.chart.axis.IAxis] = js.undefined
  /** [Config Option] (Boolean) */
  var axisLine: js.UndefOr[Boolean] = js.undefined
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMax: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMin: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enlargeEstStepSizeByText: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of axis
    * @returns Ext.chart.axis.Axis
    */
  var getAxis: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine  */
  @JSName("getBBox")
  var getBBox_IAxis: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of label
    * @returns Object
    */
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of layout
    * @returns Object|Ext.chart.axis.layout.Layout
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of renderer
    * @returns Function
    */
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of segmenter
    * @returns Object|Ext.chart.axis.segmenter.Segmenter
    */
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var grid: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var majorTicks: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var max: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var min: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minStepSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSize: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var minorTricks: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @param clipRegion Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IAxis: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of axis
    * @param axis Ext.chart.axis.Axis The new value.
    */
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[this.type], Unit]] = js.undefined
  /** [Method] Sets the value of label
    * @param label Object The new value.
    */
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of layout
    * @param layout Object|Ext.chart.axis.layout.Layout The new value.
    */
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of renderer
    * @param renderer Function The new value.
    */
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of segmenter
    * @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
    */
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var textPadding: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var visibleMax: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var visibleMin: js.UndefOr[Double] = js.undefined
}

object IAxis {
  @scala.inline
  def apply(
    A: js.UndefOr[Double] = js.undefined,
    An: Array = null,
    The: js.UndefOr[Double] = js.undefined,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    attr: js.Any = null,
    axis: typings.senchaTouch.Ext.chart.axis.IAxis = null,
    axisLine: js.UndefOr[Boolean] = js.undefined,
    bindMarker: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centerX: js.UndefOr[Double] = js.undefined,
    centerY: js.UndefOr[Double] = js.undefined,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    dataMax: js.UndefOr[Double] = js.undefined,
    dataMin: js.UndefOr[Double] = js.undefined,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    enlargeEstStepSizeByText: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    fillStyle: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    getAxis: () => IAxis = null,
    getBBox: () => Unit = null,
    getBBoxCenter: /* isWithoutTransform */ js.UndefOr[Boolean] => Array = null,
    getBubbleEvents: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLabel: () => _ = null,
    getLayout: () => _ = null,
    getListeners: () => _ = null,
    getParent: () => _ = null,
    getRenderer: () => _ = null,
    getSegmenter: () => _ = null,
    globalAlpha: js.UndefOr[Double] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hide: () => IAxis = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    label: js.Any = null,
    layout: js.Any = null,
    length: js.UndefOr[Double] = js.undefined,
    lineCap: String = null,
    lineJoin: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    listeners: js.Any = null,
    majorTickSize: js.UndefOr[Double] = js.undefined,
    majorTicks: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minStepSize: js.UndefOr[Double] = js.undefined,
    minorTickSize: js.UndefOr[Double] = js.undefined,
    minorTricks: js.UndefOr[Boolean] = js.undefined,
    miterLimit: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    position: String = null,
    preRender: () => Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    render: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _ = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    rotationCenterX: js.UndefOr[Double] = js.undefined,
    rotationCenterY: js.UndefOr[Double] = js.undefined,
    rotationRads: js.UndefOr[Double] = js.undefined,
    scalingCenterX: js.UndefOr[Double] = js.undefined,
    scalingCenterY: js.UndefOr[Double] = js.undefined,
    scalingX: js.UndefOr[Double] = js.undefined,
    scalingY: js.UndefOr[Double] = js.undefined,
    segmenter: js.Any = null,
    self: IClass = null,
    setAttributes: (/* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => Unit = null,
    setAttributesBypassingNormalization: (/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean]) => Unit = null,
    setAxis: /* axis */ js.UndefOr[IAxis] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setParent: /* parent */ js.UndefOr[js.Any] => Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => Unit = null,
    setSegmenter: /* segmenter */ js.UndefOr[js.Any] => Unit = null,
    shadowBlur: js.UndefOr[Double] = js.undefined,
    shadowColor: String = null,
    shadowOffsetX: js.UndefOr[Double] = js.undefined,
    shadowOffsetY: js.UndefOr[Double] = js.undefined,
    show: () => IAxis = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeStyle: String = null,
    suspendEvents: () => Unit = null,
    textPadding: js.UndefOr[Double] = js.undefined,
    transformFillStroke: js.UndefOr[Boolean] = js.undefined,
    translationX: js.UndefOr[Double] = js.undefined,
    translationY: js.UndefOr[Double] = js.undefined,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    updatePlainBBox: /* plain */ js.UndefOr[js.Any] => Unit = null,
    updateTransformedBBox: (/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any]) => Unit = null,
    useAttributes: (/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => Unit = null,
    uses: Array = null,
    visibleMax: js.UndefOr[Double] = js.undefined,
    visibleMin: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(A)) __obj.updateDynamic("A")(A.get.asInstanceOf[js.Any])
    if (An != null) __obj.updateDynamic("An")(An.asInstanceOf[js.Any])
    if (!js.isUndefined(The)) __obj.updateDynamic("The")(The.get.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(axisLine)) __obj.updateDynamic("axisLine")(axisLine.get.asInstanceOf[js.Any])
    if (bindMarker != null) __obj.updateDynamic("bindMarker")(js.Any.fromFunction2(bindMarker))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(centerX)) __obj.updateDynamic("centerX")(centerX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerY)) __obj.updateDynamic("centerY")(centerY.get.asInstanceOf[js.Any])
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dataMax)) __obj.updateDynamic("dataMax")(dataMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dataMin)) __obj.updateDynamic("dataMin")(dataMin.get.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (!js.isUndefined(enlargeEstStepSizeByText)) __obj.updateDynamic("enlargeEstStepSizeByText")(enlargeEstStepSizeByText.get.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAxis != null) __obj.updateDynamic("getAxis")(js.Any.fromFunction0(getAxis))
    if (getBBox != null) __obj.updateDynamic("getBBox")(js.Any.fromFunction0(getBBox))
    if (getBBoxCenter != null) __obj.updateDynamic("getBBoxCenter")(js.Any.fromFunction1(getBBoxCenter))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getSegmenter != null) __obj.updateDynamic("getSegmenter")(js.Any.fromFunction0(getSegmenter))
    if (!js.isUndefined(globalAlpha)) __obj.updateDynamic("globalAlpha")(globalAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.get.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTickSize)) __obj.updateDynamic("majorTickSize")(majorTickSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTicks)) __obj.updateDynamic("majorTicks")(majorTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minStepSize)) __obj.updateDynamic("minStepSize")(minStepSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickSize)) __obj.updateDynamic("minorTickSize")(minorTickSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTricks)) __obj.updateDynamic("minorTricks")(minorTricks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(miterLimit)) __obj.updateDynamic("miterLimit")(miterLimit.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction0(preRender))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (!js.isUndefined(rotationCenterX)) __obj.updateDynamic("rotationCenterX")(rotationCenterX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationCenterY)) __obj.updateDynamic("rotationCenterY")(rotationCenterY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationRads)) __obj.updateDynamic("rotationRads")(rotationRads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingCenterX)) __obj.updateDynamic("scalingCenterX")(scalingCenterX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingCenterY)) __obj.updateDynamic("scalingCenterY")(scalingCenterY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingX)) __obj.updateDynamic("scalingX")(scalingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalingY)) __obj.updateDynamic("scalingY")(scalingY.get.asInstanceOf[js.Any])
    if (segmenter != null) __obj.updateDynamic("segmenter")(segmenter.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAttributes != null) __obj.updateDynamic("setAttributes")(js.Any.fromFunction3(setAttributes))
    if (setAttributesBypassingNormalization != null) __obj.updateDynamic("setAttributesBypassingNormalization")(js.Any.fromFunction2(setAttributesBypassingNormalization))
    if (setAxis != null) __obj.updateDynamic("setAxis")(js.Any.fromFunction1(setAxis))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setParent != null) __obj.updateDynamic("setParent")(js.Any.fromFunction1(setParent))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(js.Any.fromFunction1(setSegmenter))
    if (!js.isUndefined(shadowBlur)) __obj.updateDynamic("shadowBlur")(shadowBlur.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetX)) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffsetY)) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.get.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (!js.isUndefined(textPadding)) __obj.updateDynamic("textPadding")(textPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transformFillStroke)) __obj.updateDynamic("transformFillStroke")(transformFillStroke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translationX)) __obj.updateDynamic("translationX")(translationX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(translationY)) __obj.updateDynamic("translationY")(translationY.get.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (updatePlainBBox != null) __obj.updateDynamic("updatePlainBBox")(js.Any.fromFunction1(updatePlainBBox))
    if (updateTransformedBBox != null) __obj.updateDynamic("updateTransformedBBox")(js.Any.fromFunction2(updateTransformedBBox))
    if (useAttributes != null) __obj.updateDynamic("useAttributes")(js.Any.fromFunction2(useAttributes))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleMax)) __obj.updateDynamic("visibleMax")(visibleMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleMin)) __obj.updateDynamic("visibleMin")(visibleMin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
}

