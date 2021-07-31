package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishingDestinationMod {
  
  @JSImport("@pulumi/aws/guardduty/publishingDestination", "PublishingDestination")
  @js.native
  class PublishingDestination protected () extends CustomResource {
    /**
      * Create a PublishingDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PublishingDestinationArgs) = this()
    def this(name: String, args: PublishingDestinationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
      */
    val destinationArn: Output_[String] = js.native
    
    /**
      * Currently there is only "S3" available as destination type which is also the default value
      */
    val destinationType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: Output_[String] = js.native
    
    /**
      * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
      */
    val kmsKeyArn: Output_[String] = js.native
  }
  /* static members */
  object PublishingDestination {
    
    @JSImport("@pulumi/aws/guardduty/publishingDestination", "PublishingDestination")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing PublishingDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): PublishingDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[PublishingDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): PublishingDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PublishingDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublishingDestinationState): PublishingDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PublishingDestination]
    @scala.inline
    def get(name: String, id: Input[ID], state: PublishingDestinationState, opts: CustomResourceOptions): PublishingDestination = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PublishingDestination]
    
    /**
      * Returns true if the given object is an instance of PublishingDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/publishingDestination.PublishingDestination */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/guardduty/publishingDestination.PublishingDestination */ Boolean]
  }
  
  trait PublishingDestinationArgs extends StObject {
    
    /**
      * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
      */
    val destinationArn: Input[String]
    
    /**
      * Currently there is only "S3" available as destination type which is also the default value
      */
    val destinationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: Input[String]
    
    /**
      * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
      */
    val kmsKeyArn: Input[String]
  }
  object PublishingDestinationArgs {
    
    @scala.inline
    def apply(destinationArn: Input[String], detectorId: Input[String], kmsKeyArn: Input[String]): PublishingDestinationArgs = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishingDestinationArgs]
    }
    
    @scala.inline
    implicit class PublishingDestinationArgsMutableBuilder[Self <: PublishingDestinationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationType(value: Input[String]): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishingDestinationState extends StObject {
    
    /**
      * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
      */
    val destinationArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Currently there is only "S3" available as destination type which is also the default value
      */
    val destinationType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The detector ID of the GuardDuty.
      */
    val detectorId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
      */
    val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  }
  object PublishingDestinationState {
    
    @scala.inline
    def apply(): PublishingDestinationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublishingDestinationState]
    }
    
    @scala.inline
    implicit class PublishingDestinationStateMutableBuilder[Self <: PublishingDestinationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationArn(value: Input[String]): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationArnUndefined: Self = StObject.set(x, "destinationArn", js.undefined)
      
      @scala.inline
      def setDestinationType(value: Input[String]): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    }
  }
}
