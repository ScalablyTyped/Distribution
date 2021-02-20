package typings.reduxBatchedSubscribe

import typings.redux.mod.StoreEnhancer
import typings.redux.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-batched-subscribe", "batchedSubscribe")
  @js.native
  def batchedSubscribe(batch: BatchFunction): StoreEnhancer[StoreExtension, js.Object] = js.native
  
  type BatchFunction = js.Function1[/* notify */ NotifyFunction, Unit]
  
  type NotifyFunction = js.Function0[Unit]
  
  @js.native
  trait StoreExtension extends StObject {
    
    def subscribeImmediate(listener: js.Function0[Unit]): Unsubscribe = js.native
    @JSName("subscribeImmediate")
    var subscribeImmediate_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe] = js.native
  }
}
