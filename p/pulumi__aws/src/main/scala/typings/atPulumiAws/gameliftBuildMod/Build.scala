package typings.atPulumiAws.gameliftBuildMod

import typings.atPulumiAws.typesOutputMod.gameliftNs.BuildStorageLocation
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/gamelift/build", "Build")
@js.native
class Build protected () extends CustomResource {
  /**
    * Create a Build resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BuildArgs) = this()
  def this(name: String, args: BuildArgs, opts: CustomResourceOptions) = this()
  /**
    * Name of the build
    */
  val name: Output[String] = js.native
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: Output[String] = js.native
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: Output[BuildStorageLocation] = js.native
  /**
    * Version that is associated with this build.
    */
  val version: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/gamelift/build", "Build")
@js.native
object Build extends js.Object {
  /**
    * Get an existing Build resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Build = js.native
  def get(name: String, id: Input[ID], state: BuildState): Build = js.native
  def get(name: String, id: Input[ID], state: BuildState, opts: CustomResourceOptions): Build = js.native
  /**
    * Returns true if the given object is an instance of Build.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/build.Build */ Boolean = js.native
}

