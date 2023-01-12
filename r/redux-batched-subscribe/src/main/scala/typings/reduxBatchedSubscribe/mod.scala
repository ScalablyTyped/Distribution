package typings.reduxBatchedSubscribe

import typings.redux.mod.StoreEnhancer
import typings.redux.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-batched-subscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def batchedSubscribe(batch: BatchFunction): StoreEnhancer[StoreExtension, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("batchedSubscribe")(batch.asInstanceOf[js.Any]).asInstanceOf[StoreEnhancer[StoreExtension, js.Object]]
  
  type BatchFunction = js.Function1[/* notify */ NotifyFunction, Unit]
  
  type NotifyFunction = js.Function0[Unit]
  
  trait StoreExtension extends StObject {
    
    def subscribeImmediate(listener: js.Function0[Unit]): Unsubscribe
    @JSName("subscribeImmediate")
    var subscribeImmediate_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe]
  }
  object StoreExtension {
    
    inline def apply(subscribeImmediate: /* listener */ js.Function0[Unit] => Unsubscribe): StoreExtension = {
      val __obj = js.Dynamic.literal(subscribeImmediate = js.Any.fromFunction1(subscribeImmediate))
      __obj.asInstanceOf[StoreExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StoreExtension] (val x: Self) extends AnyVal {
      
      inline def setSubscribeImmediate(value: /* listener */ js.Function0[Unit] => Unsubscribe): Self = StObject.set(x, "subscribeImmediate", js.Any.fromFunction1(value))
    }
  }
}
