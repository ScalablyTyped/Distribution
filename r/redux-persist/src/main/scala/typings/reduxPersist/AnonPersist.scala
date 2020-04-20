package typings.reduxPersist

import typings.reduxPersist.typesMod.PersistState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPersist extends js.Object {
  var _persist: PersistState
}

object AnonPersist {
  @scala.inline
  def apply(_persist: PersistState): AnonPersist = {
    val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPersist]
  }
}

