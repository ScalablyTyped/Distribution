package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerContext[T /* <: typings.react.nextMod.reactAugmentingMod.ServerContextJSONValue */] extends StObject {
  
  var Provider: typings.react.mod.Provider[T]
}
object ServerContext {
  
  inline def apply[T /* <: typings.react.nextMod.reactAugmentingMod.ServerContextJSONValue */](Provider: Provider[T]): ServerContext[T] = {
    val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerContext[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerContext[?], T /* <: typings.react.nextMod.reactAugmentingMod.ServerContextJSONValue */] (val x: Self & ServerContext[T]) extends AnyVal {
    
    inline def setProvider(value: Provider[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
