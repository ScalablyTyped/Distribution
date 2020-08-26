package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracing extends js.Object {
  var apiGateway: Boolean = js.native
  var lambda: js.UndefOr[Boolean] = js.native
}

object Tracing {
  @scala.inline
  def apply(apiGateway: Boolean): Tracing = {
    val __obj = js.Dynamic.literal(apiGateway = apiGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracing]
  }
  @scala.inline
  implicit class TracingOps[Self <: Tracing] (val x: Self) extends AnyVal {
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
    def setApiGateway(value: Boolean): Self = this.set("apiGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def setLambda(value: Boolean): Self = this.set("lambda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambda: Self = this.set("lambda", js.undefined)
  }
  
}

