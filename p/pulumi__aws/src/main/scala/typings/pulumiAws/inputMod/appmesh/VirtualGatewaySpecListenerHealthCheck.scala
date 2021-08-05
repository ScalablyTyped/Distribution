package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecListenerHealthCheck extends StObject {
  
  /**
    * The number of consecutive successful health checks that must occur before declaring listener healthy.
    */
  var healthyThreshold: Input[Double]
  
  /**
    * The time period in milliseconds between each health check execution.
    */
  var intervalMillis: Input[Double]
  
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The protocol for the health check request. Valid values are `http`, `http2`, and `grpc`.
    */
  var protocol: Input[String]
  
  /**
    * The amount of time to wait when receiving a response from the health check, in milliseconds.
    */
  var timeoutMillis: Input[Double]
  
  /**
    * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
    */
  var unhealthyThreshold: Input[Double]
}
object VirtualGatewaySpecListenerHealthCheck {
  
  inline def apply(
    healthyThreshold: Input[Double],
    intervalMillis: Input[Double],
    protocol: Input[String],
    timeoutMillis: Input[Double],
    unhealthyThreshold: Input[Double]
  ): VirtualGatewaySpecListenerHealthCheck = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecListenerHealthCheck]
  }
  
  extension [Self <: VirtualGatewaySpecListenerHealthCheck](x: Self) {
    
    inline def setHealthyThreshold(value: Input[Double]): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setIntervalMillis(value: Input[Double]): Self = StObject.set(x, "intervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMillis(value: Input[Double]): Self = StObject.set(x, "timeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThreshold(value: Input[Double]): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
