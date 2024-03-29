package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventStreamMod {
  
  @JSImport("@pulumi/aws/pinpoint/eventStream", "EventStream")
  @js.native
  class EventStream protected () extends CustomResource {
    /**
      * Create a EventStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventStreamArgs) = this()
    def this(name: String, args: EventStreamArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The application ID.
      */
    val applicationId: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      */
    val destinationStreamArn: Output_[String] = js.native
    
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    val roleArn: Output_[String] = js.native
  }
  /* static members */
  object EventStream {
    
    @JSImport("@pulumi/aws/pinpoint/eventStream", "EventStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EventStream]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventStream]
    inline def get(name: String, id: Input[ID], state: EventStreamState): EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EventStream]
    inline def get(name: String, id: Input[ID], state: EventStreamState, opts: CustomResourceOptions): EventStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventStream]
    
    /**
      * Returns true if the given object is an instance of EventStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/eventStream.EventStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/pinpoint/eventStream.EventStream */ Boolean]
  }
  
  trait EventStreamArgs extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: Input[String]
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      */
    val destinationStreamArn: Input[String]
    
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    val roleArn: Input[String]
  }
  object EventStreamArgs {
    
    inline def apply(applicationId: Input[String], destinationStreamArn: Input[String], roleArn: Input[String]): EventStreamArgs = {
      val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], destinationStreamArn = destinationStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventStreamArgs]
    }
    
    extension [Self <: EventStreamArgs](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setDestinationStreamArn(value: Input[String]): Self = StObject.set(x, "destinationStreamArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventStreamState extends StObject {
    
    /**
      * The application ID.
      */
    val applicationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
      */
    val destinationStreamArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object EventStreamState {
    
    inline def apply(): EventStreamState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventStreamState]
    }
    
    extension [Self <: EventStreamState](x: Self) {
      
      inline def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
      
      inline def setDestinationStreamArn(value: Input[String]): Self = StObject.set(x, "destinationStreamArn", value.asInstanceOf[js.Any])
      
      inline def setDestinationStreamArnUndefined: Self = StObject.set(x, "destinationStreamArn", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
