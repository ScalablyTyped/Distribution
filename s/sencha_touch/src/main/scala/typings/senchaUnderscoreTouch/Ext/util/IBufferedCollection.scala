package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.senchaUnderscoreTouch.Ext.IClass because Already inherited
- typings.senchaUnderscoreTouch.Ext.IBase because Already inherited
- typings.senchaUnderscoreTouch.Ext.mixin.IIdentifiable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getId, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined 
- typings.senchaUnderscoreTouch.Ext.util.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bubbleEvents, listeners, addAfterListener, addBeforeListener, addEvents, addListener, addManagedListener, clearListeners, enableBubble, fireAction, fireEvent, getBubbleEvents, getId, getListeners, hasListener, mon, mun, on, onAfter, onBefore, relayEvents, removeAfterListener, removeBeforeListener, removeListener, removeManagedListener, resumeEvents, setBubbleEvents, setListeners, suspendEvents, un, unAfter, unBefore */ trait IBufferedCollection extends ICollection {
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
      /* order */ js.UndefOr[java.lang.String], 
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
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean Returns false if any of the handlers return false.
  		*/
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, Boolean]] = js.undefined
  /** [Method] Returns the value of bubbleEvents
  		* @returns String/String[]
  		*/
  var getBubbleEvents: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Retrieves the id of this component
  		* @returns any id
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of listeners
  		* @returns Object
  		*/
  var getListeners: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of pageSize
  		* @returns Number
  		*/
  var getPageSize: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Checks to see if this object has any listeners for a specified event
  		* @param eventName String The name of the event to check for
  		* @returns Boolean True if the event is being listened for, else false
  		*/
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
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
      /* order */ js.UndefOr[java.lang.String], 
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
      /* order */ js.UndefOr[java.lang.String], 
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
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[Double], Unit]] = js.undefined
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
      /* order */ js.UndefOr[java.lang.String], 
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

