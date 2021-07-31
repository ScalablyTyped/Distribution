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
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], Unit]] = js.undefined
  
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
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
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
  
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  
  @scala.inline
  implicit class IBatchMutableBuilder[Self <: IBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: /* operation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setGetAutoStart(value: () => Boolean): Self = StObject.set(x, "getAutoStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoStartUndefined: Self = StObject.set(x, "getAutoStart", js.undefined)
    
    @scala.inline
    def setGetPauseOnException(value: () => Boolean): Self = StObject.set(x, "getPauseOnException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPauseOnExceptionUndefined: Self = StObject.set(x, "getPauseOnException", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => IProxy): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    @scala.inline
    def setHasException(value: Boolean): Self = StObject.set(x, "hasException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExceptionUndefined: Self = StObject.set(x, "hasException", js.undefined)
    
    @scala.inline
    def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    @scala.inline
    def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRunningUndefined: Self = StObject.set(x, "isRunning", js.undefined)
    
    @scala.inline
    def setOperations(value: Array): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPauseOnException(value: Boolean): Self = StObject.set(x, "pauseOnException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnExceptionUndefined: Self = StObject.set(x, "pauseOnException", js.undefined)
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setProxy(value: IProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    @scala.inline
    def setRunOperation(value: /* index */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "runOperation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunOperationUndefined: Self = StObject.set(x, "runOperation", js.undefined)
    
    @scala.inline
    def setSetAutoStart(value: /* autoStart */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoStartUndefined: Self = StObject.set(x, "setAutoStart", js.undefined)
    
    @scala.inline
    def setSetPauseOnException(value: /* pauseOnException */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setPauseOnException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPauseOnExceptionUndefined: Self = StObject.set(x, "setPauseOnException", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[IProxy] => Unit): Self = StObject.set(x, "setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProxyUndefined: Self = StObject.set(x, "setProxy", js.undefined)
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
