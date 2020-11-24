package typings.reduxSagaCore.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunSagaOptions[A, S] extends js.Object {
  
  /**
    * See docs for `channel`
    */
  var channel: js.UndefOr[PredicateTakeableChannel[A]] = js.native
  
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var context: js.UndefOr[js.Object] = js.native
  
  /**
    * Used to fulfill `put` effects.
    *
    * @param output argument provided by the Saga to the `put` Effect
    */
  var dispatch: js.UndefOr[js.Function1[/* output */ A, _]] = js.native
  
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.native
  
  /**
    * Used to fulfill `select` and `getState` effects
    */
  var getState: js.UndefOr[js.Function0[S]] = js.native
  
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  /**
    * See docs for `createSagaMiddleware(options)`
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.native
}
object RunSagaOptions {
  
  @scala.inline
  def apply[A, S](): RunSagaOptions[A, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunSagaOptions[A, S]]
  }
  
  @scala.inline
  implicit class RunSagaOptionsOps[Self <: RunSagaOptions[_, _], A, S] (val x: Self with (RunSagaOptions[A, S])) extends AnyVal {
    
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
    def setChannel(value: PredicateTakeableChannel[A]): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDispatch(value: /* output */ A => _): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    
    @scala.inline
    def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = this.set("effectMiddlewares", js.Array(value :_*))
    
    @scala.inline
    def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = this.set("effectMiddlewares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectMiddlewares: Self = this.set("effectMiddlewares", js.undefined)
    
    @scala.inline
    def setGetState(value: () => S): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetState: Self = this.set("getState", js.undefined)
    
    @scala.inline
    def setOnError(value: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setSagaMonitor(value: SagaMonitor): Self = this.set("sagaMonitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSagaMonitor: Self = this.set("sagaMonitor", js.undefined)
  }
}
