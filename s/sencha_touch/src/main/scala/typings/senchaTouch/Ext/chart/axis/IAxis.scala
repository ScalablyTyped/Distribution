package typings.senchaTouch.Ext.chart.axis

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.chart.IAbstractChart
import typings.senchaTouch.Ext.mixin.IObservable
import typings.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackground(value: js.Any): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setChart(value: IAbstractChart): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setFields(value: Array): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGetBackground(value: () => _): Self = this.set("getBackground", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBackground: Self = this.set("getBackground", js.undefined)
    @scala.inline
    def setGetChart(value: () => IAbstractChart): Self = this.set("getChart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetChart: Self = this.set("getChart", js.undefined)
    @scala.inline
    def setGetCoordFor(
      value: (/* value */ js.UndefOr[js.Any], /* field */ js.UndefOr[String], /* idx */ js.UndefOr[Double], /* items */ js.UndefOr[IMixedCollection]) => Double
    ): Self = this.set("getCoordFor", js.Any.fromFunction4(value))
    @scala.inline
    def deleteGetCoordFor: Self = this.set("getCoordFor", js.undefined)
    @scala.inline
    def setGetFields(value: () => Array): Self = this.set("getFields", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFields: Self = this.set("getFields", js.undefined)
    @scala.inline
    def setGetGrid(value: () => _): Self = this.set("getGrid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetGrid: Self = this.set("getGrid", js.undefined)
    @scala.inline
    def setGetHidden(value: () => Boolean): Self = this.set("getHidden", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHidden: Self = this.set("getHidden", js.undefined)
    @scala.inline
    def setGetIncrement(value: () => Double): Self = this.set("getIncrement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetIncrement: Self = this.set("getIncrement", js.undefined)
    @scala.inline
    def setGetLabel(value: () => _): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    @scala.inline
    def setGetLabelInSpan(value: () => Boolean): Self = this.set("getLabelInSpan", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelInSpan: Self = this.set("getLabelInSpan", js.undefined)
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    @scala.inline
    def setGetMajorTickSteps(value: () => Double): Self = this.set("getMajorTickSteps", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMajorTickSteps: Self = this.set("getMajorTickSteps", js.undefined)
    @scala.inline
    def setGetMaxZoom(value: () => Double): Self = this.set("getMaxZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaxZoom: Self = this.set("getMaxZoom", js.undefined)
    @scala.inline
    def setGetMaximum(value: () => Double): Self = this.set("getMaximum", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMaximum: Self = this.set("getMaximum", js.undefined)
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = this.set("getMinZoom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinZoom: Self = this.set("getMinZoom", js.undefined)
    @scala.inline
    def setGetMinimum(value: () => Double): Self = this.set("getMinimum", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinimum: Self = this.set("getMinimum", js.undefined)
    @scala.inline
    def setGetMinorTickSteps(value: () => Double): Self = this.set("getMinorTickSteps", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinorTickSteps: Self = this.set("getMinorTickSteps", js.undefined)
    @scala.inline
    def setGetNeedHighPrecision(value: () => Boolean): Self = this.set("getNeedHighPrecision", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNeedHighPrecision: Self = this.set("getNeedHighPrecision", js.undefined)
    @scala.inline
    def setGetPosition(value: () => String): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPosition: Self = this.set("getPosition", js.undefined)
    @scala.inline
    def setGetRange(value: () => Array): Self = this.set("getRange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRange: Self = this.set("getRange", js.undefined)
    @scala.inline
    def setGetRenderer(value: () => _): Self = this.set("getRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRenderer: Self = this.set("getRenderer", js.undefined)
    @scala.inline
    def setGetSegmenter(value: () => _): Self = this.set("getSegmenter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSegmenter: Self = this.set("getSegmenter", js.undefined)
    @scala.inline
    def setGetStyle(value: () => _): Self = this.set("getStyle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStyle: Self = this.set("getStyle", js.undefined)
    @scala.inline
    def setGetTitle(value: () => _): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    @scala.inline
    def setGetTitleMargin(value: () => Double): Self = this.set("getTitleMargin", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitleMargin: Self = this.set("getTitleMargin", js.undefined)
    @scala.inline
    def setGetVisibleRange(value: () => Array): Self = this.set("getVisibleRange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetVisibleRange: Self = this.set("getVisibleRange", js.undefined)
    @scala.inline
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelInSpan(value: Boolean): Self = this.set("labelInSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInSpan: Self = this.set("labelInSpan", js.undefined)
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMajorTickSteps(value: Double): Self = this.set("majorTickSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTickSteps: Self = this.set("majorTickSteps", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setMinorTickSteps(value: Double): Self = this.set("minorTickSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickSteps: Self = this.set("minorTickSteps", js.undefined)
    @scala.inline
    def setNeedHighPrecision(value: Boolean): Self = this.set("needHighPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedHighPrecision: Self = this.set("needHighPrecision", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setProcessData(value: () => Unit): Self = this.set("processData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteProcessData: Self = this.set("processData", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setRenderFrame(value: () => Unit): Self = this.set("renderFrame", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderFrame: Self = this.set("renderFrame", js.undefined)
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSegmenter(value: js.Any): Self = this.set("segmenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmenter: Self = this.set("segmenter", js.undefined)
    @scala.inline
    def setSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = this.set("setBackground", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBackground: Self = this.set("setBackground", js.undefined)
    @scala.inline
    def setSetChart(value: /* chart */ js.UndefOr[IAbstractChart] => Unit): Self = this.set("setChart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetChart: Self = this.set("setChart", js.undefined)
    @scala.inline
    def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = this.set("setFields", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFields: Self = this.set("setFields", js.undefined)
    @scala.inline
    def setSetGrid(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = this.set("setGrid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetGrid: Self = this.set("setGrid", js.undefined)
    @scala.inline
    def setSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = this.set("setHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHidden: Self = this.set("setHidden", js.undefined)
    @scala.inline
    def setSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = this.set("setIncrement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetIncrement: Self = this.set("setIncrement", js.undefined)
    @scala.inline
    def setSetLabel(value: /* label */ js.UndefOr[js.Any] => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabel: Self = this.set("setLabel", js.undefined)
    @scala.inline
    def setSetLabelInSpan(value: /* labelInSpan */ js.UndefOr[Boolean] => Unit): Self = this.set("setLabelInSpan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelInSpan: Self = this.set("setLabelInSpan", js.undefined)
    @scala.inline
    def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = this.set("setLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLayout: Self = this.set("setLayout", js.undefined)
    @scala.inline
    def setSetMajorTickSteps(value: /* majorTickSteps */ js.UndefOr[Double] => Unit): Self = this.set("setMajorTickSteps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMajorTickSteps: Self = this.set("setMajorTickSteps", js.undefined)
    @scala.inline
    def setSetMaxZoom(value: /* maxZoom */ js.UndefOr[Double] => Unit): Self = this.set("setMaxZoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxZoom: Self = this.set("setMaxZoom", js.undefined)
    @scala.inline
    def setSetMaximum(value: /* maximum */ js.UndefOr[Double] => Unit): Self = this.set("setMaximum", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaximum: Self = this.set("setMaximum", js.undefined)
    @scala.inline
    def setSetMinZoom(value: /* minZoom */ js.UndefOr[Double] => Unit): Self = this.set("setMinZoom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinZoom: Self = this.set("setMinZoom", js.undefined)
    @scala.inline
    def setSetMinimum(value: /* minimum */ js.UndefOr[Double] => Unit): Self = this.set("setMinimum", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinimum: Self = this.set("setMinimum", js.undefined)
    @scala.inline
    def setSetMinorTickSteps(value: /* minorTickSteps */ js.UndefOr[Double] => Unit): Self = this.set("setMinorTickSteps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinorTickSteps: Self = this.set("setMinorTickSteps", js.undefined)
    @scala.inline
    def setSetNeedHighPrecision(value: /* needHighPrecision */ js.UndefOr[Boolean] => Unit): Self = this.set("setNeedHighPrecision", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNeedHighPrecision: Self = this.set("setNeedHighPrecision", js.undefined)
    @scala.inline
    def setSetPosition(value: /* position */ js.UndefOr[String] => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPosition: Self = this.set("setPosition", js.undefined)
    @scala.inline
    def setSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => String): Self = this.set("setRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRenderer: Self = this.set("setRenderer", js.undefined)
    @scala.inline
    def setSetSegmenter(value: /* segmenter */ js.UndefOr[js.Any] => Unit): Self = this.set("setSegmenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSegmenter: Self = this.set("setSegmenter", js.undefined)
    @scala.inline
    def setSetStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[js.Any] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setSetTitleMargin(value: /* titleMargin */ js.UndefOr[Double] => Unit): Self = this.set("setTitleMargin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitleMargin: Self = this.set("setTitleMargin", js.undefined)
    @scala.inline
    def setSetVisibleRange(value: /* visibleRange */ js.UndefOr[Array] => Unit): Self = this.set("setVisibleRange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetVisibleRange: Self = this.set("setVisibleRange", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleMargin(value: Double): Self = this.set("titleMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleMargin: Self = this.set("titleMargin", js.undefined)
    @scala.inline
    def setVisibleRange(value: Array): Self = this.set("visibleRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleRange: Self = this.set("visibleRange", js.undefined)
  }
  
}

