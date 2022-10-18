package typings.relayRuntime

import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPreloadableQueryRegistryMod {
  
  @JSImport("relay-runtime/lib/util/PreloadableQueryRegistry", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PreloadableQueryRegistry {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: String): js.UndefOr[ConcreteRequest | Null] = js.native
    
    /* CompleteClass */
    override def onLoad(key: String, callback: js.Function1[/* concreteRequest */ ConcreteRequest, Unit]): Disposable = js.native
    
    /* CompleteClass */
    override def set(key: String, value: ConcreteRequest): Unit = js.native
  }
  
  trait PreloadableQueryRegistry extends StObject {
    
    def clear(): Unit
    
    def get(key: String): js.UndefOr[ConcreteRequest | Null]
    
    def onLoad(key: String, callback: js.Function1[/* concreteRequest */ ConcreteRequest, Unit]): Disposable
    
    def set(key: String, value: ConcreteRequest): Unit
  }
  object PreloadableQueryRegistry {
    
    inline def apply(
      clear: () => Unit,
      get: String => js.UndefOr[ConcreteRequest | Null],
      onLoad: (String, js.Function1[/* concreteRequest */ ConcreteRequest, Unit]) => Disposable,
      set: (String, ConcreteRequest) => Unit
    ): PreloadableQueryRegistry = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), onLoad = js.Any.fromFunction2(onLoad), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[PreloadableQueryRegistry]
    }
    
    extension [Self <: PreloadableQueryRegistry](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => js.UndefOr[ConcreteRequest | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setOnLoad(value: (String, js.Function1[/* concreteRequest */ ConcreteRequest, Unit]) => Disposable): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
      
      inline def setSet(value: (String, ConcreteRequest) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
