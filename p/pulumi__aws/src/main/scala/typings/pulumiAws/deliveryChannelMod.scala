package typings.pulumiAws

import typings.pulumiAws.outputMod.cfg.DeliveryChannelSnapshotDeliveryProperties
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deliveryChannelMod {
  
  @JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel")
  @js.native
  class DeliveryChannel protected () extends CustomResource {
    /**
      * Create a DeliveryChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeliveryChannelArgs) = this()
    def this(name: String, args: DeliveryChannelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
      */
    val name: Output_[String] = js.native
    
    /**
      * The name of the S3 bucket used to store the configuration history.
      */
    val s3BucketName: Output_[String] = js.native
    
    /**
      * The prefix for the specified S3 bucket.
      */
    val s3KeyPrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Options for how AWS Config delivers configuration snapshots. See below
      */
    val snapshotDeliveryProperties: Output_[js.UndefOr[DeliveryChannelSnapshotDeliveryProperties]] = js.native
    
    /**
      * The ARN of the SNS topic that AWS Config delivers notifications to.
      */
    val snsTopicArn: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object DeliveryChannel {
    
    /**
      * Get an existing DeliveryChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel.get")
    @js.native
    def get(name: String, id: Input[ID]): DeliveryChannel = js.native
    @JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DeliveryChannel = js.native
    @JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState): DeliveryChannel = js.native
    @JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState, opts: CustomResourceOptions): DeliveryChannel = js.native
    
    /**
      * Returns true if the given object is an instance of DeliveryChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cfg/deliveryChannel", "DeliveryChannel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ Boolean = js.native
  }
  
  @js.native
  trait DeliveryChannelArgs extends StObject {
    
    /**
      * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the S3 bucket used to store the configuration history.
      */
    val s3BucketName: Input[String] = js.native
    
    /**
      * The prefix for the specified S3 bucket.
      */
    val s3KeyPrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Options for how AWS Config delivers configuration snapshots. See below
      */
    val snapshotDeliveryProperties: js.UndefOr[Input[typings.pulumiAws.inputMod.cfg.DeliveryChannelSnapshotDeliveryProperties]] = js.native
    
    /**
      * The ARN of the SNS topic that AWS Config delivers notifications to.
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.native
  }
  object DeliveryChannelArgs {
    
    @scala.inline
    def apply(s3BucketName: Input[String]): DeliveryChannelArgs = {
      val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeliveryChannelArgs]
    }
    
    @scala.inline
    implicit class DeliveryChannelArgsMutableBuilder[Self <: DeliveryChannelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
      
      @scala.inline
      def setSnapshotDeliveryProperties(value: Input[typings.pulumiAws.inputMod.cfg.DeliveryChannelSnapshotDeliveryProperties]): Self = StObject.set(x, "snapshotDeliveryProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotDeliveryPropertiesUndefined: Self = StObject.set(x, "snapshotDeliveryProperties", js.undefined)
      
      @scala.inline
      def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
    }
  }
  
  @js.native
  trait DeliveryChannelState extends StObject {
    
    /**
      * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the S3 bucket used to store the configuration history.
      */
    val s3BucketName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The prefix for the specified S3 bucket.
      */
    val s3KeyPrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Options for how AWS Config delivers configuration snapshots. See below
      */
    val snapshotDeliveryProperties: js.UndefOr[Input[typings.pulumiAws.inputMod.cfg.DeliveryChannelSnapshotDeliveryProperties]] = js.native
    
    /**
      * The ARN of the SNS topic that AWS Config delivers notifications to.
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.native
  }
  object DeliveryChannelState {
    
    @scala.inline
    def apply(): DeliveryChannelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeliveryChannelState]
    }
    
    @scala.inline
    implicit class DeliveryChannelStateMutableBuilder[Self <: DeliveryChannelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
      
      @scala.inline
      def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
      
      @scala.inline
      def setSnapshotDeliveryProperties(value: Input[typings.pulumiAws.inputMod.cfg.DeliveryChannelSnapshotDeliveryProperties]): Self = StObject.set(x, "snapshotDeliveryProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotDeliveryPropertiesUndefined: Self = StObject.set(x, "snapshotDeliveryProperties", js.undefined)
      
      @scala.inline
      def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
    }
  }
}
