package typings.relayRuntime.relayNetworkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLResponseWithExtensionsOnly extends GraphQLSingularResponse {
  // Per https://spec.graphql.org/June2018/#sec-Errors
  // > If the data entry in the response is not present, the errors entry
  // > in the response must not be empty. It must contain at least one error
  // This means a payload has to have either a data key or an errors key:
  // but the spec leaves room for the combination of data: null plus extensions
  // since `data: null` is a *required* output if there was an error during
  // execution, but the inverse is not described in the sepc: `data: null`
  // does not necessarily indicate that there was an error.
  var data: Null = js.native
  var extensions: PayloadExtensions = js.native
}

object GraphQLResponseWithExtensionsOnly {
  @scala.inline
  def apply(data: Null, extensions: PayloadExtensions): GraphQLResponseWithExtensionsOnly = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponseWithExtensionsOnly]
  }
  @scala.inline
  implicit class GraphQLResponseWithExtensionsOnlyOps[Self <: GraphQLResponseWithExtensionsOnly] (val x: Self) extends AnyVal {
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
    def setData(value: Null): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: PayloadExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
  }
  
}

