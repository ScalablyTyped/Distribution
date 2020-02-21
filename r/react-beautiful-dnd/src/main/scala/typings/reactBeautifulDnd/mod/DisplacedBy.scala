package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplacedBy extends js.Object {
  var point: Position
  var value: Double
}

object DisplacedBy {
  @scala.inline
  def apply(point: Position, value: Double): DisplacedBy = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisplacedBy]
  }
}

