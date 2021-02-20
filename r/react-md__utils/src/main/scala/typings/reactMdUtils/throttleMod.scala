package typings.reactMdUtils

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleMod {
  
  @JSImport("@react-md/utils/types/throttle", "throttle")
  @js.native
  def throttle[F /* <: ThrottleableFunction */](fn: F, wait: Double): ThrottledFunction[F] = js.native
  
  type ThrottleableFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type ThrottledFunction[F /* <: ThrottleableFunction */] = js.Function1[/* args */ Parameters[F], ReturnType[F]]
}
