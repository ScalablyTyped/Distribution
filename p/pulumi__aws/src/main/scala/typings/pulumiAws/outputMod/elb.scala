package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elb {
  
  trait GetLoadBalancerAccessLogs extends StObject {
    
    var bucket: String
    
    var bucketPrefix: String
    
    var enabled: Boolean
    
    var interval: Double
  }
  object GetLoadBalancerAccessLogs {
    
    inline def apply(bucket: String, bucketPrefix: String, enabled: Boolean, interval: Double): GetLoadBalancerAccessLogs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], bucketPrefix = bucketPrefix.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLoadBalancerAccessLogs]
    }
    
    extension [Self <: GetLoadBalancerAccessLogs](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefix(value: String): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLoadBalancerHealthCheck extends StObject {
    
    var healthyThreshold: Double
    
    var interval: Double
    
    var target: String
    
    var timeout: Double
    
    var unhealthyThreshold: Double
  }
  object GetLoadBalancerHealthCheck {
    
    inline def apply(
      healthyThreshold: Double,
      interval: Double,
      target: String,
      timeout: Double,
      unhealthyThreshold: Double
    ): GetLoadBalancerHealthCheck = {
      val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLoadBalancerHealthCheck]
    }
    
    extension [Self <: GetLoadBalancerHealthCheck](x: Self) {
      
      inline def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLoadBalancerListener extends StObject {
    
    var instancePort: Double
    
    var instanceProtocol: String
    
    var lbPort: Double
    
    var lbProtocol: String
    
    var sslCertificateId: String
  }
  object GetLoadBalancerListener {
    
    inline def apply(
      instancePort: Double,
      instanceProtocol: String,
      lbPort: Double,
      lbProtocol: String,
      sslCertificateId: String
    ): GetLoadBalancerListener = {
      val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any], sslCertificateId = sslCertificateId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLoadBalancerListener]
    }
    
    extension [Self <: GetLoadBalancerListener](x: Self) {
      
      inline def setInstancePort(value: Double): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      inline def setInstanceProtocol(value: String): Self = StObject.set(x, "instanceProtocol", value.asInstanceOf[js.Any])
      
      inline def setLbPort(value: Double): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      inline def setLbProtocol(value: String): Self = StObject.set(x, "lbProtocol", value.asInstanceOf[js.Any])
      
      inline def setSslCertificateId(value: String): Self = StObject.set(x, "sslCertificateId", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadBalancerAccessLogs extends StObject {
    
    /**
      * The S3 bucket name to store the logs in.
      */
    var bucket: String
    
    /**
      * The S3 bucket prefix. Logs are stored in the root if not configured.
      */
    var bucketPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean to enable / disable `accessLogs`. Default is `true`
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The publishing interval in minutes. Default: 60 minutes.
      */
    var interval: js.UndefOr[Double] = js.undefined
  }
  object LoadBalancerAccessLogs {
    
    inline def apply(bucket: String): LoadBalancerAccessLogs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerAccessLogs]
    }
    
    extension [Self <: LoadBalancerAccessLogs](x: Self) {
      
      inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefix(value: String): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  trait LoadBalancerHealthCheck extends StObject {
    
    /**
      * The number of checks before the instance is declared healthy.
      */
    var healthyThreshold: Double
    
    /**
      * The interval between checks.
      */
    var interval: Double
    
    /**
      * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
      * values are:
      * * `HTTP`, `HTTPS` - PORT and PATH are required
      * * `TCP`, `SSL` - PORT is required, PATH is not supported
      */
    var target: String
    
    /**
      * The length of time before the check times out.
      */
    var timeout: Double
    
    /**
      * The number of checks before the instance is declared unhealthy.
      */
    var unhealthyThreshold: Double
  }
  object LoadBalancerHealthCheck {
    
    inline def apply(
      healthyThreshold: Double,
      interval: Double,
      target: String,
      timeout: Double,
      unhealthyThreshold: Double
    ): LoadBalancerHealthCheck = {
      val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerHealthCheck]
    }
    
    extension [Self <: LoadBalancerHealthCheck](x: Self) {
      
      inline def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadBalancerListener extends StObject {
    
    /**
      * The port on the instance to route to
      */
    var instancePort: Double
    
    /**
      * The protocol to use to the instance. Valid
      * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
      */
    var instanceProtocol: String
    
    /**
      * The port to listen on for the load balancer
      */
    var lbPort: Double
    
    /**
      * The protocol to listen on. Valid values are `HTTP`,
      * `HTTPS`, `TCP`, or `SSL`
      */
    var lbProtocol: String
    
    /**
      * The ARN of an SSL certificate you have
      * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lbProtocol` is either HTTPS or SSL**
      */
    var sslCertificateId: js.UndefOr[String] = js.undefined
  }
  object LoadBalancerListener {
    
    inline def apply(instancePort: Double, instanceProtocol: String, lbPort: Double, lbProtocol: String): LoadBalancerListener = {
      val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerListener]
    }
    
    extension [Self <: LoadBalancerListener](x: Self) {
      
      inline def setInstancePort(value: Double): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      inline def setInstanceProtocol(value: String): Self = StObject.set(x, "instanceProtocol", value.asInstanceOf[js.Any])
      
      inline def setLbPort(value: Double): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      inline def setLbProtocol(value: String): Self = StObject.set(x, "lbProtocol", value.asInstanceOf[js.Any])
      
      inline def setSslCertificateId(value: String): Self = StObject.set(x, "sslCertificateId", value.asInstanceOf[js.Any])
      
      inline def setSslCertificateIdUndefined: Self = StObject.set(x, "sslCertificateId", js.undefined)
    }
  }
  
  trait LoadBalancerPolicyPolicyAttribute extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object LoadBalancerPolicyPolicyAttribute {
    
    inline def apply(): LoadBalancerPolicyPolicyAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerPolicyPolicyAttribute]
    }
    
    extension [Self <: LoadBalancerPolicyPolicyAttribute](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SslNegotiationPolicyAttribute extends StObject {
    
    /**
      * The name of the attribute
      */
    var name: String
    
    /**
      * The value of the attribute
      */
    var value: String
  }
  object SslNegotiationPolicyAttribute {
    
    inline def apply(name: String, value: String): SslNegotiationPolicyAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SslNegotiationPolicyAttribute]
    }
    
    extension [Self <: SslNegotiationPolicyAttribute](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
