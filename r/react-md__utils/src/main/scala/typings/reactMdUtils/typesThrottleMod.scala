package typings.reactMdUtils

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesThrottleMod {
  
  @JSImport("@react-md/utils/types/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttle[F /* <: ThrottleableFunction */](fn: F, wait: Double): ThrottledFunction[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[ThrottledFunction[F]]
  
  @js.native
  trait ThrottleableFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type ThrottledFunction[F /* <: ThrottleableFunction */] = js.Function1[/* args */ Parameters[F], ReturnType[F]]
}
