package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "licensemanager")
@js.native
object licensemanagerNs extends js.Object {
  @js.native
  class Association protected ()
    extends atPulumiAwsLib.licensemanagerMod.Association {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.licensemanagerAssociationMod.AssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.licensemanagerAssociationMod.AssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class LicenseConfiguration protected ()
    extends atPulumiAwsLib.licensemanagerMod.LicenseConfiguration {
    /**
      * Create a LicenseConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.licensemanagerAssociationMod.Association = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.licensemanagerAssociationMod.AssociationState
    ): atPulumiAwsLib.licensemanagerAssociationMod.Association = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.licensemanagerAssociationMod.AssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.licensemanagerAssociationMod.Association = js.native
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
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationState
    ): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfigurationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.licensemanagerLicenseConfigurationMod.LicenseConfiguration = js.native
  }
  
}

