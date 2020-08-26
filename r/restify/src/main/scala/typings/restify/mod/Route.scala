package typings.restify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  var chain: Chain = js.native
  var method: String = js.native
  var name: String = js.native
  var path: String | RegExp = js.native
  var spec: RouteSpec = js.native
}

object Route {
  @scala.inline
  def apply(chain: Chain, method: String, name: String, path: String | RegExp, spec: RouteSpec): Route = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
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
    def setChain(value: Chain): Self = this.set("chain", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String | RegExp): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: RouteSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
  }
  
}

