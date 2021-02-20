package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancing {
  
  @js.native
  trait LoadBalancerAccessLogs extends StObject {
    
    /**
      * The S3 bucket name to store the logs in.
      */
    var bucket: Input[String] = js.native
    
    /**
      * The S3 bucket prefix. Logs are stored in the root if not configured.
      */
    var bucketPrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean to enable / disable `accessLogs`. Default is `true`
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The publishing interval in minutes. Default: 60 minutes.
      */
    var interval: js.UndefOr[Input[Double]] = js.native
  }
  object LoadBalancerAccessLogs {
    
    @scala.inline
    def apply(bucket: Input[String]): LoadBalancerAccessLogs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerAccessLogs]
    }
    
    @scala.inline
    implicit class LoadBalancerAccessLogsMutableBuilder[Self <: LoadBalancerAccessLogs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketPrefix(value: Input[String]): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  @js.native
  trait LoadBalancerHealthCheck extends StObject {
    
    /**
      * The number of checks before the instance is declared healthy.
      */
    var healthyThreshold: Input[Double] = js.native
    
    /**
      * The interval between checks.
      */
    var interval: Input[Double] = js.native
    
    /**
      * The target of the check. Valid pattern is "${PROTOCOL}:${PORT}${PATH}", where PROTOCOL
      * values are:
      * * `HTTP`, `HTTPS` - PORT and PATH are required
      * * `TCP`, `SSL` - PORT is required, PATH is not supported
      */
    var target: Input[String] = js.native
    
    /**
      * The length of time before the check times out.
      */
    var timeout: Input[Double] = js.native
    
    /**
      * The number of checks before the instance is declared unhealthy.
      */
    var unhealthyThreshold: Input[Double] = js.native
  }
  object LoadBalancerHealthCheck {
    
    @scala.inline
    def apply(
      healthyThreshold: Input[Double],
      interval: Input[Double],
      target: Input[String],
      timeout: Input[Double],
      unhealthyThreshold: Input[Double]
    ): LoadBalancerHealthCheck = {
      val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerHealthCheck]
    }
    
    @scala.inline
    implicit class LoadBalancerHealthCheckMutableBuilder[Self <: LoadBalancerHealthCheck] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHealthyThreshold(value: Input[Double]): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Input[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhealthyThreshold(value: Input[Double]): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadBalancerListener extends StObject {
    
    /**
      * The port on the instance to route to
      */
    var instancePort: Input[Double] = js.native
    
    /**
      * The protocol to use to the instance. Valid
      * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
      */
    var instanceProtocol: Input[String] = js.native
    
    /**
      * The port to listen on for the load balancer
      */
    var lbPort: Input[Double] = js.native
    
    /**
      * The protocol to listen on. Valid values are `HTTP`,
      * `HTTPS`, `TCP`, or `SSL`
      */
    var lbProtocol: Input[String] = js.native
    
    /**
      * The ARN of an SSL certificate you have
      * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lbProtocol` is either HTTPS or SSL**
      */
    var sslCertificateId: js.UndefOr[Input[String]] = js.native
  }
  object LoadBalancerListener {
    
    @scala.inline
    def apply(
      instancePort: Input[Double],
      instanceProtocol: Input[String],
      lbPort: Input[Double],
      lbProtocol: Input[String]
    ): LoadBalancerListener = {
      val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], instanceProtocol = instanceProtocol.asInstanceOf[js.Any], lbPort = lbPort.asInstanceOf[js.Any], lbProtocol = lbProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerListener]
    }
    
    @scala.inline
    implicit class LoadBalancerListenerMutableBuilder[Self <: LoadBalancerListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstancePort(value: Input[Double]): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceProtocol(value: Input[String]): Self = StObject.set(x, "instanceProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLbProtocol(value: Input[String]): Self = StObject.set(x, "lbProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCertificateId(value: Input[String]): Self = StObject.set(x, "sslCertificateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCertificateIdUndefined: Self = StObject.set(x, "sslCertificateId", js.undefined)
    }
  }
  
  @js.native
  trait LoadBalancerPolicyPolicyAttribute extends StObject {
    
    var name: js.UndefOr[Input[String]] = js.native
    
    var value: js.UndefOr[Input[String]] = js.native
  }
  object LoadBalancerPolicyPolicyAttribute {
    
    @scala.inline
    def apply(): LoadBalancerPolicyPolicyAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerPolicyPolicyAttribute]
    }
    
    @scala.inline
    implicit class LoadBalancerPolicyPolicyAttributeMutableBuilder[Self <: LoadBalancerPolicyPolicyAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SslNegotiationPolicyAttribute extends StObject {
    
    /**
      * The name of the attribute
      */
    var name: Input[String] = js.native
    
    /**
      * The value of the attribute
      */
    var value: Input[String] = js.native
  }
  object SslNegotiationPolicyAttribute {
    
    @scala.inline
    def apply(name: Input[String], value: Input[String]): SslNegotiationPolicyAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SslNegotiationPolicyAttribute]
    }
    
    @scala.inline
    implicit class SslNegotiationPolicyAttributeMutableBuilder[Self <: SslNegotiationPolicyAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
