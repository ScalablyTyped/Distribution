package typings.pulumiAws.dataCatalogEncryptionSettingsMod

import typings.pulumiAws.outputMod.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/dataCatalogEncryptionSettings", "DataCatalogEncryptionSettings")
@js.native
class DataCatalogEncryptionSettings protected () extends CustomResource {
  /**
    * Create a DataCatalogEncryptionSettings resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DataCatalogEncryptionSettingsArgs) = this()
  def this(name: String, args: DataCatalogEncryptionSettingsArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
    */
  val catalogId: Output_[String] = js.native
  
  /**
    * The security configuration to set. see Data Catalog Encryption Settings.
    */
  val dataCatalogEncryptionSettings: Output_[DataCatalogEncryptionSettingsDataCatalogEncryptionSettings] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/dataCatalogEncryptionSettings", "DataCatalogEncryptionSettings")
@js.native
object DataCatalogEncryptionSettings extends js.Object {
  
  /**
    * Get an existing DataCatalogEncryptionSettings resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DataCatalogEncryptionSettings = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DataCatalogEncryptionSettings = js.native
  def get(name: String, id: Input[ID], state: DataCatalogEncryptionSettingsState): DataCatalogEncryptionSettings = js.native
  def get(
    name: String,
    id: Input[ID],
    state: DataCatalogEncryptionSettingsState,
    opts: CustomResourceOptions
  ): DataCatalogEncryptionSettings = js.native
  
  /**
    * Returns true if the given object is an instance of DataCatalogEncryptionSettings.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/dataCatalogEncryptionSettings.DataCatalogEncryptionSettings */ Boolean = js.native
}
