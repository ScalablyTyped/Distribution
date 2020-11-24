package typings.reduxBatchedSubscribe

import typings.redux.mod.StoreEnhancer
import typings.redux.mod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-batched-subscribe", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def batchedSubscribe(batch: BatchFunction): StoreEnhancer[StoreExtension, js.Object] = js.native
  
  @js.native
  trait StoreExtension extends js.Object {
    
    def subscribeImmediate(listener: js.Function0[Unit]): Unsubscribe = js.native
    @JSName("subscribeImmediate")
    var subscribeImmediate_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe] = js.native
  }
  
  type BatchFunction = js.Function1[/* notify */ NotifyFunction, Unit]
  
  type NotifyFunction = js.Function0[Unit]
}
