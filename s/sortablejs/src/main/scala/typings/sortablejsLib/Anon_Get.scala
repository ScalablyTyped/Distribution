package typings
package sortablejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Get extends js.Object {
  def get(sortable: sortablejsLib.sortablejsMod.Sortable): js.Array[java.lang.String]
  def set(sortable: sortablejsLib.sortablejsMod.Sortable): scala.Unit
}

object Anon_Get {
  @scala.inline
  def apply(
    get: sortablejsLib.sortablejsMod.Sortable => js.Array[java.lang.String],
    set: sortablejsLib.sortablejsMod.Sortable => scala.Unit
  ): Anon_Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[Anon_Get]
  }
}

