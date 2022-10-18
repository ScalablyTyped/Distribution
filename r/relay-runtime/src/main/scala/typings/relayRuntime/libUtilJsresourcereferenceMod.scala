package typings.relayRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilJsresourcereferenceMod {
  
  trait JSResourceReference[TModule] extends StObject {
    
    def getModuleId(): String
    
    def getModuleIfRequired(): js.UndefOr[TModule | Null]
    
    def load(): js.Promise[TModule]
  }
  object JSResourceReference {
    
    inline def apply[TModule](
      getModuleId: () => String,
      getModuleIfRequired: () => js.UndefOr[TModule | Null],
      load: () => js.Promise[TModule]
    ): JSResourceReference[TModule] = {
      val __obj = js.Dynamic.literal(getModuleId = js.Any.fromFunction0(getModuleId), getModuleIfRequired = js.Any.fromFunction0(getModuleIfRequired), load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[JSResourceReference[TModule]]
    }
    
    extension [Self <: JSResourceReference[?], TModule](x: Self & JSResourceReference[TModule]) {
      
      inline def setGetModuleId(value: () => String): Self = StObject.set(x, "getModuleId", js.Any.fromFunction0(value))
      
      inline def setGetModuleIfRequired(value: () => js.UndefOr[TModule | Null]): Self = StObject.set(x, "getModuleIfRequired", js.Any.fromFunction0(value))
      
      inline def setLoad(value: () => js.Promise[TModule]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    }
  }
}
