package typings.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var maxDepth: Double
  def parse(data: js.Any): String
}

object Anon_Data {
  @scala.inline
  def apply(maxDepth: Double, parse: js.Any => String): Anon_Data = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth, parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[Anon_Data]
  }
}

