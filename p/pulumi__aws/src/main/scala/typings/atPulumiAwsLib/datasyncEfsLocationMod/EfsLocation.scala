package typings
package atPulumiAwsLib.datasyncEfsLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation")
@js.native
class EfsLocation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a EfsLocation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EfsLocationArgs) = this()
  def this(name: java.lang.String, args: EfsLocationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_SecurityGroupArns] = js.native
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  val uri: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation")
@js.native
object EfsLocation extends js.Object {
  /**
    * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncEfsLocationMod.EfsLocation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncEfsLocationMod.EfsLocationState
  ): atPulumiAwsLib.datasyncEfsLocationMod.EfsLocation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncEfsLocationMod.EfsLocationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.datasyncEfsLocationMod.EfsLocation = js.native
  /**
    * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ scala.Boolean = js.native
}

