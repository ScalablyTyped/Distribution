package typings.reactRelay

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profilerContextMod {
  
  @JSImport("react-relay/relay-hooks/ProfilerContext", "ProfilerContext")
  @js.native
  val ProfilerContext: Context[ProfilerContextType] = js.native
  
  trait ProfilerContextType extends StObject {
    
    def wrapPrepareQueryResource[T](cb: js.Function0[T]): T
  }
  object ProfilerContextType {
    
    inline def apply(wrapPrepareQueryResource: js.Function0[Any] => Any): ProfilerContextType = {
      val __obj = js.Dynamic.literal(wrapPrepareQueryResource = js.Any.fromFunction1(wrapPrepareQueryResource))
      __obj.asInstanceOf[ProfilerContextType]
    }
    
    extension [Self <: ProfilerContextType](x: Self) {
      
      inline def setWrapPrepareQueryResource(value: js.Function0[Any] => Any): Self = StObject.set(x, "wrapPrepareQueryResource", js.Any.fromFunction1(value))
    }
  }
}
