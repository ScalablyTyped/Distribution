package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalaccelerator {
  
  trait AcceleratorAttributes extends StObject {
    
    /**
      * Indicates whether flow logs are enabled.
      */
    var flowLogsEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the Amazon S3 bucket for the flow logs.
      */
    var flowLogsS3Bucket: js.UndefOr[String] = js.undefined
    
    /**
      * The prefix for the location in the Amazon S3 bucket for the flow logs.
      */
    var flowLogsS3Prefix: js.UndefOr[String] = js.undefined
  }
  object AcceleratorAttributes {
    
    @scala.inline
    def apply(): AcceleratorAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceleratorAttributes]
    }
    
    @scala.inline
    implicit class AcceleratorAttributesMutableBuilder[Self <: AcceleratorAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlowLogsEnabled(value: Boolean): Self = StObject.set(x, "flowLogsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowLogsEnabledUndefined: Self = StObject.set(x, "flowLogsEnabled", js.undefined)
      
      @scala.inline
      def setFlowLogsS3Bucket(value: String): Self = StObject.set(x, "flowLogsS3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowLogsS3BucketUndefined: Self = StObject.set(x, "flowLogsS3Bucket", js.undefined)
      
      @scala.inline
      def setFlowLogsS3Prefix(value: String): Self = StObject.set(x, "flowLogsS3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowLogsS3PrefixUndefined: Self = StObject.set(x, "flowLogsS3Prefix", js.undefined)
    }
  }
  
  trait AcceleratorIpSet extends StObject {
    
    /**
      * A list of IP addresses in the IP address set.
      */
    var ipAddresses: js.Array[String]
    
    /**
      * The types of IP addresses included in this IP set.
      */
    var ipFamily: String
  }
  object AcceleratorIpSet {
    
    @scala.inline
    def apply(ipAddresses: js.Array[String], ipFamily: String): AcceleratorIpSet = {
      val __obj = js.Dynamic.literal(ipAddresses = ipAddresses.asInstanceOf[js.Any], ipFamily = ipFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcceleratorIpSet]
    }
    
    @scala.inline
    implicit class AcceleratorIpSetMutableBuilder[Self <: AcceleratorIpSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
      
      @scala.inline
      def setIpFamily(value: String): Self = StObject.set(x, "ipFamily", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointGroupEndpointConfiguration extends StObject {
    
    var clientIpPreservationEnabled: Boolean
    
    /**
      * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
      */
    var endpointId: js.UndefOr[String] = js.undefined
    
    /**
      * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify.
      */
    var weight: js.UndefOr[Double] = js.undefined
  }
  object EndpointGroupEndpointConfiguration {
    
    @scala.inline
    def apply(clientIpPreservationEnabled: Boolean): EndpointGroupEndpointConfiguration = {
      val __obj = js.Dynamic.literal(clientIpPreservationEnabled = clientIpPreservationEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointGroupEndpointConfiguration]
    }
    
    @scala.inline
    implicit class EndpointGroupEndpointConfigurationMutableBuilder[Self <: EndpointGroupEndpointConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientIpPreservationEnabled(value: Boolean): Self = StObject.set(x, "clientIpPreservationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait EndpointGroupPortOverride extends StObject {
    
    /**
      * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
      */
    var endpointPort: Double
    
    /**
      * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
      */
    var listenerPort: Double
  }
  object EndpointGroupPortOverride {
    
    @scala.inline
    def apply(endpointPort: Double, listenerPort: Double): EndpointGroupPortOverride = {
      val __obj = js.Dynamic.literal(endpointPort = endpointPort.asInstanceOf[js.Any], listenerPort = listenerPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointGroupPortOverride]
    }
    
    @scala.inline
    implicit class EndpointGroupPortOverrideMutableBuilder[Self <: EndpointGroupPortOverride] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointPort(value: Double): Self = StObject.set(x, "endpointPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerPort(value: Double): Self = StObject.set(x, "listenerPort", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListenerPortRange extends StObject {
    
    /**
      * The first port in the range of ports, inclusive.
      */
    var fromPort: js.UndefOr[Double] = js.undefined
    
    /**
      * The last port in the range of ports, inclusive.
      */
    var toPort: js.UndefOr[Double] = js.undefined
  }
  object ListenerPortRange {
    
    @scala.inline
    def apply(): ListenerPortRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerPortRange]
    }
    
    @scala.inline
    implicit class ListenerPortRangeMutableBuilder[Self <: ListenerPortRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromPort(value: Double): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
      
      @scala.inline
      def setToPort(value: Double): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
    }
  }
}
