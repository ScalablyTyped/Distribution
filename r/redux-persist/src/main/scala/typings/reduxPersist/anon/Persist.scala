package typings.reduxPersist.anon

import typings.reduxPersist.typesMod.PersistState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persist extends js.Object {
  var _persist: PersistState
}

object Persist {
  @scala.inline
  def apply(_persist: PersistState): Persist = {
    val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persist]
  }
}

