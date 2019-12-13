package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/clamp", JSImport.Namespace)
@js.native
object srcClampMod extends js.Object {
  def default[T](min: T): js.Function1[/* max */ T, js.Function1[/* value */ T, T]] = js.native
  def default[T](min: T, max: T): js.Function1[/* value */ T, T] = js.native
  def default[T](min: T, max: T, value: T): T = js.native
  @JSName("default")
  def default_T_Function2[T](min: T): js.Function2[/* max */ T, /* value */ T, T] = js.native
}

