package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDelayedTask extends IBase {
  
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Cancels any pending timeout and queues a new one
    * @param delay Number The milliseconds to delay
    * @param newFn Function Overrides the original function passed when instantiated.
    * @param newScope Object Overrides the original scope passed when instantiated. Remember that if no scope is specified, this will refer to the browser window.
    * @param newArgs Array Overrides the original args passed when instantiated.
    */
  var delay: js.UndefOr[
    js.Function4[
      /* delay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Returns the value of args
    * @returns Object
    */
  var getArgs: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of delay
    * @returns Object
    */
  var getDelay: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of fn
    * @returns Object
    */
  var getFn: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of interval
    * @returns Object
    */
  var getInterval: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of args
    * @param args Object The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of delay
    * @param delay Object The new value.
    */
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of fn
    * @param fn Object The new value.
    */
  var setFn: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of interval
    * @param interval Object The new value.
    */
  var setInterval: js.UndefOr[js.Function1[/* interval */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
}
object IDelayedTask {
  
  @scala.inline
  def apply(): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDelayedTask]
  }
  
  @scala.inline
  implicit class IDelayedTaskOps[Self <: IDelayedTask] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setDelay(
      value: (/* delay */ js.UndefOr[Double], /* newFn */ js.UndefOr[js.Any], /* newScope */ js.UndefOr[js.Any], /* newArgs */ js.UndefOr[Array]) => Unit
    ): Self = this.set("delay", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setGetArgs(value: () => _): Self = this.set("getArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetArgs: Self = this.set("getArgs", js.undefined)
    
    @scala.inline
    def setGetDelay(value: () => _): Self = this.set("getDelay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDelay: Self = this.set("getDelay", js.undefined)
    
    @scala.inline
    def setGetFn(value: () => _): Self = this.set("getFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFn: Self = this.set("getFn", js.undefined)
    
    @scala.inline
    def setGetInterval(value: () => _): Self = this.set("getInterval", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetInterval: Self = this.set("getInterval", js.undefined)
    
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    
    @scala.inline
    def setSetArgs(value: /* args */ js.UndefOr[js.Any] => Unit): Self = this.set("setArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetArgs: Self = this.set("setArgs", js.undefined)
    
    @scala.inline
    def setSetDelay(value: /* delay */ js.UndefOr[js.Any] => Unit): Self = this.set("setDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDelay: Self = this.set("setDelay", js.undefined)
    
    @scala.inline
    def setSetFn(value: /* fn */ js.UndefOr[js.Any] => Unit): Self = this.set("setFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFn: Self = this.set("setFn", js.undefined)
    
    @scala.inline
    def setSetInterval(value: /* interval */ js.UndefOr[js.Any] => Unit): Self = this.set("setInterval", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetInterval: Self = this.set("setInterval", js.undefined)
    
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
  }
}
