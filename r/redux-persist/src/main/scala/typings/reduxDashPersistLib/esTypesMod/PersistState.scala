package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistState extends js.Object {
  var rehydrated: scala.Boolean
  var version: scala.Double
}

object PersistState {
  @scala.inline
  def apply(rehydrated: scala.Boolean, version: scala.Double): PersistState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rehydrated")(rehydrated)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PersistState]
  }
}

