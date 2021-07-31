package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logDestinationMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logDestination", "LogDestination")
  @js.native
  class LogDestination protected () extends CustomResource {
    /**
      * Create a LogDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogDestinationArgs) = this()
    def this(name: String, args: LogDestinationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the log destination.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A name for the log destination
      */
    val name: Output_[String] = js.native
    
    /**
      * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The ARN of the target Amazon Kinesis stream resource for the destination
      */
    val targetArn: Output_[String] = js.native
  }
  /* static members */
  object LogDestination {
    
    @JSImport("@pulumi/aws/cloudwatch/logDestination", "LogDestination")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LogDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LogDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LogDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LogDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: LogDestinationState): LogDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LogDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: LogDestinationState, opts: CustomResourceOptions): LogDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogDestination]
    
    /**
      * Returns true if the given object is an instance of LogDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestination.LogDestination */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestination.LogDestination */ Boolean]
  }
  
  trait LogDestinationArgs extends StObject {
    
    /**
      * A name for the log destination
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
      */
    val roleArn: Input[String]
    
    /**
      * The ARN of the target Amazon Kinesis stream resource for the destination
      */
    val targetArn: Input[String]
  }
  object LogDestinationArgs {
    
    @scala.inline
    def apply(roleArn: Input[String], targetArn: Input[String]): LogDestinationArgs = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogDestinationArgs]
    }
    
    @scala.inline
    implicit class LogDestinationArgsMutableBuilder[Self <: LogDestinationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogDestinationState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the log destination.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A name for the log destination
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the target Amazon Kinesis stream resource for the destination
      */
    val targetArn: js.UndefOr[Input[String]] = js.undefined
  }
  object LogDestinationState {
    
    @scala.inline
    def apply(): LogDestinationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogDestinationState]
    }
    
    @scala.inline
    implicit class LogDestinationStateMutableBuilder[Self <: LogDestinationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setTargetArn(value: Input[String]): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
    }
  }
}
