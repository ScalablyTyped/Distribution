package typings.reactRelay.relayHooksEntryPointTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSResourceReference[TModule] extends StObject {
  
  def getModuleId(): String
  
  def getModuleIfRequired(): TModule | Null
  
  def load(): js.Promise[TModule]
}
object JSResourceReference {
  
  inline def apply[TModule](
    getModuleId: () => String,
    getModuleIfRequired: () => TModule | Null,
    load: () => js.Promise[TModule]
  ): JSResourceReference[TModule] = {
    val __obj = js.Dynamic.literal(getModuleId = js.Any.fromFunction0(getModuleId), getModuleIfRequired = js.Any.fromFunction0(getModuleIfRequired), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[JSResourceReference[TModule]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSResourceReference[?], TModule] (val x: Self & JSResourceReference[TModule]) extends AnyVal {
    
    inline def setGetModuleId(value: () => String): Self = StObject.set(x, "getModuleId", js.Any.fromFunction0(value))
    
    inline def setGetModuleIfRequired(value: () => TModule | Null): Self = StObject.set(x, "getModuleIfRequired", js.Any.fromFunction0(value))
    
    inline def setLoad(value: () => js.Promise[TModule]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
  }
}
