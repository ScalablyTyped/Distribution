package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.chart.series.ISeries
import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import typings.senchaTouch.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axis {
  
  @js.native
  trait IAxis extends IObservable {
    
    /** [Config Option] (Object) */
    var background: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Ext.chart.AbstractChart) */
    var chart: js.UndefOr[IAbstractChart] = js.native
    
    /** [Config Option] (Array) */
    var fields: js.UndefOr[Array] = js.native
    
    /** [Method] Returns the value of background
      * @returns Object
      */
    var getBackground: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of chart
      * @returns Ext.chart.AbstractChart
      */
    var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.native
    
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
          /* field */ js.UndefOr[String], 
          /* idx */ js.UndefOr[Double], 
          /* items */ js.UndefOr[IMixedCollection], 
          Double
        ]
      ] = js.native
    
    /** [Method] Returns the value of fields
      * @returns Array
      */
    var getFields: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the value of grid
      * @returns Object
      */
    var getGrid: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of hidden
      * @returns Boolean
      */
    var getHidden: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of increment
      * @returns Number
      */
    var getIncrement: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of label
      * @returns Object
      */
    var getLabel: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of labelInSpan
      * @returns Boolean
      */
    var getLabelInSpan: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of layout
      * @returns Object|Ext.chart.axis.layout.Layout
      */
    var getLayout: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of majorTickSteps
      * @returns Number
      */
    var getMajorTickSteps: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of maxZoom
      * @returns Number
      */
    var getMaxZoom: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of maximum
      * @returns Number
      */
    var getMaximum: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of minZoom
      * @returns Number
      */
    var getMinZoom: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of minimum
      * @returns Number
      */
    var getMinimum: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of minorTickSteps
      * @returns Number
      */
    var getMinorTickSteps: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of needHighPrecision
      * @returns Boolean
      */
    var getNeedHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of position
      * @returns String
      */
    var getPosition: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Get the range derived from all the bound series
      * @returns Array
      */
    var getRange: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the value of renderer
      * @returns Function
      */
    var getRenderer: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of segmenter
      * @returns Object|Ext.chart.axis.segmenter.Segmenter
      */
    var getSegmenter: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of style
      * @returns Object
      */
    var getStyle: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of title
      * @returns String|Object
      */
    var getTitle: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of titleMargin
      * @returns Number
      */
    var getTitleMargin: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of visibleRange
      * @returns Array
      */
    var getVisibleRange: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Config Option] (Object) */
    var grid: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var increment: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Object) */
    var label: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Boolean) */
    var labelInSpan: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
    var layout: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var majorTickSteps: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var maxZoom: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var maximum: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var minZoom: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var minimum: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var minorTickSteps: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Boolean) */
    var needHighPrecision: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var position: js.UndefOr[String] = js.native
    
    /** [Method] Invoked when data has changed  */
    var processData: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAxis: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.native
    
    /** [Method] Invokes renderFrame on this axis s surface s  */
    var renderFrame: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Function) */
    var renderer: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
    var segmenter: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the value of background
      * @param background Object The new value.
      */
    var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of chart
      * @param chart Ext.chart.AbstractChart The new value.
      */
    var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.native
    
    /** [Method] Sets the value of fields
      * @param fields Array The new value.
      */
    var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.native
    
    /** [Method] Sets the value of grid
      * @param grid Object The new value.
      */
    var setGrid: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of hidden
      * @param hidden Boolean The new value.
      */
    var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of increment
      * @param increment Number The new value.
      */
    var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of label
      * @param label Object The new value.
      */
    var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of labelInSpan
      * @param labelInSpan Boolean The new value.
      */
    var setLabelInSpan: js.UndefOr[js.Function1[/* labelInSpan */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of layout
      * @param layout Object|Ext.chart.axis.layout.Layout The new value.
      */
    var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of majorTickSteps
      * @param majorTickSteps Number The new value.
      */
    var setMajorTickSteps: js.UndefOr[js.Function1[/* majorTickSteps */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of maxZoom
      * @param maxZoom Number The new value.
      */
    var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of maximum
      * @param maximum Number The new value.
      */
    var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of minZoom
      * @param minZoom Number The new value.
      */
    var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of minimum
      * @param minimum Number The new value.
      */
    var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of minorTickSteps
      * @param minorTickSteps Number The new value.
      */
    var setMinorTickSteps: js.UndefOr[js.Function1[/* minorTickSteps */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of needHighPrecision
      * @param needHighPrecision Boolean The new value.
      */
    var setNeedHighPrecision: js.UndefOr[js.Function1[/* needHighPrecision */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of position
      * @param position String The new value.
      */
    var setPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of renderer
      * @param renderer Function The new value.
      * @returns String The label to display.
      */
    var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], String]] = js.native
    
    /** [Method] Sets the value of segmenter
      * @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
      */
    var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of style
      * @param style Object The new value.
      */
    var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of title
      * @param title String|Object The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of titleMargin
      * @param titleMargin Number The new value.
      */
    var setTitleMargin: js.UndefOr[js.Function1[/* titleMargin */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of visibleRange
      * @param visibleRange Array The new value.
      */
    var setVisibleRange: js.UndefOr[js.Function1[/* visibleRange */ js.UndefOr[Array], Unit]] = js.native
    
    /** [Config Option] (Object) */
    var style: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String|Object) */
    var title: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var titleMargin: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Array) */
    var visibleRange: js.UndefOr[Array] = js.native
  }
  object IAxis {
    
    @scala.inline
    def apply(): IAxis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAxis]
    }
    
    @scala.inline
    implicit class IAxisMutableBuilder[Self <: IAxis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: js.Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setChart(value: IAbstractChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      @scala.inline
      def setFields(value: Array): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setGetBackground(value: () => _): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBackgroundUndefined: Self = StObject.set(x, "getBackground", js.undefined)
      
      @scala.inline
      def setGetChart(value: () => IAbstractChart): Self = StObject.set(x, "getChart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChartUndefined: Self = StObject.set(x, "getChart", js.undefined)
      
      @scala.inline
      def setGetCoordFor(
        value: (/* value */ js.UndefOr[js.Any], /* field */ js.UndefOr[String], /* idx */ js.UndefOr[Double], /* items */ js.UndefOr[IMixedCollection]) => Double
      ): Self = StObject.set(x, "getCoordFor", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetCoordForUndefined: Self = StObject.set(x, "getCoordFor", js.undefined)
      
      @scala.inline
      def setGetFields(value: () => Array): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
      
      @scala.inline
      def setGetGrid(value: () => _): Self = StObject.set(x, "getGrid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGridUndefined: Self = StObject.set(x, "getGrid", js.undefined)
      
      @scala.inline
      def setGetHidden(value: () => Boolean): Self = StObject.set(x, "getHidden", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHiddenUndefined: Self = StObject.set(x, "getHidden", js.undefined)
      
      @scala.inline
      def setGetIncrement(value: () => Double): Self = StObject.set(x, "getIncrement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIncrementUndefined: Self = StObject.set(x, "getIncrement", js.undefined)
      
      @scala.inline
      def setGetLabel(value: () => _): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelInSpan(value: () => Boolean): Self = StObject.set(x, "getLabelInSpan", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelInSpanUndefined: Self = StObject.set(x, "getLabelInSpan", js.undefined)
      
      @scala.inline
      def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
      
      @scala.inline
      def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      @scala.inline
      def setGetMajorTickSteps(value: () => Double): Self = StObject.set(x, "getMajorTickSteps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMajorTickStepsUndefined: Self = StObject.set(x, "getMajorTickSteps", js.undefined)
      
      @scala.inline
      def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxZoomUndefined: Self = StObject.set(x, "getMaxZoom", js.undefined)
      
      @scala.inline
      def setGetMaximum(value: () => Double): Self = StObject.set(x, "getMaximum", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaximumUndefined: Self = StObject.set(x, "getMaximum", js.undefined)
      
      @scala.inline
      def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinZoomUndefined: Self = StObject.set(x, "getMinZoom", js.undefined)
      
      @scala.inline
      def setGetMinimum(value: () => Double): Self = StObject.set(x, "getMinimum", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinimumUndefined: Self = StObject.set(x, "getMinimum", js.undefined)
      
      @scala.inline
      def setGetMinorTickSteps(value: () => Double): Self = StObject.set(x, "getMinorTickSteps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinorTickStepsUndefined: Self = StObject.set(x, "getMinorTickSteps", js.undefined)
      
      @scala.inline
      def setGetNeedHighPrecision(value: () => Boolean): Self = StObject.set(x, "getNeedHighPrecision", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNeedHighPrecisionUndefined: Self = StObject.set(x, "getNeedHighPrecision", js.undefined)
      
      @scala.inline
      def setGetPosition(value: () => String): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPositionUndefined: Self = StObject.set(x, "getPosition", js.undefined)
      
      @scala.inline
      def setGetRange(value: () => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
      
      @scala.inline
      def setGetRenderer(value: () => _): Self = StObject.set(x, "getRenderer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRendererUndefined: Self = StObject.set(x, "getRenderer", js.undefined)
      
      @scala.inline
      def setGetSegmenter(value: () => _): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
      
      @scala.inline
      def setGetStyle(value: () => _): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
      
      @scala.inline
      def setGetTitle(value: () => _): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleMargin(value: () => Double): Self = StObject.set(x, "getTitleMargin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitleMarginUndefined: Self = StObject.set(x, "getTitleMargin", js.undefined)
      
      @scala.inline
      def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      @scala.inline
      def setGetVisibleRange(value: () => Array): Self = StObject.set(x, "getVisibleRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVisibleRangeUndefined: Self = StObject.set(x, "getVisibleRange", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelInSpan(value: Boolean): Self = StObject.set(x, "labelInSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelInSpanUndefined: Self = StObject.set(x, "labelInSpan", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMajorTickSteps(value: Double): Self = StObject.set(x, "majorTickSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorTickStepsUndefined: Self = StObject.set(x, "majorTickSteps", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMinorTickSteps(value: Double): Self = StObject.set(x, "minorTickSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorTickStepsUndefined: Self = StObject.set(x, "minorTickSteps", js.undefined)
      
      @scala.inline
      def setNeedHighPrecision(value: Boolean): Self = StObject.set(x, "needHighPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedHighPrecisionUndefined: Self = StObject.set(x, "needHighPrecision", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setProcessData(value: () => Unit): Self = StObject.set(x, "processData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setRenderFrame(value: () => Unit): Self = StObject.set(x, "renderFrame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderFrameUndefined: Self = StObject.set(x, "renderFrame", js.undefined)
      
      @scala.inline
      def setRenderer(value: js.Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setSegmenter(value: js.Any): Self = StObject.set(x, "segmenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmenterUndefined: Self = StObject.set(x, "segmenter", js.undefined)
      
      @scala.inline
      def setSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBackground", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
      
      @scala.inline
      def setSetChart(value: /* chart */ js.UndefOr[IAbstractChart] => Unit): Self = StObject.set(x, "setChart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetChartUndefined: Self = StObject.set(x, "setChart", js.undefined)
      
      @scala.inline
      def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
      
      @scala.inline
      def setSetGrid(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setGrid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetGridUndefined: Self = StObject.set(x, "setGrid", js.undefined)
      
      @scala.inline
      def setSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHidden", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHiddenUndefined: Self = StObject.set(x, "setHidden", js.undefined)
      
      @scala.inline
      def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setIncrement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIncrementUndefined: Self = StObject.set(x, "setIncrement", js.undefined)
      
      @scala.inline
      def setSetLabel(value: /* label */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLabelInSpan(value: /* labelInSpan */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setLabelInSpan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLabelInSpanUndefined: Self = StObject.set(x, "setLabelInSpan", js.undefined)
      
      @scala.inline
      def setSetLabelUndefined: Self = StObject.set(x, "setLabel", js.undefined)
      
      @scala.inline
      def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
      
      @scala.inline
      def setSetMajorTickSteps(value: /* majorTickSteps */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMajorTickSteps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMajorTickStepsUndefined: Self = StObject.set(x, "setMajorTickSteps", js.undefined)
      
      @scala.inline
      def setSetMaxZoom(value: /* maxZoom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxZoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxZoomUndefined: Self = StObject.set(x, "setMaxZoom", js.undefined)
      
      @scala.inline
      def setSetMaximum(value: /* maximum */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaximum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaximumUndefined: Self = StObject.set(x, "setMaximum", js.undefined)
      
      @scala.inline
      def setSetMinZoom(value: /* minZoom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinZoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinZoomUndefined: Self = StObject.set(x, "setMinZoom", js.undefined)
      
      @scala.inline
      def setSetMinimum(value: /* minimum */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinimum", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinimumUndefined: Self = StObject.set(x, "setMinimum", js.undefined)
      
      @scala.inline
      def setSetMinorTickSteps(value: /* minorTickSteps */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinorTickSteps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinorTickStepsUndefined: Self = StObject.set(x, "setMinorTickSteps", js.undefined)
      
      @scala.inline
      def setSetNeedHighPrecision(value: /* needHighPrecision */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setNeedHighPrecision", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNeedHighPrecisionUndefined: Self = StObject.set(x, "setNeedHighPrecision", js.undefined)
      
      @scala.inline
      def setSetPosition(value: /* position */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
      
      @scala.inline
      def setSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "setRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRendererUndefined: Self = StObject.set(x, "setRenderer", js.undefined)
      
      @scala.inline
      def setSetSegmenter(value: /* segmenter */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
      
      @scala.inline
      def setSetStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      @scala.inline
      def setSetTitle(value: /* title */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleMargin(value: /* titleMargin */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTitleMargin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleMarginUndefined: Self = StObject.set(x, "setTitleMargin", js.undefined)
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      @scala.inline
      def setSetVisibleRange(value: /* visibleRange */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setVisibleRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVisibleRangeUndefined: Self = StObject.set(x, "setVisibleRange", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleMargin(value: Double): Self = StObject.set(x, "titleMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleMarginUndefined: Self = StObject.set(x, "titleMargin", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVisibleRange(value: Array): Self = StObject.set(x, "visibleRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleRangeUndefined: Self = StObject.set(x, "visibleRange", js.undefined)
    }
  }
  
  @js.native
  trait ICategory extends IAxis {
    
    /** [Method] Returns the value of layout
      * @returns String
      */
    @JSName("getLayout")
    var getLayout_ICategory: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of segmenter
      * @returns String
      */
    @JSName("getSegmenter")
    var getSegmenter_ICategory: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Sets the value of layout
      * @param layout String The new value.
      */
    @JSName("setLayout")
    var setLayout_ICategory: js.UndefOr[js.Function1[/* layout */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of segmenter
      * @param segmenter String The new value.
      */
    @JSName("setSegmenter")
    var setSegmenter_ICategory: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[String], Unit]] = js.native
  }
  object ICategory {
    
    @scala.inline
    def apply(): ICategory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICategory]
    }
    
    @scala.inline
    implicit class ICategoryMutableBuilder[Self <: ICategory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLayout(value: () => String): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      @scala.inline
      def setGetSegmenter(value: () => String): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
      
      @scala.inline
      def setSetLayout(value: /* layout */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
      
      @scala.inline
      def setSetSegmenter(value: /* segmenter */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
    }
  }
  
  @js.native
  trait INumeric extends IAxis {
    
    /** [Method] Returns the value of aggregator
      * @returns String
      */
    var getAggregator: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of layout
      * @returns String
      */
    @JSName("getLayout")
    var getLayout_INumeric: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Returns the value of segmenter
      * @returns String
      */
    @JSName("getSegmenter")
    var getSegmenter_INumeric: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Sets the value of aggregator
      * @param aggregator String The new value.
      */
    var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of layout
      * @param layout String The new value.
      */
    @JSName("setLayout")
    var setLayout_INumeric: js.UndefOr[js.Function1[/* layout */ js.UndefOr[String], Unit]] = js.native
    
    /** [Method] Sets the value of segmenter
      * @param segmenter String The new value.
      */
    @JSName("setSegmenter")
    var setSegmenter_INumeric: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[String], Unit]] = js.native
  }
  object INumeric {
    
    @scala.inline
    def apply(): INumeric = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INumeric]
    }
    
    @scala.inline
    implicit class INumericMutableBuilder[Self <: INumeric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAggregator(value: () => String): Self = StObject.set(x, "getAggregator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAggregatorUndefined: Self = StObject.set(x, "getAggregator", js.undefined)
      
      @scala.inline
      def setGetLayout(value: () => String): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      @scala.inline
      def setGetSegmenter(value: () => String): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
      
      @scala.inline
      def setSetAggregator(value: /* aggregator */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setAggregator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAggregatorUndefined: Self = StObject.set(x, "setAggregator", js.undefined)
      
      @scala.inline
      def setSetLayout(value: /* layout */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
      
      @scala.inline
      def setSetSegmenter(value: /* segmenter */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
    }
  }
  
  @js.native
  trait ITime extends INumeric {
    
    /** [Config Option] (Boolean) */
    var calculateByLabelSize: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String/Boolean) */
    var dateFormat: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Date) */
    var fromDate: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns the value of calculateByLabelSize
      * @returns Boolean
      */
    var getCalculateByLabelSize: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Mapping data value into coordinate
      * @param value Object
      * @returns Number
      */
    @JSName("getCoordFor")
    var getCoordFor_ITime: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Double]] = js.native
    
    /** [Method] Returns the value of dateFormat
      * @returns String/Boolean
      */
    var getDateFormat: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of fromDate
      * @returns Date
      */
    var getFromDate: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of step
      * @returns Array
      */
    var getStep: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the value of toDate
      * @returns Date
      */
    var getToDate: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of calculateByLabelSize
      * @param calculateByLabelSize Boolean The new value.
      */
    var setCalculateByLabelSize: js.UndefOr[js.Function1[/* calculateByLabelSize */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of dateFormat
      * @param dateFormat String/Boolean The new value.
      */
    var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of fromDate
      * @param fromDate Date The new value.
      */
    var setFromDate: js.UndefOr[js.Function1[/* fromDate */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of step
      * @param step Array The new value.
      */
    var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Array], Unit]] = js.native
    
    /** [Method] Sets the value of toDate
      * @param toDate Date The new value.
      */
    var setToDate: js.UndefOr[js.Function1[/* toDate */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Array) */
    var step: js.UndefOr[Array] = js.native
    
    /** [Config Option] (Date) */
    var toDate: js.UndefOr[js.Any] = js.native
  }
  object ITime {
    
    @scala.inline
    def apply(): ITime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITime]
    }
    
    @scala.inline
    implicit class ITimeMutableBuilder[Self <: ITime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculateByLabelSize(value: Boolean): Self = StObject.set(x, "calculateByLabelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculateByLabelSizeUndefined: Self = StObject.set(x, "calculateByLabelSize", js.undefined)
      
      @scala.inline
      def setDateFormat(value: js.Any): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setFromDate(value: js.Any): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
      
      @scala.inline
      def setGetCalculateByLabelSize(value: () => Boolean): Self = StObject.set(x, "getCalculateByLabelSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCalculateByLabelSizeUndefined: Self = StObject.set(x, "getCalculateByLabelSize", js.undefined)
      
      @scala.inline
      def setGetCoordFor(value: /* value */ js.UndefOr[js.Any] => Double): Self = StObject.set(x, "getCoordFor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCoordForUndefined: Self = StObject.set(x, "getCoordFor", js.undefined)
      
      @scala.inline
      def setGetDateFormat(value: () => _): Self = StObject.set(x, "getDateFormat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDateFormatUndefined: Self = StObject.set(x, "getDateFormat", js.undefined)
      
      @scala.inline
      def setGetFromDate(value: () => _): Self = StObject.set(x, "getFromDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFromDateUndefined: Self = StObject.set(x, "getFromDate", js.undefined)
      
      @scala.inline
      def setGetStep(value: () => Array): Self = StObject.set(x, "getStep", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStepUndefined: Self = StObject.set(x, "getStep", js.undefined)
      
      @scala.inline
      def setGetToDate(value: () => _): Self = StObject.set(x, "getToDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetToDateUndefined: Self = StObject.set(x, "getToDate", js.undefined)
      
      @scala.inline
      def setSetCalculateByLabelSize(value: /* calculateByLabelSize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setCalculateByLabelSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCalculateByLabelSizeUndefined: Self = StObject.set(x, "setCalculateByLabelSize", js.undefined)
      
      @scala.inline
      def setSetDateFormat(value: /* dateFormat */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDateFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDateFormatUndefined: Self = StObject.set(x, "setDateFormat", js.undefined)
      
      @scala.inline
      def setSetFromDate(value: /* fromDate */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFromDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFromDateUndefined: Self = StObject.set(x, "setFromDate", js.undefined)
      
      @scala.inline
      def setSetStep(value: /* step */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setStep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStepUndefined: Self = StObject.set(x, "setStep", js.undefined)
      
      @scala.inline
      def setSetToDate(value: /* toDate */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setToDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetToDateUndefined: Self = StObject.set(x, "setToDate", js.undefined)
      
      @scala.inline
      def setStep(value: Array): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setToDate(value: js.Any): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    }
  }
  
  object layout {
    
    type ICombineDuplicate = IDiscrete
    
    @js.native
    trait IContinuous extends ILayout {
      
      /** [Method] Returns the value of adjustMaximumByMajorUnit
        * @returns Boolean
        */
      var getAdjustMaximumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.native
      
      /** [Method] Returns the value of adjustMinimumByMajorUnit
        * @returns Boolean
        */
      var getAdjustMinimumByMajorUnit: js.UndefOr[js.Function0[Boolean]] = js.native
      
      /** [Method] Sets the value of adjustMaximumByMajorUnit
        * @param adjustMaximumByMajorUnit Boolean The new value.
        */
      var setAdjustMaximumByMajorUnit: js.UndefOr[js.Function1[/* adjustMaximumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.native
      
      /** [Method] Sets the value of adjustMinimumByMajorUnit
        * @param adjustMinimumByMajorUnit Boolean The new value.
        */
      var setAdjustMinimumByMajorUnit: js.UndefOr[js.Function1[/* adjustMinimumByMajorUnit */ js.UndefOr[Boolean], Unit]] = js.native
      
      /** [Method] Snaps the data bound to the axis to meaningful tick marks
        * @param context Object
        * @param min Object
        * @param max Object
        * @param estStepSize Object
        */
      @JSName("snapEnds")
      var snapEnds_IContinuous: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[js.Any], 
              /* min */ js.UndefOr[js.Any], 
              /* max */ js.UndefOr[js.Any], 
              /* estStepSize */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.native
    }
    object IContinuous {
      
      @scala.inline
      def apply(): IContinuous = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IContinuous]
      }
      
      @scala.inline
      implicit class IContinuousMutableBuilder[Self <: IContinuous] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetAdjustMaximumByMajorUnit(value: () => Boolean): Self = StObject.set(x, "getAdjustMaximumByMajorUnit", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAdjustMaximumByMajorUnitUndefined: Self = StObject.set(x, "getAdjustMaximumByMajorUnit", js.undefined)
        
        @scala.inline
        def setGetAdjustMinimumByMajorUnit(value: () => Boolean): Self = StObject.set(x, "getAdjustMinimumByMajorUnit", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAdjustMinimumByMajorUnitUndefined: Self = StObject.set(x, "getAdjustMinimumByMajorUnit", js.undefined)
        
        @scala.inline
        def setSetAdjustMaximumByMajorUnit(value: /* adjustMaximumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAdjustMaximumByMajorUnit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAdjustMaximumByMajorUnitUndefined: Self = StObject.set(x, "setAdjustMaximumByMajorUnit", js.undefined)
        
        @scala.inline
        def setSetAdjustMinimumByMajorUnit(value: /* adjustMinimumByMajorUnit */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAdjustMinimumByMajorUnit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAdjustMinimumByMajorUnitUndefined: Self = StObject.set(x, "setAdjustMinimumByMajorUnit", js.undefined)
        
        @scala.inline
        def setSnapEnds(
          value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "snapEnds", js.Any.fromFunction4(value))
        
        @scala.inline
        def setSnapEndsUndefined: Self = StObject.set(x, "snapEnds", js.undefined)
      }
    }
    
    @js.native
    trait IDiscrete extends ILayout {
      
      /** [Method] Processes the data of the series bound to the axis  */
      @JSName("processData")
      var processData_IDiscrete: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** [Method] Snaps the data bound to the axis to meaningful tick marks
        * @param context Object
        * @param min Object
        * @param max Object
        * @param estStepSize Object
        */
      @JSName("snapEnds")
      var snapEnds_IDiscrete: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[js.Any], 
              /* min */ js.UndefOr[js.Any], 
              /* max */ js.UndefOr[js.Any], 
              /* estStepSize */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.native
      
      /** [Method] Trims the layout of the axis by the defined minimum and maximum
        * @param context Object
        * @param out Object
        * @param trimMin Object
        * @param trimMax Object
        */
      @JSName("trimByRange")
      var trimByRange_IDiscrete: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[js.Any], 
              /* out */ js.UndefOr[js.Any], 
              /* trimMin */ js.UndefOr[js.Any], 
              /* trimMax */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.native
    }
    object IDiscrete {
      
      @scala.inline
      def apply(): IDiscrete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDiscrete]
      }
      
      @scala.inline
      implicit class IDiscreteMutableBuilder[Self <: IDiscrete] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProcessData(value: () => Unit): Self = StObject.set(x, "processData", js.Any.fromFunction0(value))
        
        @scala.inline
        def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
        
        @scala.inline
        def setSnapEnds(
          value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "snapEnds", js.Any.fromFunction4(value))
        
        @scala.inline
        def setSnapEndsUndefined: Self = StObject.set(x, "snapEnds", js.undefined)
        
        @scala.inline
        def setTrimByRange(
          value: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[js.Any], /* trimMax */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "trimByRange", js.Any.fromFunction4(value))
        
        @scala.inline
        def setTrimByRangeUndefined: Self = StObject.set(x, "trimByRange", js.undefined)
      }
    }
    
    @js.native
    trait ILayout extends IBase {
      
      /** [Config Option] (Ext.chart.axis.Axis) */
      var axis: js.UndefOr[IAxis] = js.native
      
      /** [Method] Calculates the position of tick marks for the axis
        * @param context Object
        * @returns *
        */
      var calculateLayout: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], _]] = js.native
      
      /** [Method] Calculates the position of major ticks for the axis
        * @param context Object
        */
      var calculateMajorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Calculates the position of sub ticks for the axis
        * @param context Object
        */
      var calculateMinorTicks: js.UndefOr[js.Function1[/* context */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Returns the value of axis
        * @returns Ext.chart.axis.Axis
        */
      var getAxis: js.UndefOr[js.Function0[IAxis]] = js.native
      
      /** [Method] Processes the data of the series bound to the axis
        * @param series Ext.chart.series.Series The bound series.
        */
      var processData: js.UndefOr[js.Function1[/* series */ js.UndefOr[ISeries], Unit]] = js.native
      
      /** [Method] Sets the value of axis
        * @param axis Ext.chart.axis.Axis The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.native
      
      /** [Method] Snaps the data bound to the axis to meaningful tick marks
        * @param context Object
        * @param min Number
        * @param max Number
        * @param estStepSize Number
        */
      var snapEnds: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[js.Any], 
              /* min */ js.UndefOr[Double], 
              /* max */ js.UndefOr[Double], 
              /* estStepSize */ js.UndefOr[Double], 
              Unit
            ]
          ] = js.native
      
      /** [Method] Trims the layout of the axis by the defined minimum and maximum
        * @param context Object
        * @param out Object
        * @param trimMin Number
        * @param trimMax Number
        */
      var trimByRange: js.UndefOr[
            js.Function4[
              /* context */ js.UndefOr[js.Any], 
              /* out */ js.UndefOr[js.Any], 
              /* trimMin */ js.UndefOr[Double], 
              /* trimMax */ js.UndefOr[Double], 
              Unit
            ]
          ] = js.native
    }
    object ILayout {
      
      @scala.inline
      def apply(): ILayout = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILayout]
      }
      
      @scala.inline
      implicit class ILayoutMutableBuilder[Self <: ILayout] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAxis(value: IAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        @scala.inline
        def setCalculateLayout(value: /* context */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "calculateLayout", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCalculateLayoutUndefined: Self = StObject.set(x, "calculateLayout", js.undefined)
        
        @scala.inline
        def setCalculateMajorTicks(value: /* context */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculateMajorTicks", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCalculateMajorTicksUndefined: Self = StObject.set(x, "calculateMajorTicks", js.undefined)
        
        @scala.inline
        def setCalculateMinorTicks(value: /* context */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculateMinorTicks", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCalculateMinorTicksUndefined: Self = StObject.set(x, "calculateMinorTicks", js.undefined)
        
        @scala.inline
        def setGetAxis(value: () => IAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        @scala.inline
        def setProcessData(value: /* series */ js.UndefOr[ISeries] => Unit): Self = StObject.set(x, "processData", js.Any.fromFunction1(value))
        
        @scala.inline
        def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
        
        @scala.inline
        def setSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
        
        @scala.inline
        def setSnapEnds(
          value: (/* context */ js.UndefOr[js.Any], /* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStepSize */ js.UndefOr[Double]) => Unit
        ): Self = StObject.set(x, "snapEnds", js.Any.fromFunction4(value))
        
        @scala.inline
        def setSnapEndsUndefined: Self = StObject.set(x, "snapEnds", js.undefined)
        
        @scala.inline
        def setTrimByRange(
          value: (/* context */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* trimMin */ js.UndefOr[Double], /* trimMax */ js.UndefOr[Double]) => Unit
        ): Self = StObject.set(x, "trimByRange", js.Any.fromFunction4(value))
        
        @scala.inline
        def setTrimByRangeUndefined: Self = StObject.set(x, "trimByRange", js.undefined)
      }
    }
  }
  
  object segmenter {
    
    @js.native
    trait INames extends ISegmenter {
      
      /** [Method] Add step units to the value
        * @param value Object
        * @param step Object
        * @param unit Object
        */
      @JSName("add")
      var add_INames: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[js.Any], 
              /* unit */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.native
      
      /** [Method] Align value with step of units
        * @param value Object
        * @param step Object
        * @param unit Object
        * @returns * Aligned value.
        */
      @JSName("align")
      var align_INames: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[js.Any], 
              /* unit */ js.UndefOr[js.Any], 
              _
            ]
          ] = js.native
      
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
              /* min */ js.UndefOr[js.Any], 
              /* estStepSize */ js.UndefOr[js.Any], 
              /* minIdx */ js.UndefOr[js.Any], 
              /* data */ js.UndefOr[js.Any], 
              _
            ]
          ] = js.native
    }
    object INames {
      
      @scala.inline
      def apply(): INames = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[INames]
      }
      
      @scala.inline
      implicit class INamesMutableBuilder[Self <: INames] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(
          value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        @scala.inline
        def setAlign(
          value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => _
        ): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setPreferredStep(
          value: (/* min */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], /* minIdx */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => _
        ): Self = StObject.set(x, "preferredStep", js.Any.fromFunction4(value))
        
        @scala.inline
        def setPreferredStepUndefined: Self = StObject.set(x, "preferredStep", js.undefined)
      }
    }
    
    @js.native
    trait INumeric extends ISegmenter {
      
      /** [Method] Add step units to the value
        * @param value Object
        * @param step Object
        * @param unit Object
        */
      @JSName("add")
      var add_INumeric: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[js.Any], 
              /* unit */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.native
      
      /** [Method] Align value with step of units
        * @param value Object
        * @param step Object
        * @param unit Object
        * @returns * Aligned value.
        */
      @JSName("align")
      var align_INumeric: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[js.Any], 
              /* unit */ js.UndefOr[js.Any], 
              _
            ]
          ] = js.native
      
      /** [Method] Wraps the provided estimated step size of a range without altering it into a step size object
        * @param start * The start point of range.
        * @param estStepSize * The estimated step size.
        * @returns Object Return the step size by an object of step x unit.
        */
      var exactStep: js.UndefOr[
            js.Function2[/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], _]
          ] = js.native
    }
    object INumeric {
      
      @scala.inline
      def apply(): typings.senchaTouch.Ext.chart.axis.segmenter.INumeric = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.chart.axis.segmenter.INumeric]
      }
      
      @scala.inline
      implicit class INumericMutableBuilder[Self <: typings.senchaTouch.Ext.chart.axis.segmenter.INumeric] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(
          value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        @scala.inline
        def setAlign(
          value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => _
        ): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setExactStep(value: (/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "exactStep", js.Any.fromFunction2(value))
        
        @scala.inline
        def setExactStepUndefined: Self = StObject.set(x, "exactStep", js.undefined)
      }
    }
    
    @js.native
    trait ISegmenter extends IBase {
      
      /** [Method] Add step units to the value
        * @param value * The value to be added.
        * @param step Number The step of units. Negative value are allowed.
        * @param unit * The unit.
        */
      var add: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[Double], 
              /* unit */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.native
      
      /** [Method] Align value with step of units
        * @param value * The value to be aligned.
        * @param step Number The step of units.
        * @param unit * The unit.
        * @returns * Aligned value.
        */
      var align: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[Double], 
              /* unit */ js.UndefOr[js.Any], 
              _
            ]
          ] = js.native
      
      /** [Config Option] (Ext.chart.axis.Axis) */
      var axis: js.UndefOr[IAxis] = js.native
      
      /** [Method] Returns the difference between the min and max value based on the given unit scale
        * @param min * The smaller value.
        * @param max * The larger value.
        * @param unit * The unit scale. Unit can be any type.
        * @returns Number The number of units between min and max. It is the minimum n that min + n * unit >= max.
        */
      var diff: js.UndefOr[
            js.Function3[
              /* min */ js.UndefOr[js.Any], 
              /* max */ js.UndefOr[js.Any], 
              /* unit */ js.UndefOr[js.Any], 
              Double
            ]
          ] = js.native
      
      /** [Method] Convert from any data into the target type
        * @param value * The value to convert from
        * @returns * The converted value.
        */
      var from: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], _]] = js.native
      
      /** [Method] Returns the value of axis
        * @returns Ext.chart.axis.Axis
        */
      var getAxis: js.UndefOr[js.Function0[IAxis]] = js.native
      
      /** [Method] Given a start point and estimated step size of a range determine the preferred step size
        * @param start * The start point of range.
        * @param estStepSize * The estimated step size.
        * @returns Object Return the step size by an object of step x unit.
        */
      var preferredStep: js.UndefOr[
            js.Function2[/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any], _]
          ] = js.native
      
      /** [Method] This method formats the value
        * @param value * The value to format.
        * @param context Object Axis layout context.
        * @returns String
        */
      var renderer: js.UndefOr[
            js.Function2[/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any], String]
          ] = js.native
      
      /** [Method] Sets the value of axis
        * @param axis Ext.chart.axis.Axis The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[IAxis], Unit]] = js.native
    }
    object ISegmenter {
      
      @scala.inline
      def apply(): ISegmenter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISegmenter]
      }
      
      @scala.inline
      implicit class ISegmenterMutableBuilder[Self <: ISegmenter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(
          value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        @scala.inline
        def setAlign(
          value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[Double], /* unit */ js.UndefOr[js.Any]) => _
        ): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setAxis(value: IAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        @scala.inline
        def setDiff(
          value: (/* min */ js.UndefOr[js.Any], /* max */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Double
        ): Self = StObject.set(x, "diff", js.Any.fromFunction3(value))
        
        @scala.inline
        def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
        
        @scala.inline
        def setFrom(value: /* value */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        @scala.inline
        def setGetAxis(value: () => IAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        @scala.inline
        def setPreferredStep(value: (/* start */ js.UndefOr[js.Any], /* estStepSize */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "preferredStep", js.Any.fromFunction2(value))
        
        @scala.inline
        def setPreferredStepUndefined: Self = StObject.set(x, "preferredStep", js.undefined)
        
        @scala.inline
        def setRenderer(value: (/* value */ js.UndefOr[js.Any], /* context */ js.UndefOr[js.Any]) => String): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        @scala.inline
        def setSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
      }
    }
    
    @js.native
    trait ITime extends ISegmenter {
      
      /** [Method] Add step units to the value
        * @param value Object
        * @param step Object
        * @param unit Object
        */
      @JSName("add")
      var add_ITime: js.UndefOr[
            js.Function3[
              /* value */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[js.Any], 
              /* unit */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.native
      
      /** [Method] Align value with step of units
        * @param date Object
        * @param step Object
        * @param unit Object
        * @returns * Aligned value.
        */
      @JSName("align")
      var align_ITime: js.UndefOr[
            js.Function3[
              /* date */ js.UndefOr[js.Any], 
              /* step */ js.UndefOr[js.Any], 
              /* unit */ js.UndefOr[js.Any], 
              _
            ]
          ] = js.native
      
      /** [Method] Returns the value of step
        * @returns Object
        */
      var getStep: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Sets the value of step
        * @param step Object The new value.
        */
      var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Config Option] (Object) */
      var step: js.UndefOr[js.Any] = js.native
    }
    object ITime {
      
      @scala.inline
      def apply(): typings.senchaTouch.Ext.chart.axis.segmenter.ITime = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.chart.axis.segmenter.ITime]
      }
      
      @scala.inline
      implicit class ITimeMutableBuilder[Self <: typings.senchaTouch.Ext.chart.axis.segmenter.ITime] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(
          value: (/* value */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
        
        @scala.inline
        def setAlign(
          value: (/* date */ js.UndefOr[js.Any], /* step */ js.UndefOr[js.Any], /* unit */ js.UndefOr[js.Any]) => _
        ): Self = StObject.set(x, "align", js.Any.fromFunction3(value))
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setGetStep(value: () => _): Self = StObject.set(x, "getStep", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetStepUndefined: Self = StObject.set(x, "getStep", js.undefined)
        
        @scala.inline
        def setSetStep(value: /* step */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStep", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetStepUndefined: Self = StObject.set(x, "setStep", js.undefined)
        
        @scala.inline
        def setStep(value: js.Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      }
    }
  }
  
  object sprite {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.senchaTouch.Ext.IClass because Already inherited
    - typings.senchaTouch.Ext.IBase because Already inherited
    - typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
    trait IAxis extends ISprite {
      
      /** [Config Option] (Number) */
      var The: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Ext.chart.axis.Axis) */
      var axis: js.UndefOr[typings.senchaTouch.Ext.chart.axis.IAxis] = js.native
      
      /** [Config Option] (Boolean) */
      var axisLine: js.UndefOr[Boolean] = js.native
      
      /** [Method]
        * @param name String
        * @param marker Ext.chart.Markers
        */
      var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
      
      /** [Config Option] (Number) */
      var centerX: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var centerY: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var dataMax: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var dataMin: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Boolean) */
      var enlargeEstStepSizeByText: js.UndefOr[Boolean] = js.native
      
      /** [Method] Returns the value of axis
        * @returns Ext.chart.axis.Axis
        */
      var getAxis: js.UndefOr[js.Function0[this.type]] = js.native
      
      /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine  */
      @JSName("getBBox")
      var getBBox_IAxis: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** [Method] Returns the value of label
        * @returns Object
        */
      var getLabel: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of layout
        * @returns Object|Ext.chart.axis.layout.Layout
        */
      var getLayout: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of renderer
        * @returns Function
        */
      var getRenderer: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Method] Returns the value of segmenter
        * @returns Object|Ext.chart.axis.segmenter.Segmenter
        */
      var getSegmenter: js.UndefOr[js.Function0[_]] = js.native
      
      /** [Config Option] (Boolean) */
      var grid: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Object) */
      var label: js.UndefOr[js.Any] = js.native
      
      /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
      var layout: js.UndefOr[js.Any] = js.native
      
      /** [Config Option] (Number) */
      var length: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var majorTickSize: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Boolean) */
      var majorTicks: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Number) */
      var max: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var min: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var minStepSize: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var minorTickSize: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Boolean) */
      var minorTricks: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (String) */
      var position: js.UndefOr[String] = js.native
      
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
          ] = js.native
      
      /** [Config Option] (Function) */
      var renderer: js.UndefOr[js.Any] = js.native
      
      /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
      var segmenter: js.UndefOr[js.Any] = js.native
      
      /** [Method] Sets the value of axis
        * @param axis Ext.chart.axis.Axis The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[this.type], Unit]] = js.native
      
      /** [Method] Sets the value of label
        * @param label Object The new value.
        */
      var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of layout
        * @param layout Object|Ext.chart.axis.layout.Layout The new value.
        */
      var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of renderer
        * @param renderer Function The new value.
        */
      var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Method] Sets the value of segmenter
        * @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
        */
      var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Config Option] (Number) */
      var textPadding: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var visibleMax: js.UndefOr[Double] = js.native
      
      /** [Config Option] (Number) */
      var visibleMin: js.UndefOr[Double] = js.native
    }
    object IAxis {
      
      @scala.inline
      def apply(): typings.senchaTouch.Ext.chart.axis.sprite.IAxis = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.senchaTouch.Ext.chart.axis.sprite.IAxis]
      }
      
      @scala.inline
      implicit class IAxisMutableBuilder[Self <: typings.senchaTouch.Ext.chart.axis.sprite.IAxis] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAxis(value: typings.senchaTouch.Ext.chart.axis.IAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisLine(value: Boolean): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
        
        @scala.inline
        def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        @scala.inline
        def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
        
        @scala.inline
        def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
        
        @scala.inline
        def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
        
        @scala.inline
        def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
        
        @scala.inline
        def setDataMax(value: Double): Self = StObject.set(x, "dataMax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataMaxUndefined: Self = StObject.set(x, "dataMax", js.undefined)
        
        @scala.inline
        def setDataMin(value: Double): Self = StObject.set(x, "dataMin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataMinUndefined: Self = StObject.set(x, "dataMin", js.undefined)
        
        @scala.inline
        def setEnlargeEstStepSizeByText(value: Boolean): Self = StObject.set(x, "enlargeEstStepSizeByText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnlargeEstStepSizeByTextUndefined: Self = StObject.set(x, "enlargeEstStepSizeByText", js.undefined)
        
        @scala.inline
        def setGetAxis(value: () => typings.senchaTouch.Ext.chart.axis.sprite.IAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        @scala.inline
        def setGetBBox(value: () => Unit): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
        
        @scala.inline
        def setGetLabel(value: () => _): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
        
        @scala.inline
        def setGetLayout(value: () => _): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
        
        @scala.inline
        def setGetRenderer(value: () => _): Self = StObject.set(x, "getRenderer", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetRendererUndefined: Self = StObject.set(x, "getRenderer", js.undefined)
        
        @scala.inline
        def setGetSegmenter(value: () => _): Self = StObject.set(x, "getSegmenter", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetSegmenterUndefined: Self = StObject.set(x, "getSegmenter", js.undefined)
        
        @scala.inline
        def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
        
        @scala.inline
        def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        @scala.inline
        def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
        
        @scala.inline
        def setMajorTickSize(value: Double): Self = StObject.set(x, "majorTickSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMajorTickSizeUndefined: Self = StObject.set(x, "majorTickSize", js.undefined)
        
        @scala.inline
        def setMajorTicks(value: Boolean): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMajorTicksUndefined: Self = StObject.set(x, "majorTicks", js.undefined)
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinStepSize(value: Double): Self = StObject.set(x, "minStepSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinStepSizeUndefined: Self = StObject.set(x, "minStepSize", js.undefined)
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setMinorTickSize(value: Double): Self = StObject.set(x, "minorTickSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinorTickSizeUndefined: Self = StObject.set(x, "minorTickSize", js.undefined)
        
        @scala.inline
        def setMinorTricks(value: Boolean): Self = StObject.set(x, "minorTricks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinorTricksUndefined: Self = StObject.set(x, "minorTricks", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setRender(
          value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
        ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
        
        @scala.inline
        def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        @scala.inline
        def setRenderer(value: js.Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
        
        @scala.inline
        def setSegmenter(value: js.Any): Self = StObject.set(x, "segmenter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSegmenterUndefined: Self = StObject.set(x, "segmenter", js.undefined)
        
        @scala.inline
        def setSetAxis(value: /* axis */ js.UndefOr[typings.senchaTouch.Ext.chart.axis.sprite.IAxis] => Unit): Self = StObject.set(x, "setAxis", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
        
        @scala.inline
        def setSetLabel(value: /* label */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetLabelUndefined: Self = StObject.set(x, "setLabel", js.undefined)
        
        @scala.inline
        def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
        
        @scala.inline
        def setSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setRenderer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetRendererUndefined: Self = StObject.set(x, "setRenderer", js.undefined)
        
        @scala.inline
        def setSetSegmenter(value: /* segmenter */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSegmenter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetSegmenterUndefined: Self = StObject.set(x, "setSegmenter", js.undefined)
        
        @scala.inline
        def setTextPadding(value: Double): Self = StObject.set(x, "textPadding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextPaddingUndefined: Self = StObject.set(x, "textPadding", js.undefined)
        
        @scala.inline
        def setThe(value: Double): Self = StObject.set(x, "The", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTheUndefined: Self = StObject.set(x, "The", js.undefined)
        
        @scala.inline
        def setVisibleMax(value: Double): Self = StObject.set(x, "visibleMax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleMaxUndefined: Self = StObject.set(x, "visibleMax", js.undefined)
        
        @scala.inline
        def setVisibleMin(value: Double): Self = StObject.set(x, "visibleMin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleMinUndefined: Self = StObject.set(x, "visibleMin", js.undefined)
      }
    }
  }
}
