package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBatch extends IObservable {
  
  /** [Method] Adds a new operation to this batch
    * @param operation Object The Operation object.
    */
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Number) */
  var current: js.UndefOr[Double] = js.native
  
  /** [Method] Returns the value of autoStart
    * @returns Boolean
    */
  var getAutoStart: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of pauseOnException
    * @returns Boolean
    */
  var getPauseOnException: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of proxy
    * @returns Ext.data.Proxy
    */
  var getProxy: js.UndefOr[js.Function0[IProxy]] = js.native
  
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[Array] = js.native
  
  /** [Method] Pauses execution of the batch but does not cancel the current operation  */
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.data.Proxy) */
  var proxy: js.UndefOr[IProxy] = js.native
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param object Object The Observable whose events this object is to relay.
    * @param events String/Array/Object Array of event names to relay.
    * @returns Ext.mixin.Observable this
    */
  @JSName("relayEvents")
  var relayEvents_IBatch: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  
  /** [Method] Executes a operation by its numeric index
    * @param index Number The operation index to run.
    */
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of autoStart
    * @param autoStart Boolean The new value.
    */
  var setAutoStart: js.UndefOr[js.Function1[/* autoStart */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of pauseOnException
    * @param pauseOnException Boolean The new value.
    */
  var setPauseOnException: js.UndefOr[js.Function1[/* pauseOnException */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of proxy
    * @param proxy Ext.data.Proxy The new value.
    */
  var setProxy: js.UndefOr[js.Function1[/* proxy */ js.UndefOr[IProxy], Unit]] = js.native
  
  /** [Method] Kicks off the execution of the batch continuing from the next operation if the previous operation encountered an exc  */
  var start: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Number) */
  var total: js.UndefOr[Double] = js.native
}
object IBatch {
  
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  
  @scala.inline
  implicit class IBatchOps[Self <: IBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: /* operation */ js.UndefOr[js.Any] => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    
    @scala.inline
    def setGetAutoStart(value: () => Boolean): Self = this.set("getAutoStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoStart: Self = this.set("getAutoStart", js.undefined)
    
    @scala.inline
    def setGetPauseOnException(value: () => Boolean): Self = this.set("getPauseOnException", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPauseOnException: Self = this.set("getPauseOnException", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => IProxy): Self = this.set("getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    
    @scala.inline
    def setHasException(value: Boolean): Self = this.set("hasException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasException: Self = this.set("hasException", js.undefined)
    
    @scala.inline
    def setIsComplete(value: Boolean): Self = this.set("isComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsComplete: Self = this.set("isComplete", js.undefined)
    
    @scala.inline
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRunning: Self = this.set("isRunning", js.undefined)
    
    @scala.inline
    def setOperations(value: Array): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPauseOnException(value: Boolean): Self = this.set("pauseOnException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnException: Self = this.set("pauseOnException", js.undefined)
    
    @scala.inline
    def setProxy(value: IProxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setRunOperation(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("runOperation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRunOperation: Self = this.set("runOperation", js.undefined)
    
    @scala.inline
    def setSetAutoStart(value: /* autoStart */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoStart: Self = this.set("setAutoStart", js.undefined)
    
    @scala.inline
    def setSetPauseOnException(value: /* pauseOnException */ js.UndefOr[Boolean] => Unit): Self = this.set("setPauseOnException", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPauseOnException: Self = this.set("setPauseOnException", js.undefined)
    
    @scala.inline
    def setSetProxy(value: /* proxy */ js.UndefOr[IProxy] => Unit): Self = this.set("setProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetProxy: Self = this.set("setProxy", js.undefined)
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
