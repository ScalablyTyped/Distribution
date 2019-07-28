package typings.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compare extends js.Object {
  var compare: Boolean | String | js.Function
}

object Anon_Compare {
  @scala.inline
  def apply(compare: Boolean | String | js.Function): Anon_Compare = {
    val __obj = js.Dynamic.literal(compare = compare.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Compare]
  }
}

