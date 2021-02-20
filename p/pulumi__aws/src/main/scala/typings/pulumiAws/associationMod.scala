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
    
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/licensemanager/association", "Association.get")
    @js.native
    def get(name: String, id: Input[ID]): Association = js.native
    @JSImport("@pulumi/aws/licensemanager/association", "Association.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Association = js.native
    @JSImport("@pulumi/aws/licensemanager/association", "Association.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssociationState): Association = js.native
    @JSImport("@pulumi/aws/licensemanager/association", "Association.get")
    @js.native
    def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): Association = js.native
    
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/licensemanager/association", "Association.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/licensemanager/association.Association */ Boolean = js.native
  }
  
  @js.native
  trait AssociationArgs extends StObject {
    
    /**
      * ARN of the license configuration.
      */
    val licenseConfigurationArn: Input[String] = js.native
    
    /**
      * ARN of the resource associated with the license configuration.
      */
    val resourceArn: Input[String] = js.native
  }
  object AssociationArgs {
    
    @scala.inline
    def apply(licenseConfigurationArn: Input[String], resourceArn: Input[String]): AssociationArgs = {
      val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssociationArgs]
    }
    
    @scala.inline
    implicit class AssociationArgsMutableBuilder[Self <: AssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicenseConfigurationArn(value: Input[String]): Self = StObject.set(x, "licenseConfigurationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AssociationState extends StObject {
    
    /**
      * ARN of the license configuration.
      */
    val licenseConfigurationArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * ARN of the resource associated with the license configuration.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
  }
  object AssociationState {
    
    @scala.inline
    def apply(): AssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociationState]
    }
    
    @scala.inline
    implicit class AssociationStateMutableBuilder[Self <: AssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLicenseConfigurationArn(value: Input[String]): Self = StObject.set(x, "licenseConfigurationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "licenseConfigurationArn", js.undefined)
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    }
  }
}
