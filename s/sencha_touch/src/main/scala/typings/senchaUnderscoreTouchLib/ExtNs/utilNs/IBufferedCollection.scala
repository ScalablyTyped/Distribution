package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.utilNs.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bubbleEvents, listeners, addAfterListener, addBeforeListener, addEvents, addListener, addManagedListener, clearListeners, enableBubble, fireAction, fireEvent, getBubbleEvents, getId, getListeners, hasListener, mon, mun, on, onAfter, onBefore, relayEvents, removeAfterListener, removeBeforeListener, removeListener, removeManagedListener, resumeEvents, setBubbleEvents, setListeners, suspendEvents, un, unAfter, unBefore */ trait IBufferedCollection extends ICollection {
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
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
  		*/
  var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String/String[]) */
  var bubbleEvents: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes all listeners for this object  */
  var clearListeners: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param events String/String[] The event name to bubble, or an Array of event names.
  		*/
  var enableBubble: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
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
  var fireEvent: js.UndefOr[
    js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean]
  ] = js.undefined
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
  var getPageSize: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Checks to see if this object has any listeners for a specified event
  		* @param eventName String The name of the event to check for
  		* @returns Boolean True if the event is being listened for, else false
  		*/
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Resumes firing events see suspendEvents
  		* @param discardQueuedEvents Boolean Pass as true to discard any queued events.
  		*/
  var resumeEvents: js.UndefOr[js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String/String[] The new value.
  		*/
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of listeners
  		* @param listeners Object The new value.
  		*/
  var setListeners: js.UndefOr[js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Suspends the firing of all events  */
  var suspendEvents: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
      scala.Unit
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
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
}

object IBufferedCollection {
  @scala.inline
  def apply(
    add: js.Function2[/* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any], _] = null,
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addAll: js.Function1[/* addItems */ js.UndefOr[js.Any], scala.Unit] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilter: js.Function1[/* filter */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilters: js.Function1[/* filters */ js.UndefOr[js.Any], _] = null,
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
    addSorter: js.Function2[
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addSorters: js.Function2[
      /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    all: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function0[scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clone: js.Function0[IMixedCollection] = null,
    config: js.Any = null,
    contains: js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean] = null,
    containsKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    dirtyFilterFn: js.UndefOr[scala.Boolean] = js.undefined,
    dirtySortFn: js.UndefOr[scala.Boolean] = js.undefined,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    eachKey: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    filter: js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    filterBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection] = null,
    filterRoot: java.lang.String = null,
    filtered: js.UndefOr[scala.Boolean] = js.undefined,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    findBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _] = null,
    findIndexBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findInsertionIndex: js.Function2[
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* item */ js.UndefOr[js.Any], 
      scala.Double
    ] = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    first: js.Function0[_] = null,
    get: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getAutoFilter: js.Function0[scala.Boolean] = null,
    getAutoSort: js.Function0[scala.Boolean] = null,
    getBubbleEvents: js.Function0[_] = null,
    getByKey: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getCount: js.Function0[scala.Double] = null,
    getDefaultSortDirection: js.Function0[java.lang.String] = null,
    getFilterFn: js.Function0[_] = null,
    getFilterRoot: js.Function0[java.lang.String] = null,
    getFilters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getKey: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    getListeners: js.Function0[_] = null,
    getPageSize: js.Function0[scala.Double] = null,
    getRange: js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    getSortFn: js.Function0[_] = null,
    getSortRoot: js.Function0[java.lang.String] = null,
    getSorters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getTotalCount: js.Function0[scala.Double] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    indexOf: js.Function1[/* item */ js.UndefOr[js.Any], scala.Double] = null,
    indexOfKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Double] = null,
    indices: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    insert: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* key */ js.UndefOr[java.lang.String], 
      /* item */ js.UndefOr[js.Any], 
      _
    ] = null,
    insertFilter: js.Function2[/* index */ js.UndefOr[scala.Double], /* filter */ js.UndefOr[js.Any], _] = null,
    insertFilters: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    insertSorter: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    insertSorters: js.Function0[IBufferedCollection] = null,
    items: senchaUnderscoreTouchLib.ExtNs.Array = null,
    keys: senchaUnderscoreTouchLib.ExtNs.Array = null,
    last: js.Function0[_] = null,
    length: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    map: js.Any = null,
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
    platformConfig: js.Any = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      IBufferedCollection
    ] = null,
    remove: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeAll: js.Function1[/* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], IMixedCollection] = null,
    removeAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    removeAtKey: js.Function1[/* key */ js.UndefOr[java.lang.String], _] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeFilters: js.Function1[/* filters */ js.UndefOr[js.Any], IBufferedCollection] = null,
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
    removeSorter: js.Function1[/* sorter */ js.UndefOr[js.Any], scala.Unit] = null,
    removeSorters: js.Function1[/* sorters */ js.UndefOr[js.Any], IBufferedCollection] = null,
    replace: js.Function2[/* oldKey */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any], _] = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAutoFilter: js.Function1[/* autoFilter */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoSort: js.Function1[/* autoSort */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setDefaultSortDirection: js.Function1[/* defaultSortDirection */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFilterRoot: js.Function1[/* filterRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setPageSize: js.Function1[/* pageSize */ js.UndefOr[scala.Double], scala.Unit] = null,
    setSortRoot: js.Function1[/* sortRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setTotalCount: js.Function1[/* totalCount */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    sortRoot: java.lang.String = null,
    sorted: js.UndefOr[scala.Boolean] = js.undefined,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    statics: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
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
  ): IBufferedCollection = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addAll != null) __obj.updateDynamic("addAll")(addAll)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addFilter != null) __obj.updateDynamic("addFilter")(addFilter)
    if (addFilters != null) __obj.updateDynamic("addFilters")(addFilters)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (addSorter != null) __obj.updateDynamic("addSorter")(addSorter)
    if (addSorters != null) __obj.updateDynamic("addSorters")(addSorters)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (all != null) __obj.updateDynamic("all")(all)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (containsKey != null) __obj.updateDynamic("containsKey")(containsKey)
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn)
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn)
    if (each != null) __obj.updateDynamic("each")(each)
    if (eachKey != null) __obj.updateDynamic("eachKey")(eachKey)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot)
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(findIndexBy)
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(findInsertionIndex)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (first != null) __obj.updateDynamic("first")(first)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getAutoFilter != null) __obj.updateDynamic("getAutoFilter")(getAutoFilter)
    if (getAutoSort != null) __obj.updateDynamic("getAutoSort")(getAutoSort)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getByKey != null) __obj.updateDynamic("getByKey")(getByKey)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(getDefaultSortDirection)
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(getFilterFn)
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(getFilterRoot)
    if (getFilters != null) __obj.updateDynamic("getFilters")(getFilters)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getPageSize != null) __obj.updateDynamic("getPageSize")(getPageSize)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(getSortFn)
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(getSortRoot)
    if (getSorters != null) __obj.updateDynamic("getSorters")(getSorters)
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(getTotalCount)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(indexOfKey)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(insertFilter)
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(insertFilters)
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(insertSorter)
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(insertSorters)
    if (items != null) __obj.updateDynamic("items")(items)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (last != null) __obj.updateDynamic("last")(last)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (map != null) __obj.updateDynamic("map")(map)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(removeAtKey)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(removeFilters)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(removeSorter)
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(removeSorters)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAutoFilter != null) __obj.updateDynamic("setAutoFilter")(setAutoFilter)
    if (setAutoSort != null) __obj.updateDynamic("setAutoSort")(setAutoSort)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(setDefaultSortDirection)
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(setFilterRoot)
    if (setFilters != null) __obj.updateDynamic("setFilters")(setFilters)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setPageSize != null) __obj.updateDynamic("setPageSize")(setPageSize)
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(setSortRoot)
    if (setSorters != null) __obj.updateDynamic("setSorters")(setSorters)
    if (setTotalCount != null) __obj.updateDynamic("setTotalCount")(setTotalCount)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBufferedCollection]
  }
}

