package typings.rcImage

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFrameSetStateMod {
  
  @JSImport("rc-image/lib/hooks/useFrameSetState", JSImport.Default)
  @js.native
  def default[T /* <: js.Object */](initial: T): js.Tuple2[T, js.Function1[/* newState */ SetActionType[T], Unit]] = js.native
  
  type SetActionType[T] = Partial[T] | (js.Function1[/* state */ T, Partial[T]])
}
