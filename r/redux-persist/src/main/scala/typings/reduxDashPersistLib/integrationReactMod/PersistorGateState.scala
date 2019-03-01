package typings
package reduxDashPersistLib.integrationReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistorGateState extends js.Object {
  var bootstrapped: scala.Boolean
}

object PersistorGateState {
  @scala.inline
  def apply(bootstrapped: scala.Boolean): PersistorGateState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootstrapped")(bootstrapped)
    __obj.asInstanceOf[PersistorGateState]
  }
}

