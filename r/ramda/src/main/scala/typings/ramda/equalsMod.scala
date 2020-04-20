package typings.ramda

import typings.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/equals", JSImport.Namespace)
@js.native
object equalsMod extends js.Object {
  def default[T](__ : Placeholder, b: T): js.Function1[/* a */ T, Boolean] = js.native
  def default[T](a: T): js.Function1[/* b */ T, Boolean] = js.native
  def default[T](a: T, b: T): Boolean = js.native
}

