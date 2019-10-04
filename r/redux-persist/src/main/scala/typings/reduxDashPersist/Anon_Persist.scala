package typings.reduxDashPersist

import typings.reduxDashPersist.esTypesMod.PersistState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Persist extends js.Object {
  var _persist: PersistState
}

object Anon_Persist {
  @scala.inline
  def apply(_persist: PersistState): Anon_Persist = {
    val __obj = js.Dynamic.literal(_persist = _persist)
  
    __obj.asInstanceOf[Anon_Persist]
  }
}

