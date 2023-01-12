package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatch
  extends StObject
     with IObservable {
  
  /** [Method] Adds a new operation to this batch
    * @param operation Object The Operation object.
    */
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Number) */
  var current: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns the value of autoStart
    * @returns Boolean
    */
  var getAutoStart: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of pauseOnException
    * @returns Boolean
    */
  var getPauseOnException: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of proxy
    * @returns Ext.data.Proxy
    */
  var getProxy: js.UndefOr[js.Function0[IProxy]] = js.undefined
  
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[Array] = js.undefined
  
  /** [Method] Pauses execution of the batch but does not cancel the current operation  */
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.data.Proxy) */
  var proxy: js.UndefOr[IProxy] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IBatch: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
  ] = js.undefined
  
  /** [Method] Executes a operation by its numeric index
    * @param index Number The operation index to run.
    */
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoStart
    * @param autoStart Boolean The new value.
    */
  var setAutoStart: js.UndefOr[js.Function1[/* autoStart */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of pauseOnException
    * @param pauseOnException Boolean The new value.
    */
  var setPauseOnException: js.UndefOr[js.Function1[/* pauseOnException */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of proxy
    * @param proxy Ext.data.Proxy The new value.
    */
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[IProxy], Unit]] = js.undefined
  
  /** [Method] Kicks off the execution of the batch continuing from the next operation if the previous operation encountered an exc  */
  var start: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Number) */
  var total: js.UndefOr[Double] = js.undefined
}
object IBatch {
  
  inline def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBatch] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* operation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setGetAutoStart(value: () => Boolean): Self = StObject.set(x, "getAutoStart", js.Any.fromFunction0(value))
    
    inline def setGetAutoStartUndefined: Self = StObject.set(x, "getAutoStart", js.undefined)
    
    inline def setGetPauseOnException(value: () => Boolean): Self = StObject.set(x, "getPauseOnException", js.Any.fromFunction0(value))
    
    inline def setGetPauseOnExceptionUndefined: Self = StObject.set(x, "getPauseOnException", js.undefined)
    
    inline def setGetProxy(value: () => IProxy): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    inline def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    inline def setHasException(value: Boolean): Self = StObject.set(x, "hasException", value.asInstanceOf[js.Any])
    
    inline def setHasExceptionUndefined: Self = StObject.set(x, "hasException", js.undefined)
    
    inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    inline def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
    
    inline def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    
    inline def setOperations(value: Array): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPauseOnException(value: Boolean): Self = StObject.set(x, "pauseOnException", value.asInstanceOf[js.Any])
    
    inline def setPauseOnExceptionUndefined: Self = StObject.set(x, "pauseOnException", js.undefined)
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setProxy(value: IProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRunOperation(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "runOperation", js.Any.fromFunction1(value))
    
    inline def setRunOperationUndefined: Self = StObject.set(x, "runOperation", js.undefined)
    
    inline def setSetAutoStart(value: /* autoStart */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoStart", js.Any.fromFunction1(value))
    
    inline def setSetAutoStartUndefined: Self = StObject.set(x, "setAutoStart", js.undefined)
    
    inline def setSetPauseOnException(value: /* pauseOnException */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPauseOnException", js.Any.fromFunction1(value))
    
    inline def setSetPauseOnExceptionUndefined: Self = StObject.set(x, "setPauseOnException", js.undefined)
    
    inline def setSetProxy(value: /* proxy */ js.UndefOr[IProxy] => Unit): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    inline def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
