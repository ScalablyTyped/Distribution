package typings.reduxDashPersist.integrationReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistorGateState extends js.Object {
  var bootstrapped: Boolean
}

object PersistorGateState {
  @scala.inline
  def apply(bootstrapped: Boolean): PersistorGateState = {
    val __obj = js.Dynamic.literal(bootstrapped = bootstrapped)
  
    __obj.asInstanceOf[PersistorGateState]
  }
}

