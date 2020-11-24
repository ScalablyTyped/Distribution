package typings.statsdClient.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressMiddlewareOptions extends js.Object {
  
  /**
    * Metric name to use for reporting if a matching route is not
    * found (default "unknown_express_route").
    */
  var notFoundRouteName: js.UndefOr[String] = js.native
  
  /**
    * Optional callback called after reporting metrics for an
    * express route.
    */
  var onResponseEnd: js.UndefOr[
    js.Function4[
      /* client */ StatsdClient, 
      /* startTime */ Date, 
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      Unit
    ]
  ] = js.native
  
  /**
    * Enables inclusion of per-URL response code and timing
    * metrics (default false).
    */
  var timeByUrl: js.UndefOr[Boolean] = js.native
}
object ExpressMiddlewareOptions {
  
  @scala.inline
  def apply(): ExpressMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressMiddlewareOptions]
  }
  
  @scala.inline
  implicit class ExpressMiddlewareOptionsOps[Self <: ExpressMiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setNotFoundRouteName(value: String): Self = this.set("notFoundRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFoundRouteName: Self = this.set("notFoundRouteName", js.undefined)
    
    @scala.inline
    def setOnResponseEnd(
      value: (/* client */ StatsdClient, /* startTime */ Date, /* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Unit
    ): Self = this.set("onResponseEnd", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnResponseEnd: Self = this.set("onResponseEnd", js.undefined)
    
    @scala.inline
    def setTimeByUrl(value: Boolean): Self = this.set("timeByUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeByUrl: Self = this.set("timeByUrl", js.undefined)
  }
}
