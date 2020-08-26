package typings.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  var handler: Opaque = js.native
  var path: String = js.native
  var queryParams: js.UndefOr[js.Array[String]] = js.native
}

object Route {
  @scala.inline
  def apply(path: String): Route = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: Opaque): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setHandlerNull: Self = this.set("handler", null)
    @scala.inline
    def setQueryParamsVarargs(value: String*): Self = this.set("queryParams", js.Array(value :_*))
    @scala.inline
    def setQueryParams(value: js.Array[String]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
  }
  
}

