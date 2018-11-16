package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISeries
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Object) */
  var animate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var colors: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the value of animate
  		* @returns Object
  		*/
  var getAnimate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of colors
  		* @returns Array
  		*/
  var getColors: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean|Array
  		*/
  var getHidden: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightCfg
  		* @returns Object
  		*/
  var getHighlightCfg: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightItem
  		* @returns Object
  		*/
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @param target Object optional target to receive the result
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of itemInstancing
  		* @returns Object
  		*/
  var getItemInstancing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelField
  		* @returns String/String[]
  		*/
  var getLabelField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelOverflowPadding
  		* @returns Number
  		*/
  var getLabelOverflowPadding: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of marker
  		* @returns Object
  		*/
  var getMarker: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of markerSubStyle
  		* @returns Object
  		*/
  var getMarkerSubStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of overlaySurface
  		* @returns Object
  		*/
  var getOverlaySurface: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of showInLegend
  		* @returns Boolean
  		*/
  var getShowInLegend: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Performs drawing of this series  */
  var getSprites: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of subStyle
  		* @returns Object
  		*/
  var getSubStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of surface
  		* @returns Object
  		*/
  var getSurface: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (Boolean|Array) */
  var hidden: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var itemInstancing: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/String[]) */
  var labelField: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var marker: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var markerSubStyle: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var overlaySurface: js.UndefOr[js.Any] = js.undefined
  /** [Method] Provide legend information to target array
  		* @param target Array The information consists:
  		*/
  var provideLegendInfo: js.UndefOr[
    js.Function1[/* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ISeries: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Property] (String) */
  var seriesType: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of animate
  		* @param animate Object The new value.
  		*/
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of colors
  		* @param colors Array The new value.
  		*/
  var setColors: js.UndefOr[
    js.Function1[/* colors */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean|Array The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method]
  		* @param index Number
  		* @param value Boolean
  		*/
  var setHiddenByIndex: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of highlightCfg
  		* @param highlightCfg Object The new value.
  		*/
  var setHighlightCfg: js.UndefOr[js.Function1[/* highlightCfg */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of highlightItem
  		* @param highlightItem Object The new value.
  		*/
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemInstancing
  		* @param itemInstancing Object The new value.
  		*/
  var setItemInstancing: js.UndefOr[js.Function1[/* itemInstancing */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		* @returns Object/String The attributes that have been changed or added, or the text for the label. Example to enclose every other label in parentheses: renderer: function (text) { if (index % 2 == 0) { return '(' + text + ')' } } Default value: null.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of labelField
  		* @param labelField String/String[] The new value.
  		*/
  var setLabelField: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of labelOverflowPadding
  		* @param labelOverflowPadding Number The new value.
  		*/
  var setLabelOverflowPadding: js.UndefOr[js.Function1[/* labelOverflowPadding */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of marker
  		* @param marker Object The new value.
  		*/
  var setMarker: js.UndefOr[js.Function1[/* marker */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of markerSubStyle
  		* @param markerSubStyle Object The new value.
  		*/
  var setMarkerSubStyle: js.UndefOr[js.Function1[/* markerSubStyle */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of overlaySurface
  		* @param overlaySurface Object The new value.
  		*/
  var setOverlaySurface: js.UndefOr[js.Function1[/* overlaySurface */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns Object The attributes that have been changed or added. Note: it is usually possible to add or modify the attributes directly into the config parameter and not return anything, but returning an object with only those attributes that have been changed may allow for optimizations in the rendering of some series. Example to draw every other item in red: renderer: function (sprite, config, rendererData, index) { if (index % 2 == 0) { return { strokeStyle: 'red' }; } }
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the value of showInLegend
  		* @param showInLegend Boolean The new value.
  		*/
  var setShowInLegend: js.UndefOr[js.Function1[/* showInLegend */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of subStyle
  		* @param subStyle Object The new value.
  		*/
  var setSubStyle: js.UndefOr[js.Function1[/* subStyle */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of surface
  		* @param surface Object The new value.
  		*/
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var subStyle: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var surface: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

