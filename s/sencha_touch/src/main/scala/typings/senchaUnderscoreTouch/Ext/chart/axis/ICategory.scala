package typings.senchaUnderscoreTouch.Ext.chart.axis

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.chart.IAbstractChart
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import typings.senchaUnderscoreTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICategory extends IAxis {
  /** [Method] Returns the value of layout
  		* @returns String
  		*/
  @JSName("getLayout")
  var getLayout_ICategory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of segmenter
  		* @returns String
  		*/
  @JSName("getSegmenter")
  var getSegmenter_ICategory: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout String The new value.
  		*/
  @JSName("setLayout")
  var setLayout_ICategory: js.UndefOr[js.Function1[/* layout */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of segmenter
  		* @param segmenter String The new value.
  		*/
  @JSName("setSegmenter")
  var setSegmenter_ICategory: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}

object ICategory {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    chart: IAbstractChart = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fields: Array = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getBackground: () => _ = null,
    getBubbleEvents: () => _ = null,
    getChart: () => IAbstractChart = null,
    getCoordFor: (/* value */ js.UndefOr[js.Any], /* field */ js.UndefOr[java.lang.String], /* idx */ js.UndefOr[Double], /* items */ js.UndefOr[IMixedCollection]) => Double = null,
    getFields: () => Array = null,
    getGrid: () => _ = null,
    getHidden: () => Boolean = null,
    getId: () => _ = null,
    getIncrement: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLabel: () => _ = null,
    getLabelInSpan: () => Boolean = null,
    getLayout: () => java.lang.String = null,
    getListeners: () => _ = null,
    getMajorTickSteps: () => Double = null,
    getMaxZoom: () => Double = null,
    getMaximum: () => Double = null,
    getMinZoom: () => Double = null,
    getMinimum: () => Double = null,
    getMinorTickSteps: () => Double = null,
    getNeedHighPrecision: () => Boolean = null,
    getPosition: () => java.lang.String = null,
    getRange: () => Array = null,
    getRenderer: () => _ = null,
    getSegmenter: () => java.lang.String = null,
    getStyle: () => _ = null,
    getTitle: () => _ = null,
    getTitleMargin: () => Double = null,
    getVisibleRange: () => Array = null,
    grid: js.Any = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    increment: Int | Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    label: js.Any = null,
    labelInSpan: js.UndefOr[Boolean] = js.undefined,
    layout: js.Any = null,
    listeners: js.Any = null,
    majorTickSteps: Int | Double = null,
    maxZoom: Int | Double = null,
    maximum: Int | Double = null,
    minZoom: Int | Double = null,
    minimum: Int | Double = null,
    minorTickSteps: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    needHighPrecision: js.UndefOr[Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    position: java.lang.String = null,
    processData: () => Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    renderFrame: () => Unit = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    segmenter: js.Any = null,
    self: IClass = null,
    setBackground: /* background */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setChart: /* chart */ js.UndefOr[IAbstractChart] => Unit = null,
    setFields: /* fields */ js.UndefOr[Array] => Unit = null,
    setGrid: /* grid */ js.UndefOr[js.Any] => Unit = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Unit = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => Unit = null,
    setLabelInSpan: /* labelInSpan */ js.UndefOr[Boolean] => Unit = null,
    setLayout: /* layout */ js.UndefOr[java.lang.String] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMajorTickSteps: /* majorTickSteps */ js.UndefOr[Double] => Unit = null,
    setMaxZoom: /* maxZoom */ js.UndefOr[Double] => Unit = null,
    setMaximum: /* maximum */ js.UndefOr[Double] => Unit = null,
    setMinZoom: /* minZoom */ js.UndefOr[Double] => Unit = null,
    setMinimum: /* minimum */ js.UndefOr[Double] => Unit = null,
    setMinorTickSteps: /* minorTickSteps */ js.UndefOr[Double] => Unit = null,
    setNeedHighPrecision: /* needHighPrecision */ js.UndefOr[Boolean] => Unit = null,
    setPosition: /* position */ js.UndefOr[java.lang.String] => Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => java.lang.String = null,
    setSegmenter: /* segmenter */ js.UndefOr[java.lang.String] => Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Unit = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Unit = null,
    setTitleMargin: /* titleMargin */ js.UndefOr[Double] => Unit = null,
    setVisibleRange: /* visibleRange */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    style: js.Any = null,
    suspendEvents: () => Unit = null,
    title: js.Any = null,
    titleMargin: Int | Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    visibleRange: Array = null
  ): ICategory = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getChart != null) __obj.updateDynamic("getChart")(js.Any.fromFunction0(getChart))
    if (getCoordFor != null) __obj.updateDynamic("getCoordFor")(js.Any.fromFunction4(getCoordFor))
    if (getFields != null) __obj.updateDynamic("getFields")(js.Any.fromFunction0(getFields))
    if (getGrid != null) __obj.updateDynamic("getGrid")(js.Any.fromFunction0(getGrid))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(js.Any.fromFunction0(getIncrement))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLabelInSpan != null) __obj.updateDynamic("getLabelInSpan")(js.Any.fromFunction0(getLabelInSpan))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMajorTickSteps != null) __obj.updateDynamic("getMajorTickSteps")(js.Any.fromFunction0(getMajorTickSteps))
    if (getMaxZoom != null) __obj.updateDynamic("getMaxZoom")(js.Any.fromFunction0(getMaxZoom))
    if (getMaximum != null) __obj.updateDynamic("getMaximum")(js.Any.fromFunction0(getMaximum))
    if (getMinZoom != null) __obj.updateDynamic("getMinZoom")(js.Any.fromFunction0(getMinZoom))
    if (getMinimum != null) __obj.updateDynamic("getMinimum")(js.Any.fromFunction0(getMinimum))
    if (getMinorTickSteps != null) __obj.updateDynamic("getMinorTickSteps")(js.Any.fromFunction0(getMinorTickSteps))
    if (getNeedHighPrecision != null) __obj.updateDynamic("getNeedHighPrecision")(js.Any.fromFunction0(getNeedHighPrecision))
    if (getPosition != null) __obj.updateDynamic("getPosition")(js.Any.fromFunction0(getPosition))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction0(getRange))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getSegmenter != null) __obj.updateDynamic("getSegmenter")(js.Any.fromFunction0(getSegmenter))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getTitleMargin != null) __obj.updateDynamic("getTitleMargin")(js.Any.fromFunction0(getTitleMargin))
    if (getVisibleRange != null) __obj.updateDynamic("getVisibleRange")(js.Any.fromFunction0(getVisibleRange))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInSpan)) __obj.updateDynamic("labelInSpan")(labelInSpan.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (majorTickSteps != null) __obj.updateDynamic("majorTickSteps")(majorTickSteps.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickSteps != null) __obj.updateDynamic("minorTickSteps")(minorTickSteps.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (!js.isUndefined(needHighPrecision)) __obj.updateDynamic("needHighPrecision")(needHighPrecision.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (processData != null) __obj.updateDynamic("processData")(js.Any.fromFunction0(processData))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(js.Any.fromFunction0(renderFrame))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (segmenter != null) __obj.updateDynamic("segmenter")(segmenter.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1(setChart))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1(setFields))
    if (setGrid != null) __obj.updateDynamic("setGrid")(js.Any.fromFunction1(setGrid))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1(setIncrement))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLabelInSpan != null) __obj.updateDynamic("setLabelInSpan")(js.Any.fromFunction1(setLabelInSpan))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMajorTickSteps != null) __obj.updateDynamic("setMajorTickSteps")(js.Any.fromFunction1(setMajorTickSteps))
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(js.Any.fromFunction1(setMaxZoom))
    if (setMaximum != null) __obj.updateDynamic("setMaximum")(js.Any.fromFunction1(setMaximum))
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(js.Any.fromFunction1(setMinZoom))
    if (setMinimum != null) __obj.updateDynamic("setMinimum")(js.Any.fromFunction1(setMinimum))
    if (setMinorTickSteps != null) __obj.updateDynamic("setMinorTickSteps")(js.Any.fromFunction1(setMinorTickSteps))
    if (setNeedHighPrecision != null) __obj.updateDynamic("setNeedHighPrecision")(js.Any.fromFunction1(setNeedHighPrecision))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction1(setPosition))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(js.Any.fromFunction1(setSegmenter))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setTitleMargin != null) __obj.updateDynamic("setTitleMargin")(js.Any.fromFunction1(setTitleMargin))
    if (setVisibleRange != null) __obj.updateDynamic("setVisibleRange")(js.Any.fromFunction1(setVisibleRange))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleMargin != null) __obj.updateDynamic("titleMargin")(titleMargin.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICategory]
  }
}

