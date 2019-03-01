package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistedState extends js.Object {
  var _persist: js.UndefOr[PersistState] = js.undefined
}

object PersistedState {
  @scala.inline
  def apply(_persist: PersistState = null): PersistedState = {
    val __obj = js.Dynamic.literal()
    if (_persist != null) __obj.updateDynamic("_persist")(_persist)
    __obj.asInstanceOf[PersistedState]
  }
}

