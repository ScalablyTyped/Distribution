package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISeries
  extends StObject
     with IObservable {
  
  /** [Config Option] (Object) */
  var animate: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var background: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Array) */
  var colors: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns the value of animate
    * @returns Object
    */
  var getAnimate: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of background
    * @returns Object
    */
  var getBackground: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of colors
    * @returns Array
    */
  var getColors: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of hidden
    * @returns Boolean|Array
    */
  var getHidden: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of highlightCfg
    * @returns Object
    */
  var getHighlightCfg: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of highlightItem
    * @returns Object
    */
  var getHighlightItem: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
    * @param x Number
    * @param y Number
    * @param target Object optional target to receive the result
    * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
    */
  var getItemForPoint: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* target */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  /** [Method] Returns the value of itemInstancing
    * @returns Object
    */
  var getItemInstancing: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of label
    * @returns Object
    */
  var getLabel: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of labelField
    * @returns String/String[]
    */
  var getLabelField: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of labelOverflowPadding
    * @returns Number
    */
  var getLabelOverflowPadding: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of marker
    * @returns Object
    */
  var getMarker: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of markerSubStyle
    * @returns Object
    */
  var getMarkerSubStyle: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of overlaySurface
    * @returns Object
    */
  var getOverlaySurface: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of renderer
    * @returns Function
    */
  var getRenderer: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of showInLegend
    * @returns Boolean
    */
  var getShowInLegend: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Performs drawing of this series  */
  var getSprites: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of style
    * @returns Object
    */
  var getStyle: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of subStyle
    * @returns Object
    */
  var getSubStyle: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of surface
    * @returns Object
    */
  var getSurface: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Boolean|Array) */
  var hidden: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var highlightCfg: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var itemInstancing: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var label: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var labelField: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Object) */
  var marker: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var markerSubStyle: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var overlaySurface: js.UndefOr[Any] = js.undefined
  
  /** [Method] Provide legend information to target array
    * @param target Array The information consists:
    */
  var provideLegendInfo: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_ISeries: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
  ] = js.undefined
  
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[Any] = js.undefined
  
  /** [Property] (String) */
  var seriesType: js.UndefOr[String] = js.undefined
  
  /** [Method] Sets the value of animate
    * @param animate Object The new value.
    */
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of background
    * @param background Object The new value.
    */
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of colors
    * @param colors Array The new value.
    */
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of hidden
    * @param hidden Boolean|Array The new value.
    */
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method]
    * @param index Number
    * @param value Boolean
    */
  var setHiddenByIndex: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  
  /** [Method] Sets the value of highlightCfg
    * @param highlightCfg Object The new value.
    */
  var setHighlightCfg: js.UndefOr[js.Function1[/* highlightCfg */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of highlightItem
    * @param highlightItem Object The new value.
    */
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of itemInstancing
    * @param itemInstancing Object The new value.
    */
  var setItemInstancing: js.UndefOr[js.Function1[/* itemInstancing */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of label
    * @param label Object The new value.
    * @returns Object/String The attributes that have been changed or added, or the text for the label. Example to enclose every other label in parentheses: renderer: function (text) { if (index % 2 == 0) { return '(' + text + ')' } } Default value: null.
    */
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Sets the value of labelField
    * @param labelField String/String[] The new value.
    */
  var setLabelField: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of labelOverflowPadding
    * @param labelOverflowPadding Number The new value.
    */
  var setLabelOverflowPadding: js.UndefOr[js.Function1[/* labelOverflowPadding */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of marker
    * @param marker Object The new value.
    */
  var setMarker: js.UndefOr[js.Function1[/* marker */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of markerSubStyle
    * @param markerSubStyle Object The new value.
    */
  var setMarkerSubStyle: js.UndefOr[js.Function1[/* markerSubStyle */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of overlaySurface
    * @param overlaySurface Object The new value.
    */
  var setOverlaySurface: js.UndefOr[js.Function1[/* overlaySurface */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of renderer
    * @param renderer Function The new value.
    * @returns Object The attributes that have been changed or added. Note: it is usually possible to add or modify the attributes directly into the config parameter and not return anything, but returning an object with only those attributes that have been changed may allow for optimizations in the rendering of some series. Example to draw every other item in red: renderer: function (sprite, config, rendererData, index) { if (index % 2 == 0) { return { strokeStyle: 'red' }; } }
    */
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Sets the value of showInLegend
    * @param showInLegend Boolean The new value.
    */
  var setShowInLegend: js.UndefOr[js.Function1[/* showInLegend */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of store
    * @param store Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of style
    * @param style Object The new value.
    */
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of subStyle
    * @param subStyle Object The new value.
    */
  var setSubStyle: js.UndefOr[js.Function1[/* subStyle */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of surface
    * @param surface Object The new value.
    */
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var store: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var style: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var subStyle: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var surface: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  
  /** [Property] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}
object ISeries {
  
  inline def apply(): ISeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISeries] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackground(value: Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColors(value: Array): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setGetAnimate(value: () => Any): Self = StObject.set(x, "getAnimate", js.Any.fromFunction0(value))
    
    inline def setGetAnimateUndefined: Self = StObject.set(x, "getAnimate", js.undefined)
    
    inline def setGetBackground(value: () => Any): Self = StObject.set(x, "getBackground", js.Any.fromFunction0(value))
    
    inline def setGetBackgroundUndefined: Self = StObject.set(x, "getBackground", js.undefined)
    
    inline def setGetColors(value: () => Array): Self = StObject.set(x, "getColors", js.Any.fromFunction0(value))
    
    inline def setGetColorsUndefined: Self = StObject.set(x, "getColors", js.undefined)
    
    inline def setGetHidden(value: () => Any): Self = StObject.set(x, "getHidden", js.Any.fromFunction0(value))
    
    inline def setGetHiddenUndefined: Self = StObject.set(x, "getHidden", js.undefined)
    
    inline def setGetHighlightCfg(value: () => Any): Self = StObject.set(x, "getHighlightCfg", js.Any.fromFunction0(value))
    
    inline def setGetHighlightCfgUndefined: Self = StObject.set(x, "getHighlightCfg", js.undefined)
    
    inline def setGetHighlightItem(value: () => Any): Self = StObject.set(x, "getHighlightItem", js.Any.fromFunction0(value))
    
    inline def setGetHighlightItemUndefined: Self = StObject.set(x, "getHighlightItem", js.undefined)
    
    inline def setGetItemForPoint(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* target */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "getItemForPoint", js.Any.fromFunction3(value))
    
    inline def setGetItemForPointUndefined: Self = StObject.set(x, "getItemForPoint", js.undefined)
    
    inline def setGetItemInstancing(value: () => Any): Self = StObject.set(x, "getItemInstancing", js.Any.fromFunction0(value))
    
    inline def setGetItemInstancingUndefined: Self = StObject.set(x, "getItemInstancing", js.undefined)
    
    inline def setGetLabel(value: () => Any): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setGetLabelField(value: () => Any): Self = StObject.set(x, "getLabelField", js.Any.fromFunction0(value))
    
    inline def setGetLabelFieldUndefined: Self = StObject.set(x, "getLabelField", js.undefined)
    
    inline def setGetLabelOverflowPadding(value: () => Double): Self = StObject.set(x, "getLabelOverflowPadding", js.Any.fromFunction0(value))
    
    inline def setGetLabelOverflowPaddingUndefined: Self = StObject.set(x, "getLabelOverflowPadding", js.undefined)
    
    inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
    
    inline def setGetMarker(value: () => Any): Self = StObject.set(x, "getMarker", js.Any.fromFunction0(value))
    
    inline def setGetMarkerSubStyle(value: () => Any): Self = StObject.set(x, "getMarkerSubStyle", js.Any.fromFunction0(value))
    
    inline def setGetMarkerSubStyleUndefined: Self = StObject.set(x, "getMarkerSubStyle", js.undefined)
    
    inline def setGetMarkerUndefined: Self = StObject.set(x, "getMarker", js.undefined)
    
    inline def setGetOverlaySurface(value: () => Any): Self = StObject.set(x, "getOverlaySurface", js.Any.fromFunction0(value))
    
    inline def setGetOverlaySurfaceUndefined: Self = StObject.set(x, "getOverlaySurface", js.undefined)
    
    inline def setGetRenderer(value: () => Any): Self = StObject.set(x, "getRenderer", js.Any.fromFunction0(value))
    
    inline def setGetRendererUndefined: Self = StObject.set(x, "getRenderer", js.undefined)
    
    inline def setGetShowInLegend(value: () => Boolean): Self = StObject.set(x, "getShowInLegend", js.Any.fromFunction0(value))
    
    inline def setGetShowInLegendUndefined: Self = StObject.set(x, "getShowInLegend", js.undefined)
    
    inline def setGetSprites(value: () => Unit): Self = StObject.set(x, "getSprites", js.Any.fromFunction0(value))
    
    inline def setGetSpritesUndefined: Self = StObject.set(x, "getSprites", js.undefined)
    
    inline def setGetStyle(value: () => Any): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
    
    inline def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
    
    inline def setGetSubStyle(value: () => Any): Self = StObject.set(x, "getSubStyle", js.Any.fromFunction0(value))
    
    inline def setGetSubStyleUndefined: Self = StObject.set(x, "getSubStyle", js.undefined)
    
    inline def setGetSurface(value: () => Any): Self = StObject.set(x, "getSurface", js.Any.fromFunction0(value))
    
    inline def setGetSurfaceUndefined: Self = StObject.set(x, "getSurface", js.undefined)
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    inline def setHidden(value: Any): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHighlightCfg(value: Any): Self = StObject.set(x, "highlightCfg", value.asInstanceOf[js.Any])
    
    inline def setHighlightCfgUndefined: Self = StObject.set(x, "highlightCfg", js.undefined)
    
    inline def setHighlightItem(value: Any): Self = StObject.set(x, "highlightItem", value.asInstanceOf[js.Any])
    
    inline def setHighlightItemUndefined: Self = StObject.set(x, "highlightItem", js.undefined)
    
    inline def setItemInstancing(value: Any): Self = StObject.set(x, "itemInstancing", value.asInstanceOf[js.Any])
    
    inline def setItemInstancingUndefined: Self = StObject.set(x, "itemInstancing", js.undefined)
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelField(value: Any): Self = StObject.set(x, "labelField", value.asInstanceOf[js.Any])
    
    inline def setLabelFieldUndefined: Self = StObject.set(x, "labelField", js.undefined)
    
    inline def setLabelOverflowPadding(value: Double): Self = StObject.set(x, "labelOverflowPadding", value.asInstanceOf[js.Any])
    
    inline def setLabelOverflowPaddingUndefined: Self = StObject.set(x, "labelOverflowPadding", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMarker(value: Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerSubStyle(value: Any): Self = StObject.set(x, "markerSubStyle", value.asInstanceOf[js.Any])
    
    inline def setMarkerSubStyleUndefined: Self = StObject.set(x, "markerSubStyle", js.undefined)
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setOverlaySurface(value: Any): Self = StObject.set(x, "overlaySurface", value.asInstanceOf[js.Any])
    
    inline def setOverlaySurfaceUndefined: Self = StObject.set(x, "overlaySurface", js.undefined)
    
    inline def setProvideLegendInfo(value: /* target */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "provideLegendInfo", js.Any.fromFunction1(value))
    
    inline def setProvideLegendInfoUndefined: Self = StObject.set(x, "provideLegendInfo", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRenderer(value: Any): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSeriesType(value: String): Self = StObject.set(x, "seriesType", value.asInstanceOf[js.Any])
    
    inline def setSeriesTypeUndefined: Self = StObject.set(x, "seriesType", js.undefined)
    
    inline def setSetAnimate(value: /* animate */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAnimate", js.Any.fromFunction1(value))
    
    inline def setSetAnimateUndefined: Self = StObject.set(x, "setAnimate", js.undefined)
    
    inline def setSetBackground(value: /* background */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBackground", js.Any.fromFunction1(value))
    
    inline def setSetBackgroundUndefined: Self = StObject.set(x, "setBackground", js.undefined)
    
    inline def setSetColors(value: /* colors */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setColors", js.Any.fromFunction1(value))
    
    inline def setSetColorsUndefined: Self = StObject.set(x, "setColors", js.undefined)
    
    inline def setSetHidden(value: /* hidden */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHidden", js.Any.fromFunction1(value))
    
    inline def setSetHiddenByIndex(value: (/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setHiddenByIndex", js.Any.fromFunction2(value))
    
    inline def setSetHiddenByIndexUndefined: Self = StObject.set(x, "setHiddenByIndex", js.undefined)
    
    inline def setSetHiddenUndefined: Self = StObject.set(x, "setHidden", js.undefined)
    
    inline def setSetHighlightCfg(value: /* highlightCfg */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHighlightCfg", js.Any.fromFunction1(value))
    
    inline def setSetHighlightCfgUndefined: Self = StObject.set(x, "setHighlightCfg", js.undefined)
    
    inline def setSetHighlightItem(value: /* highlightItem */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHighlightItem", js.Any.fromFunction1(value))
    
    inline def setSetHighlightItemUndefined: Self = StObject.set(x, "setHighlightItem", js.undefined)
    
    inline def setSetItemInstancing(value: /* itemInstancing */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setItemInstancing", js.Any.fromFunction1(value))
    
    inline def setSetItemInstancingUndefined: Self = StObject.set(x, "setItemInstancing", js.undefined)
    
    inline def setSetLabel(value: /* label */ js.UndefOr[Any] => Any): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    inline def setSetLabelField(value: /* labelField */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLabelField", js.Any.fromFunction1(value))
    
    inline def setSetLabelFieldUndefined: Self = StObject.set(x, "setLabelField", js.undefined)
    
    inline def setSetLabelOverflowPadding(value: /* labelOverflowPadding */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setLabelOverflowPadding", js.Any.fromFunction1(value))
    
    inline def setSetLabelOverflowPaddingUndefined: Self = StObject.set(x, "setLabelOverflowPadding", js.undefined)
    
    inline def setSetLabelUndefined: Self = StObject.set(x, "setLabel", js.undefined)
    
    inline def setSetMarker(value: /* marker */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMarker", js.Any.fromFunction1(value))
    
    inline def setSetMarkerSubStyle(value: /* markerSubStyle */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMarkerSubStyle", js.Any.fromFunction1(value))
    
    inline def setSetMarkerSubStyleUndefined: Self = StObject.set(x, "setMarkerSubStyle", js.undefined)
    
    inline def setSetMarkerUndefined: Self = StObject.set(x, "setMarker", js.undefined)
    
    inline def setSetOverlaySurface(value: /* overlaySurface */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setOverlaySurface", js.Any.fromFunction1(value))
    
    inline def setSetOverlaySurfaceUndefined: Self = StObject.set(x, "setOverlaySurface", js.undefined)
    
    inline def setSetRenderer(value: /* renderer */ js.UndefOr[Any] => Any): Self = StObject.set(x, "setRenderer", js.Any.fromFunction1(value))
    
    inline def setSetRendererUndefined: Self = StObject.set(x, "setRenderer", js.undefined)
    
    inline def setSetShowInLegend(value: /* showInLegend */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setShowInLegend", js.Any.fromFunction1(value))
    
    inline def setSetShowInLegendUndefined: Self = StObject.set(x, "setShowInLegend", js.undefined)
    
    inline def setSetStore(value: /* store */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
    
    inline def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    inline def setSetStyle(value: /* style */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    
    inline def setSetSubStyle(value: /* subStyle */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setSubStyle", js.Any.fromFunction1(value))
    
    inline def setSetSubStyleUndefined: Self = StObject.set(x, "setSubStyle", js.undefined)
    
    inline def setSetSurface(value: /* surface */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setSurface", js.Any.fromFunction1(value))
    
    inline def setSetSurfaceUndefined: Self = StObject.set(x, "setSurface", js.undefined)
    
    inline def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    inline def setShowInLegend(value: Boolean): Self = StObject.set(x, "showInLegend", value.asInstanceOf[js.Any])
    
    inline def setShowInLegendUndefined: Self = StObject.set(x, "showInLegend", js.undefined)
    
    inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubStyle(value: Any): Self = StObject.set(x, "subStyle", value.asInstanceOf[js.Any])
    
    inline def setSubStyleUndefined: Self = StObject.set(x, "subStyle", js.undefined)
    
    inline def setSurface(value: Any): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
    
    inline def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
