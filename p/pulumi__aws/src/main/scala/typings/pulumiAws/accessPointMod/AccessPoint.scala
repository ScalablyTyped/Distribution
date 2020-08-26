package typings.pulumiAws.accessPointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.efs.AccessPointPosixUser
import typings.pulumiAws.outputMod.efs.AccessPointRootDirectory
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs/accessPoint", "AccessPoint")
@js.native
class AccessPoint protected () extends CustomResource {
  /**
    * Create a AccessPoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AccessPointArgs) = this()
  def this(name: String, args: AccessPointArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name of the access point.
    */
  val arn: Output_[String] = js.native
  /**
    * Amazon Resource Name of the file system.
    */
  val fileSystemArn: Output_[String] = js.native
  /**
    * The ID of the file system for which the access point is intended.
    */
  val fileSystemId: Output_[String] = js.native
  val ownerId: Output_[String] = js.native
  /**
    * The operating system user and group applied to all file system requests made using the access point. See Posix User below.
    */
  val posixUser: Output_[js.UndefOr[AccessPointPosixUser]] = js.native
  /**
    * Specifies the directory on the Amazon EFS file system that the access point provides access to. See Root Directory below.
    */
  val rootDirectory: Output_[AccessPointRootDirectory] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/efs/accessPoint", "AccessPoint")
@js.native
object AccessPoint extends js.Object {
  /**
    * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AccessPoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AccessPoint = js.native
  def get(name: String, id: Input[ID], state: AccessPointState): AccessPoint = js.native
  def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): AccessPoint = js.native
  /**
    * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/accessPoint.AccessPoint */ Boolean = js.native
}

