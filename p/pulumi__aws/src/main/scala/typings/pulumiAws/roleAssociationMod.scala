package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RoleAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RoleAssociation]
    inline def get(name: String, id: Input[ID], state: RoleAssociationState): RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RoleAssociation]
    inline def get(name: String, id: Input[ID], state: RoleAssociationState, opts: CustomResourceOptions): RoleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RoleAssociation]
    
    /**
      * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean]
  }
  
  trait RoleAssociationArgs extends StObject {
    
    /**
      * DB Instance Identifier to associate with the IAM Role.
      */
    val dbInstanceIdentifier: Input[String]
    
    /**
      * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
      */
    val featureName: Input[String]
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
      */
    val roleArn: Input[String]
  }
  object RoleAssociationArgs {
    
    inline def apply(dbInstanceIdentifier: Input[String], featureName: Input[String], roleArn: Input[String]): RoleAssociationArgs = {
      val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleAssociationArgs]
    }
    
    extension [Self <: RoleAssociationArgs](x: Self) {
      
      inline def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setFeatureName(value: Input[String]): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoleAssociationState extends StObject {
    
    /**
      * DB Instance Identifier to associate with the IAM Role.
      */
    val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
      */
    val featureName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object RoleAssociationState {
    
    inline def apply(): RoleAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleAssociationState]
    }
    
    extension [Self <: RoleAssociationState](x: Self) {
      
      inline def setDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "dbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "dbInstanceIdentifier", js.undefined)
      
      inline def setFeatureName(value: Input[String]): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
      
      inline def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
