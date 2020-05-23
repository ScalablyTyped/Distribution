package typings.qunit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxDepth extends js.Object {
  var maxDepth: Double
  def parse(data: js.Any): String
}

object MaxDepth {
  @scala.inline
  def apply(maxDepth: Double, parse: js.Any => String): MaxDepth = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[MaxDepth]
  }
}

