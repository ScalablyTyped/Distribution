package typings.pulumiAws.databaseMod

import typings.pulumiAws.outputMod.athena.DatabaseEncryptionConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/athena/database", "Database")
@js.native
class Database protected () extends CustomResource {
  /**
    * Create a Database resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DatabaseArgs) = this()
  def this(name: String, args: DatabaseArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Name of s3 bucket to save the results of the query execution.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
    */
  val encryptionConfiguration: Output_[js.UndefOr[DatabaseEncryptionConfiguration]] = js.native
  
  /**
    * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
    */
  val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Name of the database to create.
    */
  val name: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/athena/database", "Database")
@js.native
object Database extends js.Object {
  
  /**
    * Get an existing Database resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Database = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Database = js.native
  def get(name: String, id: Input[ID], state: DatabaseState): Database = js.native
  def get(name: String, id: Input[ID], state: DatabaseState, opts: CustomResourceOptions): Database = js.native
  
  /**
    * Returns true if the given object is an instance of Database.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/database.Database */ Boolean = js.native
}
