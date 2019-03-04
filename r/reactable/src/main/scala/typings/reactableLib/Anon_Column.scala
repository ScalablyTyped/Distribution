package typings
package reactableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: java.lang.String
  var direction: reactableLib.reactableMod.SortDirection
}

object Anon_Column {
  @scala.inline
  def apply(column: java.lang.String, direction: reactableLib.reactableMod.SortDirection): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, direction = direction)
  
    __obj.asInstanceOf[Anon_Column]
  }
}

