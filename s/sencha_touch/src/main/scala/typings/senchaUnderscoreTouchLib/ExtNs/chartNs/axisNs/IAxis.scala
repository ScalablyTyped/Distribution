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

