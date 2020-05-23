package typings.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discardedpackets extends js.Object {
  var `Discarded packets`: String
}

object Discardedpackets {
  @scala.inline
  def apply(`Discarded packets`: String): Discardedpackets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Discarded packets")((`Discarded packets`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Discardedpackets]
  }
}

