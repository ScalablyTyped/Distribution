package typings.pulumiAws.mod

import typings.pulumiAws.associationMod.AssociationArgs
import typings.pulumiAws.associationMod.AssociationState
import typings.pulumiAws.licenseConfigurationMod.LicenseConfigurationArgs
import typings.pulumiAws.licenseConfigurationMod.LicenseConfigurationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "licensemanager")
@js.native
object licensemanager extends js.Object {
  @js.native
  class Association protected ()
    extends typings.pulumiAws.licensemanagerMod.Association {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AssociationArgs) = this()
    def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LicenseConfiguration protected ()
    extends typings.pulumiAws.licensemanagerMod.LicenseConfiguration {
    /**
      * Create a LicenseConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LicenseConfigurationArgs) = this()
    def this(name: String, args: LicenseConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Association extends js.Object {
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.associationMod.Association = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.associationMod.Association = js.native
    def get(name: String, id: Input[ID], state: AssociationState): typings.pulumiAws.associationMod.Association = js.native
    def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): typings.pulumiAws.associationMod.Association = js.native
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/licensemanager/association.Association */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LicenseConfiguration extends js.Object {
    /**
      * Get an existing LicenseConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.licenseConfigurationMod.LicenseConfiguration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.licenseConfigurationMod.LicenseConfiguration = js.native
    def get(name: String, id: Input[ID], state: LicenseConfigurationState): typings.pulumiAws.licenseConfigurationMod.LicenseConfiguration = js.native
    def get(name: String, id: Input[ID], state: LicenseConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.licenseConfigurationMod.LicenseConfiguration = js.native
    /**
      * Returns true if the given object is an instance of LicenseConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/licensemanager/licenseConfiguration.LicenseConfiguration */ Boolean = js.native
  }
  
}

