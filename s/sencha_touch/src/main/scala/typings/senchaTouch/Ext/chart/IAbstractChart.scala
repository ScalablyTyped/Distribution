package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.data.IStore
import typings.senchaTouch.Ext.draw.IComponent
import typings.senchaTouch.Ext.draw.ISurface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IAbstractChartMutableBuilder[Self <: IAbstractChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAxes(value: js.Any): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setBackground(value: js.Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBindStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "bindStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBindStoreUndefined: Self = StObject.set(x, "bindStore", js.undefined)
    
    @scala.inline
    def setCancelLayout(value: () => Unit): Self = StObject.set(x, "cancelLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelLayoutUndefined: Self = StObject.set(x, "cancelLayout", js.undefined)
    
    @scala.inline
    def setColors(value: js.Any): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setFlatten(value: (/* surfaces */ js.UndefOr[Array], /* format */ js.UndefOr[String]) => _): Self = StObject.set(x, "flatten", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
    
    @scala.inline
    def setGetAxes(value: () => _): Self = StObject.set(x, "getAxes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAxesUndefined: Self = StObject.set(x, "getAxes", js.undefined)
    
    @scala.inline
    def setGetColors(value: () => _): Self = StObject.set(x, "getColors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColorsUndefined: Self = StObject.set(x, "getColors", js.undefined)
    
    @scala.inline
    def setGetHighlightItem(value: () => _): Self = StObject.set(x, "getHighlightItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHighlightItemUndefined: Self = StObject.set(x, "getHighlightItem", js.undefined)
    
    @scala.inline
    def setGetInnerPadding(value: () => _): Self = StObject.set(x, "getInnerPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInnerPaddingUndefined: Self = StObject.set(x, "getInnerPadding", js.undefined)
    
    @scala.inline
    def setGetInsetPadding(value: () => _): Self = StObject.set(x, "getInsetPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInsetPaddingUndefined: Self = StObject.set(x, "getInsetPadding", js.undefined)
    
    @scala.inline
    def setGetInteractions(value: () => Array): Self = StObject.set(x, "getInteractions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInteractionsUndefined: Self = StObject.set(x, "getInteractions", js.undefined)
    
    @scala.inline
    def setGetItemForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => _): Self = StObject.set(x, "getItemForPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemForPointUndefined: Self = StObject.set(x, "getItemForPoint", js.undefined)
    
    @scala.inline
    def setGetItemsForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getItemsForPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemsForPointUndefined: Self = StObject.set(x, "getItemsForPoint", js.undefined)
    
    @scala.inline
    def setGetLegend(value: () => _): Self = StObject.set(x, "getLegend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLegendStore(value: () => IStore): Self = StObject.set(x, "getLegendStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLegendStoreUndefined: Self = StObject.set(x, "getLegendStore", js.undefined)
    
    @scala.inline
    def setGetLegendUndefined: Self = StObject.set(x, "getLegend", js.undefined)
    
    @scala.inline
    def setGetSeries(value: () => _): Self = StObject.set(x, "getSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeriesUndefined: Self = StObject.set(x, "getSeries", js.undefined)
    
    @scala.inline
    def setGetShadow(value: () => _): Self = StObject.set(x, "getShadow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShadowUndefined: Self = StObject.set(x, "getShadow", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => IStore): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setGetSurface(value: (/* name */ js.UndefOr[js.Any], /* type */ js.UndefOr[js.Any]) => ISurface): Self = StObject.set(x, "getSurface", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSurfaceUndefined: Self = StObject.set(x, "getSurface", js.undefined)
    
    @scala.inline
    def setHighlightItem(value: js.Any): Self = StObject.set(x, "highlightItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    @scala.inline
    def setInnerPadding(value: js.Any): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
    
    @scala.inline
    def setInsetPadding(value: js.Any): Self = StObject.set(x, "insetPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetPaddingUndefined: Self = StObject.set(x, "insetPadding", js.undefined)
    
    @scala.inline
    def setInteractions(value: Array): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setRedraw(value: () => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
    
    @scala.inline
    def setResumeThicknessChanged(value: () => Unit): Self = StObject.set(x, "resumeThicknessChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResumeThicknessChangedUndefined: Self = StObject.set(x, "resumeThicknessChanged", js.undefined)
    
    @scala.inline
    def setScheduleLayout(value: () => Unit): Self = StObject.set(x, "scheduleLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScheduleLayoutUndefined: Self = StObject.set(x, "scheduleLayout", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSetAnimate(value: /* animate */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAnimate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnimateUndefined: Self = StObject.set(x, "setAnimate", js.undefined)
    
    @scala.inline
    def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAxes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAxesUndefined: Self = StObject.set(x, "setAxes", js.undefined)
    
    @scala.inline
    def setSetColors(value: /* colors */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setColors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetColorsUndefined: Self = StObject.set(x, "setColors", js.undefined)
    
    @scala.inline
    def setSetHighlightItem(value: /* highlightItem */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHighlightItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHighlightItemUndefined: Self = StObject.set(x, "setHighlightItem", js.undefined)
    
    @scala.inline
    def setSetInnerPadding(value: /* innerPadding */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInnerPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInnerPaddingUndefined: Self = StObject.set(x, "setInnerPadding", js.undefined)
    
    @scala.inline
    def setSetInsetPadding(value: /* insetPadding */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setInsetPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInsetPaddingUndefined: Self = StObject.set(x, "setInsetPadding", js.undefined)
    
    @scala.inline
    def setSetInteractions(value: /* interactions */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setInteractions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInteractionsUndefined: Self = StObject.set(x, "setInteractions", js.undefined)
    
    @scala.inline
    def setSetLegend(value: /* legend */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLegend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLegendUndefined: Self = StObject.set(x, "setLegend", js.undefined)
    
    @scala.inline
    def setSetSeries(value: /* series */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSeriesUndefined: Self = StObject.set(x, "setSeries", js.undefined)
    
    @scala.inline
    def setSetShadow(value: /* shadow */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setShadow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetShadowUndefined: Self = StObject.set(x, "setShadow", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    @scala.inline
    def setShadow(value: js.Any): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setStore(value: IStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setSuspendThicknessChanged(value: () => Unit): Self = StObject.set(x, "suspendThicknessChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuspendThicknessChangedUndefined: Self = StObject.set(x, "suspendThicknessChanged", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
