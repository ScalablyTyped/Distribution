package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecGrpcRouteMatch extends js.Object {
  
  /**
    * The data to match from the gRPC request.
    */
  var metadatas: js.UndefOr[Input[js.Array[Input[RouteSpecGrpcRouteMatchMetadata]]]] = js.native
  
  /**
    * The method name to match from the request. If you specify a name, you must also specify a `serviceName`.
    */
  var methodName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[Input[String]] = js.native
}
object RouteSpecGrpcRouteMatch {
  
  @scala.inline
  def apply(): RouteSpecGrpcRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecGrpcRouteMatch]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteMatchOps[Self <: RouteSpecGrpcRouteMatch] (val x: Self) extends AnyVal {
    
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
    def setMetadatasVarargs(value: Input[RouteSpecGrpcRouteMatchMetadata]*): Self = this.set("metadatas", js.Array(value :_*))
    
    @scala.inline
    def setMetadatas(value: Input[js.Array[Input[RouteSpecGrpcRouteMatchMetadata]]]): Self = this.set("metadatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadatas: Self = this.set("metadatas", js.undefined)
    
    @scala.inline
    def setMethodName(value: Input[String]): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
