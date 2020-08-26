package typings.router5.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMeta extends js.Object {
  var id: Double = js.native
  var options: NavigationOptions = js.native
  var params: Params = js.native
  var redirected: Boolean = js.native
  var source: js.UndefOr[String] = js.native
}

object StateMeta {
  @scala.inline
  def apply(id: Double, options: NavigationOptions, params: Params, redirected: Boolean): StateMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMeta]
  }
  @scala.inline
  implicit class StateMetaOps[Self <: StateMeta] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: NavigationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirected(value: Boolean): Self = this.set("redirected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

