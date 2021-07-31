package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IIdentifiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObservable
  extends StObject
     with IIdentifiable {
  
  /** [Method] Appends an after event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var addAfterListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Appends a before event handler
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var addBeforeListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
    */
  var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Appends an event handler to this object
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  var addListener: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  var addManagedListener: js.UndefOr[
    js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var bubbleEvents: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Removes all listeners for this object  */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param events String/String[] The event name to bubble, or an Array of event names.
    */
  var enableBubble: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
    * @param eventName String The name of the event to fire.
    * @param args Array Arguments to pass to handers.
    * @param fn Function Action.
    * @param scope Object Scope of fn.
    * @returns Object
    */
  var fireAction: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[String], 
      /* args */ js.UndefOr[Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean Returns false if any of the handlers return false.
    */
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.undefined
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String/String[]
    */
  var getBubbleEvents: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of listeners
    * @returns Object
    */
  var getListeners: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Checks to see if this object has any listeners for a specified event
    * @param eventName String The name of the event to check for
    * @returns Boolean True if the event is being listened for, else false
    */
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[String], Boolean]] = js.undefined
  
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Alias for addManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    * @param options Object If the eventName parameter was an event name, this is the addListener options.
    */
  var mon: js.UndefOr[
    js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for removeManagedListener
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  var mun: js.UndefOr[
    js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for addListener
    * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
    * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
    */
  var on: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for addAfterListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var onAfter: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for addBeforeListener
    * @param eventName String/String[]/Object The name of the event to listen for.
    * @param fn Function/String The method the event invokes.
    * @param scope Object The scope for fn.
    * @param options Object An object containing handler configuration.
    */
  var onBefore: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  var relayEvents: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var removeAfterListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Removes a before event handler
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var removeBeforeListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Removes an event handler
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  var removeListener: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
    * @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
    * @param eventName Object/String The event name, or an object containing event name properties.
    * @param fn Function If the eventName parameter was an event name, this is the handler function.
    * @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
    */
  var removeManagedListener: js.UndefOr[
    js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Resumes firing events see suspendEvents
    * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
    */
  var resumeEvents: js.UndefOr[js.Function1[/* discardQueuedEvents */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String/String[] The new value.
    */
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of listeners
    * @param listeners Object The new value.
    */
  var setListeners: js.UndefOr[js.Function1[/* listeners */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Suspends the firing of all events  */
  var suspendEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Alias for removeListener
    * @param eventName String/String[]/Object The type of event the handler was associated with.
    * @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
    * @param options Object Extra options object. See addListener for details.
    * @param order String The order of the listener to remove. Possible values are before, current and after.
    */
  var un: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for removeAfterListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var unAfter: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Alias for removeBeforeListener
    * @param eventName String/String[]/Object The name of the event the handler was associated with.
    * @param fn Function/String The handler to remove.
    * @param scope Object The scope originally specified for fn.
    * @param options Object Extra options object.
    */
  var unBefore: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}
object IObservable {
  
  @scala.inline
  def apply(): IObservable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObservable]
  }
  
  @scala.inline
  implicit class IObservableMutableBuilder[Self <: IObservable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAfterListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "addAfterListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddAfterListenerUndefined: Self = StObject.set(x, "addAfterListener", js.undefined)
    
    @scala.inline
    def setAddBeforeListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "addBeforeListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddBeforeListenerUndefined: Self = StObject.set(x, "addBeforeListener", js.undefined)
    
    @scala.inline
    def setAddEvents(value: /* eventNames */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
    
    @scala.inline
    def setAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    @scala.inline
    def setAddManagedListener(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
    
    @scala.inline
    def setBubbleEvents(value: js.Any): Self = StObject.set(x, "bubbleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleEventsUndefined: Self = StObject.set(x, "bubbleEvents", js.undefined)
    
    @scala.inline
    def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
    
    @scala.inline
    def setEnableBubble(value: /* events */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
    
    @scala.inline
    def setFireAction(
      value: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "fireAction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFireActionUndefined: Self = StObject.set(x, "fireAction", js.undefined)
    
    @scala.inline
    def setFireEvent(value: (/* eventName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
    
    @scala.inline
    def setGetBubbleEvents(value: () => js.Any): Self = StObject.set(x, "getBubbleEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBubbleEventsUndefined: Self = StObject.set(x, "getBubbleEvents", js.undefined)
    
    @scala.inline
    def setGetListeners(value: () => js.Any): Self = StObject.set(x, "getListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListenersUndefined: Self = StObject.set(x, "getListeners", js.undefined)
    
    @scala.inline
    def setHasListener(value: /* eventName */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
    
    @scala.inline
    def setListeners(value: js.Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    @scala.inline
    def setMon(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
    
    @scala.inline
    def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
    
    @scala.inline
    def setMun(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
    
    @scala.inline
    def setOn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnAfter(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onAfter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnAfterUndefined: Self = StObject.set(x, "onAfter", js.undefined)
    
    @scala.inline
    def setOnBefore(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onBefore", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setRemoveAfterListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeAfterListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveAfterListenerUndefined: Self = StObject.set(x, "removeAfterListener", js.undefined)
    
    @scala.inline
    def setRemoveBeforeListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeBeforeListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveBeforeListenerUndefined: Self = StObject.set(x, "removeBeforeListener", js.undefined)
    
    @scala.inline
    def setRemoveListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    @scala.inline
    def setRemoveManagedListener(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
    
    @scala.inline
    def setResumeEvents(value: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
    
    @scala.inline
    def setSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBubbleEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBubbleEventsUndefined: Self = StObject.set(x, "setBubbleEvents", js.undefined)
    
    @scala.inline
    def setSetListeners(value: /* listeners */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetListenersUndefined: Self = StObject.set(x, "setListeners", js.undefined)
    
    @scala.inline
    def setSuspendEvents(value: () => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
    
    @scala.inline
    def setUn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "un", js.Any.fromFunction5(value))
    
    @scala.inline
    def setUnAfter(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "unAfter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUnAfterUndefined: Self = StObject.set(x, "unAfter", js.undefined)
    
    @scala.inline
    def setUnBefore(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "unBefore", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUnBeforeUndefined: Self = StObject.set(x, "unBefore", js.undefined)
    
    @scala.inline
    def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
  }
}
