package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1[T] extends js.Object {
  def Item(index: js.Any): T
}

object Anon1 {
  @scala.inline
  def apply[T](Item: js.Any => T): Anon1[T] = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Anon1[T]]
  }
}

