package typings.screeps

import typings.screeps.screepsStrings.GH
import typings.screeps.screepsStrings.GO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGH extends js.Object {
  var H: GH
  var O: GO
}

object AnonGH {
  @scala.inline
  def apply(H: GH, O: GO): AnonGH = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGH]
  }
}

