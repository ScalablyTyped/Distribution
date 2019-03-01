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
    get: js.Function1[sortablejsLib.sortablejsMod.Sortable, js.Array[java.lang.String]],
    set: js.Function1[sortablejsLib.sortablejsMod.Sortable, scala.Unit]
  ): Anon_Get = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_Get]
  }
}

