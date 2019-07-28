package typings.reactable

import typings.reactable.reactableMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: String
  var direction: SortDirection
}

object Anon_Column {
  @scala.inline
  def apply(column: String, direction: SortDirection): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, direction = direction)
  
    __obj.asInstanceOf[Anon_Column]
  }
}

