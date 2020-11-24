package typings.reduxSagaCore.typesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SagaMiddlewareOptions[C /* <: js.Object */] extends js.Object {
  
  /**
    * Initial value of the saga's context.
    */
  var context: js.UndefOr[C] = js.native
  
  /**
    * Allows you to intercept any effect, resolve it on your own and pass to the
    * next middleware.
    */
  var effectMiddlewares: js.UndefOr[js.Array[EffectMiddleware]] = js.native
  
  /**
    * If provided, the middleware will call it with uncaught errors from Sagas.
    * useful for sending uncaught exceptions to error tracking services.
    */
  var onError: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  /**
    * If a Saga Monitor is provided, the middleware will deliver monitoring
    * events to the monitor.
    */
  var sagaMonitor: js.UndefOr[SagaMonitor] = js.native
}
object SagaMiddlewareOptions {
  
  @scala.inline
  def apply[C /* <: js.Object */](): SagaMiddlewareOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SagaMiddlewareOptions[C]]
  }
  
  @scala.inline
  implicit class SagaMiddlewareOptionsOps[Self <: SagaMiddlewareOptions[_], C /* <: js.Object */] (val x: Self with SagaMiddlewareOptions[C]) extends AnyVal {
    
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
    def setContext(value: C): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEffectMiddlewaresVarargs(value: EffectMiddleware*): Self = this.set("effectMiddlewares", js.Array(value :_*))
    
    @scala.inline
    def setEffectMiddlewares(value: js.Array[EffectMiddleware]): Self = this.set("effectMiddlewares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectMiddlewares: Self = this.set("effectMiddlewares", js.undefined)
    
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
