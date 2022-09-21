package typings.senchaTouch.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDroppable
  extends StObject
     with typings.senchaTouch.Ext.mixin.IObservable {
  
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[String] = js.undefined
  
  /** [Method] Disable the Droppable target  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Enable the Droppable target  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of baseCls
    * @returns String
    */
  var getBaseCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (String) */
  var group: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var hoverCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var invalidCls: js.UndefOr[String] = js.undefined
  
  /** [Method] Method to determine whether this Component is currently disabled
    * @returns Boolean the disabled state of this Component.
    */
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Method to determine whether this Droppable is currently monitoring drag operations of Draggables
    * @returns Boolean the monitoring state of this Droppable
    */
  var isMonitoring: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IDroppable: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[Any], 
      /* events */ js.UndefOr[Any], 
      typings.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of baseCls
    * @param baseCls String The new value.
    */
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var validDropMode: js.UndefOr[String] = js.undefined
}
object IDroppable {
  
  inline def apply(): IDroppable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDroppable]
  }
  
  extension [Self <: IDroppable](x: Self) {
    
    inline def setActiveCls(value: String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
    
    inline def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
    
    inline def setBaseCls(value: String): Self = StObject.set(x, "baseCls", value.asInstanceOf[js.Any])
    
    inline def setBaseClsUndefined: Self = StObject.set(x, "baseCls", js.undefined)
    
    inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setGetBaseCls(value: () => String): Self = StObject.set(x, "getBaseCls", js.Any.fromFunction0(value))
    
    inline def setGetBaseClsUndefined: Self = StObject.set(x, "getBaseCls", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHoverCls(value: String): Self = StObject.set(x, "hoverCls", value.asInstanceOf[js.Any])
    
    inline def setHoverClsUndefined: Self = StObject.set(x, "hoverCls", js.undefined)
    
    inline def setInvalidCls(value: String): Self = StObject.set(x, "invalidCls", value.asInstanceOf[js.Any])
    
    inline def setInvalidClsUndefined: Self = StObject.set(x, "invalidCls", js.undefined)
    
    inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setIsMonitoring(value: () => Boolean): Self = StObject.set(x, "isMonitoring", js.Any.fromFunction0(value))
    
    inline def setIsMonitoringUndefined: Self = StObject.set(x, "isMonitoring", js.undefined)
    
    inline def setRelayEvents(
      value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setSetBaseCls(value: /* baseCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setBaseCls", js.Any.fromFunction1(value))
    
    inline def setSetBaseClsUndefined: Self = StObject.set(x, "setBaseCls", js.undefined)
    
    inline def setValidDropMode(value: String): Self = StObject.set(x, "validDropMode", value.asInstanceOf[js.Any])
    
    inline def setValidDropModeUndefined: Self = StObject.set(x, "validDropMode", js.undefined)
  }
}
