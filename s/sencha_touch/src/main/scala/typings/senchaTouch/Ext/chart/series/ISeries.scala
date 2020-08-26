package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISeries extends IObservable {
  /** [Config Option] (Object) */
  var animate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Array) */
  var colors: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of animate
    * @returns Object
    */
  var getAnimate: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of background
    * @returns Object
    */
  var getBackground: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of colors
    * @returns Array
    */
  var getColors: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of hidden
    * @returns Boolean|Array
    */
  var getHidden: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of highlightCfg
    * @returns Object
    */
  var getHighlightCfg: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of highlightItem
    * @returns Object
    */
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.native
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
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of itemInstancing
    * @returns Object
    */
  var getItemInstancing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of label
    * @returns Object
    */
  var getLabel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of labelField
    * @returns String/String[]
    */
  var getLabelField: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of labelOverflowPadding
    * @returns Number
    */
  var getLabelOverflowPadding: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of marker
    * @returns Object
    */
  var getMarker: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of markerSubStyle
    * @returns Object
    */
  var getMarkerSubStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of overlaySurface
    * @returns Object
    */
  var getOverlaySurface: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of renderer
    * @returns Function
    */
  var getRenderer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of showInLegend
    * @returns Boolean
    */
  var getShowInLegend: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Performs drawing of this series  */
  var getSprites: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of style
    * @returns Object
    */
  var getStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of subStyle
    * @returns Object
    */
  var getSubStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of surface
    * @returns Object
    */
  var getSurface: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Boolean|Array) */
  var hidden: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var itemInstancing: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/String[]) */
  var labelField: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var marker: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var markerSubStyle: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var overlaySurface: js.UndefOr[js.Any] = js.native
  /** [Method] Provide legend information to target array
    * @param target Array The information consists:
    */
  var provideLegendInfo: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_ISeries: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Property] (String) */
  var seriesType: js.UndefOr[String] = js.native
  /** [Method] Sets the value of animate
    * @param animate Object The new value.
    */
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of background
    * @param background Object The new value.
    */
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of colors
    * @param colors Array The new value.
    */
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of hidden
    * @param hidden Boolean|Array The new value.
    */
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method]
    * @param index Number
    * @param value Boolean
    */
  var setHiddenByIndex: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Sets the value of highlightCfg
    * @param highlightCfg Object The new value.
    */
  var setHighlightCfg: js.UndefOr[js.Function1[/* highlightCfg */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of highlightItem
    * @param highlightItem Object The new value.
    */
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemInstancing
    * @param itemInstancing Object The new value.
    */
  var setItemInstancing: js.UndefOr[js.Function1[/* itemInstancing */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of label
    * @param label Object The new value.
    * @returns Object/String The attributes that have been changed or added, or the text for the label. Example to enclose every other label in parentheses: renderer: function (text) { if (index % 2 == 0) { return '(' + text + ')' } } Default value: null.
    */
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of labelField
    * @param labelField String/String[] The new value.
    */
  var setLabelField: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of labelOverflowPadding
    * @param labelOverflowPadding Number The new value.
    */
  var setLabelOverflowPadding: js.UndefOr[js.Function1[/* labelOverflowPadding */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of marker
    * @param marker Object The new value.
    */
  var setMarker: js.UndefOr[js.Function1[/* marker */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of markerSubStyle
    * @param markerSubStyle Object The new value.
    */
  var setMarkerSubStyle: js.UndefOr[js.Function1[/* markerSubStyle */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of overlaySurface
    * @param overlaySurface Object The new value.
    */
  var setOverlaySurface: js.UndefOr[js.Function1[/* overlaySurface */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of renderer
    * @param renderer Function The new value.
    * @returns Object The attributes that have been changed or added. Note: it is usually possible to add or modify the attributes directly into the config parameter and not return anything, but returning an object with only those attributes that have been changed may allow for optimizations in the rendering of some series. Example to draw every other item in red: renderer: function (sprite, config, rendererData, index) { if (index % 2 == 0) { return { strokeStyle: 'red' }; } }
    */
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of showInLegend
    * @param showInLegend Boolean The new value.
    */
  var setShowInLegend: js.UndefOr[js.Function1[/* showInLegend */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of store
    * @param store Object The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of style
    * @param style Object The new value.
    */
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of subStyle
    * @param subStyle Object The new value.
    */
  var setSubStyle: js.UndefOr[js.Function1[/* subStyle */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of surface
    * @param surface Object The new value.
    */
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var subStyle: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var surface: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var `type`: js.UndefOr[String] = js.native
}

object ISeries {
  @scala.inline
  def apply(): ISeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeries]
  }
  @scala.inline
  implicit class ISeriesOps[Self <: ISeries] (val x: Self) extends AnyVal {
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
    def setBackground(value: js.Any): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setColors(value: Array): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setGetAnimate(value: () => _): Self = this.set("getAnimate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAnimate: Self = this.set("getAnimate", js.undefined)
    @scala.inline
    def setGetBackground(value: () => _): Self = this.set("getBackground", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBackground: Self = this.set("getBackground", js.undefined)
    @scala.inline
    def setGetColors(value: () => Array): Self = this.set("getColors", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetColors: Self = this.set("getColors", js.undefined)
    @scala.inline
    def setGetHidden(value: () => _): Self = this.set("getHidden", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHidden: Self = this.set("getHidden", js.undefined)
    @scala.inline
    def setGetHighlightCfg(value: () => _): Self = this.set("getHighlightCfg", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHighlightCfg: Self = this.set("getHighlightCfg", js.undefined)
    @scala.inline
    def setGetHighlightItem(value: () => _): Self = this.set("getHighlightItem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHighlightItem: Self = this.set("getHighlightItem", js.undefined)
    @scala.inline
    def setGetItemForPoint(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* target */ js.UndefOr[js.Any]) => _
    ): Self = this.set("getItemForPoint", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetItemForPoint: Self = this.set("getItemForPoint", js.undefined)
    @scala.inline
    def setGetItemInstancing(value: () => _): Self = this.set("getItemInstancing", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItemInstancing: Self = this.set("getItemInstancing", js.undefined)
    @scala.inline
    def setGetLabel(value: () => _): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    @scala.inline
    def setGetLabelField(value: () => _): Self = this.set("getLabelField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelField: Self = this.set("getLabelField", js.undefined)
    @scala.inline
    def setGetLabelOverflowPadding(value: () => Double): Self = this.set("getLabelOverflowPadding", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelOverflowPadding: Self = this.set("getLabelOverflowPadding", js.undefined)
    @scala.inline
    def setGetMarker(value: () => _): Self = this.set("getMarker", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMarker: Self = this.set("getMarker", js.undefined)
    @scala.inline
    def setGetMarkerSubStyle(value: () => _): Self = this.set("getMarkerSubStyle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMarkerSubStyle: Self = this.set("getMarkerSubStyle", js.undefined)
    @scala.inline
    def setGetOverlaySurface(value: () => _): Self = this.set("getOverlaySurface", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOverlaySurface: Self = this.set("getOverlaySurface", js.undefined)
    @scala.inline
    def setGetRenderer(value: () => _): Self = this.set("getRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRenderer: Self = this.set("getRenderer", js.undefined)
    @scala.inline
    def setGetShowInLegend(value: () => Boolean): Self = this.set("getShowInLegend", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetShowInLegend: Self = this.set("getShowInLegend", js.undefined)
    @scala.inline
    def setGetSprites(value: () => Unit): Self = this.set("getSprites", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSprites: Self = this.set("getSprites", js.undefined)
    @scala.inline
    def setGetStyle(value: () => _): Self = this.set("getStyle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStyle: Self = this.set("getStyle", js.undefined)
    @scala.inline
    def setGetSubStyle(value: () => _): Self = this.set("getSubStyle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubStyle: Self = this.set("getSubStyle", js.undefined)
    @scala.inline
    def setGetSurface(value: () => _): Self = this.set("getSurface", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSurface: Self = this.set("getSurface", js.undefined)
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    @scala.inline
    def setHidden(value: js.Any): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHighlightCfg(value: js.Any): Self = this.set("highlightCfg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCfg: Self = this.set("highlightCfg", js.undefined)
    @scala.inline
    def setHighlightItem(value: js.Any): Self = this.set("highlightItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    @scala.inline
    def setItemInstancing(value: js.Any): Self = this.set("itemInstancing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemInstancing: Self = this.set("itemInstancing", js.undefined)
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelField(value: js.Any): Self = this.set("labelField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelField: Self = this.set("labelField", js.undefined)
    @scala.inline
    def setLabelOverflowPadding(value: Double): Self = this.set("labelOverflowPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOverflowPadding: Self = this.set("labelOverflowPadding", js.undefined)
    @scala.inline
    def setMarker(value: js.Any): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setMarkerSubStyle(value: js.Any): Self = this.set("markerSubStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSubStyle: Self = this.set("markerSubStyle", js.undefined)
    @scala.inline
    def setOverlaySurface(value: js.Any): Self = this.set("overlaySurface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlaySurface: Self = this.set("overlaySurface", js.undefined)
    @scala.inline
    def setProvideLegendInfo(value: /* target */ js.UndefOr[Array] => Unit): Self = this.set("provideLegendInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProvideLegendInfo: Self = this.set("provideLegendInfo", js.undefined)
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSeriesType(value: String): Self = this.set("seriesType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesType: Self = this.set("seriesType", js.undefined)
    @scala.inline
    def setSetAnimate(value: /* animate */ js.UndefOr[js.Any] => Unit): Self = this.set("setAnimate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAnimate: Self = this.set("setAnimate", js.undefined)
    @scala.inline
    def setSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = this.set("setBackground", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBackground: Self = this.set("setBackground", js.undefined)
    @scala.inline
    def setSetColors(value: /* colors */ js.UndefOr[Array] => Unit): Self = this.set("setColors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetColors: Self = this.set("setColors", js.undefined)
    @scala.inline
    def setSetHidden(value: /* hidden */ js.UndefOr[js.Any] => Unit): Self = this.set("setHidden", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHidden: Self = this.set("setHidden", js.undefined)
    @scala.inline
    def setSetHiddenByIndex(value: (/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean]) => Unit): Self = this.set("setHiddenByIndex", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetHiddenByIndex: Self = this.set("setHiddenByIndex", js.undefined)
    @scala.inline
    def setSetHighlightCfg(value: /* highlightCfg */ js.UndefOr[js.Any] => Unit): Self = this.set("setHighlightCfg", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHighlightCfg: Self = this.set("setHighlightCfg", js.undefined)
    @scala.inline
    def setSetHighlightItem(value: /* highlightItem */ js.UndefOr[js.Any] => Unit): Self = this.set("setHighlightItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHighlightItem: Self = this.set("setHighlightItem", js.undefined)
    @scala.inline
    def setSetItemInstancing(value: /* itemInstancing */ js.UndefOr[js.Any] => Unit): Self = this.set("setItemInstancing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetItemInstancing: Self = this.set("setItemInstancing", js.undefined)
    @scala.inline
    def setSetLabel(value: /* label */ js.UndefOr[js.Any] => _): Self = this.set("setLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabel: Self = this.set("setLabel", js.undefined)
    @scala.inline
    def setSetLabelField(value: /* labelField */ js.UndefOr[js.Any] => Unit): Self = this.set("setLabelField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelField: Self = this.set("setLabelField", js.undefined)
    @scala.inline
    def setSetLabelOverflowPadding(value: /* labelOverflowPadding */ js.UndefOr[Double] => Unit): Self = this.set("setLabelOverflowPadding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLabelOverflowPadding: Self = this.set("setLabelOverflowPadding", js.undefined)
    @scala.inline
    def setSetMarker(value: /* marker */ js.UndefOr[js.Any] => Unit): Self = this.set("setMarker", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMarker: Self = this.set("setMarker", js.undefined)
    @scala.inline
    def setSetMarkerSubStyle(value: /* markerSubStyle */ js.UndefOr[js.Any] => Unit): Self = this.set("setMarkerSubStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMarkerSubStyle: Self = this.set("setMarkerSubStyle", js.undefined)
    @scala.inline
    def setSetOverlaySurface(value: /* overlaySurface */ js.UndefOr[js.Any] => Unit): Self = this.set("setOverlaySurface", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOverlaySurface: Self = this.set("setOverlaySurface", js.undefined)
    @scala.inline
    def setSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => _): Self = this.set("setRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRenderer: Self = this.set("setRenderer", js.undefined)
    @scala.inline
    def setSetShowInLegend(value: /* showInLegend */ js.UndefOr[Boolean] => Unit): Self = this.set("setShowInLegend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetShowInLegend: Self = this.set("setShowInLegend", js.undefined)
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStore: Self = this.set("setStore", js.undefined)
    @scala.inline
    def setSetStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    @scala.inline
    def setSetSubStyle(value: /* subStyle */ js.UndefOr[js.Any] => Unit): Self = this.set("setSubStyle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSubStyle: Self = this.set("setSubStyle", js.undefined)
    @scala.inline
    def setSetSurface(value: /* surface */ js.UndefOr[js.Any] => Unit): Self = this.set("setSurface", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSurface: Self = this.set("setSurface", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubStyle(value: js.Any): Self = this.set("subStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubStyle: Self = this.set("subStyle", js.undefined)
    @scala.inline
    def setSurface(value: js.Any): Self = this.set("surface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurface: Self = this.set("surface", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

