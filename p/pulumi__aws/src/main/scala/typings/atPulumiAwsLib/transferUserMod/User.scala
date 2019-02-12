package typings
package atPulumiAwsLib.transferUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/transfer/user", "User")
@js.native
class User protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a User resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: UserArgs) = this()
  def this(name: java.lang.String, args: UserArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of Transfer User
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
    */
  val homeDirectory: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. Since the IAM variable syntax matches Terraform's interpolation syntax, they must be escaped inside Terraform configuration strings (`$${Transfer:UserName}`).  These are evaluated on-the-fly when navigating the bucket.
    */
  val policy: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
    */
  val role: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The Server ID of the Transfer Server (e.g. `s-12345678`)
    */
  val serverId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The name used for log in to your SFTP server.
    */
  val userName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/transfer/user", "User")
@js.native
object User extends js.Object {
  /**
    * Get an existing User resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.transferUserMod.User = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.transferUserMod.UserState
  ): atPulumiAwsLib.transferUserMod.User = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.transferUserMod.UserState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.transferUserMod.User = js.native
}

