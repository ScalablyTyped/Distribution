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

object roleAssociationMod {
  
  @JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation")
  @js.native
  class RoleAssociation protected () extends CustomResource {
    /**
      * Create a RoleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleAssociationArgs) = this()
    def this(name: String, args: RoleAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * DB Instance Identifier to associate with the IAM Role.
      */
    val dbInstanceIdentifier: Output_[String] = js.native
    
    /**
      * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
      */
    val featureName: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
      */
    val roleArn: Output_[String] = js.native
  }
  /* static members */
  object RoleAssociation {
    
    /**
      * Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): RoleAssociation = js.native
    @JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RoleAssociation = js.native
    @JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleAssociationState): RoleAssociation = js.native
    @JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RoleAssociationState, opts: CustomResourceOptions): RoleAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean = js.native
  }
  
  @js.native
  trait RoleAssociationArgs extends StObject {
    
    /**
      * DB Instance Identifier to associate with the IAM Role.
      */
    val dbInstanceIdentifier: Input[String] = js.native
    
    /**
      * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
      */
    val featureName: Input[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
      */
    val roleArn: Input[String] = js.native
  }
  object RoleAssociationArgs {
    
    @scala.inline
    def apply(dbInstanceIdentifier: Input[String], featureName: Input[String], roleArn: Input[String]): RoleAssociationArgs = {
      val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleAssociationArgs]
    }
    
    @scala.inline
    implicit class RoleAssociationArgsMutableBuilder[Self <: RoleAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureName(value: Input[String]): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoleAssociationState extends StObject {
    
    /**
      * DB Instance Identifier to associate with the IAM Role.
      */
    val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
      */
    val featureName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
  }
  object RoleAssociationState {
    
    @scala.inline
    def apply(): RoleAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleAssociationState]
    }
    
    @scala.inline
    implicit class RoleAssociationStateMutableBuilder[Self <: RoleAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "dbInstanceIdentifier", js.undefined)
      
      @scala.inline
      def setFeatureName(value: Input[String]): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
