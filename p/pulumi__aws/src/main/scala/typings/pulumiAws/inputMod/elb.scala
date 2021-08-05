package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elb {
  
  trait LoadBalancerAccessLogs extends StObject {
    
    /**
      * The S3 bucket name to store the logs in.
      */
    var bucket: Input[String]
    
    /**
      * The S3 bucket prefix. Logs are stored in the root if not configured.
      */
    var bucketPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean to enable / disable `accessLogs`. Default is `true`
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The publishing interval in minutes. Default: 60 minutes.
      */
    var interval: js.UndefOr[Input[Double]] = js.undefined
  }
  object LoadBalancerAccessLogs {
    
    inline def apply(bucket: Input[String]): LoadBalancerAccessLogs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerAccessLogs]
    }
    
    extension [Self <: LoadBalancerAccessLogs](x: Self) {
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefix(value: Input[String]): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  trait LoadBalancerHealthCheck extends StObject {
    
    /**
      * The number of checks before the instance is declared healthy.
      */
    var healthyThreshold: Input[Double]
    
    /**
      * The interval between checks.
      */
    var interval: Input[Double]
    
    /**
      * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
      * values are:
      * * `HTTP`, `HTTPS` - PORT and PATH are required
      * * `TCP`, `SSL` - PORT is required, PATH is not supported
      */
    var target: Input[String]
    
    /**
      * The length of time before the check times out.
      */
    var timeout: Input[Double]
    
    /**
      * The number of checks before the instance is declared unhealthy.
      */
    var unhealthyThreshold: Input[Double]
  }
  object LoadBalancerHealthCheck {
    
    inline def apply(
      healthyThreshold: Input[Double],
      interval: Input[Double],
      target: Input[String],
      timeout: Input[Double],
      unhealthyThreshold: Input[Double]
    ): LoadBalancerHealthCheck = {
      val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerHealthCheck]
    }
    
    extension [Self <: LoadBalancerHealthCheck](x: Self) {
      
      inline def setHealthyThreshold(value: Input[Double]): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Input[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUnhealthyThreshold(value: Input[Double]): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadBalancerListener extends StObject {
    
    /**
      * The port on the instance to route to
      */
    var instancePort: Input[Double]
    
    /**
      * The protocol to use to the instance. Valid
      * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
      */
    var instanceProtocol: Input[String]
    
    /**
      * The port to listen on for the load balancer
      */
    var lbPort: Input[Double]
    
    /**
      * The protocol to listen on. Valid values are `HTTP`,
      * `HTTPS`, `TCP`, or `SSL`
      */
    var lbProtocol: Input[String]
    
    /**
      * The ARN of an SSL certificate you have
      * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lbProtocol` is either HTTPS or SSL**
      */
    var sslCertificateId: js.UndefOr[Input[String]] = js.undefined
  }
  object LoadBalancerListener {
    
    inline def apply(
      instancePort: Input[Double],
      instanceProtocol: Input[String],
      lbPort: Input[Double],
      lbProtocol: Input[String]
    ): LoadBalancerListener = {
      val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerListener]
    }
    
    extension [Self <: LoadBalancerListener](x: Self) {
      
      inline def setInstancePort(value: Input[Double]): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      inline def setInstanceProtocol(value: Input[String]): Self = StObject.set(x, "instanceProtocol", value.asInstanceOf[js.Any])
      
      inline def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      inline def setLbProtocol(value: Input[String]): Self = StObject.set(x, "lbProtocol", value.asInstanceOf[js.Any])
      
      inline def setSslCertificateId(value: Input[String]): Self = StObject.set(x, "sslCertificateId", value.asInstanceOf[js.Any])
      
      inline def setSslCertificateIdUndefined: Self = StObject.set(x, "sslCertificateId", js.undefined)
    }
  }
  
  trait LoadBalancerPolicyPolicyAttribute extends StObject {
    
    var name: js.UndefOr[Input[String]] = js.undefined
    
    var value: js.UndefOr[Input[String]] = js.undefined
  }
  object LoadBalancerPolicyPolicyAttribute {
    
    inline def apply(): LoadBalancerPolicyPolicyAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerPolicyPolicyAttribute]
    }
    
    extension [Self <: LoadBalancerPolicyPolicyAttribute](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SslNegotiationPolicyAttribute extends StObject {
    
    /**
      * The name of the attribute
      */
    var name: Input[String]
    
    /**
      * The value of the attribute
      */
    var value: Input[String]
  }
  object SslNegotiationPolicyAttribute {
    
    inline def apply(name: Input[String], value: Input[String]): SslNegotiationPolicyAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SslNegotiationPolicyAttribute]
    }
    
    extension [Self <: SslNegotiationPolicyAttribute](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
