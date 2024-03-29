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
    
    @JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EndpointGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EndpointGroup]
    inline def get(name: String, id: Input[ID], state: EndpointGroupState): EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EndpointGroup]
    inline def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): EndpointGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EndpointGroup]
    
    /**
      * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean]
  }
  
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
      ] = js.undefined
    
    /**
      * The name of the AWS Region where the endpoint group is located.
      */
    val endpointGroupRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
      */
    val healthCheckIntervalSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    val healthCheckPath: js.UndefOr[Input[String]] = js.undefined
    
    val healthCheckPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
      */
    val healthCheckProtocol: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the listener.
      */
    val listenerArn: Input[String]
    
    /**
      * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
      */
    val portOverrides: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
        ]
      ] = js.undefined
    
    /**
      * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
      */
    val thresholdCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
      */
    val trafficDialPercentage: js.UndefOr[Input[Double]] = js.undefined
  }
  object EndpointGroupArgs {
    
    inline def apply(listenerArn: Input[String]): EndpointGroupArgs = {
      val __obj = js.Dynamic.literal(listenerArn = listenerArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointGroupArgs]
    }
    
    extension [Self <: EndpointGroupArgs](x: Self) {
      
      inline def setEndpointConfigurations(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]
              ]
            ]
      ): Self = StObject.set(x, "endpointConfigurations", value.asInstanceOf[js.Any])
      
      inline def setEndpointConfigurationsUndefined: Self = StObject.set(x, "endpointConfigurations", js.undefined)
      
      inline def setEndpointConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]*): Self = StObject.set(x, "endpointConfigurations", js.Array(value :_*))
      
      inline def setEndpointGroupRegion(value: Input[String]): Self = StObject.set(x, "endpointGroupRegion", value.asInstanceOf[js.Any])
      
      inline def setEndpointGroupRegionUndefined: Self = StObject.set(x, "endpointGroupRegion", js.undefined)
      
      inline def setHealthCheckIntervalSeconds(value: Input[Double]): Self = StObject.set(x, "healthCheckIntervalSeconds", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "healthCheckIntervalSeconds", js.undefined)
      
      inline def setHealthCheckPath(value: Input[String]): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
      
      inline def setHealthCheckPort(value: Input[Double]): Self = StObject.set(x, "healthCheckPort", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckPortUndefined: Self = StObject.set(x, "healthCheckPort", js.undefined)
      
      inline def setHealthCheckProtocol(value: Input[String]): Self = StObject.set(x, "healthCheckProtocol", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckProtocolUndefined: Self = StObject.set(x, "healthCheckProtocol", js.undefined)
      
      inline def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      inline def setPortOverrides(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
            ]
      ): Self = StObject.set(x, "portOverrides", value.asInstanceOf[js.Any])
      
      inline def setPortOverridesUndefined: Self = StObject.set(x, "portOverrides", js.undefined)
      
      inline def setPortOverridesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]*): Self = StObject.set(x, "portOverrides", js.Array(value :_*))
      
      inline def setThresholdCount(value: Input[Double]): Self = StObject.set(x, "thresholdCount", value.asInstanceOf[js.Any])
      
      inline def setThresholdCountUndefined: Self = StObject.set(x, "thresholdCount", js.undefined)
      
      inline def setTrafficDialPercentage(value: Input[Double]): Self = StObject.set(x, "trafficDialPercentage", value.asInstanceOf[js.Any])
      
      inline def setTrafficDialPercentageUndefined: Self = StObject.set(x, "trafficDialPercentage", js.undefined)
    }
  }
  
  trait EndpointGroupState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the endpoint group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The list of endpoint objects. Fields documented below.
      */
    val endpointConfigurations: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]
          ]
        ]
      ] = js.undefined
    
    /**
      * The name of the AWS Region where the endpoint group is located.
      */
    val endpointGroupRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
      */
    val healthCheckIntervalSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    val healthCheckPath: js.UndefOr[Input[String]] = js.undefined
    
    val healthCheckPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
      */
    val healthCheckProtocol: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the listener.
      */
    val listenerArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
      */
    val portOverrides: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
        ]
      ] = js.undefined
    
    /**
      * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
      */
    val thresholdCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
      */
    val trafficDialPercentage: js.UndefOr[Input[Double]] = js.undefined
  }
  object EndpointGroupState {
    
    inline def apply(): EndpointGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointGroupState]
    }
    
    extension [Self <: EndpointGroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEndpointConfigurations(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]
              ]
            ]
      ): Self = StObject.set(x, "endpointConfigurations", value.asInstanceOf[js.Any])
      
      inline def setEndpointConfigurationsUndefined: Self = StObject.set(x, "endpointConfigurations", js.undefined)
      
      inline def setEndpointConfigurationsVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupEndpointConfiguration]*): Self = StObject.set(x, "endpointConfigurations", js.Array(value :_*))
      
      inline def setEndpointGroupRegion(value: Input[String]): Self = StObject.set(x, "endpointGroupRegion", value.asInstanceOf[js.Any])
      
      inline def setEndpointGroupRegionUndefined: Self = StObject.set(x, "endpointGroupRegion", js.undefined)
      
      inline def setHealthCheckIntervalSeconds(value: Input[Double]): Self = StObject.set(x, "healthCheckIntervalSeconds", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "healthCheckIntervalSeconds", js.undefined)
      
      inline def setHealthCheckPath(value: Input[String]): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
      
      inline def setHealthCheckPort(value: Input[Double]): Self = StObject.set(x, "healthCheckPort", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckPortUndefined: Self = StObject.set(x, "healthCheckPort", js.undefined)
      
      inline def setHealthCheckProtocol(value: Input[String]): Self = StObject.set(x, "healthCheckProtocol", value.asInstanceOf[js.Any])
      
      inline def setHealthCheckProtocolUndefined: Self = StObject.set(x, "healthCheckProtocol", js.undefined)
      
      inline def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      inline def setListenerArnUndefined: Self = StObject.set(x, "listenerArn", js.undefined)
      
      inline def setPortOverrides(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]]
            ]
      ): Self = StObject.set(x, "portOverrides", value.asInstanceOf[js.Any])
      
      inline def setPortOverridesUndefined: Self = StObject.set(x, "portOverrides", js.undefined)
      
      inline def setPortOverridesVarargs(value: Input[typings.pulumiAws.inputMod.globalaccelerator.EndpointGroupPortOverride]*): Self = StObject.set(x, "portOverrides", js.Array(value :_*))
      
      inline def setThresholdCount(value: Input[Double]): Self = StObject.set(x, "thresholdCount", value.asInstanceOf[js.Any])
      
      inline def setThresholdCountUndefined: Self = StObject.set(x, "thresholdCount", js.undefined)
      
      inline def setTrafficDialPercentage(value: Input[Double]): Self = StObject.set(x, "trafficDialPercentage", value.asInstanceOf[js.Any])
      
      inline def setTrafficDialPercentageUndefined: Self = StObject.set(x, "trafficDialPercentage", js.undefined)
    }
  }
}
