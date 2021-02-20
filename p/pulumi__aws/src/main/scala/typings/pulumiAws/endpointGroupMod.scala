package typings.pulumiAws

import typings.pulumiAws.outputMod.globalaccelerator.EndpointGroupEndpointConfiguration
import typings.pulumiAws.outputMod.globalaccelerator.EndpointGroupPortOverride
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointGroupMod {
  
  @JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup")
  @js.native
  class EndpointGroup protected () extends CustomResource {
    /**
      * Create a EndpointGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointGroupArgs) = this()
    def this(name: String, args: EndpointGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the endpoint group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The list of endpoint objects. Fields documented below.
      */
    val endpointConfigurations: Output_[js.UndefOr[js.Array[EndpointGroupEndpointConfiguration]]] = js.native
    
    /**
      * The name of the AWS Region where the endpoint group is located.
      */
    val endpointGroupRegion: Output_[String] = js.native
    
    /**
      * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
      */
    val healthCheckIntervalSeconds: Output_[js.UndefOr[Double]] = js.native
    
    val healthCheckPath: Output_[String] = js.native
    
    val healthCheckPort: Output_[Double] = js.native
    
    /**
      * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
      */
    val healthCheckProtocol: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the listener.
      */
    val listenerArn: Output_[String] = js.native
    
    /**
      * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
      */
    val portOverrides: Output_[js.UndefOr[js.Array[EndpointGroupPortOverride]]] = js.native
    
    /**
      * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
      */
    val thresholdCount: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
      */
    val trafficDialPercentage: Output_[js.UndefOr[Double]] = js.native
  }
  /* static members */
  object EndpointGroup {
    
    /**
      * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): EndpointGroup = js.native
    @JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EndpointGroup = js.native
    @JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState): EndpointGroup = js.native
    @JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): EndpointGroup = js.native
    
    /**
      * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = js.native
  }
  
  @js.native
  trait EndpointGroupArgs extends StObject {
    
    /**
      * The list of endpoint objects. Fields documented below.
      */
    val endpointConfigurations: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]
          ]
        ]
      ] = js.native
    
    /**
      * The name of the AWS Region where the endpoint group is located.
      */
    val endpointGroupRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
      */
    val healthCheckIntervalSeconds: js.UndefOr[Input[Double]] = js.native
    
    val healthCheckPath: js.UndefOr[Input[String]] = js.native
    
    val healthCheckPort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
      */
    val healthCheckProtocol: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the listener.
      */
    val listenerArn: Input[String] = js.native
    
    /**
      * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
      */
    val portOverrides: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
        ]
      ] = js.native
    
    /**
      * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
      */
    val thresholdCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
      */
    val trafficDialPercentage: js.UndefOr[Input[Double]] = js.native
  }
  object EndpointGroupArgs {
    
    @scala.inline
    def apply(listenerArn: Input[String]): EndpointGroupArgs = {
      val __obj = js.Dynamic.literal(listenerArn = listenerArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointGroupArgs]
    }
    
    @scala.inline
    implicit class EndpointGroupArgsMutableBuilder[Self <: EndpointGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointConfigurations(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]
              ]
            ]
      ): Self = StObject.set(x, "endpointConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfigurationsUndefined: Self = StObject.set(x, "endpointConfigurations", js.undefined)
      
      @scala.inline
      def setEndpointConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]*): Self = StObject.set(x, "endpointConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setEndpointGroupRegion(value: Input[String]): Self = StObject.set(x, "endpointGroupRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointGroupRegionUndefined: Self = StObject.set(x, "endpointGroupRegion", js.undefined)
      
      @scala.inline
      def setHealthCheckIntervalSeconds(value: Input[Double]): Self = StObject.set(x, "healthCheckIntervalSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "healthCheckIntervalSeconds", js.undefined)
      
      @scala.inline
      def setHealthCheckPath(value: Input[String]): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
      
      @scala.inline
      def setHealthCheckPort(value: Input[Double]): Self = StObject.set(x, "healthCheckPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckPortUndefined: Self = StObject.set(x, "healthCheckPort", js.undefined)
      
      @scala.inline
      def setHealthCheckProtocol(value: Input[String]): Self = StObject.set(x, "healthCheckProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckProtocolUndefined: Self = StObject.set(x, "healthCheckProtocol", js.undefined)
      
      @scala.inline
      def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortOverrides(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
            ]
      ): Self = StObject.set(x, "portOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortOverridesUndefined: Self = StObject.set(x, "portOverrides", js.undefined)
      
      @scala.inline
      def setPortOverridesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]*): Self = StObject.set(x, "portOverrides", js.Array(value :_*))
      
      @scala.inline
      def setThresholdCount(value: Input[Double]): Self = StObject.set(x, "thresholdCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdCountUndefined: Self = StObject.set(x, "thresholdCount", js.undefined)
      
      @scala.inline
      def setTrafficDialPercentage(value: Input[Double]): Self = StObject.set(x, "trafficDialPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficDialPercentageUndefined: Self = StObject.set(x, "trafficDialPercentage", js.undefined)
    }
  }
  
  @js.native
  trait EndpointGroupState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the endpoint group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The list of endpoint objects. Fields documented below.
      */
    val endpointConfigurations: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]
          ]
        ]
      ] = js.native
    
    /**
      * The name of the AWS Region where the endpoint group is located.
      */
    val endpointGroupRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
      */
    val healthCheckIntervalSeconds: js.UndefOr[Input[Double]] = js.native
    
    val healthCheckPath: js.UndefOr[Input[String]] = js.native
    
    val healthCheckPort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
      */
    val healthCheckProtocol: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the listener.
      */
    val listenerArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
      */
    val portOverrides: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
        ]
      ] = js.native
    
    /**
      * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
      */
    val thresholdCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
      */
    val trafficDialPercentage: js.UndefOr[Input[Double]] = js.native
  }
  object EndpointGroupState {
    
    @scala.inline
    def apply(): EndpointGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointGroupState]
    }
    
    @scala.inline
    implicit class EndpointGroupStateMutableBuilder[Self <: EndpointGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEndpointConfigurations(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]
              ]
            ]
      ): Self = StObject.set(x, "endpointConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointConfigurationsUndefined: Self = StObject.set(x, "endpointConfigurations", js.undefined)
      
      @scala.inline
      def setEndpointConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]*): Self = StObject.set(x, "endpointConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setEndpointGroupRegion(value: Input[String]): Self = StObject.set(x, "endpointGroupRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointGroupRegionUndefined: Self = StObject.set(x, "endpointGroupRegion", js.undefined)
      
      @scala.inline
      def setHealthCheckIntervalSeconds(value: Input[Double]): Self = StObject.set(x, "healthCheckIntervalSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "healthCheckIntervalSeconds", js.undefined)
      
      @scala.inline
      def setHealthCheckPath(value: Input[String]): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
      
      @scala.inline
      def setHealthCheckPort(value: Input[Double]): Self = StObject.set(x, "healthCheckPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckPortUndefined: Self = StObject.set(x, "healthCheckPort", js.undefined)
      
      @scala.inline
      def setHealthCheckProtocol(value: Input[String]): Self = StObject.set(x, "healthCheckProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckProtocolUndefined: Self = StObject.set(x, "healthCheckProtocol", js.undefined)
      
      @scala.inline
      def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerArnUndefined: Self = StObject.set(x, "listenerArn", js.undefined)
      
      @scala.inline
      def setPortOverrides(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
            ]
      ): Self = StObject.set(x, "portOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortOverridesUndefined: Self = StObject.set(x, "portOverrides", js.undefined)
      
      @scala.inline
      def setPortOverridesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]*): Self = StObject.set(x, "portOverrides", js.Array(value :_*))
      
      @scala.inline
      def setThresholdCount(value: Input[Double]): Self = StObject.set(x, "thresholdCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdCountUndefined: Self = StObject.set(x, "thresholdCount", js.undefined)
      
      @scala.inline
      def setTrafficDialPercentage(value: Input[Double]): Self = StObject.set(x, "trafficDialPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficDialPercentageUndefined: Self = StObject.set(x, "trafficDialPercentage", js.undefined)
    }
  }
}
