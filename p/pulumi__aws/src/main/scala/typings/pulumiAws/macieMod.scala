package typings.pulumiAws

import typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociationArgs
import typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociationState
import typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociationArgs
import typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macieMod {
  
  @JSImport("@pulumi/aws/macie", "MemberAccountAssociation")
  @js.native
  class MemberAccountAssociation protected ()
    extends typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation {
    /**
      * Create a MemberAccountAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberAccountAssociationArgs) = this()
    def this(name: String, args: MemberAccountAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MemberAccountAssociation {
    
    @JSImport("@pulumi/aws/macie", "MemberAccountAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MemberAccountAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState): typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState, opts: CustomResourceOptions): typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation]
    
    /**
      * Returns true if the given object is an instance of MemberAccountAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/macie", "S3BucketAssociation")
  @js.native
  class S3BucketAssociation protected ()
    extends typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation {
    /**
      * Create a S3BucketAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3BucketAssociationArgs) = this()
    def this(name: String, args: S3BucketAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object S3BucketAssociation {
    
    @JSImport("@pulumi/aws/macie", "S3BucketAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing S3BucketAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: S3BucketAssociationState): typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: S3BucketAssociationState, opts: CustomResourceOptions): typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3bucketAssociationMod.S3BucketAssociation]
    
    /**
      * Returns true if the given object is an instance of S3BucketAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/s3bucketAssociation.S3BucketAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/macie/s3bucketAssociation.S3BucketAssociation */ Boolean]
  }
}
