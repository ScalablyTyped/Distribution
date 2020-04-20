package typings.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxDepth extends js.Object {
  var maxDepth: Double
  def parse(data: js.Any): String
}

object AnonMaxDepth {
  @scala.inline
  def apply(maxDepth: Double, parse: js.Any => String): AnonMaxDepth = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[AnonMaxDepth]
  }
}

