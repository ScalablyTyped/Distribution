package typings.reduxPersist.integrationReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see PersistGate */
@js.native
trait PersistorGateState extends js.Object {
  var bootstrapped: Boolean = js.native
}

object PersistorGateState {
  @scala.inline
  def apply(bootstrapped: Boolean): PersistorGateState = {
    val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistorGateState]
  }
  @scala.inline
  implicit class PersistorGateStateOps[Self <: PersistorGateState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBootstrapped(value: Boolean): Self = this.set("bootstrapped", value.asInstanceOf[js.Any])
  }
  
}

