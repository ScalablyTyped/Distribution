package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object direct {
  
  trait IEvent
    extends StObject
       with IBase {
    
    /** [Config Option] (Object) */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of code
      * @returns Object
      */
    var getCode: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of data
      * @returns Object
      */
    var getData: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of message
      * @returns String
      */
    var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of name
      * @returns String
      */
    var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of result
      * @returns Object
      */
    var getResult: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of status
      * @returns Boolean
      */
    var getStatus: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of transaction
      * @returns Object
      */
    var getTransaction: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of xhr
      * @returns Object
      */
    var getXhr: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (String) */
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value of code
      * @param code Object The new value.
      */
    var setCode: js.UndefOr[js.Function1[/* code */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of data
      * @param data Object The new value.
      */
    var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of message
      * @param message String The new value.
      */
    var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of name
      * @param name String The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of result
      * @param result Object The new value.
      */
    var setResult: js.UndefOr[js.Function1[/* result */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of status
      * @param status Boolean The new value.
      */
    var setStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of transaction
      * @param transaction Object The new value.
      */
    var setTransaction: js.UndefOr[js.Function1[/* transaction */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of xhr
      * @param xhr Object The new value.
      */
    var setXhr: js.UndefOr[js.Function1[/* xhr */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IEvent {
    
    inline def apply(): IEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEvent]
    }
    
    extension [Self <: IEvent](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGetCode(value: () => js.Any): Self = StObject.set(x, "getCode", js.Any.fromFunction0(value))
      
      inline def setGetCodeUndefined: Self = StObject.set(x, "getCode", js.undefined)
      
      inline def setGetData(value: () => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      inline def setGetMessage(value: () => java.lang.String): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
      
      inline def setGetMessageUndefined: Self = StObject.set(x, "getMessage", js.undefined)
      
      inline def setGetName(value: () => java.lang.String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetResult(value: () => js.Any): Self = StObject.set(x, "getResult", js.Any.fromFunction0(value))
      
      inline def setGetResultUndefined: Self = StObject.set(x, "getResult", js.undefined)
      
      inline def setGetStatus(value: () => Boolean): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      inline def setGetStatusUndefined: Self = StObject.set(x, "getStatus", js.undefined)
      
      inline def setGetTransaction(value: () => js.Any): Self = StObject.set(x, "getTransaction", js.Any.fromFunction0(value))
      
      inline def setGetTransactionUndefined: Self = StObject.set(x, "getTransaction", js.undefined)
      
      inline def setGetXhr(value: () => js.Any): Self = StObject.set(x, "getXhr", js.Any.fromFunction0(value))
      
      inline def setGetXhrUndefined: Self = StObject.set(x, "getXhr", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSetCode(value: /* code */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCode", js.Any.fromFunction1(value))
      
      inline def setSetCodeUndefined: Self = StObject.set(x, "setCode", js.undefined)
      
      inline def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      inline def setSetMessage(value: /* message */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMessage", js.Any.fromFunction1(value))
      
      inline def setSetMessageUndefined: Self = StObject.set(x, "setMessage", js.undefined)
      
      inline def setSetName(value: /* name */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      inline def setSetResult(value: /* result */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setResult", js.Any.fromFunction1(value))
      
      inline def setSetResultUndefined: Self = StObject.set(x, "setResult", js.undefined)
      
      inline def setSetStatus(value: /* status */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStatus", js.Any.fromFunction1(value))
      
      inline def setSetStatusUndefined: Self = StObject.set(x, "setStatus", js.undefined)
      
      inline def setSetTransaction(value: /* transaction */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTransaction", js.Any.fromFunction1(value))
      
      inline def setSetTransactionUndefined: Self = StObject.set(x, "setTransaction", js.undefined)
      
      inline def setSetXhr(value: /* xhr */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setXhr", js.Any.fromFunction1(value))
      
      inline def setSetXhrUndefined: Self = StObject.set(x, "setXhr", js.undefined)
    }
  }
  
  trait IExceptionEvent
    extends StObject
       with IRemotingEvent {
    
    /** [Method] Returns the value of error
      * @returns Object
      */
    var getError: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Sets the value of error
      * @param error Object The new value.
      */
    var setError: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IExceptionEvent {
    
    inline def apply(): IExceptionEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExceptionEvent]
    }
    
    extension [Self <: IExceptionEvent](x: Self) {
      
      inline def setGetError(value: () => js.Any): Self = StObject.set(x, "getError", js.Any.fromFunction0(value))
      
      inline def setGetErrorUndefined: Self = StObject.set(x, "getError", js.undefined)
      
      inline def setSetError(value: /* error */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
      
      inline def setSetErrorUndefined: Self = StObject.set(x, "setError", js.undefined)
    }
  }
  
  trait IJsonProvider
    extends StObject
       with IProvider {
    
    /** [Method] Create an event from a response object
      * @param response Object The XHR response object.
      * @returns Ext.direct.Event The event.
      */
    var createEvent: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IEvent]] = js.undefined
  }
  object IJsonProvider {
    
    inline def apply(): IJsonProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJsonProvider]
    }
    
    extension [Self <: IJsonProvider](x: Self) {
      
      inline def setCreateEvent(value: /* response */ js.UndefOr[js.Any] => IEvent): Self = StObject.set(x, "createEvent", js.Any.fromFunction1(value))
      
      inline def setCreateEventUndefined: Self = StObject.set(x, "createEvent", js.undefined)
    }
  }
  
  trait IManager
    extends StObject
       with IObservable
  object IManager {
    
    inline def apply(): IManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IManager]
    }
  }
  
  trait IPollingProvider
    extends StObject
       with IJsonProvider {
    
    /** [Config Option] (Object) */
    var baseParams: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of baseParams
      * @returns Object
      */
    var getBaseParams: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of interval
      * @returns Number
      */
    var getInterval: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of url
      * @returns String/Function
      */
    var getUrl: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (Number) */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the value of baseParams
      * @param baseParams Object The new value.
      */
    var setBaseParams: js.UndefOr[js.Function1[/* baseParams */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of interval
      * @param interval Number The new value.
      */
    var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of url
      * @param url String/Function The new value.
      */
    var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (String/Function) */
    var url: js.UndefOr[js.Any] = js.undefined
  }
  object IPollingProvider {
    
    inline def apply(): IPollingProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPollingProvider]
    }
    
    extension [Self <: IPollingProvider](x: Self) {
      
      inline def setBaseParams(value: js.Any): Self = StObject.set(x, "baseParams", value.asInstanceOf[js.Any])
      
      inline def setBaseParamsUndefined: Self = StObject.set(x, "baseParams", js.undefined)
      
      inline def setGetBaseParams(value: () => js.Any): Self = StObject.set(x, "getBaseParams", js.Any.fromFunction0(value))
      
      inline def setGetBaseParamsUndefined: Self = StObject.set(x, "getBaseParams", js.undefined)
      
      inline def setGetInterval(value: () => Double): Self = StObject.set(x, "getInterval", js.Any.fromFunction0(value))
      
      inline def setGetIntervalUndefined: Self = StObject.set(x, "getInterval", js.undefined)
      
      inline def setGetUrl(value: () => js.Any): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
      
      inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setSetBaseParams(value: /* baseParams */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBaseParams", js.Any.fromFunction1(value))
      
      inline def setSetBaseParamsUndefined: Self = StObject.set(x, "setBaseParams", js.undefined)
      
      inline def setSetInterval(value: /* interval */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setInterval", js.Any.fromFunction1(value))
      
      inline def setSetIntervalUndefined: Self = StObject.set(x, "setInterval", js.undefined)
      
      inline def setSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
      
      inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
      
      inline def setUrl(value: js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait IProvider
    extends StObject
       with IObservable {
    
    /** [Method] Abstract methods for subclasses to implement  */
    var connect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Abstract methods for subclasses to implement  */
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the value of id
      * @returns String
      */
    @JSName("getId")
    var getId_IProvider: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Config Option] (String) */
    var id: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns whether or not the server side is currently connected
      * @returns Boolean
      */
    var isConnected: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Property] (Boolean) */
    var isProvider: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IProvider: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.undefined
    
    /** [Method] Sets the value of id
      * @param id String The new value.
      */
    var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  }
  object IProvider {
    
    inline def apply(): IProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProvider]
    }
    
    extension [Self <: IProvider](x: Self) {
      
      inline def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      inline def setGetId(value: () => java.lang.String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      inline def setIsConnectedUndefined: Self = StObject.set(x, "isConnected", js.undefined)
      
      inline def setIsProvider(value: Boolean): Self = StObject.set(x, "isProvider", value.asInstanceOf[js.Any])
      
      inline def setIsProviderUndefined: Self = StObject.set(x, "isProvider", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setSetId(value: /* id */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
      
      inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
    }
  }
  
  trait IRemotingEvent
    extends StObject
       with IEvent {
    
    /** [Method] Returns the value of tid
      * @returns Object
      */
    var getTid: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Get the transaction associated with this event
      * @returns Ext.direct.Transaction The transaction
      */
    @JSName("getTransaction")
    var getTransaction_IRemotingEvent: js.UndefOr[js.Function0[ITransaction]] = js.undefined
    
    /** [Method] Sets the value of tid
      * @param tid Object The new value.
      */
    var setTid: js.UndefOr[js.Function1[/* tid */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IRemotingEvent {
    
    inline def apply(): IRemotingEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingEvent]
    }
    
    extension [Self <: IRemotingEvent](x: Self) {
      
      inline def setGetTid(value: () => js.Any): Self = StObject.set(x, "getTid", js.Any.fromFunction0(value))
      
      inline def setGetTidUndefined: Self = StObject.set(x, "getTid", js.undefined)
      
      inline def setGetTransaction(value: () => ITransaction): Self = StObject.set(x, "getTransaction", js.Any.fromFunction0(value))
      
      inline def setGetTransactionUndefined: Self = StObject.set(x, "getTransaction", js.undefined)
      
      inline def setSetTid(value: /* tid */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTid", js.Any.fromFunction1(value))
      
      inline def setSetTidUndefined: Self = StObject.set(x, "setTid", js.undefined)
    }
  }
  
  trait IRemotingMethod
    extends StObject
       with IBase {
    
    /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
      * @param args Array The arguments passed to the direct call
      * @returns Object An object with 3 properties, args, callback &amp; scope.
      */
    var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], js.Any]] = js.undefined
    
    /** [Method] Returns the value of formHandler
      * @returns Object
      */
    var getFormHandler: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of len
      * @returns Object
      */
    var getLen: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of name
      * @returns Object
      */
    var getName: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of ordered
      * @returns Boolean
      */
    var getOrdered: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of params
      * @returns Object
      */
    var getParams: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Sets the value of formHandler
      * @param formHandler Object The new value.
      */
    var setFormHandler: js.UndefOr[js.Function1[/* formHandler */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of len
      * @param len Object The new value.
      */
    var setLen: js.UndefOr[js.Function1[/* len */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of name
      * @param name Object The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of ordered
      * @param ordered Boolean The new value.
      */
    var setOrdered: js.UndefOr[js.Function1[/* ordered */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of params
      * @param params Object The new value.
      */
    var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IRemotingMethod {
    
    inline def apply(): IRemotingMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingMethod]
    }
    
    extension [Self <: IRemotingMethod](x: Self) {
      
      inline def setGetCallData(value: /* args */ js.UndefOr[Array] => js.Any): Self = StObject.set(x, "getCallData", js.Any.fromFunction1(value))
      
      inline def setGetCallDataUndefined: Self = StObject.set(x, "getCallData", js.undefined)
      
      inline def setGetFormHandler(value: () => js.Any): Self = StObject.set(x, "getFormHandler", js.Any.fromFunction0(value))
      
      inline def setGetFormHandlerUndefined: Self = StObject.set(x, "getFormHandler", js.undefined)
      
      inline def setGetLen(value: () => js.Any): Self = StObject.set(x, "getLen", js.Any.fromFunction0(value))
      
      inline def setGetLenUndefined: Self = StObject.set(x, "getLen", js.undefined)
      
      inline def setGetName(value: () => js.Any): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetOrdered(value: () => Boolean): Self = StObject.set(x, "getOrdered", js.Any.fromFunction0(value))
      
      inline def setGetOrderedUndefined: Self = StObject.set(x, "getOrdered", js.undefined)
      
      inline def setGetParams(value: () => js.Any): Self = StObject.set(x, "getParams", js.Any.fromFunction0(value))
      
      inline def setGetParamsUndefined: Self = StObject.set(x, "getParams", js.undefined)
      
      inline def setSetFormHandler(value: /* formHandler */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setFormHandler", js.Any.fromFunction1(value))
      
      inline def setSetFormHandlerUndefined: Self = StObject.set(x, "setFormHandler", js.undefined)
      
      inline def setSetLen(value: /* len */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLen", js.Any.fromFunction1(value))
      
      inline def setSetLenUndefined: Self = StObject.set(x, "setLen", js.undefined)
      
      inline def setSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      inline def setSetOrdered(value: /* ordered */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOrdered", js.Any.fromFunction1(value))
      
      inline def setSetOrderedUndefined: Self = StObject.set(x, "setOrdered", js.undefined)
      
      inline def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setParams", js.Any.fromFunction1(value))
      
      inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    }
  }
  
  trait IRemotingProvider
    extends StObject
       with IJsonProvider {
    
    /** [Config Option] (Object) */
    var actions: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Number/Boolean) */
    var enableBuffer: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (String) */
    var enableUrlEncode: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of actions
      * @returns Object
      */
    var getActions: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of enableBuffer
      * @returns Number/Boolean
      */
    var getEnableBuffer: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of enableUrlEncode
      * @returns String
      */
    var getEnableUrlEncode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of maxRetries
      * @returns Number
      */
    var getMaxRetries: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of namespace
      * @returns String/Object
      */
    var getNamespace: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of timeout
      * @returns Number
      */
    var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of url
      * @returns String
      */
    var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Config Option] (Number) */
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String/Object) */
    var namespace: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Sets the value of actions
      * @param actions Object The new value.
      */
    var setActions: js.UndefOr[js.Function1[/* actions */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of enableBuffer
      * @param enableBuffer Number/Boolean The new value.
      */
    var setEnableBuffer: js.UndefOr[js.Function1[/* enableBuffer */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of enableUrlEncode
      * @param enableUrlEncode String The new value.
      */
    var setEnableUrlEncode: js.UndefOr[js.Function1[/* enableUrlEncode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of maxRetries
      * @param maxRetries Number The new value.
      */
    var setMaxRetries: js.UndefOr[js.Function1[/* maxRetries */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of namespace
      * @param namespace String/Object The new value.
      */
    var setNamespace: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of timeout
      * @param timeout Number The new value.
      */
    var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of url
      * @param url String The new value.
      */
    var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  object IRemotingProvider {
    
    inline def apply(): IRemotingProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRemotingProvider]
    }
    
    extension [Self <: IRemotingProvider](x: Self) {
      
      inline def setActions(value: js.Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setEnableBuffer(value: js.Any): Self = StObject.set(x, "enableBuffer", value.asInstanceOf[js.Any])
      
      inline def setEnableBufferUndefined: Self = StObject.set(x, "enableBuffer", js.undefined)
      
      inline def setEnableUrlEncode(value: java.lang.String): Self = StObject.set(x, "enableUrlEncode", value.asInstanceOf[js.Any])
      
      inline def setEnableUrlEncodeUndefined: Self = StObject.set(x, "enableUrlEncode", js.undefined)
      
      inline def setGetActions(value: () => js.Any): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setGetActionsUndefined: Self = StObject.set(x, "getActions", js.undefined)
      
      inline def setGetEnableBuffer(value: () => js.Any): Self = StObject.set(x, "getEnableBuffer", js.Any.fromFunction0(value))
      
      inline def setGetEnableBufferUndefined: Self = StObject.set(x, "getEnableBuffer", js.undefined)
      
      inline def setGetEnableUrlEncode(value: () => java.lang.String): Self = StObject.set(x, "getEnableUrlEncode", js.Any.fromFunction0(value))
      
      inline def setGetEnableUrlEncodeUndefined: Self = StObject.set(x, "getEnableUrlEncode", js.undefined)
      
      inline def setGetMaxRetries(value: () => Double): Self = StObject.set(x, "getMaxRetries", js.Any.fromFunction0(value))
      
      inline def setGetMaxRetriesUndefined: Self = StObject.set(x, "getMaxRetries", js.undefined)
      
      inline def setGetNamespace(value: () => js.Any): Self = StObject.set(x, "getNamespace", js.Any.fromFunction0(value))
      
      inline def setGetNamespaceUndefined: Self = StObject.set(x, "getNamespace", js.undefined)
      
      inline def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
      
      inline def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
      
      inline def setGetUrl(value: () => java.lang.String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
      
      inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setNamespace(value: js.Any): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setSetActions(value: /* actions */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActions", js.Any.fromFunction1(value))
      
      inline def setSetActionsUndefined: Self = StObject.set(x, "setActions", js.undefined)
      
      inline def setSetEnableBuffer(value: /* enableBuffer */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEnableBuffer", js.Any.fromFunction1(value))
      
      inline def setSetEnableBufferUndefined: Self = StObject.set(x, "setEnableBuffer", js.undefined)
      
      inline def setSetEnableUrlEncode(value: /* enableUrlEncode */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setEnableUrlEncode", js.Any.fromFunction1(value))
      
      inline def setSetEnableUrlEncodeUndefined: Self = StObject.set(x, "setEnableUrlEncode", js.undefined)
      
      inline def setSetMaxRetries(value: /* maxRetries */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxRetries", js.Any.fromFunction1(value))
      
      inline def setSetMaxRetriesUndefined: Self = StObject.set(x, "setMaxRetries", js.undefined)
      
      inline def setSetNamespace(value: /* namespace */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setNamespace", js.Any.fromFunction1(value))
      
      inline def setSetNamespaceUndefined: Self = StObject.set(x, "setNamespace", js.undefined)
      
      inline def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
      
      inline def setSetUrl(value: /* url */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
      
      inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ITransaction
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of action
      * @returns Object
      */
    var getAction: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of args
      * @returns Object
      */
    var getArgs: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of callback
      * @returns Object
      */
    var getCallback: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of data
      * @returns Object
      */
    var getData: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of form
      * @returns Object
      */
    var getForm: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of id
      * @returns Object
      */
    var getId: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of method
      * @returns Object
      */
    var getMethod: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of provider
      * @returns Object
      */
    var getProvider: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of retryCount
      * @returns Number
      */
    var getRetryCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of action
      * @param action Object The new value.
      */
    var setAction: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of args
      * @param args Object The new value.
      */
    var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of callback
      * @param callback Object The new value.
      */
    var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of data
      * @param data Object The new value.
      */
    var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of form
      * @param form Object The new value.
      */
    var setForm: js.UndefOr[js.Function1[/* form */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of id
      * @param id Object The new value.
      */
    var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of method
      * @param method Object The new value.
      */
    var setMethod: js.UndefOr[js.Function1[/* method */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of provider
      * @param provider Object The new value.
      */
    var setProvider: js.UndefOr[js.Function1[/* provider */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of retryCount
      * @param retryCount Number The new value.
      */
    var setRetryCount: js.UndefOr[js.Function1[/* retryCount */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object ITransaction {
    
    inline def apply(): ITransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITransaction]
    }
    
    extension [Self <: ITransaction](x: Self) {
      
      inline def setGetAction(value: () => js.Any): Self = StObject.set(x, "getAction", js.Any.fromFunction0(value))
      
      inline def setGetActionUndefined: Self = StObject.set(x, "getAction", js.undefined)
      
      inline def setGetArgs(value: () => js.Any): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
      
      inline def setGetArgsUndefined: Self = StObject.set(x, "getArgs", js.undefined)
      
      inline def setGetCallback(value: () => js.Any): Self = StObject.set(x, "getCallback", js.Any.fromFunction0(value))
      
      inline def setGetCallbackUndefined: Self = StObject.set(x, "getCallback", js.undefined)
      
      inline def setGetData(value: () => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      inline def setGetForm(value: () => js.Any): Self = StObject.set(x, "getForm", js.Any.fromFunction0(value))
      
      inline def setGetFormUndefined: Self = StObject.set(x, "getForm", js.undefined)
      
      inline def setGetId(value: () => js.Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setGetMethod(value: () => js.Any): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
      
      inline def setGetMethodUndefined: Self = StObject.set(x, "getMethod", js.undefined)
      
      inline def setGetProvider(value: () => js.Any): Self = StObject.set(x, "getProvider", js.Any.fromFunction0(value))
      
      inline def setGetProviderUndefined: Self = StObject.set(x, "getProvider", js.undefined)
      
      inline def setGetRetryCount(value: () => Double): Self = StObject.set(x, "getRetryCount", js.Any.fromFunction0(value))
      
      inline def setGetRetryCountUndefined: Self = StObject.set(x, "getRetryCount", js.undefined)
      
      inline def setSetAction(value: /* action */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAction", js.Any.fromFunction1(value))
      
      inline def setSetActionUndefined: Self = StObject.set(x, "setAction", js.undefined)
      
      inline def setSetArgs(value: /* args */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setArgs", js.Any.fromFunction1(value))
      
      inline def setSetArgsUndefined: Self = StObject.set(x, "setArgs", js.undefined)
      
      inline def setSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
      
      inline def setSetCallbackUndefined: Self = StObject.set(x, "setCallback", js.undefined)
      
      inline def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      inline def setSetForm(value: /* form */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setForm", js.Any.fromFunction1(value))
      
      inline def setSetFormUndefined: Self = StObject.set(x, "setForm", js.undefined)
      
      inline def setSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
      
      inline def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
      
      inline def setSetMethod(value: /* method */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMethod", js.Any.fromFunction1(value))
      
      inline def setSetMethodUndefined: Self = StObject.set(x, "setMethod", js.undefined)
      
      inline def setSetProvider(value: /* provider */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setProvider", js.Any.fromFunction1(value))
      
      inline def setSetProviderUndefined: Self = StObject.set(x, "setProvider", js.undefined)
      
      inline def setSetRetryCount(value: /* retryCount */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRetryCount", js.Any.fromFunction1(value))
      
      inline def setSetRetryCountUndefined: Self = StObject.set(x, "setRetryCount", js.undefined)
    }
  }
  
  trait Manager extends StObject
}
