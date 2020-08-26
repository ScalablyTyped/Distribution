package typings.reactMdForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/form/types/useSelectState", JSImport.Namespace)
@js.native
object useSelectStateMod extends js.Object {
  def default[T /* <: String */](defaultValue: DefaultValue[T]): ReturnValue[T] = js.native
  type DefaultValue[T /* <: String */] = T | js.Function0[T]
  type ReturnValue[T /* <: String */] = js.Tuple2[T, js.Function1[/* nextValue */ String, Unit]]
}

