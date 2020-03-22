package typings.screeps

import typings.screeps.screepsStrings.G
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonZK extends js.Object {
  var ZK: G
}

object AnonZK {
  @scala.inline
  def apply(ZK: G): AnonZK = {
    val __obj = js.Dynamic.literal(ZK = ZK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonZK]
  }
}

