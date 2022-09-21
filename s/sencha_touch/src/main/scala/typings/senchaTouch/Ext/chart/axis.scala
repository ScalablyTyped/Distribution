package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.chart.series.ISeries
import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import typings.senchaTouch.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axis {
  
  trait IAxis
    extends StObject
       with IObservable {
    
    /** [Config Option] (Object) */
    var background: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Ext.chart.AbstractChart) */
    var chart: js.UndefOr[IAbstractChart] = js.undefined
    
    /** [Config Option] (Array) */
    var fields: js.UndefOr[Array] = js.undefined
    
    /** [Method] Returns the value of background
      * @returns Object
      */
    var getBackground: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of chart
      * @returns Ext.chart.AbstractChart
      */
    var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.undefined
    
    /** [Method] Mapping data value into coordinate
      * @param value *
      * @param field String
      * @param idx Number
      * @param items Ext.util.MixedCollection
      * @returns Number
      */
    var getCoordFor: js.UndefOr[
        js.Function4[
          /* value */ js.UndefOr[Any], 
          /* field */ js.UndefOr[String], 
          /* idx */ js.UndefOr[Double], 
          /* items */ js.UndefOr[IMixedCollection], 
          Double
        ]
      ] = js.undefined
    
    /** [Method] Returns the value of fields
      * @returns Array
      */
    var getFields: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of grid
      * @returns Object
      */
    var getGrid: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of hidden
      * @returns Boolean
      */
    var getHidden: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of increment
      * @returns Number
      */
    var getIncrement: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of label
      * @returns Object
      */
    var getLabel: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of labelInSpan
      * @returns Boolean
      */
    var getLabelInSpan: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of layout
      * @returns Object|Ext.chart.axis.layout.Layout
      */
    var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of majorTickSteps
      * @returns Number
      */
    var getMajorTickSteps: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of maxZoom
      * @returns Number
      */
    var getMaxZoom: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of maximum
      * @returns Number
      */
    var getMaximum: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of minZoom
      * @returns Number
      */
    var getMinZoom: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of minimum
      * @returns Number
      */
    var getMinimum: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of minorTickSteps
      * @returns Number
      */
    var getMinorTickSteps: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of needHighPrecision
      * @returns Boolean
      */
    var getNeedHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of position
      * @returns String
      */
    var getPosition: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Get the range derived from all the bound series
      * @returns Array
      */
    var getRange: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of renderer
      * @returns Function
      */
    var getRenderer: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of segmenter
      * @returns Object|Ext.chart.axis.segmenter.Segmenter
      */
    var getSegmenter: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of style
      * @returns Object
      */
    var getStyle: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of title
      * @returns String|Object
      */
    var getTitle: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of titleMargin
      * @returns Number
      */
    var getTitleMargin: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of visibleRange
      * @returns Array
      */
    var getVisibleRange: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Config Option] (Object) */
    var grid: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var increment: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var label: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var labelInSpan: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
    var layout: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var majorTickSteps: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minorTickSteps: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Boolean) */
    var needHighPrecision: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var position: js.UndefOr[String] = js.undefined
    
    /** [Method] Invoked when data has changed  */
    var processData: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAxis: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
    
    /** [Method] Invokes renderFrame on this axis s surface s  */
    var renderFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Function) */
    var renderer: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
    var segmenter: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets the value of background
      * @param background Object The new value.
      */
    var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of chart
      * @param chart Ext.chart.AbstractChart The new value.
      */
    var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.undefined
    
    /** [Method] Sets the value of fields
      * @param fields Array The new value.
      */
    var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of grid
      * @param grid Object The new value.
      */
    var setGrid: js.UndefOr[js.Function1[/* grid */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of hidden
      * @param hidden Boolean The new value.
      */
    var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of increment
      * @param increment Number The new value.
      */
    var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of label
      * @param label Object The new value.
      */
    var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of labelInSpan
      * @param labelInSpan Boolean The new value.
      */
    var setLabelInSpan: js.UndefOr[js.Function1[/* labelInSpan */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of layout
      * @param layout Object|Ext.chart.axis.layout.Layout The new value.
      */
    var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of majorTickSteps
      * @param majorTickSteps Number The new value.
      */
    var setMajorTickSteps: js.UndefOr[js.Function1[/* majorTickSteps */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of maxZoom
      * @param maxZoom Number The new value.
      */
    var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of maximum
      * @param maximum Number The new value.
      */
    var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of minZoom
      * @param minZoom Number The new value.
      */
    var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of minimum
      * @param minimum Number The new value.
      */
    var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of minorTickSteps
      * @param minorTickSteps Number The new value.
      */
    var setMinorTickSteps: js.UndefOr[js.Function1[/* minorTickSteps */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of needHighPrecision
      * @param needHighPrecision Boolean The new value.
      */
    var setNeedHighPrecision: js.UndefOr[js.Function1[/* needHighPrecision */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of position
      * @param position String The new value.
      */
    var setPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of renderer
      * @param renderer Function The new value.
      * @returns String The label to display.
      */
    var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[Any], String]] = js.undefined
    
    /** [Method] Sets the value of segmenter
      * @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
      */
    var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of style
      * @param style Object The new value.
      */
    var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of title
      * @param title String|Object The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of titleMargin
      * @param titleMargin Number The new value.
      */
    var setTitleMargin: js.UndefOr[js.Function1[/* titleMargin */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of visibleRange
      * @param visibleRange Array The new value.
      */
    var setVisibleRange: js.UndefOr[js.Function1[/* visibleRange */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String|Object) */
    var title: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var titleMargin: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Array) */
    var visibleRange: js.UndefOr[Array] = js.undefined
  }
  object IAxis {
    
    inline def apply(): IAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAxis]
    }
    
    extension [Self <: IAxis](x: Self) {
      
      inline def setBackground(value: Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setChart(value: IAbstractChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      inline def setFields(value: Array): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setGetBackground(value: () => Any): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
      
      inline def setGetBackgroundUndefined: Self = StObject.set(x, "getBackground", js.undefined)
      
      inline def setGetChart(value: () => IAbstractChart): Self = StObject.set(x, "getChart", js.Any.fromFunction0(value))
      
      inline def setGetChartUndefined: Self = StObject.set(x, "getChart", js.undefined)
      
      inline def setGetCoordFor(
        value: (/* value */ js.UndefOr[Any], /* field */ js.UndefOr[String], /* idx */ js.UndefOr[Double], /* items */ js.UndefOr[IMixedCollection]) => Double
      ): Self = StObject.set(x, "getCoordFor", js.Any.fromFunction4(value))
      
      inline def setGetCoordForUndefined: Self = StObject.set(x, "getCoordFor", js.undefined)
      
      inline def setGetFields(value: () => Array): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      inline def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
      
      inline def setGetGrid(value: () => Any): Self = StObject.set(x, "getGrid", js.Any.fromFunction0(value))
      
      inline def setGetGridUndefined: Self = StObject.set(x, "getGrid", js.undefined)
      
      inline def setGetHidden(value: () => Boolean): Self = StObject.set(x, "getHidden", js.Any.fromFunction0(value))
      
      inline def setGetHiddenUndefined: Self = StObject.set(x, "getHidden", js.undefined)
      
      inline def setGetIncrement(value: () => Double): Self = StObject.set(x, "getIncrement", js.Any.fromFunction0(value))
      
      inline def setGetIncrementUndefined: Self = StObject.set(x, "getIncrement", js.undefined)
      
      inline def setGetLabel(value: () => Any): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelInSpan(value: () => Boolean): Self = StObject.set(x, "getLabelInSpan", js.Any.fromFunction0(value))
      
      inline def setGetLabelInSpanUndefined: Self = StObject.set(x, "getLabelInSpan", js.undefined)
      
      inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
      
      inline def setGetLayout(value: () => Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      inline def setGetMajorTickSteps(value: () => Double): Self = StObject.set(x, "getMajorTickSteps", js.Any.fromFunction0(value))
      
      inline def setGetMajorTickStepsUndefined: Self = StObject.set(x, "getMajorTickSteps", js.undefined)
      
      inline def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
      
      inline def setGetMaxZoomUndefined: Self = StObject.set(x, "getMaxZoom", js.undefined)
      
      inline def setGetMaximum(value: () => Double): Self = StObject.set(x, "getMaximum", js.Any.fromFunction0(value))
      
      inline def setGetMaximumUndefined: Self = StObject.set(x, "getMaximum", js.undefined)
      
      inline def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
      
      inline def setGetMinZoomUndefined: Self = StObject.set(x, "getMinZoom", js.undefined)
      
      inline def setGetMinimum(value: () => Double): Self = StObject.set(x, "getMinimum", js.Any.fromFunction0(value))
      
      inline def setGetMinimumUndefined: Self = StObject.set(x, "getMinimum", js.undefined)
      
      inline def setGetMinorTickSteps(value: () => Double): Self = StObject.set(x, "getMinorTickSteps", js.Any.fromFunction0(value))
      
      inline def setGetMinorTickStepsUndefined: Self = StObject.set(x, "getMinorTickSteps", js.undefined)
      
      inline def setGetNeedHighPrecision(value: () => Boolean): Self = StObject.set(x, "getNeedHighPrecision", js.Any.fromFunction0(value))
      
      inline def setGetNeedHighPrecisionUndefined: Self = StObject.set(x, "getNeedHighPrecision", js.undefined)
      
      inline def setGetPosition(value: () => String): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      inline def setGetPositionUndefined: Self = StObject.set(x, "getPosition", js.undefined)
      
      inline def setGetRange(value: () => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction0(value))
      
      inline def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
      
      inline def setGetRenderer(value: () => Any): Self = StObject.set(x, "getRenderer", js.Any.fromFunction0(value))
      
      inline def setGetRendererUndefined: Self = StObject.set(x, "getRenderer", js.undefined)
      
      inline def setGetSegmenter(value: () => Any): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
      
      inline def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
      
      inline def setGetStyle(value: () => Any): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
      
      inline def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
      
      inline def setGetTitle(value: () => Any): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetTitleMargin(value: () => Double): Self = StObject.set(x, "getTitleMargin", js.Any.fromFunction0(value))
      
      inline def setGetTitleMarginUndefined: Self = StObject.set(x, "getTitleMargin", js.undefined)
      
      inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      inline def setGetVisibleRange(value: () => Array): Self = StObject.set(x, "getVisibleRange", js.Any.fromFunction0(value))
      
      inline def setGetVisibleRangeUndefined: Self = StObject.set(x, "getVisibleRange", js.undefined)
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelInSpan(value: Boolean): Self = StObject.set(x, "labelInSpan", value.asInstanceOf[js.Any])
      
      inline def setLabelInSpanUndefined: Self = StObject.set(x, "labelInSpan", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMajorTickSteps(value: Double): Self = StObject.set(x, "majorTickSteps", value.asInstanceOf[js.Any])
      
      inline def setMajorTickStepsUndefined: Self = StObject.set(x, "majorTickSteps", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMinorTickSteps(value: Double): Self = StObject.set(x, "minorTickSteps", value.asInstanceOf[js.Any])
      
      inline def setMinorTickStepsUndefined: Self = StObject.set(x, "minorTickSteps", js.undefined)
      
      inline def setNeedHighPrecision(value: Boolean): Self = StObject.set(x, "needHighPrecision", value.asInstanceOf[js.Any])
      
      inline def setNeedHighPrecisionUndefined: Self = StObject.set(x, "needHighPrecision", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProcessData(value: () => Unit): Self = StObject.set(x, "processData", js.Any.fromFunction0(value))
      
      inline def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setRenderFrame(value: () => Unit): Self = StObject.set(x, "renderFrame", js.Any.fromFunction0(value))
      
      inline def setRenderFrameUndefined: Self = StObject.set(x, "renderFrame", js.undefined)
      
      inline def setRenderer(value: Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setSegmenter(value: Any): Self = StObject.set(x, "segmenter", value.asInstanceOf[js.Any])
      
      inline def setSegmenterUndefined: Self = StObject.set(x, "segmenter", js.undefined)
      
      inline def setSetBackground(value: /* background */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBackground", js.Any.fromFunction1(value))
      
      inline def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
      
      inline def setSetChart(value: /* chart */ js.UndefOr[IAbstractChart] => Unit): Self = StObject.set(x, "setChart", js.Any.fromFunction1(value))
      
      inline def setSetChartUndefined: Self = StObject.set(x, "setChart", js.undefined)
      
      inline def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
      
      inline def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
      
      inline def setSetGrid(value: /* grid */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setGrid", js.Any.fromFunction1(value))
      
      inline def setSetGridUndefined: Self = StObject.set(x, "setGrid", js.undefined)
      
      inline def setSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHidden", js.Any.fromFunction1(value))
      
      inline def setSetHiddenUndefined: Self = StObject.set(x, "setHidden", js.undefined)
      
      inline def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIncrement", js.Any.fromFunction1(value))
      
      inline def setSetIncrementUndefined: Self = StObject.set(x, "setIncrement", js.undefined)
      
      inline def setSetLabel(value: /* label */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
      
      inline def setSetLabelInSpan(value: /* labelInSpan */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setLabelInSpan", js.Any.fromFunction1(value))
      
      inline def setSetLabelInSpanUndefined: Self = StObject.set(x, "setLabelInSpan", js.undefined)
      
      inline def setSetLabelUndefined: Self = StObject.set(x, "setLabel", js.undefined)
      
      inline def setSetLayout(value: /* layout */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
      
      inline def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
      
      inline def setSetMajorTickSteps(value: /* majorTickSteps */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMajorTickSteps", js.Any.fromFunction1(value))
      
      inline def setSetMajorTickStepsUndefined: Self = StObject.set(x, "setMajorTickSteps", js.undefined)
      
      inline def setSetMaxZoom(value: /* maxZoom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxZoom", js.Any.fromFunction1(value))
      
      inline def setSetMaxZoomUndefined: Self = StObject.set(x, "setMaxZoom", js.undefined)
      
      inline def setSetMaximum(value: /* maximum */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaximum", js.Any.fromFunction1(value))
      
      inline def setSetMaximumUndefined: Self = StObject.set(x, "setMaximum", js.undefined)
      
      inline def setSetMinZoom(value: /* minZoom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinZoom", js.Any.fromFunction1(value))
      
      inline def setSetMinZoomUndefined: Self = StObject.set(x, "setMinZoom", js.undefined)
      
      inline def setSetMinimum(value: /* minimum */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinimum", js.Any.fromFunction1(value))
      
      inline def setSetMinimumUndefined: Self = StObject.set(x, "setMinimum", js.undefined)
      
      inline def setSetMinorTickSteps(value: /* minorTickSteps */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinorTickSteps", js.Any.fromFunction1(value))
      
      inline def setSetMinorTickStepsUndefined: Self = StObject.set(x, "setMinorTickSteps", js.undefined)
      
      inline def setSetNeedHighPrecision(value: /* needHighPrecision */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setNeedHighPrecision", js.Any.fromFunction1(value))
      
      inline def setSetNeedHighPrecisionUndefined: Self = StObject.set(x, "setNeedHighPrecision", js.undefined)
      
      inline def setSetPosition(value: /* position */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      inline def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
      
      inline def setSetRenderer(value: /* renderer */ js.UndefOr[Any] => String): Self = StObject.set(x, "setRenderer", js.Any.fromFunction1(value))
      
      inline def setSetRendererUndefined: Self = StObject.set(x, "setRenderer", js.undefined)
      
      inline def setSetSegmenter(value: /* segmenter */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
      
      inline def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
      
      inline def setSetStyle(value: /* style */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      inline def setSetTitle(value: /* title */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      inline def setSetTitleMargin(value: /* titleMargin */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTitleMargin", js.Any.fromFunction1(value))
      
      inline def setSetTitleMarginUndefined: Self = StObject.set(x, "setTitleMargin", js.undefined)
      
      inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      inline def setSetVisibleRange(value: /* visibleRange */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setVisibleRange", js.Any.fromFunction1(value))
      
      inline def setSetVisibleRangeUndefined: Self = StObject.set(x, "setVisibleRange", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleMargin(value: Double): Self = StObject.set(x, "titleMargin", value.asInstanceOf[js.Any])
      
      inline def setTitleMarginUndefined: Self = StObject.set(x, "titleMargin", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisibleRange(value: Array): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
      
      inline def setVisibleRangeUndefined: Self = StObject.set(x, "visibleRange", js.undefined)
    }
  }
  
  trait ICategory
    extends StObject
       with IAxis {
    
    /** [Method] Returns the value of layout
      * @returns String
      */
    @JSName("getLayout")
    var getLayout_ICategory: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of segmenter
      * @returns String
      */
    @JSName("getSegmenter")
    var getSegmenter_ICategory: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Sets the value of layout
      * @param layout String The new value.
      */
    @JSName("setLayout")
    var setLayout_ICategory: js.UndefOr[js.Function1[/* layout */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of segmenter
      * @param segmenter String The new value.
      */
    @JSName("setSegmenter")
    var setSegmenter_ICategory: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[String], Unit]] = js.undefined
  }
  object ICategory {
    
    inline def apply(): ICategory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICategory]
    }
    
    extension [Self <: ICategory](x: Self) {
      
      inline def setGetLayout(value: () => String): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      inline def setGetSegmenter(value: () => String): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
      
      inline def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
      
      inline def setSetLayout(value: /* layout */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
      
      inline def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
      
      inline def setSetSegmenter(value: /* segmenter */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
      
      inline def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
    }
  }
  
  trait INumeric
    extends StObject
       with IAxis {
    
    /** [Method] Returns the value of aggregator
      * @returns String
      */
    var getAggregator: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of layout
      * @returns String
      */
    @JSName("getLayout")
    var getLayout_INumeric: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of segmenter
      * @returns String
      */
    @JSName("getSegmenter")
    var getSegmenter_INumeric: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Sets the value of aggregator
      * @param aggregator String The new value.
      */
    var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of layout
      * @param layout String The new value.
      */
    @JSName("setLayout")
    var setLayout_INumeric: js.UndefOr[js.Function1[/* layout */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of segmenter
      * @param segmenter String The new value.
      */
    @JSName("setSegmenter")
    var setSegmenter_INumeric: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[String], Unit]] = js.undefined
  }
  object INumeric {
    
    inline def apply(): INumeric = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INumeric]
    }
    
    extension [Self <: INumeric](x: Self) {
      
      inline def setGetAggregator(value: () => String): Self = StObject.set(x, "getAggregator", js.Any.fromFunction0(value))
      
      inline def setGetAggregatorUndefined: Self = StObject.set(x, "getAggregator", js.undefined)
      
      inline def setGetLayout(value: () => String): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      inline def setGetSegmenter(value: () => String): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
      
      inline def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
      
      inline def setSetAggregator(value: /* aggregator */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAggregator", js.Any.fromFunction1(value))
      
      inline def setSetAggregatorUndefined: Self = StObject.set(x, "setAggregator", js.undefined)
      
      inline def setSetLayout(value: /* layout */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
      
      inline def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
      
      inline def setSetSegmenter(value: /* segmenter */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
      
      inline def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
    }
  }
  
  trait ITime
    extends StObject
       with INumeric {
    
    /** [Config Option] (Boolean) */
    var calculateByLabelSize: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String/Boolean) */
    var dateFormat: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Date) */
    var fromDate: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of calculateByLabelSize
      * @returns Boolean
      */
    var getCalculateByLabelSize: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Mapping data value into coordinate
      * @param value Object
      * @returns Number
      */
    @JSName("getCoordFor")
    var getCoordFor_ITime: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Double]] = js.undefined
    
    /** [Method] Returns the value of dateFormat
      * @returns String/Boolean
      */
    var getDateFormat: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of fromDate
      * @returns Date
      */
    var getFromDate: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of step
      * @returns Array
      */
    var getStep: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of toDate
      * @returns Date
      */
    var getToDate: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Sets the value of calculateByLabelSize
      * @param calculateByLabelSize Boolean The new value.
      */
    var setCalculateByLabelSize: js.UndefOr[js.Function1[/* calculateByLabelSize */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of dateFormat
      * @param dateFormat String/Boolean The new value.
      */
    var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of fromDate
      * @param fromDate Date The new value.
      */
    var setFromDate: js.UndefOr[js.Function1[/* fromDate */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of step
      * @param step Array The new value.
      */
    var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of toDate
      * @param toDate Date The new value.
      */
    var setToDate: js.UndefOr[js.Function1[/* toDate */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Array) */
    var step: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Date) */
    var toDate: js.UndefOr[Any] = js.undefined
  }
  object ITime {
    
    inline def apply(): ITime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITime]
    }
    
    extension [Self <: ITime](x: Self) {
      
      inline def setCalculateByLabelSize(value: Boolean): Self = StObject.set(x, "calculateByLabelSize", value.asInstanceOf[js.Any])
      
      inline def setCalculateByLabelSizeUndefined: Self = StObject.set(x, "calculateByLabelSize", js.undefined)
      
      inline def setDateFormat(value: Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setFromDate(value: Any): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
      
      inline def setGetCalculateByLabelSize(value: () => Boolean): Self = StObject.set(x, "getCalculateByLabelSize", js.Any.fromFunction0(value))
      
      inline def setGetCalculateByLabelSizeUndefined: Self = StObject.set(x, "getCalculateByLabelSize", js.undefined)
      
      inline def setGetCoordFor(value: /* value */ js.UndefOr[Any] => Double): Self = StObject.set(x, "getCoordFor", js.Any.fromFunction1(value))
      
      inline def setGetCoordForUndefined: Self = StObject.set(x, "getCoordFor", js.undefined)
      
      inline def setGetDateFormat(value: () => Any): Self = StObject.set(x, "getDateFormat", js.Any.fromFunction0(value))
      
      inline def setGetDateFormatUndefined: Self = StObject.set(x, "getDateFormat", js.undefined)
      
      inline def setGetFromDate(value: () => Any): Self = StObject.set(x, "getFromDate", js.Any.fromFunction0(value))
      
      inline def setGetFromDateUndefined: Self = StObject.set(x, "getFromDate", js.undefined)
      
      inline def setGetStep(value: () => Array): Self = StObject.set(x, "getStep", js.Any.fromFunction0(value))
      
      inline def setGetStepUndefined: Self = StObject.set(x, "getStep", js.undefined)
      
      inline def setGetToDate(value: () => Any): Self = StObject.set(x, "getToDate", js.Any.fromFunction0(value))
      
      inline def setGetToDateUndefined: Self = StObject.set(x, "getToDate", js.undefined)
      
      inline def setSetCalculateByLabelSize(value: /* calculateByLabelSize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setCalculateByLabelSize", js.Any.fromFunction1(value))
      
      inline def setSetCalculateByLabelSizeUndefined: Self = StObject.set(x, "setCalculateByLabelSize", js.undefined)
      
      inline def setSetDateFormat(value: /* dateFormat */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setDateFormat", js.Any.fromFunction1(value))
      
      inline def setSetDateFormatUndefined: Self = StObject.set(x, "setDateFormat", js.undefined)
      
      inline def setSetFromDate(value: /* fromDate */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setFromDate", js.Any.fromFunction1(value))
      
      inline def setSetFromDateUndefined: Self = StObject.set(x, "setFromDate", js.undefined)
      
      inline def setSetStep(value: /* step */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setStep", js.Any.fromFunction1(value))
      
      inline def setSetStepUndefined: Self = StObject.set(x, "setStep", js.undefined)
      
      inline def setSetToDate(value: /* toDate */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setToDate", js.Any.fromFunction1(value))
      
      inline def setSetToDateUndefined: Self = StObject.set(x, "setToDate", js.undefined)
      
      inline def setStep(value: Array): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setToDate(value: Any): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    }
  }
  
  object layout {
    
    type ICombineDuplicate = IDiscrete
    
    trait IContinuous
      extends StObject
         with ILayout {
      
      /** [Method] Returns the value of adjustMaximumByMajorUnit
        * @returns Boolean
        */
      var getAdjustMaximumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Returns the value of adjustMinimumByMajorUnit
        * @returns Boolean
        */
      var getAdjustMinimumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Sets the value of adjustMaximumByMajorUnit
        * @param adjustMaximumByMajorUnit Boolean The new value.
        */
      var setAdjustMaximumByMajorUnit: js.UndefOr[js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.undefined
      
      /** [Method] Sets the value of adjustMinimumByMajorUnit
        * @param adjustMinimumByMajorUnit Boolean The new value.
        */
      var setAdjustMinimumByMajorUnit: js.UndefOr[js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.undefined
      
      /** [Method] Snaps the data bound to the axis to meaningful tick marks
        * @param context Object
        * @param min Object
        * @param max Object
        * @param estStepSize Object
        */
      @JSName("snapEnds")
      var snapEnds_IContinuous: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[Any], 
              /* min */ js.UndefOr[Any], 
              /* max */ js.UndefOr[Any], 
              /* estStepSize */ js.UndefOr[Any], 
              Unit
            ]
          ] = js.undefined
    }
    object IContinuous {
      
      inline def apply(): IContinuous = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IContinuous]
      }
      
      extension [Self <: IContinuous](x: Self) {
        
        inline def setGetAdjustMaximumByMajorUnit(value: () => Boolean): Self = StObject.set(x, "getAdjustMaximumByMajorUnit", js.Any.fromFunction0(value))
        
        inline def setGetAdjustMaximumByMajorUnitUndefined: Self = StObject.set(x, "getAdjustMaximumByMajorUnit", js.undefined)
        
        inline def setGetAdjustMinimumByMajorUnit(value: () => Boolean): Self = StObject.set(x, "getAdjustMinimumByMajorUnit", js.Any.fromFunction0(value))
        
        inline def setGetAdjustMinimumByMajorUnitUndefined: Self = StObject.set(x, "getAdjustMinimumByMajorUnit", js.undefined)
        
        inline def setSetAdjustMaximumByMajorUnit(value: /* adjustMaximumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAdjustMaximumByMajorUnit", js.Any.fromFunction1(value))
        
        inline def setSetAdjustMaximumByMajorUnitUndefined: Self = StObject.set(x, "setAdjustMaximumByMajorUnit", js.undefined)
        
        inline def setSetAdjustMinimumByMajorUnit(value: /* adjustMinimumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAdjustMinimumByMajorUnit", js.Any.fromFunction1(value))
        
        inline def setSetAdjustMinimumByMajorUnitUndefined: Self = StObject.set(x, "setAdjustMinimumByMajorUnit", js.undefined)
        
        inline def setSnapEnds(
          value: (/* context */ js.UndefOr[Any], /* min */ js.UndefOr[Any], /* max */ js.UndefOr[Any], /* estStepSize */ js.UndefOr[Any]) => Unit
        ): Self = StObject.set(x, "snapEnds", js.Any.fromFunction4(value))
        
        inline def setSnapEndsUndefined: Self = StObject.set(x, "snapEnds", js.undefined)
      }
    }
    
    trait IDiscrete
      extends StObject
         with ILayout {
      
      /** [Method] Processes the data of the series bound to the axis  */
      @JSName("processData")
      var processData_IDiscrete: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /** [Method] Snaps the data bound to the axis to meaningful tick marks
        * @param context Object
        * @param min Object
        * @param max Object
        * @param estStepSize Object
        */
      @JSName("snapEnds")
      var snapEnds_IDiscrete: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[Any], 
              /* min */ js.UndefOr[Any], 
              /* max */ js.UndefOr[Any], 
              /* estStepSize */ js.UndefOr[Any], 
              Unit
            ]
          ] = js.undefined
      
      /** [Method] Trims the layout of the axis by the defined minimum and maximum
        * @param context Object
        * @param out Object
        * @param trimMin Object
        * @param trimMax Object
        */
      @JSName("trimByRange")
      var trimByRange_IDiscrete: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[Any], 
              /* out */ js.UndefOr[Any], 
              /* trimMin */ js.UndefOr[Any], 
              /* trimMax */ js.UndefOr[Any], 
              Unit
            ]
          ] = js.undefined
    }
    object IDiscrete {
      
      inline def apply(): IDiscrete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDiscrete]
      }
      
      extension [Self <: IDiscrete](x: Self) {
        
        inline def setProcessData(value: () => Unit): Self = StObject.set(x, "processData", js.Any.fromFunction0(value))
        
        inline def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
        
        inline def setSnapEnds(
          value: (/* context */ js.UndefOr[Any], /* min */ js.UndefOr[Any], /* max */ js.UndefOr[Any], /* estStepSize */ js.UndefOr[Any]) => Unit
        ): Self = StObject.set(x, "snapEnds", js.Any.fromFunction4(value))
        
        inline def setSnapEndsUndefined: Self = StObject.set(x, "snapEnds", js.undefined)
        
        inline def setTrimByRange(
          value: (/* context */ js.UndefOr[Any], /* out */ js.UndefOr[Any], /* trimMin */ js.UndefOr[Any], /* trimMax */ js.UndefOr[Any]) => Unit
        ): Self = StObject.set(x, "trimByRange", js.Any.fromFunction4(value))
        
        inline def setTrimByRangeUndefined: Self = StObject.set(x, "trimByRange", js.undefined)
      }
    }
    
    trait ILayout
      extends StObject
         with IBase {
      
      /** [Config Option] (Ext.chart.axis.Axis) */
      var axis: js.UndefOr[IAxis] = js.undefined
      
      /** [Method] Calculates the position of tick marks for the axis
        * @param context Object
        * @returns *
        */
      var calculateLayout: js.UndefOr[js.Function1[/* context */ js.UndefOr[Any], Any]] = js.undefined
      
      /** [Method] Calculates the position of major ticks for the axis
        * @param context Object
        */
      var calculateMajorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Calculates the position of sub ticks for the axis
        * @param context Object
        */
      var calculateMinorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Returns the value of axis
        * @returns Ext.chart.axis.Axis
        */
      var getAxis: js.UndefOr[js.Function0[IAxis]] = js.undefined
      
      /** [Method] Processes the data of the series bound to the axis
        * @param series Ext.chart.series.Series The bound series.
        */
      var processData: js.UndefOr[js.Function1[/* series */ js.UndefOr[ISeries], Unit]] = js.undefined
      
      /** [Method] Sets the value of axis
        * @param axis Ext.chart.axis.Axis The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.undefined
      
      /** [Method] Snaps the data bound to the axis to meaningful tick marks
        * @param context Object
        * @param min Number
        * @param max Number
        * @param estStepSize Number
        */
      var snapEnds: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[Any], 
              /* min */ js.UndefOr[Double], 
              /* max */ js.UndefOr[Double], 
              /* estStepSize */ js.UndefOr[Double], 
              Unit
            ]
          ] = js.undefined
      
      /** [Method] Trims the layout of the axis by the defined minimum and maximum
        * @param context Object
        * @param out Object
        * @param trimMin Number
        * @param trimMax Number
        */
      var trimByRange: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[Any], 
              /* out */ js.UndefOr[Any], 
              /* trimMin */ js.UndefOr[Double], 
              /* trimMax */ js.UndefOr[Double], 
              Unit
            ]
          ] = js.undefined
    }
    object ILayout {
      
      inline def apply(): ILayout = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILayout]
      }
      
      extension [Self <: ILayout](x: Self) {
        
        inline def setAxis(value: IAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        inline def setCalculateLayout(value: /* context */ js.UndefOr[Any] => Any): Self = StObject.set(x, "calculateLayout", js.Any.fromFunction1(value))
        
        inline def setCalculateLayoutUndefined: Self = StObject.set(x, "calculateLayout", js.undefined)
        
        inline def setCalculateMajorTicks(value: /* context */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculateMajorTicks", js.Any.fromFunction1(value))
        
        inline def setCalculateMajorTicksUndefined: Self = StObject.set(x, "calculateMajorTicks", js.undefined)
        
        inline def setCalculateMinorTicks(value: /* context */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculateMinorTicks", js.Any.fromFunction1(value))
        
        inline def setCalculateMinorTicksUndefined: Self = StObject.set(x, "calculateMinorTicks", js.undefined)
        
        inline def setGetAxis(value: () => IAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        inline def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        inline def setProcessData(value: /* series */ js.UndefOr[ISeries] => Unit): Self = StObject.set(x, "processData", js.Any.fromFunction1(value))
        
        inline def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
        
        inline def setSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        inline def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
        
        inline def setSnapEnds(
          value: (/* context */ js.UndefOr[Any], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStepSize */ js.UndefOr[Double]) => Unit
        ): Self = StObject.set(x, "snapEnds", js.Any.fromFunction4(value))
        
        inline def setSnapEndsUndefined: Self = StObject.set(x, "snapEnds", js.undefined)
        
        inline def setTrimByRange(
          value: (/* context */ js.UndefOr[Any], /* out */ js.UndefOr[Any], /* trimMin */ js.UndefOr[Double], /* trimMax */ js.UndefOr[Double]) => Unit
        ): Self = StObject.set(x, "trimByRange", js.Any.fromFunction4(value))
        
        inline def setTrimByRangeUndefined: Self = StObject.set(x, "trimByRange", js.undefined)
      }
    }
  }
  
  object segmenter {
    
    trait INames
      extends StObject
         with ISegmenter {
      
      /** [Method] Add step units to the value
        * @param value Object
        * @param step Object
        * @param unit Object
        */
      @JSName("add")
      var add_INames: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Any], 
              /* unit */ js.UndefOr[Any], 
              Unit
            ]
          ] = js.undefined
      
      /** [Method] Align value with step of units
        * @param value Object
        * @param step Object
        * @param unit Object
        * @returns * Aligned value.
        */
      @JSName("align")
      var align_INames: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Any], 
              /* unit */ js.UndefOr[Any], 
              Any
            ]
          ] = js.undefined
      
      /** [Method] Given a start point and estimated step size of a range determine the preferred step size
        * @param min Object
        * @param estStepSize Object
        * @param minIdx Object
        * @param data Object
        * @returns Object Return the step size by an object of step x unit.
        */
      @JSName("preferredStep")
      var preferredStep_INames: js.UndefOr[
            js.Function4[
              /* min */ js.UndefOr[Any], 
              /* estStepSize */ js.UndefOr[Any], 
              /* minIdx */ js.UndefOr[Any], 
              /* data */ js.UndefOr[Any], 
              Any
            ]
          ] = js.undefined
    }
    object INames {
      
      inline def apply(): INames = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[INames]
      }
      
      extension [Self <: INames](x: Self) {
        
        inline def setAdd(
          value: (/* value */ js.UndefOr[Any], /* step */ js.UndefOr[Any], /* unit */ js.UndefOr[Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        inline def setAlign(
          value: (/* value */ js.UndefOr[Any], /* step */ js.UndefOr[Any], /* unit */ js.UndefOr[Any]) => Any
        ): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setPreferredStep(
          value: (/* min */ js.UndefOr[Any], /* estStepSize */ js.UndefOr[Any], /* minIdx */ js.UndefOr[Any], /* data */ js.UndefOr[Any]) => Any
        ): Self = StObject.set(x, "preferredStep", js.Any.fromFunction4(value))
        
        inline def setPreferredStepUndefined: Self = StObject.set(x, "preferredStep", js.undefined)
      }
    }
    
    trait INumeric
      extends StObject
         with ISegmenter {
      
      /** [Method] Add step units to the value
        * @param value Object
        * @param step Object
        * @param unit Object
        */
      @JSName("add")
      var add_INumeric: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Any], 
              /* unit */ js.UndefOr[Any], 
              Unit
            ]
          ] = js.undefined
      
      /** [Method] Align value with step of units
        * @param value Object
        * @param step Object
        * @param unit Object
        * @returns * Aligned value.
        */
      @JSName("align")
      var align_INumeric: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Any], 
              /* unit */ js.UndefOr[Any], 
              Any
            ]
          ] = js.undefined
      
      /** [Method] Wraps the provided estimated step size of a range without altering it into a step size object
        * @param start * The start point of range.
        * @param estStepSize * The estimated step size.
        * @returns Object Return the step size by an object of step x unit.
        */
      var exactStep: js.UndefOr[
            js.Function2[/* start */ js.UndefOr[Any], /* estStepSize */ js.UndefOr[Any], Any]
          ] = js.undefined
    }
    object INumeric {
      
      inline def apply(): typings.senchaTouch.Ext.chart.axis.segmenter.INumeric = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.chart.axis.segmenter.INumeric]
      }
      
      extension [Self <: typings.senchaTouch.Ext.chart.axis.segmenter.INumeric](x: Self) {
        
        inline def setAdd(
          value: (/* value */ js.UndefOr[Any], /* step */ js.UndefOr[Any], /* unit */ js.UndefOr[Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        inline def setAlign(
          value: (/* value */ js.UndefOr[Any], /* step */ js.UndefOr[Any], /* unit */ js.UndefOr[Any]) => Any
        ): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setExactStep(value: (/* start */ js.UndefOr[Any], /* estStepSize */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "exactStep", js.Any.fromFunction2(value))
        
        inline def setExactStepUndefined: Self = StObject.set(x, "exactStep", js.undefined)
      }
    }
    
    trait ISegmenter
      extends StObject
         with IBase {
      
      /** [Method] Add step units to the value
        * @param value * The value to be added.
        * @param step Number The step of units. Negative value are allowed.
        * @param unit * The unit.
        */
      var add: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Double], 
              /* unit */ js.UndefOr[Any], 
              Unit
            ]
          ] = js.undefined
      
      /** [Method] Align value with step of units
        * @param value * The value to be aligned.
        * @param step Number The step of units.
        * @param unit * The unit.
        * @returns * Aligned value.
        */
      var align: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Double], 
              /* unit */ js.UndefOr[Any], 
              Any
            ]
          ] = js.undefined
      
      /** [Config Option] (Ext.chart.axis.Axis) */
      var axis: js.UndefOr[IAxis] = js.undefined
      
      /** [Method] Returns the difference between the min and max value based on the given unit scale
        * @param min * The smaller value.
        * @param max * The larger value.
        * @param unit * The unit scale. Unit can be any type.
        * @returns Number The number of units between min and max. It is the minimum n that min + n * unit >= max.
        */
      var diff: js.UndefOr[
            js.Function3[
              /* min */ js.UndefOr[Any], 
              /* max */ js.UndefOr[Any], 
              /* unit */ js.UndefOr[Any], 
              Double
            ]
          ] = js.undefined
      
      /** [Method] Convert from any data into the target type
        * @param value * The value to convert from
        * @returns * The converted value.
        */
      var from: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Any]] = js.undefined
      
      /** [Method] Returns the value of axis
        * @returns Ext.chart.axis.Axis
        */
      var getAxis: js.UndefOr[js.Function0[IAxis]] = js.undefined
      
      /** [Method] Given a start point and estimated step size of a range determine the preferred step size
        * @param start * The start point of range.
        * @param estStepSize * The estimated step size.
        * @returns Object Return the step size by an object of step x unit.
        */
      var preferredStep: js.UndefOr[
            js.Function2[/* start */ js.UndefOr[Any], /* estStepSize */ js.UndefOr[Any], Any]
          ] = js.undefined
      
      /** [Method] This method formats the value
        * @param value * The value to format.
        * @param context Object Axis layout context.
        * @returns String
        */
      var renderer: js.UndefOr[js.Function2[/* value */ js.UndefOr[Any], /* context */ js.UndefOr[Any], String]] = js.undefined
      
      /** [Method] Sets the value of axis
        * @param axis Ext.chart.axis.Axis The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.undefined
    }
    object ISegmenter {
      
      inline def apply(): ISegmenter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISegmenter]
      }
      
      extension [Self <: ISegmenter](x: Self) {
        
        inline def setAdd(
          value: (/* value */ js.UndefOr[Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        inline def setAlign(
          value: (/* value */ js.UndefOr[Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[Any]) => Any
        ): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setAxis(value: IAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        inline def setDiff(
          value: (/* min */ js.UndefOr[Any], /* max */ js.UndefOr[Any], /* unit */ js.UndefOr[Any]) => Double
        ): Self = StObject.set(x, "diff", js.Any.fromFunction3(value))
        
        inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
        
        inline def setFrom(value: /* value */ js.UndefOr[Any] => Any): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
        
        inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        inline def setGetAxis(value: () => IAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        inline def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        inline def setPreferredStep(value: (/* start */ js.UndefOr[Any], /* estStepSize */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "preferredStep", js.Any.fromFunction2(value))
        
        inline def setPreferredStepUndefined: Self = StObject.set(x, "preferredStep", js.undefined)
        
        inline def setRenderer(value: (/* value */ js.UndefOr[Any], /* context */ js.UndefOr[Any]) => String): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        inline def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
      }
    }
    
    trait ITime
      extends StObject
         with ISegmenter {
      
      /** [Method] Add step units to the value
        * @param value Object
        * @param step Object
        * @param unit Object
        */
      @JSName("add")
      var add_ITime: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Any], 
              /* unit */ js.UndefOr[Any], 
              Unit
            ]
          ] = js.undefined
      
      /** [Method] Align value with step of units
        * @param date Object
        * @param step Object
        * @param unit Object
        * @returns * Aligned value.
        */
      @JSName("align")
      var align_ITime: js.UndefOr[
            js.Function3[
              /* date */ js.UndefOr[Any], 
              /* step */ js.UndefOr[Any], 
              /* unit */ js.UndefOr[Any], 
              Any
            ]
          ] = js.undefined
      
      /** [Method] Returns the value of step
        * @returns Object
        */
      var getStep: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Sets the value of step
        * @param step Object The new value.
        */
      var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Config Option] (Object) */
      var step: js.UndefOr[Any] = js.undefined
    }
    object ITime {
      
      inline def apply(): typings.senchaTouch.Ext.chart.axis.segmenter.ITime = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.chart.axis.segmenter.ITime]
      }
      
      extension [Self <: typings.senchaTouch.Ext.chart.axis.segmenter.ITime](x: Self) {
        
        inline def setAdd(
          value: (/* value */ js.UndefOr[Any], /* step */ js.UndefOr[Any], /* unit */ js.UndefOr[Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        inline def setAlign(value: (/* date */ js.UndefOr[Any], /* step */ js.UndefOr[Any], /* unit */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setGetStep(value: () => Any): Self = StObject.set(x, "getStep", js.Any.fromFunction0(value))
        
        inline def setGetStepUndefined: Self = StObject.set(x, "getStep", js.undefined)
        
        inline def setSetStep(value: /* step */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setStep", js.Any.fromFunction1(value))
        
        inline def setSetStepUndefined: Self = StObject.set(x, "setStep", js.undefined)
        
        inline def setStep(value: Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      }
    }
  }
  
  object sprite {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.senchaTouch.Ext.IClass because Already inherited
    - typings.senchaTouch.Ext.IBase because Already inherited
    - typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IAxis
      extends StObject
         with ISprite {
      
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
      var getLabel: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of layout
        * @returns Object|Ext.chart.axis.layout.Layout
        */
      var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of renderer
        * @returns Function
        */
      var getRenderer: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of segmenter
        * @returns Object|Ext.chart.axis.segmenter.Segmenter
        */
      var getSegmenter: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Config Option] (Boolean) */
      var grid: js.UndefOr[Boolean] = js.undefined
      
      /** [Config Option] (Object) */
      var label: js.UndefOr[Any] = js.undefined
      
      /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
      var layout: js.UndefOr[Any] = js.undefined
      
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
              /* surface */ js.UndefOr[Any], 
              /* ctx */ js.UndefOr[Any], 
              /* clipRegion */ js.UndefOr[Any], 
              Any
            ]
          ] = js.undefined
      
      /** [Config Option] (Function) */
      var renderer: js.UndefOr[Any] = js.undefined
      
      /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
      var segmenter: js.UndefOr[Any] = js.undefined
      
      /** [Method] Sets the value of axis
        * @param axis Ext.chart.axis.Axis The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[this.type], Unit]] = js.undefined
      
      /** [Method] Sets the value of label
        * @param label Object The new value.
        */
      var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of layout
        * @param layout Object|Ext.chart.axis.layout.Layout The new value.
        */
      var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of renderer
        * @param renderer Function The new value.
        */
      var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of segmenter
        * @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
        */
      var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Config Option] (Number) */
      var textPadding: js.UndefOr[Double] = js.undefined
      
      /** [Config Option] (Number) */
      var visibleMax: js.UndefOr[Double] = js.undefined
      
      /** [Config Option] (Number) */
      var visibleMin: js.UndefOr[Double] = js.undefined
    }
    object IAxis {
      
      inline def apply(): typings.senchaTouch.Ext.chart.axis.sprite.IAxis = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.chart.axis.sprite.IAxis]
      }
      
      extension [Self <: typings.senchaTouch.Ext.chart.axis.sprite.IAxis](x: Self) {
        
        inline def setAxis(value: typings.senchaTouch.Ext.chart.axis.IAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        inline def setAxisLine(value: Boolean): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
        
        inline def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
        
        inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        inline def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
        
        inline def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
        
        inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
        
        inline def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
        
        inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
        
        inline def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
        
        inline def setDataMax(value: Double): Self = StObject.set(x, "dataMax", value.asInstanceOf[js.Any])
        
        inline def setDataMaxUndefined: Self = StObject.set(x, "dataMax", js.undefined)
        
        inline def setDataMin(value: Double): Self = StObject.set(x, "dataMin", value.asInstanceOf[js.Any])
        
        inline def setDataMinUndefined: Self = StObject.set(x, "dataMin", js.undefined)
        
        inline def setEnlargeEstStepSizeByText(value: Boolean): Self = StObject.set(x, "enlargeEstStepSizeByText", value.asInstanceOf[js.Any])
        
        inline def setEnlargeEstStepSizeByTextUndefined: Self = StObject.set(x, "enlargeEstStepSizeByText", js.undefined)
        
        inline def setGetAxis(value: () => typings.senchaTouch.Ext.chart.axis.sprite.IAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        inline def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        inline def setGetBBox(value: () => Unit): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
        
        inline def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
        
        inline def setGetLabel(value: () => Any): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
        
        inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
        
        inline def setGetLayout(value: () => Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
        
        inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
        
        inline def setGetRenderer(value: () => Any): Self = StObject.set(x, "getRenderer", js.Any.fromFunction0(value))
        
        inline def setGetRendererUndefined: Self = StObject.set(x, "getRenderer", js.undefined)
        
        inline def setGetSegmenter(value: () => Any): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
        
        inline def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
        
        inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
        
        inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
        
        inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setLayout(value: Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
        
        inline def setMajorTickSize(value: Double): Self = StObject.set(x, "majorTickSize", value.asInstanceOf[js.Any])
        
        inline def setMajorTickSizeUndefined: Self = StObject.set(x, "majorTickSize", js.undefined)
        
        inline def setMajorTicks(value: Boolean): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
        
        inline def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinStepSize(value: Double): Self = StObject.set(x, "minStepSize", value.asInstanceOf[js.Any])
        
        inline def setMinStepSizeUndefined: Self = StObject.set(x, "minStepSize", js.undefined)
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setMinorTickSize(value: Double): Self = StObject.set(x, "minorTickSize", value.asInstanceOf[js.Any])
        
        inline def setMinorTickSizeUndefined: Self = StObject.set(x, "minorTickSize", js.undefined)
        
        inline def setMinorTricks(value: Boolean): Self = StObject.set(x, "minorTricks", value.asInstanceOf[js.Any])
        
        inline def setMinorTricksUndefined: Self = StObject.set(x, "minorTricks", js.undefined)
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setRender(
          value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* clipRegion */ js.UndefOr[Any]) => Any
        ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
        
        inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        inline def setRenderer(value: Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        inline def setSegmenter(value: Any): Self = StObject.set(x, "segmenter", value.asInstanceOf[js.Any])
        
        inline def setSegmenterUndefined: Self = StObject.set(x, "segmenter", js.undefined)
        
        inline def setSetAxis(value: /* axis */ js.UndefOr[typings.senchaTouch.Ext.chart.axis.sprite.IAxis] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        inline def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
        
        inline def setSetLabel(value: /* label */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
        
        inline def setSetLabelUndefined: Self = StObject.set(x, "setLabel", js.undefined)
        
        inline def setSetLayout(value: /* layout */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
        
        inline def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
        
        inline def setSetRenderer(value: /* renderer */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setRenderer", js.Any.fromFunction1(value))
        
        inline def setSetRendererUndefined: Self = StObject.set(x, "setRenderer", js.undefined)
        
        inline def setSetSegmenter(value: /* segmenter */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
        
        inline def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
        
        inline def setTextPadding(value: Double): Self = StObject.set(x, "textPadding", value.asInstanceOf[js.Any])
        
        inline def setTextPaddingUndefined: Self = StObject.set(x, "textPadding", js.undefined)
        
        inline def setThe(value: Double): Self = StObject.set(x, "The", value.asInstanceOf[js.Any])
        
        inline def setTheUndefined: Self = StObject.set(x, "The", js.undefined)
        
        inline def setVisibleMax(value: Double): Self = StObject.set(x, "visibleMax", value.asInstanceOf[js.Any])
        
        inline def setVisibleMaxUndefined: Self = StObject.set(x, "visibleMax", js.undefined)
        
        inline def setVisibleMin(value: Double): Self = StObject.set(x, "visibleMin", value.asInstanceOf[js.Any])
        
        inline def setVisibleMinUndefined: Self = StObject.set(x, "visibleMin", js.undefined)
      }
    }
  }
}
