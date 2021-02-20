package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lbTargetGroupAttachmentMod {
  
  @JSImport("@pulumi/aws/lb/targetGroupAttachment", "TargetGroupAttachment")
  @js.native
  class TargetGroupAttachment protected () extends CustomResource {
    /**
      * Create a TargetGroupAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TargetGroupAttachmentArgs) = this()
    def this(name: String, args: TargetGroupAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
      */
    val availabilityZone: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The port on which targets receive traffic.
      */
    val port: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The ARN of the target group with which to register targets
      */
    val targetGroupArn: Output_[String] = js.native
    
    /**
      * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
      */
    val targetId: Output_[String] = js.native
  }
  /* static members */
  object TargetGroupAttachment {
    
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lb/targetGroupAttachment", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws/lb/targetGroupAttachment", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws/lb/targetGroupAttachment", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): TargetGroupAttachment = js.native
    @JSImport("@pulumi/aws/lb/targetGroupAttachment", "TargetGroupAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): TargetGroupAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lb/targetGroupAttachment", "TargetGroupAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroupAttachment.TargetGroupAttachment */ Boolean = js.native
  }
  
  @js.native
  trait TargetGroupAttachmentArgs extends StObject {
    
    /**
      * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which targets receive traffic.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The ARN of the target group with which to register targets
      */
    val targetGroupArn: Input[String] = js.native
    
    /**
      * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
      */
    val targetId: Input[String] = js.native
  }
  object TargetGroupAttachmentArgs {
    
    @scala.inline
    def apply(targetGroupArn: Input[String], targetId: Input[String]): TargetGroupAttachmentArgs = {
      val __obj = js.Dynamic.literal(targetGroupArn = targetGroupArn.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetGroupAttachmentArgs]
    }
    
    @scala.inline
    implicit class TargetGroupAttachmentArgsMutableBuilder[Self <: TargetGroupAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setTargetGroupArn(value: Input[String]): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TargetGroupAttachmentState extends StObject {
    
    /**
      * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which targets receive traffic.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The ARN of the target group with which to register targets
      */
    val targetGroupArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
      */
    val targetId: js.UndefOr[Input[String]] = js.native
  }
  object TargetGroupAttachmentState {
    
    @scala.inline
    def apply(): TargetGroupAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetGroupAttachmentState]
    }
    
    @scala.inline
    implicit class TargetGroupAttachmentStateMutableBuilder[Self <: TargetGroupAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setTargetGroupArn(value: Input[String]): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetGroupArnUndefined: Self = StObject.set(x, "targetGroupArn", js.undefined)
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
}
