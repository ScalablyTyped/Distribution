package typings.senchaTouch.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDraggable
  extends StObject
     with typings.senchaTouch.Ext.mixin.IObservable {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  
  /** [Method] Disable the Draggable
    * @returns Ext.util.Draggable This Draggable instance
    */
  var disable: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Enable the Draggable
    * @returns Ext.util.Draggable This Draggable instance
    */
  var enable: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  var getCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of constraint
    * @returns String
    */
  var getConstraint: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of disabled
    * @returns Object
    */
  var getDisabled: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of draggingCls
    * @returns String
    */
  var getDraggingCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of initialOffset
    * @returns Object/Number
    */
  var getInitialOffset: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of translatable
    * @returns Object
    */
  var getTranslatable: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Object/Number) */
  var initialOffset: js.UndefOr[Any] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IDraggable: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[Any], 
      /* events */ js.UndefOr[Any], 
      typings.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of constraint
    * @param constraint String The new value.
    */
  var setConstraint: js.UndefOr[js.Function1[/* constraint */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of disabled
    * @param disabled Object The new value.
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of draggingCls
    * @param draggingCls String The new value.
    */
  var setDraggingCls: js.UndefOr[js.Function1[/* draggingCls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of initialOffset
    * @param initialOffset Object/Number The new value.
    */
  var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of translatable
    * @param translatable Object The new value.
    */
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Any], Unit]] = js.undefined
}
object IDraggable {
  
  inline def apply(): IDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDraggable]
  }
  
  extension [Self <: IDraggable](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisable(value: () => IDraggable): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setEnable(value: () => IDraggable): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setGetCls(value: () => String): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetConstraint(value: () => String): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
    
    inline def setGetConstraintUndefined: Self = StObject.set(x, "getConstraint", js.undefined)
    
    inline def setGetDirection(value: () => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
    
    inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
    
    inline def setGetDisabled(value: () => Any): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
    
    inline def setGetDisabledUndefined: Self = StObject.set(x, "getDisabled", js.undefined)
    
    inline def setGetDraggingCls(value: () => String): Self = StObject.set(x, "getDraggingCls", js.Any.fromFunction0(value))
    
    inline def setGetDraggingClsUndefined: Self = StObject.set(x, "getDraggingCls", js.undefined)
    
    inline def setGetElement(value: () => Any): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
    
    inline def setGetInitialOffset(value: () => Any): Self = StObject.set(x, "getInitialOffset", js.Any.fromFunction0(value))
    
    inline def setGetInitialOffsetUndefined: Self = StObject.set(x, "getInitialOffset", js.undefined)
    
    inline def setGetTranslatable(value: () => Any): Self = StObject.set(x, "getTranslatable", js.Any.fromFunction0(value))
    
    inline def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
    
    inline def setInitialOffset(value: Any): Self = StObject.set(x, "initialOffset", value.asInstanceOf[js.Any])
    
    inline def setInitialOffsetUndefined: Self = StObject.set(x, "initialOffset", js.undefined)
    
    inline def setRelayEvents(
      value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetConstraint(value: /* constraint */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setConstraint", js.Any.fromFunction1(value))
    
    inline def setSetConstraintUndefined: Self = StObject.set(x, "setConstraint", js.undefined)
    
    inline def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
    
    inline def setSetDisabled(value: /* disabled */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    inline def setSetDraggingCls(value: /* draggingCls */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDraggingCls", js.Any.fromFunction1(value))
    
    inline def setSetDraggingClsUndefined: Self = StObject.set(x, "setDraggingCls", js.undefined)
    
    inline def setSetElement(value: /* element */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setElement", js.Any.fromFunction1(value))
    
    inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
    
    inline def setSetInitialOffset(value: /* initialOffset */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setInitialOffset", js.Any.fromFunction1(value))
    
    inline def setSetInitialOffsetUndefined: Self = StObject.set(x, "setInitialOffset", js.undefined)
    
    inline def setSetTranslatable(value: /* translatable */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1(value))
    
    inline def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
  }
}
