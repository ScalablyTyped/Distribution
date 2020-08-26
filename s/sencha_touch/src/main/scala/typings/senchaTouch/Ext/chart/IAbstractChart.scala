package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.data.IStore
import typings.senchaTouch.Ext.draw.IComponent
import typings.senchaTouch.Ext.draw.ISurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractChart extends IComponent {
  /** [Config Option] (Boolean/Object) */
  var animate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.chart.axis.Axis/Array/Object) */
  var axes: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Method] Changes the data store bound to this chart and refreshes it
    * @param store Ext.data.Store The store to bind to this chart.
    */
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Method] Cancel a scheduled layout  */
  var cancelLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Array) */
  var colors: js.UndefOr[js.Any] = js.native
  /** [Method] Flattens the given chart surfaces into a single image
    * @param surfaces Array A list of chart's surfaces to flatten.
    * @param format String If set to 'image', the method will return an Image object. Otherwise, the dataURL  of the flattened image will be returned.
    * @returns String|Image An Image DOM element containing the flattened image or its dataURL.
    */
  var flatten: js.UndefOr[
    js.Function2[/* surfaces */ js.UndefOr[Array], /* format */ js.UndefOr[String], _]
  ] = js.native
  /** [Method] Returns the value of axes
    * @returns Ext.chart.axis.Axis/Array/Object
    */
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of colors
    * @returns Boolean/Array
    */
  var getColors: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of highlightItem
    * @returns Object
    */
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of innerPadding
    * @returns Object
    */
  var getInnerPadding: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of insetPadding
    * @returns Object|Number
    */
  var getInsetPadding: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of interactions
    * @returns Array
    */
  var getInteractions: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Given an x y point relative to the chart find and return the first series item that matches that point
    * @param x Number
    * @param y Number
    * @returns Object An object with series and item properties, or false if no item found.
    */
  var getItemForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], _]] = js.native
  /** [Method] Given an x y point relative to the chart find and return all series items that match that point
    * @param x Number
    * @param y Number
    * @returns Array An array of objects with series and item properties.
    */
  var getItemsForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Array]] = js.native
  /** [Method] Returns the value of legend
    * @returns Ext.chart.Legend/Object
    */
  var getLegend: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Return the legend store that contains all the legend information
    * @returns Ext.data.Store
    */
  var getLegendStore: js.UndefOr[js.Function0[IStore]] = js.native
  /** [Method] Returns the value of series
    * @returns Ext.chart.series.Series/Array
    */
  var getSeries: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of shadow
    * @returns Boolean/Object
    */
  var getShadow: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of store
    * @returns Ext.data.Store
    */
  var getStore: js.UndefOr[js.Function0[IStore]] = js.native
  /** [Method] Get a surface by the given id or create one if it doesn t exist
    * @param name Object
    * @param type Object
    * @returns Ext.draw.Surface
    */
  @JSName("getSurface")
  var getSurface_IAbstractChart: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* type */ js.UndefOr[js.Any], ISurface]
  ] = js.native
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var innerPadding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object|Number) */
  var insetPadding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Array) */
  var interactions: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.chart.Legend/Object) */
  var legend: js.UndefOr[js.Any] = js.native
  /** [Method] Redraw the chart  */
  var redraw: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resume the layout initialized by thickness change */
  var resumeThicknessChanged: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Schedule a layout at next frame  */
  var scheduleLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Ext.chart.series.Series/Array) */
  var series: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of animate
    * @param animate Boolean/Object The new value.
    */
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of axes
    * @param axes Ext.chart.axis.Axis/Array/Object The new value.
    */
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of colors
    * @param colors Boolean/Array The new value.
    */
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of highlightItem
    * @param highlightItem Object The new value.
    */
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of innerPadding
    * @param innerPadding Object The new value.
    */
  var setInnerPadding: js.UndefOr[js.Function1[/* innerPadding */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of insetPadding
    * @param insetPadding Object|Number The new value.
    */
  var setInsetPadding: js.UndefOr[js.Function1[/* insetPadding */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of interactions
    * @param interactions Array The new value.
    */
  var setInteractions: js.UndefOr[js.Function1[/* interactions */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of legend
    * @param legend Ext.chart.Legend/Object The new value.
    */
  var setLegend: js.UndefOr[js.Function1[/* legend */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of series
    * @param series Ext.chart.series.Series/Array The new value.
    */
  var setSeries: js.UndefOr[js.Function1[/* series */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of shadow
    * @param shadow Boolean/Object The new value.
    */
  var setShadow: js.UndefOr[js.Function1[/* shadow */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of store
    * @param store Ext.data.Store The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var shadow: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Method] Suspend the layout initialized by thickness change */
  var suspendThicknessChanged: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var version: js.UndefOr[String] = js.native
}

object IAbstractChart {
  @scala.inline
  def apply(): IAbstractChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractChart]
  }
  @scala.inline
  implicit class IAbstractChartOps[Self <: IAbstractChart] (val x: Self) extends AnyVal {
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
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAxes(value: js.Any): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setBackground(value: js.Any): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBindStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("bindStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindStore: Self = this.set("bindStore", js.undefined)
    @scala.inline
    def setCancelLayout(value: () => Unit): Self = this.set("cancelLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancelLayout: Self = this.set("cancelLayout", js.undefined)
    @scala.inline
    def setColors(value: js.Any): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setFlatten(value: (/* surfaces */ js.UndefOr[Array], /* format */ js.UndefOr[String]) => _): Self = this.set("flatten", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    @scala.inline
    def setGetAxes(value: () => _): Self = this.set("getAxes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAxes: Self = this.set("getAxes", js.undefined)
    @scala.inline
    def setGetColors(value: () => _): Self = this.set("getColors", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetColors: Self = this.set("getColors", js.undefined)
    @scala.inline
    def setGetHighlightItem(value: () => _): Self = this.set("getHighlightItem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHighlightItem: Self = this.set("getHighlightItem", js.undefined)
    @scala.inline
    def setGetInnerPadding(value: () => _): Self = this.set("getInnerPadding", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInnerPadding: Self = this.set("getInnerPadding", js.undefined)
    @scala.inline
    def setGetInsetPadding(value: () => _): Self = this.set("getInsetPadding", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInsetPadding: Self = this.set("getInsetPadding", js.undefined)
    @scala.inline
    def setGetInteractions(value: () => Array): Self = this.set("getInteractions", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInteractions: Self = this.set("getInteractions", js.undefined)
    @scala.inline
    def setGetItemForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => _): Self = this.set("getItemForPoint", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItemForPoint: Self = this.set("getItemForPoint", js.undefined)
    @scala.inline
    def setGetItemsForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Array): Self = this.set("getItemsForPoint", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItemsForPoint: Self = this.set("getItemsForPoint", js.undefined)
    @scala.inline
    def setGetLegend(value: () => _): Self = this.set("getLegend", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLegend: Self = this.set("getLegend", js.undefined)
    @scala.inline
    def setGetLegendStore(value: () => IStore): Self = this.set("getLegendStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLegendStore: Self = this.set("getLegendStore", js.undefined)
    @scala.inline
    def setGetSeries(value: () => _): Self = this.set("getSeries", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSeries: Self = this.set("getSeries", js.undefined)
    @scala.inline
    def setGetShadow(value: () => _): Self = this.set("getShadow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetShadow: Self = this.set("getShadow", js.undefined)
    @scala.inline
    def setGetStore(value: () => IStore): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetSurface(value: (/* name */ js.UndefOr[js.Any], /* type */ js.UndefOr[js.Any]) => ISurface): Self = this.set("getSurface", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetSurface: Self = this.set("getSurface", js.undefined)
    @scala.inline
    def setHighlightItem(value: js.Any): Self = this.set("highlightItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    @scala.inline
    def setInnerPadding(value: js.Any): Self = this.set("innerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerPadding: Self = this.set("innerPadding", js.undefined)
    @scala.inline
    def setInsetPadding(value: js.Any): Self = this.set("insetPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsetPadding: Self = this.set("insetPadding", js.undefined)
    @scala.inline
    def setInteractions(value: Array): Self = this.set("interactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractions: Self = this.set("interactions", js.undefined)
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setRedraw(value: () => Unit): Self = this.set("redraw", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRedraw: Self = this.set("redraw", js.undefined)
    @scala.inline
    def setResumeThicknessChanged(value: () => Unit): Self = this.set("resumeThicknessChanged", js.Any.fromFunction0(value))
    @scala.inline
    def deleteResumeThicknessChanged: Self = this.set("resumeThicknessChanged", js.undefined)
    @scala.inline
    def setScheduleLayout(value: () => Unit): Self = this.set("scheduleLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteScheduleLayout: Self = this.set("scheduleLayout", js.undefined)
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSetAnimate(value: /* animate */ js.UndefOr[js.Any] => Unit): Self = this.set("setAnimate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAnimate: Self = this.set("setAnimate", js.undefined)
    @scala.inline
    def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = this.set("setAxes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAxes: Self = this.set("setAxes", js.undefined)
    @scala.inline
    def setSetColors(value: /* colors */ js.UndefOr[js.Any] => Unit): Self = this.set("setColors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetColors: Self = this.set("setColors", js.undefined)
    @scala.inline
    def setSetHighlightItem(value: /* highlightItem */ js.UndefOr[js.Any] => Unit): Self = this.set("setHighlightItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHighlightItem: Self = this.set("setHighlightItem", js.undefined)
    @scala.inline
    def setSetInnerPadding(value: /* innerPadding */ js.UndefOr[js.Any] => Unit): Self = this.set("setInnerPadding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInnerPadding: Self = this.set("setInnerPadding", js.undefined)
    @scala.inline
    def setSetInsetPadding(value: /* insetPadding */ js.UndefOr[js.Any] => Unit): Self = this.set("setInsetPadding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInsetPadding: Self = this.set("setInsetPadding", js.undefined)
    @scala.inline
    def setSetInteractions(value: /* interactions */ js.UndefOr[Array] => Unit): Self = this.set("setInteractions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetInteractions: Self = this.set("setInteractions", js.undefined)
    @scala.inline
    def setSetLegend(value: /* legend */ js.UndefOr[js.Any] => Unit): Self = this.set("setLegend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLegend: Self = this.set("setLegend", js.undefined)
    @scala.inline
    def setSetSeries(value: /* series */ js.UndefOr[js.Any] => Unit): Self = this.set("setSeries", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSeries: Self = this.set("setSeries", js.undefined)
    @scala.inline
    def setSetShadow(value: /* shadow */ js.UndefOr[js.Any] => Unit): Self = this.set("setShadow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetShadow: Self = this.set("setShadow", js.undefined)
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStore: Self = this.set("setStore", js.undefined)
    @scala.inline
    def setShadow(value: js.Any): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setStore(value: IStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setSuspendThicknessChanged(value: () => Unit): Self = this.set("suspendThicknessChanged", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuspendThicknessChanged: Self = this.set("suspendThicknessChanged", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

