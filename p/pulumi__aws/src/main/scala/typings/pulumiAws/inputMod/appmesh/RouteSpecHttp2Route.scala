package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttp2Route extends js.Object {
  
  /**
    * The action to take if a match is determined.
    */
  var action: Input[RouteSpecHttp2RouteAction] = js.native
  
  /**
    * The criteria for determining an gRPC request match.
    */
  var `match`: Input[RouteSpecHttp2RouteMatch] = js.native
  
  /**
    * The retry policy.
    */
  var retryPolicy: js.UndefOr[Input[RouteSpecHttp2RouteRetryPolicy]] = js.native
  
  /**
    * The types of timeouts.
    */
  var timeout: js.UndefOr[Input[RouteSpecHttp2RouteTimeout]] = js.native
}
object RouteSpecHttp2Route {
  
  @scala.inline
  def apply(action: Input[RouteSpecHttp2RouteAction], `match`: Input[RouteSpecHttp2RouteMatch]): RouteSpecHttp2Route = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2Route]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteOps[Self <: RouteSpecHttp2Route] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Input[RouteSpecHttp2RouteAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Input[RouteSpecHttp2RouteMatch]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: Input[RouteSpecHttp2RouteRetryPolicy]): Self = this.set("retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryPolicy: Self = this.set("retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: Input[RouteSpecHttp2RouteTimeout]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
