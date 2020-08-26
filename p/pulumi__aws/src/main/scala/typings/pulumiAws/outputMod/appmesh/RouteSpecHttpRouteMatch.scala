package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatch extends js.Object {
  /**
    * The client request headers to match on.
    */
  var headers: js.UndefOr[js.Array[RouteSpecHttpRouteMatchHeader]] = js.native
  /**
    * The client request header method to match on. Valid values: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Specifies the path with which to match requests.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: String = js.native
  /**
    * The client request header scheme to match on. Valid values: `http`, `https`.
    */
  var scheme: js.UndefOr[String] = js.native
}

object RouteSpecHttpRouteMatch {
  @scala.inline
  def apply(prefix: String): RouteSpecHttpRouteMatch = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatch]
  }
  @scala.inline
  implicit class RouteSpecHttpRouteMatchOps[Self <: RouteSpecHttpRouteMatch] (val x: Self) extends AnyVal {
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
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: RouteSpecHttpRouteMatchHeader*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[RouteSpecHttpRouteMatchHeader]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
  
}

