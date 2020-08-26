package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayContext extends js.Object {
  var environment: Environment = js.native
}

object RelayContext {
  @scala.inline
  def apply(environment: Environment): RelayContext = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayContext]
  }
  @scala.inline
  implicit class RelayContextOps[Self <: RelayContext] (val x: Self) extends AnyVal {
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
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
  }
  
}

