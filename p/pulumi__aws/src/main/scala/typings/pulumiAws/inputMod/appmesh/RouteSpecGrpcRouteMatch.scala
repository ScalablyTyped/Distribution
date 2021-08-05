package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteMatch extends StObject {
  
  /**
    * The data to match from the gRPC request.
    */
  var metadatas: js.UndefOr[Input[js.Array[Input[RouteSpecGrpcRouteMatchMetadata]]]] = js.undefined
  
  /**
    * The method name to match from the request. If you specify a name, you must also specify a `serviceName`.
    */
  var methodName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The fully qualified domain name for the service to match from the request.
    */
  var serviceName: js.UndefOr[Input[String]] = js.undefined
}
object RouteSpecGrpcRouteMatch {
  
  inline def apply(): RouteSpecGrpcRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecGrpcRouteMatch]
  }
  
  extension [Self <: RouteSpecGrpcRouteMatch](x: Self) {
    
    inline def setMetadatas(value: Input[js.Array[Input[RouteSpecGrpcRouteMatchMetadata]]]): Self = StObject.set(x, "metadatas", value.asInstanceOf[js.Any])
    
    inline def setMetadatasUndefined: Self = StObject.set(x, "metadatas", js.undefined)
    
    inline def setMetadatasVarargs(value: Input[RouteSpecGrpcRouteMatchMetadata]*): Self = StObject.set(x, "metadatas", js.Array(value :_*))
    
    inline def setMethodName(value: Input[String]): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
