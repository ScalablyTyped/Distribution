package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart] = js.undefined
  /** [Config Option] (Array) */
  var fields: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of chart
  		* @returns Ext.chart.AbstractChart
  		*/
  var getChart: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart]] = js.undefined
  /** [Method] Mapping data value into coordinate
  		* @param value *
  		* @param field String
  		* @param idx Number
  		* @param items Ext.util.MixedCollection
  		* @returns Number
  		*/
  var getCoordFor: js.UndefOr[
    js.Function4[
      /* value */ js.UndefOr[js.Any], 
      /* field */ js.UndefOr[java.lang.String], 
      /* idx */ js.UndefOr[scala.Double], 
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  var getFields: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of grid
  		* @returns Object
  		*/
  var getGrid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  var getHidden: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelInSpan
  		* @returns Boolean
  		*/
  var getLabelInSpan: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object|Ext.chart.axis.layout.Layout
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of majorTickSteps
  		* @returns Number
  		*/
  var getMajorTickSteps: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxZoom
  		* @returns Number
  		*/
  var getMaxZoom: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maximum
  		* @returns Number
  		*/
  var getMaximum: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minZoom
  		* @returns Number
  		*/
  var getMinZoom: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minimum
  		* @returns Number
  		*/
  var getMinimum: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minorTickSteps
  		* @returns Number
  		*/
  var getMinorTickSteps: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of needHighPrecision
  		* @returns Boolean
  		*/
  var getNeedHighPrecision: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of position
  		* @returns String
  		*/
  var getPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Get the range derived from all the bound series
  		* @returns Array
  		*/
  var getRange: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of segmenter
  		* @returns Object|Ext.chart.axis.segmenter.Segmenter
  		*/
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String|Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of titleMargin
  		* @returns Number
  		*/
  var getTitleMargin: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of visibleRange
  		* @returns Array
  		*/
  var getVisibleRange: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Object) */
  var grid: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var labelInSpan: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var needHighPrecision: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Invoked when data has changed  */
  var processData: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAxis: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Invokes renderFrame on this axis s surface s  */
  var renderFrame: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of chart
  		* @param chart Ext.chart.AbstractChart The new value.
  		*/
  var setChart: js.UndefOr[
    js.Function1[
      /* chart */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  var setFields: js.UndefOr[
    js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of grid
  		* @param grid Object The new value.
  		*/
  var setGrid: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of labelInSpan
  		* @param labelInSpan Boolean The new value.
  		*/
  var setLabelInSpan: js.UndefOr[js.Function1[/* labelInSpan */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout Object|Ext.chart.axis.layout.Layout The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of majorTickSteps
  		* @param majorTickSteps Number The new value.
  		*/
  var setMajorTickSteps: js.UndefOr[js.Function1[/* majorTickSteps */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxZoom
  		* @param maxZoom Number The new value.
  		*/
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maximum
  		* @param maximum Number The new value.
  		*/
  var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minZoom
  		* @param minZoom Number The new value.
  		*/
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minimum
  		* @param minimum Number The new value.
  		*/
  var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minorTickSteps
  		* @param minorTickSteps Number The new value.
  		*/
  var setMinorTickSteps: js.UndefOr[js.Function1[/* minorTickSteps */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of needHighPrecision
  		* @param needHighPrecision Boolean The new value.
  		*/
  var setNeedHighPrecision: js.UndefOr[js.Function1[/* needHighPrecision */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of position
  		* @param position String The new value.
  		*/
  var setPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns String The label to display.
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Sets the value of segmenter
  		* @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
  		*/
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String|Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of titleMargin
  		* @param titleMargin Number The new value.
  		*/
  var setTitleMargin: js.UndefOr[js.Function1[/* titleMargin */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of visibleRange
  		* @param visibleRange Array The new value.
  		*/
  var setVisibleRange: js.UndefOr[
    js.Function1[/* visibleRange */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String|Object) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var titleMargin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Array) */
  var visibleRange: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
}

object IAxis {
  @scala.inline
  def apply(
    IObservable: senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
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
    background: js.Any = null,
    chart: senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart = null,
    clearListeners: js.Function0[scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    fields: senchaUnderscoreTouchLib.ExtNs.Array = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    getBackground: js.Function0[_] = null,
    getBubbleEvents: js.Function0[_] = null,
    getChart: js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart] = null,
    getCoordFor: js.Function4[
      /* value */ js.UndefOr[js.Any], 
      /* field */ js.UndefOr[java.lang.String], 
      /* idx */ js.UndefOr[scala.Double], 
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection], 
      scala.Double
    ] = null,
    getFields: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getGrid: js.Function0[_] = null,
    getHidden: js.Function0[scala.Boolean] = null,
    getIncrement: js.Function0[scala.Double] = null,
    getLabel: js.Function0[_] = null,
    getLabelInSpan: js.Function0[scala.Boolean] = null,
    getLayout: js.Function0[_] = null,
    getListeners: js.Function0[_] = null,
    getMajorTickSteps: js.Function0[scala.Double] = null,
    getMaxZoom: js.Function0[scala.Double] = null,
    getMaximum: js.Function0[scala.Double] = null,
    getMinZoom: js.Function0[scala.Double] = null,
    getMinimum: js.Function0[scala.Double] = null,
    getMinorTickSteps: js.Function0[scala.Double] = null,
    getNeedHighPrecision: js.Function0[scala.Boolean] = null,
    getPosition: js.Function0[java.lang.String] = null,
    getRange: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getRenderer: js.Function0[_] = null,
    getSegmenter: js.Function0[_] = null,
    getStyle: js.Function0[_] = null,
    getTitle: js.Function0[_] = null,
    getTitleMargin: js.Function0[scala.Double] = null,
    getVisibleRange: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    grid: js.Any = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    increment: scala.Int | scala.Double = null,
    label: js.Any = null,
    labelInSpan: js.UndefOr[scala.Boolean] = js.undefined,
    layout: js.Any = null,
    majorTickSteps: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    minorTickSteps: scala.Int | scala.Double = null,
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
    needHighPrecision: js.UndefOr[scala.Boolean] = js.undefined,
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
    position: java.lang.String = null,
    processData: js.Function0[scala.Unit] = null,
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
    renderFrame: js.Function0[scala.Unit] = null,
    renderer: js.Any = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    segmenter: js.Any = null,
    setBackground: js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setChart: js.Function1[
      /* chart */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart], 
      scala.Unit
    ] = null,
    setFields: js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setGrid: js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit] = null,
    setHidden: js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setIncrement: js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Unit] = null,
    setLabel: js.Function1[/* label */ js.UndefOr[js.Any], scala.Unit] = null,
    setLabelInSpan: js.Function1[/* labelInSpan */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setLayout: js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setMajorTickSteps: js.Function1[/* majorTickSteps */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaxZoom: js.Function1[/* maxZoom */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMaximum: js.Function1[/* maximum */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinZoom: js.Function1[/* minZoom */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinimum: js.Function1[/* minimum */ js.UndefOr[scala.Double], scala.Unit] = null,
    setMinorTickSteps: js.Function1[/* minorTickSteps */ js.UndefOr[scala.Double], scala.Unit] = null,
    setNeedHighPrecision: js.Function1[/* needHighPrecision */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setPosition: js.Function1[/* position */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRenderer: js.Function1[/* renderer */ js.UndefOr[js.Any], java.lang.String] = null,
    setSegmenter: js.Function1[/* segmenter */ js.UndefOr[js.Any], scala.Unit] = null,
    setStyle: js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit] = null,
    setTitleMargin: js.Function1[/* titleMargin */ js.UndefOr[scala.Double], scala.Unit] = null,
    setVisibleRange: js.Function1[/* visibleRange */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    style: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    title: js.Any = null,
    titleMargin: scala.Int | scala.Double = null,
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
    visibleRange: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAxis = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IObservable)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (background != null) __obj.updateDynamic("background")(background)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getBackground != null) __obj.updateDynamic("getBackground")(getBackground)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getChart != null) __obj.updateDynamic("getChart")(getChart)
    if (getCoordFor != null) __obj.updateDynamic("getCoordFor")(getCoordFor)
    if (getFields != null) __obj.updateDynamic("getFields")(getFields)
    if (getGrid != null) __obj.updateDynamic("getGrid")(getGrid)
    if (getHidden != null) __obj.updateDynamic("getHidden")(getHidden)
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(getIncrement)
    if (getLabel != null) __obj.updateDynamic("getLabel")(getLabel)
    if (getLabelInSpan != null) __obj.updateDynamic("getLabelInSpan")(getLabelInSpan)
    if (getLayout != null) __obj.updateDynamic("getLayout")(getLayout)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getMajorTickSteps != null) __obj.updateDynamic("getMajorTickSteps")(getMajorTickSteps)
    if (getMaxZoom != null) __obj.updateDynamic("getMaxZoom")(getMaxZoom)
    if (getMaximum != null) __obj.updateDynamic("getMaximum")(getMaximum)
    if (getMinZoom != null) __obj.updateDynamic("getMinZoom")(getMinZoom)
    if (getMinimum != null) __obj.updateDynamic("getMinimum")(getMinimum)
    if (getMinorTickSteps != null) __obj.updateDynamic("getMinorTickSteps")(getMinorTickSteps)
    if (getNeedHighPrecision != null) __obj.updateDynamic("getNeedHighPrecision")(getNeedHighPrecision)
    if (getPosition != null) __obj.updateDynamic("getPosition")(getPosition)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(getRenderer)
    if (getSegmenter != null) __obj.updateDynamic("getSegmenter")(getSegmenter)
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getTitleMargin != null) __obj.updateDynamic("getTitleMargin")(getTitleMargin)
    if (getVisibleRange != null) __obj.updateDynamic("getVisibleRange")(getVisibleRange)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(labelInSpan)) __obj.updateDynamic("labelInSpan")(labelInSpan)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (majorTickSteps != null) __obj.updateDynamic("majorTickSteps")(majorTickSteps.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickSteps != null) __obj.updateDynamic("minorTickSteps")(minorTickSteps.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (!js.isUndefined(needHighPrecision)) __obj.updateDynamic("needHighPrecision")(needHighPrecision)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (position != null) __obj.updateDynamic("position")(position)
    if (processData != null) __obj.updateDynamic("processData")(processData)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(renderFrame)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (segmenter != null) __obj.updateDynamic("segmenter")(segmenter)
    if (setBackground != null) __obj.updateDynamic("setBackground")(setBackground)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setChart != null) __obj.updateDynamic("setChart")(setChart)
    if (setFields != null) __obj.updateDynamic("setFields")(setFields)
    if (setGrid != null) __obj.updateDynamic("setGrid")(setGrid)
    if (setHidden != null) __obj.updateDynamic("setHidden")(setHidden)
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(setIncrement)
    if (setLabel != null) __obj.updateDynamic("setLabel")(setLabel)
    if (setLabelInSpan != null) __obj.updateDynamic("setLabelInSpan")(setLabelInSpan)
    if (setLayout != null) __obj.updateDynamic("setLayout")(setLayout)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setMajorTickSteps != null) __obj.updateDynamic("setMajorTickSteps")(setMajorTickSteps)
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(setMaxZoom)
    if (setMaximum != null) __obj.updateDynamic("setMaximum")(setMaximum)
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(setMinZoom)
    if (setMinimum != null) __obj.updateDynamic("setMinimum")(setMinimum)
    if (setMinorTickSteps != null) __obj.updateDynamic("setMinorTickSteps")(setMinorTickSteps)
    if (setNeedHighPrecision != null) __obj.updateDynamic("setNeedHighPrecision")(setNeedHighPrecision)
    if (setPosition != null) __obj.updateDynamic("setPosition")(setPosition)
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(setRenderer)
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(setSegmenter)
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setTitleMargin != null) __obj.updateDynamic("setTitleMargin")(setTitleMargin)
    if (setVisibleRange != null) __obj.updateDynamic("setVisibleRange")(setVisibleRange)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleMargin != null) __obj.updateDynamic("titleMargin")(titleMargin.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange)
    __obj.asInstanceOf[IAxis]
  }
}

