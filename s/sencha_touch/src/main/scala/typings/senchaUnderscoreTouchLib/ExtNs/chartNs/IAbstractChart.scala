package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAbstractChart
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.IComponent {
  /** [Config Option] (Boolean/Object) */
  var animate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis/Array/Object) */
  var axes: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Method] Changes the data store bound to this chart and refreshes it
  		* @param store Ext.data.Store The store to bind to this chart.
  		*/
  var bindStore: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit]
  ] = js.undefined
  /** [Method] Cancel a scheduled layout  */
  var cancelLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Array) */
  var colors: js.UndefOr[js.Any] = js.undefined
  /** [Method] Flattens the given chart surfaces into a single image
  		* @param surfaces Array A list of chart's surfaces to flatten.
  		* @param format String If set to 'image', the method will return an Image object. Otherwise, the dataURL  of the flattened image will be returned.
  		* @returns String|Image An Image DOM element containing the flattened image or its dataURL.
  		*/
  var flatten: js.UndefOr[
    js.Function2[
      /* surfaces */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* format */ js.UndefOr[java.lang.String], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of axes
  		* @returns Ext.chart.axis.Axis/Array/Object
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of colors
  		* @returns Boolean/Array
  		*/
  var getColors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightItem
  		* @returns Object
  		*/
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of innerPadding
  		* @returns Object
  		*/
  var getInnerPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of insetPadding
  		* @returns Object|Number
  		*/
  var getInsetPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of interactions
  		* @returns Array
  		*/
  var getInteractions: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Given an x y point relative to the chart find and return the first series item that matches that point
  		* @param x Number
  		* @param y Number
  		* @returns Object An object with series and item properties, or false if no item found.
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], _]
  ] = js.undefined
  /** [Method] Given an x y point relative to the chart find and return all series items that match that point
  		* @param x Number
  		* @param y Number
  		* @returns Array An array of objects with series and item properties.
  		*/
  var getItemsForPoint: js.UndefOr[
    js.Function2[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns the value of legend
  		* @returns Ext.chart.Legend/Object
  		*/
  var getLegend: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Return the legend store that contains all the legend information
  		* @returns Ext.data.Store
  		*/
  var getLegendStore: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore]] = js.undefined
  /** [Method] Returns the value of series
  		* @returns Ext.chart.series.Series/Array
  		*/
  var getSeries: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of shadow
  		* @returns Boolean/Object
  		*/
  var getShadow: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store
  		*/
  var getStore: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore]] = js.undefined
  /** [Method] Get a surface by the given id or create one if it doesn t exist
  		* @param name Object
  		* @param type Object
  		* @returns Ext.draw.Surface
  		*/
  @JSName("getSurface")
  var getSurface_IAbstractChart: js.UndefOr[
    js.Function2[
      /* name */ js.UndefOr[js.Any], 
      /* type */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var innerPadding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Number) */
  var insetPadding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var interactions: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.chart.Legend/Object) */
  var legend: js.UndefOr[js.Any] = js.undefined
  /** [Method] Redraw the chart  */
  var redraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resume the layout initialized by thickness change */
  var resumeThicknessChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Schedule a layout at next frame  */
  var scheduleLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Ext.chart.series.Series/Array) */
  var series: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of animate
  		* @param animate Boolean/Object The new value.
  		*/
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of axes
  		* @param axes Ext.chart.axis.Axis/Array/Object The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of colors
  		* @param colors Boolean/Array The new value.
  		*/
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of highlightItem
  		* @param highlightItem Object The new value.
  		*/
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of innerPadding
  		* @param innerPadding Object The new value.
  		*/
  var setInnerPadding: js.UndefOr[js.Function1[/* innerPadding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of insetPadding
  		* @param insetPadding Object|Number The new value.
  		*/
  var setInsetPadding: js.UndefOr[js.Function1[/* insetPadding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of interactions
  		* @param interactions Array The new value.
  		*/
  var setInteractions: js.UndefOr[
    js.Function1[/* interactions */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of legend
  		* @param legend Ext.chart.Legend/Object The new value.
  		*/
  var setLegend: js.UndefOr[js.Function1[/* legend */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of series
  		* @param series Ext.chart.series.Series/Array The new value.
  		*/
  var setSeries: js.UndefOr[js.Function1[/* series */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of shadow
  		* @param shadow Boolean/Object The new value.
  		*/
  var setShadow: js.UndefOr[js.Function1[/* shadow */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store The new value.
  		*/
  var setStore: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore] = js.undefined
  /** [Method] Suspend the layout initialized by thickness change */
  var suspendThicknessChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (String) */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

