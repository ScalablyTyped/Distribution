package typings.atPulumiAws.athenaDatabaseMod

import typings.atPulumiAws.typesOutputMod.athena.DatabaseEncryptionConfiguration
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val bucket: Output[String] = js.native
  /**
    * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryptionConfiguration` block is documented below.
    */
  val encryptionConfiguration: Output[js.UndefOr[DatabaseEncryptionConfiguration]] = js.native
  /**
    * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
    */
  val forceDestroy: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Name of the database to create.
    */
  val name: Output[String] = js.native
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
    */
  def get(name: String, id: Input[ID]): Database = js.native
  def get(name: String, id: Input[ID], state: DatabaseState): Database = js.native
  def get(name: String, id: Input[ID], state: DatabaseState, opts: CustomResourceOptions): Database = js.native
  /**
    * Returns true if the given object is an instance of Database.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/database.Database */ Boolean = js.native
}

