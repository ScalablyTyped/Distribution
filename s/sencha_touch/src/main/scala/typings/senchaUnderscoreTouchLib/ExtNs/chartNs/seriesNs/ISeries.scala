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

object ISeries {
  @scala.inline
  def apply(
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    colors: senchaUnderscoreTouchLib.ExtNs.Array = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    getAnimate: js.Function0[_] = null,
    getBackground: js.Function0[_] = null,
    getBubbleEvents: js.Function0[_] = null,
    getColors: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getHidden: js.Function0[_] = null,
    getHighlightCfg: js.Function0[_] = null,
    getHighlightItem: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemForPoint: js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ] = null,
    getItemInstancing: js.Function0[_] = null,
    getLabel: js.Function0[_] = null,
    getLabelField: js.Function0[_] = null,
    getLabelOverflowPadding: js.Function0[scala.Double] = null,
    getListeners: js.Function0[_] = null,
    getMarker: js.Function0[_] = null,
    getMarkerSubStyle: js.Function0[_] = null,
    getOverlaySurface: js.Function0[_] = null,
    getRenderer: js.Function0[_] = null,
    getShowInLegend: js.Function0[scala.Boolean] = null,
    getSprites: js.Function0[scala.Unit] = null,
    getStyle: js.Function0[_] = null,
    getSubStyle: js.Function0[_] = null,
    getSurface: js.Function0[_] = null,
    getTitle: js.Function0[java.lang.String] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hidden: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    itemInstancing: js.Any = null,
    label: js.Any = null,
    labelField: js.Any = null,
    labelOverflowPadding: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    marker: js.Any = null,
    markerSubStyle: js.Any = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    overlaySurface: js.Any = null,
    platformConfig: js.Any = null,
    provideLegendInfo: js.Function1[/* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    renderer: js.Any = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    seriesType: java.lang.String = null,
    setAnimate: js.Function1[/* animate */ js.UndefOr[js.Any], scala.Unit] = null,
    setBackground: js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setColors: js.Function1[/* colors */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setHidden: js.Function1[/* hidden */ js.UndefOr[js.Any], scala.Unit] = null,
    setHiddenByIndex: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* value */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    setHighlightCfg: js.Function1[/* highlightCfg */ js.UndefOr[js.Any], scala.Unit] = null,
    setHighlightItem: js.Function1[/* highlightItem */ js.UndefOr[js.Any], scala.Unit] = null,
    setItemInstancing: js.Function1[/* itemInstancing */ js.UndefOr[js.Any], scala.Unit] = null,
    setLabel: js.Function1[/* label */ js.UndefOr[js.Any], _] = null,
    setLabelField: js.Function1[/* labelField */ js.UndefOr[js.Any], scala.Unit] = null,
    setLabelOverflowPadding: js.Function1[/* labelOverflowPadding */ js.UndefOr[scala.Double], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setMarker: js.Function1[/* marker */ js.UndefOr[js.Any], scala.Unit] = null,
    setMarkerSubStyle: js.Function1[/* markerSubStyle */ js.UndefOr[js.Any], scala.Unit] = null,
    setOverlaySurface: js.Function1[/* overlaySurface */ js.UndefOr[js.Any], scala.Unit] = null,
    setRenderer: js.Function1[/* renderer */ js.UndefOr[js.Any], _] = null,
    setShowInLegend: js.Function1[/* showInLegend */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    setStyle: js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit] = null,
    setSubStyle: js.Function1[/* subStyle */ js.UndefOr[js.Any], scala.Unit] = null,
    setSurface: js.Function1[/* surface */ js.UndefOr[js.Any], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    store: js.Any = null,
    style: js.Any = null,
    subStyle: js.Any = null,
    surface: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISeries = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getAnimate != null) __obj.updateDynamic("getAnimate")(getAnimate)
    if (getBackground != null) __obj.updateDynamic("getBackground")(getBackground)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getColors != null) __obj.updateDynamic("getColors")(getColors)
    if (getHidden != null) __obj.updateDynamic("getHidden")(getHidden)
    if (getHighlightCfg != null) __obj.updateDynamic("getHighlightCfg")(getHighlightCfg)
    if (getHighlightItem != null) __obj.updateDynamic("getHighlightItem")(getHighlightItem)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(getItemForPoint)
    if (getItemInstancing != null) __obj.updateDynamic("getItemInstancing")(getItemInstancing)
    if (getLabel != null) __obj.updateDynamic("getLabel")(getLabel)
    if (getLabelField != null) __obj.updateDynamic("getLabelField")(getLabelField)
    if (getLabelOverflowPadding != null) __obj.updateDynamic("getLabelOverflowPadding")(getLabelOverflowPadding)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getMarker != null) __obj.updateDynamic("getMarker")(getMarker)
    if (getMarkerSubStyle != null) __obj.updateDynamic("getMarkerSubStyle")(getMarkerSubStyle)
    if (getOverlaySurface != null) __obj.updateDynamic("getOverlaySurface")(getOverlaySurface)
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(getRenderer)
    if (getShowInLegend != null) __obj.updateDynamic("getShowInLegend")(getShowInLegend)
    if (getSprites != null) __obj.updateDynamic("getSprites")(getSprites)
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle)
    if (getSubStyle != null) __obj.updateDynamic("getSubStyle")(getSubStyle)
    if (getSurface != null) __obj.updateDynamic("getSurface")(getSurface)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg)
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (itemInstancing != null) __obj.updateDynamic("itemInstancing")(itemInstancing)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelField != null) __obj.updateDynamic("labelField")(labelField)
    if (labelOverflowPadding != null) __obj.updateDynamic("labelOverflowPadding")(labelOverflowPadding.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (markerSubStyle != null) __obj.updateDynamic("markerSubStyle")(markerSubStyle)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (overlaySurface != null) __obj.updateDynamic("overlaySurface")(overlaySurface)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (provideLegendInfo != null) __obj.updateDynamic("provideLegendInfo")(provideLegendInfo)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (setAnimate != null) __obj.updateDynamic("setAnimate")(setAnimate)
    if (setBackground != null) __obj.updateDynamic("setBackground")(setBackground)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setColors != null) __obj.updateDynamic("setColors")(setColors)
    if (setHidden != null) __obj.updateDynamic("setHidden")(setHidden)
    if (setHiddenByIndex != null) __obj.updateDynamic("setHiddenByIndex")(setHiddenByIndex)
    if (setHighlightCfg != null) __obj.updateDynamic("setHighlightCfg")(setHighlightCfg)
    if (setHighlightItem != null) __obj.updateDynamic("setHighlightItem")(setHighlightItem)
    if (setItemInstancing != null) __obj.updateDynamic("setItemInstancing")(setItemInstancing)
    if (setLabel != null) __obj.updateDynamic("setLabel")(setLabel)
    if (setLabelField != null) __obj.updateDynamic("setLabelField")(setLabelField)
    if (setLabelOverflowPadding != null) __obj.updateDynamic("setLabelOverflowPadding")(setLabelOverflowPadding)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setMarker != null) __obj.updateDynamic("setMarker")(setMarker)
    if (setMarkerSubStyle != null) __obj.updateDynamic("setMarkerSubStyle")(setMarkerSubStyle)
    if (setOverlaySurface != null) __obj.updateDynamic("setOverlaySurface")(setOverlaySurface)
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(setRenderer)
    if (setShowInLegend != null) __obj.updateDynamic("setShowInLegend")(setShowInLegend)
    if (setStore != null) __obj.updateDynamic("setStore")(setStore)
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle)
    if (setSubStyle != null) __obj.updateDynamic("setSubStyle")(setSubStyle)
    if (setSurface != null) __obj.updateDynamic("setSurface")(setSurface)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (store != null) __obj.updateDynamic("store")(store)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subStyle != null) __obj.updateDynamic("subStyle")(subStyle)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISeries]
  }
}

