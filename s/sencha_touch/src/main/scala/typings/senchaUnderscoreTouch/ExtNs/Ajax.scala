package typings.senchaUnderscoreTouch.ExtNs

import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Ajax")
@js.native
class Ajax () extends js.Object

/* static members */
@JSGlobal("Ext.Ajax")
@js.native
object Ajax extends js.Object {
  /** [Property] (Boolean) */
  var autoAbort: Boolean = js.native
  /** [Property] (Ext.Class) */
  var self: IClass = js.native
  /** [Method] Aborts any outstanding request
  		* @param request Object Defaults to the last request.
  		*/
  def abort(): Unit = js.native
  def abort(request: js.Any): Unit = js.native
  /** [Method] Aborts all outstanding requests  */
  def abortAll(): Unit = js.native
  /** [Method] Appends an after event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addAfterListener(): Unit = js.native
  def addAfterListener(eventName: js.Any): Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Appends a before event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def addBeforeListener(): Unit = js.native
  def addBeforeListener(eventName: js.Any): Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
  		*/
  def addEvents(): Unit = js.native
  def addEvents(eventNames: js.Any): Unit = js.native
  /** [Method] Appends an event handler to this object
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def addListener(): Unit = js.native
  def addListener(eventName: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def addListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def addManagedListener(): Unit = js.native
  def addManagedListener(`object`: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def addManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
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
  def clearListeners(): Unit = js.native
  /** [Method]  */
  def destroy(): Unit = js.native
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param events String/String[] The event name to bubble, or an Array of event names.
  		*/
  def enableBubble(): Unit = js.native
  def enableBubble(events: js.Any): Unit = js.native
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
  		* @param eventName String The name of the event to fire.
  		* @param args Array Arguments to pass to handers.
  		* @param fn Function Action.
  		* @param scope Object Scope of fn.
  		* @returns Object
  		*/
  def fireAction(): js.Any = js.native
  def fireAction(eventName: java.lang.String): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: Array): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: Array, fn: js.Any): js.Any = js.native
  def fireAction(eventName: java.lang.String, args: Array, fn: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean Returns false if any of the handlers return false.
  		*/
  def fireEvent(eventName: java.lang.String, args: js.Any*): Boolean = js.native
  /** [Method] Returns the value of async
  		* @returns Boolean
  		*/
  def getAsync(): Boolean = js.native
  /** [Method] Returns the value of autoAbort
  		* @returns Boolean
  		*/
  def getAutoAbort(): Boolean = js.native
  /** [Method] Returns the value of bubbleEvents
  		* @returns String/String[]
  		*/
  def getBubbleEvents(): js.Any = js.native
  /** [Method] Returns the value of defaultHeaders
  		* @returns Object
  		*/
  def getDefaultHeaders(): js.Any = js.native
  /** [Method] Returns the value of defaultPostHeader
  		* @returns String
  		*/
  def getDefaultPostHeader(): java.lang.String = js.native
  /** [Method] Returns the value of defaultXhrHeader
  		* @returns String
  		*/
  def getDefaultXhrHeader(): java.lang.String = js.native
  /** [Method] Returns the value of disableCaching
  		* @returns Boolean
  		*/
  def getDisableCaching(): Boolean = js.native
  /** [Method] Returns the value of disableCachingParam
  		* @returns String
  		*/
  def getDisableCachingParam(): java.lang.String = js.native
  /** [Method] Returns the value of extraParams
  		* @returns Object
  		*/
  def getExtraParams(): js.Any = js.native
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
  /** [Method] Returns the value of method
  		* @returns String
  		*/
  def getMethod(): java.lang.String = js.native
  /** [Method] Returns the value of password
  		* @returns String
  		*/
  def getPassword(): java.lang.String = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  def getTimeout(): Double = js.native
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  def getUrl(): java.lang.String = js.native
  /** [Method] Returns the value of useDefaultHeader
  		* @returns Boolean
  		*/
  def getUseDefaultHeader(): Boolean = js.native
  /** [Method] Returns the value of useDefaultXhrHeader
  		* @returns Boolean
  		*/
  def getUseDefaultXhrHeader(): Boolean = js.native
  /** [Method] Returns the value of username
  		* @returns String
  		*/
  def getUsername(): java.lang.String = js.native
  /** [Method] Checks to see if this object has any listeners for a specified event
  		* @param eventName String The name of the event to check for
  		* @returns Boolean True if the event is being listened for, else false
  		*/
  def hasListener(): Boolean = js.native
  def hasListener(eventName: java.lang.String): Boolean = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object The request to check.
  		* @returns Boolean True if there is an outstanding request.
  		*/
  def isLoading(): Boolean = js.native
  def isLoading(request: js.Any): Boolean = js.native
  /** [Method] Alias for addManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  def mon(): Unit = js.native
  def mon(`object`: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def mon(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Alias for removeManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def mun(): Unit = js.native
  def mun(`object`: js.Any): Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any): Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def mun(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Alias for addListener
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  def on(): Unit = js.native
  def on(eventName: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def on(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Alias for addAfterListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onAfter(): Unit = js.native
  def onAfter(eventName: js.Any): Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any): Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def onAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Alias for addBeforeListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  def onBefore(): Unit = js.native
  def onBefore(eventName: js.Any): Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any): Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def onBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code.
  		* @param xhr XMLHttpRequest
  		* @returns Object An object containing success/status state.
  		*/
  def parseStatus(): js.Any = js.native
  def parseStatus(status: Double): js.Any = js.native
  def parseStatus(status: Double, xhr: XMLHttpRequest): js.Any = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  def relayEvents(): IObservable = js.native
  def relayEvents(`object`: js.Any): IObservable = js.native
  def relayEvents(`object`: js.Any, events: js.Any): IObservable = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeAfterListener(): Unit = js.native
  def removeAfterListener(eventName: js.Any): Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def removeAfterListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def removeBeforeListener(): Unit = js.native
  def removeBeforeListener(eventName: js.Any): Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def removeBeforeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Removes an event handler
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def removeListener(): Unit = js.native
  def removeListener(eventName: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def removeListener(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  def removeManagedListener(): Unit = js.native
  def removeManagedListener(`object`: js.Any): Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any): Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any): Unit = js.native
  def removeManagedListener(`object`: js.Any, eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform post-processing in a callback because it is passed to callback functions.)
  		* @returns Object/null The request object. This may be used to cancel the request.
  		*/
  def request(): js.Any = js.native
  def request(options: js.Any): js.Any = js.native
  /** [Method] Resumes firing events see suspendEvents
  		* @param discardQueuedEvents Boolean Pass as true to discard any queued events.
  		*/
  def resumeEvents(): Unit = js.native
  def resumeEvents(discardQueuedEvents: Boolean): Unit = js.native
  /** [Method] Sets the value of async
  		* @param async Boolean The new value.
  		*/
  def setAsync(): Unit = js.native
  def setAsync(async: Boolean): Unit = js.native
  /** [Method] Sets the value of autoAbort
  		* @param autoAbort Boolean The new value.
  		*/
  def setAutoAbort(): Unit = js.native
  def setAutoAbort(autoAbort: Boolean): Unit = js.native
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String/String[] The new value.
  		*/
  def setBubbleEvents(): Unit = js.native
  def setBubbleEvents(bubbleEvents: js.Any): Unit = js.native
  /** [Method] Sets the value of defaultHeaders
  		* @param defaultHeaders Object The new value.
  		*/
  def setDefaultHeaders(): Unit = js.native
  def setDefaultHeaders(defaultHeaders: js.Any): Unit = js.native
  /** [Method] Sets the value of defaultPostHeader
  		* @param defaultPostHeader String The new value.
  		*/
  def setDefaultPostHeader(): Unit = js.native
  def setDefaultPostHeader(defaultPostHeader: java.lang.String): Unit = js.native
  /** [Method] Sets the value of defaultXhrHeader
  		* @param defaultXhrHeader String The new value.
  		*/
  def setDefaultXhrHeader(): Unit = js.native
  def setDefaultXhrHeader(defaultXhrHeader: java.lang.String): Unit = js.native
  /** [Method] Sets the value of disableCaching
  		* @param disableCaching Boolean The new value.
  		*/
  def setDisableCaching(): Unit = js.native
  def setDisableCaching(disableCaching: Boolean): Unit = js.native
  /** [Method] Sets the value of disableCachingParam
  		* @param disableCachingParam String The new value.
  		*/
  def setDisableCachingParam(): Unit = js.native
  def setDisableCachingParam(disableCachingParam: java.lang.String): Unit = js.native
  /** [Method] Sets the value of extraParams
  		* @param extraParams Object The new value.
  		*/
  def setExtraParams(): Unit = js.native
  def setExtraParams(extraParams: js.Any): Unit = js.native
  /** [Method] Sets the value of listeners
  		* @param listeners Object The new value.
  		*/
  def setListeners(): Unit = js.native
  def setListeners(listeners: js.Any): Unit = js.native
  /** [Method] Sets the value of method
  		* @param method String The new value.
  		*/
  def setMethod(): Unit = js.native
  def setMethod(method: java.lang.String): Unit = js.native
  /** [Method] Sets various options such as the url params for the request
  		* @param options Object The initial options.
  		* @param scope Object The scope to execute in.
  		* @returns Object The params for the request.
  		*/
  def setOptions(): js.Any = js.native
  def setOptions(options: js.Any): js.Any = js.native
  def setOptions(options: js.Any, scope: js.Any): js.Any = js.native
  /** [Method] Sets the value of password
  		* @param password String The new value.
  		*/
  def setPassword(): Unit = js.native
  def setPassword(password: java.lang.String): Unit = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  def setTimeout(): Unit = js.native
  def setTimeout(timeout: Double): Unit = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  def setUrl(): Unit = js.native
  def setUrl(url: java.lang.String): Unit = js.native
  /** [Method] Sets the value of useDefaultHeader
  		* @param useDefaultHeader Boolean The new value.
  		*/
  def setUseDefaultHeader(): Unit = js.native
  def setUseDefaultHeader(useDefaultHeader: Boolean): Unit = js.native
  /** [Method] Sets the value of useDefaultXhrHeader
  		* @param useDefaultXhrHeader Boolean The new value.
  		*/
  def setUseDefaultXhrHeader(): Unit = js.native
  def setUseDefaultXhrHeader(useDefaultXhrHeader: Boolean): Unit = js.native
  /** [Method] Sets the value of username
  		* @param username String The new value.
  		*/
  def setUsername(): Unit = js.native
  def setUsername(username: java.lang.String): Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): IClass = js.native
  /** [Method] Suspends the firing of all events  */
  def suspendEvents(): Unit = js.native
  /** [Method] Alias for removeListener
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  def un(): Unit = js.native
  def un(eventName: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  def un(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any, order: java.lang.String): Unit = js.native
  /** [Method] Alias for removeAfterListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unAfter(): Unit = js.native
  def unAfter(eventName: js.Any): Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any): Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def unAfter(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Alias for removeBeforeListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  def unBefore(): Unit = js.native
  def unBefore(eventName: js.Any): Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any): Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def unBefore(eventName: js.Any, fn: js.Any, scope: js.Any, options: js.Any): Unit = js.native
  /** [Method] Uploads a form using a hidden iframe
  		* @param form String/HTMLElement/Ext.Element The form to upload.
  		* @param url String The url to post to.
  		* @param params String Any extra parameters to pass.
  		* @param options Object The initial options.
  		*/
  def upload(): Unit = js.native
  def upload(form: js.Any): Unit = js.native
  def upload(form: js.Any, url: java.lang.String): Unit = js.native
  def upload(form: js.Any, url: java.lang.String, params: java.lang.String): Unit = js.native
  def upload(form: js.Any, url: java.lang.String, params: java.lang.String, options: js.Any): Unit = js.native
}

