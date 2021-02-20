package typings.pulumiAws

import typings.pulumiAws.outputMod.macie.S3BucketAssociationClassificationType
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3bucketAssociationMod {
  
  @JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation")
  @js.native
  class S3BucketAssociation protected () extends CustomResource {
    /**
      * Create a S3BucketAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3BucketAssociationArgs) = this()
    def this(name: String, args: S3BucketAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the S3 bucket that you want to associate with Amazon Macie.
      */
    val bucketName: Output_[String] = js.native
    
    /**
      * The configuration of how Amazon Macie classifies the S3 objects.
      */
    val classificationType: Output_[S3BucketAssociationClassificationType] = js.native
    
    /**
      * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `memberAccountId` isn't specified, the action associates specified S3 resources with Macie for the current master account.
      */
    val memberAccountId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Object key prefix identifying one or more S3 objects to which the association applies.
      */
    val prefix: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object S3BucketAssociation {
    
    /**
      * Get an existing S3BucketAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): S3BucketAssociation = js.native
    @JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): S3BucketAssociation = js.native
    @JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3BucketAssociationState): S3BucketAssociation = js.native
    @JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3BucketAssociationState, opts: CustomResourceOptions): S3BucketAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of S3BucketAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/s3bucketAssociation.S3BucketAssociation */ Boolean = js.native
  }
  
  @js.native
  trait S3BucketAssociationArgs extends StObject {
    
    /**
      * The name of the S3 bucket that you want to associate with Amazon Macie.
      */
    val bucketName: Input[String] = js.native
    
    /**
      * The configuration of how Amazon Macie classifies the S3 objects.
      */
    val classificationType: js.UndefOr[Input[typings.pulumiAws.inputMod.macie.S3BucketAssociationClassificationType]] = js.native
    
    /**
      * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `memberAccountId` isn't specified, the action associates specified S3 resources with Macie for the current master account.
      */
    val memberAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Object key prefix identifying one or more S3 objects to which the association applies.
      */
    val prefix: js.UndefOr[Input[String]] = js.native
  }
  object S3BucketAssociationArgs {
    
    @scala.inline
    def apply(bucketName: Input[String]): S3BucketAssociationArgs = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3BucketAssociationArgs]
    }
    
    @scala.inline
    implicit class S3BucketAssociationArgsMutableBuilder[Self <: S3BucketAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassificationType(value: Input[typings.pulumiAws.inputMod.macie.S3BucketAssociationClassificationType]): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
      
      @scala.inline
      def setMemberAccountId(value: Input[String]): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
      
      @scala.inline
      def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait S3BucketAssociationState extends StObject {
    
    /**
      * The name of the S3 bucket that you want to associate with Amazon Macie.
      */
    val bucketName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The configuration of how Amazon Macie classifies the S3 objects.
      */
    val classificationType: js.UndefOr[Input[typings.pulumiAws.inputMod.macie.S3BucketAssociationClassificationType]] = js.native
    
    /**
      * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `memberAccountId` isn't specified, the action associates specified S3 resources with Macie for the current master account.
      */
    val memberAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Object key prefix identifying one or more S3 objects to which the association applies.
      */
    val prefix: js.UndefOr[Input[String]] = js.native
  }
  object S3BucketAssociationState {
    
    @scala.inline
    def apply(): S3BucketAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3BucketAssociationState]
    }
    
    @scala.inline
    implicit class S3BucketAssociationStateMutableBuilder[Self <: S3BucketAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
      
      @scala.inline
      def setClassificationType(value: Input[typings.pulumiAws.inputMod.macie.S3BucketAssociationClassificationType]): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
      
      @scala.inline
      def setMemberAccountId(value: Input[String]): Self = StObject.set(x, "memberAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberAccountIdUndefined: Self = StObject.set(x, "memberAccountId", js.undefined)
      
      @scala.inline
      def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
