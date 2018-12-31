package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.device.Connection")
@js.native
class Connection () extends js.Object

@JSGlobal("Ext.device.Connection")
@js.native
object Connection extends js.Object {
  /** [Property] (String) */
  var CELL_2G: java.lang.String = js.native
  /** [Property] (String) */
  var CELL_3G: java.lang.String = js.native
  /** [Property] (String) */
  var CELL_4G: java.lang.String = js.native
  /** [Property] (String) */
  var ETHERNET: java.lang.String = js.native
  /** [Property] (String) */
  var NONE: java.lang.String = js.native
  /** [Property] (String) */
  var UNKNOWN: java.lang.String = js.native
  /** [Property] (String) */
  var WIFI: java.lang.String = js.native
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Appends an after event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addAfterListener(): scala.Unit = js.native
  def addAfterListener(eventName: js.Any): scala.Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Appends a before event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addBeforeListener(): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
  		*/
  def addEvents(): scala.Unit = js.native
  def addEvents(eventNames: js.Any): scala.Unit = js.native
  /** [Method] Appends an event handler to this object
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def addListener(): scala.Unit = js.native
  def addListener(eventName: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def addManagedListener(): scala.Unit = js.native
  def addManagedListener(`object`: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Removes all listeners for this object  */
  def clearListeners(): scala.Unit = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param events String/String[] The event name to bubble, or an Array of event names.
  		*/
  def enableBubble(): scala.Unit = js.native
  def enableBubble(events: js.Any): scala.Unit = js.native
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
  		* @param eventName String The name of the event to fire.
  		* @param args Array Arguments to pass to handers.
  		* @param fn Function Action.
  		* @param scope Object Scope of fn.
  		* @returns Object
  		*/
  def fireAction(): js.Any = js.native
  def fireAction(eventName: java.lang.String): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: senchaUnderscoreTouchLib.ExtNs.Array): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: senchaUnderscoreTouchLib.ExtNs.Array, fn: js.Any): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: senchaUnderscoreTouchLib.ExtNs.Array, fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean Returns false if any of the handlers return false.
  		*/
  def fireEvent(eventName: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /** [Method] Returns the value of bubbleEvents
  		* @returns String/String[]
  		*/
  def getBubbleEvents(): js.Any = js.native
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  def getId(): java.lang.String = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns the value of listeners
  		* @returns Object
  		*/
  def getListeners(): js.Any = js.native
  /** [Method] Returns the value of online
  		* @returns Boolean
  		*/
  def getOnline(): scala.Boolean = js.native
  /** [Method] Returns the current connection type
  		* @returns String type
  		*/
  def getType(): java.lang.String = js.native
  /** [Method] Checks to see if this object has any listeners for a specified event
  		* @param eventName String The name of the event to check for
  		* @returns Boolean True if the event is being listened for, else false
  		*/
  def hasListener(): scala.Boolean = js.native
  def hasListener(eventName: java.lang.String): scala.Boolean = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] True if the device is currently online
  		* @returns Boolean online
  		*/
  def isOnline(): scala.Boolean = js.native
  /** [Method] Alias for addManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def mon(): scala.Unit = js.native
  def mon(`object`: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Alias for removeManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def mun(): scala.Unit = js.native
  def mun(`object`: js.Any): scala.Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Alias for addListener
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def on(): scala.Unit = js.native
  def on(eventName: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Alias for addAfterListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onAfter(): scala.Unit = js.native
  def onAfter(eventName: js.Any): scala.Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Alias for addBeforeListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onBefore(): scala.Unit = js.native
  def onBefore(eventName: js.Any): scala.Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  def relayEvents(): senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = js.native
  def relayEvents(`object`: js.Any): senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = js.native
  def relayEvents(`object`: js.Any, events: js.Any): senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeAfterListener(): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeBeforeListener(): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Removes an event handler
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def removeListener(): scala.Unit = js.native
  def removeListener(eventName: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def removeManagedListener(): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  /** [Method] Resumes firing events see suspendEvents
  		* @param discardQueuedEvents Boolean Pass as true to discard any queued events.
  		*/
  def resumeEvents(): scala.Unit = js.native
  def resumeEvents(discardQueuedEvents: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String/String[] The new value.
  		*/
  def setBubbleEvents(): scala.Unit = js.native
  def setBubbleEvents(bubbleEvents: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of listeners
  		* @param listeners Object The new value.
  		*/
  def setListeners(): scala.Unit = js.native
  def setListeners(listeners: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of online
  		* @param online Boolean The new value.
  		*/
  def setOnline(): scala.Unit = js.native
  def setOnline(online: scala.Boolean): scala.Unit = js.native
  /** [Method] Sets the value of type
  		* @param type Object The new value.
  		*/
  def setType(): scala.Unit = js.native
  def setType(`type`: js.Any): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Suspends the firing of all events  */
  def suspendEvents(): scala.Unit = js.native
  /** [Method] Alias for removeListener
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def un(): scala.Unit = js.native
  def un(eventName: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): scala.Unit = js.native
  /** [Method] Alias for removeAfterListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unAfter(): scala.Unit = js.native
  def unAfter(eventName: js.Any): scala.Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
  /** [Method] Alias for removeBeforeListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unBefore(): scala.Unit = js.native
  def unBefore(eventName: js.Any): scala.Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any): scala.Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): scala.Unit = js.native
}

