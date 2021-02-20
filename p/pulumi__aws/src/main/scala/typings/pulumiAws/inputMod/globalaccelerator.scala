package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalaccelerator {
  
  @js.native
  trait AcceleratorAttributes extends StObject {
    
    /**
      * Indicates whether flow logs are enabled.
      */
    var flowLogsEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the Amazon S3 bucket for the flow logs.
      */
    var flowLogsS3Bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * The prefix for the location in the Amazon S3 bucket for the flow logs.
      */
    var flowLogsS3Prefix: js.UndefOr[Input[String]] = js.native
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
      def setFlowLogsEnabled(value: Input[Boolean]): Self = StObject.set(x, "flowLogsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowLogsEnabledUndefined: Self = StObject.set(x, "flowLogsEnabled", js.undefined)
      
      @scala.inline
      def setFlowLogsS3Bucket(value: Input[String]): Self = StObject.set(x, "flowLogsS3Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowLogsS3BucketUndefined: Self = StObject.set(x, "flowLogsS3Bucket", js.undefined)
      
      @scala.inline
      def setFlowLogsS3Prefix(value: Input[String]): Self = StObject.set(x, "flowLogsS3Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowLogsS3PrefixUndefined: Self = StObject.set(x, "flowLogsS3Prefix", js.undefined)
    }
  }
  
  @js.native
  trait AcceleratorIpSet extends StObject {
    
    /**
      * A list of IP addresses in the IP address set.
      */
    var ipAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The types of IP addresses included in this IP set.
      */
    var ipFamily: js.UndefOr[Input[String]] = js.native
  }
  object AcceleratorIpSet {
    
    @scala.inline
    def apply(): AcceleratorIpSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceleratorIpSet]
    }
    
    @scala.inline
    implicit class AcceleratorIpSetMutableBuilder[Self <: AcceleratorIpSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpAddresses(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
      
      @scala.inline
      def setIpAddressesVarargs(value: Input[String]*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
      
      @scala.inline
      def setIpFamily(value: Input[String]): Self = StObject.set(x, "ipFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpFamilyUndefined: Self = StObject.set(x, "ipFamily", js.undefined)
    }
  }
  
  @js.native
  trait EndpointGroupEndpointConfiguration extends StObject {
    
    var clientIpPreservationEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
      */
    var endpointId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify.
      */
    var weight: js.UndefOr[Input[Double]] = js.native
  }
  object EndpointGroupEndpointConfiguration {
    
    @scala.inline
    def apply(): EndpointGroupEndpointConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointGroupEndpointConfiguration]
    }
    
    @scala.inline
    implicit class EndpointGroupEndpointConfigurationMutableBuilder[Self <: EndpointGroupEndpointConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientIpPreservationEnabled(value: Input[Boolean]): Self = StObject.set(x, "clientIpPreservationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIpPreservationEnabledUndefined: Self = StObject.set(x, "clientIpPreservationEnabled", js.undefined)
      
      @scala.inline
      def setEndpointId(value: Input[String]): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
      
      @scala.inline
      def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  @js.native
  trait EndpointGroupPortOverride extends StObject {
    
    /**
      * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
      */
    var endpointPort: Input[Double] = js.native
    
    /**
      * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
      */
    var listenerPort: Input[Double] = js.native
  }
  object EndpointGroupPortOverride {
    
    @scala.inline
    def apply(endpointPort: Input[Double], listenerPort: Input[Double]): EndpointGroupPortOverride = {
      val __obj = js.Dynamic.literal(endpointPort = endpointPort.asInstanceOf[js.Any], listenerPort = listenerPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointGroupPortOverride]
    }
    
    @scala.inline
    implicit class EndpointGroupPortOverrideMutableBuilder[Self <: EndpointGroupPortOverride] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointPort(value: Input[Double]): Self = StObject.set(x, "endpointPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerPort(value: Input[Double]): Self = StObject.set(x, "listenerPort", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListenerPortRange extends StObject {
    
    /**
      * The first port in the range of ports, inclusive.
      */
    var fromPort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The last port in the range of ports, inclusive.
      */
    var toPort: js.UndefOr[Input[Double]] = js.native
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
      def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
      
      @scala.inline
      def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
    }
  }
}
