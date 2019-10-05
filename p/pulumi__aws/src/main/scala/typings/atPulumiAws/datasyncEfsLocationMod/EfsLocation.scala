package typings.atPulumiAws.datasyncEfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.typesOutputMod.datasync.EfsLocationEc2Config
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/efsLocation", "EfsLocation")
@js.native
class EfsLocation protected () extends CustomResource {
  /**
    * Create a EfsLocation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EfsLocationArgs) = this()
  def this(name: String, args: EfsLocationArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: Output[String] = js.native
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: Output[EfsLocationEc2Config] = js.native
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: Output[ARN] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: Output[js.UndefOr[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: Output[js.UndefOr[StringDictionary[String]]] = js.native
  val uri: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): EfsLocation = js.native
  def get(name: String, id: Input[ID], state: EfsLocationState): EfsLocation = js.native
  def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): EfsLocation = js.native
  /**
    * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = js.native
}

