package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T] extends js.Object {
  def Item(index: js.Any): T
}

object Anon_Index {
  @scala.inline
  def apply[T](Item: js.Any => T): Anon_Index[T] = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[Anon_Index[T]]
  }
}

