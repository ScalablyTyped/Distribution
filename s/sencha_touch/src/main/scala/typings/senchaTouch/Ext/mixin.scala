package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixin {
  
  type IBindable = IMixin
  
  @js.native
  trait IFilterable extends IBase {
    
    /** [Method] This method adds a filter
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      */
    var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] This method adds all the filters in a passed array
      * @param filters Array An array with filters. A filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Object
      */
    var addFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], _]] = js.native
    
    /** [Property] (Object) */
    var currentSortFn: js.UndefOr[js.Any] = js.native
    
    /** [Property] (Boolean) */
    var dirtyFilterFn: js.UndefOr[Boolean] = js.native
    
    /** [Method] This method will sort an array based on the currently configured sorters
      * @param data Array The array you want to have sorted.
      * @returns Array The array you passed after it is sorted.
      */
    var filter: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.native
    
    /** [Config Option] (String) */
    var filterRoot: js.UndefOr[java.lang.String] = js.native
    
    /** [Property] (Boolean) */
    var filtered: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Array) */
    var filters: js.UndefOr[Array] = js.native
    
    /** [Method] Returns an up to date sort function
      * @returns Function sortFn The sort function.
      */
    var getFilterFn: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of filterRoot
      * @returns String
      */
    var getFilterRoot: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of filters
      * @returns Array
      */
    var getFilters: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] This method adds a filter at a given index
      * @param index Number The index at which to insert the filter.
      * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Object
      */
    var insertFilter: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] This method inserts all the filters in the passed array at the given index
      * @param index Number The index at which to insert the filters.
      * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
      * @returns Array
      */
    var insertFilters: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array], Array]
      ] = js.native
    
    /** [Method] This method removes all the filters in a passed array
      * @param filters Array Each value in the array can be a string (property name), function (sorterFn), an object containing a property and value keys or Sorter instance.
      */
    var removeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
    
    /** [Method] Sets the value of filterRoot
      * @param filterRoot String The new value.
      */
    var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of filters
      * @param filters Array The new value.
      */
    var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
  }
  object IFilterable {
    
    @scala.inline
    def apply(): IFilterable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFilterable]
    }
    
    @scala.inline
    implicit class IFilterableMutableBuilder[Self <: IFilterable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddFilter(value: /* filter */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddFilterUndefined: Self = StObject.set(x, "addFilter", js.undefined)
      
      @scala.inline
      def setAddFilters(value: /* filters */ js.UndefOr[Array] => _): Self = StObject.set(x, "addFilters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddFiltersUndefined: Self = StObject.set(x, "addFilters", js.undefined)
      
      @scala.inline
      def setCurrentSortFn(value: js.Any): Self = StObject.set(x, "currentSortFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentSortFnUndefined: Self = StObject.set(x, "currentSortFn", js.undefined)
      
      @scala.inline
      def setDirtyFilterFn(value: Boolean): Self = StObject.set(x, "dirtyFilterFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyFilterFnUndefined: Self = StObject.set(x, "dirtyFilterFn", js.undefined)
      
      @scala.inline
      def setFilter(value: /* data */ js.UndefOr[Array] => Array): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterRoot(value: java.lang.String): Self = StObject.set(x, "filterRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRootUndefined: Self = StObject.set(x, "filterRoot", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
      
      @scala.inline
      def setFilters(value: Array): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setGetFilterFn(value: () => _): Self = StObject.set(x, "getFilterFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFilterFnUndefined: Self = StObject.set(x, "getFilterFn", js.undefined)
      
      @scala.inline
      def setGetFilterRoot(value: () => java.lang.String): Self = StObject.set(x, "getFilterRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFilterRootUndefined: Self = StObject.set(x, "getFilterRoot", js.undefined)
      
      @scala.inline
      def setGetFilters(value: () => Array): Self = StObject.set(x, "getFilters", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFiltersUndefined: Self = StObject.set(x, "getFilters", js.undefined)
      
      @scala.inline
      def setInsertFilter(value: (/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "insertFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertFilterUndefined: Self = StObject.set(x, "insertFilter", js.undefined)
      
      @scala.inline
      def setInsertFilters(value: (/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array]) => Array): Self = StObject.set(x, "insertFilters", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertFiltersUndefined: Self = StObject.set(x, "insertFilters", js.undefined)
      
      @scala.inline
      def setRemoveFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "removeFilters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveFiltersUndefined: Self = StObject.set(x, "removeFilters", js.undefined)
      
      @scala.inline
      def setSetFilterRoot(value: /* filterRoot */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setFilterRoot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFilterRootUndefined: Self = StObject.set(x, "setFilterRoot", js.undefined)
      
      @scala.inline
      def setSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFilters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFiltersUndefined: Self = StObject.set(x, "setFilters", js.undefined)
    }
  }
  
  @js.native
  trait IIdentifiable extends IBase {
    
    /** [Method] Retrieves the id of this component
      * @returns any id
      */
    var getId: js.UndefOr[js.Function0[_]] = js.native
  }
  object IIdentifiable {
    
    @scala.inline
    def apply(): IIdentifiable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIdentifiable]
    }
    
    @scala.inline
    implicit class IIdentifiableMutableBuilder[Self <: IIdentifiable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetId(value: () => _): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    }
  }
  
  type IMixin = IBase
  
  @js.native
  trait IObservable extends IIdentifiable {
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
      */
    var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** [Config Option] (String/String[]) */
    var bubbleEvents: js.UndefOr[js.Any] = js.native
    
    /** [Method] Removes all listeners for this object  */
    var clearListeners: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param events String/String[] The event name to bubble, or an Array of event names.
      */
    var enableBubble: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.native
    
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
      ] = js.native
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean Returns false if any of the handlers return false.
      */
    var fireEvent: js.UndefOr[js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, Boolean]] = js.native
    
    /** [Method] Returns the value of bubbleEvents
      * @returns String/String[]
      */
    var getBubbleEvents: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of listeners
      * @returns Object
      */
    var getListeners: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Checks to see if this object has any listeners for a specified event
      * @param eventName String The name of the event to check for
      * @returns Boolean True if the event is being listened for, else false
      */
    var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[java.lang.String], Boolean]] = js.native
    
    /** [Config Option] (Object) */
    var listeners: js.UndefOr[js.Any] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    var relayEvents: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], this.type]
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** [Method] Resumes firing events see suspendEvents
      * @param discardQueuedEvents Boolean Pass as true to discard any queued events.
      */
    var resumeEvents: js.UndefOr[js.Function1[/* discardQueuedEvents */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of bubbleEvents
      * @param bubbleEvents String/String[] The new value.
      */
    var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of listeners
      * @param listeners Object The new value.
      */
    var setListeners: js.UndefOr[js.Function1[/* listeners */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Suspends the firing of all events  */
    var suspendEvents: js.UndefOr[js.Function0[Unit]] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
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
        value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit
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
        value: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
      ): Self = StObject.set(x, "fireAction", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFireActionUndefined: Self = StObject.set(x, "fireAction", js.undefined)
      
      @scala.inline
      def setFireEvent(value: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
      
      @scala.inline
      def setGetBubbleEvents(value: () => _): Self = StObject.set(x, "getBubbleEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBubbleEventsUndefined: Self = StObject.set(x, "getBubbleEvents", js.undefined)
      
      @scala.inline
      def setGetListeners(value: () => _): Self = StObject.set(x, "getListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetListenersUndefined: Self = StObject.set(x, "getListeners", js.undefined)
      
      @scala.inline
      def setHasListener(value: /* eventName */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
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
        value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit
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
        value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit
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
        value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit
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
  
  @js.native
  trait IProgressable extends IBase {
    
    /** [Config Option] (Boolean) */
    var dynamic: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the value of dynamic
      * @returns Boolean
      */
    var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of maxProgressInput
      * @returns Number
      */
    var getMaxProgressInput: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of maxProgressOutput
      * @returns Number
      */
    var getMaxProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of minProgressInput
      * @returns Number
      */
    var getMinProgressInput: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of minProgressOutput
      * @returns Number
      */
    var getMinProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of state
      * @returns String
      */
    var getState: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Config Option] (Number) */
    var maxProgressInput: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var maxProgressOutput: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var minProgressInput: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Number) */
    var minProgressOutput: js.UndefOr[Double] = js.native
    
    /** [Method] Sets the value of dynamic
      * @param dynamic Boolean The new value.
      */
    var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of maxProgressInput
      * @param maxProgressInput Number The new value.
      */
    var setMaxProgressInput: js.UndefOr[js.Function1[/* maxProgressInput */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of maxProgressOutput
      * @param maxProgressOutput Number The new value.
      */
    var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of minProgressInput
      * @param minProgressInput Number The new value.
      */
    var setMinProgressInput: js.UndefOr[js.Function1[/* minProgressInput */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of minProgressOutput
      * @param minProgressOutput Number The new value.
      */
    var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Sets the value of state
      * @param state String The new value.
      */
    var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Config Option] (String) */
    var state: js.UndefOr[java.lang.String] = js.native
  }
  object IProgressable {
    
    @scala.inline
    def apply(): IProgressable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgressable]
    }
    
    @scala.inline
    implicit class IProgressableMutableBuilder[Self <: IProgressable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      @scala.inline
      def setGetDynamic(value: () => Boolean): Self = StObject.set(x, "getDynamic", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDynamicUndefined: Self = StObject.set(x, "getDynamic", js.undefined)
      
      @scala.inline
      def setGetMaxProgressInput(value: () => Double): Self = StObject.set(x, "getMaxProgressInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxProgressInputUndefined: Self = StObject.set(x, "getMaxProgressInput", js.undefined)
      
      @scala.inline
      def setGetMaxProgressOutput(value: () => Double): Self = StObject.set(x, "getMaxProgressOutput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxProgressOutputUndefined: Self = StObject.set(x, "getMaxProgressOutput", js.undefined)
      
      @scala.inline
      def setGetMinProgressInput(value: () => Double): Self = StObject.set(x, "getMinProgressInput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinProgressInputUndefined: Self = StObject.set(x, "getMinProgressInput", js.undefined)
      
      @scala.inline
      def setGetMinProgressOutput(value: () => Double): Self = StObject.set(x, "getMinProgressOutput", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinProgressOutputUndefined: Self = StObject.set(x, "getMinProgressOutput", js.undefined)
      
      @scala.inline
      def setGetState(value: () => java.lang.String): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      @scala.inline
      def setMaxProgressInput(value: Double): Self = StObject.set(x, "maxProgressInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxProgressInputUndefined: Self = StObject.set(x, "maxProgressInput", js.undefined)
      
      @scala.inline
      def setMaxProgressOutput(value: Double): Self = StObject.set(x, "maxProgressOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxProgressOutputUndefined: Self = StObject.set(x, "maxProgressOutput", js.undefined)
      
      @scala.inline
      def setMinProgressInput(value: Double): Self = StObject.set(x, "minProgressInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinProgressInputUndefined: Self = StObject.set(x, "minProgressInput", js.undefined)
      
      @scala.inline
      def setMinProgressOutput(value: Double): Self = StObject.set(x, "minProgressOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinProgressOutputUndefined: Self = StObject.set(x, "minProgressOutput", js.undefined)
      
      @scala.inline
      def setSetDynamic(value: /* dynamic */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDynamic", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDynamicUndefined: Self = StObject.set(x, "setDynamic", js.undefined)
      
      @scala.inline
      def setSetMaxProgressInput(value: /* maxProgressInput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxProgressInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxProgressInputUndefined: Self = StObject.set(x, "setMaxProgressInput", js.undefined)
      
      @scala.inline
      def setSetMaxProgressOutput(value: /* maxProgressOutput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxProgressOutput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxProgressOutputUndefined: Self = StObject.set(x, "setMaxProgressOutput", js.undefined)
      
      @scala.inline
      def setSetMinProgressInput(value: /* minProgressInput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinProgressInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinProgressInputUndefined: Self = StObject.set(x, "setMinProgressInput", js.undefined)
      
      @scala.inline
      def setSetMinProgressOutput(value: /* minProgressOutput */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinProgressOutput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinProgressOutputUndefined: Self = StObject.set(x, "setMinProgressOutput", js.undefined)
      
      @scala.inline
      def setSetState(value: /* state */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
      
      @scala.inline
      def setState(value: java.lang.String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait ISelectable extends IBase {
    
    /** [Config Option] (Boolean) */
    var allowDeselect: js.UndefOr[Boolean] = js.native
    
    /** [Method] Deselects any currently selected records and clears all stored selections  */
    var clearSelections: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Deselects the given record s
      * @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
      * @param suppressEvent Boolean If true the deselect event will not be fired.
      */
    var deselect: js.UndefOr[
        js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Method] Deselects all records
      * @param supress Object
      */
    var deselectAll: js.UndefOr[js.Function1[/* supress */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var deselectOnContainerClick: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var disableSelection: js.UndefOr[Boolean] = js.native
    
    /** [Method] Deselects a record instance by record instance or index
      * @param records Ext.data.Model/Number An array of records or an index.
      * @param suppressEvent Boolean Set to false to not fire a deselect event.
      */
    var doDeselect: js.UndefOr[
        js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
      ] = js.native
    
    /** [Method] Selects a record instance by record instance or index
      * @param records Ext.data.Model/Number An array of records or an index.
      * @param keepExisting Boolean
      * @param suppressEvent Boolean Set to false to not fire a select event.
      */
    var doSelect: js.UndefOr[
        js.Function3[
          /* records */ js.UndefOr[js.Any], 
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Returns the value of allowDeselect
      * @returns Boolean
      */
    var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the number of selections
      * @returns Number
      */
    var getCount: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of deselectOnContainerClick
      * @returns Boolean
      */
    var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of disableSelection
      * @returns Boolean
      */
    var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the array of previously selected items
      * @returns Array The previous selection.
      */
    var getLastSelected: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the value of mode
      * @returns String
      */
    var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns an array of the currently selected records
      * @returns Array An array of selected records.
      */
    var getSelection: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the number of selections
      * @returns Number
      */
    var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the selection mode currently used by this Selectable
      * @returns String The current mode.
      */
    var getSelectionMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns true if there is a selected record
      * @returns Boolean
      */
    var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns true if the Selectable is currently locked
      * @returns Boolean True if currently locked
      */
    var isLocked: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns true if the specified row is selected
      * @param record Ext.data.Model/Number The record or index of the record to check.
      * @returns Boolean
      */
    var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.native
    
    /** [Config Option] (Boolean) */
    var locked: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String) */
    var mode: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Adds the given records to the currently selected set
      * @param records Ext.data.Model/Array/Number The records to select.
      * @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
      * @param suppressEvent Boolean If true, the select event will not be fired.
      */
    var select: js.UndefOr[
        js.Function3[
          /* records */ js.UndefOr[js.Any], 
          /* keepExisting */ js.UndefOr[Boolean], 
          /* suppressEvent */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Selects all records
      * @param silent Boolean true to suppress all select events.
      */
    var selectAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
      * @param startRecord Number The index of the first row in the range.
      * @param endRecord Number The index of the last row in the range.
      * @param keepExisting Boolean true to retain existing selections.
      */
    var selectRange: js.UndefOr[
        js.Function3[
          /* startRecord */ js.UndefOr[Double], 
          /* endRecord */ js.UndefOr[Double], 
          /* keepExisting */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Sets the value of allowDeselect
      * @param allowDeselect Boolean The new value.
      */
    var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of deselectOnContainerClick
      * @param deselectOnContainerClick Boolean The new value.
      */
    var setDeselectOnContainerClick: js.UndefOr[js.Function1[/* deselectOnContainerClick */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of disableSelection
      * @param disableSelection Boolean The new value.
      */
    var setDisableSelection: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
    var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Sets the value of mode
      * @param mode String The new value.
      */
    var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets a record as the last focused record
      * @param newRecord Ext.data.Record
      * @param oldRecord Ext.data.Record
      */
    var updateLastFocused: js.UndefOr[
        js.Function2[/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord], Unit]
      ] = js.native
  }
  object ISelectable {
    
    @scala.inline
    def apply(): ISelectable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectable]
    }
    
    @scala.inline
    implicit class ISelectableMutableBuilder[Self <: ISelectable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
      
      @scala.inline
      def setClearSelections(value: () => Unit): Self = StObject.set(x, "clearSelections", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearSelectionsUndefined: Self = StObject.set(x, "clearSelections", js.undefined)
      
      @scala.inline
      def setDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeselectAll(value: /* supress */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "deselectAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeselectAllUndefined: Self = StObject.set(x, "deselectAll", js.undefined)
      
      @scala.inline
      def setDeselectOnContainerClick(value: Boolean): Self = StObject.set(x, "deselectOnContainerClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeselectOnContainerClickUndefined: Self = StObject.set(x, "deselectOnContainerClick", js.undefined)
      
      @scala.inline
      def setDeselectUndefined: Self = StObject.set(x, "deselect", js.undefined)
      
      @scala.inline
      def setDisableSelection(value: Boolean): Self = StObject.set(x, "disableSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSelectionUndefined: Self = StObject.set(x, "disableSelection", js.undefined)
      
      @scala.inline
      def setDoDeselect(value: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "doDeselect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoDeselectUndefined: Self = StObject.set(x, "doDeselect", js.undefined)
      
      @scala.inline
      def setDoSelect(
        value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "doSelect", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDoSelectUndefined: Self = StObject.set(x, "doSelect", js.undefined)
      
      @scala.inline
      def setGetAllowDeselect(value: () => Boolean): Self = StObject.set(x, "getAllowDeselect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllowDeselectUndefined: Self = StObject.set(x, "getAllowDeselect", js.undefined)
      
      @scala.inline
      def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
      
      @scala.inline
      def setGetDeselectOnContainerClick(value: () => Boolean): Self = StObject.set(x, "getDeselectOnContainerClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDeselectOnContainerClickUndefined: Self = StObject.set(x, "getDeselectOnContainerClick", js.undefined)
      
      @scala.inline
      def setGetDisableSelection(value: () => Boolean): Self = StObject.set(x, "getDisableSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDisableSelectionUndefined: Self = StObject.set(x, "getDisableSelection", js.undefined)
      
      @scala.inline
      def setGetLastSelected(value: () => Array): Self = StObject.set(x, "getLastSelected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastSelectedUndefined: Self = StObject.set(x, "getLastSelected", js.undefined)
      
      @scala.inline
      def setGetMode(value: () => java.lang.String): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModeUndefined: Self = StObject.set(x, "getMode", js.undefined)
      
      @scala.inline
      def setGetSelection(value: () => Array): Self = StObject.set(x, "getSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectionCount(value: () => Double): Self = StObject.set(x, "getSelectionCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectionCountUndefined: Self = StObject.set(x, "getSelectionCount", js.undefined)
      
      @scala.inline
      def setGetSelectionMode(value: () => java.lang.String): Self = StObject.set(x, "getSelectionMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectionModeUndefined: Self = StObject.set(x, "getSelectionMode", js.undefined)
      
      @scala.inline
      def setGetSelectionUndefined: Self = StObject.set(x, "getSelection", js.undefined)
      
      @scala.inline
      def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
      
      @scala.inline
      def setIsLocked(value: () => Boolean): Self = StObject.set(x, "isLocked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      @scala.inline
      def setIsSelected(value: /* record */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      @scala.inline
      def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setSelect(
        value: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
      
      @scala.inline
      def setSelectRange(
        value: (/* startRecord */ js.UndefOr[Double], /* endRecord */ js.UndefOr[Double], /* keepExisting */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "selectRange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSetAllowDeselect(value: /* allowDeselect */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowDeselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAllowDeselectUndefined: Self = StObject.set(x, "setAllowDeselect", js.undefined)
      
      @scala.inline
      def setSetDeselectOnContainerClick(value: /* deselectOnContainerClick */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDeselectOnContainerClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDeselectOnContainerClickUndefined: Self = StObject.set(x, "setDeselectOnContainerClick", js.undefined)
      
      @scala.inline
      def setSetDisableSelection(value: /* disableSelection */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisableSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisableSelectionUndefined: Self = StObject.set(x, "setDisableSelection", js.undefined)
      
      @scala.inline
      def setSetLastFocused(value: () => Unit): Self = StObject.set(x, "setLastFocused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetLastFocusedUndefined: Self = StObject.set(x, "setLastFocused", js.undefined)
      
      @scala.inline
      def setSetMode(value: /* mode */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetModeUndefined: Self = StObject.set(x, "setMode", js.undefined)
      
      @scala.inline
      def setUpdateLastFocused(value: (/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord]) => Unit): Self = StObject.set(x, "updateLastFocused", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateLastFocusedUndefined: Self = StObject.set(x, "updateLastFocused", js.undefined)
    }
  }
  
  @js.native
  trait ISortable extends IBase {
    
    /** [Method] This method adds a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    var addSorter: js.UndefOr[
        js.Function2[
          /* sorter */ js.UndefOr[js.Any], 
          /* defaultDirection */ js.UndefOr[java.lang.String], 
          Unit
        ]
      ] = js.native
    
    /** [Method] This method adds all the sorters in a passed array
      * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    var addSorters: js.UndefOr[
        js.Function2[
          /* sorters */ js.UndefOr[Array], 
          /* defaultDirection */ js.UndefOr[java.lang.String], 
          Unit
        ]
      ] = js.native
    
    /** [Property] (Object) */
    var currentSortFn: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var defaultSortDirection: js.UndefOr[java.lang.String] = js.native
    
    /** [Property] (Boolean) */
    var dirtySortFn: js.UndefOr[Boolean] = js.native
    
    /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
      * @param items Array The array that you want to insert the item into.
      * @param item Mixed The item that you want to insert into the items array.
      * @returns Number The index for the given item in the given array based on the current sorters.
      */
    var findInsertionIndex: js.UndefOr[
        js.Function2[/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any], Double]
      ] = js.native
    
    /** [Method] Returns the value of defaultSortDirection
      * @returns String
      */
    var getDefaultSortDirection: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns an up to date sort function
      * @returns Function The sort function.
      */
    var getSortFn: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of sortRoot
      * @returns String
      */
    var getSortRoot: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of sorters
      * @returns Array
      */
    var getSorters: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] This method adds a sorter at a given index
      * @param index Number The index at which to insert the sorter.
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    var insertSorter: js.UndefOr[
        js.Function3[
          /* index */ js.UndefOr[Double], 
          /* sorter */ js.UndefOr[js.Any], 
          /* defaultDirection */ js.UndefOr[java.lang.String], 
          Unit
        ]
      ] = js.native
    
    /** [Method] This method inserts all the sorters in the passed array at the given index
      * @param index Number The index at which to insert the sorters.
      * @param sorters Array Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
      */
    var insertSorters: js.UndefOr[
        js.Function3[
          /* index */ js.UndefOr[Double], 
          /* sorters */ js.UndefOr[Array], 
          /* defaultDirection */ js.UndefOr[java.lang.String], 
          Unit
        ]
      ] = js.native
    
    /** [Method] This method removes a sorter
      * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
      */
    var removeSorter: js.UndefOr[js.Function1[/* sorter */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] This method removes all the sorters in a passed array
      * @param sorters Array Each value in the array can be a string (property name), function (sorterFn) or Sorter instance.
      */
    var removeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
    
    /** [Method] Sets the value of defaultSortDirection
      * @param defaultSortDirection String The new value.
      */
    var setDefaultSortDirection: js.UndefOr[js.Function1[/* defaultSortDirection */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of sortRoot
      * @param sortRoot String The new value.
      */
    var setSortRoot: js.UndefOr[js.Function1[/* sortRoot */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of sorters
      * @param sorters Array The new value.
      */
    var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
    
    /** [Method] This method will sort an array based on the currently configured sorters
      * @param data Array The array you want to have sorted.
      * @returns Array The array you passed after it is sorted.
      */
    var sort: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.native
    
    /** [Config Option] (String) */
    var sortRoot: js.UndefOr[java.lang.String] = js.native
    
    /** [Property] (Boolean) */
    var sorted: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Array) */
    var sorters: js.UndefOr[Array] = js.native
  }
  object ISortable {
    
    @scala.inline
    def apply(): ISortable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISortable]
    }
    
    @scala.inline
    implicit class ISortableMutableBuilder[Self <: ISortable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddSorter(
        value: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "addSorter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddSorterUndefined: Self = StObject.set(x, "addSorter", js.undefined)
      
      @scala.inline
      def setAddSorters(
        value: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "addSorters", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddSortersUndefined: Self = StObject.set(x, "addSorters", js.undefined)
      
      @scala.inline
      def setCurrentSortFn(value: js.Any): Self = StObject.set(x, "currentSortFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentSortFnUndefined: Self = StObject.set(x, "currentSortFn", js.undefined)
      
      @scala.inline
      def setDefaultSortDirection(value: java.lang.String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
      
      @scala.inline
      def setDirtySortFn(value: Boolean): Self = StObject.set(x, "dirtySortFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtySortFnUndefined: Self = StObject.set(x, "dirtySortFn", js.undefined)
      
      @scala.inline
      def setFindInsertionIndex(value: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double): Self = StObject.set(x, "findInsertionIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindInsertionIndexUndefined: Self = StObject.set(x, "findInsertionIndex", js.undefined)
      
      @scala.inline
      def setGetDefaultSortDirection(value: () => java.lang.String): Self = StObject.set(x, "getDefaultSortDirection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultSortDirectionUndefined: Self = StObject.set(x, "getDefaultSortDirection", js.undefined)
      
      @scala.inline
      def setGetSortFn(value: () => _): Self = StObject.set(x, "getSortFn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSortFnUndefined: Self = StObject.set(x, "getSortFn", js.undefined)
      
      @scala.inline
      def setGetSortRoot(value: () => java.lang.String): Self = StObject.set(x, "getSortRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSortRootUndefined: Self = StObject.set(x, "getSortRoot", js.undefined)
      
      @scala.inline
      def setGetSorters(value: () => Array): Self = StObject.set(x, "getSorters", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSortersUndefined: Self = StObject.set(x, "getSorters", js.undefined)
      
      @scala.inline
      def setInsertSorter(
        value: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "insertSorter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertSorterUndefined: Self = StObject.set(x, "insertSorter", js.undefined)
      
      @scala.inline
      def setInsertSorters(
        value: (/* index */ js.UndefOr[Double], /* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "insertSorters", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInsertSortersUndefined: Self = StObject.set(x, "insertSorters", js.undefined)
      
      @scala.inline
      def setRemoveSorter(value: /* sorter */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeSorter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveSorterUndefined: Self = StObject.set(x, "removeSorter", js.undefined)
      
      @scala.inline
      def setRemoveSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "removeSorters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveSortersUndefined: Self = StObject.set(x, "removeSorters", js.undefined)
      
      @scala.inline
      def setSetDefaultSortDirection(value: /* defaultSortDirection */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDefaultSortDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDefaultSortDirectionUndefined: Self = StObject.set(x, "setDefaultSortDirection", js.undefined)
      
      @scala.inline
      def setSetSortRoot(value: /* sortRoot */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setSortRoot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSortRootUndefined: Self = StObject.set(x, "setSortRoot", js.undefined)
      
      @scala.inline
      def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setSorters", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSortersUndefined: Self = StObject.set(x, "setSorters", js.undefined)
      
      @scala.inline
      def setSort(value: /* data */ js.UndefOr[Array] => Array): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortRoot(value: java.lang.String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
      
      @scala.inline
      def setSorters(value: Array): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    }
  }
  
  type ITemplatable = IMixin
  
  type ITraversable = IMixin
}
