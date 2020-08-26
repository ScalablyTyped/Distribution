package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatchHeader extends js.Object {
  /**
    * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * The method and value to match the header value sent with a request. Specify one match method.
    */
  var `match`: js.UndefOr[RouteSpecHttpRouteMatchHeaderMatch] = js.native
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: String = js.native
}

object RouteSpecHttpRouteMatchHeader {
  @scala.inline
  def apply(name: String): RouteSpecHttpRouteMatchHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeader]
  }
  @scala.inline
  implicit class RouteSpecHttpRouteMatchHeaderOps[Self <: RouteSpecHttpRouteMatchHeader] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setMatch(value: RouteSpecHttpRouteMatchHeaderMatch): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
  
}

