package typings.rcImage

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-image/lib/hooks/useFrameSetState", JSImport.Namespace)
@js.native
object useFrameSetStateMod extends js.Object {
  
  def default[T /* <: js.Object */](initial: T): js.Tuple2[T, js.Function1[/* newState */ SetActionType[T], Unit]] = js.native
  
  type SetActionType[T] = Partial[T] | (js.Function1[/* state */ T, Partial[T]])
}
