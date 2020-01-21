package typings.sanctuary

import typings.sanctuary.mod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnQA extends js.Object {
  def apply(q: String): Maybe[String] = js.native
  def apply[A](q: js.Array[A]): Maybe[A] = js.native
}

