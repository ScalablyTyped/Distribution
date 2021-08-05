package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifier {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.senchaTouch.Ext.IClass because Already inherited
  - typings.senchaTouch.Ext.IBase because Already inherited
  - typings.senchaTouch.Ext.mixin.IIdentifiable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getId, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined 
  - typings.senchaTouch.Ext.mixin.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bubbleEvents, listeners, addAfterListener, addBeforeListener, addEvents, addListener, addManagedListener, clearListeners, enableBubble, fireAction, fireEvent, getBubbleEvents, getId, getListeners, hasListener, mon, mun, on, onAfter, onBefore, relayEvents, removeAfterListener, removeBeforeListener, removeListener, removeManagedListener, resumeEvents, setBubbleEvents, setListeners, suspendEvents, un, unAfter, unBefore */ trait IAnimation
    extends StObject
       with IModifier {
    
    /** [Method] Appends an after event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    var addAfterListener: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Appends a before event handler
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    var addBeforeListener: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    var addEvents: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  This object may contain any of the following properties:
      * @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
      */
    var addListener: js.UndefOr[
        js.Function5[
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[String], 
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
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (String/String[]) */
    var bubbleEvents: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Remove special easings on the given attributes
      * @param attrs Object The source attributes.
      */
    var clearDurationOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Remove special easings on the given attributes
      * @param attrs String/Array The source attribute(s).
      */
    var clearEasingOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Removes all listeners for this object  */
    var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Object) */
    var customDuration: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var customEasings: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Number) */
    var duration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Function) */
    var easing: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    var enableBubble: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
      * @param eventName String The name of the event to fire.
      * @param args Array Arguments to pass to handers.
      * @param fn Function Action.
      * @param scope Object Scope of fn.
      * @returns Object
      */
    var fireAction: js.UndefOr[
        js.Function4[js.UndefOr[String], js.UndefOr[Array], js.UndefOr[js.Any], js.UndefOr[js.Any], js.Any]
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
    
    /** [Method] Returns the value of customDuration
      * @returns Object
      */
    var getCustomDuration: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of customEasings
      * @returns Object
      */
    var getCustomEasings: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of duration
      * @returns Number
      */
    var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of easing
      * @returns Function
      */
    var getEasing: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Retrieves the id of this component
      * @returns any id
      */
    var getId: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    var getListeners: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    var hasListener: js.UndefOr[js.Function1[js.UndefOr[String], Boolean]] = js.undefined
    
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
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
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
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
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
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[String], 
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
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Alias for addBeforeListener
      * @param eventName String/String[]/Object The name of the event to listen for.
      * @param fn Function/String The method the event invokes.
      * @param scope Object The scope for fn.
      * @param options Object An object containing handler configuration.
      */
    var onBefore: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    var relayEvents: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], this.type | IObservable]] = js.undefined
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    var removeAfterListener: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Removes a before event handler
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    var removeBeforeListener: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
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
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[String], 
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
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    var resumeEvents: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    var setBubbleEvents: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of customDuration
      * @param customDuration Object The new value.
      */
    var setCustomDuration: js.UndefOr[js.Function1[/* customDuration */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of customEasings
      * @param customEasings Object The new value.
      */
    var setCustomEasings: js.UndefOr[js.Function1[/* customEasings */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of duration
      * @param duration Number The new value.
      */
    var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Set special duration on the given attributes
      * @param attrs String/Array The source attributes.
      * @param duration Number The special duration.
      */
    var setDurationOn: js.UndefOr[
        js.Function2[/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    /** [Method] Sets the value of easing
      * @param easing Function The new value.
      */
    var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Set special easings on the given attributes
      * @param attrs String/Array The source attribute(s).
      * @param easing String The special easings.
      */
    var setEasingOn: js.UndefOr[
        js.Function2[/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[String], Unit]
      ] = js.undefined
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    var setListeners: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Stop all animations effected by this modifier */
    var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
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
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[js.Any], 
          js.UndefOr[String], 
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
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Alias for removeBeforeListener
      * @param eventName String/String[]/Object The name of the event the handler was associated with.
      * @param fn Function/String The handler to remove.
      * @param scope Object The scope originally specified for fn.
      * @param options Object Extra options object.
      */
    var unBefore: js.UndefOr[
        js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
      ] = js.undefined
  }
  object IAnimation {
    
    inline def apply(): IAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnimation]
    }
    
    extension [Self <: IAnimation](x: Self) {
      
      inline def setAddAfterListener(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "addAfterListener", js.Any.fromFunction4(value))
      
      inline def setAddAfterListenerUndefined: Self = StObject.set(x, "addAfterListener", js.undefined)
      
      inline def setAddBeforeListener(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "addBeforeListener", js.Any.fromFunction4(value))
      
      inline def setAddBeforeListenerUndefined: Self = StObject.set(x, "addBeforeListener", js.undefined)
      
      inline def setAddEvents(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
      
      inline def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
      
      inline def setAddListener(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction5(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setAddManagedListener(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
      
      inline def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
      
      inline def setBubbleEvents(value: js.Any): Self = StObject.set(x, "bubbleEvents", value.asInstanceOf[js.Any])
      
      inline def setBubbleEventsUndefined: Self = StObject.set(x, "bubbleEvents", js.undefined)
      
      inline def setClearDurationOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "clearDurationOn", js.Any.fromFunction1(value))
      
      inline def setClearDurationOnUndefined: Self = StObject.set(x, "clearDurationOn", js.undefined)
      
      inline def setClearEasingOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "clearEasingOn", js.Any.fromFunction1(value))
      
      inline def setClearEasingOnUndefined: Self = StObject.set(x, "clearEasingOn", js.undefined)
      
      inline def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
      
      inline def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
      
      inline def setCustomDuration(value: js.Any): Self = StObject.set(x, "customDuration", value.asInstanceOf[js.Any])
      
      inline def setCustomDurationUndefined: Self = StObject.set(x, "customDuration", js.undefined)
      
      inline def setCustomEasings(value: js.Any): Self = StObject.set(x, "customEasings", value.asInstanceOf[js.Any])
      
      inline def setCustomEasingsUndefined: Self = StObject.set(x, "customEasings", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEnableBubble(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
      
      inline def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
      
      inline def setFireAction(value: (js.UndefOr[String], js.UndefOr[Array], js.UndefOr[js.Any], js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "fireAction", js.Any.fromFunction4(value))
      
      inline def setFireActionUndefined: Self = StObject.set(x, "fireAction", js.undefined)
      
      inline def setFireEvent(value: (/* eventName */ String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      inline def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
      
      inline def setGetBubbleEvents(value: () => js.Any): Self = StObject.set(x, "getBubbleEvents", js.Any.fromFunction0(value))
      
      inline def setGetBubbleEventsUndefined: Self = StObject.set(x, "getBubbleEvents", js.undefined)
      
      inline def setGetCustomDuration(value: () => js.Any): Self = StObject.set(x, "getCustomDuration", js.Any.fromFunction0(value))
      
      inline def setGetCustomDurationUndefined: Self = StObject.set(x, "getCustomDuration", js.undefined)
      
      inline def setGetCustomEasings(value: () => js.Any): Self = StObject.set(x, "getCustomEasings", js.Any.fromFunction0(value))
      
      inline def setGetCustomEasingsUndefined: Self = StObject.set(x, "getCustomEasings", js.undefined)
      
      inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
      
      inline def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
      
      inline def setGetEasing(value: () => js.Any): Self = StObject.set(x, "getEasing", js.Any.fromFunction0(value))
      
      inline def setGetEasingUndefined: Self = StObject.set(x, "getEasing", js.undefined)
      
      inline def setGetId(value: () => js.Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setGetListeners(value: () => js.Any): Self = StObject.set(x, "getListeners", js.Any.fromFunction0(value))
      
      inline def setGetListenersUndefined: Self = StObject.set(x, "getListeners", js.undefined)
      
      inline def setHasListener(value: js.UndefOr[String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
      
      inline def setListeners(value: js.Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setMon(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
      
      inline def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
      
      inline def setMun(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
      
      inline def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
      
      inline def setOn(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction5(value))
      
      inline def setOnAfter(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onAfter", js.Any.fromFunction4(value))
      
      inline def setOnAfterUndefined: Self = StObject.set(x, "onAfter", js.undefined)
      
      inline def setOnBefore(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "onBefore", js.Any.fromFunction4(value))
      
      inline def setOnBeforeUndefined: Self = StObject.set(x, "onBefore", js.undefined)
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setRelayEvents(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => IAnimation | IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setRemoveAfterListener(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "removeAfterListener", js.Any.fromFunction4(value))
      
      inline def setRemoveAfterListenerUndefined: Self = StObject.set(x, "removeAfterListener", js.undefined)
      
      inline def setRemoveBeforeListener(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "removeBeforeListener", js.Any.fromFunction4(value))
      
      inline def setRemoveBeforeListenerUndefined: Self = StObject.set(x, "removeBeforeListener", js.undefined)
      
      inline def setRemoveListener(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction5(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      inline def setRemoveManagedListener(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
      
      inline def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
      
      inline def setResumeEvents(value: js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction1(value))
      
      inline def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
      
      inline def setSetBubbleEvents(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBubbleEvents", js.Any.fromFunction1(value))
      
      inline def setSetBubbleEventsUndefined: Self = StObject.set(x, "setBubbleEvents", js.undefined)
      
      inline def setSetCustomDuration(value: /* customDuration */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCustomDuration", js.Any.fromFunction1(value))
      
      inline def setSetCustomDurationUndefined: Self = StObject.set(x, "setCustomDuration", js.undefined)
      
      inline def setSetCustomEasings(value: /* customEasings */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCustomEasings", js.Any.fromFunction1(value))
      
      inline def setSetCustomEasingsUndefined: Self = StObject.set(x, "setCustomEasings", js.undefined)
      
      inline def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
      
      inline def setSetDurationOn(value: (/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setDurationOn", js.Any.fromFunction2(value))
      
      inline def setSetDurationOnUndefined: Self = StObject.set(x, "setDurationOn", js.undefined)
      
      inline def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      
      inline def setSetEasing(value: /* easing */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEasing", js.Any.fromFunction1(value))
      
      inline def setSetEasingOn(value: (/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setEasingOn", js.Any.fromFunction2(value))
      
      inline def setSetEasingOnUndefined: Self = StObject.set(x, "setEasingOn", js.undefined)
      
      inline def setSetEasingUndefined: Self = StObject.set(x, "setEasing", js.undefined)
      
      inline def setSetListeners(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setListeners", js.Any.fromFunction1(value))
      
      inline def setSetListenersUndefined: Self = StObject.set(x, "setListeners", js.undefined)
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setSuspendEvents(value: () => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction0(value))
      
      inline def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
      
      inline def setUn(
        value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "un", js.Any.fromFunction5(value))
      
      inline def setUnAfter(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "unAfter", js.Any.fromFunction4(value))
      
      inline def setUnAfterUndefined: Self = StObject.set(x, "unAfter", js.undefined)
      
      inline def setUnBefore(value: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "unBefore", js.Any.fromFunction4(value))
      
      inline def setUnBeforeUndefined: Self = StObject.set(x, "unBefore", js.undefined)
      
      inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
    }
  }
  
  trait IHighlight
    extends StObject
       with IModifier {
    
    /** [Config Option] (Boolean) */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Filter modifier changes if overriding source attributes
      * @param attr Object The source attributes.
      * @param changes Object The modifier changes.
      * @returns * The filtered changes.
      */
    var filterChanges: js.UndefOr[
        js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], js.Any]
      ] = js.undefined
    
    /** [Method] Returns the value of enabled
      * @returns Boolean
      */
    var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of highlightStyle
      * @returns Object
      */
    var getHighlightStyle: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (Object) */
    var highlightStyle: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Sets the value of enabled
      * @param enabled Boolean The new value.
      */
    var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of highlightStyle
      * @param highlightStyle Object The new value.
      */
    var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IHighlight {
    
    inline def apply(): IHighlight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHighlight]
    }
    
    extension [Self <: IHighlight](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFilterChanges(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "filterChanges", js.Any.fromFunction2(value))
      
      inline def setFilterChangesUndefined: Self = StObject.set(x, "filterChanges", js.undefined)
      
      inline def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
      
      inline def setGetEnabledUndefined: Self = StObject.set(x, "getEnabled", js.undefined)
      
      inline def setGetHighlightStyle(value: () => js.Any): Self = StObject.set(x, "getHighlightStyle", js.Any.fromFunction0(value))
      
      inline def setGetHighlightStyleUndefined: Self = StObject.set(x, "getHighlightStyle", js.undefined)
      
      inline def setHighlightStyle(value: js.Any): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
      
      inline def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
      
      inline def setSetEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
      
      inline def setSetEnabledUndefined: Self = StObject.set(x, "setEnabled", js.undefined)
      
      inline def setSetHighlightStyle(value: /* highlightStyle */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHighlightStyle", js.Any.fromFunction1(value))
      
      inline def setSetHighlightStyleUndefined: Self = StObject.set(x, "setHighlightStyle", js.undefined)
    }
  }
  
  trait IModifier
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of next
      * @returns Ext.draw.modifier.Modifier
      */
    var getNext: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Returns the value of previous
      * @returns Ext.draw.modifier.Modifier
      */
    var getPrevious: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Returns the value of sprite
      * @returns Ext.draw.sprite.Sprite
      */
    var getSprite: js.UndefOr[js.Function0[ISprite]] = js.undefined
    
    /** [Config Option] (Ext.draw.modifier.Modifier) */
    var next: js.UndefOr[IModifier] = js.undefined
    
    /** [Method] Invoked when changes need to be popped up to the top
      * @param attributes Object The source attributes.
      * @param changes Object The changes to be popped up.
      */
    var popUp: js.UndefOr[
        js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], Unit]
      ] = js.undefined
    
    /** [Method] Validate attribute set before use
      * @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
      */
    var prepareAttributes: js.UndefOr[js.Function1[/* attr */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Ext.draw.modifier.Modifier) */
    var previous: js.UndefOr[IModifier] = js.undefined
    
    /** [Method] Invoked when changes need to be pushed down to the sprite
      * @param attr Object The source attributes.
      * @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
      * @returns Mixed
      */
    var pushDown: js.UndefOr[
        js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], js.Any]
      ] = js.undefined
    
    /** [Method] Sets the value of next
      * @param next Ext.draw.modifier.Modifier The new value.
      */
    var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.undefined
    
    /** [Method] Sets the value of previous
      * @param previous Ext.draw.modifier.Modifier The new value.
      */
    var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.undefined
    
    /** [Method] Sets the value of sprite
      * @param sprite Ext.draw.sprite.Sprite The new value.
      */
    var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.undefined
    
    /** [Config Option] (Ext.draw.sprite.Sprite) */
    var sprite: js.UndefOr[ISprite] = js.undefined
  }
  object IModifier {
    
    inline def apply(): IModifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModifier]
    }
    
    extension [Self <: IModifier](x: Self) {
      
      inline def setGetNext(value: () => IModifier): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
      
      inline def setGetNextUndefined: Self = StObject.set(x, "getNext", js.undefined)
      
      inline def setGetPrevious(value: () => IModifier): Self = StObject.set(x, "getPrevious", js.Any.fromFunction0(value))
      
      inline def setGetPreviousUndefined: Self = StObject.set(x, "getPrevious", js.undefined)
      
      inline def setGetSprite(value: () => ISprite): Self = StObject.set(x, "getSprite", js.Any.fromFunction0(value))
      
      inline def setGetSpriteUndefined: Self = StObject.set(x, "getSprite", js.undefined)
      
      inline def setNext(value: IModifier): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPopUp(value: (/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "popUp", js.Any.fromFunction2(value))
      
      inline def setPopUpUndefined: Self = StObject.set(x, "popUp", js.undefined)
      
      inline def setPrepareAttributes(value: /* attr */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "prepareAttributes", js.Any.fromFunction1(value))
      
      inline def setPrepareAttributesUndefined: Self = StObject.set(x, "prepareAttributes", js.undefined)
      
      inline def setPrevious(value: IModifier): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setPushDown(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "pushDown", js.Any.fromFunction2(value))
      
      inline def setPushDownUndefined: Self = StObject.set(x, "pushDown", js.undefined)
      
      inline def setSetNext(value: /* next */ js.UndefOr[IModifier] => Unit): Self = StObject.set(x, "setNext", js.Any.fromFunction1(value))
      
      inline def setSetNextUndefined: Self = StObject.set(x, "setNext", js.undefined)
      
      inline def setSetPrevious(value: /* previous */ js.UndefOr[IModifier] => Unit): Self = StObject.set(x, "setPrevious", js.Any.fromFunction1(value))
      
      inline def setSetPreviousUndefined: Self = StObject.set(x, "setPrevious", js.undefined)
      
      inline def setSetSprite(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = StObject.set(x, "setSprite", js.Any.fromFunction1(value))
      
      inline def setSetSpriteUndefined: Self = StObject.set(x, "setSprite", js.undefined)
      
      inline def setSprite(value: ISprite): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    }
  }
  
  trait ITarget
    extends StObject
       with IModifier
  object ITarget {
    
    inline def apply(): ITarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITarget]
    }
  }
}
