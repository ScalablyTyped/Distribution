package typings.restifyPlugins.mod

import typings.restify.mod.Request
import typings.restify.mod.Response
import typings.restify.mod.Route
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsCallback extends js.Object {
  
  /**
    *  An error if the request had an error
    */
  var err: Error = js.native
  
  var metrics: MetricsCallbackOptions = js.native
  
  var req: Request = js.native
  
  var res: Response = js.native
  
  /**
    * The route obj that serviced the request
    */
  var route: Route = js.native
}
object MetricsCallback {
  
  @scala.inline
  def apply(err: Error, metrics: MetricsCallbackOptions, req: Request, res: Response, route: Route): MetricsCallback = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsCallback]
  }
  
  @scala.inline
  implicit class MetricsCallbackOps[Self <: MetricsCallback] (val x: Self) extends AnyVal {
    
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
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: MetricsCallbackOptions): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: Request): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: Response): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: Route): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}
