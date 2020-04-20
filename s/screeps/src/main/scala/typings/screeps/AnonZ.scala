package typings.screeps

import typings.screeps.screepsStrings.KH
import typings.screeps.screepsStrings.KO
import typings.screeps.screepsStrings.ZK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonZ extends js.Object {
  var H: KH
  var O: KO
  var Z: ZK
}

object AnonZ {
  @scala.inline
  def apply(H: KH, O: KO, Z: ZK): AnonZ = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonZ]
  }
}

