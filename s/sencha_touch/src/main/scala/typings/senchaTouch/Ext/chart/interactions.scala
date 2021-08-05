package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactions {
  
  trait IAbstract
    extends StObject
       with IObservable {
    
    /** [Config Option] (Ext.chart.AbstractChart) */
    var chart: js.UndefOr[IAbstractChart] = js.undefined
    
    /** [Config Option] (Boolean) */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var gesture: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of chart
      * @returns Ext.chart.AbstractChart
      */
    var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.undefined
    
    /** [Method] Returns the value of enabled
      * @returns Boolean
      */
    var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of gesture
      * @returns String
      */
    var getGesture: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Find and return a single series item corresponding to the given event or null if no matching item is found
      * @param e Event
      * @returns Object the item object or null if none found.
      */
    var getItemForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], js.Any]] = js.undefined
    
    /** [Method] Find and return all series items corresponding to the given event
      * @param e Event
      * @returns Array array of matching item objects
      */
    var getItemsForEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Array]] = js.undefined
    
    /** [Method] A method to be implemented by subclasses where all event attachment should occur  */
    var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Placeholder method  */
    var onGesture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.undefined
    
    /** [Method] Sets the value of chart
      * @param chart Ext.chart.AbstractChart The new value.
      */
    var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.undefined
    
    /** [Method] Sets the value of enabled
      * @param enabled Boolean The new value.
      */
    var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of gesture
      * @param gesture String The new value.
      */
    var setGesture: js.UndefOr[js.Function1[/* gesture */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Property] (Number) */
    var throttleGap: js.UndefOr[Double] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setChart(value: IAbstractChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGesture(value: String): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      inline def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
      
      inline def setGetChart(value: () => IAbstractChart): Self = StObject.set(x, "getChart", js.Any.fromFunction0(value))
      
      inline def setGetChartUndefined: Self = StObject.set(x, "getChart", js.undefined)
      
      inline def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
      
      inline def setGetEnabledUndefined: Self = StObject.set(x, "getEnabled", js.undefined)
      
      inline def setGetGesture(value: () => String): Self = StObject.set(x, "getGesture", js.Any.fromFunction0(value))
      
      inline def setGetGestureUndefined: Self = StObject.set(x, "getGesture", js.undefined)
      
      inline def setGetItemForEvent(value: /* e */ js.UndefOr[Event] => js.Any): Self = StObject.set(x, "getItemForEvent", js.Any.fromFunction1(value))
      
      inline def setGetItemForEventUndefined: Self = StObject.set(x, "getItemForEvent", js.undefined)
      
      inline def setGetItemsForEvent(value: /* e */ js.UndefOr[Event] => Array): Self = StObject.set(x, "getItemsForEvent", js.Any.fromFunction1(value))
      
      inline def setGetItemsForEventUndefined: Self = StObject.set(x, "getItemsForEvent", js.undefined)
      
      inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setOnGesture(value: () => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction0(value))
      
      inline def setOnGestureUndefined: Self = StObject.set(x, "onGesture", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setSetChart(value: /* chart */ js.UndefOr[IAbstractChart] => Unit): Self = StObject.set(x, "setChart", js.Any.fromFunction1(value))
      
      inline def setSetChartUndefined: Self = StObject.set(x, "setChart", js.undefined)
      
      inline def setSetEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
      
      inline def setSetEnabledUndefined: Self = StObject.set(x, "setEnabled", js.undefined)
      
      inline def setSetGesture(value: /* gesture */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setGesture", js.Any.fromFunction1(value))
      
      inline def setSetGestureUndefined: Self = StObject.set(x, "setGesture", js.undefined)
      
      inline def setThrottleGap(value: Double): Self = StObject.set(x, "throttleGap", value.asInstanceOf[js.Any])
      
      inline def setThrottleGapUndefined: Self = StObject.set(x, "throttleGap", js.undefined)
    }
  }
  
  trait ICrossZoom
    extends StObject
       with IAbstract {
    
    /** [Config Option] (Object/Array) */
    var axes: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of axes
      * @returns Object/Array
      */
    var getAxes: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of undoButton
      * @returns Object
      */
    var getUndoButton: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Placeholder method
      * @param e Object
      */
    @JSName("onGesture")
    var onGesture_ICrossZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of axes
      * @param axes Object/Array The new value.
      */
    var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of undoButton
      * @param undoButton Object The new value.
      */
    var setUndoButton: js.UndefOr[js.Function1[/* undoButton */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ICrossZoom {
    
    inline def apply(): ICrossZoom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICrossZoom]
    }
    
    extension [Self <: ICrossZoom](x: Self) {
      
      inline def setAxes(value: js.Any): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setGetAxes(value: () => js.Any): Self = StObject.set(x, "getAxes", js.Any.fromFunction0(value))
      
      inline def setGetAxesUndefined: Self = StObject.set(x, "getAxes", js.undefined)
      
      inline def setGetUndoButton(value: () => js.Any): Self = StObject.set(x, "getUndoButton", js.Any.fromFunction0(value))
      
      inline def setGetUndoButtonUndefined: Self = StObject.set(x, "getUndoButton", js.undefined)
      
      inline def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction1(value))
      
      inline def setOnGestureUndefined: Self = StObject.set(x, "onGesture", js.undefined)
      
      inline def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAxes", js.Any.fromFunction1(value))
      
      inline def setSetAxesUndefined: Self = StObject.set(x, "setAxes", js.undefined)
      
      inline def setSetUndoButton(value: /* undoButton */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUndoButton", js.Any.fromFunction1(value))
      
      inline def setSetUndoButtonUndefined: Self = StObject.set(x, "setUndoButton", js.undefined)
    }
  }
  
  trait ICrosshair
    extends StObject
       with IAbstract {
    
    /** [Config Option] (Object) */
    var axes: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of axes
      * @returns Object
      */
    var getAxes: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of lines
      * @returns Object
      */
    var getLines: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (Object) */
    var lines: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Placeholder method
      * @param e Object
      */
    @JSName("onGesture")
    var onGesture_ICrosshair: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of axes
      * @param axes Object The new value.
      */
    var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of lines
      * @param lines Object The new value.
      */
    var setLines: js.UndefOr[js.Function1[/* lines */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ICrosshair {
    
    inline def apply(): ICrosshair = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICrosshair]
    }
    
    extension [Self <: ICrosshair](x: Self) {
      
      inline def setAxes(value: js.Any): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setGetAxes(value: () => js.Any): Self = StObject.set(x, "getAxes", js.Any.fromFunction0(value))
      
      inline def setGetAxesUndefined: Self = StObject.set(x, "getAxes", js.undefined)
      
      inline def setGetLines(value: () => js.Any): Self = StObject.set(x, "getLines", js.Any.fromFunction0(value))
      
      inline def setGetLinesUndefined: Self = StObject.set(x, "getLines", js.undefined)
      
      inline def setLines(value: js.Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction1(value))
      
      inline def setOnGestureUndefined: Self = StObject.set(x, "onGesture", js.undefined)
      
      inline def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAxes", js.Any.fromFunction1(value))
      
      inline def setSetAxesUndefined: Self = StObject.set(x, "setAxes", js.undefined)
      
      inline def setSetLines(value: /* lines */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLines", js.Any.fromFunction1(value))
      
      inline def setSetLinesUndefined: Self = StObject.set(x, "setLines", js.undefined)
    }
  }
  
  trait IItemHighlight
    extends StObject
       with IAbstract {
    
    /** [Method] Placeholder method
      * @param series Object
      * @param item Object
      * @param e Object
      */
    @JSName("onGesture")
    var onGesture_IItemHighlight: js.UndefOr[
        js.Function3[
          /* series */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* e */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IItemHighlight {
    
    inline def apply(): IItemHighlight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemHighlight]
    }
    
    extension [Self <: IItemHighlight](x: Self) {
      
      inline def setOnGesture(
        value: (/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onGesture", js.Any.fromFunction3(value))
      
      inline def setOnGestureUndefined: Self = StObject.set(x, "onGesture", js.undefined)
    }
  }
  
  trait IItemInfo
    extends StObject
       with IAbstract {
    
    /** [Method] Returns the value of panel
      * @returns Object
      */
    var getPanel: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Placeholder method
      * @param series Object
      * @param item Object
      */
    @JSName("onGesture")
    var onGesture_IItemInfo: js.UndefOr[
        js.Function2[/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Object) */
    var panel: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Sets the value of panel
      * @param panel Object The new value.
      */
    var setPanel: js.UndefOr[js.Function1[/* panel */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IItemInfo {
    
    inline def apply(): IItemInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemInfo]
    }
    
    extension [Self <: IItemInfo](x: Self) {
      
      inline def setGetPanel(value: () => js.Any): Self = StObject.set(x, "getPanel", js.Any.fromFunction0(value))
      
      inline def setGetPanelUndefined: Self = StObject.set(x, "getPanel", js.undefined)
      
      inline def setOnGesture(value: (/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction2(value))
      
      inline def setOnGestureUndefined: Self = StObject.set(x, "onGesture", js.undefined)
      
      inline def setPanel(value: js.Any): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      inline def setSetPanel(value: /* panel */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPanel", js.Any.fromFunction1(value))
      
      inline def setSetPanelUndefined: Self = StObject.set(x, "setPanel", js.undefined)
    }
  }
  
  trait IPanZoom
    extends StObject
       with IAbstract {
    
    /** [Config Option] (Object/Array) */
    var axes: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of axes
      * @returns Object/Array
      */
    var getAxes: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of hideLabelInGesture
      * @returns Boolean
      */
    var getHideLabelInGesture: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of maxZoom
      * @returns Object
      */
    var getMaxZoom: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of minZoom
      * @returns Object
      */
    var getMinZoom: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of modeToggleButton
      * @returns Object
      */
    var getModeToggleButton: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of panGesture
      * @returns String
      */
    var getPanGesture: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of showOverflowArrows
      * @returns Boolean
      */
    var getShowOverflowArrows: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of zoomOnPanGesture
      * @returns Boolean
      */
    var getZoomOnPanGesture: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Placeholder method
      * @param e Object
      */
    @JSName("onGesture")
    var onGesture_IPanZoom: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var overflowArrowOptions: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Sets the value of axes
      * @param axes Object/Array The new value.
      */
    var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of hideLabelInGesture
      * @param hideLabelInGesture Boolean The new value.
      */
    var setHideLabelInGesture: js.UndefOr[js.Function1[/* hideLabelInGesture */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of maxZoom
      * @param maxZoom Object The new value.
      */
    var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of minZoom
      * @param minZoom Object The new value.
      */
    var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of modeToggleButton
      * @param modeToggleButton Object The new value.
      */
    var setModeToggleButton: js.UndefOr[js.Function1[/* modeToggleButton */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of panGesture
      * @param panGesture String The new value.
      */
    var setPanGesture: js.UndefOr[js.Function1[/* panGesture */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of showOverflowArrows
      * @param showOverflowArrows Boolean The new value.
      */
    var setShowOverflowArrows: js.UndefOr[js.Function1[/* showOverflowArrows */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of zoomOnPanGesture
      * @param zoomOnPanGesture Boolean The new value.
      */
    var setZoomOnPanGesture: js.UndefOr[js.Function1[/* zoomOnPanGesture */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var showOverflowArrows: js.UndefOr[Boolean] = js.undefined
  }
  object IPanZoom {
    
    inline def apply(): IPanZoom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPanZoom]
    }
    
    extension [Self <: IPanZoom](x: Self) {
      
      inline def setAxes(value: js.Any): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setGetAxes(value: () => js.Any): Self = StObject.set(x, "getAxes", js.Any.fromFunction0(value))
      
      inline def setGetAxesUndefined: Self = StObject.set(x, "getAxes", js.undefined)
      
      inline def setGetHideLabelInGesture(value: () => Boolean): Self = StObject.set(x, "getHideLabelInGesture", js.Any.fromFunction0(value))
      
      inline def setGetHideLabelInGestureUndefined: Self = StObject.set(x, "getHideLabelInGesture", js.undefined)
      
      inline def setGetMaxZoom(value: () => js.Any): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
      
      inline def setGetMaxZoomUndefined: Self = StObject.set(x, "getMaxZoom", js.undefined)
      
      inline def setGetMinZoom(value: () => js.Any): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
      
      inline def setGetMinZoomUndefined: Self = StObject.set(x, "getMinZoom", js.undefined)
      
      inline def setGetModeToggleButton(value: () => js.Any): Self = StObject.set(x, "getModeToggleButton", js.Any.fromFunction0(value))
      
      inline def setGetModeToggleButtonUndefined: Self = StObject.set(x, "getModeToggleButton", js.undefined)
      
      inline def setGetPanGesture(value: () => String): Self = StObject.set(x, "getPanGesture", js.Any.fromFunction0(value))
      
      inline def setGetPanGestureUndefined: Self = StObject.set(x, "getPanGesture", js.undefined)
      
      inline def setGetShowOverflowArrows(value: () => Boolean): Self = StObject.set(x, "getShowOverflowArrows", js.Any.fromFunction0(value))
      
      inline def setGetShowOverflowArrowsUndefined: Self = StObject.set(x, "getShowOverflowArrows", js.undefined)
      
      inline def setGetZoomOnPanGesture(value: () => Boolean): Self = StObject.set(x, "getZoomOnPanGesture", js.Any.fromFunction0(value))
      
      inline def setGetZoomOnPanGestureUndefined: Self = StObject.set(x, "getZoomOnPanGesture", js.undefined)
      
      inline def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction1(value))
      
      inline def setOnGestureUndefined: Self = StObject.set(x, "onGesture", js.undefined)
      
      inline def setOverflowArrowOptions(value: js.Any): Self = StObject.set(x, "overflowArrowOptions", value.asInstanceOf[js.Any])
      
      inline def setOverflowArrowOptionsUndefined: Self = StObject.set(x, "overflowArrowOptions", js.undefined)
      
      inline def setSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAxes", js.Any.fromFunction1(value))
      
      inline def setSetAxesUndefined: Self = StObject.set(x, "setAxes", js.undefined)
      
      inline def setSetHideLabelInGesture(value: /* hideLabelInGesture */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHideLabelInGesture", js.Any.fromFunction1(value))
      
      inline def setSetHideLabelInGestureUndefined: Self = StObject.set(x, "setHideLabelInGesture", js.undefined)
      
      inline def setSetMaxZoom(value: /* maxZoom */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMaxZoom", js.Any.fromFunction1(value))
      
      inline def setSetMaxZoomUndefined: Self = StObject.set(x, "setMaxZoom", js.undefined)
      
      inline def setSetMinZoom(value: /* minZoom */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMinZoom", js.Any.fromFunction1(value))
      
      inline def setSetMinZoomUndefined: Self = StObject.set(x, "setMinZoom", js.undefined)
      
      inline def setSetModeToggleButton(value: /* modeToggleButton */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setModeToggleButton", js.Any.fromFunction1(value))
      
      inline def setSetModeToggleButtonUndefined: Self = StObject.set(x, "setModeToggleButton", js.undefined)
      
      inline def setSetPanGesture(value: /* panGesture */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setPanGesture", js.Any.fromFunction1(value))
      
      inline def setSetPanGestureUndefined: Self = StObject.set(x, "setPanGesture", js.undefined)
      
      inline def setSetShowOverflowArrows(value: /* showOverflowArrows */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setShowOverflowArrows", js.Any.fromFunction1(value))
      
      inline def setSetShowOverflowArrowsUndefined: Self = StObject.set(x, "setShowOverflowArrows", js.undefined)
      
      inline def setSetZoomOnPanGesture(value: /* zoomOnPanGesture */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setZoomOnPanGesture", js.Any.fromFunction1(value))
      
      inline def setSetZoomOnPanGestureUndefined: Self = StObject.set(x, "setZoomOnPanGesture", js.undefined)
      
      inline def setShowOverflowArrows(value: Boolean): Self = StObject.set(x, "showOverflowArrows", value.asInstanceOf[js.Any])
      
      inline def setShowOverflowArrowsUndefined: Self = StObject.set(x, "showOverflowArrows", js.undefined)
    }
  }
  
  trait IRotate
    extends StObject
       with IAbstract {
    
    /** [Method] Placeholder method
      * @param e Object
      */
    @JSName("onGesture")
    var onGesture_IRotate: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IRotate {
    
    inline def apply(): IRotate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRotate]
    }
    
    extension [Self <: IRotate](x: Self) {
      
      inline def setOnGesture(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction1(value))
      
      inline def setOnGestureUndefined: Self = StObject.set(x, "onGesture", js.undefined)
    }
  }
  
  type IRotatePie3D = IRotate
}
