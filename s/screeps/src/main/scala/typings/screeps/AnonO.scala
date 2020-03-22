package typings.screeps

import typings.screeps.screepsStrings.LH
import typings.screeps.screepsStrings.LO
import typings.screeps.screepsStrings.UL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonO extends js.Object {
  var H: LH
  var O: LO
  var U: UL
}

object AnonO {
  @scala.inline
  def apply(H: LH, O: LO, U: UL): AnonO = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonO]
  }
}

