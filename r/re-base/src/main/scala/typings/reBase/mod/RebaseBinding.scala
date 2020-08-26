package typings.reBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebaseBinding extends js.Object {
  var context: js.Object = js.native
  var endpoint: String = js.native
  var id: Double = js.native
  var method: String = js.native
}

object RebaseBinding {
  @scala.inline
  def apply(context: js.Object, endpoint: String, id: Double, method: String): RebaseBinding = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebaseBinding]
  }
  @scala.inline
  implicit class RebaseBindingOps[Self <: RebaseBinding] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

