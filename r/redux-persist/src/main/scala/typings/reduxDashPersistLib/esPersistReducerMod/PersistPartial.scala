package typings
package reduxDashPersistLib.esPersistReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistPartial extends js.Object {
  var _persist: reduxDashPersistLib.esTypesMod.PersistState
}

object PersistPartial {
  @scala.inline
  def apply(_persist: reduxDashPersistLib.esTypesMod.PersistState): PersistPartial = {
    val __obj = js.Dynamic.literal(_persist = _persist)
  
    __obj.asInstanceOf[PersistPartial]
  }
}

