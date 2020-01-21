package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKH extends js.Object {
  var KH: Anon2Capacity
  var KH2O: Anon3Capacity
  var XKH2O: Anon4Capacity
}

object AnonKH {
  @scala.inline
  def apply(KH: Anon2Capacity, KH2O: Anon3Capacity, XKH2O: Anon4Capacity): AnonKH = {
    val __obj = js.Dynamic.literal(KH = KH.asInstanceOf[js.Any], KH2O = KH2O.asInstanceOf[js.Any], XKH2O = XKH2O.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKH]
  }
}

