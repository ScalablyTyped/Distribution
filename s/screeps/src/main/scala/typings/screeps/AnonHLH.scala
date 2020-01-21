package typings.screeps

import typings.screeps.screepsStrings.LH
import typings.screeps.screepsStrings.LO
import typings.screeps.screepsStrings.UL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHLH extends js.Object {
  var H: LH
  var O: LO
  var U: UL
}

object AnonHLH {
  @scala.inline
  def apply(H: LH, O: LO, U: UL): AnonHLH = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHLH]
  }
}

