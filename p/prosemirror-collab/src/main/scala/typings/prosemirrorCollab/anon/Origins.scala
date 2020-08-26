package typings.prosemirrorCollab.anon

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTransform.mod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origins[S /* <: Schema[_, _] */] extends js.Object {
  var clientID: Double | String = js.native
  var origins: js.Array[Transaction[S]] = js.native
  var steps: js.Array[Step[S]] = js.native
  var version: Double = js.native
}

object Origins {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    clientID: Double | String,
    origins: js.Array[Transaction[S]],
    steps: js.Array[Step[S]],
    version: Double
  ): Origins[S] = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origins[S]]
  }
  @scala.inline
  implicit class OriginsOps[Self <: Origins[_], /* <: typings.prosemirrorModel.mod.Schema[_, _] */ S] (val x: Self with Origins[S]) extends AnyVal {
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
    def setClientID(value: Double | String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginsVarargs(value: Transaction[S]*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: js.Array[Transaction[S]]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: Step[S]*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[Step[S]]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

