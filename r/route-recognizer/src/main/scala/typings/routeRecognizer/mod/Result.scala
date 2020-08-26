package typings.routeRecognizer.mod

import typings.routeRecognizer.dslMod.Opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var handler: Opaque = js.native
  var isDynamic: Boolean = js.native
  var params: Params = js.native
}

object Result {
  @scala.inline
  def apply(isDynamic: Boolean, params: Params): Result = {
    val __obj = js.Dynamic.literal(isDynamic = isDynamic.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setIsDynamic(value: Boolean): Self = this.set("isDynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: Opaque): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setHandlerNull: Self = this.set("handler", null)
  }
  
}

