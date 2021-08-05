package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetGroupAttachmentMod {
  
  @JSImport("@pulumi/aws/alb/targetGroupAttachment", "TargetGroupAttachment")
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
    
    @JSImport("@pulumi/aws/alb/targetGroupAttachment", "TargetGroupAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TargetGroupAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TargetGroupAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TargetGroupAttachment]
    inline def get(name: String, id: Input[ID], state: TargetGroupAttachmentState): TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TargetGroupAttachment]
    inline def get(name: String, id: Input[ID], state: TargetGroupAttachmentState, opts: CustomResourceOptions): TargetGroupAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TargetGroupAttachment]
    
    /**
      * Returns true if the given object is an instance of TargetGroupAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/targetGroupAttachment.TargetGroupAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/alb/targetGroupAttachment.TargetGroupAttachment */ Boolean]
  }
  
  trait TargetGroupAttachmentArgs extends StObject {
    
    /**
      * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port on which targets receive traffic.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN of the target group with which to register targets
      */
    val targetGroupArn: Input[String]
    
    /**
      * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
      */
    val targetId: Input[String]
  }
  object TargetGroupAttachmentArgs {
    
    inline def apply(targetGroupArn: Input[String], targetId: Input[String]): TargetGroupAttachmentArgs = {
      val __obj = js.Dynamic.literal(targetGroupArn = targetGroupArn.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetGroupAttachmentArgs]
    }
    
    extension [Self <: TargetGroupAttachmentArgs](x: Self) {
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTargetGroupArn(value: Input[String]): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
      
      inline def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetGroupAttachmentState extends StObject {
    
    /**
      * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The port on which targets receive traffic.
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN of the target group with which to register targets
      */
    val targetGroupArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
      */
    val targetId: js.UndefOr[Input[String]] = js.undefined
  }
  object TargetGroupAttachmentState {
    
    inline def apply(): TargetGroupAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetGroupAttachmentState]
    }
    
    extension [Self <: TargetGroupAttachmentState](x: Self) {
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTargetGroupArn(value: Input[String]): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
      
      inline def setTargetGroupArnUndefined: Self = StObject.set(x, "targetGroupArn", js.undefined)
      
      inline def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    }
  }
}
