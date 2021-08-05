package typings.pulumiAws

import typings.pulumiAws.outputMod.ses.EventDestinationCloudwatchDestination
import typings.pulumiAws.outputMod.ses.EventDestinationKinesisDestination
import typings.pulumiAws.outputMod.ses.EventDestinationSnsDestination
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventDestinationMod {
  
  @JSImport("@pulumi/aws/ses/eventDestination", "EventDestination")
  @js.native
  class EventDestination protected () extends CustomResource {
    /**
      * Create a EventDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventDestinationArgs) = this()
    def this(name: String, args: EventDestinationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * CloudWatch destination for the events
      */
    val cloudwatchDestinations: Output_[js.UndefOr[js.Array[EventDestinationCloudwatchDestination]]] = js.native
    
    /**
      * The name of the configuration set
      */
    val configurationSetName: Output_[String] = js.native
    
    /**
      * If true, the event destination will be enabled
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Send the events to a kinesis firehose destination
      */
    val kinesisDestination: Output_[js.UndefOr[EventDestinationKinesisDestination]] = js.native
    
    /**
      * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
      */
    val matchingTypes: Output_[js.Array[String]] = js.native
    
    /**
      * The name of the event destination
      */
    val name: Output_[String] = js.native
    
    /**
      * Send the events to an SNS Topic destination
      */
    val snsDestination: Output_[js.UndefOr[EventDestinationSnsDestination]] = js.native
  }
  /* static members */
  object EventDestination {
    
    @JSImport("@pulumi/aws/ses/eventDestination", "EventDestination")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EventDestination]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventDestination]
    inline def get(name: String, id: Input[ID], state: EventDestinationState): EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EventDestination]
    inline def get(name: String, id: Input[ID], state: EventDestinationState, opts: CustomResourceOptions): EventDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventDestination]
    
    /**
      * Returns true if the given object is an instance of EventDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean]
  }
  
  trait EventDestinationArgs extends StObject {
    
    /**
      * CloudWatch destination for the events
      */
    val cloudwatchDestinations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination]]
        ]
      ] = js.undefined
    
    /**
      * The name of the configuration set
      */
    val configurationSetName: Input[String]
    
    /**
      * If true, the event destination will be enabled
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Send the events to a kinesis firehose destination
      */
    val kinesisDestination: js.UndefOr[Input[typings.pulumiAws.inputMod.ses.EventDestinationKinesisDestination]] = js.undefined
    
    /**
      * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
      */
    val matchingTypes: Input[js.Array[Input[String]]]
    
    /**
      * The name of the event destination
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Send the events to an SNS Topic destination
      */
    val snsDestination: js.UndefOr[Input[typings.pulumiAws.inputMod.ses.EventDestinationSnsDestination]] = js.undefined
  }
  object EventDestinationArgs {
    
    inline def apply(configurationSetName: Input[String], matchingTypes: Input[js.Array[Input[String]]]): EventDestinationArgs = {
      val __obj = js.Dynamic.literal(configurationSetName = configurationSetName.asInstanceOf[js.Any], matchingTypes = matchingTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventDestinationArgs]
    }
    
    extension [Self <: EventDestinationArgs](x: Self) {
      
      inline def setCloudwatchDestinations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination]]
            ]
      ): Self = StObject.set(x, "cloudwatchDestinations", value.asInstanceOf[js.Any])
      
      inline def setCloudwatchDestinationsUndefined: Self = StObject.set(x, "cloudwatchDestinations", js.undefined)
      
      inline def setCloudwatchDestinationsVarargs(value: Input[typings.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination]*): Self = StObject.set(x, "cloudwatchDestinations", js.Array(value :_*))
      
      inline def setConfigurationSetName(value: Input[String]): Self = StObject.set(x, "configurationSetName", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKinesisDestination(value: Input[typings.pulumiAws.inputMod.ses.EventDestinationKinesisDestination]): Self = StObject.set(x, "kinesisDestination", value.asInstanceOf[js.Any])
      
      inline def setKinesisDestinationUndefined: Self = StObject.set(x, "kinesisDestination", js.undefined)
      
      inline def setMatchingTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "matchingTypes", value.asInstanceOf[js.Any])
      
      inline def setMatchingTypesVarargs(value: Input[String]*): Self = StObject.set(x, "matchingTypes", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSnsDestination(value: Input[typings.pulumiAws.inputMod.ses.EventDestinationSnsDestination]): Self = StObject.set(x, "snsDestination", value.asInstanceOf[js.Any])
      
      inline def setSnsDestinationUndefined: Self = StObject.set(x, "snsDestination", js.undefined)
    }
  }
  
  trait EventDestinationState extends StObject {
    
    /**
      * CloudWatch destination for the events
      */
    val cloudwatchDestinations: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination]]
        ]
      ] = js.undefined
    
    /**
      * The name of the configuration set
      */
    val configurationSetName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true, the event destination will be enabled
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Send the events to a kinesis firehose destination
      */
    val kinesisDestination: js.UndefOr[Input[typings.pulumiAws.inputMod.ses.EventDestinationKinesisDestination]] = js.undefined
    
    /**
      * A list of matching types. May be any of `"send"`, `"reject"`, `"bounce"`, `"complaint"`, `"delivery"`, `"open"`, `"click"`, or `"renderingFailure"`.
      */
    val matchingTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of the event destination
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Send the events to an SNS Topic destination
      */
    val snsDestination: js.UndefOr[Input[typings.pulumiAws.inputMod.ses.EventDestinationSnsDestination]] = js.undefined
  }
  object EventDestinationState {
    
    inline def apply(): EventDestinationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventDestinationState]
    }
    
    extension [Self <: EventDestinationState](x: Self) {
      
      inline def setCloudwatchDestinations(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination]]
            ]
      ): Self = StObject.set(x, "cloudwatchDestinations", value.asInstanceOf[js.Any])
      
      inline def setCloudwatchDestinationsUndefined: Self = StObject.set(x, "cloudwatchDestinations", js.undefined)
      
      inline def setCloudwatchDestinationsVarargs(value: Input[typings.pulumiAws.inputMod.ses.EventDestinationCloudwatchDestination]*): Self = StObject.set(x, "cloudwatchDestinations", js.Array(value :_*))
      
      inline def setConfigurationSetName(value: Input[String]): Self = StObject.set(x, "configurationSetName", value.asInstanceOf[js.Any])
      
      inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "configurationSetName", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKinesisDestination(value: Input[typings.pulumiAws.inputMod.ses.EventDestinationKinesisDestination]): Self = StObject.set(x, "kinesisDestination", value.asInstanceOf[js.Any])
      
      inline def setKinesisDestinationUndefined: Self = StObject.set(x, "kinesisDestination", js.undefined)
      
      inline def setMatchingTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "matchingTypes", value.asInstanceOf[js.Any])
      
      inline def setMatchingTypesUndefined: Self = StObject.set(x, "matchingTypes", js.undefined)
      
      inline def setMatchingTypesVarargs(value: Input[String]*): Self = StObject.set(x, "matchingTypes", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSnsDestination(value: Input[typings.pulumiAws.inputMod.ses.EventDestinationSnsDestination]): Self = StObject.set(x, "snsDestination", value.asInstanceOf[js.Any])
      
      inline def setSnsDestinationUndefined: Self = StObject.set(x, "snsDestination", js.undefined)
    }
  }
}
