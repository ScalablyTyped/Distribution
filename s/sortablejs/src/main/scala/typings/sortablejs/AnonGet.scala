package typings.sortablejs

import typings.sortablejs.mod.Sortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(sortable: Sortable): js.Array[String]
  def set(sortable: Sortable): Unit
}

object AnonGet {
  @scala.inline
  def apply(get: Sortable => js.Array[String], set: Sortable => Unit): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[AnonGet]
  }
}

