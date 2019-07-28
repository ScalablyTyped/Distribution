package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: String
  var sortOrder: Double
}

object Anon_Column {
  @scala.inline
  def apply(column: String, sortOrder: Double): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, sortOrder = sortOrder)
  
    __obj.asInstanceOf[Anon_Column]
  }
}

