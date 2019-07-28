package typings.sortablejs

import typings.sortablejs.sortablejsMod.Sortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Get extends js.Object {
  def get(sortable: Sortable): js.Array[String]
  def set(sortable: Sortable): Unit
}

object Anon_Get {
  @scala.inline
  def apply(get: Sortable => js.Array[String], set: Sortable => Unit): Anon_Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_Get]
  }
}