object IBufferedCollection {
  @scala.inline
  def apply(
    add: (/* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addAll: /* addItems */ js.UndefOr[js.Any] => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addFilter: js.UndefOr[js.Any] => Unit = null,
    addFilters: js.UndefOr[js.Any | Array] => _ = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addSorter: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    addSorters: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    alias: Array = null,
    all: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: () => Unit = null,
    clearListeners: () => Unit = null,
    clone: () => IMixedCollection = null,
    config: js.Any = null,
    contains: /* item */ js.UndefOr[js.Any] => Boolean = null,
    containsKey: /* key */ js.UndefOr[java.lang.String] => Boolean = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    destroy: () => Unit = null,
    dirtyFilterFn: js.UndefOr[Boolean] = js.undefined,
    dirtySortFn: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    eachKey: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    filter: (js.Function1[/* data */ js.UndefOr[Array], Array]) | (js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      Array
    ]) = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection = null,
    filterRoot: java.lang.String = null,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filters: Array = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    findIndexBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double = null,
    findInsertionIndex: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    first: () => _ = null,
    get: /* key */ js.UndefOr[js.Any] => _ = null,
    getAt: /* index */ js.UndefOr[Double] => _ = null,
    getAutoFilter: () => Boolean = null,
    getAutoSort: () => Boolean = null,
    getBubbleEvents: () => _ = null,
    getByKey: /* key */ js.UndefOr[js.Any] => _ = null,
    getCount: () => Double = null,
    getDefaultSortDirection: () => java.lang.String = null,
    getFilterFn: () => _ = null,
    getFilterRoot: () => java.lang.String = null,
    getFilters: () => Array = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getKey: /* item */ js.UndefOr[js.Any] => _ = null,
    getListeners: () => _ = null,
    getPageSize: () => Double = null,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array = null,
    getSortFn: () => _ = null,
    getSortRoot: () => java.lang.String = null,
    getSorters: () => Array = null,
    getTotalCount: () => Double = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    indexOf: /* item */ js.UndefOr[js.Any] => Double = null,
    indexOfKey: /* key */ js.UndefOr[java.lang.String] => Double = null,
    indices: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insert: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    insertFilter: (js.UndefOr[Double], js.UndefOr[js.Any]) => _ = null,
    insertFilters: (js.UndefOr[Double], js.UndefOr[Array]) => Array = null,
    insertSorter: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    insertSorters: () => IBufferedCollection = null,
    items: Array = null,
    keys: Array = null,
    last: () => _ = null,
    length: Int | Double = null,
    listeners: js.Any = null,
    map: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IBufferedCollection = null,
    remove: /* item */ js.UndefOr[js.Any] => _ = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeAll: /* items */ js.UndefOr[Array] => IMixedCollection = null,
    removeAt: /* index */ js.UndefOr[Double] => _ = null,
    removeAtKey: /* key */ js.UndefOr[java.lang.String] => _ = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeFilters: js.UndefOr[js.Any | Array] => IBufferedCollection | Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeSorter: /* sorter */ js.UndefOr[js.Any] => Unit = null,
    removeSorters: /* sorters */ js.UndefOr[js.Any] => IBufferedCollection = null,
    replace: (/* oldKey */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setAutoFilter: /* autoFilter */ js.UndefOr[Boolean] => Unit = null,
    setAutoSort: /* autoSort */ js.UndefOr[Boolean] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setDefaultSortDirection: /* defaultSortDirection */ js.UndefOr[java.lang.String] => Unit = null,
    setFilterRoot: js.UndefOr[java.lang.String] => Unit = null,
    setFilters: js.UndefOr[Array] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setPageSize: /* pageSize */ js.UndefOr[Double] => Unit = null,
    setSortRoot: /* sortRoot */ js.UndefOr[java.lang.String] => Unit = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Unit = null,
    setTotalCount: /* totalCount */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => Array = null,
    sortRoot: java.lang.String = null,
    sorted: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IBufferedCollection = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1(addAll))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction1(addFilter))
    if (addFilters != null) __obj.updateDynamic("addFilters")(js.Any.fromFunction1(addFilters))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (addSorter != null) __obj.updateDynamic("addSorter")(js.Any.fromFunction2(addSorter))
    if (addSorters != null) __obj.updateDynamic("addSorters")(js.Any.fromFunction2(addSorters))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1(containsKey))
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn.asInstanceOf[js.Any])
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (eachKey != null) __obj.updateDynamic("eachKey")(js.Any.fromFunction2(eachKey))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction2(findBy))
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(js.Any.fromFunction3(findIndexBy))
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(js.Any.fromFunction2(findInsertionIndex))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction0(first))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getAutoFilter != null) __obj.updateDynamic("getAutoFilter")(js.Any.fromFunction0(getAutoFilter))
    if (getAutoSort != null) __obj.updateDynamic("getAutoSort")(js.Any.fromFunction0(getAutoSort))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getByKey != null) __obj.updateDynamic("getByKey")(js.Any.fromFunction1(getByKey))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(js.Any.fromFunction0(getDefaultSortDirection))
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(js.Any.fromFunction0(getFilterFn))
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(js.Any.fromFunction0(getFilterRoot))
    if (getFilters != null) __obj.updateDynamic("getFilters")(js.Any.fromFunction0(getFilters))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1(getKey))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getPageSize != null) __obj.updateDynamic("getPageSize")(js.Any.fromFunction0(getPageSize))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2(getRange))
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(js.Any.fromFunction0(getSortFn))
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(js.Any.fromFunction0(getSortRoot))
    if (getSorters != null) __obj.updateDynamic("getSorters")(js.Any.fromFunction0(getSorters))
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(js.Any.fromFunction0(getTotalCount))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(js.Any.fromFunction1(indexOfKey))
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction3(insert))
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(js.Any.fromFunction2(insertFilter))
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(js.Any.fromFunction2(insertFilters))
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(js.Any.fromFunction3(insertSorter))
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(js.Any.fromFunction0(insertSorters))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction0(last))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1(removeAt))
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(js.Any.fromFunction1(removeAtKey))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(js.Any.fromFunction1(removeFilters))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(js.Any.fromFunction1(removeSorter))
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(js.Any.fromFunction1(removeSorters))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2(replace))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAutoFilter != null) __obj.updateDynamic("setAutoFilter")(js.Any.fromFunction1(setAutoFilter))
    if (setAutoSort != null) __obj.updateDynamic("setAutoSort")(js.Any.fromFunction1(setAutoSort))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(js.Any.fromFunction1(setDefaultSortDirection))
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(js.Any.fromFunction1(setFilterRoot))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1(setFilters))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setPageSize != null) __obj.updateDynamic("setPageSize")(js.Any.fromFunction1(setPageSize))
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(js.Any.fromFunction1(setSortRoot))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1(setSorters))
    if (setTotalCount != null) __obj.updateDynamic("setTotalCount")(js.Any.fromFunction1(setTotalCount))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferedCollection]
  }
}

