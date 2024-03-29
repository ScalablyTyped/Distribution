package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object associationMod {
  
  @JSImport("@pulumi/aws/licensemanager/association", "Association")
  @js.native
  class Association protected () extends CustomResource {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AssociationArgs) = this()
    def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * ARN of the license configuration.
      */
    val licenseConfigurationArn: Output_[String] = js.native
    
    /**
      * ARN of the resource associated with the license configuration.
      */
    val resourceArn: Output_[String] = js.native
  }
  /* static members */
  object Association {
    
    @JSImport("@pulumi/aws/licensemanager/association", "Association")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Association]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Association]
    inline def get(name: String, id: Input[ID], state: AssociationState): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Association]
    inline def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Association]
    
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/licensemanager/association.Association */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/licensemanager/association.Association */ Boolean]
  }
  
  trait AssociationArgs extends StObject {
    
    /**
      * ARN of the license configuration.
      */
    val licenseConfigurationArn: Input[String]
    
    /**
      * ARN of the resource associated with the license configuration.
      */
    val resourceArn: Input[String]
  }
  object AssociationArgs {
    
    inline def apply(licenseConfigurationArn: Input[String], resourceArn: Input[String]): AssociationArgs = {
      val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssociationArgs]
    }
    
    extension [Self <: AssociationArgs](x: Self) {
      
      inline def setLicenseConfigurationArn(value: Input[String]): Self = StObject.set(x, "licenseConfigurationArn", value.asInstanceOf[js.Any])
      
      inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssociationState extends StObject {
    
    /**
      * ARN of the license configuration.
      */
    val licenseConfigurationArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN of the resource associated with the license configuration.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.undefined
  }
  object AssociationState {
    
    inline def apply(): AssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociationState]
    }
    
    extension [Self <: AssociationState](x: Self) {
      
      inline def setLicenseConfigurationArn(value: Input[String]): Self = StObject.set(x, "licenseConfigurationArn", value.asInstanceOf[js.Any])
      
      inline def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "licenseConfigurationArn", js.undefined)
      
      inline def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    }
  }
}
