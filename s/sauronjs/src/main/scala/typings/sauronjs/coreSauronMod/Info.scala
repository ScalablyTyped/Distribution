package typings.sauronjs.coreSauronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var total: Double
}

object Info {
  @scala.inline
  def apply(total: Double): Info = {
    val __obj = js.Dynamic.literal(total = total)
  
    __obj.asInstanceOf[Info]
  }
}

