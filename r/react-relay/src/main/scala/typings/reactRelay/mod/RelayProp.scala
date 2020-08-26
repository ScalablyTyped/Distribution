package typings.reactRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayProp extends js.Object {
  var environment: typings.relayRuntime.mod.Environment = js.native
   // ensures no RelayRefetchProp is used with a fragment container
  var hasMore: js.UndefOr[scala.Nothing] = js.native
  var refetch: js.UndefOr[scala.Nothing] = js.native
}

object RelayProp {
  @scala.inline
  def apply(environment: typings.relayRuntime.mod.Environment): RelayProp = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayProp]
  }
  @scala.inline
  implicit class RelayPropOps[Self <: RelayProp] (val x: Self) extends AnyVal {
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
    def setEnvironment(value: typings.relayRuntime.mod.Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
  }
  
}

