package typings.senchaTouch.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDraggable
  extends typings.senchaTouch.Ext.mixin.IObservable {
  
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  
  /** [Method] Disable the Draggable
    * @returns Ext.util.Draggable This Draggable instance
    */
  var disable: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Enable the Draggable
    * @returns Ext.util.Draggable This Draggable instance
    */
  var enable: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  var getCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of constraint
    * @returns String
    */
  var getConstraint: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of direction
    * @returns String
    */
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of disabled
    * @returns Object
    */
  var getDisabled: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of draggingCls
    * @returns String
    */
  var getDraggingCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of initialOffset
    * @returns Object/Number
    */
  var getInitialOffset: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of translatable
    * @returns Object
    */
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Object/Number) */
  var initialOffset: js.UndefOr[js.Any] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IDraggable: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      typings.senchaTouch.Ext.mixin.IObservable
    ]
  ] = js.native
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of constraint
    * @param constraint String The new value.
    */
  var setConstraint: js.UndefOr[js.Function1[/* constraint */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of direction
    * @param direction String The new value.
    */
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of disabled
    * @param disabled Object The new value.
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of draggingCls
    * @param draggingCls String The new value.
    */
  var setDraggingCls: js.UndefOr[js.Function1[/* draggingCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of initialOffset
    * @param initialOffset Object/Number The new value.
    */
  var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of translatable
    * @param translatable Object The new value.
    */
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.native
}
object IDraggable {
  
  @scala.inline
  def apply(): IDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDraggable]
  }
  
  @scala.inline
  implicit class IDraggableOps[Self <: IDraggable] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisable(value: () => IDraggable): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setEnable(value: () => IDraggable): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    
    @scala.inline
    def setGetConstraint(value: () => String): Self = this.set("getConstraint", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetConstraint: Self = this.set("getConstraint", js.undefined)
    
    @scala.inline
    def setGetDirection(value: () => String): Self = this.set("getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDirection: Self = this.set("getDirection", js.undefined)
    
    @scala.inline
    def setGetDisabled(value: () => _): Self = this.set("getDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisabled: Self = this.set("getDisabled", js.undefined)
    
    @scala.inline
    def setGetDraggingCls(value: () => String): Self = this.set("getDraggingCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDraggingCls: Self = this.set("getDraggingCls", js.undefined)
    
    @scala.inline
    def setGetElement(value: () => _): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetElement: Self = this.set("getElement", js.undefined)
    
    @scala.inline
    def setGetInitialOffset(value: () => _): Self = this.set("getInitialOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInitialOffset: Self = this.set("getInitialOffset", js.undefined)
    
    @scala.inline
    def setGetTranslatable(value: () => _): Self = this.set("getTranslatable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTranslatable: Self = this.set("getTranslatable", js.undefined)
    
    @scala.inline
    def setInitialOffset(value: js.Any): Self = this.set("initialOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialOffset: Self = this.set("initialOffset", js.undefined)
    
    @scala.inline
    def setRelayEvents(
      value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => typings.senchaTouch.Ext.mixin.IObservable
    ): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    
    @scala.inline
    def setSetConstraint(value: /* constraint */ js.UndefOr[String] => Unit): Self = this.set("setConstraint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetConstraint: Self = this.set("setConstraint", js.undefined)
    
    @scala.inline
    def setSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDirection: Self = this.set("setDirection", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[js.Any] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    
    @scala.inline
    def setSetDraggingCls(value: /* draggingCls */ js.UndefOr[String] => Unit): Self = this.set("setDraggingCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDraggingCls: Self = this.set("setDraggingCls", js.undefined)
    
    @scala.inline
    def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = this.set("setElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetElement: Self = this.set("setElement", js.undefined)
    
    @scala.inline
    def setSetInitialOffset(value: /* initialOffset */ js.UndefOr[js.Any] => Unit): Self = this.set("setInitialOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInitialOffset: Self = this.set("setInitialOffset", js.undefined)
    
    @scala.inline
    def setSetTranslatable(value: /* translatable */ js.UndefOr[js.Any] => Unit): Self = this.set("setTranslatable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTranslatable: Self = this.set("setTranslatable", js.undefined)
  }
}
