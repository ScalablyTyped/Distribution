package typings.relayRuntime.relayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLResponseWithData extends GraphQLSingularResponse {
  var data: PayloadData = js.native
  var errors: js.UndefOr[js.Array[PayloadError]] = js.native
  var extensions: js.UndefOr[PayloadExtensions] = js.native
  var label: js.UndefOr[String] = js.native
  var path: js.UndefOr[js.Array[Double | String]] = js.native
}

object GraphQLResponseWithData {
  @scala.inline
  def apply(data: PayloadData): GraphQLResponseWithData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponseWithData]
  }
  @scala.inline
  implicit class GraphQLResponseWithDataOps[Self <: GraphQLResponseWithData] (val x: Self) extends AnyVal {
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
    def setData(value: PayloadData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: PayloadError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[PayloadError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setExtensions(value: PayloadExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPathVarargs(value: (Double | String)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Double | String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

